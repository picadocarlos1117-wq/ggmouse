package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u32 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final c60 f11111b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f11110a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public float f11112c = 1.0f;

    public u32(c60 c60Var) {
        rc2.m5789j(c60Var, "metadata cannot be null");
        this.f11111b = c60Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        t50.m6231a().getClass();
        c60 c60Var = this.f11111b;
        C0599ed c0599ed = c60Var.f1680b;
        Typeface typeface = (Typeface) c0599ed.f3316d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0599ed.f3314b, c60Var.f1679a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f11110a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        c60 c60Var = this.f11111b;
        p51 p51VarM1136b = c60Var.m1136b();
        int iM2406a = p51VarM1136b.m2406a(14);
        this.f11112c = fAbs / (iM2406a != 0 ? ((ByteBuffer) p51VarM1136b.f3076d).getShort(iM2406a + p51VarM1136b.f3073a) : (short) 0);
        p51 p51VarM1136b2 = c60Var.m1136b();
        int iM2406a2 = p51VarM1136b2.m2406a(14);
        if (iM2406a2 != 0) {
            ((ByteBuffer) p51VarM1136b2.f3076d).getShort(iM2406a2 + p51VarM1136b2.f3073a);
        }
        p51 p51VarM1136b3 = c60Var.m1136b();
        int iM2406a3 = p51VarM1136b3.m2406a(12);
        short s = (short) ((iM2406a3 != 0 ? ((ByteBuffer) p51VarM1136b3.f3076d).getShort(iM2406a3 + p51VarM1136b3.f3073a) : (short) 0) * this.f11112c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
