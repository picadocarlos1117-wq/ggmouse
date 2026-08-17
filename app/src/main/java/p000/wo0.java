package p000;

import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wo0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f12241a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final C0603eh f12242b = j51.f5270e;

    /* JADX INFO: renamed from: a */
    public static h51 m6815a(String str, bz1 bz1Var) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = g51.f4065d;
        return new h51(str, z, bz1Var);
    }
}
