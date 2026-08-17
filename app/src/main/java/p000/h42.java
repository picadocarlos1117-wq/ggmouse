package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h42 extends j42 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h42(Unsafe unsafe, int i) {
        super(unsafe);
        this.f4449b = i;
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: c */
    public final void mo3097c(long j, byte[] bArr, long j2, long j3) {
        switch (this.f4449b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: d */
    public final boolean mo3098d(long j, Object obj) {
        switch (this.f4449b) {
            case 0:
                if (k42.f5669h) {
                    if (k42.m3783h(j, obj) == 0) {
                        return false;
                    }
                } else if (k42.m3784i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (k42.f5669h) {
                    if (k42.m3783h(j, obj) == 0) {
                        return false;
                    }
                } else if (k42.m3784i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: e */
    public final byte mo3099e(long j) {
        switch (this.f4449b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: f */
    public final byte mo3100f(long j, Object obj) {
        switch (this.f4449b) {
            case 0:
                return k42.f5669h ? k42.m3783h(j, obj) : k42.m3784i(j, obj);
            default:
                return k42.f5669h ? k42.m3783h(j, obj) : k42.m3784i(j, obj);
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: g */
    public final double mo3101g(long j, Object obj) {
        switch (this.f4449b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m3555j(j, obj));
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: h */
    public final float mo3102h(long j, Object obj) {
        switch (this.f4449b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m3554i(j, obj));
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: m */
    public final void mo3103m(Object obj, long j, boolean z) {
        switch (this.f4449b) {
            case 0:
                if (!k42.f5669h) {
                    k42.m3788m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    k42.m3787l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!k42.f5669h) {
                    k42.m3788m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    k42.m3787l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: n */
    public final void mo3104n(Object obj, long j, byte b) {
        switch (this.f4449b) {
            case 0:
                if (!k42.f5669h) {
                    k42.m3788m(obj, j, b);
                } else {
                    k42.m3787l(obj, j, b);
                }
                break;
            default:
                if (!k42.f5669h) {
                    k42.m3788m(obj, j, b);
                } else {
                    k42.m3787l(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: o */
    public final void mo3105o(Object obj, long j, double d) {
        switch (this.f4449b) {
            case 0:
                m3559r(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m3559r(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: p */
    public final void mo3106p(Object obj, long j, float f) {
        switch (this.f4449b) {
            case 0:
                m3558q(obj, Float.floatToIntBits(f), j);
                break;
            default:
                m3558q(obj, Float.floatToIntBits(f), j);
                break;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: u */
    public final boolean mo3107u() {
        switch (this.f4449b) {
        }
        return false;
    }
}
