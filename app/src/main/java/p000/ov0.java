package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ov0 {

    /* JADX INFO: renamed from: b */
    public static final ov0 f8495b = new ov0(new pv0(nv0.m4605a(new Locale[0])));

    /* JADX INFO: renamed from: a */
    public final pv0 f8496a;

    public ov0(pv0 pv0Var) {
        this.f8496a = pv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static ov0 m5066a(String str) {
        if (str == null || str.isEmpty()) {
            return f8495b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = mv0.m4460a(strArrSplit[i]);
        }
        return new ov0(new pv0(nv0.m4605a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ov0) {
            return this.f8496a.equals(((ov0) obj).f8496a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8496a.f9178a.hashCode();
    }

    public final String toString() {
        return this.f8496a.f9178a.toString();
    }
}
