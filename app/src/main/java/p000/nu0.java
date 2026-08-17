package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nu0 {

    /* JADX INFO: renamed from: c */
    public static final C1400sb f7537c = new C1400sb("internal:health-checking-config");

    /* JADX INFO: renamed from: d */
    public static final bz1 f7538d = new bz1(29);

    /* JADX INFO: renamed from: e */
    public static final C1400sb f7539e = new C1400sb("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: f */
    public static final C1400sb f7540f = new C1400sb("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7541a;

    /* JADX INFO: renamed from: b */
    public int f7542b;

    public /* synthetic */ nu0(int i, int i2) {
        this.f7541a = i2;
        this.f7542b = i;
    }

    /* JADX INFO: renamed from: h */
    public static String m4596h(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* JADX INFO: renamed from: a */
    public nv1 mo1258a(ku0 ku0Var) {
        List list = ku0Var.f6022a;
        if (!list.isEmpty() || mo4598f()) {
            int i = this.f7542b;
            this.f7542b = i + 1;
            if (i == 0) {
                mo2958o(ku0Var);
            }
            this.f7542b = 0;
            return nv1.f7550e;
        }
        nv1 nv1VarM4614g = nv1.f7559n.m4614g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + ku0Var.f6023b);
        mo1259n(nv1VarM4614g);
        return nv1VarM4614g;
    }

    /* JADX INFO: renamed from: b */
    public void m4597b(int i) {
        this.f7542b = i | this.f7542b;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo4598f() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4599i(int i) {
        return (this.f7542b & i) == i;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo4600j();

    /* JADX INFO: renamed from: k */
    public abstract int mo4601k();

    /* JADX INFO: renamed from: l */
    public abstract int mo4602l();

    /* JADX INFO: renamed from: m */
    public abstract int mo4603m();

    /* JADX INFO: renamed from: n */
    public abstract void mo1259n(nv1 nv1Var);

    /* JADX INFO: renamed from: o */
    public void mo2958o(ku0 ku0Var) {
        int i = this.f7542b;
        this.f7542b = i + 1;
        if (i == 0) {
            mo1258a(ku0Var);
        }
        this.f7542b = 0;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo1260q();

    public String toString() {
        switch (this.f7541a) {
            case 3:
                return m4596h(this.f7542b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nu0(int i) {
        this.f7541a = i;
    }

    /* JADX INFO: renamed from: p */
    public void mo4604p() {
    }
}
