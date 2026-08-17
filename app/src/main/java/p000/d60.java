package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 {

    /* JADX INFO: renamed from: a */
    public int f2801a = 1;

    /* JADX INFO: renamed from: b */
    public final s51 f2802b;

    /* JADX INFO: renamed from: c */
    public s51 f2803c;

    /* JADX INFO: renamed from: d */
    public s51 f2804d;

    /* JADX INFO: renamed from: e */
    public int f2805e;

    /* JADX INFO: renamed from: f */
    public int f2806f;

    public d60(s51 s51Var) {
        this.f2802b = s51Var;
        this.f2803c = s51Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m2240a(int i) {
        SparseArray sparseArray = this.f2803c.f10236a;
        s51 s51Var = sparseArray == null ? null : (s51) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.f2801a == 2) {
            if (s51Var != null) {
                this.f2803c = s51Var;
                this.f2806f++;
            } else if (i == 65038) {
                m2241b();
            } else if (i != 65039) {
                s51 s51Var2 = this.f2803c;
                if (s51Var2.f10237b != null) {
                    i3 = 3;
                    if (this.f2806f != 1) {
                        this.f2804d = s51Var2;
                        m2241b();
                    } else if (m2242c()) {
                        this.f2804d = this.f2803c;
                        m2241b();
                    } else {
                        m2241b();
                    }
                } else {
                    m2241b();
                }
            }
            i2 = i3;
        } else if (s51Var == null) {
            m2241b();
        } else {
            this.f2801a = 2;
            this.f2803c = s51Var;
            this.f2806f = 1;
            i2 = i3;
        }
        this.f2805e = i;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2241b() {
        this.f2801a = 1;
        this.f2803c = this.f2802b;
        this.f2806f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2242c() {
        p51 p51VarM1136b = this.f2803c.f10237b.m1136b();
        int iM2406a = p51VarM1136b.m2406a(6);
        return !(iM2406a == 0 || ((ByteBuffer) p51VarM1136b.f3076d).get(iM2406a + p51VarM1136b.f3073a) == 0) || this.f2805e == 65039;
    }
}
