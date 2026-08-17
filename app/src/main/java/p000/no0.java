package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class no0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f7481a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f7482b;

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer f7483c;

    static {
        Charset.forName("US-ASCII");
        f7481a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7482b = bArr;
        f7483c = ByteBuffer.wrap(bArr);
        AbstractC0762ip.m3468f(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m4572a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l41.m4051t(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m4573b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
