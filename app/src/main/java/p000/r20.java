package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final r20 f9658a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ r20[] f9659b;

    static {
        r20 r20Var = new r20("INSTANCE", 0);
        f9658a = r20Var;
        f9659b = new r20[]{r20Var};
    }

    public static r20 valueOf(String str) {
        return (r20) Enum.valueOf(r20.class, str);
    }

    public static r20[] values() {
        return (r20[]) f9659b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
