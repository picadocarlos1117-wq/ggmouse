package p000;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: hx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730hx extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public C1087lx f4736e;

    /* JADX INFO: renamed from: f */
    public byte[] f4737f;

    /* JADX INFO: renamed from: g */
    public int f4738g;

    /* JADX INFO: renamed from: m */
    public int f4739m;

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws fc1, C1050kx {
        m992q();
        this.f4736e = c1087lx;
        Uri uri = c1087lx.f6535a;
        long j = c1087lx.f6540f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ki0.m3859d("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = z42.f13274a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new fc1("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f4737f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new fc1(AbstractC1308pu.m5339f("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f4737f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c1087lx.f6539e;
        byte[] bArr = this.f4737f;
        if (j2 > bArr.length) {
            this.f4737f = null;
            throw new C1050kx(2008);
        }
        int i2 = (int) j2;
        this.f4738g = i2;
        int length = bArr.length - i2;
        this.f4739m = length;
        if (j != -1) {
            this.f4739m = (int) Math.min(length, j);
        }
        m993r(c1087lx);
        return j != -1 ? j : this.f4739m;
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        if (this.f4737f != null) {
            this.f4737f = null;
            m990n();
        }
        this.f4736e = null;
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        C1087lx c1087lx = this.f4736e;
        if (c1087lx != null) {
            return c1087lx.f6535a;
        }
        return null;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f4739m;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f4737f;
        int i4 = z42.f13274a;
        System.arraycopy(bArr2, this.f4738g, bArr, i, iMin);
        this.f4738g += iMin;
        this.f4739m -= iMin;
        m989k(iMin);
        return iMin;
    }
}
