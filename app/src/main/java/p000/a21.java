package p000;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a21 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f39a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f40b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m54a(String str) {
        if (f39a.add(str)) {
            f40b += ", " + str;
        }
    }
}
