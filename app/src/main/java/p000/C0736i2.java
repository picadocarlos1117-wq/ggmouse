package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736i2 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f4775a;

    /* JADX INFO: renamed from: b */
    public final C1539w2 f4776b;

    /* JADX INFO: renamed from: c */
    public final int f4777c;

    public C0736i2(int i, C1539w2 c1539w2, int i2) {
        this.f4775a = i;
        this.f4776b = c1539w2;
        this.f4777c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4775a);
        this.f4776b.f11909a.performAction(this.f4777c, bundle);
    }
}
