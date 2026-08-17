package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.C1174o9;
import p000.ds0;
import p000.f40;
import p000.is0;
import p000.jg1;
import p000.js0;
import p000.kg1;
import p000.n60;
import p000.nn0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements nn0 {
    @Override // p000.nn0
    /* JADX INFO: renamed from: a */
    public final Object mo328a(Context context) {
        context.getClass();
        C1174o9 c1174o9M4732C = C1174o9.m4732C(context);
        c1174o9M4732C.getClass();
        if (!((HashSet) c1174o9M4732C.f7700c).contains(ProcessLifecycleInitializer.class)) {
            f40.m2719o("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!js0.f5516a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new is0());
        }
        kg1 kg1Var = kg1.f5797n;
        kg1Var.getClass();
        kg1Var.f5802e = new Handler();
        kg1Var.f5803f.m5053e(ds0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new jg1(kg1Var));
        return kg1Var;
    }

    @Override // p000.nn0
    public final List dependencies() {
        return n60.f7259a;
    }
}
