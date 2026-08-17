package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: ns */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1156ns extends View {

    /* JADX INFO: renamed from: a */
    public int[] f7524a;

    /* JADX INFO: renamed from: b */
    public int f7525b;

    /* JADX INFO: renamed from: c */
    public Context f7526c;

    /* JADX INFO: renamed from: d */
    public hk0 f7527d;

    /* JADX INFO: renamed from: e */
    public String f7528e;

    /* JADX INFO: renamed from: f */
    public String f7529f;

    /* JADX INFO: renamed from: g */
    public HashMap f7530g;

    public AbstractC1156ns(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7524a = new int[32];
        this.f7530g = new HashMap();
        this.f7526c = context;
        mo280g(attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX INFO: renamed from: a */
    public final void m4589a(String str) {
        int identifier;
        HashMap map;
        Context context = this.f7526c;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f574r) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f574r.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m4593f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = bi1.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f7530g.put(Integer.valueOf(identifier), strTrim);
            m4590b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4590b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f7525b + 1;
        int[] iArr = this.f7524a;
        if (i2 > iArr.length) {
            this.f7524a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f7524a;
        int i3 = this.f7525b;
        iArr2[i3] = i;
        this.f7525b = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m4591c(String str) {
        if (str.length() == 0 || this.f7526c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1306ps) && strTrim.equals(((C1306ps) layoutParams).f9082Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m4590b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4592d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f7525b; i++) {
            View view = (View) constraintLayout.f562a.get(this.f7524a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > TouchPipeline.SIZE) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m4593f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f7526c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo280g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, di1.f2939b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7528e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f7529f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f7524a, this.f7525b);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo281h(C1639ys c1639ys, boolean z);

    /* JADX INFO: renamed from: i */
    public final void m4594i() {
        if (this.f7527d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1306ps) {
            ((C1306ps) layoutParams).f9115p0 = this.f7527d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f7528e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f7529f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f7528e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7525b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4589a(str.substring(i));
                return;
            } else {
                m4589a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f7529f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7525b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4591c(str.substring(i));
                return;
            } else {
                m4591c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f7528e = null;
        this.f7525b = 0;
        for (int i : iArr) {
            m4590b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f7528e == null) {
            m4590b(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo4410e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
