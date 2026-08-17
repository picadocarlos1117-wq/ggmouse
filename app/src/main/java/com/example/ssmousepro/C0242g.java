package com.example.ssmousepro;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p000.og0;

/* JADX INFO: renamed from: com.example.ssmousepro.g */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0242g implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1902b;

    public /* synthetic */ C0242g(Object obj, int i) {
        this.f1901a = i;
        this.f1902b = obj;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f1901a;
        Object obj2 = this.f1902b;
        switch (i) {
            case 0:
                return MainActivity.C01921.AnonymousClass1.invokeSuspend$lambda$1((PackageManager) obj2, (ApplicationInfo) obj);
            default:
                return PlansBottomSheet.C01991.invokeSuspend$lambda$3$lambda$2((PlansBottomSheet) obj2, ((Boolean) obj).booleanValue());
        }
    }
}
