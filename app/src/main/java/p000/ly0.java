package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ly0 extends ai0 implements z41 {
    /* JADX INFO: renamed from: c */
    public final boolean m4327c(String str) {
        str.getClass();
        return ((ny0) this.instance).m4626i().containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m4328d(Map map) {
        copyOnWrite();
        ny0.m4622f((ny0) this.instance).putAll(map);
    }

    /* JADX INFO: renamed from: e */
    public final void m4329e(e52 e52Var, String str) {
        str.getClass();
        e52Var.getClass();
        copyOnWrite();
        ny0.m4622f((ny0) this.instance).put(str, e52Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m4330f(String str) {
        copyOnWrite();
        ny0.m4622f((ny0) this.instance).remove(str);
    }
}
