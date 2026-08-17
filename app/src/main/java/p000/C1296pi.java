package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;

/* JADX INFO: renamed from: pi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1296pi implements InterfaceC0700h3, k11 {

    /* JADX INFO: renamed from: a */
    public int f8901a;

    /* JADX INFO: renamed from: b */
    public Object f8902b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1296pi(int i, boolean z) {
        this(32);
        switch (i) {
            case 4:
                this.f8902b = new int[10];
                break;
            case 5:
                this.f8902b = new dc1(8);
                break;
            default:
                break;
        }
    }

    @Override // p000.InterfaceC0700h3
    /* JADX INFO: renamed from: a */
    public boolean mo3095a(View view) {
        ((BottomSheetBehavior) this.f8902b).m1656H(this.f8901a);
        return true;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: b */
    public MediaCodecInfo mo3745b(int i) {
        if (((MediaCodecInfo[]) this.f8902b) == null) {
            this.f8902b = new MediaCodecList(this.f8901a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f8902b)[i];
    }

    /* JADX INFO: renamed from: c */
    public void m5258c(long j) {
        int i = this.f8901a;
        long[] jArr = (long[]) this.f8902b;
        if (i == jArr.length) {
            this.f8902b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f8902b;
        int i2 = this.f8901a;
        this.f8901a = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: d */
    public boolean mo3746d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* JADX INFO: renamed from: e */
    public void m5259e(long[] jArr) {
        int length = this.f8901a + jArr.length;
        long[] jArr2 = (long[]) this.f8902b;
        if (length > jArr2.length) {
            this.f8902b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f8902b, this.f8901a, jArr.length);
        this.f8901a = length;
    }

    /* JADX INFO: renamed from: f */
    public long m5260f(int i) {
        if (i >= 0 && i < this.f8901a) {
            return ((long[]) this.f8902b)[i];
        }
        ca0.m1175g(this.f8901a, AbstractC1308pu.m5343j(i, "Invalid index ", ", size is "));
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5261g(int i) {
        return (this.f8901a & (1 << i)) != 0;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: h */
    public boolean mo3747h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: i */
    public int mo3748i() {
        if (((MediaCodecInfo[]) this.f8902b) == null) {
            this.f8902b = new MediaCodecList(this.f8901a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f8902b).length;
    }

    /* JADX INFO: renamed from: j */
    public long m5262j(C0584dz c0584dz) {
        dc1 dc1Var = (dc1) this.f8902b;
        int i = 0;
        c0584dz.mo2416e(dc1Var.f2882a, 0, 1, false);
        int i2 = dc1Var.f2882a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c0584dz.mo2416e(dc1Var.f2882a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (dc1Var.f2882a[i] & 255) + (i5 << 8);
        }
        this.f8901a = i4 + 1 + this.f8901a;
        return i5;
    }

    /* JADX INFO: renamed from: k */
    public void m5263k(int i, int i2) {
        int[] iArr = (int[]) this.f8902b;
        if (i >= iArr.length) {
            return;
        }
        this.f8901a = (1 << i) | this.f8901a;
        iArr[i] = i2;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: l */
    public boolean mo3749l() {
        return true;
    }

    public C1296pi(int i) {
        this.f8902b = new long[i];
    }

    public C1296pi(int i, yd0[] yd0VarArr) {
        this.f8901a = i;
        this.f8902b = yd0VarArr;
    }

    public C1296pi(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f8902b = bottomSheetBehavior;
        this.f8901a = i;
    }
}
