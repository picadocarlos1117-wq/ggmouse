package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: renamed from: km */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0833km extends Property {

    /* JADX INFO: renamed from: a */
    public Rect f5899a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        Rect rect = this.f5899a;
        ((Drawable) obj).copyBounds(rect);
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f5899a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
