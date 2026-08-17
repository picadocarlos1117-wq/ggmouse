package android.sun.security.x509;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509AttributeName {
    private static final char SEPARATOR = '.';
    private String prefix;
    private String suffix;

    public X509AttributeName(String str) {
        this.prefix = null;
        this.suffix = null;
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            this.prefix = str;
        } else {
            this.prefix = str.substring(0, iIndexOf);
            this.suffix = str.substring(iIndexOf + 1);
        }
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }
}
