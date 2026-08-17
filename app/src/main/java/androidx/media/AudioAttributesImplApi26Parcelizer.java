package androidx.media;

import android.media.AudioAttributes;
import p000.r52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(r52 r52Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f777a = (AudioAttributes) r52Var.m5710g(audioAttributesImplApi26.f777a, 1);
        audioAttributesImplApi26.f778b = r52Var.m5709f(audioAttributesImplApi26.f778b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, r52 r52Var) {
        r52Var.getClass();
        r52Var.m5714k(audioAttributesImplApi26.f777a, 1);
        r52Var.m5713j(audioAttributesImplApi26.f778b, 2);
    }
}
