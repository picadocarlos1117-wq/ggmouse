package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l52 extends k52 {

    /* JADX INFO: renamed from: a */
    public ic1[] f6189a;

    /* JADX INFO: renamed from: b */
    public String f6190b;

    /* JADX INFO: renamed from: c */
    public int f6191c;

    public l52(l52 l52Var) {
        this.f6189a = null;
        this.f6191c = 0;
        this.f6190b = l52Var.f6190b;
        this.f6189a = ua0.m6458n(l52Var.f6189a);
    }

    public ic1[] getPathData() {
        return this.f6189a;
    }

    public String getPathName() {
        return this.f6190b;
    }

    public void setPathData(ic1[] ic1VarArr) {
        ic1[] ic1VarArr2 = this.f6189a;
        if (ic1VarArr2 != null && ic1VarArr != null && ic1VarArr2.length == ic1VarArr.length) {
            for (int i = 0; i < ic1VarArr2.length; i++) {
                ic1 ic1Var = ic1VarArr2[i];
                char c = ic1Var.f4935a;
                ic1 ic1Var2 = ic1VarArr[i];
                if (c == ic1Var2.f4935a && ic1Var.f4936b.length == ic1Var2.f4936b.length) {
                }
            }
            ic1[] ic1VarArr3 = this.f6189a;
            for (int i2 = 0; i2 < ic1VarArr.length; i2++) {
                ic1VarArr3[i2].f4935a = ic1VarArr[i2].f4935a;
                int i3 = 0;
                while (true) {
                    float[] fArr = ic1VarArr[i2].f4936b;
                    if (i3 < fArr.length) {
                        ic1VarArr3[i2].f4936b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        this.f6189a = ua0.m6458n(ic1VarArr);
    }

    public l52() {
        this.f6189a = null;
        this.f6191c = 0;
    }
}
