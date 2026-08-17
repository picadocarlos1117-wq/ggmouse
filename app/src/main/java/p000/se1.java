package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ we1 f10396b;

    public /* synthetic */ se1(we1 we1Var, int i) {
        this.f10395a = i;
        this.f10396b = we1Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[LOOP:3: B:37:0x00af->B:39:0x00b5, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10395a;
        we1 we1Var = this.f10396b;
        switch (i) {
            case 0:
                we1Var.m6772k();
                break;
            case 1:
                View view = we1Var.f12103j;
                ViewGroup viewGroup = we1Var.f12098e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(we1Var.f12091A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = we1Var.f12094a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (we1Var.f12091A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof q00) {
                        q00 q00Var = (q00) view;
                        Rect rect = q00Var.f9267a;
                        ValueAnimator valueAnimator = q00Var.f9256J;
                        if (we1Var.f12091A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            q00Var.f9258L = true;
                            q00Var.f9257K = TouchPipeline.SIZE;
                            q00Var.invalidate(rect);
                        } else {
                            int i2 = we1Var.f12119z;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                q00Var.f9258L = false;
                                q00Var.f9257K = TouchPipeline.SIZE;
                                q00Var.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                q00Var.f9258L = false;
                                q00Var.f9257K = 1.0f;
                                q00Var.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = we1Var.f12118y;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    View view2 = (View) obj;
                    view2.setVisibility((we1Var.f12091A && we1.m6764j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = we1Var.f12111r;
                View view3 = we1Var.f12104k;
                re1 re1Var = we1Var.f12094a;
                ViewGroup viewGroup2 = we1Var.f12100g;
                ViewGroup viewGroup3 = we1Var.f12099f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (re1Var.getWidth() - re1Var.getPaddingLeft()) - re1Var.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iM6762c = we1.m6762c(we1Var.f12102i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        iM6762c += we1.m6762c(viewGroup3.getChildAt(i4));
                    }
                    if (iM6762c > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iM6762c += we1.m6762c(view3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < childCount2; i5++) {
                            View childAt2 = viewGroup3.getChildAt(i5);
                            iM6762c -= we1.m6762c(childAt2);
                            arrayList2.add(childAt2);
                            if (iM6762c <= width) {
                                if (!arrayList2.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList2.size());
                                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                        viewGroup2.addView((View) arrayList2.get(i6), viewGroup2.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList2.isEmpty()) {
                            viewGroup3.removeViews(0, arrayList2.size());
                            while (i6 < arrayList2.size()) {
                                viewGroup2.addView((View) arrayList2.get(i6), viewGroup2.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup4 = we1Var.f12101h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            we1Var.f12110q.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    }
                }
                break;
            case 3:
                we1Var.f12107n.start();
                break;
            case 4:
                we1Var.f12106m.start();
                break;
            case 5:
                we1Var.f12105l.start();
                we1Var.m6767e(we1Var.f12114u, 2000L);
                break;
            default:
                we1Var.m6771i(2);
                break;
        }
    }
}
