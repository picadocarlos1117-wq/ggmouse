package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 {
    private Context mContext;
    private int mId;
    private wu0 mListener;
    private vu0 mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public yu0(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void deliverResult(Object obj) {
        boolean z;
        wu0 wu0Var = this.mListener;
        if (wu0Var != null) {
            bv0 bv0Var = (bv0) wu0Var;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bv0Var.mo939h(obj);
                return;
            }
            synchronized (bv0Var.f4705a) {
                z = bv0Var.f4710f == hu0.f4704k;
                bv0Var.f4710f = obj;
            }
            if (z) {
                C1509v9 c1509v9M6610U = C1509v9.m6610U();
                RunnableC1621ya runnableC1621ya = bv0Var.f4714j;
                o00 o00Var = c1509v9M6610U.f11588s;
                if (o00Var.f7601u == null) {
                    synchronized (o00Var.f7599s) {
                        try {
                            if (o00Var.f7601u == null) {
                                o00Var.f7601u = Handler.createAsync(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                o00Var.f7601u.post(runnableC1621ya);
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public abstract void onStartLoading();

    public void registerListener(int i, wu0 wu0Var) {
        if (this.mListener != null) {
            f40.m2719o("There is already a listener registered");
        } else {
            this.mListener = wu0Var;
            this.mId = i;
        }
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        return AbstractC1308pu.m5341h(sb, this.mId, "}");
    }

    public void unregisterListener(wu0 wu0Var) {
        wu0 wu0Var2 = this.mListener;
        if (wu0Var2 == null) {
            f40.m2719o("No listener register");
        } else if (wu0Var2 == wu0Var) {
            this.mListener = null;
        } else {
            f40.m2713i("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(vu0 vu0Var) {
        throw new IllegalStateException("No listener register");
    }

    public void deliverCancellation() {
    }

    public void onAbandon() {
    }

    public void onReset() {
    }

    public void onStopLoading() {
    }

    public void registerOnLoadCanceledListener(vu0 vu0Var) {
    }
}
