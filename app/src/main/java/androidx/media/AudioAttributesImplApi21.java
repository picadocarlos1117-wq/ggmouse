package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f777a;

    /* JADX INFO: renamed from: b */
    public int f778b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f777a.equals(((AudioAttributesImplApi21) obj).f777a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f777a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f777a;
    }
}
