package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f11728d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final String f11729a;

    /* JADX INFO: renamed from: b */
    public final String f11730b;

    /* JADX INFO: renamed from: c */
    public final long f11731c;

    public vo0(String str, String str2, long j) {
        p32.m5177l(!str.isEmpty(), "empty type");
        this.f11729a = str;
        this.f11730b = str2;
        this.f11731c = j;
    }

    /* JADX INFO: renamed from: a */
    public static vo0 m6645a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new vo0(simpleName, str, f11728d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11729a + "<" + this.f11731c + ">");
        String str = this.f11730b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
