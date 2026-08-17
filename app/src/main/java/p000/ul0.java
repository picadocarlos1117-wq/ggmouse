package p000;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements InterfaceC0807jx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0807jx f11351a;

    /* JADX INFO: renamed from: b */
    public final int f11352b;

    /* JADX INFO: renamed from: c */
    public final tg1 f11353c;

    /* JADX INFO: renamed from: d */
    public final byte[] f11354d;

    /* JADX INFO: renamed from: e */
    public int f11355e;

    public ul0(InterfaceC0807jx interfaceC0807jx, int i, tg1 tg1Var) {
        ki0.m3857c(i > 0);
        this.f11351a = interfaceC0807jx;
        this.f11352b = i;
        this.f11353c = tg1Var;
        this.f11354d = new byte[1];
        this.f11355e = i;
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: j */
    public final Map mo3714j() {
        return this.f11351a.mo3714j();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f11351a.mo3054o();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: p */
    public final void mo991p(C1534vy c1534vy) {
        c1534vy.getClass();
        this.f11351a.mo991p(c1534vy);
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f11355e;
        InterfaceC0807jx interfaceC0807jx = this.f11351a;
        if (i3 == 0) {
            byte[] bArr2 = this.f11354d;
            if (interfaceC0807jx.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int i7 = interfaceC0807jx.read(bArr3, i6, i5);
                        if (i7 != -1) {
                            i6 += i7;
                            i5 -= i7;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        dc1 dc1Var = new dc1(bArr3, i4);
                        tg1 tg1Var = this.f11353c;
                        long jMax = !tg1Var.f10879l ? tg1Var.f10876i : Math.max(tg1Var.f10880m.m6783s(true), tg1Var.f10876i);
                        int iM2318a = dc1Var.m2318a();
                        c22 c22Var = tg1Var.f10878k;
                        c22Var.getClass();
                        c22Var.mo1115b(dc1Var, iM2318a, 0);
                        c22Var.mo1114a(jMax, 1, iM2318a, 0, null);
                        tg1Var.f10879l = true;
                    }
                }
                this.f11355e = this.f11352b;
            }
            return -1;
        }
        int i8 = interfaceC0807jx.read(bArr, i, Math.min(this.f11355e, i2));
        if (i8 != -1) {
            this.f11355e -= i8;
        }
        return i8;
    }
}
