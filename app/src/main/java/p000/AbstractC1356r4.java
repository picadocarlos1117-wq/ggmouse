package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1356r4 {

    /* JADX INFO: renamed from: a */
    public final HashMap f9709a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f9710b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f9711c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList f9712d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient HashMap f9713e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f9714f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f9715g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m5688a(int i, int i2, Intent intent) {
        InterfaceC0777j4 interfaceC0777j4;
        String str = (String) this.f9709a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1282p4 c1282p4 = (C1282p4) this.f9713e.get(str);
        if (c1282p4 == null || (interfaceC0777j4 = c1282p4.f8698a) == null || !this.f9712d.contains(str)) {
            this.f9714f.remove(str);
            this.f9715g.putParcelable(str, new C0738i4(i2, intent));
            return true;
        }
        interfaceC0777j4.onActivityResult(c1282p4.f8699b.mo3771c(i2, intent));
        this.f9712d.remove(str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo5689b(int i, AbstractC0815k4 abstractC0815k4, Object obj);

    /* JADX INFO: renamed from: c */
    public final C1169o4 m5690c(String str, AbstractC0815k4 abstractC0815k4, InterfaceC0777j4 interfaceC0777j4) {
        m5692e(str);
        this.f9713e.put(str, new C1282p4(abstractC0815k4, interfaceC0777j4));
        HashMap map = this.f9714f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0777j4.onActivityResult(obj);
        }
        Bundle bundle = this.f9715g;
        C0738i4 c0738i4 = (C0738i4) bundle.getParcelable(str);
        if (c0738i4 != null) {
            bundle.remove(str);
            interfaceC0777j4.onActivityResult(abstractC0815k4.mo3771c(c0738i4.f4811a, c0738i4.f4812b));
        }
        return new C1169o4(this, str, abstractC0815k4, 1);
    }

    /* JADX INFO: renamed from: d */
    public final C1169o4 m5691d(String str, ms0 ms0Var, AbstractC0815k4 abstractC0815k4, InterfaceC0777j4 interfaceC0777j4) {
        fs0 lifecycle = ms0Var.getLifecycle();
        if (((os0) lifecycle).f8452d.compareTo(es0.f3436d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(ms0Var);
            es0 es0Var = ((os0) lifecycle).f8452d;
            sb.append(" is attempting to register while current state is ");
            sb.append(es0Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        m5692e(str);
        HashMap map = this.f9711c;
        C1319q4 c1319q4 = (C1319q4) map.get(str);
        if (c1319q4 == null) {
            c1319q4 = new C1319q4(lifecycle);
        }
        C1132n4 c1132n4 = new C1132n4(this, str, interfaceC0777j4, abstractC0815k4);
        c1319q4.f9324a.mo2848a(c1132n4);
        c1319q4.f9325b.add(c1132n4);
        map.put(str, c1319q4);
        return new C1169o4(this, str, abstractC0815k4, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m5692e(String str) {
        HashMap map = this.f9710b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iMo5100e = ri1.f10057b.mo5100e(2147418112);
        while (true) {
            int i = iMo5100e + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f9709a;
            if (!map2.containsKey(numValueOf)) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
            iMo5100e = ri1.f10057b.mo5100e(2147418112);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5693f(String str) {
        Integer num;
        if (!this.f9712d.contains(str) && (num = (Integer) this.f9710b.remove(str)) != null) {
            this.f9709a.remove(num);
        }
        this.f9713e.remove(str);
        HashMap map = this.f9714f;
        if (map.containsKey(str)) {
            StringBuilder sbM5347n = AbstractC1308pu.m5347n("Dropping pending result for request ", str, ": ");
            sbM5347n.append(map.get(str));
            Log.w("ActivityResultRegistry", sbM5347n.toString());
            map.remove(str);
        }
        Bundle bundle = this.f9715g;
        if (bundle.containsKey(str)) {
            StringBuilder sbM5347n2 = AbstractC1308pu.m5347n("Dropping pending result for request ", str, ": ");
            sbM5347n2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbM5347n2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f9711c;
        C1319q4 c1319q4 = (C1319q4) map2.get(str);
        if (c1319q4 != null) {
            ArrayList arrayList = c1319q4.f9325b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c1319q4.f9324a.mo2849b((ks0) obj);
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
