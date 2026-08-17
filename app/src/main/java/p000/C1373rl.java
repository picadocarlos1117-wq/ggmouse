package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: rl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1373rl extends nu0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10070g;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ CarouselLayoutManager f10071m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373rl(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.f10070g = i;
        switch (i) {
            case 1:
                this.f10071m = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f10071m = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: j */
    public final int mo4600j() {
        int i = this.f10070g;
        CarouselLayoutManager carouselLayoutManager = this.f10071m;
        switch (i) {
            case 0:
                return carouselLayoutManager.f996o;
            default:
                return carouselLayoutManager.f996o - carouselLayoutManager.m658B();
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: k */
    public final int mo4601k() {
        switch (this.f10070g) {
            case 0:
                return this.f10071m.m659C();
            default:
                return 0;
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: l */
    public final int mo4602l() {
        int i = this.f10070g;
        CarouselLayoutManager carouselLayoutManager = this.f10071m;
        switch (i) {
            case 0:
                return carouselLayoutManager.f995n - carouselLayoutManager.m660D();
            default:
                return carouselLayoutManager.f995n;
        }
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: m */
    public final int mo4603m() {
        switch (this.f10070g) {
            case 0:
                return 0;
            default:
                return this.f10071m.m661E();
        }
    }
}
