package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: zg */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1664zg implements InterfaceC1103mc {

    /* JADX INFO: renamed from: b */
    public C0823kc f13397b;

    /* JADX INFO: renamed from: c */
    public C0823kc f13398c;

    /* JADX INFO: renamed from: d */
    public C0823kc f13399d;

    /* JADX INFO: renamed from: e */
    public C0823kc f13400e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f13401f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f13402g;

    /* JADX INFO: renamed from: h */
    public boolean f13403h;

    public AbstractC1664zg() {
        ByteBuffer byteBuffer = InterfaceC1103mc.f6750a;
        this.f13401f = byteBuffer;
        this.f13402g = byteBuffer;
        C0823kc c0823kc = C0823kc.f5741e;
        this.f13399d = c0823kc;
        this.f13400e = c0823kc;
        this.f13397b = c0823kc;
        this.f13398c = c0823kc;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo2125a() {
        ByteBuffer byteBuffer = this.f13402g;
        this.f13402g = InterfaceC1103mc.f6750a;
        return byteBuffer;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: c */
    public final C0823kc mo2127c(C0823kc c0823kc) {
        this.f13399d = c0823kc;
        this.f13400e = mo2447f(c0823kc);
        return isActive() ? this.f13400e : C0823kc.f5741e;
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: d */
    public final void mo2128d() {
        this.f13403h = true;
        mo2490h();
    }

    @Override // p000.InterfaceC1103mc
    /* JADX INFO: renamed from: e */
    public boolean mo2129e() {
        return this.f13403h && this.f13402g == InterfaceC1103mc.f6750a;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0823kc mo2447f(C0823kc c0823kc);

    @Override // p000.InterfaceC1103mc
    public final void flush() {
        this.f13402g = InterfaceC1103mc.f6750a;
        this.f13403h = false;
        this.f13397b = this.f13399d;
        this.f13398c = this.f13400e;
        mo2489g();
    }

    @Override // p000.InterfaceC1103mc
    public boolean isActive() {
        return this.f13400e != C0823kc.f5741e;
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m7306j(int i) {
        if (this.f13401f.capacity() < i) {
            this.f13401f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f13401f.clear();
        }
        ByteBuffer byteBuffer = this.f13401f;
        this.f13402g = byteBuffer;
        return byteBuffer;
    }

    @Override // p000.InterfaceC1103mc
    public final void reset() {
        flush();
        this.f13401f = InterfaceC1103mc.f6750a;
        C0823kc c0823kc = C0823kc.f5741e;
        this.f13399d = c0823kc;
        this.f13400e = c0823kc;
        this.f13397b = c0823kc;
        this.f13398c = c0823kc;
        mo2491i();
    }

    /* JADX INFO: renamed from: g */
    public void mo2489g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo2490h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo2491i() {
    }
}
