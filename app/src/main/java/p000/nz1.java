package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f7593i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TextPaint f7594j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ o21 f7595k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ oz1 f7596l;

    public nz1(oz1 oz1Var, Context context, TextPaint textPaint, o21 o21Var) {
        this.f7596l = oz1Var;
        this.f7593i = context;
        this.f7594j = textPaint;
        this.f7595k = o21Var;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: b0 */
    public final void mo3456b0(int i) {
        this.f7595k.mo3456b0(i);
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: c0 */
    public final void mo3457c0(Typeface typeface, boolean z) {
        this.f7596l.m5094g(this.f7593i, this.f7594j, typeface);
        this.f7595k.mo3457c0(typeface, z);
    }
}
