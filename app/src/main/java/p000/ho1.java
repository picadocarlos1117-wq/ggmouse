package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.firebase.firestore.local.SQLiteDocumentOverlayCache;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f4627d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4628e;

    public /* synthetic */ ho1(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f4624a = i2;
        this.f4626c = obj;
        this.f4627d = obj2;
        this.f4625b = i;
        this.f4628e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4624a;
        Object obj = this.f4628e;
        int i2 = this.f4625b;
        Object obj2 = this.f4627d;
        Object obj3 = this.f4626c;
        switch (i) {
            case 0:
                ((SQLiteDocumentOverlayCache) obj3).lambda$processOverlaysInBackground$5((byte[]) obj2, i2, (Map) obj);
                return;
            default:
                p42 p42Var = (p42) obj3;
                C0674ge c0674ge = (C0674ge) obj2;
                Runnable runnable = (Runnable) obj;
                no1 no1Var = p42Var.f8721f;
                try {
                    try {
                        no1 no1Var2 = p42Var.f8718c;
                        Objects.requireNonNull(no1Var2);
                        no1Var.m4581l(new m42(no1Var2, 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) p42Var.f8716a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            no1Var.m4581l(new b80(p42Var, c0674ge, i2));
                        } else {
                            p42Var.m5202a(c0674ge, i2);
                        }
                        break;
                    } catch (sy1 unused) {
                        p42Var.f8719d.m4755X(c0674ge, i2 + 1, false);
                        break;
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }
}
