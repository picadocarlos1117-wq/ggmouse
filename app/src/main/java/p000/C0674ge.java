package p000;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: ge */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0674ge {

    /* JADX INFO: renamed from: a */
    public final String f4155a;

    /* JADX INFO: renamed from: b */
    public final byte[] f4156b;

    /* JADX INFO: renamed from: c */
    public final cg1 f4157c;

    public C0674ge(String str, byte[] bArr, cg1 cg1Var) {
        this.f4155a = str;
        this.f4156b = bArr;
        this.f4157c = cg1Var;
    }

    /* JADX INFO: renamed from: a */
    public static C1174o9 m2960a() {
        C1174o9 c1174o9 = new C1174o9(2);
        c1174o9.f7701d = cg1.f1791a;
        return c1174o9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0674ge) {
            C0674ge c0674ge = (C0674ge) obj;
            if (this.f4155a.equals(c0674ge.f4155a) && Arrays.equals(this.f4156b, c0674ge.f4156b) && this.f4157c.equals(c0674ge.f4157c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4157c.hashCode() ^ ((((this.f4155a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4156b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f4156b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f4155a);
        sb.append(", ");
        sb.append(this.f4157c);
        sb.append(", ");
        return AbstractC1308pu.m5342i(sb, strEncodeToString, ")");
    }
}
