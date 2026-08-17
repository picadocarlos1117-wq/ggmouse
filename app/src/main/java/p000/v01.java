package p000;

import android.net.Uri;
import android.view.InputEvent;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 extends w01 {

    /* JADX INFO: renamed from: a */
    public final r01 f11472a;

    public v01(r01 r01Var) {
        this.f11472a = r01Var;
    }

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public vt0 mo6545a() {
        return hr1.m3265a(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new s01(this, null), 3, null));
    }

    @Override // p000.w01
    /* JADX INFO: renamed from: b */
    public vt0 mo6546b(Uri uri) {
        uri.getClass();
        return hr1.m3265a(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new u01(this, uri, null), 3, null));
    }

    /* JADX INFO: renamed from: c */
    public vt0 m6547c(v10 v10Var) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public vt0 m6548d(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return hr1.m3265a(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new t01(this, uri, inputEvent, null), 3, null));
    }

    /* JADX INFO: renamed from: e */
    public vt0 m6549e(c92 c92Var) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public vt0 m6550f(d92 d92Var) {
        throw null;
    }
}
