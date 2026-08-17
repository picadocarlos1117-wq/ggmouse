package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f12123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f12124c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f12125d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f12126e;

    public wf0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f12122a = i;
        this.f12123b = arrayList;
        this.f12124c = arrayList2;
        this.f12125d = arrayList3;
        this.f12126e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f12122a; i++) {
            View view = (View) this.f12123b.get(i);
            String str = (String) this.f12124c.get(i);
            WeakHashMap weakHashMap = i72.f4849a;
            y62.m7021v(view, str);
            y62.m7021v((View) this.f12125d.get(i), (String) this.f12126e.get(i));
        }
    }
}
