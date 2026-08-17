package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class fc1 extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f3750a;

    /* JADX INFO: renamed from: b */
    public final int f3751b;

    public fc1(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f3750a = z;
        this.f3751b = i;
    }

    /* JADX INFO: renamed from: a */
    public static fc1 m2799a(RuntimeException runtimeException, String str) {
        return new fc1(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static fc1 m2800b(String str) {
        return new fc1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append(" {contentIsMalformed=");
        sb.append(this.f3750a);
        sb.append(", dataType=");
        return AbstractC1308pu.m5341h(sb, this.f3751b, "}");
    }
}
