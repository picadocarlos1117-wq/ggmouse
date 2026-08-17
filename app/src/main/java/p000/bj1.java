package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC0065d;
import androidx.recyclerview.widget.AbstractC0068g;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f1390b;

    public /* synthetic */ bj1(RecyclerView recyclerView, int i) {
        this.f1389a = i;
        this.f1390b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f1389a;
        RecyclerView recyclerView = this.f1390b;
        switch (i) {
            case 0:
                if (recyclerView.f945z && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f941x) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.f877C) {
                        recyclerView.m593n();
                    } else {
                        recyclerView.f875B = true;
                    }
                    break;
                }
                break;
            default:
                AbstractC0065d abstractC0065d = recyclerView.f893Q;
                if (abstractC0065d != null) {
                    C1350qz c1350qz = (C1350qz) abstractC0065d;
                    long j = c1350qz.f979d;
                    ArrayList arrayList = c1350qz.f9611h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1350qz.f9613j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1350qz.f9614k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1350qz.f9612i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            AbstractC0068g abstractC0068g = (AbstractC0068g) obj;
                            View view = abstractC0068g.itemView;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c1350qz.f9620q.add(abstractC0068g);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(TouchPipeline.SIZE).setListener(new C1089lz(c1350qz, abstractC0068g, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList5;
                            zIsEmpty = zIsEmpty;
                            zIsEmpty2 = zIsEmpty2;
                        }
                        boolean z2 = zIsEmpty;
                        boolean z3 = zIsEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            c1350qz.f9616m.add(arrayList6);
                            arrayList2.clear();
                            RunnableC1052kz runnableC1052kz = new RunnableC1052kz(c1350qz, arrayList6, 0);
                            if (z2) {
                                runnableC1052kz.run();
                            } else {
                                View view2 = ((C1313pz) arrayList6.get(0)).f9233a.itemView;
                                WeakHashMap weakHashMap = i72.f4849a;
                                s62.m5993n(view2, runnableC1052kz, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            c1350qz.f9617n.add(arrayList7);
                            arrayList3.clear();
                            RunnableC1052kz runnableC1052kz2 = new RunnableC1052kz(c1350qz, arrayList7, 1);
                            if (z2) {
                                runnableC1052kz2.run();
                            } else {
                                View view3 = ((C1276oz) arrayList7.get(0)).f8583a.itemView;
                                WeakHashMap weakHashMap2 = i72.f4849a;
                                s62.m5993n(view3, runnableC1052kz2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            c1350qz.f9615l.add(arrayList8);
                            arrayList4.clear();
                            RunnableC1052kz runnableC1052kz3 = new RunnableC1052kz(c1350qz, arrayList8, 2);
                            if (z2 && z3 && zIsEmpty3) {
                                runnableC1052kz3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!z3 ? c1350qz.f980e : 0L, zIsEmpty3 ? 0L : c1350qz.f981f) + j;
                                z = false;
                                View view4 = ((AbstractC0068g) arrayList8.get(0)).itemView;
                                WeakHashMap weakHashMap3 = i72.f4849a;
                                s62.m5993n(view4, runnableC1052kz3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.f930r0 = z;
                break;
        }
    }
}
