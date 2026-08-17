package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1103mc {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f6750a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a */
    ByteBuffer mo2125a();

    /* JADX INFO: renamed from: b */
    void mo2126b(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    C0823kc mo2127c(C0823kc c0823kc);

    /* JADX INFO: renamed from: d */
    void mo2128d();

    /* JADX INFO: renamed from: e */
    boolean mo2129e();

    void flush();

    boolean isActive();

    void reset();
}
