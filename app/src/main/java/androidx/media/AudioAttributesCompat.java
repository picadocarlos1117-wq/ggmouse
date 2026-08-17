package androidx.media;

import android.util.SparseIntArray;
import p000.t52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements t52 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f775b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f776a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f776a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f776a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.f776a.hashCode();
    }

    public final String toString() {
        return this.f776a.toString();
    }
}
