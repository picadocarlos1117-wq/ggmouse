package p000;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: dx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0582dx implements s50 {

    /* JADX INFO: renamed from: a */
    public Context f3037a;

    @Override // p000.s50
    /* JADX INFO: renamed from: a */
    public void mo2391a(p32 p32Var) {
        ThreadFactoryC1638yr threadFactoryC1638yr = new ThreadFactoryC1638yr("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC1638yr);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC1436ta(this, p32Var, threadPoolExecutor, 4));
    }

    /* JADX INFO: renamed from: b */
    public C0619ex m2392b() {
        Context context = this.f3037a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C0619ex c0619ex = new C0619ex();
        c0619ex.f3459a = r30.m5676a(o21.f7627b);
        int i = 1;
        C1641yu c1641yu = new C1641yu(context, i);
        c0619ex.f3460b = c1641yu;
        int i2 = 0;
        c0619ex.f3461c = r30.m5676a(new n51(c1641yu, new C1641yu(c1641yu, i2), i2));
        C1641yu c1641yu2 = c0619ex.f3460b;
        c0619ex.f3462d = new e70(c1641yu2, i);
        qh1 qh1VarM5676a = r30.m5676a(new e70(c1641yu2, i2));
        c0619ex.f3463e = qh1VarM5676a;
        qh1 qh1VarM5676a2 = r30.m5676a(new n51(c0619ex.f3462d, qh1VarM5676a, i));
        c0619ex.f3464f = qh1VarM5676a2;
        h70 h70Var = new h70(i);
        C1641yu c1641yu3 = c0619ex.f3460b;
        pp1 pp1Var = new pp1(c1641yu3, qh1VarM5676a2, h70Var, i2);
        qh1 qh1Var = c0619ex.f3459a;
        qh1 qh1Var2 = c0619ex.f3461c;
        c0619ex.f3465g = r30.m5676a(new pp1(new i00(qh1Var, qh1Var2, pp1Var, qh1VarM5676a2, qh1VarM5676a2), new q42(c1641yu3, qh1Var2, qh1VarM5676a2, pp1Var, qh1Var, qh1VarM5676a2, qh1VarM5676a2), new lb2(qh1Var, qh1VarM5676a2, pp1Var, qh1VarM5676a2), i));
        return c0619ex;
    }
}
