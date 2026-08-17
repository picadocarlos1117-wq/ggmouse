package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: is */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0765is {

    /* JADX INFO: renamed from: a */
    public volatile Object f5142a;

    /* JADX INFO: renamed from: b */
    public Object f5143b;

    /* JADX INFO: renamed from: a */
    public InterfaceC1487uo m3481a(yc1 yc1Var) {
        lu0 lu0Var = ((ox0) this.f5143b).f8522G;
        if (((ox0) this.f5143b).f8530O.get()) {
            return ((ox0) this.f5143b).f8528M;
        }
        if (lu0Var == null) {
            ((ox0) this.f5143b).f8565u.execute(new RunnableC1621ya(this, 16));
            return ((ox0) this.f5143b).f8528M;
        }
        InterfaceC1487uo interfaceC1487uoM6634f = vi0.m6634f(lu0Var.mo200a(yc1Var), Boolean.TRUE.equals(yc1Var.f12951a.f263f));
        return interfaceC1487uoM6634f != null ? interfaceC1487uoM6634f : ((ox0) this.f5143b).f8528M;
    }

    /* JADX INFO: renamed from: b */
    public void m3482b(EnumC0651fs enumC0651fs) {
        p32.m5188s(enumC0651fs, "newState");
        if (((EnumC0651fs) this.f5142a) == enumC0651fs || ((EnumC0651fs) this.f5142a) == EnumC0651fs.f3889e) {
            return;
        }
        this.f5142a = enumC0651fs;
        if (((ArrayList) this.f5143b).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5143b;
        this.f5143b = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0725hs c0725hs = (C0725hs) obj;
            c0725hs.f4692b.execute(c0725hs.f4691a);
        }
    }
}
