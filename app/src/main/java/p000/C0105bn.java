package p000;

/* JADX INFO: renamed from: bn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105bn extends AbstractC1670zm {

    /* JADX INFO: renamed from: b */
    public static final int f1434b = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: c */
    public static final C0105bn f1435c = new C0105bn("CharMatcher.whitespace()");

    @Override // p000.AbstractC1596xm
    /* JADX INFO: renamed from: a */
    public final boolean mo196a(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f1434b) == c;
    }
}
