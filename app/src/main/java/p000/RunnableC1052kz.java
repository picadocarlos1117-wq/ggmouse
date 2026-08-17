package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC0068g;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: renamed from: kz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1052kz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6111a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f6112b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1350qz f6113c;

    public /* synthetic */ RunnableC1052kz(C1350qz c1350qz, ArrayList arrayList, int i) {
        this.f6111a = i;
        this.f6113c = c1350qz;
        this.f6112b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.f6111a;
        int i2 = 0;
        ArrayList arrayList = this.f6112b;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    C1350qz c1350qz = this.f6113c;
                    if (i2 >= size) {
                        arrayList.clear();
                        c1350qz.f9616m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        C1313pz c1313pz = (C1313pz) obj;
                        AbstractC0068g abstractC0068g = c1313pz.f9233a;
                        int i3 = c1313pz.f9234b;
                        int i4 = c1313pz.f9235c;
                        int i5 = c1313pz.f9236d;
                        int i6 = c1313pz.f9237e;
                        c1350qz.getClass();
                        View view = abstractC0068g.itemView;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(TouchPipeline.SIZE);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(TouchPipeline.SIZE);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1350qz.f9619p.add(abstractC0068g);
                        viewPropertyAnimatorAnimate.setDuration(c1350qz.f980e).setListener(new C1126mz(c1350qz, abstractC0068g, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    C1350qz c1350qz2 = this.f6113c;
                    if (i2 >= size2) {
                        arrayList.clear();
                        c1350qz2.f9617n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        C1276oz c1276oz = (C1276oz) obj2;
                        ArrayList arrayList2 = c1350qz2.f9621r;
                        long j = c1350qz2.f981f;
                        AbstractC0068g abstractC0068g2 = c1276oz.f8583a;
                        View view2 = abstractC0068g2 == null ? null : abstractC0068g2.itemView;
                        AbstractC0068g abstractC0068g3 = c1276oz.f8584b;
                        View view3 = abstractC0068g3 != null ? abstractC0068g3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(c1276oz.f8583a);
                            duration.translationX(c1276oz.f8587e - c1276oz.f8585c);
                            duration.translationY(c1276oz.f8588f - c1276oz.f8586d);
                            duration.alpha(TouchPipeline.SIZE).setListener(new C1163nz(c1350qz2, c1276oz, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(c1276oz.f8584b);
                            c = 0;
                            viewPropertyAnimatorAnimate2.translationX(TouchPipeline.SIZE).translationY(TouchPipeline.SIZE).setDuration(j).alpha(1.0f).setListener(new C1163nz(c1350qz2, c1276oz, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
                break;
            default:
                int size3 = arrayList.size();
                while (true) {
                    C1350qz c1350qz3 = this.f6113c;
                    if (i2 >= size3) {
                        arrayList.clear();
                        c1350qz3.f9615l.remove(arrayList);
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        AbstractC0068g abstractC0068g4 = (AbstractC0068g) obj3;
                        c1350qz3.getClass();
                        View view4 = abstractC0068g4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1350qz3.f9618o.add(abstractC0068g4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1350qz3.f978c).setListener(new C1089lz(c1350qz3, abstractC0068g4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
