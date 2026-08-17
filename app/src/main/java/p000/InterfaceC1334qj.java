package p000;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1334qj extends du1, ReadableByteChannel {
    /* JADX INFO: renamed from: b */
    C0717hk mo4199b(long j);

    /* JADX INFO: renamed from: f */
    String mo4203f(long j);

    /* JADX INFO: renamed from: i */
    String mo4206i(Charset charset);

    /* JADX INFO: renamed from: m */
    String mo4209m();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    /* JADX INFO: renamed from: t */
    void mo4214t(long j);

    /* JADX INFO: renamed from: v */
    long mo4215v();

    /* JADX INFO: renamed from: w */
    boolean mo4216w(C0717hk c0717hk);
}
