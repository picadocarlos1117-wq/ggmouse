package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0543cu extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f2619f;

    /* JADX INFO: renamed from: a */
    public int f2620a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f2621b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f2622c;

    /* JADX INFO: renamed from: d */
    public Configuration f2623d;

    /* JADX INFO: renamed from: e */
    public Resources f2624e;

    public C0543cu(Context context, int i) {
        super(context);
        this.f2620a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2123a(Configuration configuration) {
        if (this.f2624e != null) {
            f40.m2719o("getResources() or getAssets() has already been called");
        } else if (this.f2623d == null) {
            this.f2623d = new Configuration(configuration);
        } else {
            f40.m2719o("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2124b() {
        if (this.f2621b == null) {
            this.f2621b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2621b.setTo(theme);
            }
        }
        this.f2621b.applyStyle(this.f2620a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2624e == null) {
            Configuration configuration = this.f2623d;
            if (configuration == null) {
                this.f2624e = super.getResources();
            } else {
                if (f2619f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = TouchPipeline.SIZE;
                    f2619f = configuration2;
                }
                if (configuration.equals(f2619f)) {
                    this.f2624e = super.getResources();
                } else {
                    this.f2624e = AbstractC0112bu.m1060a(this, this.f2623d).getResources();
                }
            }
        }
        return this.f2624e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2622c == null) {
            this.f2622c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2622c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2621b;
        if (theme != null) {
            return theme;
        }
        if (this.f2620a == 0) {
            this.f2620a = R.style.Theme_AppCompat_Light;
        }
        m2124b();
        return this.f2621b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2620a != i) {
            this.f2620a = i;
            m2124b();
        }
    }
}
