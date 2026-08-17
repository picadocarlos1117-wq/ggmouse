package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1388s extends AbstractC1536w implements InterfaceC1425t {

    /* JADX INFO: renamed from: b */
    public static final C0549d f10172b = new C0549d(AbstractC1388s.class, 4);

    /* JADX INFO: renamed from: c */
    public static final byte[] f10173c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte[] f10174a;

    public AbstractC1388s(byte[] bArr) {
        if (bArr != null) {
            this.f10174a = bArr;
        } else {
            l41.m4051t("'string' cannot be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC1388s m5931u(Object obj) {
        String strM3611i;
        if (obj == null || (obj instanceof AbstractC1388s)) {
            return (AbstractC1388s) obj;
        }
        if (!(obj instanceof InterfaceC0696h)) {
            if (obj instanceof byte[]) {
                try {
                    return (AbstractC1388s) f10172b.m2151b((byte[]) obj);
                } catch (IOException e) {
                    strM3611i = jd0.m3611i(e, new StringBuilder("failed to construct OCTET STRING from byte[]: "));
                }
            }
            f40.m2713i(strM3611i);
            return null;
        }
        AbstractC1536w abstractC1536wMo696b = ((InterfaceC0696h) obj).mo696b();
        if (abstractC1536wMo696b instanceof AbstractC1388s) {
            return (AbstractC1388s) abstractC1536wMo696b;
        }
        strM3611i = "illegal object in getInstance: ".concat(obj.getClass().getName());
        f40.m2713i(strM3611i);
        return null;
    }

    @Override // p000.InterfaceC1425t
    /* JADX INFO: renamed from: a */
    public final InputStream mo2978a() {
        return new ByteArrayInputStream(this.f10174a);
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        return this;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f10174a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof AbstractC1388s) {
            return Arrays.equals(this.f10174a, ((AbstractC1388s) abstractC1536w).f10174a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        return new C1123mw(this.f10174a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        return new C1123mw(this.f10174a);
    }

    public final String toString() {
        kk0 kk0Var = jk0.f5438a;
        byte[] bArr = this.f10174a;
        return "#".concat(yv1.m7153a(jk0.m3657b(bArr.length, bArr)));
    }
}
