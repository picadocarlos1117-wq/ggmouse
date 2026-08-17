package p000;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qt0 {
    /* JADX INFO: renamed from: a */
    public static boolean m5607a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m5608b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
