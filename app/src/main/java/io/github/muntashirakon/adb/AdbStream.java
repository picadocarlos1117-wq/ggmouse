package io.github.muntashirakon.adb;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AdbStream implements Closeable {
    private final AdbConnection mAdbConnection;
    private final int mLocalId;
    private volatile boolean mPendingClose;
    private final ByteBuffer mReadBuffer;
    private volatile int mRemoteId;
    private final Queue<byte[]> mReadQueue = new ConcurrentLinkedQueue();
    private final AtomicBoolean mWriteReady = new AtomicBoolean(false);
    private volatile boolean mIsClosed = false;

    public AdbStream(AdbConnection adbConnection, int i) {
        this.mAdbConnection = adbConnection;
        this.mLocalId = i;
        this.mReadBuffer = (ByteBuffer) ByteBuffer.allocate(adbConnection.getMaxData()).flip();
    }

    private int readBuffer(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            if (this.mReadBuffer.hasRemaining()) {
                bArr[i4] = this.mReadBuffer.get();
                i3++;
            }
        }
        return i3;
    }

    public void addPayload(byte[] bArr) {
        synchronized (this.mReadQueue) {
            this.mReadQueue.add(bArr);
            this.mReadQueue.notifyAll();
        }
    }

    public int available() {
        synchronized (this) {
            try {
                if (this.mIsClosed) {
                    throw new IOException("Stream closed.");
                }
                if (this.mReadBuffer.hasRemaining()) {
                    return this.mReadBuffer.remaining();
                }
                byte[] bArrPeek = this.mReadQueue.peek();
                return bArrPeek == null ? 0 : bArrPeek.length;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.mIsClosed) {
                    return;
                }
                notifyClose(false);
                this.mAdbConnection.sendPacket(AdbProtocol.generateClose(this.mLocalId, this.mRemoteId));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        if (this.mIsClosed) {
            ca0.m1178j("Stream closed");
        } else {
            this.mAdbConnection.flushPacket();
        }
    }

    public boolean isClosed() {
        return this.mIsClosed;
    }

    public void notifyClose(boolean z) {
        if (!z || this.mReadQueue.isEmpty()) {
            this.mIsClosed = true;
        } else {
            this.mPendingClose = true;
        }
        synchronized (this) {
            notifyAll();
        }
        synchronized (this.mReadQueue) {
            this.mReadQueue.notifyAll();
        }
    }

    public AdbInputStream openInputStream() {
        return new AdbInputStream(this);
    }

    public AdbOutputStream openOutputStream() {
        return new AdbOutputStream(this);
    }

    public int read(byte[] bArr, int i, int i2) {
        byte[] bArrPoll;
        if (this.mReadBuffer.hasRemaining()) {
            return readBuffer(bArr, i, i2);
        }
        synchronized (this.mReadQueue) {
            while (true) {
                bArrPoll = this.mReadQueue.poll();
                if (bArrPoll != null || this.mIsClosed) {
                    break;
                }
                try {
                    this.mReadQueue.wait();
                } catch (InterruptedException e) {
                    throw ((IOException) new IOException().initCause(e));
                }
            }
            if (bArrPoll != null) {
                this.mReadBuffer.clear();
                this.mReadBuffer.put(bArrPoll);
                this.mReadBuffer.flip();
                if (this.mReadBuffer.hasRemaining()) {
                    return readBuffer(bArr, i, i2);
                }
            }
            if (this.mIsClosed) {
                throw new IOException("Stream closed.");
            }
            if (this.mPendingClose && this.mReadQueue.isEmpty()) {
                this.mIsClosed = true;
            }
            return -1;
        }
    }

    public void readyForWrite() {
        this.mWriteReady.set(true);
    }

    public void sendReady() {
        this.mAdbConnection.sendPacket(AdbProtocol.generateReady(this.mLocalId, this.mRemoteId));
    }

    public void updateRemoteId(int i) {
        this.mRemoteId = i;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            while (!this.mIsClosed && !this.mWriteReady.compareAndSet(true, false)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw ((IOException) new IOException().initCause(e));
                }
            }
            if (this.mIsClosed) {
                throw new IOException("Stream closed");
            }
        }
        try {
            int maxData = this.mAdbConnection.getMaxData();
            while (i2 != 0) {
                AdbConnection adbConnection = this.mAdbConnection;
                if (i2 <= maxData) {
                    adbConnection.sendPacket(AdbProtocol.generateWrite(this.mLocalId, this.mRemoteId, bArr, i, i2));
                    i += i2;
                    i2 = 0;
                } else {
                    adbConnection.sendPacket(AdbProtocol.generateWrite(this.mLocalId, this.mRemoteId, bArr, i, maxData));
                    i += maxData;
                    i2 -= maxData;
                }
            }
        } catch (AdbPairingRequiredException | InterruptedException e2) {
            throw ((IOException) new IOException().initCause(e2));
        }
    }
}
