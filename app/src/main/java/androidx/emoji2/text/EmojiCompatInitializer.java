package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.C0582dx;
import p000.C1174o9;
import p000.fs0;
import p000.ms0;
import p000.nn0;
import p000.od0;
import p000.t50;
import p000.u50;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements nn0 {
    @Override // p000.nn0
    /* JADX INFO: renamed from: a */
    public final Object mo328a(Context context) {
        Object objM4771t;
        C0582dx c0582dx = new C0582dx();
        c0582dx.f3037a = context.getApplicationContext();
        od0 od0Var = new od0(c0582dx);
        od0Var.f9390a = 1;
        if (t50.f10753j == null) {
            synchronized (t50.f10752i) {
                try {
                    if (t50.f10753j == null) {
                        t50.f10753j = new t50(od0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C1174o9 c1174o9M4732C = C1174o9.m4732C(context);
        c1174o9M4732C.getClass();
        synchronized (C1174o9.f7694f) {
            try {
                objM4771t = ((HashMap) c1174o9M4732C.f7699b).get(ProcessLifecycleInitializer.class);
                if (objM4771t == null) {
                    objM4771t = c1174o9M4732C.m4771t(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fs0 lifecycle = ((ms0) objM4771t).getLifecycle();
        lifecycle.mo2848a(new u50(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p000.nn0
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
