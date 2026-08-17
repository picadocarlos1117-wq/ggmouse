package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r31 implements my1 {

    /* JADX INFO: renamed from: A */
    public s31 f9668A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f9669B;

    /* JADX INFO: renamed from: a */
    public final int f9671a;

    /* JADX INFO: renamed from: b */
    public final int f9672b;

    /* JADX INFO: renamed from: c */
    public final int f9673c;

    /* JADX INFO: renamed from: d */
    public final int f9674d;

    /* JADX INFO: renamed from: e */
    public CharSequence f9675e;

    /* JADX INFO: renamed from: f */
    public CharSequence f9676f;

    /* JADX INFO: renamed from: g */
    public Intent f9677g;

    /* JADX INFO: renamed from: h */
    public char f9678h;

    /* JADX INFO: renamed from: j */
    public char f9680j;

    /* JADX INFO: renamed from: l */
    public Drawable f9682l;

    /* JADX INFO: renamed from: n */
    public final i31 f9684n;

    /* JADX INFO: renamed from: o */
    public nx1 f9685o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f9686p;

    /* JADX INFO: renamed from: q */
    public CharSequence f9687q;

    /* JADX INFO: renamed from: r */
    public CharSequence f9688r;

    /* JADX INFO: renamed from: y */
    public int f9695y;

    /* JADX INFO: renamed from: z */
    public View f9696z;

    /* JADX INFO: renamed from: i */
    public int f9679i = 4096;

    /* JADX INFO: renamed from: k */
    public int f9681k = 4096;

    /* JADX INFO: renamed from: m */
    public int f9683m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f9689s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f9690t = null;

    /* JADX INFO: renamed from: u */
    public boolean f9691u = false;

    /* JADX INFO: renamed from: v */
    public boolean f9692v = false;

    /* JADX INFO: renamed from: w */
    public boolean f9693w = false;

    /* JADX INFO: renamed from: x */
    public int f9694x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f9670C = false;

    public r31(i31 i31Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f9684n = i31Var;
        this.f9671a = i2;
        this.f9672b = i;
        this.f9673c = i3;
        this.f9674d = i4;
        this.f9675e = charSequence;
        this.f9695y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m5677c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.my1
    /* JADX INFO: renamed from: a */
    public final my1 mo4485a(s31 s31Var) {
        this.f9696z = null;
        this.f9668A = s31Var;
        this.f9684n.m3353p(true);
        s31 s31Var2 = this.f9668A;
        if (s31Var2 != null) {
            s31Var2.f10215b = new pn0(this);
            s31Var2.f10214a.setVisibilityListener(s31Var2);
        }
        return this;
    }

    @Override // p000.my1
    /* JADX INFO: renamed from: b */
    public final s31 mo4486b() {
        return this.f9668A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9695y & 8) == 0) {
            return false;
        }
        if (this.f9696z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9669B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9684n.mo3341d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m5678d(Drawable drawable) {
        if (drawable != null && this.f9693w && (this.f9691u || this.f9692v)) {
            drawable = drawable.mutate();
            if (this.f9691u) {
                v30.m6560h(drawable, this.f9689s);
            }
            if (this.f9692v) {
                v30.m6561i(drawable, this.f9690t);
            }
            this.f9693w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5679e() {
        s31 s31Var;
        if ((this.f9695y & 8) != 0) {
            if (this.f9696z == null && (s31Var = this.f9668A) != null) {
                this.f9696z = s31Var.f10214a.onCreateActionView(this);
            }
            if (this.f9696z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m5679e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9669B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9684n.mo3343f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m5680f(boolean z) {
        int i = this.f9694x;
        if (z) {
            this.f9694x = i | 32;
        } else {
            this.f9694x = i & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9696z;
        if (view != null) {
            return view;
        }
        s31 s31Var = this.f9668A;
        if (s31Var == null) {
            return null;
        }
        View viewOnCreateActionView = s31Var.f10214a.onCreateActionView(this);
        this.f9696z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p000.my1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9681k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9680j;
    }

    @Override // p000.my1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9687q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9672b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9682l;
        if (drawable != null) {
            return m5678d(drawable);
        }
        int i = this.f9683m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM3282r = hr1.m3282r(this.f9684n.f4787a, i);
        this.f9683m = 0;
        this.f9682l = drawableM3282r;
        return m5678d(drawableM3282r);
    }

    @Override // p000.my1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9689s;
    }

    @Override // p000.my1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9690t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9677g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9671a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.my1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9679i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9678h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9673c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9685o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9675e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9676f;
        return charSequence != null ? charSequence : this.f9675e;
    }

    @Override // p000.my1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9688r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9685o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f9670C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9694x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9694x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9694x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        s31 s31Var = this.f9668A;
        if (s31Var == null || !s31Var.f10214a.overridesItemVisibility()) {
            return (this.f9694x & 8) == 0;
        }
        return (this.f9694x & 8) == 0 && this.f9668A.f10214a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        i31 i31Var = this.f9684n;
        Context context = i31Var.f4787a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f9696z = viewInflate;
        this.f9668A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f9671a) > 0) {
            viewInflate.setId(i2);
        }
        i31Var.f4797k = true;
        i31Var.m3353p(true);
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f9680j == c && this.f9681k == i) {
            return this;
        }
        this.f9680j = Character.toLowerCase(c);
        this.f9681k = KeyEvent.normalizeMetaState(i);
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f9694x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f9694x = i2;
        if (i != i2) {
            this.f9684n.m3353p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f9694x;
        int i2 = i & 4;
        i31 i31Var = this.f9684n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f9694x = i3;
            if (i != i3) {
                i31Var.m3353p(false);
            }
            return this;
        }
        ArrayList arrayList = i31Var.f4792f;
        int size = arrayList.size();
        i31Var.m3360w();
        for (int i4 = 0; i4 < size; i4++) {
            r31 r31Var = (r31) arrayList.get(i4);
            if (r31Var.f9672b == this.f9672b && (r31Var.f9694x & 4) != 0 && r31Var.isCheckable()) {
                boolean z2 = r31Var == this;
                int i5 = r31Var.f9694x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                r31Var.f9694x = i6;
                if (i5 != i6) {
                    r31Var.f9684n.m3353p(false);
                }
            }
        }
        i31Var.m3359v();
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final my1 setContentDescription(CharSequence charSequence) {
        this.f9687q = charSequence;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f9694x;
        if (z) {
            this.f9694x = i | 16;
        } else {
            this.f9694x = i & (-17);
        }
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f9682l = null;
        this.f9683m = i;
        this.f9693w = true;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9689s = colorStateList;
        this.f9691u = true;
        this.f9693w = true;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9690t = mode;
        this.f9692v = true;
        this.f9693w = true;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9677g = intent;
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f9678h == c && this.f9679i == i) {
            return this;
        }
        this.f9678h = c;
        this.f9679i = KeyEvent.normalizeMetaState(i);
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9669B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9686p = onMenuItemClickListener;
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f9678h = c;
        this.f9679i = KeyEvent.normalizeMetaState(i);
        this.f9680j = Character.toLowerCase(c2);
        this.f9681k = KeyEvent.normalizeMetaState(i2);
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            f40.m2713i("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f9695y = i;
        i31 i31Var = this.f9684n;
        i31Var.f4797k = true;
        i31Var.m3353p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9675e = charSequence;
        this.f9684n.m3353p(false);
        nx1 nx1Var = this.f9685o;
        if (nx1Var != null) {
            nx1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9676f = charSequence;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final my1 setTooltipText(CharSequence charSequence) {
        this.f9688r = charSequence;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f9694x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f9694x = i2;
        if (i != i2) {
            i31 i31Var = this.f9684n;
            i31Var.f4794h = true;
            i31Var.m3353p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9675e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9683m = 0;
        this.f9682l = drawable;
        this.f9693w = true;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f9684n.f4787a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f9678h == c) {
            return this;
        }
        this.f9678h = c;
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f9678h = c;
        this.f9680j = Character.toLowerCase(c2);
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f9680j == c) {
            return this;
        }
        this.f9680j = Character.toLowerCase(c);
        this.f9684n.m3353p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f9696z = view;
        this.f9668A = null;
        if (view != null && view.getId() == -1 && (i = this.f9671a) > 0) {
            view.setId(i);
        }
        i31 i31Var = this.f9684n;
        i31Var.f4797k = true;
        i31Var.m3353p(true);
        return this;
    }
}
