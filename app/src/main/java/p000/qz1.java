package p000;

import android.text.TextPaint;
import com.example.ssmousepro.injection.TouchPipeline;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 {

    /* JADX INFO: renamed from: c */
    public float f9635c;

    /* JADX INFO: renamed from: e */
    public final WeakReference f9637e;

    /* JADX INFO: renamed from: f */
    public oz1 f9638f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f9633a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final C0756in f9634b = new C0756in(this, 1);

    /* JADX INFO: renamed from: d */
    public boolean f9636d = true;

    public qz1(C1077ln c1077ln) {
        this.f9637e = new WeakReference(null);
        this.f9637e = new WeakReference(c1077ln);
    }

    /* JADX INFO: renamed from: a */
    public final float m5630a(String str) {
        if (!this.f9636d) {
            return this.f9635c;
        }
        TextPaint textPaint = this.f9633a;
        this.f9635c = str == null ? TouchPipeline.SIZE : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f9636d = false;
        return this.f9635c;
    }
}
