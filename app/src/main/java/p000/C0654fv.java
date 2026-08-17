package p000;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes3.dex */
public final class C0654fv extends Permission {

    /* JADX INFO: renamed from: a */
    public final HashSet f3900a;

    public C0654fv(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f3900a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0654fv) && this.f3900a.equals(((C0654fv) obj).f3900a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.f3900a.toString();
    }

    public final int hashCode() {
        return this.f3900a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C0654fv)) {
            return false;
        }
        C0654fv c0654fv = (C0654fv) permission;
        return getName().equals(c0654fv.getName()) || this.f3900a.containsAll(c0654fv.f3900a);
    }
}
