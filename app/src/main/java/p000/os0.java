package p000;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class os0 extends fs0 {

    /* JADX INFO: renamed from: b */
    public final boolean f8450b;

    /* JADX INFO: renamed from: c */
    public q90 f8451c;

    /* JADX INFO: renamed from: d */
    public es0 f8452d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f8453e;

    /* JADX INFO: renamed from: f */
    public int f8454f;

    /* JADX INFO: renamed from: g */
    public boolean f8455g;

    /* JADX INFO: renamed from: h */
    public boolean f8456h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8457i;

    /* JADX INFO: renamed from: j */
    public final MutableStateFlow f8458j;

    public os0(ms0 ms0Var) {
        this.f3891a = new AtomicReference(null);
        this.f8450b = true;
        this.f8451c = new q90();
        es0 es0Var = es0.f3434b;
        this.f8452d = es0Var;
        this.f8457i = new ArrayList();
        this.f8453e = new WeakReference(ms0Var);
        this.f8458j = StateFlowKt.MutableStateFlow(es0Var);
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: a */
    public final void mo2848a(ls0 ls0Var) {
        ks0 c1424sz;
        Object obj;
        ms0 ms0Var;
        ds0 ds0Var;
        m5052d("addObserver");
        es0 es0Var = this.f8452d;
        es0 es0Var2 = es0.f3433a;
        if (es0Var != es0Var2) {
            es0Var2 = es0.f3434b;
        }
        ns0 ns0Var = new ns0();
        HashMap map = ps0.f9126a;
        boolean z = ls0Var instanceof ks0;
        boolean z2 = ls0Var instanceof u50;
        Object obj2 = null;
        int i = 0;
        int i2 = 1;
        if (z && z2) {
            c1424sz = new C1424sz(i, (u50) ls0Var, (ks0) ls0Var);
        } else if (z2) {
            c1424sz = new C1424sz(i, (u50) ls0Var, obj2);
        } else if (z) {
            c1424sz = (ks0) ls0Var;
        } else {
            Class<?> cls = ls0Var.getClass();
            if (ps0.m5316b(cls) == 2) {
                Object obj3 = ps0.f9127b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    ps0.m5315a((Constructor) list.get(0), ls0Var);
                    throw null;
                }
                int size = list.size();
                yh0[] yh0VarArr = new yh0[size];
                if (size > 0) {
                    ps0.m5315a((Constructor) list.get(0), ls0Var);
                    throw null;
                }
                c1424sz = new aj1(yh0VarArr, i2);
            } else {
                c1424sz = new C1424sz(ls0Var);
            }
        }
        ns0Var.f7532b = c1424sz;
        ns0Var.f7531a = es0Var2;
        q90 q90Var = this.f8451c;
        qo1 qo1VarMo5457a = q90Var.mo5457a(ls0Var);
        if (qo1VarMo5457a != null) {
            obj = qo1VarMo5457a.f9551b;
        } else {
            HashMap map2 = q90Var.f9446e;
            qo1 qo1Var = new qo1(ls0Var, ns0Var);
            q90Var.f10916d++;
            qo1 qo1Var2 = q90Var.f10914b;
            if (qo1Var2 == null) {
                q90Var.f10913a = qo1Var;
                q90Var.f10914b = qo1Var;
            } else {
                qo1Var2.f9552c = qo1Var;
                qo1Var.f9553d = qo1Var2;
                q90Var.f10914b = qo1Var;
            }
            map2.put(ls0Var, qo1Var);
            obj = null;
        }
        if (((ns0) obj) == null && (ms0Var = (ms0) this.f8453e.get()) != null) {
            i = (this.f8454f != 0 || this.f8455g) ? 1 : 0;
            es0 es0VarM5051c = m5051c(ls0Var);
            this.f8454f++;
            while (ns0Var.f7531a.compareTo(es0VarM5051c) < 0 && this.f8451c.f9446e.containsKey(ls0Var)) {
                es0 es0Var3 = ns0Var.f7531a;
                ArrayList arrayList = this.f8457i;
                arrayList.add(es0Var3);
                bs0 bs0Var = ds0.Companion;
                es0 es0Var4 = ns0Var.f7531a;
                bs0Var.getClass();
                es0Var4.getClass();
                int iOrdinal = es0Var4.ordinal();
                if (iOrdinal == 1) {
                    ds0Var = ds0.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ds0Var = iOrdinal != 3 ? null : ds0.ON_RESUME;
                } else {
                    ds0Var = ds0.ON_START;
                }
                if (ds0Var == null) {
                    l41.m4050s(ns0Var.f7531a, "no event up from ");
                    return;
                } else {
                    ns0Var.m4595a(ms0Var, ds0Var);
                    arrayList.remove(arrayList.size() - 1);
                    es0VarM5051c = m5051c(ls0Var);
                }
            }
            if (i == 0) {
                m5055g();
            }
            this.f8454f--;
        }
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: b */
    public final void mo2849b(ls0 ls0Var) {
        ls0Var.getClass();
        m5052d("removeObserver");
        this.f8451c.mo5458b(ls0Var);
    }

    /* JADX INFO: renamed from: c */
    public final es0 m5051c(ls0 ls0Var) {
        ns0 ns0Var;
        HashMap map = this.f8451c.f9446e;
        qo1 qo1Var = map.containsKey(ls0Var) ? ((qo1) map.get(ls0Var)).f9553d : null;
        es0 es0Var = (qo1Var == null || (ns0Var = (ns0) qo1Var.f9551b) == null) ? null : ns0Var.f7531a;
        ArrayList arrayList = this.f8457i;
        es0 es0Var2 = arrayList.isEmpty() ? null : (es0) arrayList.get(arrayList.size() - 1);
        es0 es0Var3 = this.f8452d;
        es0Var3.getClass();
        if (es0Var == null || es0Var.compareTo(es0Var3) >= 0) {
            es0Var = es0Var3;
        }
        return (es0Var2 == null || es0Var2.compareTo(es0Var) >= 0) ? es0Var : es0Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m5052d(String str) {
        if (this.f8450b) {
            C1509v9.m6610U().f11588s.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(jd0.m3615m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5053e(ds0 ds0Var) {
        ds0Var.getClass();
        m5052d("handleLifecycleEvent");
        m5054f(ds0Var.m2383a());
    }

    /* JADX INFO: renamed from: f */
    public final void m5054f(es0 es0Var) {
        es0 es0Var2 = this.f8452d;
        if (es0Var2 == es0Var) {
            return;
        }
        es0 es0Var3 = es0.f3434b;
        es0 es0Var4 = es0.f3433a;
        if (es0Var2 == es0Var3 && es0Var == es0Var4) {
            StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
            sb.append(es0Var);
            sb.append(", but was ");
            sb.append(this.f8452d);
            Object obj = this.f8453e.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.f8452d = es0Var;
        if (this.f8455g || this.f8454f != 0) {
            this.f8456h = true;
            return;
        }
        this.f8455g = true;
        m5055g();
        this.f8455g = false;
        if (this.f8452d == es0Var4) {
            this.f8451c = new q90();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5055g() {
        ds0 ds0Var;
        ds0 ds0Var2;
        ms0 ms0Var = (ms0) this.f8453e.get();
        if (ms0Var == null) {
            f40.m2719o("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            q90 q90Var = this.f8451c;
            if (q90Var.f10916d != 0) {
                qo1 qo1Var = q90Var.f10913a;
                qo1Var.getClass();
                es0 es0Var = ((ns0) qo1Var.f9551b).f7531a;
                qo1 qo1Var2 = this.f8451c.f10914b;
                qo1Var2.getClass();
                es0 es0Var2 = ((ns0) qo1Var2.f9551b).f7531a;
                if (es0Var == es0Var2 && this.f8452d == es0Var2) {
                    break;
                }
                this.f8456h = false;
                es0 es0Var3 = this.f8452d;
                qo1 qo1Var3 = this.f8451c.f10913a;
                qo1Var3.getClass();
                int iCompareTo = es0Var3.compareTo(((ns0) qo1Var3.f9551b).f7531a);
                ArrayList arrayList = this.f8457i;
                if (iCompareTo < 0) {
                    q90 q90Var2 = this.f8451c;
                    po1 po1Var = new po1(q90Var2.f10914b, q90Var2.f10913a, 1);
                    q90Var2.f10915c.put(po1Var, Boolean.FALSE);
                    while (po1Var.hasNext() && !this.f8456h) {
                        Map.Entry entry = (Map.Entry) po1Var.next();
                        entry.getClass();
                        ls0 ls0Var = (ls0) entry.getKey();
                        ns0 ns0Var = (ns0) entry.getValue();
                        while (ns0Var.f7531a.compareTo(this.f8452d) > 0 && !this.f8456h && this.f8451c.f9446e.containsKey(ls0Var)) {
                            bs0 bs0Var = ds0.Companion;
                            es0 es0Var4 = ns0Var.f7531a;
                            bs0Var.getClass();
                            es0Var4.getClass();
                            int iOrdinal = es0Var4.ordinal();
                            if (iOrdinal == 2) {
                                ds0Var2 = ds0.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                ds0Var2 = iOrdinal != 4 ? null : ds0.ON_PAUSE;
                            } else {
                                ds0Var2 = ds0.ON_STOP;
                            }
                            if (ds0Var2 == null) {
                                l41.m4050s(ns0Var.f7531a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(ds0Var2.m2383a());
                                ns0Var.m4595a(ms0Var, ds0Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                qo1 qo1Var4 = this.f8451c.f10914b;
                if (!this.f8456h && qo1Var4 != null && this.f8452d.compareTo(((ns0) qo1Var4.f9551b).f7531a) > 0) {
                    q90 q90Var3 = this.f8451c;
                    q90Var3.getClass();
                    ro1 ro1Var = new ro1(q90Var3);
                    q90Var3.f10915c.put(ro1Var, Boolean.FALSE);
                    while (ro1Var.hasNext() && !this.f8456h) {
                        Map.Entry entry2 = (Map.Entry) ro1Var.next();
                        ls0 ls0Var2 = (ls0) entry2.getKey();
                        ns0 ns0Var2 = (ns0) entry2.getValue();
                        while (ns0Var2.f7531a.compareTo(this.f8452d) < 0 && !this.f8456h && this.f8451c.f9446e.containsKey(ls0Var2)) {
                            arrayList.add(ns0Var2.f7531a);
                            bs0 bs0Var2 = ds0.Companion;
                            es0 es0Var5 = ns0Var2.f7531a;
                            bs0Var2.getClass();
                            es0Var5.getClass();
                            int iOrdinal2 = es0Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                ds0Var = ds0.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                ds0Var = iOrdinal2 != 3 ? null : ds0.ON_RESUME;
                            } else {
                                ds0Var = ds0.ON_START;
                            }
                            if (ds0Var == null) {
                                l41.m4050s(ns0Var2.f7531a, "no event up from ");
                                return;
                            } else {
                                ns0Var2.m4595a(ms0Var, ds0Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f8456h = false;
        this.f8458j.setValue(this.f8452d);
    }
}
