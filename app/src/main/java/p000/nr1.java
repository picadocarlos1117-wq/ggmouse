package p000;

import android.graphics.Paint;
import android.graphics.Path;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 {

    /* JADX INFO: renamed from: i */
    public static final int[] f7512i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f7513j = {TouchPipeline.SIZE, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f7514k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f7515l = {TouchPipeline.SIZE, TouchPipeline.SIZE, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f7516a;

    /* JADX INFO: renamed from: b */
    public final Paint f7517b;

    /* JADX INFO: renamed from: c */
    public final Paint f7518c;

    /* JADX INFO: renamed from: d */
    public final int f7519d;

    /* JADX INFO: renamed from: e */
    public final int f7520e;

    /* JADX INFO: renamed from: f */
    public final int f7521f;

    /* JADX INFO: renamed from: g */
    public final Path f7522g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f7523h;

    public nr1() {
        Paint paint = new Paint();
        this.f7523h = paint;
        Paint paint2 = new Paint();
        this.f7516a = paint2;
        this.f7519d = AbstractC0539cq.m2115d(-16777216, 68);
        this.f7520e = AbstractC0539cq.m2115d(-16777216, 20);
        this.f7521f = AbstractC0539cq.m2115d(-16777216, 0);
        paint2.setColor(this.f7519d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f7517b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f7518c = new Paint(paint3);
    }
}
