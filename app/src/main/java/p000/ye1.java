package p000;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 {

    /* JADX INFO: renamed from: a */
    public final String f12969a;

    /* JADX INFO: renamed from: b */
    public final xe1 f12970b;

    /* JADX INFO: renamed from: c */
    public final Object f12971c;

    static {
        if (z42.f13274a < 31) {
            new ye1("");
        } else {
            new ye1(xe1.f12592b, "");
        }
    }

    public ye1(String str) {
        ki0.m3864h(z42.f13274a < 31);
        this.f12969a = str;
        this.f12970b = null;
        this.f12971c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye1)) {
            return false;
        }
        ye1 ye1Var = (ye1) obj;
        return Objects.equals(this.f12969a, ye1Var.f12969a) && this.f12970b == ye1Var.f12970b && Objects.equals(this.f12971c, ye1Var.f12971c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12969a, this.f12970b, this.f12971c);
    }

    public ye1(LogSessionId logSessionId, String str) {
        this(new xe1(logSessionId), str);
    }

    public ye1(xe1 xe1Var, String str) {
        this.f12970b = xe1Var;
        this.f12969a = str;
        this.f12971c = new Object();
    }
}
