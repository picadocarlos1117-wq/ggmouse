package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774j1 implements x41 {
    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = no0.f7481a;
        iterable.getClass();
        if (iterable instanceof yr0) {
            List listMo2499g = ((yr0) iterable).mo2499g();
            yr0 yr0Var = (yr0) list;
            int size = list.size();
            for (Object obj : listMo2499g) {
                if (obj == null) {
                    String str = "Element at index " + (yr0Var.size() - size) + " is null.";
                    for (int size2 = yr0Var.size() - 1; size2 >= size; size2--) {
                        yr0Var.remove(size2);
                    }
                    l41.m4051t(str);
                    return;
                }
                if (obj instanceof AbstractC0753ik) {
                    yr0Var.mo2500l((AbstractC0753ik) obj);
                } else {
                    yr0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof bg1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                l41.m4051t(str2);
                return;
            }
            list.add(t);
        }
    }

    public static y32 newUninitializedMessageException(y41 y41Var) {
        return new y32();
    }

    /* JADX INFO: renamed from: b */
    public final String m3525b() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract AbstractC0774j1 internalMergeFrom(AbstractC0812k1 abstractC0812k1);

    public boolean mergeDelimitedFrom(InputStream inputStream, u80 u80Var) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        m7446mergeFrom((InputStream) new C0735i1(inputStream, AbstractC0762ip.m3470s(i, inputStream)), u80Var);
        return true;
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC0774j1 m7409mergeFrom(AbstractC0762ip abstractC0762ip, u80 u80Var);

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7447mergeFrom(y41 y41Var) {
        if (getDefaultInstanceForType().getClass().isInstance(y41Var)) {
            return internalMergeFrom((AbstractC0812k1) y41Var);
        }
        f40.m2713i("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC0774j1 m7410mergeFrom(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC0774j1 m7411mergeFrom(byte[] bArr, int i, int i2, u80 u80Var);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, u80.m6404a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7444mergeFrom(AbstractC0762ip abstractC0762ip) {
        return m7409mergeFrom(abstractC0762ip, u80.m6404a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7442mergeFrom(AbstractC0753ik abstractC0753ik) throws rp0 {
        try {
            AbstractC0762ip abstractC0762ipMo2994q = abstractC0753ik.mo2994q();
            m7444mergeFrom(abstractC0762ipMo2994q);
            abstractC0762ipMo2994q.mo2615a(0);
            return this;
        } catch (rp0 e) {
            throw e;
        } catch (IOException e2) {
            l41.m4043l(m3525b(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7443mergeFrom(AbstractC0753ik abstractC0753ik, u80 u80Var) throws rp0 {
        try {
            AbstractC0762ip abstractC0762ipMo2994q = abstractC0753ik.mo2994q();
            m7409mergeFrom(abstractC0762ipMo2994q, u80Var);
            abstractC0762ipMo2994q.mo2615a(0);
            return this;
        } catch (rp0 e) {
            throw e;
        } catch (IOException e2) {
            l41.m4043l(m3525b(), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7448mergeFrom(byte[] bArr) {
        return m7410mergeFrom(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7449mergeFrom(byte[] bArr, u80 u80Var) {
        return m7411mergeFrom(bArr, 0, bArr.length, u80Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7445mergeFrom(InputStream inputStream) {
        AbstractC0762ip abstractC0762ipM3469g = AbstractC0762ip.m3469g(inputStream);
        m7444mergeFrom(abstractC0762ipM3469g);
        abstractC0762ipM3469g.mo2615a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0774j1 m7446mergeFrom(InputStream inputStream, u80 u80Var) {
        AbstractC0762ip abstractC0762ipM3469g = AbstractC0762ip.m3469g(inputStream);
        m7409mergeFrom(abstractC0762ipM3469g, u80Var);
        abstractC0762ipM3469g.mo2615a(0);
        return this;
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
