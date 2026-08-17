package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: rh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1369rh extends C1533vx {

    /* JADX INFO: renamed from: s */
    public long f10019s;

    /* JADX INFO: renamed from: t */
    public int f10020t;

    /* JADX INFO: renamed from: u */
    public int f10021u;

    @Override // p000.C1533vx
    /* JADX INFO: renamed from: r */
    public final void mo5844r() {
        super.mo5844r();
        this.f10020t = 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5845v(C1533vx c1533vx) {
        ByteBuffer byteBuffer;
        ki0.m3857c(!c1533vx.m4599i(1073741824));
        ki0.m3857c(!c1533vx.m4599i(268435456));
        ki0.m3857c(!c1533vx.m4599i(4));
        if (m5846w()) {
            if (this.f10020t >= this.f10021u) {
                return false;
            }
            ByteBuffer byteBuffer2 = c1533vx.f11795n;
            if (byteBuffer2 != null && (byteBuffer = this.f11795n) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f10020t;
        this.f10020t = i + 1;
        if (i == 0) {
            this.f11797p = c1533vx.f11797p;
            if (c1533vx.m4599i(1)) {
                this.f7542b = 1;
            }
        }
        ByteBuffer byteBuffer3 = c1533vx.f11795n;
        if (byteBuffer3 != null) {
            m6664t(byteBuffer3.remaining());
            this.f11795n.put(byteBuffer3);
        }
        this.f10019s = c1533vx.f11797p;
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5846w() {
        return this.f10020t > 0;
    }
}
