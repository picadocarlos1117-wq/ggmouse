package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0081b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f1101a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0609en.f3387a);
        bytes.getClass();
        f1101a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final String m797a(long j, C1073lj c1073lj) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c1073lj.m4208l(j2) == 13) {
                String strM4213s = c1073lj.m4213s(j2, AbstractC0609en.f3387a);
                c1073lj.skip(2L);
                return strM4213s;
            }
        }
        String strM4213s2 = c1073lj.m4213s(j, AbstractC0609en.f3387a);
        c1073lj.skip(1L);
        return strM4213s2;
    }
}
