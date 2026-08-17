package p000;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jz0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5613b;

    public /* synthetic */ jz0(Object obj, int i) {
        this.f5612a = i;
        this.f5613b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5612a;
        Object obj3 = this.f5613b;
        switch (i) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                int iCompareTo = Boolean.valueOf(materialButton.f2025t).compareTo(Boolean.valueOf(materialButton2.f2025t));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                pu0 pu0Var = (pu0) obj3;
                int iM5361n = pu0Var.m5361n(obj) - pu0Var.m5361n(obj2);
                return iM5361n != 0 ? iM5361n : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }
}
