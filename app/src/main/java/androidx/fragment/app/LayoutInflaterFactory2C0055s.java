package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p000.cf0;
import p000.f40;
import p000.gi1;
import p000.jd0;
import p000.lf0;
import p000.mf0;
import p000.nf0;
import p000.xe0;

/* JADX INFO: renamed from: androidx.fragment.app.s */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0055s implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0056t f698a;

    public LayoutInflaterFactory2C0055s(AbstractC0056t abstractC0056t) {
        this.f698a = abstractC0056t;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0059w c0059wM394f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC0056t abstractC0056t = this.f698a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC0056t);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gi1.f4198a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0048l.class.isAssignableFrom(cf0.m1211a(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM366A = resourceId != -1 ? abstractC0056t.m366A(resourceId) : null;
                    if (abstractComponentCallbacksC0048lM366A == null && string != null) {
                        abstractComponentCallbacksC0048lM366A = abstractC0056t.m367B(string);
                    }
                    if (abstractComponentCallbacksC0048lM366A == null && id != -1) {
                        abstractComponentCallbacksC0048lM366A = abstractC0056t.m366A(id);
                    }
                    if (abstractComponentCallbacksC0048lM366A == null) {
                        cf0 cf0VarM370E = abstractC0056t.m370E();
                        context.getClassLoader();
                        abstractComponentCallbacksC0048lM366A = AbstractComponentCallbacksC0048l.instantiate(cf0VarM370E.f1781a.f731t.f12589b, attributeValue, null);
                        abstractComponentCallbacksC0048lM366A.mFromLayout = true;
                        abstractComponentCallbacksC0048lM366A.mFragmentId = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0048lM366A.mContainerId = id;
                        abstractComponentCallbacksC0048lM366A.mTag = string;
                        abstractComponentCallbacksC0048lM366A.mInLayout = true;
                        abstractComponentCallbacksC0048lM366A.mFragmentManager = abstractC0056t;
                        xe0 xe0Var = abstractC0056t.f731t;
                        abstractComponentCallbacksC0048lM366A.mHost = xe0Var;
                        abstractComponentCallbacksC0048lM366A.onInflate((Context) xe0Var.f12589b, attributeSet, abstractComponentCallbacksC0048lM366A.mSavedFragmentState);
                        c0059wM394f = abstractC0056t.m389a(abstractComponentCallbacksC0048lM366A);
                        if (AbstractC0056t.m363G(2)) {
                            abstractComponentCallbacksC0048lM366A.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (abstractComponentCallbacksC0048lM366A.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0048lM366A.mInLayout = true;
                        abstractComponentCallbacksC0048lM366A.mFragmentManager = abstractC0056t;
                        xe0 xe0Var2 = abstractC0056t.f731t;
                        abstractComponentCallbacksC0048lM366A.mHost = xe0Var2;
                        abstractComponentCallbacksC0048lM366A.onInflate((Context) xe0Var2.f12589b, attributeSet, abstractComponentCallbacksC0048lM366A.mSavedFragmentState);
                        c0059wM394f = abstractC0056t.m394f(abstractComponentCallbacksC0048lM366A);
                        if (AbstractC0056t.m363G(2)) {
                            abstractComponentCallbacksC0048lM366A.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    mf0 mf0Var = nf0.f7396a;
                    nf0.m4540b(new lf0(abstractComponentCallbacksC0048lM366A, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0048lM366A + " to container " + viewGroup));
                    nf0.m4539a(abstractComponentCallbacksC0048lM366A).getClass();
                    abstractComponentCallbacksC0048lM366A.mContainer = viewGroup;
                    c0059wM394f.m427i();
                    c0059wM394f.m426h();
                    View view2 = abstractComponentCallbacksC0048lM366A.mView;
                    if (view2 == null) {
                        f40.m2719o(jd0.m3615m("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0048lM366A.mView.getTag() == null) {
                        abstractComponentCallbacksC0048lM366A.mView.setTag(string);
                    }
                    abstractComponentCallbacksC0048lM366A.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0054r(this, c0059wM394f));
                    return abstractComponentCallbacksC0048lM366A.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
