package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0624f1 extends C1574x0 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0661g1 f3574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624f1(C0661g1 c0661g1, int i) {
        super(c0661g1, ((List) c0661g1.f3940b).listIterator(i));
        this.f3574e = c0661g1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0661g1 c0661g1 = this.f3574e;
        boolean zIsEmpty = c0661g1.isEmpty();
        m2673b().add(obj);
        c0661g1.f3944f.f12853e++;
        if (zIsEmpty) {
            c0661g1.m2881a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator m2673b() {
        m6854a();
        return (ListIterator) this.f12391b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m2673b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m2673b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m2673b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m2673b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m2673b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624f1(C0661g1 c0661g1) {
        super(c0661g1);
        this.f3574e = c0661g1;
    }
}
