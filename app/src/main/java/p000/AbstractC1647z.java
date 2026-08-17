package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1647z extends AbstractC1536w implements Iterable {

    /* JADX INFO: renamed from: b */
    public static final C0549d f13208b = new C0549d(AbstractC1647z.class, 5);

    /* JADX INFO: renamed from: a */
    public InterfaceC0696h[] f13209a;

    public AbstractC1647z(InterfaceC0696h interfaceC0696h) {
        if (interfaceC0696h != null) {
            this.f13209a = new InterfaceC0696h[]{interfaceC0696h};
        } else {
            l41.m4051t("'element' cannot be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC1647z m7171w(Object obj) {
        String strM3611i;
        if (obj == null || (obj instanceof AbstractC1647z)) {
            return (AbstractC1647z) obj;
        }
        if (!(obj instanceof InterfaceC0696h)) {
            if (obj instanceof byte[]) {
                try {
                    return (AbstractC1647z) f13208b.m2151b((byte[]) obj);
                } catch (IOException e) {
                    strM3611i = jd0.m3611i(e, new StringBuilder("failed to construct sequence from byte[]: "));
                }
            }
            f40.m2713i(strM3611i);
            return null;
        }
        AbstractC1536w abstractC1536wMo696b = ((InterfaceC0696h) obj).mo696b();
        if (abstractC1536wMo696b instanceof AbstractC1647z) {
            return (AbstractC1647z) abstractC1536wMo696b;
        }
        strM3611i = "unknown object in getInstance: ".concat(obj.getClass().getName());
        f40.m2713i(strM3611i);
        return null;
    }

    /* JADX INFO: renamed from: A */
    public abstract AbstractC1388s mo3140A();

    /* JADX INFO: renamed from: B */
    public abstract AbstractC0001a0 mo3141B();

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public int hashCode() {
        int length = this.f13209a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f13209a[length].mo696b().hashCode();
        }
    }

    public Iterator iterator() {
        return new C1657z9(this.f13209a, 1);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof AbstractC1647z) {
            AbstractC1647z abstractC1647z = (AbstractC1647z) abstractC1536w;
            int size = size();
            if (abstractC1647z.size() == size) {
                for (int i = 0; i < size; i++) {
                    AbstractC1536w abstractC1536wMo696b = this.f13209a[i].mo696b();
                    AbstractC1536w abstractC1536wMo696b2 = abstractC1647z.f13209a[i].mo696b();
                    if (abstractC1536wMo696b == abstractC1536wMo696b2 || abstractC1536wMo696b.mo2j(abstractC1536wMo696b2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return true;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        C1310pw c1310pw = new C1310pw(this.f13209a, 0);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public int size() {
        return this.f13209a.length;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        C1310pw c1310pw = new C1310pw(this.f13209a, 1);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f13209a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC0585e[] m7172u() {
        int size = size();
        AbstractC0585e[] abstractC0585eArr = new AbstractC0585e[size];
        for (int i = 0; i < size; i++) {
            abstractC0585eArr[i] = AbstractC0585e.m2434w(this.f13209a[i]);
        }
        return abstractC0585eArr;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC1388s[] m7173v() {
        int size = size();
        AbstractC1388s[] abstractC1388sArr = new AbstractC1388s[size];
        for (int i = 0; i < size; i++) {
            abstractC1388sArr[i] = AbstractC1388s.m5931u(this.f13209a[i]);
        }
        return abstractC1388sArr;
    }

    /* JADX INFO: renamed from: x */
    public InterfaceC0696h mo6823x(int i) {
        return this.f13209a[i];
    }

    /* JADX INFO: renamed from: y */
    public Enumeration mo6824y() {
        return new C1610y(this);
    }

    /* JADX INFO: renamed from: z */
    public abstract AbstractC0585e mo3142z();

    public AbstractC1647z() {
        this.f13209a = C0733i.f4750e;
    }

    public AbstractC1647z(C0733i c0733i) {
        if (c0733i != null) {
            this.f13209a = c0733i.m3326d();
        } else {
            l41.m4051t("'elementVector' cannot be null");
            throw null;
        }
    }
}
