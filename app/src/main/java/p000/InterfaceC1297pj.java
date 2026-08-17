package p000;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: pj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1297pj extends ft1, WritableByteChannel {
    @Override // p000.ft1, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: h */
    InterfaceC1297pj mo4205h(String str);

    /* JADX INFO: renamed from: k */
    InterfaceC1297pj mo4207k(long j);

    InterfaceC1297pj write(byte[] bArr);

    InterfaceC1297pj writeByte(int i);

    InterfaceC1297pj writeInt(int i);

    InterfaceC1297pj writeShort(int i);
}
