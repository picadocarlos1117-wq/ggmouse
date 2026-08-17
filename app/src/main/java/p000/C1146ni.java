package p000;

import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ni */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1146ni implements f41 {

    /* JADX INFO: renamed from: a */
    public boolean f7410a;

    /* JADX INFO: renamed from: b */
    public final Object f7411b;

    public C1146ni() {
        this.f7411b = new SparseBooleanArray();
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public void mo766a(i31 i31Var, boolean z) {
        C1540w3 c1540w3;
        o12 o12Var = (o12) this.f7411b;
        if (this.f7410a) {
            return;
        }
        this.f7410a = true;
        ActionMenuView actionMenuView = o12Var.f7611a.f9293a.f519a;
        if (actionMenuView != null && (c1540w3 = actionMenuView.f437y) != null) {
            c1540w3.m6695g();
            C1392s3 c1392s3 = c1540w3.f11958y;
            if (c1392s3 != null && c1392s3.m7188b()) {
                c1392s3.f13262i.dismiss();
            }
        }
        o12Var.f7612b.onPanelClosed(108, i31Var);
        this.f7410a = false;
    }

    /* JADX INFO: renamed from: b */
    public void m4550b(int i) {
        ki0.m3864h(!this.f7410a);
        ((SparseBooleanArray) this.f7411b).append(i, true);
    }

    /* JADX INFO: renamed from: c */
    public eb0 m4551c() {
        ki0.m3864h(!this.f7410a);
        this.f7410a = true;
        return new eb0((SparseBooleanArray) this.f7411b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4552d() {
        return this.f7410a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX INFO: renamed from: e */
    public boolean m4553e(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            l41.m4049r();
            return false;
        }
        if (((k50) this.f7411b) == null) {
            return m4552d();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C1146ni c1146ni = pz1.f9241a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return m4552d();
        }
        return false;
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: r */
    public boolean mo782r(i31 i31Var) {
        ((o12) this.f7411b).f7612b.onMenuOpened(108, i31Var);
        return true;
    }

    public /* synthetic */ C1146ni(Object obj) {
        this.f7411b = obj;
    }

    public C1146ni(k50 k50Var, boolean z) {
        this(k50Var);
        this.f7410a = z;
    }

    public C1146ni(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f7411b = bottomSheetBehavior;
        this.f7410a = z;
    }
}
