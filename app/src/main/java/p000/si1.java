package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 {

    /* JADX INFO: renamed from: a */
    public final y41 f10412a;

    /* JADX INFO: renamed from: b */
    public final String f10413b;

    /* JADX INFO: renamed from: c */
    public final Object[] f10414c;

    /* JADX INFO: renamed from: d */
    public final int f10415d;

    public si1(y41 y41Var, String str, Object[] objArr) {
        this.f10412a = y41Var;
        this.f10413b = str;
        this.f10414c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10415d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f10415d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6103a() {
        int i = this.f10415d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
