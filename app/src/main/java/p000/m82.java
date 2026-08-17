package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m82 extends AbstractC1156ns {

    /* JADX INFO: renamed from: m */
    public boolean f6712m;

    /* JADX INFO: renamed from: n */
    public boolean f6713n;

    @Override // p000.AbstractC1156ns
    /* JADX INFO: renamed from: e */
    public final void mo4410e(ConstraintLayout constraintLayout) {
        m4592d(constraintLayout);
    }

    @Override // p000.AbstractC1156ns
    /* JADX INFO: renamed from: g */
    public void mo280g(AttributeSet attributeSet) {
        super.mo280g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, di1.f2939b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f6712m = true;
                } else if (index == 22) {
                    this.f6713n = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo282j(id0 id0Var, int i, int i2);

    @Override // p000.AbstractC1156ns, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6712m || this.f6713n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f7525b; i++) {
                    View view = (View) constraintLayout.f562a.get(this.f7524a[i]);
                    if (view != null) {
                        if (this.f6712m) {
                            view.setVisibility(visibility);
                        }
                        if (this.f6713n && elevation > TouchPipeline.SIZE) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4592d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4592d((ConstraintLayout) parent);
    }
}
