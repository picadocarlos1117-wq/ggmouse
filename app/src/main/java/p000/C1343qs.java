package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343qs {

    /* JADX INFO: renamed from: a */
    public final float f9565a;

    /* JADX INFO: renamed from: b */
    public final float f9566b;

    /* JADX INFO: renamed from: c */
    public final float f9567c;

    /* JADX INFO: renamed from: d */
    public final float f9568d;

    /* JADX INFO: renamed from: e */
    public final int f9569e;

    public C1343qs(Context context, XmlResourceParser xmlResourceParser) {
        this.f9565a = Float.NaN;
        this.f9566b = Float.NaN;
        this.f9567c = Float.NaN;
        this.f9568d = Float.NaN;
        this.f9569e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), di1.f2947j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f9569e);
                this.f9569e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1602xs().m6953b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9568d = typedArrayObtainStyledAttributes.getDimension(index, this.f9568d);
            } else if (index == 2) {
                this.f9566b = typedArrayObtainStyledAttributes.getDimension(index, this.f9566b);
            } else if (index == 3) {
                this.f9567c = typedArrayObtainStyledAttributes.getDimension(index, this.f9567c);
            } else if (index == 4) {
                this.f9565a = typedArrayObtainStyledAttributes.getDimension(index, this.f9565a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
