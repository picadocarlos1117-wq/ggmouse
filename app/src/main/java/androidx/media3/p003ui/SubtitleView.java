package androidx.media3.p003ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC1337qm;
import p000.C0767iv;
import p000.C0805jv;
import p000.C1149nl;
import p000.C1228ol;
import p000.ay1;
import p000.g92;
import p000.l41;
import p000.pr0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List f821a;

    /* JADX INFO: renamed from: b */
    public C1228ol f822b;

    /* JADX INFO: renamed from: c */
    public float f823c;

    /* JADX INFO: renamed from: d */
    public float f824d;

    /* JADX INFO: renamed from: e */
    public boolean f825e;

    /* JADX INFO: renamed from: f */
    public boolean f826f;

    /* JADX INFO: renamed from: g */
    public int f827g;

    /* JADX INFO: renamed from: m */
    public ay1 f828m;

    /* JADX INFO: renamed from: n */
    public View f829n;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f821a = Collections.EMPTY_LIST;
        this.f822b = C1228ol.f8386g;
        this.f823c = 0.0533f;
        this.f824d = 0.08f;
        this.f825e = true;
        this.f826f = true;
        C1149nl c1149nl = new C1149nl(context, 0);
        this.f828m = c1149nl;
        this.f829n = c1149nl;
        addView(c1149nl);
        this.f827g = 1;
    }

    private List<C0805jv> getCuesWithStylingPreferencesApplied() {
        if (this.f825e && this.f826f) {
            return this.f821a;
        }
        ArrayList arrayList = new ArrayList(this.f821a.size());
        for (int i = 0; i < this.f821a.size(); i++) {
            C0767iv c0767ivM3713a = ((C0805jv) this.f821a.get(i)).m3713a();
            if (!this.f825e) {
                c0767ivM3713a.f5177n = false;
                CharSequence charSequence = c0767ivM3713a.f5164a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0767ivM3713a.f5164a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0767ivM3713a.f5164a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof pr0)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC1337qm.m5524Y(c0767ivM3713a);
            } else if (!this.f826f) {
                AbstractC1337qm.m5524Y(c0767ivM3713a);
            }
            arrayList.add(c0767ivM3713a.m3495a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1228ol getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        C1228ol c1228ol = C1228ol.f8386g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c1228ol;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new C1228ol(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & ay1> void setView(T t) {
        removeView(this.f829n);
        View view = this.f829n;
        if (view instanceof g92) {
            ((g92) view).f4107b.destroy();
        }
        this.f829n = t;
        this.f828m = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m461a() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: b */
    public final void m462b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: c */
    public final void m463c() {
        this.f828m.mo791a(getCuesWithStylingPreferencesApplied(), this.f822b, this.f823c, this.f824d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f826f = z;
        m463c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f825e = z;
        m463c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f824d = f;
        m463c();
    }

    public void setCues(List<C0805jv> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f821a = list;
        m463c();
    }

    public void setFractionalTextSize(float f) {
        this.f823c = f;
        m463c();
    }

    public void setStyle(C1228ol c1228ol) {
        this.f822b = c1228ol;
        m463c();
    }

    public void setViewType(int i) {
        if (this.f827g == i) {
            return;
        }
        if (i == 1) {
            setView(new C1149nl(getContext(), 0));
        } else {
            if (i != 2) {
                l41.m4049r();
                return;
            }
            setView(new g92(getContext()));
        }
        this.f827g = i;
    }
}
