package p000;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1613y2 {
    /* JADX INFO: renamed from: a */
    public static int m6989a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    /* JADX INFO: renamed from: b */
    public static int m6990b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    /* JADX INFO: renamed from: c */
    public static void m6991c(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m6992d(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
