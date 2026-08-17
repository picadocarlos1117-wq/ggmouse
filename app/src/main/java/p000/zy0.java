package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy0 {

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator f13608a;

    /* JADX INFO: renamed from: b */
    public final View f13609b;

    /* JADX INFO: renamed from: c */
    public final int f13610c;

    /* JADX INFO: renamed from: d */
    public final int f13611d;

    /* JADX INFO: renamed from: e */
    public final int f13612e;

    /* JADX INFO: renamed from: f */
    public C1368rg f13613f;

    public zy0(View view) {
        this.f13609b = view;
        Context context = view.getContext();
        this.f13608a = rc2.m5792k0(context, R.attr.motionEasingStandardDecelerateInterpolator, hc1.m3127b(TouchPipeline.SIZE, TouchPipeline.SIZE, TouchPipeline.SIZE, 1.0f));
        this.f13610c = rc2.m5790j0(context, R.attr.motionDurationMedium2, 300);
        this.f13611d = rc2.m5790j0(context, R.attr.motionDurationShort3, 150);
        this.f13612e = rc2.m5790j0(context, R.attr.motionDurationShort2, 100);
    }
}
