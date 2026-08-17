package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public static final wp0 f12245a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wp0[] f12246b;

    static {
        wp0 wp0Var = new wp0("INSTANCE", 0);
        f12245a = wp0Var;
        f12246b = new wp0[]{wp0Var};
    }

    public static wp0 valueOf(String str) {
        return (wp0) Enum.valueOf(wp0.class, str);
    }

    public static wp0[] values() {
        return (wp0[]) f12246b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        p32.m5193x(false, "no calls to next() since the last call to remove()");
    }
}
