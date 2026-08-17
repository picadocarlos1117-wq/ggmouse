package androidx.media;

import p000.r52;
import p000.t52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(r52 r52Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        t52 t52VarM5711h = audioAttributesCompat.f776a;
        if (r52Var.mo5708e(1)) {
            t52VarM5711h = r52Var.m5711h();
        }
        audioAttributesCompat.f776a = (AudioAttributesImpl) t52VarM5711h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, r52 r52Var) {
        r52Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f776a;
        r52Var.mo5712i(1);
        r52Var.m5715l(audioAttributesImpl);
    }
}
