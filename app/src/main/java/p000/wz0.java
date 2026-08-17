package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;
import com.google.android.material.internal.CheckableImageButton;
import com.sousasantoslogic.sspro.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0<S> extends DialogInterfaceOnCancelListenerC0043g {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f12367a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f12368b;

    /* JADX INFO: renamed from: c */
    public int f12369c;

    /* JADX INFO: renamed from: d */
    public zc1 f12370d;

    /* JADX INFO: renamed from: e */
    public C1409sk f12371e;

    /* JADX INFO: renamed from: f */
    public qz0 f12372f;

    /* JADX INFO: renamed from: g */
    public int f12373g;

    /* JADX INFO: renamed from: m */
    public CharSequence f12374m;

    /* JADX INFO: renamed from: n */
    public boolean f12375n;

    /* JADX INFO: renamed from: o */
    public int f12376o;

    /* JADX INFO: renamed from: p */
    public int f12377p;

    /* JADX INFO: renamed from: q */
    public CharSequence f12378q;

    /* JADX INFO: renamed from: r */
    public int f12379r;

    /* JADX INFO: renamed from: s */
    public CharSequence f12380s;

    /* JADX INFO: renamed from: t */
    public TextView f12381t;

    /* JADX INFO: renamed from: u */
    public CheckableImageButton f12382u;

    /* JADX INFO: renamed from: v */
    public zz0 f12383v;

    /* JADX INFO: renamed from: w */
    public boolean f12384w;

    /* JADX INFO: renamed from: x */
    public CharSequence f12385x;

    /* JADX INFO: renamed from: y */
    public CharSequence f12386y;

    public wz0() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f12367a = new LinkedHashSet();
        this.f12368b = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: h */
    public static int m6846h(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM6228b = t42.m6228b();
        calendarM6228b.set(5, 1);
        Calendar calendarM6227a = t42.m6227a(calendarM6228b);
        calendarM6227a.get(2);
        calendarM6227a.get(1);
        int maximum = calendarM6227a.getMaximum(7);
        calendarM6227a.getActualMaximum(5);
        calendarM6227a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6847i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ki0.m3851V(context, R.attr.materialCalendarStyle, qz0.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m6848g() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        l41.m4035b();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f12367a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f12369c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            l41.m4035b();
            return;
        }
        this.f12371e = (C1409sk) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            l41.m4035b();
            return;
        }
        this.f12373g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12374m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f12376o = bundle.getInt("INPUT_MODE_KEY");
        this.f12377p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f12378q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f12379r = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f12380s = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f12374m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f12373g);
        }
        this.f12385x = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f12386y = text;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i = this.f12369c;
        if (i == 0) {
            m6848g();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.f12375n = m6847i(context, android.R.attr.windowFullscreen);
        this.f12383v = new zz0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ji1.f5403k, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f12383v.m7397h(context);
        this.f12383v.m7399j(ColorStateList.valueOf(color));
        zz0 zz0Var = this.f12383v;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = i72.f4849a;
        zz0Var.m7398i(y62.m7008i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f12375n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f12375n) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m6846h(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m6846h(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = i72.f4849a;
        v62.m6590f(textView, 1);
        this.f12382u = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f12381t = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f12382u.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f12382u;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, hr1.m3282r(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], hr1.m3282r(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f12382u.setChecked(this.f12376o != 0);
        i72.m3378j(this.f12382u, null);
        CheckableImageButton checkableImageButton2 = this.f12382u;
        this.f12382u.setContentDescription(this.f12376o == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f12382u.setOnClickListener(new ViewOnClickListenerC1597xn(this, 2));
        m6848g();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f12368b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12369c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C1409sk c1409sk = this.f12371e;
        C1372rk c1372rk = new C1372rk();
        long j = c1409sk.f10420a.f1227f;
        long j2 = c1409sk.f10421b.f1227f;
        c1372rk.f10065a = Long.valueOf(c1409sk.f10423d.f1227f);
        int i = c1409sk.f10424e;
        C1124mx c1124mx = c1409sk.f10422c;
        qz0 qz0Var = this.f12372f;
        b61 b61Var = qz0Var == null ? null : qz0Var.f9624d;
        if (b61Var != null) {
            c1372rk.f10065a = Long.valueOf(b61Var.f1227f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c1124mx);
        b61 b61VarM936b = b61.m936b(j);
        b61 b61VarM936b2 = b61.m936b(j2);
        C1124mx c1124mx2 = (C1124mx) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c1372rk.f10065a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1409sk(b61VarM936b, b61VarM936b2, c1124mx2, l == null ? null : b61.m936b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12373g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12374m);
        bundle.putInt("INPUT_MODE_KEY", this.f12376o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f12377p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f12378q);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f12379r);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f12380s);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onStart() {
        zc1 zc1Var;
        int color;
        cb2 cb2Var;
        cb2 cb2Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f12375n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f12383v);
            if (!this.f12384w) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                Context context = window.getContext();
                TypedValue typedValueM3849T = ki0.m3849T(context, android.R.attr.colorBackground);
                if (typedValueM3849T != null) {
                    int i = typedValueM3849T.resourceId;
                    color = i != 0 ? AbstractC0075au.getColor(context, i) : typedValueM3849T.data;
                } else {
                    color = -16777216;
                }
                if (z) {
                    numValueOf = Integer.valueOf(color);
                }
                AbstractC1337qm.m5529b0(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = hp0.m3193B(0) || hp0.m3193B(numValueOf.intValue());
                View decorView = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    cb2Var = new cb2(window.getInsetsController());
                    cb2Var.f1743r = window;
                } else {
                    cb2Var = new cb2(window, decorView);
                }
                cb2Var.mo1205X(z2);
                boolean z3 = hp0.m3193B(0) || hp0.m3193B(color);
                View decorView2 = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    cb2Var2 = new cb2(window.getInsetsController());
                    cb2Var2.f1743r = window;
                } else {
                    cb2Var2 = new cb2(window, decorView2);
                }
                cb2Var2.mo1204W(z3);
                vz0 vz0Var = new vz0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = i72.f4849a;
                y62.m7020u(viewFindViewById, vz0Var);
                this.f12384w = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12383v, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new sn0(requireDialog(), rect));
        }
        requireContext();
        int i2 = this.f12369c;
        if (i2 == 0) {
            m6848g();
            throw null;
        }
        m6848g();
        C1409sk c1409sk = this.f12371e;
        qz0 qz0Var = new qz0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1409sk);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c1409sk.f10423d);
        qz0Var.setArguments(bundle);
        this.f12372f = qz0Var;
        if (this.f12376o == 1) {
            zc1Var = qz0Var;
            m6848g();
            C1409sk c1409sk2 = this.f12371e;
            c01 c01Var = new c01();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1409sk2);
            c01Var.setArguments(bundle2);
            zc1Var = c01Var;
        }
        zc1Var = qz0Var;
        this.f12370d = zc1Var;
        this.f12381t.setText((this.f12376o == 1 && getResources().getConfiguration().orientation == 2) ? this.f12386y : this.f12385x);
        m6848g();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g, androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onStop() {
        this.f12370d.f13347a.clear();
        super.onStop();
    }
}
