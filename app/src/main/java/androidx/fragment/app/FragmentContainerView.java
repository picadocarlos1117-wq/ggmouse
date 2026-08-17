package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.C0694gy;
import p000.bb2;
import p000.ca0;
import p000.cf0;
import p000.f40;
import p000.gi1;
import p000.i72;
import p000.jd0;
import p000.w62;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f653a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f654b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f655c;

    /* JADX INFO: renamed from: d */
    public boolean f656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0056t abstractC0056t) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f653a = new ArrayList();
        this.f654b = new ArrayList();
        this.f656d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gi1.f4199b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM366A = abstractC0056t.m366A(id);
        if (classAttribute != null && abstractComponentCallbacksC0048lM366A == null) {
            if (id == -1) {
                f40.m2719o(jd0.m3615m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            cf0 cf0VarM370E = abstractC0056t.m370E();
            context.getClassLoader();
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lInstantiate = AbstractComponentCallbacksC0048l.instantiate(cf0VarM370E.f1781a.f731t.f12589b, classAttribute, null);
            abstractComponentCallbacksC0048lInstantiate.getClass();
            abstractComponentCallbacksC0048lInstantiate.onInflate(context, attributeSet, (Bundle) null);
            C0037a c0037a = new C0037a(abstractC0056t);
            c0037a.f8887o = true;
            abstractComponentCallbacksC0048lInstantiate.mContainer = this;
            c0037a.mo331c(getId(), abstractComponentCallbacksC0048lInstantiate, string, 1);
            if (c0037a.f8879g) {
                f40.m2719o("This transaction is already being added to the back stack");
                throw null;
            }
            c0037a.f657p.m413y(c0037a, true);
        }
        ArrayList arrayListM435d = abstractC0056t.f714c.m435d();
        int size = arrayListM435d.size();
        while (i < size) {
            Object obj = arrayListM435d.get(i);
            i++;
            C0059w c0059w = (C0059w) obj;
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
            if (abstractComponentCallbacksC0048l.mContainerId == getId() && (view = abstractComponentCallbacksC0048l.mView) != null && view.getParent() == null) {
                abstractComponentCallbacksC0048l.mContainer = this;
                c0059w.m419a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m329a(View view) {
        if (this.f654b.contains(view)) {
            this.f653a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0048l ? (AbstractComponentCallbacksC0048l) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        bb2 bb2VarM960g;
        windowInsets.getClass();
        bb2 bb2VarM960g2 = bb2.m960g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f655c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            bb2VarM960g = bb2.m960g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = i72.f4849a;
            WindowInsets windowInsetsM965f = bb2VarM960g2.m965f();
            if (windowInsetsM965f != null) {
                WindowInsets windowInsetsM6725b = w62.m6725b(this, windowInsetsM965f);
                if (!windowInsetsM6725b.equals(windowInsetsM965f)) {
                    bb2VarM960g2 = bb2.m960g(this, windowInsetsM6725b);
                }
            }
            bb2VarM960g = bb2VarM960g2;
        }
        if (!bb2VarM960g.f1285a.mo6262m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = i72.f4849a;
                WindowInsets windowInsetsM965f2 = bb2VarM960g.m965f();
                if (windowInsetsM965f2 != null) {
                    WindowInsets windowInsetsM6724a = w62.m6724a(childAt, windowInsetsM965f2);
                    if (!windowInsetsM6724a.equals(windowInsetsM965f2)) {
                        bb2.m960g(childAt, windowInsetsM6724a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f656d) {
            ArrayList arrayList = this.f653a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f656d) {
            ArrayList arrayList = this.f653a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f654b.remove(view);
        if (this.f653a.remove(view)) {
            this.f656d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0048l> F getFragment() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l;
        AbstractActivityC0053q abstractActivityC0053q;
        AbstractC0056t supportFragmentManager;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC0048l = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0048l = tag instanceof AbstractComponentCallbacksC0048l ? (AbstractComponentCallbacksC0048l) tag : null;
            if (abstractComponentCallbacksC0048l != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0048l == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC0053q = null;
                    break;
                }
                if (context instanceof AbstractActivityC0053q) {
                    abstractActivityC0053q = (AbstractActivityC0053q) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0053q == null) {
                C0694gy.m3080f("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            supportFragmentManager = abstractActivityC0053q.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0048l.isAdded()) {
                ca0.m1188t("The Fragment ", abstractComponentCallbacksC0048l, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            supportFragmentManager = abstractComponentCallbacksC0048l.getChildFragmentManager();
        }
        return (F) supportFragmentManager.m366A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                m329a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m329a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m329a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m329a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m329a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m329a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f656d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.f655c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f654b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.f653a = new ArrayList();
        this.f654b = new ArrayList();
        this.f656d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gi1.f4199b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
