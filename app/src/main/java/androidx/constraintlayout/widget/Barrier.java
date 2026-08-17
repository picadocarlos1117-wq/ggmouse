package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import p000.AbstractC1156ns;
import p000.C1553wg;
import p000.C1639ys;
import p000.di1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends AbstractC1156ns {

    /* JADX INFO: renamed from: m */
    public int f558m;

    /* JADX INFO: renamed from: n */
    public int f559n;

    /* JADX INFO: renamed from: o */
    public C1553wg f560o;

    public Barrier(Context context) {
        super(context);
        this.f7524a = new int[32];
        this.f7530g = new HashMap();
        this.f7526c = context;
        mo280g(null);
        super.setVisibility(8);
    }

    @Override // p000.AbstractC1156ns
    /* JADX INFO: renamed from: g */
    public final void mo280g(AttributeSet attributeSet) {
        super.mo280g(attributeSet);
        C1553wg c1553wg = new C1553wg();
        c1553wg.f12128s0 = 0;
        c1553wg.f12129t0 = true;
        c1553wg.f12130u0 = 0;
        c1553wg.f12131v0 = false;
        this.f560o = c1553wg;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, di1.f2939b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f560o.f12129t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f560o.f12130u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7527d = this.f560o;
        m4594i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f560o.f12129t0;
    }

    public int getMargin() {
        return this.f560o.f12130u0;
    }

    public int getType() {
        return this.f558m;
    }

    @Override // p000.AbstractC1156ns
    /* JADX INFO: renamed from: h */
    public final void mo281h(C1639ys c1639ys, boolean z) {
        int i = this.f558m;
        this.f559n = i;
        if (z) {
            if (i == 5) {
                this.f559n = 1;
            } else if (i == 6) {
                this.f559n = 0;
            }
        } else if (i == 5) {
            this.f559n = 0;
        } else if (i == 6) {
            this.f559n = 1;
        }
        if (c1639ys instanceof C1553wg) {
            ((C1553wg) c1639ys).f12128s0 = this.f559n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f560o.f12129t0 = z;
    }

    public void setDpMargin(int i) {
        this.f560o.f12130u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f560o.f12130u0 = i;
    }

    public void setType(int i) {
        this.f558m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
