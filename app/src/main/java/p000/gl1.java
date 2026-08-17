package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f4228a;

    /* JADX INFO: renamed from: b */
    public final ry1 f4229b;

    /* JADX INFO: renamed from: c */
    public final zw0 f4230c;

    /* JADX INFO: renamed from: d */
    public final sv1 f4231d;

    /* JADX INFO: renamed from: e */
    public long f4232e;

    /* JADX INFO: renamed from: f */
    public boolean f4233f;

    /* JADX INFO: renamed from: g */
    public ScheduledFuture f4234g;

    public gl1(zw0 zw0Var, ry1 ry1Var, ScheduledExecutorService scheduledExecutorService, sv1 sv1Var) {
        this.f4230c = zw0Var;
        this.f4229b = ry1Var;
        this.f4228a = scheduledExecutorService;
        this.f4231d = sv1Var;
        sv1Var.m6142b();
    }
}
