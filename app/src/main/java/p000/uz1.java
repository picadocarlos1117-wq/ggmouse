package p000;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextInputLayout f11462b;

    public /* synthetic */ uz1(TextInputLayout textInputLayout, int i) {
        this.f11461a = i;
        this.f11462b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11461a;
        TextInputLayout textInputLayout = this.f11462b;
        switch (i) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f2150c.f11997g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.f2152d.requestLayout();
                break;
        }
    }
}
