package p000;

import android.graphics.RectF;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0123c5 implements InterfaceC1271ou {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1271ou f1666a;

    /* JADX INFO: renamed from: b */
    public final float f1667b;

    public C0123c5(float f, InterfaceC1271ou interfaceC1271ou) {
        while (interfaceC1271ou instanceof C0123c5) {
            interfaceC1271ou = ((C0123c5) interfaceC1271ou).f1666a;
            f += ((C0123c5) interfaceC1271ou).f1667b;
        }
        this.f1666a = interfaceC1271ou;
        this.f1667b = f;
    }

    @Override // p000.InterfaceC1271ou
    /* JADX INFO: renamed from: a */
    public final float mo1128a(RectF rectF) {
        return Math.max(TouchPipeline.SIZE, this.f1666a.mo1128a(rectF) + this.f1667b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0123c5)) {
            return false;
        }
        C0123c5 c0123c5 = (C0123c5) obj;
        return this.f1666a.equals(c0123c5.f1666a) && this.f1667b == c0123c5.f1667b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1666a, Float.valueOf(this.f1667b)});
    }
}
