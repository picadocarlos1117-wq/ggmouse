package androidx.media;

import android.media.AudioAttributes;
import p000.r52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(r52 r52Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f777a = (AudioAttributes) r52Var.m5710g(audioAttributesImplApi21.f777a, 1);
        audioAttributesImplApi21.f778b = r52Var.m5709f(audioAttributesImplApi21.f778b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, r52 r52Var) {
        r52Var.getClass();
        r52Var.m5714k(audioAttributesImplApi21.f777a, 1);
        r52Var.m5713j(audioAttributesImplApi21.f778b, 2);
    }
}
