package p000;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class es0 {

    /* JADX INFO: renamed from: a */
    public static final es0 f3433a;

    /* JADX INFO: renamed from: b */
    public static final es0 f3434b;

    /* JADX INFO: renamed from: c */
    public static final es0 f3435c;

    /* JADX INFO: renamed from: d */
    public static final es0 f3436d;

    /* JADX INFO: renamed from: e */
    public static final es0 f3437e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ es0[] f3438f;

    static {
        es0 es0Var = new es0("DESTROYED", 0);
        f3433a = es0Var;
        es0 es0Var2 = new es0("INITIALIZED", 1);
        f3434b = es0Var2;
        es0 es0Var3 = new es0(DebugCoroutineInfoImplKt.CREATED, 2);
        f3435c = es0Var3;
        es0 es0Var4 = new es0("STARTED", 3);
        f3436d = es0Var4;
        es0 es0Var5 = new es0("RESUMED", 4);
        f3437e = es0Var5;
        f3438f = new es0[]{es0Var, es0Var2, es0Var3, es0Var4, es0Var5};
    }

    public static es0 valueOf(String str) {
        return (es0) Enum.valueOf(es0.class, str);
    }

    public static es0[] values() {
        return (es0[]) f3438f.clone();
    }
}
