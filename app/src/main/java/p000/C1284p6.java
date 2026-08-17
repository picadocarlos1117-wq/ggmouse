package p000;

import android.os.Bundle;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.activation.WifiAdbDaemonMain;
import com.example.ssmousepro.analytics.AppAnalytics;
import com.example.ssmousepro.injection.IoctlHelper;
import com.example.ssmousepro.injection.PipelineMonitorText;
import java.lang.reflect.Method;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1284p6 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8737a;

    public /* synthetic */ C1284p6(int i) {
        this.f8737a = i;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        switch (this.f8737a) {
            case 0:
                return AppAnalytics.logEvent$lambda$0((Bundle) obj);
            case 1:
                return CoroutineDispatcher.Key._init_$lambda$0((InterfaceC1382ru) obj);
            case 2:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case 3:
                return ExecutorCoroutineDispatcher.Key._init_$lambda$0((InterfaceC1382ru) obj);
            case 4:
                return FloatingService.mostrarConfigInterfaces$lambda$305(((Float) obj).floatValue());
            case 5:
                return FloatingService.mostrarConfigInterfaces$lambda$307(((Integer) obj).intValue());
            case 6:
                return FloatingService.mostrarConfigInterfaces$lambda$310(((Float) obj).floatValue());
            case 7:
                return FloatingService.mostrarConfigInterfaces$lambda$312(((Float) obj).floatValue());
            case 8:
                return ((Class) obj).getSimpleName();
            case 9:
                return IoctlHelper.descobrir$lambda$5((Method) obj);
            case 10:
                return PipelineMonitorText.formatar$lambda$2((PipelineMonitorText.Linha) obj);
            case 11:
                return Boolean.valueOf(obj == null);
            default:
                return WifiAdbDaemonMain.main$lambda$2(((Boolean) obj).booleanValue());
        }
    }
}
