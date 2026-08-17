package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711he {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0711he.class != obj.getClass()) {
            return false;
        }
        return Float.compare(TouchPipeline.SIZE, TouchPipeline.SIZE) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(TouchPipeline.SIZE) + 16337;
    }
}
