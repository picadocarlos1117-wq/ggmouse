package p000;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1545w8 extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12020h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12021i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WeakReference f12022j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0127c9 f12023k;

    public C1545w8(C0127c9 c0127c9, int i, int i2, WeakReference weakReference) {
        this.f12023k = c0127c9;
        this.f12020h = i;
        this.f12021i = i2;
        this.f12022j = weakReference;
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: N */
    public final void mo4488N(Typeface typeface) {
        int i = this.f12020h;
        if (i != -1) {
            typeface = AbstractC0091b9.m947a(typeface, i, (this.f12021i & 2) != 0);
        }
        C0127c9 c0127c9 = this.f12023k;
        if (c0127c9.f1718m) {
            c0127c9.f1717l = typeface;
            TextView textView = (TextView) this.f12022j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i72.f4849a;
                boolean zM6586b = v62.m6586b(textView);
                int i2 = c0127c9.f1715j;
                if (zM6586b) {
                    textView.post(new RunnableC1582x8(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: M */
    public final void mo4487M(int i) {
    }
}
