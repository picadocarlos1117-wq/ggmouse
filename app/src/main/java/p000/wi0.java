package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 extends View {

    /* JADX INFO: renamed from: a */
    public boolean f12186a;

    public wi0(Context context) {
        super(context);
        this.f12186a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f12186a = z;
    }

    public void setGuidelineBegin(int i) {
        C1306ps c1306ps = (C1306ps) getLayoutParams();
        if (this.f12186a && c1306ps.f9084a == i) {
            return;
        }
        c1306ps.f9084a = i;
        setLayoutParams(c1306ps);
    }

    public void setGuidelineEnd(int i) {
        C1306ps c1306ps = (C1306ps) getLayoutParams();
        if (this.f12186a && c1306ps.f9086b == i) {
            return;
        }
        c1306ps.f9086b = i;
        setLayoutParams(c1306ps);
    }

    public void setGuidelinePercent(float f) {
        C1306ps c1306ps = (C1306ps) getLayoutParams();
        if (this.f12186a && c1306ps.f9088c == f) {
            return;
        }
        c1306ps.f9088c = f;
        setLayoutParams(c1306ps);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
