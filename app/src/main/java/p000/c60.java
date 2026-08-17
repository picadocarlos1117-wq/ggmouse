package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1678d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f1679a;

    /* JADX INFO: renamed from: b */
    public final C0599ed f1680b;

    /* JADX INFO: renamed from: c */
    public volatile int f1681c = 0;

    public c60(C0599ed c0599ed, int i) {
        this.f1680b = c0599ed;
        this.f1679a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m1135a(int i) {
        p51 p51VarM1136b = m1136b();
        int iM2406a = p51VarM1136b.m2406a(16);
        if (iM2406a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) p51VarM1136b.f3076d;
        int i2 = iM2406a + p51VarM1136b.f3073a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final p51 m1136b() {
        ThreadLocal threadLocal = f1678d;
        p51 p51Var = (p51) threadLocal.get();
        if (p51Var == null) {
            p51Var = new p51();
            threadLocal.set(p51Var);
        }
        q51 q51Var = (q51) this.f1680b.f3313a;
        int iM2406a = q51Var.m2406a(6);
        if (iM2406a != 0) {
            int i = iM2406a + q51Var.f3073a;
            int i2 = (this.f1679a * 4) + ((ByteBuffer) q51Var.f3076d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) q51Var.f3076d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) q51Var.f3076d;
            p51Var.f3076d = byteBuffer;
            if (byteBuffer != null) {
                p51Var.f3073a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                p51Var.f3074b = i4;
                p51Var.f3075c = ((ByteBuffer) p51Var.f3076d).getShort(i4);
                return p51Var;
            }
            p51Var.f3073a = 0;
            p51Var.f3074b = 0;
            p51Var.f3075c = 0;
        }
        return p51Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        p51 p51VarM1136b = m1136b();
        int iM2406a = p51VarM1136b.m2406a(4);
        sb.append(Integer.toHexString(iM2406a != 0 ? ((ByteBuffer) p51VarM1136b.f3076d).getInt(iM2406a + p51VarM1136b.f3073a) : 0));
        sb.append(", codepoints:");
        p51 p51VarM1136b2 = m1136b();
        int iM2406a2 = p51VarM1136b2.m2406a(16);
        if (iM2406a2 != 0) {
            int i2 = iM2406a2 + p51VarM1136b2.f3073a;
            i = ((ByteBuffer) p51VarM1136b2.f3076d).getInt(((ByteBuffer) p51VarM1136b2.f3076d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m1135a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
