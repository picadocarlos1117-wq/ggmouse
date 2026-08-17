package p000;

import android.widget.EditText;
import com.example.ssmousepro.FloatingService;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12061c;

    public /* synthetic */ wc0(int i, Object obj, Object obj2) {
        this.f12059a = i;
        this.f12060b = obj;
        this.f12061c = obj2;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f12059a;
        Object obj2 = this.f12061c;
        Object obj3 = this.f12060b;
        switch (i) {
            case 0:
                return FloatingService.capturarTeclaAnalog$lambda$269((EditText) obj3, (og0) obj2, (String) obj);
            case 1:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) obj3, (Deferred) obj2, (Throwable) obj);
            default:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) obj3, (HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1) obj2, (Throwable) obj);
        }
    }
}
