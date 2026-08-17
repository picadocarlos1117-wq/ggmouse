package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s20 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final s20 f10205a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ s20[] f10206b;

    static {
        s20 s20Var = new s20("INSTANCE", 0);
        f10205a = s20Var;
        f10206b = new s20[]{s20Var};
    }

    public static s20 valueOf(String str) {
        return (s20) Enum.valueOf(s20.class, str);
    }

    public static s20[] values() {
        return (s20[]) f10206b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
