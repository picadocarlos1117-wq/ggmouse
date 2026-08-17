package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 {

    /* JADX INFO: renamed from: a */
    public float f13051a;

    /* JADX INFO: renamed from: b */
    public float f13052b;

    /* JADX INFO: renamed from: c */
    public float f13053c;

    /* JADX INFO: renamed from: d */
    public float f13054d;

    /* JADX INFO: renamed from: e */
    public float f13055e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13056f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f13057g = new ArrayList();

    public yr1() {
        m7107d(TouchPipeline.SIZE, 270.0f, TouchPipeline.SIZE);
    }

    /* JADX INFO: renamed from: a */
    public final void m7104a(float f) {
        float f2 = this.f13054d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f13052b;
        float f5 = this.f13053c;
        ur1 ur1Var = new ur1(f4, f5, f4, f5);
        ur1Var.f11396f = this.f13054d;
        ur1Var.f11397g = f3;
        this.f13057g.add(new sr1(ur1Var));
        this.f13054d = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m7105b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f13056f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wr1) arrayList.get(i)).mo6527a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7106c(float f, float f2) {
        vr1 vr1Var = new vr1();
        vr1Var.f11755b = f;
        vr1Var.f11756c = f2;
        this.f13056f.add(vr1Var);
        tr1 tr1Var = new tr1(vr1Var, this.f13052b, this.f13053c);
        float fM6333b = tr1Var.m6333b() + 270.0f;
        float fM6333b2 = tr1Var.m6333b() + 270.0f;
        m7104a(fM6333b);
        this.f13057g.add(tr1Var);
        this.f13054d = fM6333b2;
        this.f13052b = f;
        this.f13053c = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m7107d(float f, float f2, float f3) {
        this.f13051a = f;
        this.f13052b = TouchPipeline.SIZE;
        this.f13053c = f;
        this.f13054d = f2;
        this.f13055e = (f2 + f3) % 360.0f;
        this.f13056f.clear();
        this.f13057g.clear();
    }
}
