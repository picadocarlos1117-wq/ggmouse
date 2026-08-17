package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements vj0, jp1, w72 {

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0048l f1787a;

    /* JADX INFO: renamed from: b */
    public final v72 f1788b;

    /* JADX INFO: renamed from: c */
    public os0 f1789c = null;

    /* JADX INFO: renamed from: d */
    public ip1 f1790d = null;

    public cg0(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, v72 v72Var) {
        this.f1787a = abstractComponentCallbacksC0048l;
        this.f1788b = v72Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1214a(ds0 ds0Var) {
        this.f1789c.m5053e(ds0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m1215b() {
        if (this.f1789c == null) {
            this.f1789c = new os0(this);
            ip1 ip1Var = new ip1(this);
            this.f1790d = ip1Var;
            ip1Var.m3471a();
        }
    }

    @Override // p000.vj0
    public final AbstractC0076av getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f1787a;
        Context applicationContext = abstractComponentCallbacksC0048l.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        a71 a71Var = new a71();
        LinkedHashMap linkedHashMap = a71Var.f1067a;
        if (application != null) {
            linkedHashMap.put(t72.f10798e, application);
        }
        linkedHashMap.put(hp0.f4651o, abstractComponentCallbacksC0048l);
        linkedHashMap.put(hp0.f4652p, this);
        if (abstractComponentCallbacksC0048l.getArguments() != null) {
            linkedHashMap.put(hp0.f4653q, abstractComponentCallbacksC0048l.getArguments());
        }
        return a71Var;
    }

    @Override // p000.ms0
    public final fs0 getLifecycle() {
        m1215b();
        return this.f1789c;
    }

    @Override // p000.jp1
    public final hp1 getSavedStateRegistry() {
        m1215b();
        return this.f1790d.f5128b;
    }

    @Override // p000.w72
    public final v72 getViewModelStore() {
        m1215b();
        return this.f1788b;
    }
}
