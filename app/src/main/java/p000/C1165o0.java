package p000;

import com.example.ssmousepro.PreferencesActivity;
import com.example.ssmousepro.injection.InjectionDaemon;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.channels.BroadcastKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1165o0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7598b;

    public /* synthetic */ C1165o0(Object obj, int i) {
        this.f7597a = i;
        this.f7598b = obj;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f7597a;
        Object obj2 = this.f7598b;
        switch (i) {
            case 0:
                return obj == ((AbstractC1463u0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                return BroadcastKt.broadcast$lambda$1((ReceiveChannel) obj2, (Throwable) obj);
            case 2:
                return ExceptionsConstructorKt.safeCtor$lambda$9((og0) obj2, (Throwable) obj);
            case 3:
                return FutureKt.asCompletableFuture$lambda$2((CompletableFuture) obj2, (Throwable) obj);
            case 4:
                return InjectionDaemon._init_$lambda$0((InjectionDaemon) obj2, ((Boolean) obj).booleanValue());
            case 5:
                return PreferencesActivity.onResume$lambda$16((PreferencesActivity) obj2, ((Boolean) obj).booleanValue());
            default:
                return TasksKt.asDeferredImpl$lambda$2((CancellationTokenSource) obj2, (Throwable) obj);
        }
    }
}
