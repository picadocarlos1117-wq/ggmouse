package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o80 extends ay0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0834kn f7685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(C0834kn c0834kn) {
        super(1);
        this.f7685d = c0834kn;
    }

    @Override // p000.ay0
    /* JADX INFO: renamed from: A */
    public final boolean mo762A(int i, int i2, Bundle bundle) {
        int i3;
        C0834kn c0834kn = this.f7685d;
        Chip chip = c0834kn.f5919i;
        if (i == -1) {
            WeakHashMap weakHashMap = i72.f4849a;
            return s62.m5989j(chip, i2, bundle);
        }
        if (i2 == 1) {
            return c0834kn.m3916o(i);
        }
        if (i2 == 2) {
            return c0834kn.m3911j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = c0834kn.f5918h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c0834kn.f5921k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                c0834kn.f5921k = Integer.MIN_VALUE;
                chip.invalidate();
                c0834kn.m3917p(i3, 65536);
            }
            c0834kn.f5921k = i;
            chip.invalidate();
            c0834kn.m3917p(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (c0834kn.f5921k != i) {
                return false;
            }
            c0834kn.f5921k = Integer.MIN_VALUE;
            chip.invalidate();
            c0834kn.m3917p(i, 65536);
            return true;
        }
        Chip chip2 = c0834kn.f5924n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2048m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f2059x) {
                    chip2.f2058w.m3917p(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.ay0
    /* JADX INFO: renamed from: q */
    public final C1539w2 mo781q(int i) {
        return new C1539w2(AccessibilityNodeInfo.obtain(this.f7685d.m3915n(i).f11909a));
    }

    @Override // p000.ay0
    /* JADX INFO: renamed from: s */
    public final C1539w2 mo783s(int i) {
        C0834kn c0834kn = this.f7685d;
        int i2 = i == 2 ? c0834kn.f5921k : c0834kn.f5922l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo781q(i2);
    }
}
