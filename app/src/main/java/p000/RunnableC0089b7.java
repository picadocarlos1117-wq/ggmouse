package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.firebase.functions.FirebaseFunctions;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0089b7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f1232b;

    public /* synthetic */ RunnableC0089b7(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f1231a = 2;
        this.f1232b = context;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    @Override // java.lang.Runnable
    public final void run() {
        ov0 ov0Var;
        Object systemService;
        Context context;
        int i = this.f1231a;
        Context context2 = this.f1232b;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC1408sj.m6104a()) {
                            C0707ha c0707ha = AbstractC0593e7.f3231g;
                            c0707ha.getClass();
                            C0128ca c0128ca = new C0128ca(c0707ha);
                            while (true) {
                                if (c0128ca.hasNext()) {
                                    AbstractC0593e7 abstractC0593e7 = (AbstractC0593e7) ((WeakReference) c0128ca.next()).get();
                                    if (abstractC0593e7 != null && (context = ((LayoutInflaterFactory2C1359r7) abstractC0593e7).f9792p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                ov0Var = new ov0(new pv0(AbstractC0557d7.m2243a(systemService)));
                            } else {
                                ov0Var = ov0.f8495b;
                            }
                        } else {
                            ov0Var = AbstractC0593e7.f3227c;
                            if (ov0Var == null) {
                                ov0Var = ov0.f8495b;
                            }
                        }
                        if (ov0Var.f8496a.f9178a.isEmpty()) {
                            String strM5161b0 = p32.m5161b0(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC0557d7.m2244b(systemService2, AbstractC0125c7.m1148a(strM5161b0));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC0593e7.f3230f = true;
                break;
            case 1:
                FirebaseFunctions.Companion.maybeInstallProviders$lambda$1(context2);
                break;
            case 2:
                ng1.m4548a(Looper.getMainLooper()).postDelayed(new RunnableC0089b7(context2, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0089b7(context2, 4));
                break;
            default:
                sc2.m6054Y(context2, new q01(0), sc2.f10360d, false);
                break;
        }
    }

    public /* synthetic */ RunnableC0089b7(Context context, int i) {
        this.f1231a = i;
        this.f1232b = context;
    }
}
