package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1281p3 implements my1 {

    /* JADX INFO: renamed from: a */
    public CharSequence f8671a;

    /* JADX INFO: renamed from: b */
    public CharSequence f8672b;

    /* JADX INFO: renamed from: c */
    public Intent f8673c;

    /* JADX INFO: renamed from: d */
    public char f8674d;

    /* JADX INFO: renamed from: e */
    public int f8675e;

    /* JADX INFO: renamed from: f */
    public char f8676f;

    /* JADX INFO: renamed from: g */
    public int f8677g;

    /* JADX INFO: renamed from: h */
    public Drawable f8678h;

    /* JADX INFO: renamed from: i */
    public Context f8679i;

    /* JADX INFO: renamed from: j */
    public CharSequence f8680j;

    /* JADX INFO: renamed from: k */
    public CharSequence f8681k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f8682l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f8683m;

    /* JADX INFO: renamed from: n */
    public boolean f8684n;

    /* JADX INFO: renamed from: o */
    public boolean f8685o;

    /* JADX INFO: renamed from: p */
    public int f8686p;

    @Override // p000.my1
    /* JADX INFO: renamed from: a */
    public final my1 mo4485a(s31 s31Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.my1
    /* JADX INFO: renamed from: b */
    public final s31 mo4486b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m5119c() {
        Drawable drawable = this.f8678h;
        if (drawable != null) {
            if (this.f8684n || this.f8685o) {
                this.f8678h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f8678h = drawableMutate;
                if (this.f8684n) {
                    v30.m6560h(drawableMutate, this.f8682l);
                }
                if (this.f8685o) {
                    v30.m6561i(this.f8678h, this.f8683m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.my1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8677g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8676f;
    }

    @Override // p000.my1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8680j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f8678h;
    }

    @Override // p000.my1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8682l;
    }

    @Override // p000.my1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8683m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8673c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.my1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8675e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8674d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8671a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8672b;
        return charSequence != null ? charSequence : this.f8671a;
    }

    @Override // p000.my1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8681k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8686p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8686p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8686p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8686p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f8676f = Character.toLowerCase(c);
        this.f8677g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f8686p = (z ? 1 : 0) | (this.f8686p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f8686p = (z ? 2 : 0) | (this.f8686p & (-3));
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final my1 setContentDescription(CharSequence charSequence) {
        this.f8680j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f8686p = (z ? 16 : 0) | (this.f8686p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f8678h = AbstractC0075au.getDrawable(this.f8679i, i);
        m5119c();
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8682l = colorStateList;
        this.f8684n = true;
        m5119c();
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8683m = mode;
        this.f8685o = true;
        m5119c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8673c = intent;
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f8674d = c;
        this.f8675e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.my1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f8674d = c;
        this.f8675e = KeyEvent.normalizeMetaState(i);
        this.f8676f = Character.toLowerCase(c2);
        this.f8677g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f8671a = this.f8679i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8672b = charSequence;
        return this;
    }

    @Override // p000.my1, android.view.MenuItem
    public final my1 setTooltipText(CharSequence charSequence) {
        this.f8681k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f8686p = (this.f8686p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8680j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8681k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f8674d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8678h = drawable;
        m5119c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f8676f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8671a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f8674d = c;
        this.f8676f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
