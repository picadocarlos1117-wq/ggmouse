package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pd0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f8859c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hv0 f8860d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8861e;

    public /* synthetic */ pd0(String str, Context context, hv0 hv0Var, int i, int i2) {
        this.f8857a = i2;
        this.f8858b = str;
        this.f8859c = context;
        this.f8860d = hv0Var;
        this.f8861e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f8857a;
        int i2 = this.f8861e;
        hv0 hv0Var = this.f8860d;
        Context context = this.f8859c;
        String str = this.f8858b;
        switch (i) {
            case 0:
                return sd0.m6084a(str, context, hv0Var, i2);
            default:
                try {
                    return sd0.m6084a(str, context, hv0Var, i2);
                } catch (Throwable unused) {
                    return new rd0(-3);
                }
        }
    }
}
