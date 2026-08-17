package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0667g7 implements ha1, InterfaceC0726ht, f41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C1359r7 f4091b;

    public /* synthetic */ C0667g7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, int i) {
        this.f4090a = i;
        this.f4091b = layoutInflaterFactory2C1359r7;
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public void mo766a(i31 i31Var, boolean z) {
        C1322q7 c1322q7;
        int i = this.f4090a;
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f4091b;
        switch (i) {
            case 2:
                layoutInflaterFactory2C1359r7.m5732r(i31Var);
                break;
            default:
                i31 i31VarMo3348k = i31Var.mo3348k();
                int i2 = 0;
                boolean z2 = i31VarMo3348k != i31Var;
                if (z2) {
                    i31Var = i31VarMo3348k;
                }
                C1322q7[] c1322q7Arr = layoutInflaterFactory2C1359r7.f9769Q;
                int length = c1322q7Arr != null ? c1322q7Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c1322q7 = null;
                    } else {
                        c1322q7 = c1322q7Arr[i2];
                        if (c1322q7 == null || c1322q7.f9419h != i31Var) {
                            i2++;
                        }
                    }
                }
                if (c1322q7 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C1359r7.m5733s(c1322q7, z);
                    } else {
                        layoutInflaterFactory2C1359r7.m5731q(c1322q7.f9412a, c1322q7, i31VarMo3348k);
                        layoutInflaterFactory2C1359r7.m5733s(c1322q7, true);
                    }
                }
                break;
        }
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: r */
    public boolean mo782r(i31 i31Var) {
        Window.Callback callback;
        int i = this.f4090a;
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f4091b;
        switch (i) {
            case 2:
                Window.Callback callback2 = layoutInflaterFactory2C1359r7.f9793q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, i31Var);
                }
                break;
            default:
                if (i31Var == i31Var.mo3348k() && layoutInflaterFactory2C1359r7.f9763K && (callback = layoutInflaterFactory2C1359r7.f9793q.getCallback()) != null && !layoutInflaterFactory2C1359r7.f9774V) {
                    callback.onMenuOpened(108, i31Var);
                }
                break;
        }
        return true;
    }

    @Override // p000.ha1
    /* JADX INFO: renamed from: v */
    public bb2 mo786v(View view, bb2 bb2Var) {
        boolean z;
        ra2 pa2Var;
        boolean z2;
        bb2 bb2VarMo4787b = bb2Var;
        int iM964d = bb2VarMo4787b.m964d();
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f4091b;
        Context context = layoutInflaterFactory2C1359r7.f9792p;
        int iM964d2 = bb2VarMo4787b.m964d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1359r7.f9753A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1359r7.f9753A.getLayoutParams();
            boolean z3 = true;
            if (layoutInflaterFactory2C1359r7.f9753A.isShown()) {
                if (layoutInflaterFactory2C1359r7.f9786h0 == null) {
                    layoutInflaterFactory2C1359r7.f9786h0 = new Rect();
                    layoutInflaterFactory2C1359r7.f9787i0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1359r7.f9786h0;
                Rect rect2 = layoutInflaterFactory2C1359r7.f9787i0;
                rect.set(bb2VarMo4787b.m962b(), bb2VarMo4787b.m964d(), bb2VarMo4787b.m963c(), bb2VarMo4787b.m961a());
                ViewGroup viewGroup = layoutInflaterFactory2C1359r7.f9758F;
                Method method = h82.f4474a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C1359r7.f9758F;
                WeakHashMap weakHashMap = i72.f4849a;
                bb2 bb2VarM7254a = z62.m7254a(viewGroup2);
                int iM962b = bb2VarM7254a == null ? 0 : bb2VarM7254a.m962b();
                int iM963c = bb2VarM7254a == null ? 0 : bb2VarM7254a.m963c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C1359r7.f9760H != null) {
                    View view2 = layoutInflaterFactory2C1359r7.f9760H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM962b || marginLayoutParams2.rightMargin != iM963c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM962b;
                            marginLayoutParams2.rightMargin = iM963c;
                            layoutInflaterFactory2C1359r7.f9760H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C1359r7.f9760H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM962b;
                    layoutParams.rightMargin = iM963c;
                    layoutInflaterFactory2C1359r7.f9758F.addView(layoutInflaterFactory2C1359r7.f9760H, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C1359r7.f9760H;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C1359r7.f9760H;
                    view5.setBackgroundColor((s62.m5986g(view5) & PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE) != 0 ? AbstractC0075au.getColor(context, R.color.abc_decor_view_status_guard_light) : AbstractC0075au.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C1359r7.f9765M && z3) {
                    iM964d2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                layoutInflaterFactory2C1359r7.f9753A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C1359r7.f9760H;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM964d != iM964d2) {
            int iM962b2 = bb2VarMo4787b.m962b();
            int iM963c2 = bb2VarMo4787b.m963c();
            int iM961a = bb2VarMo4787b.m961a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                pa2Var = new qa2(bb2VarMo4787b);
            } else {
                pa2Var = i6 >= 29 ? new pa2(bb2VarMo4787b) : new oa2(bb2VarMo4787b);
            }
            pa2Var.mo4789g(un0.m6514b(iM962b2, iM964d2, iM963c2, iM961a));
            bb2VarMo4787b = pa2Var.mo4787b();
        }
        WeakHashMap weakHashMap2 = i72.f4849a;
        WindowInsets windowInsetsM965f = bb2VarMo4787b.m965f();
        if (windowInsetsM965f == null) {
            return bb2VarMo4787b;
        }
        WindowInsets windowInsetsM6725b = w62.m6725b(view, windowInsetsM965f);
        return !windowInsetsM6725b.equals(windowInsetsM965f) ? bb2.m960g(view, windowInsetsM6725b) : bb2VarMo4787b;
    }
}
