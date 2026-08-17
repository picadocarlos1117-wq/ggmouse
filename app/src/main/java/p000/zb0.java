package p000;

import android.widget.FrameLayout;
import com.example.ssmousepro.FloatingService;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f13334c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f13335d;

    public /* synthetic */ zb0(Object obj, Object obj2, Object obj3, int i) {
        this.f13332a = i;
        this.f13333b = obj;
        this.f13334c = obj2;
        this.f13335d = obj3;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f13332a;
        Object obj2 = this.f13335d;
        Object obj3 = this.f13334c;
        Object obj4 = this.f13333b;
        switch (i) {
            case 0:
                return FloatingService.capturarTeclaSuspenderFps$lambda$242((FloatingService) obj4, (FrameLayout) obj3, (og0) obj2, (String) obj);
            default:
                return TasksKt.asTask$lambda$0((CancellationTokenSource) obj4, (Deferred) obj3, (TaskCompletionSource) obj2, (Throwable) obj);
        }
    }
}
