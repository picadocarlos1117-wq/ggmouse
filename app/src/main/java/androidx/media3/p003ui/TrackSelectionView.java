package androidx.media3.p003ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.ViewOnClickListenerC1407si;
import p000.a22;
import p000.ay0;
import p000.e22;
import p000.i22;
import p000.k22;
import p000.y12;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f830a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflater f831b;

    /* JADX INFO: renamed from: c */
    public final CheckedTextView f832c;

    /* JADX INFO: renamed from: d */
    public final CheckedTextView f833d;

    /* JADX INFO: renamed from: e */
    public final ViewOnClickListenerC1407si f834e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f835f;

    /* JADX INFO: renamed from: g */
    public final HashMap f836g;

    /* JADX INFO: renamed from: m */
    public boolean f837m;

    /* JADX INFO: renamed from: n */
    public boolean f838n;

    /* JADX INFO: renamed from: o */
    public a22 f839o;

    /* JADX INFO: renamed from: p */
    public CheckedTextView[][] f840p;

    /* JADX INFO: renamed from: q */
    public boolean f841q;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f830a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f831b = layoutInflaterFrom;
        ViewOnClickListenerC1407si viewOnClickListenerC1407si = new ViewOnClickListenerC1407si(this, 5);
        this.f834e = viewOnClickListenerC1407si;
        this.f839o = new ay0(getResources());
        this.f835f = new ArrayList();
        this.f836g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f832c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.sousasantoslogic.sspro.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC1407si);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.sousasantoslogic.sspro.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f833d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.sousasantoslogic.sspro.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC1407si);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m464a() {
        this.f832c.setChecked(this.f841q);
        boolean z = this.f841q;
        HashMap map = this.f836g;
        this.f833d.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f840p.length; i++) {
            e22 e22Var = (e22) map.get(((k22) this.f835f.get(i)).f5652b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f840p[i];
                if (i2 < checkedTextViewArr.length) {
                    if (e22Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f840p[i][i2].setChecked(e22Var.f3181b.contains(Integer.valueOf(((i22) tag).f4781b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m465b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f835f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f833d;
        CheckedTextView checkedTextView2 = this.f832c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f840p = new CheckedTextView[arrayList.size()][];
        boolean z = this.f838n && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            k22 k22Var = (k22) arrayList.get(i);
            boolean z2 = this.f837m && k22Var.f5653c;
            CheckedTextView[][] checkedTextViewArr = this.f840p;
            int i2 = k22Var.f5651a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            i22[] i22VarArr = new i22[i2];
            for (int i3 = 0; i3 < k22Var.f5651a; i3++) {
                i22VarArr[i3] = new i22(k22Var, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.f831b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.sousasantoslogic.sspro.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f830a);
                a22 a22Var = this.f839o;
                i22 i22Var = i22VarArr[i4];
                checkedTextView3.setText(((ay0) a22Var).m789y(i22Var.f4780a.f5652b.f12805d[i22Var.f4781b]));
                checkedTextView3.setTag(i22VarArr[i4]);
                if (k22Var.m3765a(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f834e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f840p[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m464a();
    }

    public boolean getIsDisabled() {
        return this.f841q;
    }

    public Map<y12, e22> getOverrides() {
        return this.f836g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f837m != z) {
            this.f837m = z;
            m465b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f838n != z) {
            this.f838n = z;
            if (!z) {
                HashMap map = this.f836g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f835f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        e22 e22Var = (e22) map.get(((k22) arrayList.get(i)).f5652b);
                        if (e22Var != null && map2.isEmpty()) {
                            map2.put(e22Var.f3180a, e22Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m465b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f832c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(a22 a22Var) {
        a22Var.getClass();
        this.f839o = a22Var;
        m465b();
    }
}
