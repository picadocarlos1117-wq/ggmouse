package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: db */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0561db extends yu0 {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile RunnableC0129cb mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile RunnableC0129cb mTask;
    private long mUpdateThrottle;

    public AbstractC0561db(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void dispatchOnCancelled(RunnableC0129cb runnableC0129cb, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == runnableC0129cb) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(RunnableC0129cb runnableC0129cb, Object obj) {
        if (this.mTask != runnableC0129cb) {
            dispatchOnCancelled(runnableC0129cb, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // p000.yu0
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f1738e);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f1738e);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(this.mUpdateThrottle / 1000));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime((SystemClock.uptimeMillis() - this.mLastLoadCompleteTime) / 1000);
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f1738e) {
            this.mTask.f1738e = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f1738e = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        RunnableC0129cb runnableC0129cb = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC0129cb.f1735b == 1) {
            runnableC0129cb.f1735b = 2;
            executor.execute(runnableC0129cb.f1734a);
            return;
        }
        int iM5359z = AbstractC1308pu.m5359z(runnableC0129cb.f1735b);
        if (iM5359z == 1) {
            f40.m2719o("Cannot execute task: the task is already running.");
        } else if (iM5359z != 2) {
            f40.m2719o("We should never reach this state");
        } else {
            f40.m2719o("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // p000.yu0
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        RunnableC0129cb runnableC0129cb = this.mCancellingTask;
        RunnableC0129cb runnableC0129cb2 = this.mTask;
        if (runnableC0129cb != null) {
            if (runnableC0129cb2.f1738e) {
                this.mTask.f1738e = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        boolean z = runnableC0129cb2.f1738e;
        RunnableC0129cb runnableC0129cb3 = this.mTask;
        if (z) {
            runnableC0129cb3.f1738e = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        runnableC0129cb3.f1736c.set(true);
        boolean zCancel = runnableC0129cb3.f1734a.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    @Override // p000.yu0
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new RunnableC0129cb(this);
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(Object obj) {
    }
}
