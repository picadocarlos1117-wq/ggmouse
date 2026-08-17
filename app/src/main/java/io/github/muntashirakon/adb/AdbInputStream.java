package io.github.muntashirakon.adb;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AdbInputStream extends InputStream {
    public AdbStream mAdbStream;

    public AdbInputStream(AdbStream adbStream) {
        this.mAdbStream = adbStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mAdbStream.available();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.mAdbStream.isClosed()) {
            return -1;
        }
        return this.mAdbStream.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }
}
