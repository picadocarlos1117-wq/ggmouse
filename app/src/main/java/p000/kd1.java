package p000;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 extends od1 {

    /* JADX INFO: renamed from: e */
    public final C1174o9 f5774e;

    /* JADX INFO: renamed from: f */
    public final C1174o9 f5775f;

    /* JADX INFO: renamed from: g */
    public final C1174o9 f5776g;

    /* JADX INFO: renamed from: h */
    public final C1174o9 f5777h;

    /* JADX INFO: renamed from: i */
    public final int f5778i;

    public kd1(C1174o9 c1174o9, C1174o9 c1174o10, C1174o9 c1174o11, C1174o9 c1174o12, Provider provider, int i) {
        super(provider);
        this.f5774e = c1174o9;
        this.f5775f = c1174o10;
        this.f5776g = c1174o11;
        this.f5777h = c1174o12;
        this.f5778i = i;
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: c */
    public final void mo3819c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f5774e.m4747M(sSLSocket, Boolean.TRUE);
            this.f5775f.m4747M(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        C1174o9 c1174o9 = this.f5777h;
        if (c1174o9.m4739D(cls) != null) {
            c1174o9.m4748N(sSLSocket, od1.m4797b(list));
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: d */
    public final String mo3820d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        C1174o9 c1174o9 = this.f5776g;
        if (c1174o9.m4739D(cls) == null || (bArr = (byte[]) c1174o9.m4748N(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, y42.f12843b);
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: e */
    public final int mo3821e() {
        return this.f5778i;
    }
}
