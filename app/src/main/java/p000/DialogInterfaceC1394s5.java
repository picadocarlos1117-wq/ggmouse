package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC1394s5 extends AbstractDialogC1433t7 implements DialogInterface {

    /* JADX INFO: renamed from: a */
    public final C1320q5 f10235a;

    public DialogInterfaceC1394s5(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m5978b(contextThemeWrapper, i));
        this.f10235a = new C1320q5(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: b */
    public static int m5978b(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.AbstractDialogC1433t7, p000.DialogC0650fr, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C1320q5 c1320q5 = this.f10235a;
        c1320q5.f9365b.setContentView(c1320q5.f9389z);
        Context context = c1320q5.f9364a;
        Window window = c1320q5.f9366c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c1320q5.f9370g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !C1320q5.m5445a(view)) {
            window.setFlags(OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING, OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c1320q5.f9371h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c1320q5.f9369f != null) {
                ((LinearLayout.LayoutParams) ((rs0) viewGroup.getLayoutParams())).weight = TouchPipeline.SIZE;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM5446b = C1320q5.m5446b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM5446b2 = C1320q5.m5446b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM5446b3 = C1320q5.m5446b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1320q5.f9381r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1320q5.f9381r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM5446b2.findViewById(android.R.id.message);
        c1320q5.f9385v = textView;
        if (textView != null) {
            String str = c1320q5.f9368e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c1320q5.f9381r.removeView(c1320q5.f9385v);
                if (c1320q5.f9369f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1320q5.f9381r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c1320q5.f9381r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c1320q5.f9369f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM5446b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM5446b3.findViewById(android.R.id.button1);
        c1320q5.f9372i = button;
        ViewOnClickListenerC1407si viewOnClickListenerC1407si = c1320q5.f9363F;
        button.setOnClickListener(viewOnClickListenerC1407si);
        boolean zIsEmpty = TextUtils.isEmpty(c1320q5.f9373j);
        Button button2 = c1320q5.f9372i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(c1320q5.f9373j);
            c1320q5.f9372i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM5446b3.findViewById(android.R.id.button2);
        c1320q5.f9375l = button3;
        button3.setOnClickListener(viewOnClickListenerC1407si);
        boolean zIsEmpty2 = TextUtils.isEmpty(c1320q5.f9376m);
        Button button4 = c1320q5.f9375l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(c1320q5.f9376m);
            c1320q5.f9375l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM5446b3.findViewById(android.R.id.button3);
        c1320q5.f9378o = button5;
        button5.setOnClickListener(viewOnClickListenerC1407si);
        boolean zIsEmpty3 = TextUtils.isEmpty(c1320q5.f9379p);
        Button button6 = c1320q5.f9378o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(c1320q5.f9379p);
            c1320q5.f9378o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c1320q5.f9372i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c1320q5.f9375l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c1320q5.f9378o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM5446b3.setVisibility(8);
        }
        if (c1320q5.f9386w != null) {
            viewGroupM5446b.addView(c1320q5.f9386w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1320q5.f9383t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1320q5.f9367d) || !c1320q5.f9361D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1320q5.f9383t.setVisibility(8);
                viewGroupM5446b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1320q5.f9384u = textView2;
                textView2.setText(c1320q5.f9367d);
                Drawable drawable = c1320q5.f9382s;
                if (drawable != null) {
                    c1320q5.f9383t.setImageDrawable(drawable);
                } else {
                    c1320q5.f9384u.setPadding(c1320q5.f9383t.getPaddingLeft(), c1320q5.f9383t.getPaddingTop(), c1320q5.f9383t.getPaddingRight(), c1320q5.f9383t.getPaddingBottom());
                    c1320q5.f9383t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM5446b == null || viewGroupM5446b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM5446b3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM5446b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c1320q5.f9381r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c1320q5.f9368e == null && c1320q5.f9369f == null) ? null : viewGroupM5446b.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM5446b2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1320q5.f9369f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f338a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f339b);
        }
        if (!z2) {
            View view2 = c1320q5.f9369f;
            if (view2 == null) {
                view2 = c1320q5.f9381r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = i72.f4849a;
                z62.m7257d(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM5446b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM5446b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c1320q5.f9369f;
        if (alertController$RecycleListView2 == null || (listAdapter = c1320q5.f9387x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c1320q5.f9388y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10235a.f9381r;
        if (nestedScrollView == null || !nestedScrollView.m313j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10235a.f9381r;
        if (nestedScrollView == null || !nestedScrollView.m313j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.AbstractDialogC1433t7, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C1320q5 c1320q5 = this.f10235a;
        c1320q5.f9367d = charSequence;
        TextView textView = c1320q5.f9384u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
