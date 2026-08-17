package p000;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am {

    /* JADX INFO: renamed from: c */
    public static final C1473ua f266c = new C1473ua(2);

    /* JADX INFO: renamed from: a */
    public final C0805jv f267a;

    /* JADX INFO: renamed from: b */
    public final int f268b;

    public C0023am(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        this.f267a = new C0805jv(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
        this.f268b = i4;
    }
}
