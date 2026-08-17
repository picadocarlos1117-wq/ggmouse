package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 {

    /* JADX INFO: renamed from: b */
    public boolean f4656b;

    /* JADX INFO: renamed from: c */
    public Bundle f4657c;

    /* JADX INFO: renamed from: d */
    public boolean f4658d;

    /* JADX INFO: renamed from: e */
    public C1395s6 f4659e;

    /* JADX INFO: renamed from: a */
    public final to1 f4655a = new to1();

    /* JADX INFO: renamed from: f */
    public boolean f4660f = true;

    /* JADX INFO: renamed from: a */
    public final Bundle m3233a(String str) {
        if (!this.f4658d) {
            f40.m2719o("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.f4657c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f4657c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4657c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f4657c = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: b */
    public final gp1 m3234b() {
        String str;
        gp1 gp1Var;
        Iterator it = this.f4655a.iterator();
        do {
            po1 po1Var = (po1) it;
            if (!po1Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) po1Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            gp1Var = (gp1) entry.getValue();
        } while (!hp0.m3214e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return gp1Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m3235c(String str, gp1 gp1Var) {
        Object obj;
        gp1Var.getClass();
        to1 to1Var = this.f4655a;
        qo1 qo1VarMo5457a = to1Var.mo5457a(str);
        if (qo1VarMo5457a != null) {
            obj = qo1VarMo5457a.f9551b;
        } else {
            qo1 qo1Var = new qo1(str, gp1Var);
            to1Var.f10916d++;
            qo1 qo1Var2 = to1Var.f10914b;
            if (qo1Var2 == null) {
                to1Var.f10913a = qo1Var;
                to1Var.f10914b = qo1Var;
            } else {
                qo1Var2.f9552c = qo1Var;
                qo1Var.f9553d = qo1Var2;
                to1Var.f10914b = qo1Var;
            }
            obj = null;
        }
        if (((gp1) obj) == null) {
            return;
        }
        f40.m2713i("SavedStateProvider with the given key is already registered");
    }

    /* JADX INFO: renamed from: d */
    public final void m3236d() {
        if (!this.f4660f) {
            f40.m2719o("Can not perform this action after onSaveInstanceState");
            return;
        }
        C1395s6 c1395s6 = this.f4659e;
        if (c1395s6 == null) {
            c1395s6 = new C1395s6(this);
        }
        this.f4659e = c1395s6;
        try {
            as0.class.getDeclaredConstructor(null);
            C1395s6 c1395s7 = this.f4659e;
            if (c1395s7 != null) {
                ((LinkedHashSet) c1395s7.f10247b).add(as0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + as0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
