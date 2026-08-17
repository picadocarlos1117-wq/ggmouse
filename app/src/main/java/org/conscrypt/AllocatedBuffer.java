package org.conscrypt;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: org.conscrypt.AllocatedBuffer.1
            @Override // org.conscrypt.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // org.conscrypt.AllocatedBuffer
            public AllocatedBuffer release() {
                return this;
            }
        };
    }

    public abstract ByteBuffer nioBuffer();

    public abstract AllocatedBuffer release();

    @Deprecated
    public AllocatedBuffer retain() {
        return this;
    }
}
