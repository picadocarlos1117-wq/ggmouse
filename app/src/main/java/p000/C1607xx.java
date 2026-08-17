package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: xx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607xx {

    /* JADX INFO: renamed from: a */
    public final String f12758a;

    /* JADX INFO: renamed from: b */
    public final be0 f12759b;

    /* JADX INFO: renamed from: c */
    public final be0 f12760c;

    /* JADX INFO: renamed from: d */
    public final int f12761d;

    /* JADX INFO: renamed from: e */
    public final int f12762e;

    public C1607xx(String str, be0 be0Var, be0 be0Var2, int i, int i2) {
        ki0.m3857c(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            l41.m4049r();
            throw null;
        }
        this.f12758a = str;
        be0Var.getClass();
        this.f12759b = be0Var;
        be0Var2.getClass();
        this.f12760c = be0Var2;
        this.f12761d = i;
        this.f12762e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1607xx.class == obj.getClass()) {
            C1607xx c1607xx = (C1607xx) obj;
            if (this.f12761d == c1607xx.f12761d && this.f12762e == c1607xx.f12762e && this.f12758a.equals(c1607xx.f12758a) && this.f12759b.equals(c1607xx.f12759b) && this.f12760c.equals(c1607xx.f12760c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12760c.hashCode() + ((this.f12759b.hashCode() + AbstractC1308pu.m5336c((((527 + this.f12761d) * 31) + this.f12762e) * 31, 31, this.f12758a)) * 31);
    }
}
