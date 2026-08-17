package p000;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0275c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qz0<S> extends zc1 {

    /* JADX INFO: renamed from: b */
    public int f9622b;

    /* JADX INFO: renamed from: c */
    public C1409sk f9623c;

    /* JADX INFO: renamed from: d */
    public b61 f9624d;

    /* JADX INFO: renamed from: e */
    public int f9625e;

    /* JADX INFO: renamed from: f */
    public C0558d8 f9626f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f9627g;

    /* JADX INFO: renamed from: m */
    public RecyclerView f9628m;

    /* JADX INFO: renamed from: n */
    public View f9629n;

    /* JADX INFO: renamed from: o */
    public View f9630o;

    /* JADX INFO: renamed from: p */
    public View f9631p;

    /* JADX INFO: renamed from: q */
    public View f9632q;

    /* JADX INFO: renamed from: f */
    public final void m5628f(b61 b61Var) {
        C0275c c0275c = (C0275c) this.f9628m.getAdapter();
        int iM938d = c0275c.f2067a.f10420a.m938d(b61Var);
        int iM938d2 = iM938d - c0275c.f2067a.f10420a.m938d(this.f9624d);
        boolean z = Math.abs(iM938d2) > 3;
        boolean z2 = iM938d2 > 0;
        this.f9624d = b61Var;
        int i = 4;
        if (z && z2) {
            this.f9628m.m581d0(iM938d - 3);
            this.f9628m.post(new RunnableC0120c2(iM938d, i, this));
            return;
        }
        RecyclerView recyclerView = this.f9628m;
        if (!z) {
            recyclerView.post(new RunnableC0120c2(iM938d, i, this));
        } else {
            recyclerView.m581d0(iM938d + 3);
            this.f9628m.post(new RunnableC0120c2(iM938d, i, this));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5629g(int i) {
        this.f9625e = i;
        if (i == 2) {
            this.f9627g.getLayoutManager().mo541m0(this.f9624d.f1224c - ((qc2) this.f9627g.getAdapter()).f9483a.f9623c.f10420a.f1224c);
            this.f9631p.setVisibility(0);
            this.f9632q.setVisibility(8);
            this.f9629n.setVisibility(8);
            this.f9630o.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f9631p.setVisibility(8);
            this.f9632q.setVisibility(0);
            this.f9629n.setVisibility(0);
            this.f9630o.setVisibility(0);
            m5628f(this.f9624d);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9622b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            l41.m4035b();
            return;
        }
        this.f9623c = (C1409sk) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.f9624d = (b61) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            l41.m4035b();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        yb1 yb1Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f9622b);
        this.f9626f = new C0558d8(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        b61 b61Var = this.f9623c.f10420a;
        int i3 = 0;
        int i4 = 1;
        if (wz0.m6847i(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.sousasantoslogic.sspro.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.sousasantoslogic.sspro.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = c61.f1682d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.sousasantoslogic.sspro.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.mtrl_calendar_days_of_week);
        i72.m3378j(gridView, new mz0(0));
        int i6 = this.f9623c.f10424e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new C1161nx(i6) : new C1161nx()));
        gridView.setNumColumns(b61Var.f1225d);
        gridView.setEnabled(false);
        this.f9628m = (RecyclerView) viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.mtrl_calendar_months);
        getContext();
        this.f9628m.setLayoutManager(new nz0(this, i2, i2));
        this.f9628m.setTag("MONTHS_VIEW_GROUP_TAG");
        C0275c c0275c = new C0275c(contextThemeWrapper, this.f9623c, new pn0(this));
        this.f9628m.setAdapter(c0275c);
        int integer = contextThemeWrapper.getResources().getInteger(com.sousasantoslogic.sspro.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.mtrl_calendar_year_selector_frame);
        this.f9627g = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f9627g.setLayoutManager(new GridLayoutManager(integer));
            this.f9627g.setAdapter(new qc2(this));
            RecyclerView recyclerView4 = this.f9627g;
            oz0 oz0Var = new oz0();
            t42.m6229c(null);
            t42.m6229c(null);
            recyclerView4.m585g(oz0Var);
        }
        if (viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            i72.m3378j(materialButton, new C1444ti(this, 3));
            View viewFindViewById = viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.month_navigation_previous);
            this.f9629n = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.month_navigation_next);
            this.f9630o = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f9631p = viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.mtrl_calendar_year_selector_frame);
            this.f9632q = viewInflate.findViewById(com.sousasantoslogic.sspro.R.id.mtrl_calendar_day_selector_frame);
            m5629g(1);
            materialButton.setText(this.f9624d.m937c());
            this.f9628m.m587h(new pz0(this, c0275c, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC1407si(this, 3));
            this.f9630o.setOnClickListener(new lz0(this, c0275c, i4));
            this.f9629n.setOnClickListener(new lz0(this, c0275c, i3));
        }
        if (!wz0.m6847i(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (yb1Var = new yb1()).f12928a) != (recyclerView = this.f9628m)) {
            tt1 tt1Var = yb1Var.f12929b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f922n0;
                if (arrayList != null) {
                    arrayList.remove(tt1Var);
                }
                yb1Var.f12928a.setOnFlingListener(null);
            }
            yb1Var.f12928a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    f40.m2719o("An instance of OnFlingListener already set.");
                    return null;
                }
                yb1Var.f12928a.m587h(tt1Var);
                yb1Var.f12928a.setOnFlingListener(yb1Var);
                new Scroller(yb1Var.f12928a.getContext(), new DecelerateInterpolator());
                yb1Var.m7076f();
            }
        }
        this.f9628m.m581d0(c0275c.f2067a.f10420a.m938d(this.f9624d));
        i72.m3378j(this.f9628m, new mz0(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9622b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9623c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9624d);
    }
}
