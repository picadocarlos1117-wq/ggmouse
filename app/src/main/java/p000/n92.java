package p000;

import android.text.Layout;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n92 {

    /* JADX INFO: renamed from: c */
    public CharSequence f7320c;

    /* JADX INFO: renamed from: a */
    public long f7318a = 0;

    /* JADX INFO: renamed from: b */
    public long f7319b = 0;

    /* JADX INFO: renamed from: d */
    public int f7321d = 2;

    /* JADX INFO: renamed from: e */
    public float f7322e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public int f7323f = 1;

    /* JADX INFO: renamed from: g */
    public int f7324g = 0;

    /* JADX INFO: renamed from: h */
    public float f7325h = -3.4028235E38f;

    /* JADX INFO: renamed from: i */
    public int f7326i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public float f7327j = 1.0f;

    /* JADX INFO: renamed from: k */
    public int f7328k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX INFO: renamed from: a */
    public final C0767iv m4511a() {
        Layout.Alignment alignment;
        float f = this.f7325h;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f7321d;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f7326i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f7321d;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        C0767iv c0767iv = new C0767iv();
        int i4 = this.f7321d;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            jd0.m3621s(i4, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c0767iv.f5166c = alignment;
        float f3 = this.f7322e;
        int i5 = this.f7323f;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < TouchPipeline.SIZE || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c0767iv.f5168e = f2;
        c0767iv.f5169f = i5;
        c0767iv.f5170g = this.f7324g;
        c0767iv.f5171h = f;
        c0767iv.f5172i = i2;
        float f4 = this.f7327j;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            f40.m2719o(String.valueOf(i2));
            return null;
        }
        c0767iv.f5175l = Math.min(f4, f);
        c0767iv.f5179p = this.f7328k;
        CharSequence charSequence = this.f7320c;
        if (charSequence != null) {
            c0767iv.f5164a = charSequence;
        }
        return c0767iv;
    }
}
