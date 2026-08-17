package android.sun.security.x509;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class AVAComparator implements Comparator<AVA> {
    private static final Comparator<AVA> INSTANCE = new AVAComparator();

    private AVAComparator() {
    }

    public static Comparator<AVA> getInstance() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(AVA ava, AVA ava2) {
        boolean zHasRFC2253Keyword = ava.hasRFC2253Keyword();
        if (zHasRFC2253Keyword == ava2.hasRFC2253Keyword()) {
            return ava.toRFC2253CanonicalString().compareTo(ava2.toRFC2253CanonicalString());
        }
        return zHasRFC2253Keyword ? -1 : 1;
    }
}
