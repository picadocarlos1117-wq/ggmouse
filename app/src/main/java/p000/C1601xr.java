package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: xr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1601xr {

    /* JADX INFO: renamed from: b */
    public static final C1601xr f12693b = new C1601xr(new k50((byte) 0, 14), k50.f5671c);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f12694a = new ConcurrentHashMap();

    public C1601xr(k50... k50VarArr) {
        for (k50 k50Var : k50VarArr) {
            this.f12694a.put(k50Var.m3801v(), k50Var);
        }
    }
}
