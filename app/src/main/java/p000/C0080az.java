package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: renamed from: az */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0080az implements bd2 {

    /* JADX INFO: renamed from: b */
    public static C0080az f1097b;

    /* JADX INFO: renamed from: a */
    public final Object f1098a;

    public C0080az(int i) {
        switch (i) {
            case 1:
                this.f1098a = new Object();
                new Handler(Looper.getMainLooper(), new st1(this));
                break;
            default:
                this.f1098a = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1682zy m792b(hp0 hp0Var) {
        new C0558d8((byte) 0, 29);
        hp0Var.getClass();
        new HashMap();
        throw null;
    }

    @Override // p000.cd2
    /* JADX INFO: renamed from: a */
    public Object mo144a() {
        return this.f1098a;
    }

    public C0080az(Object obj) {
        this.f1098a = obj;
    }
}
