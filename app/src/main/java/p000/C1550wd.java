package p000;

import com.google.android.gms.internal.play_billing.zzji;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1550wd {

    /* JADX INFO: renamed from: a */
    public final Object f12066a;

    public C1550wd(zzji zzjiVar) {
        if (zzjiVar != null) {
            this.f12066a = zzjiVar;
        } else {
            l41.m4051t("Null payload");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1550wd) && this.f12066a.equals(((C1550wd) obj).f12066a)) {
            Object obj2 = cg1.f1791a;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12066a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ cg1.f1791a.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f12066a + ", priority=" + cg1.f1791a + "}";
    }
}
