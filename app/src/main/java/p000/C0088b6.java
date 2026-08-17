package p000;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: b6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0088b6 extends ce0 {

    /* JADX INFO: renamed from: a */
    public final xw0 f1219a;

    /* JADX INFO: renamed from: b */
    public Context f1220b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                ((sx0) t91.class.asSubclass(sx0.class).getConstructor(null).newInstance(null)).getClass();
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
    }

    public C0088b6(xw0 xw0Var) {
        this.f1219a = xw0Var;
    }

    @Override // p000.ce0, p000.xw0
    /* JADX INFO: renamed from: a */
    public final ww0 mo932a() {
        return new C0007a6(this.f1219a.mo932a(), this.f1220b);
    }

    @Override // p000.xw0
    /* JADX INFO: renamed from: b */
    public final void mo933b() {
        this.f1219a.mo933b();
    }

    @Override // p000.ce0
    /* JADX INFO: renamed from: c */
    public final xw0 mo934c() {
        return this.f1219a;
    }
}
