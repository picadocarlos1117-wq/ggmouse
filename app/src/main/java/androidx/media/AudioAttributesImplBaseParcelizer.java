package androidx.media;

import p000.r52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(r52 r52Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f779a = 0;
        audioAttributesImplBase.f780b = 0;
        audioAttributesImplBase.f781c = 0;
        audioAttributesImplBase.f782d = -1;
        audioAttributesImplBase.f779a = r52Var.m5709f(0, 1);
        audioAttributesImplBase.f780b = r52Var.m5709f(audioAttributesImplBase.f780b, 2);
        audioAttributesImplBase.f781c = r52Var.m5709f(audioAttributesImplBase.f781c, 3);
        audioAttributesImplBase.f782d = r52Var.m5709f(audioAttributesImplBase.f782d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, r52 r52Var) {
        r52Var.getClass();
        r52Var.m5713j(audioAttributesImplBase.f779a, 1);
        r52Var.m5713j(audioAttributesImplBase.f780b, 2);
        r52Var.m5713j(audioAttributesImplBase.f781c, 3);
        r52Var.m5713j(audioAttributesImplBase.f782d, 4);
    }
}
