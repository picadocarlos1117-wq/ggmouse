package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: en */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0609en {

    /* JADX INFO: renamed from: a */
    public static final Charset f3387a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f3387a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
