package p000;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class np1 implements z52, InterfaceC0718hl {

    /* JADX INFO: renamed from: n */
    public int f7501n;

    /* JADX INFO: renamed from: o */
    public SurfaceTexture f7502o;

    /* JADX INFO: renamed from: r */
    public byte[] f7505r;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f7493a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f7494b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final ch1 f7495c = new ch1();

    /* JADX INFO: renamed from: d */
    public final C1679zv f7496d = new C1679zv(2);

    /* JADX INFO: renamed from: e */
    public final C0716hj f7497e = new C0716hj();

    /* JADX INFO: renamed from: f */
    public final C0716hj f7498f = new C0716hj();

    /* JADX INFO: renamed from: g */
    public final float[] f7499g = new float[16];

    /* JADX INFO: renamed from: m */
    public final float[] f7500m = new float[16];

    /* JADX INFO: renamed from: p */
    public volatile int f7503p = 0;

    /* JADX INFO: renamed from: q */
    public int f7504q = -1;

    @Override // p000.InterfaceC0718hl
    /* JADX INFO: renamed from: a */
    public final void mo2285a(long j, float[] fArr) {
        ((C0716hj) this.f7496d.f13578e).m3151a(j, fArr);
    }

    @Override // p000.InterfaceC0718hl
    /* JADX INFO: renamed from: b */
    public final void mo2286b() {
        this.f7497e.m3152b();
        C1679zv c1679zv = this.f7496d;
        ((C0716hj) c1679zv.f13578e).m3152b();
        c1679zv.f13575b = false;
        this.f7494b.set(true);
    }

    @Override // p000.z52
    /* JADX INFO: renamed from: c */
    public final void mo2287c(long j, long j2, be0 be0Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListM3846Q;
        this.f7497e.m3151a(j2, Long.valueOf(j));
        byte[] bArr = be0Var.f1353z;
        int i2 = be0Var.f1315A;
        byte[] bArr2 = this.f7505r;
        int i3 = this.f7504q;
        this.f7505r = bArr;
        if (i2 == -1) {
            i2 = this.f7503p;
        }
        this.f7504q = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f7505r)) {
            return;
        }
        byte[] bArr3 = this.f7505r;
        bh1 bh1Var = null;
        if (bArr3 != null) {
            int i4 = this.f7504q;
            dc1 dc1Var = new dc1(bArr3);
            try {
                dc1Var.m2317G(4);
                int iM2324g = dc1Var.m2324g();
                dc1Var.m2316F(0);
                if (iM2324g == 1886547818) {
                    dc1Var.m2317G(8);
                    int i5 = dc1Var.f2883b;
                    int i6 = dc1Var.f2884c;
                    while (true) {
                        if (i5 < i6) {
                            int iM2324g2 = dc1Var.m2324g() + i5;
                            if (iM2324g2 > i5 && iM2324g2 <= i6) {
                                int iM2324g3 = dc1Var.m2324g();
                                if (iM2324g3 != 2037673328 && iM2324g3 != 1836279920) {
                                    dc1Var.m2316F(iM2324g2);
                                    i5 = iM2324g2;
                                }
                                dc1Var.m2315E(iM2324g2);
                                arrayListM3846Q = ki0.m3846Q(dc1Var);
                            }
                        }
                        arrayListM3846Q = null;
                    }
                } else {
                    arrayListM3846Q = ki0.m3846Q(dc1Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListM3846Q != null) {
                int size = arrayListM3846Q.size();
                if (size == 1) {
                    ah1 ah1Var = (ah1) arrayListM3846Q.get(0);
                    bh1Var = new bh1(ah1Var, ah1Var, i4);
                } else if (size == 2) {
                    bh1Var = new bh1((ah1) arrayListM3846Q.get(0), (ah1) arrayListM3846Q.get(1), i4);
                }
            }
        }
        if (bh1Var == null || !ch1.m1218c(bh1Var)) {
            int i7 = this.f7504q;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            ah1 ah1Var2 = new ah1(new C0716hj(0, fArr, fArr2, 1));
            bh1Var = new bh1(ah1Var2, ah1Var2, i7);
        }
        this.f7498f.m3151a(j2, bh1Var);
    }

    /* JADX INFO: renamed from: d */
    public final SurfaceTexture m4588d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            p32.m5185p();
            this.f7495c.m1219a();
            p32.m5185p();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            p32.m5185p();
            int i = iArr[0];
            p32.m5167g(36197, i);
            this.f7501n = i;
        } catch (ji0 e) {
            AbstractC1337qm.m5551n("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f7501n);
        this.f7502o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: mp1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f7064a.f7493a.set(true);
            }
        });
        return this.f7502o;
    }
}
