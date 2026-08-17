package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x00 extends h22 {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f12394B = 0;

    /* JADX INFO: renamed from: A */
    public final SparseBooleanArray f12395A;

    /* JADX INFO: renamed from: s */
    public final boolean f12396s;

    /* JADX INFO: renamed from: t */
    public final boolean f12397t;

    /* JADX INFO: renamed from: u */
    public final boolean f12398u;

    /* JADX INFO: renamed from: v */
    public final boolean f12399v;

    /* JADX INFO: renamed from: w */
    public final boolean f12400w;

    /* JADX INFO: renamed from: x */
    public final boolean f12401x;

    /* JADX INFO: renamed from: y */
    public final boolean f12402y;

    /* JADX INFO: renamed from: z */
    public final SparseArray f12403z;

    static {
        new x00(new w00());
        z42.m7252z(1000);
        z42.m7252z(1001);
        z42.m7252z(1002);
        z42.m7252z(1003);
        AbstractC1308pu.m5349p(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 1006, 1007, 1008);
        AbstractC1308pu.m5349p(1009, 1010, 1011, 1012, 1013);
        AbstractC1308pu.m5349p(1014, 1015, 1016, 1017, 1018);
    }

    public x00(w00 w00Var) {
        super(w00Var);
        this.f12396s = w00Var.f11881s;
        this.f12397t = w00Var.f11882t;
        this.f12398u = w00Var.f11883u;
        this.f12399v = w00Var.f11884v;
        this.f12400w = w00Var.f11885w;
        this.f12401x = w00Var.f11886x;
        this.f12402y = w00Var.f11887y;
        this.f12403z = w00Var.f11888z;
        this.f12395A = w00Var.f11880A;
    }

    @Override // p000.h22
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x00.class == obj.getClass()) {
            x00 x00Var = (x00) obj;
            if (super.equals(x00Var) && this.f12396s == x00Var.f12396s && this.f12397t == x00Var.f12397t && this.f12398u == x00Var.f12398u && this.f12399v == x00Var.f12399v && this.f12400w == x00Var.f12400w && this.f12401x == x00Var.f12401x && this.f12402y == x00Var.f12402y) {
                SparseBooleanArray sparseBooleanArray = x00Var.f12395A;
                SparseBooleanArray sparseBooleanArray2 = this.f12395A;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = x00Var.f12403z;
                    SparseArray sparseArray2 = this.f12403z;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        z12 z12Var = (z12) entry.getKey();
                                        if (map2.containsKey(z12Var)) {
                                            Object value = entry.getValue();
                                            Object obj2 = map2.get(z12Var);
                                            int i3 = z42.f13274a;
                                            if (!Objects.equals(value, obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.h22
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f12396s ? 1 : 0)) * 961) + (this.f12397t ? 1 : 0)) * 961) + (this.f12398u ? 1 : 0)) * 28629151) + (this.f12399v ? 1 : 0)) * 31) + (this.f12400w ? 1 : 0)) * 31) + (this.f12401x ? 1 : 0)) * 961) + (this.f12402y ? 1 : 0)) * 31;
    }
}
