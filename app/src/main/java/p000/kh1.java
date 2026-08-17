package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends InputStream implements yq0 {

    /* JADX INFO: renamed from: a */
    public y41 f5823a;

    /* JADX INFO: renamed from: b */
    public final ec1 f5824b;

    /* JADX INFO: renamed from: c */
    public ByteArrayInputStream f5825c;

    public kh1(y41 y41Var, ec1 ec1Var) {
        this.f5823a = y41Var;
        this.f5824b = ec1Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        y41 y41Var = this.f5823a;
        if (y41Var != null) {
            return y41Var.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f5825c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        y41 y41Var = this.f5823a;
        if (y41Var != null) {
            int serializedSize = y41Var.getSerializedSize();
            if (serializedSize == 0) {
                this.f5823a = null;
                this.f5825c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                Logger logger = AbstractC1153np.f7490b;
                C1042kp c1042kp = new C1042kp(bArr, i, serializedSize);
                this.f5823a.writeTo(c1042kp);
                if (c1042kp.m3974B() != 0) {
                    f40.m2719o("Did not write as much data as expected.");
                    return 0;
                }
                this.f5823a = null;
                this.f5825c = null;
                return serializedSize;
            }
            this.f5825c = new ByteArrayInputStream(this.f5823a.toByteArray());
            this.f5823a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f5825c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f5823a != null) {
            this.f5825c = new ByteArrayInputStream(this.f5823a.toByteArray());
            this.f5823a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f5825c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
