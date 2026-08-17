package p000;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 extends AbstractC1463u0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qo0 f12358a;

    public wy0(qo0 qo0Var) {
        this.f12358a = qo0Var;
    }

    @Override // p000.AbstractC1463u0
    /* JADX INFO: renamed from: a */
    public final int mo6170a() {
        return ((Matcher) this.f12358a.f9548b).groupCount() + 1;
    }

    @Override // p000.AbstractC1463u0, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.f12358a.f9548b).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC1463u0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC1463u0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
