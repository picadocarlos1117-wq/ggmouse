package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final yi1 f11693a;

    /* JADX INFO: renamed from: b */
    public final C1073lj f11694b;

    /* JADX INFO: renamed from: c */
    public final qk0 f11695c;

    /* JADX INFO: renamed from: d */
    public int f11696d;

    /* JADX INFO: renamed from: e */
    public boolean f11697e;

    public vk0(yi1 yi1Var) {
        this.f11693a = yi1Var;
        C1073lj c1073lj = new C1073lj();
        this.f11694b = c1073lj;
        this.f11695c = new qk0(c1073lj);
        this.f11696d = PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE;
    }

    /* JADX INFO: renamed from: c */
    public final void m6639c(int i, int i2, byte b, byte b2) {
        Logger logger = wk0.f12207a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(tk0.m6284a(false, i, i2, b, b2));
        }
        int i3 = this.f11696d;
        if (i2 > i3) {
            Locale locale = Locale.US;
            f40.m2713i(AbstractC1308pu.m5338e("FRAME_SIZE_ERROR length > ", i3, i2, ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Locale locale2 = Locale.US;
            f40.m2713i(jd0.m3609g(i, "reserved bit set: "));
            return;
        }
        yi1 yi1Var = this.f11693a;
        yi1Var.writeByte((i2 >>> 16) & 255);
        yi1Var.writeByte((i2 >>> 8) & 255);
        yi1Var.writeByte(i2 & 255);
        yi1Var.writeByte(b & 255);
        yi1Var.writeByte(b2 & 255);
        yi1Var.writeInt(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f11697e = true;
        this.f11693a.close();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: d */
    public final void m6640d(int i, List list, boolean z) throws IOException {
        int length;
        int length2;
        if (this.f11697e) {
            ca0.m1178j("closed");
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            yj0 yj0Var = (yj0) list.get(i2);
            C0717hk c0717hkMo3170k = yj0Var.f12995a.mo3170k();
            C0717hk c0717hk = yj0Var.f12996b;
            Integer num = (Integer) rk0.f10068c.get(c0717hkMo3170k);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 < 2 || length2 > 7) {
                    length = length2;
                    length2 = -1;
                } else {
                    yj0[] yj0VarArr = rk0.f10067b;
                    if (yj0VarArr[iIntValue].f12996b.equals(c0717hk)) {
                        length = length2;
                    } else if (yj0VarArr[length2].f12996b.equals(c0717hk)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            qk0 qk0Var = this.f11695c;
            if (length2 == -1) {
                int i3 = qk0Var.f9520b + 1;
                while (true) {
                    yj0[] yj0VarArr2 = (yj0[]) qk0Var.f9523e;
                    if (i3 >= yj0VarArr2.length) {
                        break;
                    }
                    if (yj0VarArr2[i3].f12995a.equals(c0717hkMo3170k)) {
                        if (((yj0[]) qk0Var.f9523e)[i3].f12996b.equals(c0717hk)) {
                            length2 = (i3 - qk0Var.f9520b) + rk0.f10067b.length;
                            break;
                        } else if (length == -1) {
                            length = (i3 - qk0Var.f9520b) + rk0.f10067b.length;
                        }
                    }
                    i3++;
                }
            }
            if (length2 != -1) {
                qk0Var.m5502e(length2, 127, 128);
            } else if (length == -1) {
                ((C1073lj) qk0Var.f9522d).m4192D(64);
                qk0Var.m5501d(c0717hkMo3170k);
                qk0Var.m5501d(c0717hk);
                qk0Var.m5499b(yj0Var);
            } else {
                C0717hk c0717hk2 = rk0.f10066a;
                c0717hkMo3170k.getClass();
                c0717hk2.getClass();
                if (!c0717hkMo3170k.mo3169j(c0717hk2, c0717hk2.mo3164d()) || yj0.f12994h.equals(c0717hkMo3170k)) {
                    qk0Var.m5502e(length, 63, 64);
                    qk0Var.m5501d(c0717hk);
                    qk0Var.m5499b(yj0Var);
                } else {
                    qk0Var.m5502e(length, 15, 0);
                    qk0Var.m5501d(c0717hk);
                }
            }
        }
        C1073lj c1073lj = this.f11694b;
        long j = c1073lj.f6361b;
        int iMin = (int) Math.min(this.f11696d, j);
        long j2 = iMin;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m6639c(i, iMin, (byte) 1, b);
        yi1 yi1Var = this.f11693a;
        yi1Var.mo956q(j2, c1073lj);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int iMin2 = (int) Math.min(this.f11696d, j3);
                long j4 = iMin2;
                j3 -= j4;
                m6639c(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                yi1Var.mo956q(j4, c1073lj);
            }
        }
    }
}
