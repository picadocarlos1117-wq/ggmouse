package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends o21 {
    @Override // p000.o21
    /* JADX INFO: renamed from: I */
    public final void mo723I(yr1 yr1Var, float f, float f2) {
        yr1Var.m7107d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ur1 ur1Var = new ur1(TouchPipeline.SIZE, TouchPipeline.SIZE, f3, f3);
        ur1Var.f11396f = 180.0f;
        ur1Var.f11397g = 90.0f;
        yr1Var.f13056f.add(ur1Var);
        sr1 sr1Var = new sr1(ur1Var);
        yr1Var.m7104a(180.0f);
        yr1Var.f13057g.add(sr1Var);
        yr1Var.f13054d = 270.0f;
        float f4 = (TouchPipeline.SIZE + f3) * 0.5f;
        float f5 = (f3 - TouchPipeline.SIZE) / 2.0f;
        yr1Var.f13052b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        yr1Var.f13053c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
