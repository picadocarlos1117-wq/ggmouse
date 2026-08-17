package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 implements gg0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1128n0 f11516a;

    /* JADX INFO: renamed from: c */
    public fa1 f11518c;

    /* JADX INFO: renamed from: h */
    public final ax0 f11523h;

    /* JADX INFO: renamed from: i */
    public final kv1 f11524i;

    /* JADX INFO: renamed from: j */
    public boolean f11525j;

    /* JADX INFO: renamed from: k */
    public int f11526k;

    /* JADX INFO: renamed from: m */
    public long f11528m;

    /* JADX INFO: renamed from: b */
    public int f11517b = -1;

    /* JADX INFO: renamed from: d */
    public k50 f11519d = k50.f5671c;

    /* JADX INFO: renamed from: e */
    public boolean f11520e = true;

    /* JADX INFO: renamed from: f */
    public final u41 f11521f = new u41(this);

    /* JADX INFO: renamed from: g */
    public final ByteBuffer f11522g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l */
    public int f11527l = -1;

    public v41(AbstractC1128n0 abstractC1128n0, ax0 ax0Var, kv1 kv1Var) {
        this.f11516a = abstractC1128n0;
        this.f11523h = ax0Var;
        this.f11524i = kv1Var;
    }

    /* JADX INFO: renamed from: h */
    public static int m6564h(kh1 kh1Var, OutputStream outputStream) throws IOException {
        y41 y41Var = kh1Var.f5823a;
        if (y41Var != null) {
            int serializedSize = y41Var.getSerializedSize();
            kh1Var.f5823a.writeTo(outputStream);
            kh1Var.f5823a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = kh1Var.f5825c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        u80 u80Var = mh1.f6993a;
        p32.m5188s(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                kh1Var.f5825c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: a */
    public final gg0 mo2979a(boolean z) {
        this.f11520e = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m6565b(t41 t41Var, boolean z) {
        ArrayList arrayList = t41Var.f10746a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((fa1) obj).f3735c;
        }
        int i3 = this.f11517b;
        if (i3 >= 0 && i > i3) {
            nv1 nv1Var = nv1.f7556k;
            Locale locale = Locale.US;
            throw new qv1(nv1Var.m4614g("message too large " + i + " > " + i3));
        }
        ByteBuffer byteBuffer = this.f11522g;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i);
        this.f11523h.getClass();
        fa1 fa1VarM736m = ax0.m736m(5);
        fa1VarM736m.m2781a(byteBuffer.array(), 0, byteBuffer.position());
        if (i == 0) {
            this.f11518c = fa1VarM736m;
            return;
        }
        int i4 = this.f11526k - 1;
        AbstractC1128n0 abstractC1128n0 = this.f11516a;
        abstractC1128n0.m4495o(fa1VarM736m, false, false, i4);
        this.f11526k = 1;
        for (int i5 = 0; i5 < arrayList.size() - 1; i5++) {
            abstractC1128n0.m4495o((fa1) arrayList.get(i5), false, false, 0);
        }
        this.f11518c = (fa1) arrayList.get(arrayList.size() - 1);
        this.f11528m = i;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: c */
    public final gg0 mo2980c(k50 k50Var) {
        this.f11519d = k50Var;
        return this;
    }

    @Override // p000.gg0
    public final void close() {
        if (this.f11525j) {
            return;
        }
        this.f11525j = true;
        fa1 fa1Var = this.f11518c;
        if (fa1Var != null && fa1Var.f3735c == 0) {
            this.f11518c = null;
        }
        fa1 fa1Var2 = this.f11518c;
        this.f11518c = null;
        this.f11516a.m4495o(fa1Var2, true, true, this.f11526k);
        this.f11526k = 0;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: d */
    public final void mo2981d(int i) {
        p32.m5193x(this.f11517b == -1, "max size already set");
        this.f11517b = i;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public final void mo2982e(kh1 kh1Var) {
        if (this.f11525j) {
            f40.m2719o("Framer already closed");
            return;
        }
        this.f11526k++;
        int i = this.f11527l + 1;
        this.f11527l = i;
        this.f11528m = 0L;
        kv1 kv1Var = this.f11524i;
        rc2[] rc2VarArr = kv1Var.f6043a;
        rc2[] rc2VarArr2 = kv1Var.f6043a;
        int i2 = 0;
        for (rc2 rc2Var : rc2VarArr) {
            rc2Var.mo4523b0(i);
        }
        boolean z = this.f11520e && this.f11519d != k50.f5671c;
        try {
            int iAvailable = kh1Var.available();
            int iM6568i = (iAvailable == 0 || !z) ? m6568i(kh1Var, iAvailable) : m6566f(kh1Var);
            if (iAvailable != -1 && iM6568i != iAvailable) {
                throw new qv1(nv1.f7558m.m4614g(AbstractC1308pu.m5338e("Message length inaccurate ", iM6568i, iAvailable, " != ")));
            }
            long j = iM6568i;
            for (rc2 rc2Var2 : rc2VarArr2) {
                rc2Var2.mo4525d0(j);
            }
            long j2 = this.f11528m;
            for (rc2 rc2Var3 : rc2VarArr2) {
                rc2Var3.mo3181e0(j2);
            }
            int i3 = this.f11527l;
            long j3 = this.f11528m;
            rc2[] rc2VarArr3 = kv1Var.f6043a;
            int length = rc2VarArr3.length;
            while (i2 < length) {
                long j4 = j;
                rc2VarArr3[i2].mo4524c0(j3, j4, i3);
                i2++;
                j = j4;
            }
        } catch (IOException e) {
            throw new qv1(nv1.f7558m.m4614g("Failed to frame message").m4613f(e));
        } catch (qv1 e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw new qv1(nv1.f7558m.m4614g("Failed to frame message").m4613f(e3));
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m6566f(kh1 kh1Var) throws IOException {
        OutputStream gZIPOutputStream;
        t41 t41Var = new t41(this);
        switch (this.f11519d.f5678a) {
            case 2:
                gZIPOutputStream = t41Var;
                break;
            default:
                gZIPOutputStream = new GZIPOutputStream(t41Var);
                break;
        }
        try {
            int iM6564h = m6564h(kh1Var, gZIPOutputStream);
            gZIPOutputStream.close();
            int i = this.f11517b;
            if (i < 0 || iM6564h <= i) {
                m6565b(t41Var, true);
                return iM6564h;
            }
            nv1 nv1Var = nv1.f7556k;
            Locale locale = Locale.US;
            throw new qv1(nv1Var.m4614g("message too large " + iM6564h + " > " + i));
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    @Override // p000.gg0
    public final void flush() {
        fa1 fa1Var = this.f11518c;
        if (fa1Var == null || fa1Var.f3735c <= 0) {
            return;
        }
        this.f11518c = null;
        this.f11516a.m4495o(fa1Var, false, true, this.f11526k);
        this.f11526k = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m6567g(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            fa1 fa1Var = this.f11518c;
            if (fa1Var != null && fa1Var.f3734b == 0) {
                this.f11518c = null;
                this.f11516a.m4495o(fa1Var, false, false, this.f11526k);
                this.f11526k = 0;
            }
            if (this.f11518c == null) {
                this.f11523h.getClass();
                this.f11518c = ax0.m736m(i2);
            }
            int iMin = Math.min(i2, this.f11518c.f3734b);
            this.f11518c.m2781a(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m6568i(kh1 kh1Var, int i) throws IOException {
        if (i == -1) {
            t41 t41Var = new t41(this);
            int iM6564h = m6564h(kh1Var, t41Var);
            m6565b(t41Var, false);
            return iM6564h;
        }
        this.f11528m = i;
        int i2 = this.f11517b;
        if (i2 >= 0 && i > i2) {
            nv1 nv1Var = nv1.f7556k;
            Locale locale = Locale.US;
            throw new qv1(nv1Var.m4614g("message too large " + i + " > " + i2));
        }
        ByteBuffer byteBuffer = this.f11522g;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.f11518c == null) {
            int iPosition = byteBuffer.position() + i;
            this.f11523h.getClass();
            this.f11518c = ax0.m736m(iPosition);
        }
        m6567g(0, byteBuffer.position(), byteBuffer.array());
        return m6564h(kh1Var, this.f11521f);
    }

    @Override // p000.gg0
    public final boolean isClosed() {
        return this.f11525j;
    }
}
