package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 extends ra2 {

    /* JADX INFO: renamed from: e */
    public static Field f7717e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f7718f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f7719g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f7720h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f7721c;

    /* JADX INFO: renamed from: d */
    public un0 f7722d;

    public oa2() {
        this.f7721c = m4786i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m4786i() {
        if (!f7718f) {
            try {
                f7717e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f7718f = true;
        }
        Field field = f7717e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f7720h) {
            try {
                f7719g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f7720h = true;
        }
        Constructor constructor = f7719g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: b */
    public bb2 mo4787b() {
        m5757a();
        bb2 bb2VarM960g = bb2.m960g(null, this.f7721c);
        un0[] un0VarArr = this.f9865b;
        ya2 ya2Var = bb2VarM960g.f1285a;
        ya2Var.mo6022o(un0VarArr);
        ya2Var.mo6263q(this.f7722d);
        return bb2VarM960g;
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: e */
    public void mo4788e(un0 un0Var) {
        this.f7722d = un0Var;
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: g */
    public void mo4789g(un0 un0Var) {
        WindowInsets windowInsets = this.f7721c;
        if (windowInsets != null) {
            this.f7721c = windowInsets.replaceSystemWindowInsets(un0Var.f11368a, un0Var.f11369b, un0Var.f11370c, un0Var.f11371d);
        }
    }

    public oa2(bb2 bb2Var) {
        super(bb2Var);
        this.f7721c = bb2Var.m965f();
    }
}
