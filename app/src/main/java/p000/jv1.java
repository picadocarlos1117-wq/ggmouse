package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements InterfaceC0807jx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0807jx f5573a;

    /* JADX INFO: renamed from: b */
    public long f5574b;

    /* JADX INFO: renamed from: c */
    public Uri f5575c;

    public jv1(InterfaceC0807jx interfaceC0807jx) {
        interfaceC0807jx.getClass();
        this.f5573a = interfaceC0807jx;
        this.f5575c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) {
        InterfaceC0807jx interfaceC0807jx = this.f5573a;
        this.f5575c = c1087lx.f6535a;
        Map map = Collections.EMPTY_MAP;
        try {
            return interfaceC0807jx.mo3053c(c1087lx);
        } finally {
            Uri uriMo3054o = interfaceC0807jx.mo3054o();
            if (uriMo3054o != null) {
                this.f5575c = uriMo3054o;
            }
            interfaceC0807jx.mo3714j();
        }
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        this.f5573a.close();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: j */
    public final Map mo3714j() {
        return this.f5573a.mo3714j();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f5573a.mo3054o();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: p */
    public final void mo991p(C1534vy c1534vy) {
        c1534vy.getClass();
        this.f5573a.mo991p(c1534vy);
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f5573a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f5574b += (long) i3;
        }
        return i3;
    }
}
