package androidx.fragment.app;

import android.view.View;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import p000.AbstractC1308pu;
import p000.C1112ml;
import p000.InterfaceC1075ll;
import p000.pn0;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0061y {

    /* JADX INFO: renamed from: a */
    public int f767a;

    /* JADX INFO: renamed from: b */
    public int f768b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0048l f769c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f770d;

    /* JADX INFO: renamed from: e */
    public final HashSet f771e;

    /* JADX INFO: renamed from: f */
    public boolean f772f;

    /* JADX INFO: renamed from: g */
    public boolean f773g;

    /* JADX INFO: renamed from: h */
    public final C0059w f774h;

    public C0061y(int i, int i2, C0059w c0059w, C1112ml c1112ml) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
        this.f770d = new ArrayList();
        this.f771e = new HashSet();
        this.f772f = false;
        this.f773g = false;
        this.f767a = i;
        this.f768b = i2;
        this.f769c = abstractComponentCallbacksC0048l;
        c1112ml.m4429a(new pn0(this));
        this.f774h = c0059w;
    }

    /* JADX INFO: renamed from: a */
    public final void m440a() {
        HashSet hashSet = this.f771e;
        if (this.f772f) {
            return;
        }
        this.f772f = true;
        if (hashSet.isEmpty()) {
            m441b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1112ml c1112ml = (C1112ml) obj;
            synchronized (c1112ml) {
                try {
                    if (!c1112ml.f7033a) {
                        c1112ml.f7033a = true;
                        c1112ml.f7035c = true;
                        InterfaceC1075ll interfaceC1075ll = c1112ml.f7034b;
                        if (interfaceC1075ll != null) {
                            try {
                                interfaceC1075ll.onCancel();
                            } catch (Throwable th) {
                                synchronized (c1112ml) {
                                    c1112ml.f7035c = false;
                                    c1112ml.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c1112ml) {
                            c1112ml.f7035c = false;
                            c1112ml.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m441b() {
        if (!this.f773g) {
            if (AbstractC0056t.m363G(2)) {
                toString();
            }
            this.f773g = true;
            ArrayList arrayList = this.f770d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f774h.m427i();
    }

    /* JADX INFO: renamed from: c */
    public final void m442c(int i, int i2) {
        int iM5359z = AbstractC1308pu.m5359z(i2);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f769c;
        if (iM5359z == 0) {
            if (this.f767a != 1) {
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString(abstractComponentCallbacksC0048l);
                }
                this.f767a = i;
                return;
            }
            return;
        }
        if (iM5359z != 1) {
            if (iM5359z != 2) {
                return;
            }
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(abstractComponentCallbacksC0048l);
            }
            this.f767a = 1;
            this.f768b = 3;
            return;
        }
        if (this.f767a == 1) {
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(abstractComponentCallbacksC0048l);
            }
            this.f767a = 2;
            this.f768b = 2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m443d() {
        int i = this.f768b;
        C0059w c0059w = this.f774h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
                View viewRequireView = abstractComponentCallbacksC0048l.requireView();
                if (AbstractC0056t.m363G(2)) {
                    Objects.toString(viewRequireView.findFocus());
                    viewRequireView.toString();
                    abstractComponentCallbacksC0048l.toString();
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = c0059w.f760c;
        View viewFindFocus = abstractComponentCallbacksC0048l2.mView.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0048l2.setFocusedView(viewFindFocus);
            if (AbstractC0056t.m363G(2)) {
                viewFindFocus.toString();
                abstractComponentCallbacksC0048l2.toString();
            }
        }
        View viewRequireView2 = this.f769c.requireView();
        if (viewRequireView2.getParent() == null) {
            c0059w.m419a();
            viewRequireView2.setAlpha(TouchPipeline.SIZE);
        }
        if (viewRequireView2.getAlpha() == TouchPipeline.SIZE && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(abstractComponentCallbacksC0048l2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.f767a;
        String str2 = "null";
        if (i == 1) {
            str = "REMOVED";
        } else if (i == 2) {
            str = "VISIBLE";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVISIBLE";
        } else {
            str = "GONE";
        }
        sb.append(str);
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.f768b;
        if (i2 == 1) {
            str2 = "NONE";
        } else if (i2 == 2) {
            str2 = "ADDING";
        } else if (i2 == 3) {
            str2 = "REMOVING";
        }
        sb.append(str2);
        sb.append("} {mFragment = ");
        sb.append(this.f769c);
        sb.append("}");
        return sb.toString();
    }
}
