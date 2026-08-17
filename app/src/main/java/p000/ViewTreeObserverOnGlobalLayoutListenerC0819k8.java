package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0819k8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5694b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0819k8(Object obj, int i) {
        this.f5693a = i;
        this.f5694b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f5693a;
        Object obj = this.f5694b;
        switch (i) {
            case 0:
                C1508v8 c1508v8 = (C1508v8) obj;
                if (!c1508v8.getInternalPopup().mo4719b()) {
                    c1508v8.f11582f.mo4728o(AbstractC1099m8.m4407b(c1508v8), AbstractC1099m8.m4406a(c1508v8));
                }
                ViewTreeObserver viewTreeObserver = c1508v8.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC1062l8.m4075a(viewTreeObserver, this);
                }
                break;
            case 1:
                C1397s8 c1397s8 = (C1397s8) obj;
                C1508v8 c1508v9 = c1397s8.f10282L;
                WeakHashMap weakHashMap = i72.f4849a;
                if (v62.m6586b(c1508v9) && c1508v9.getGlobalVisibleRect(c1397s8.f10280J)) {
                    c1397s8.m6003s();
                    c1397s8.mo3059g();
                } else {
                    c1397s8.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC1484ul viewOnKeyListenerC1484ul = (ViewOnKeyListenerC1484ul) obj;
                ArrayList arrayList = viewOnKeyListenerC1484ul.f11337m;
                if (viewOnKeyListenerC1484ul.mo3058b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((C1447tl) arrayList.get(0)).f10901a.f8469D) {
                        View view = viewOnKeyListenerC1484ul.f11344t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((C1447tl) obj2).f10901a.mo3059g();
                            }
                        } else {
                            viewOnKeyListenerC1484ul.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                gv1 gv1Var = (gv1) obj;
                e41 e41Var = gv1Var.f4342m;
                if (gv1Var.mo3058b() && !e41Var.f8469D) {
                    View view2 = gv1Var.f4347r;
                    if (view2 != null && view2.isShown()) {
                        e41Var.mo3059g();
                    } else {
                        gv1Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
