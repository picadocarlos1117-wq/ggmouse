package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class i31 implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f4786y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f4787a;

    /* JADX INFO: renamed from: b */
    public final Resources f4788b;

    /* JADX INFO: renamed from: c */
    public boolean f4789c;

    /* JADX INFO: renamed from: d */
    public final boolean f4790d;

    /* JADX INFO: renamed from: e */
    public g31 f4791e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4792f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4793g;

    /* JADX INFO: renamed from: h */
    public boolean f4794h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4795i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f4796j;

    /* JADX INFO: renamed from: k */
    public boolean f4797k;

    /* JADX INFO: renamed from: m */
    public CharSequence f4799m;

    /* JADX INFO: renamed from: n */
    public Drawable f4800n;

    /* JADX INFO: renamed from: o */
    public View f4801o;

    /* JADX INFO: renamed from: v */
    public r31 f4808v;

    /* JADX INFO: renamed from: x */
    public boolean f4810x;

    /* JADX INFO: renamed from: l */
    public int f4798l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f4802p = false;

    /* JADX INFO: renamed from: q */
    public boolean f4803q = false;

    /* JADX INFO: renamed from: r */
    public boolean f4804r = false;

    /* JADX INFO: renamed from: s */
    public boolean f4805s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f4806t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f4807u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f4809w = false;

    public i31(Context context) {
        boolean z = false;
        this.f4787a = context;
        Resources resources = context.getResources();
        this.f4788b = resources;
        this.f4792f = new ArrayList();
        this.f4793g = new ArrayList();
        this.f4794h = true;
        this.f4795i = new ArrayList();
        this.f4796j = new ArrayList();
        this.f4797k = true;
        if (resources.getConfiguration().keyboard != 1 && k72.m3811b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f4790d = z;
    }

    /* JADX INFO: renamed from: a */
    public final r31 m3338a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            f40.m2713i("order does not contain a valid category.");
            return null;
        }
        int i6 = (f4786y[i5] << 16) | (65535 & i3);
        r31 r31Var = new r31(this, i, i2, i3, i6, charSequence, this.f4798l);
        ArrayList arrayList = this.f4792f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((r31) arrayList.get(size)).f9674d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, r31Var);
                m3353p(true);
                return r31Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, r31Var);
        m3353p(true);
        return r31Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m3338a(0, 0, 0, this.f4788b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f4787a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            r31 r31VarM3338a = m3338a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            r31VarM3338a.setIcon(resolveInfo.loadIcon(packageManager));
            r31VarM3338a.f9677g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = r31VarM3338a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        r31 r31VarM3338a = m3338a(i, i2, i3, charSequence);
        nx1 nx1Var = new nx1(this.f4787a, this, r31VarM3338a);
        r31VarM3338a.f9685o = nx1Var;
        nx1Var.setHeaderTitle(r31VarM3338a.f9675e);
        return nx1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m3339b(g41 g41Var, Context context) {
        this.f4807u.add(new WeakReference(g41Var));
        g41Var.mo2935k(context, this);
        this.f4797k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m3340c(boolean z) {
        if (this.f4805s) {
            return;
        }
        this.f4805s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            g41 g41Var = (g41) weakReference.get();
            if (g41Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                g41Var.mo2928a(this, z);
            }
        }
        this.f4805s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        r31 r31Var = this.f4808v;
        if (r31Var != null) {
            mo3341d(r31Var);
        }
        this.f4792f.clear();
        m3353p(true);
    }

    public final void clearHeader() {
        this.f4800n = null;
        this.f4799m = null;
        this.f4801o = null;
        m3353p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3340c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo3341d(r31 r31Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
        boolean zMo2931e = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4808v == r31Var) {
            m3360w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                g41 g41Var = (g41) weakReference.get();
                if (g41Var != null) {
                    zMo2931e = g41Var.mo2931e(r31Var);
                    if (zMo2931e) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m3359v();
            if (zMo2931e) {
                this.f4808v = null;
            }
        }
        return zMo2931e;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo3342e(i31 i31Var, MenuItem menuItem) {
        g31 g31Var = this.f4791e;
        return g31Var != null && g31Var.mo768d(i31Var, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo3343f(r31 r31Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
        boolean zMo2933h = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3360w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            g41 g41Var = (g41) weakReference.get();
            if (g41Var != null) {
                zMo2933h = g41Var.mo2933h(r31Var);
                if (zMo2933h) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m3359v();
        if (zMo2933h) {
            this.f4808v = r31Var;
        }
        return zMo2933h;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r31 r31Var = (r31) arrayList.get(i2);
            if (r31Var.f9671a == i) {
                return r31Var;
            }
            if (r31Var.hasSubMenu() && (menuItemFindItem = r31Var.f9685o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final r31 m3344g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4806t;
        arrayList.clear();
        m3345h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (r31) arrayList.get(0);
        }
        boolean zMo3351n = mo3351n();
        for (int i2 = 0; i2 < size; i2++) {
            r31 r31Var = (r31) arrayList.get(i2);
            char c = zMo3351n ? r31Var.f9680j : r31Var.f9678h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo3351n && c == '\b' && i == 67))) {
                return r31Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f4792f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m3345h(List list, int i, KeyEvent keyEvent) {
        boolean zMo3351n = mo3351n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f4792f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                r31 r31Var = (r31) arrayList.get(i2);
                if (r31Var.hasSubMenu()) {
                    r31Var.f9685o.m3345h(list, i, keyEvent);
                }
                char c = zMo3351n ? r31Var.f9680j : r31Var.f9678h;
                if ((modifiers & 69647) == ((zMo3351n ? r31Var.f9681k : r31Var.f9679i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo3351n && c == '\b' && i == 67)) && r31Var.isEnabled()) {
                        list.add(r31Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4810x) {
            return true;
        }
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((r31) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m3346i() {
        ArrayList arrayListM3349l = m3349l();
        if (this.f4797k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
            boolean zMo2930d = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                g41 g41Var = (g41) weakReference.get();
                if (g41Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo2930d |= g41Var.mo2930d();
                }
            }
            ArrayList arrayList = this.f4795i;
            ArrayList arrayList2 = this.f4796j;
            if (zMo2930d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM3349l.size();
                for (int i = 0; i < size; i++) {
                    r31 r31Var = (r31) arrayListM3349l.get(i);
                    if ((r31Var.f9694x & 32) == 32) {
                        arrayList.add(r31Var);
                    } else {
                        arrayList2.add(r31Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3349l());
            }
            this.f4797k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3344g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo3347j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m3349l() {
        boolean z = this.f4794h;
        ArrayList arrayList = this.f4793g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4792f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            r31 r31Var = (r31) arrayList2.get(i);
            if (r31Var.isVisible()) {
                arrayList.add(r31Var);
            }
        }
        this.f4794h = false;
        this.f4797k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo3350m() {
        return this.f4809w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo3351n() {
        return this.f4789c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo3352o() {
        return this.f4790d;
    }

    /* JADX INFO: renamed from: p */
    public final void m3353p(boolean z) {
        if (this.f4802p) {
            this.f4803q = true;
            if (z) {
                this.f4804r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f4794h = true;
            this.f4797k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3360w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            g41 g41Var = (g41) weakReference.get();
            if (g41Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                g41Var.mo2934i();
            }
        }
        m3359v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m3354q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        r31 r31VarM3344g = m3344g(i, keyEvent);
        boolean zM3354q = r31VarM3344g != null ? m3354q(r31VarM3344g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m3340c(true);
        }
        return zM3354q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m3354q(MenuItem menuItem, g41 g41Var, int i) {
        s31 s31Var;
        boolean zExpandActionView;
        s31 s31Var2;
        boolean z;
        nx1 nx1Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        g41 g41Var2;
        r31 r31Var = (r31) menuItem;
        boolean zMo2929c = false;
        if (r31Var == null || !r31Var.isEnabled()) {
            return false;
        }
        i31 i31Var = r31Var.f9684n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = r31Var.f9686p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(r31Var)) && !i31Var.mo3342e(i31Var, r31Var)) {
            Intent intent = r31Var.f9677g;
            if (intent != null) {
                try {
                    i31Var.f4787a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    s31Var = r31Var.f9668A;
                    if (s31Var == null) {
                    }
                    zExpandActionView = false;
                    s31Var2 = r31Var.f9668A;
                    if (s31Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (r31Var.m5679e()) {
                        zExpandActionView |= r31Var.expandActionView();
                        if (zExpandActionView) {
                            m3340c(true);
                        }
                    } else if (r31Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            m3340c(false);
                        }
                        if (!r31Var.hasSubMenu()) {
                            nx1 nx1Var2 = new nx1(this.f4787a, this, r31Var);
                            r31Var.f9685o = nx1Var2;
                            nx1Var2.setHeaderTitle(r31Var.f9675e);
                        }
                        nx1Var = r31Var.f9685o;
                        if (z) {
                            s31Var2.f10214a.onPrepareSubMenu(nx1Var);
                        }
                        copyOnWriteArrayList = this.f4807u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (g41Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                g41Var2 = (g41) weakReference.get();
                                if (g41Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo2929c) {
                                    zMo2929c = g41Var2.mo2929c(nx1Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo2929c;
                        if (!zExpandActionView) {
                            m3340c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            m3340c(false);
                        }
                        if (!r31Var.hasSubMenu()) {
                            nx1 nx1Var3 = new nx1(this.f4787a, this, r31Var);
                            r31Var.f9685o = nx1Var3;
                            nx1Var3.setHeaderTitle(r31Var.f9675e);
                        }
                        nx1Var = r31Var.f9685o;
                        if (z) {
                            s31Var2.f10214a.onPrepareSubMenu(nx1Var);
                        }
                        copyOnWriteArrayList = this.f4807u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zMo2929c = g41Var != null ? g41Var.mo2929c(nx1Var) : false;
                            while (r8.hasNext()) {
                                g41Var2 = (g41) weakReference.get();
                                if (g41Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo2929c) {
                                    zMo2929c = g41Var2.mo2929c(nx1Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo2929c;
                        if (!zExpandActionView) {
                            m3340c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                s31Var = r31Var.f9668A;
                if (s31Var == null && s31Var.f10214a.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        s31Var2 = r31Var.f9668A;
        if (s31Var2 == null && s31Var2.f10214a.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (r31Var.m5679e()) {
            zExpandActionView |= r31Var.expandActionView();
            if (zExpandActionView) {
                m3340c(true);
            }
        } else if (r31Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m3340c(false);
            }
            if (!r31Var.hasSubMenu()) {
                nx1 nx1Var4 = new nx1(this.f4787a, this, r31Var);
                r31Var.f9685o = nx1Var4;
                nx1Var4.setHeaderTitle(r31Var.f9675e);
            }
            nx1Var = r31Var.f9685o;
            if (z) {
                s31Var2.f10214a.onPrepareSubMenu(nx1Var);
            }
            copyOnWriteArrayList = this.f4807u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (g41Var != null) {
                }
                while (r8.hasNext()) {
                    g41Var2 = (g41) weakReference.get();
                    if (g41Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo2929c) {
                        zMo2929c = g41Var2.mo2929c(nx1Var);
                    }
                }
            }
            zExpandActionView |= zMo2929c;
            if (!zExpandActionView) {
                m3340c(true);
            }
        } else if ((i & 1) == 0) {
            m3340c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m3355r(g41 g41Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4807u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            g41 g41Var2 = (g41) weakReference.get();
            if (g41Var2 == null || g41Var2 == g41Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((r31) arrayList.get(i3)).f9672b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((r31) arrayList.get(i3)).f9672b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m3353p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((r31) arrayList.get(i2)).f9671a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m3353p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m3356s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo3347j());
        int size = this.f4792f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((nx1) item.getSubMenu()).m3356s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r31 r31Var = (r31) arrayList.get(i2);
            if (r31Var.f9672b == i) {
                r31Var.f9694x = (r31Var.f9694x & (-5)) | (z2 ? 4 : 0);
                r31Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f4809w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r31 r31Var = (r31) arrayList.get(i2);
            if (r31Var.f9672b == i) {
                r31Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f4792f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            r31 r31Var = (r31) arrayList.get(i2);
            if (r31Var.f9672b == i) {
                int i3 = r31Var.f9694x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                r31Var.f9694x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m3353p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f4789c = z;
        m3353p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4792f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m3357t(Bundle bundle) {
        int size = this.f4792f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((nx1) item.getSubMenu()).m3357t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3347j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3358u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f4801o = view;
            this.f4799m = null;
            this.f4800n = null;
        } else {
            if (i > 0) {
                this.f4799m = this.f4788b.getText(i);
            } else if (charSequence != null) {
                this.f4799m = charSequence;
            }
            if (i2 > 0) {
                this.f4800n = AbstractC0075au.getDrawable(this.f4787a, i2);
            } else if (drawable != null) {
                this.f4800n = drawable;
            }
            this.f4801o = null;
        }
        m3353p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m3359v() {
        this.f4802p = false;
        if (this.f4803q) {
            this.f4803q = false;
            m3353p(this.f4804r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3360w() {
        if (this.f4802p) {
            return;
        }
        this.f4802p = true;
        this.f4803q = false;
        this.f4804r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3338a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m3338a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m3338a(i, i2, i3, this.f4788b.getString(i4));
    }

    /* JADX INFO: renamed from: k */
    public i31 mo3348k() {
        return this;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4788b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f4788b.getString(i4));
    }
}
