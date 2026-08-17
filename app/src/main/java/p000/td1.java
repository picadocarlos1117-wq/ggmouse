package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 {

    /* JADX INFO: renamed from: d */
    public static final td1 f10843d = new td1(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f10844a;

    /* JADX INFO: renamed from: b */
    public final float f10845b;

    /* JADX INFO: renamed from: c */
    public final int f10846c;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
    }

    public td1(float f, float f2) {
        ki0.m3857c(f > TouchPipeline.SIZE);
        ki0.m3857c(f2 > TouchPipeline.SIZE);
        this.f10844a = f;
        this.f10845b = f2;
        this.f10846c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && td1.class == obj.getClass()) {
            td1 td1Var = (td1) obj;
            if (this.f10844a == td1Var.f10844a && this.f10845b == td1Var.f10845b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10845b) + ((Float.floatToRawIntBits(this.f10844a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f10844a), Float.valueOf(this.f10845b)};
        int i = z42.f13274a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
