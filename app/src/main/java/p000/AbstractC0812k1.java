package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0812k1 implements y41 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0774j1.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC0753ik abstractC0753ik) {
        if (abstractC0753ik.mo2993p()) {
            return;
        }
        f40.m2713i("Byte string is not UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public final String m3730b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(qp1 qp1Var);

    public y32 newUninitializedMessageException() {
        return new y32();
    }

    @Override // p000.y41
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC1153np.f7490b;
            C1042kp c1042kp = new C1042kp(bArr, 0, serializedSize);
            writeTo(c1042kp);
            if (c1042kp.m3974B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            l41.m4043l(m3730b("byte array"), e);
            return null;
        }
    }

    public AbstractC0753ik toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C0680gk c0680gk = AbstractC0753ik.f5042b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC1153np.f7490b;
            C1042kp c1042kp = new C1042kp(bArr, 0, serializedSize);
            writeTo(c1042kp);
            if (c1042kp.m3974B() == 0) {
                return new C0680gk(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            l41.m4043l(m3730b("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM4585d = AbstractC1153np.m4585d(serializedSize) + serializedSize;
        if (iM4585d > 4096) {
            iM4585d = 4096;
        }
        C1116mp c1116mp = new C1116mp(outputStream, iM4585d);
        c1116mp.mo3994y(serializedSize);
        writeTo(c1116mp);
        if (c1116mp.f7062f > 0) {
            c1116mp.m4435G();
        }
    }

    @Override // p000.y41
    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC1153np.f7490b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C1116mp c1116mp = new C1116mp(outputStream, serializedSize);
        writeTo(c1116mp);
        if (c1116mp.f7062f > 0) {
            c1116mp.m4435G();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0774j1.addAll((Iterable) iterable, (List) list);
    }
}
