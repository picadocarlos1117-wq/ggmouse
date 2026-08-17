package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1363rb implements zv0 {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f9866a;

    public C1363rb(int i) {
        switch (i) {
            case 1:
                this.f9866a = new AtomicLong();
                break;
            default:
                this.f9866a = new AtomicLong();
                break;
        }
    }

    @Override // p000.zv0
    /* JADX INFO: renamed from: a */
    public void mo3445a() {
        this.f9866a.getAndAdd(1L);
    }
}
