package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class xm0 extends qs0 {

    /* JADX INFO: renamed from: c */
    public int f12641c;

    /* JADX INFO: renamed from: d */
    public int f12642d;

    /* JADX INFO: renamed from: e */
    public boolean f12643e;

    /* JADX INFO: renamed from: f */
    public boolean f12644f;

    public xm0(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f12643e = false;
        this.f12644f = true;
        this.f12641c = inputStream.read();
        int i2 = inputStream.read();
        this.f12642d = i2;
        if (i2 >= 0) {
            m6935d();
        } else {
            f40.m2708d();
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6935d() {
        if (!this.f12643e && this.f12644f && this.f12641c == 0 && this.f12642d == 0) {
            this.f12643e = true;
            m5606c();
        }
        return this.f12643e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12644f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f12643e) {
            return -1;
        }
        InputStream inputStream = this.f9570a;
        int i3 = inputStream.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            f40.m2708d();
            return 0;
        }
        bArr[i] = (byte) this.f12641c;
        bArr[i + 1] = (byte) this.f12642d;
        this.f12641c = inputStream.read();
        int i4 = inputStream.read();
        this.f12642d = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        f40.m2708d();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (m6935d()) {
            return -1;
        }
        int i = this.f9570a.read();
        if (i < 0) {
            f40.m2708d();
            return 0;
        }
        int i2 = this.f12641c;
        this.f12641c = this.f12642d;
        this.f12642d = i;
        return i2;
    }
}
