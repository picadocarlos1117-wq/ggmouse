package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756in extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5107i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5108j;

    public /* synthetic */ C0756in(Object obj, int i) {
        this.f5107i = i;
        this.f5108j = obj;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: b0 */
    public final void mo3456b0(int i) {
        switch (this.f5107i) {
            case 0:
                break;
            default:
                qz1 qz1Var = (qz1) this.f5108j;
                qz1Var.f9636d = true;
                C1077ln c1077ln = (C1077ln) qz1Var.f9637e.get();
                if (c1077ln != null) {
                    c1077ln.m4254u();
                    c1077ln.invalidateSelf();
                }
                break;
        }
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: c0 */
    public final void mo3457c0(Typeface typeface, boolean z) {
        int i = this.f5107i;
        Object obj = this.f5108j;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                C1077ln c1077ln = chip.f2045e;
                chip.setText(c1077ln.f6405H0 ? c1077ln.f6408J : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    qz1 qz1Var = (qz1) obj;
                    qz1Var.f9636d = true;
                    C1077ln c1077ln2 = (C1077ln) qz1Var.f9637e.get();
                    if (c1077ln2 != null) {
                        c1077ln2.m4254u();
                        c1077ln2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m3455C0(int i) {
    }
}
