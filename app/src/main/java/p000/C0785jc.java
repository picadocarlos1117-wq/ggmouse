package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: jc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0785jc {

    /* JADX INFO: renamed from: a */
    public final qm0 f5356a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5357b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f5358c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f5359d;

    public C0785jc(qm0 qm0Var) {
        this.f5356a = qm0Var;
        C0823kc c0823kc = C0823kc.f5741e;
        this.f5359d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3592a() {
        ArrayList arrayList = this.f5357b;
        arrayList.clear();
        this.f5359d = false;
        int i = 0;
        while (true) {
            qm0 qm0Var = this.f5356a;
            if (i >= qm0Var.size()) {
                break;
            }
            InterfaceC1103mc interfaceC1103mc = (InterfaceC1103mc) qm0Var.get(i);
            interfaceC1103mc.flush();
            if (interfaceC1103mc.isActive()) {
                arrayList.add(interfaceC1103mc);
            }
            i++;
        }
        this.f5358c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m3593b(); i2++) {
            this.f5358c[i2] = ((InterfaceC1103mc) arrayList.get(i2)).mo2125a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3593b() {
        return this.f5358c.length - 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3594c() {
        return this.f5359d && ((InterfaceC1103mc) this.f5357b.get(m3593b())).mo2129e() && !this.f5358c[m3593b()].hasRemaining();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3595d() {
        return !this.f5357b.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final void m3596e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= m3593b(); i++) {
                if (!this.f5358c[i].hasRemaining()) {
                    ArrayList arrayList = this.f5357b;
                    InterfaceC1103mc interfaceC1103mc = (InterfaceC1103mc) arrayList.get(i);
                    if (!interfaceC1103mc.mo2129e()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f5358c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1103mc.f6750a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC1103mc.mo2126b(byteBuffer2);
                        this.f5358c[i] = interfaceC1103mc.mo2125a();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f5358c[i].hasRemaining();
                    } else if (!this.f5358c[i].hasRemaining() && i < m3593b()) {
                        ((InterfaceC1103mc) arrayList.get(i + 1)).mo2128d();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0785jc)) {
            return false;
        }
        qm0 qm0Var = ((C0785jc) obj).f5356a;
        qm0 qm0Var2 = this.f5356a;
        if (qm0Var2.size() != qm0Var.size()) {
            return false;
        }
        for (int i = 0; i < qm0Var2.size(); i++) {
            if (qm0Var2.get(i) != qm0Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5356a.hashCode();
    }
}
