package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.sun.security.util.DerValue;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements InterfaceC0679gj, InterfaceC0769ix {

    /* JADX INFO: renamed from: e */
    public static final byte[] f6274e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, DerValue.tag_UniversalString, -43, -59, -9, 1, DerValue.tag_PrintableString, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, DerValue.TAG_CONTEXT, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f6275f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: g */
    public static final long[] f6276g = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6277a;

    /* JADX INFO: renamed from: b */
    public int f6278b;

    /* JADX INFO: renamed from: c */
    public int f6279c;

    /* JADX INFO: renamed from: d */
    public Object f6280d;

    public l91(Context context, XmlResourceParser xmlResourceParser) {
        this.f6277a = 3;
        this.f6280d = new ArrayList();
        this.f6279c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), di1.f2945h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f6278b = typedArrayObtainStyledAttributes.getResourceId(index, this.f6278b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6279c);
                this.f6279c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1602xs().m6953b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static long m4148d(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f6276g[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public static void m4149i(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        p32.m5173j("out of range: %s", j2, (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: a */
    public int mo2987a() {
        return this.f6278b;
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: b */
    public int mo2988b() {
        return this.f6279c;
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: c */
    public int mo2989c() {
        int i = this.f6278b;
        return i == -1 ? ((dc1) this.f6280d).m2341x() : i;
    }

    /* JADX INFO: renamed from: e */
    public void m4150e() {
        for (int i = 0; i < this.f6278b; i++) {
            C0082b0 c0082b0 = ((C0082b0[]) this.f6280d)[i];
            short[] sArr = new short[256];
            System.arraycopy((short[]) c0082b0.f1104c, 0, sArr, 0, 256);
            int i2 = 1;
            for (int i3 = 128; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = hr1.f4689h[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        int i7 = i6 + i3;
                        short sM5776Z = rc2.m5776Z(sArr[i7] * s);
                        sArr[i7] = (short) (sArr[i6] - sM5776Z);
                        sArr[i6] = (short) (sArr[i6] + sM5776Z);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            c0082b0.f1104c = sArr;
            c0082b0.m813p();
        }
    }

    @Override // p000.InterfaceC0769ix
    /* JADX INFO: renamed from: f */
    public InterfaceC0807jx mo2265f() {
        return new C0809jz(this.f6278b, this.f6279c, (C0558d8) this.f6280d);
    }

    /* JADX INFO: renamed from: g */
    public long m4151g(y80 y80Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.f6280d;
        if (this.f6278b == 0) {
            if (!y80Var.mo2414b(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f6276g[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f6279c = i2;
            if (i2 == -1) {
                f40.m2719o("No valid varint length mask found");
                return 0L;
            }
            this.f6278b = 1;
        }
        int i5 = this.f6279c;
        if (i5 > i) {
            this.f6278b = 0;
            return -2L;
        }
        if (i5 != 1) {
            y80Var.readFully(bArr, 1, i5 - 1);
        }
        this.f6278b = 0;
        return m4148d(this.f6279c, z2, bArr);
    }

    /* JADX INFO: renamed from: h */
    public byte[] m4152h() {
        byte[] bArr = new byte[this.f6279c];
        for (int i = 0; i < this.f6278b; i++) {
            C0082b0 c0082b0 = ((C0082b0[]) this.f6280d)[i];
            byte[] bArr2 = new byte[384];
            for (int i2 = 0; i2 < 256; i2++) {
                short[] sArr = (short[]) c0082b0.f1104c;
                short s = (short) (sArr[i2] - 3329);
                sArr[i2] = (short) (s + ((s >> 15) & 3329));
            }
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                short[] sArr2 = (short[]) c0082b0.f1104c;
                short s2 = sArr2[i4];
                short s3 = sArr2[i4 + 1];
                int i5 = i3 * 3;
                bArr2[i5] = (byte) s2;
                bArr2[i5 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
                bArr2[i5 + 2] = (byte) (s3 >> 4);
            }
            c0082b0.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 384, 384);
        }
        return bArr;
    }

    public String toString() {
        switch (this.f6277a) {
            case 7:
                int i = this.f6278b;
                StringBuffer stringBuffer = new StringBuffer("[");
                for (int i2 = 0; i2 < i; i2++) {
                    stringBuffer.append(((C0082b0[]) this.f6280d)[i2].toString());
                    if (i2 != i - 1) {
                        stringBuffer.append(", ");
                    }
                }
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public l91(ch1 ch1Var) {
        this.f6277a = 7;
        int i = ch1Var.f1806a;
        this.f6278b = i;
        this.f6279c = ch1Var.f1807b;
        this.f6280d = new C0082b0[i];
        for (int i2 = 0; i2 < this.f6278b; i2++) {
            ((C0082b0[]) this.f6280d)[i2] = new C0082b0(ch1Var);
        }
    }

    public l91(int i) {
        this.f6277a = i;
        switch (i) {
            case 1:
                this.f6280d = new byte[8];
                break;
            case 4:
                this.f6280d = new C0558d8((byte) 0, 29);
                this.f6278b = 8000;
                this.f6279c = 8000;
                break;
            case 6:
                this.f6280d = new l91[256];
                this.f6278b = 0;
                this.f6279c = 0;
                break;
        }
    }

    public l91(int i, int i2) {
        this.f6277a = 6;
        this.f6280d = null;
        this.f6278b = i;
        int i3 = i2 & 7;
        this.f6279c = i3 == 0 ? 8 : i3;
    }

    public l91(int i, int i2, SparseArray sparseArray) {
        this.f6277a = 5;
        this.f6278b = i;
        this.f6279c = i2;
        this.f6280d = sparseArray;
    }

    public l91(l61 l61Var, be0 be0Var) {
        this.f6277a = 2;
        dc1 dc1Var = l61Var.f6194g;
        this.f6280d = dc1Var;
        dc1Var.m2316F(12);
        int iM2341x = dc1Var.m2341x();
        if ("audio/raw".equals(be0Var.f1341n)) {
            int iM7245s = z42.m7245s(be0Var.f1319E, be0Var.f1317C);
            if (iM2341x == 0 || iM2341x % iM7245s != 0) {
                AbstractC1337qm.m5542i0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iM7245s + ", stsz sample size: " + iM2341x);
                iM2341x = iM7245s;
            }
        }
        this.f6278b = iM2341x == 0 ? -1 : iM2341x;
        this.f6279c = dc1Var.m2341x();
    }
}
