package p000;

import android.sun.security.util.DerValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final zi1 f11323a;

    /* JADX INFO: renamed from: b */
    public final sk0 f11324b;

    /* JADX INFO: renamed from: c */
    public final pk0 f11325c;

    public uk0(zi1 zi1Var) {
        this.f11323a = zi1Var;
        sk0 sk0Var = new sk0(zi1Var);
        this.f11324b = sk0Var;
        this.f11325c = new pk0(sk0Var);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6497c(x91 x91Var) throws IOException {
        boolean z;
        yk0 yk0Var;
        b70 b70Var;
        ib1 ib1Var;
        int i = 0;
        try {
            this.f11323a.mo4214t(9L);
            int iM6802a = wk0.m6802a(this.f11323a);
            if (iM6802a < 0 || iM6802a > 16384) {
                wk0.m6804c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM6802a));
                throw null;
            }
            byte b = (byte) (this.f11323a.readByte() & 255);
            byte b2 = (byte) (this.f11323a.readByte() & 255);
            int i2 = this.f11323a.readInt() & Integer.MAX_VALUE;
            Logger logger = wk0.f12207a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(tk0.m6284a(true, i2, iM6802a, b, b2));
            }
            switch (b) {
                case 0:
                    m6498d(x91Var, iM6802a, b2, i2);
                    return true;
                case 1:
                    m6500g(x91Var, iM6802a, b2, i2);
                    return true;
                case 2:
                    if (iM6802a != 5) {
                        wk0.m6804c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM6802a));
                        throw null;
                    }
                    if (i2 == 0) {
                        wk0.m6804c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    zi1 zi1Var = this.f11323a;
                    zi1Var.readInt();
                    zi1Var.readByte();
                    return true;
                case 3:
                    m6502l(x91Var, iM6802a, i2);
                    return true;
                case 4:
                    m6503o(x91Var, iM6802a, b2, i2);
                    return true;
                case 5:
                    m6501j(x91Var, iM6802a, b2, i2);
                    return true;
                case 6:
                    z = true;
                    if (iM6802a != 8) {
                        wk0.m6804c("TYPE_PING length != 8: %s", Integer.valueOf(iM6802a));
                        throw null;
                    }
                    if (i2 != 0) {
                        wk0.m6804c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i3 = this.f11323a.readInt();
                    int i4 = this.f11323a.readInt();
                    i = (b2 & 1) != 0 ? 1 : 0;
                    long j = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                    x91Var.f12501a.m5592O(1, j);
                    Object obj = x91Var.f12504d.f12899k;
                    if (i != 0) {
                        synchronized (obj) {
                            try {
                                y91 y91Var = x91Var.f12504d;
                                yk0Var = y91Var.f12912x;
                                if (yk0Var != null) {
                                    long j2 = yk0Var.f13001a;
                                    if (j2 == j) {
                                        y91Var.f12912x = null;
                                    } else {
                                        Logger logger2 = y91.f12872R;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                                    }
                                } else {
                                    y91.f12872R.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                yk0Var = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (yk0Var != null) {
                            synchronized (yk0Var) {
                                try {
                                    if (!yk0Var.f13004d) {
                                        yk0Var.f13004d = true;
                                        long jM6141a = yk0Var.f13002b.m6141a();
                                        yk0Var.f13006f = jM6141a;
                                        LinkedHashMap linkedHashMap = yk0Var.f13003c;
                                        yk0Var.f13003c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new xk0((uq0) entry.getKey(), jM6141a));
                                            } catch (Throwable th2) {
                                                yk0.f13000g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (obj) {
                            x91Var.f12504d.f12897i.m2733e(i3, i4, true);
                            break;
                        }
                    }
                    return z;
                case 7:
                    zi1 zi1Var2 = this.f11323a;
                    if (iM6802a < 8) {
                        wk0.m6804c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iM6802a));
                        throw null;
                    }
                    if (i2 != 0) {
                        wk0.m6804c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i5 = zi1Var2.readInt();
                    int i6 = zi1Var2.readInt();
                    int i7 = iM6802a - 8;
                    b70[] b70VarArrValues = b70.values();
                    int length = b70VarArrValues.length;
                    while (true) {
                        if (i < length) {
                            b70Var = b70VarArrValues[i];
                            if (b70Var.f1246a != i6) {
                                i++;
                            }
                        } else {
                            b70Var = null;
                        }
                    }
                    if (b70Var == null) {
                        wk0.m6804c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i6));
                        throw null;
                    }
                    C0717hk c0717hkMo4199b = C0717hk.f4607d;
                    if (i7 > 0) {
                        c0717hkMo4199b = zi1Var2.mo4199b(i7);
                    }
                    y91 y91Var2 = x91Var.f12504d;
                    x91Var.f12501a.m5591N(1, i5, b70Var, c0717hkMo4199b);
                    if (b70Var == b70.ENHANCE_YOUR_CALM) {
                        String strM3172m = c0717hkMo4199b.m3172m();
                        y91.f12872R.log(Level.WARNING, x91Var + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strM3172m);
                        if ("too_many_pings".equals(strM3172m)) {
                            y91Var2.f12883K.run();
                        }
                    }
                    long j3 = b70Var.f1246a;
                    ui0[] ui0VarArr = ui0.f11304d;
                    ui0 ui0Var = (j3 >= ((long) ui0VarArr.length) || j3 < 0) ? null : ui0VarArr[(int) j3];
                    nv1 nv1VarM4611a = (ui0Var == null ? nv1.m4609c(ui0.f11303c.f11307b.f7562a.f7126a).m4614g("Unrecognized HTTP/2 error code: " + j3) : ui0Var.f11307b).m4611a("Received Goaway");
                    if (c0717hkMo4199b.mo3164d() > 0) {
                        nv1VarM4611a = nv1VarM4611a.m4611a(c0717hkMo4199b.m3172m());
                    }
                    Map map = y91.f12871Q;
                    y91Var2.m7065r(i5, null, nv1VarM4611a);
                    return true;
                case 8:
                    if (iM6802a != 4) {
                        wk0.m6804c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM6802a));
                        throw null;
                    }
                    long j4 = ((long) this.f11323a.readInt()) & 2147483647L;
                    if (j4 == 0) {
                        wk0.m6804c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    x91Var.f12501a.m5595R(1, i2, j4);
                    y91 y91Var3 = x91Var.f12504d;
                    if (j4 == 0) {
                        if (i2 == 0) {
                            y91.m7052a(y91Var3, "Received 0 flow control window increment.");
                            return true;
                        }
                        y91Var3.m7057i(i2, nv1.f7558m.m4614g("Received 0 flow control window increment."), EnumC1376ro.f10079a, false, b70.PROTOCOL_ERROR, null);
                        return true;
                    }
                    z = true;
                    synchronized (y91Var3.f12899k) {
                        y91 y91Var4 = x91Var.f12504d;
                        try {
                            if (i2 == 0) {
                                y91Var4.f12898j.m4145f(null, (int) j4);
                                return true;
                            }
                            v91 v91Var = (v91) y91Var4.f12902n.get(Integer.valueOf(i2));
                            y91 y91Var5 = x91Var.f12504d;
                            if (v91Var != null) {
                                l81 l81Var = y91Var5.f12898j;
                                u91 u91Var = v91Var.f11594l;
                                synchronized (u91Var.f11220v) {
                                    ib1Var = u91Var.f11196I;
                                    break;
                                }
                                l81Var.m4145f(ib1Var, (int) j4);
                            } else if (!y91Var5.m7061m(i2)) {
                                i = 1;
                            }
                            if (i != 0) {
                                y91.m7052a(x91Var.f12504d, "Received window_update for unknown stream: " + i2);
                                return true;
                            }
                            return z;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                default:
                    this.f11323a.skip(iM6802a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11323a.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m6498d(x91 x91Var, int i, byte b, int i2) throws IOException {
        v91 v91Var;
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            wk0.m6804c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short s = (b & 8) != 0 ? (short) (this.f11323a.readByte() & 255) : (short) 0;
        int iM6803b = wk0.m6803b(i, b, s);
        zi1 zi1Var = this.f11323a;
        x91Var.f12501a.m5590M(1, i2, zi1Var.f13426b, iM6803b, z);
        y91 y91Var = x91Var.f12504d;
        synchronized (y91Var.f12899k) {
            v91Var = (v91) y91Var.f12902n.get(Integer.valueOf(i2));
        }
        if (v91Var == null) {
            boolean zM7061m = x91Var.f12504d.m7061m(i2);
            y91 y91Var2 = x91Var.f12504d;
            if (zM7061m) {
                synchronized (y91Var2.f12899k) {
                    x91Var.f12504d.f12897i.m2734g(i2, b70.STREAM_CLOSED);
                }
                zi1Var.skip(iM6803b);
            } else {
                y91.m7052a(y91Var2, "Received data for unknown stream: " + i2);
            }
            this.f11323a.skip(s);
        }
        long j = iM6803b;
        zi1Var.mo4214t(j);
        C1073lj c1073lj = new C1073lj();
        c1073lj.mo956q(j, zi1Var.f13426b);
        bz1 bz1Var = v91Var.f11594l.f11195H;
        jc1.f5363a.getClass();
        synchronized (x91Var.f12504d.f12899k) {
            v91Var.f11594l.m6420j(i - iM6803b, c1073lj, z);
        }
        y91 y91Var3 = x91Var.f12504d;
        int i3 = y91Var3.f12907s + i;
        y91Var3.f12907s = i3;
        if (i3 >= y91Var3.f12894f * 0.5f) {
            synchronized (y91Var3.f12899k) {
                y91 y91Var4 = x91Var.f12504d;
                y91Var4.f12897i.m2735j(0, y91Var4.f12907s);
            }
            x91Var.f12504d.f12907s = 0;
        }
        this.f11323a.skip(s);
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m6499e(int i, short s, byte b, int i2) throws IOException {
        sk0 sk0Var = this.f11324b;
        sk0Var.f10431e = i;
        sk0Var.f10428b = i;
        sk0Var.f10432f = s;
        sk0Var.f10429c = b;
        sk0Var.f10430d = i2;
        pk0 pk0Var = this.f11325c;
        zi1 zi1Var = pk0Var.f8917b;
        ArrayList arrayList = pk0Var.f8916a;
        while (!zi1Var.m7310c()) {
            byte b2 = zi1Var.readByte();
            int i3 = b2 & 255;
            if (i3 == 128) {
                ca0.m1178j("index == 0");
                return null;
            }
            if ((b2 & DerValue.TAG_CONTEXT) == 128) {
                int iM5272e = pk0Var.m5272e(i3, 127);
                int i4 = iM5272e - 1;
                if (i4 >= 0) {
                    yj0[] yj0VarArr = rk0.f10067b;
                    if (i4 <= yj0VarArr.length - 1) {
                        arrayList.add(yj0VarArr[i4]);
                    }
                }
                int length = pk0Var.f8921f + 1 + (i4 - rk0.f10067b.length);
                if (length >= 0) {
                    yj0[] yj0VarArr2 = pk0Var.f8920e;
                    if (length <= yj0VarArr2.length - 1) {
                        arrayList.add(yj0VarArr2[length]);
                    }
                }
                ca0.m1178j(jd0.m3609g(iM5272e, "Header index too large "));
                return null;
            }
            if (i3 == 64) {
                C0717hk c0717hkM5271d = pk0Var.m5271d();
                rk0.m5856a(c0717hkM5271d);
                pk0Var.m5270c(new yj0(c0717hkM5271d, pk0Var.m5271d()));
            } else if ((b2 & DerValue.TAG_APPLICATION) == 64) {
                pk0Var.m5270c(new yj0(pk0Var.m5269b(pk0Var.m5272e(i3, 63) - 1), pk0Var.m5271d()));
            } else if ((b2 & 32) == 32) {
                int iM5272e2 = pk0Var.m5272e(i3, 31);
                pk0Var.f8919d = iM5272e2;
                if (iM5272e2 < 0 || iM5272e2 > pk0Var.f8918c) {
                    f40.m2710f(pk0Var.f8919d, "Invalid dynamic table size update ");
                    return null;
                }
                int i5 = pk0Var.f8923h;
                if (iM5272e2 < i5) {
                    if (iM5272e2 == 0) {
                        Arrays.fill(pk0Var.f8920e, (Object) null);
                        pk0Var.f8921f = pk0Var.f8920e.length - 1;
                        pk0Var.f8922g = 0;
                        pk0Var.f8923h = 0;
                    } else {
                        pk0Var.m5268a(i5 - iM5272e2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                C0717hk c0717hkM5271d2 = pk0Var.m5271d();
                rk0.m5856a(c0717hkM5271d2);
                arrayList.add(new yj0(c0717hkM5271d2, pk0Var.m5271d()));
            } else {
                arrayList.add(new yj0(pk0Var.m5269b(pk0Var.m5272e(i3, 15) - 1), pk0Var.m5271d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public final void m6500g(x91 x91Var, int i, byte b, int i2) throws IOException {
        nv1 nv1VarM4614g = null;
        boolean z = false;
        if (i2 == 0) {
            wk0.m6804c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f11323a.readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            zi1 zi1Var = this.f11323a;
            zi1Var.readInt();
            zi1Var.readByte();
            i -= 5;
        }
        ArrayList arrayListM6499e = m6499e(wk0.m6803b(i, b, s), s, b, i2);
        qo0 qo0Var = x91Var.f12501a;
        if (qo0Var.m5588K()) {
            ((Logger) qo0Var.f9548b).log((Level) qo0Var.f9549c, "INBOUND HEADERS: streamId=" + i2 + " headers=" + arrayListM6499e + " endStream=" + z2);
        }
        if (x91Var.f12504d.f12884L != Integer.MAX_VALUE) {
            long jMo3164d = 0;
            for (int i3 = 0; i3 < arrayListM6499e.size(); i3++) {
                yj0 yj0Var = (yj0) arrayListM6499e.get(i3);
                jMo3164d += (long) (yj0Var.f12996b.mo3164d() + yj0Var.f12995a.mo3164d() + 32);
            }
            int iMin = (int) Math.min(jMo3164d, 2147483647L);
            int i4 = x91Var.f12504d.f12884L;
            if (iMin > i4) {
                nv1 nv1Var = nv1.f7556k;
                Locale locale = Locale.US;
                nv1VarM4614g = nv1Var.m4614g("Response " + (z2 ? "trailer" : "header") + " metadata larger than " + i4 + ": " + iMin);
            }
        }
        synchronized (x91Var.f12504d.f12899k) {
            try {
                v91 v91Var = (v91) x91Var.f12504d.f12902n.get(Integer.valueOf(i2));
                if (v91Var == null) {
                    if (x91Var.f12504d.m7061m(i2)) {
                        x91Var.f12504d.f12897i.m2734g(i2, b70.STREAM_CLOSED);
                    } else {
                        z = true;
                    }
                } else if (nv1VarM4614g == null) {
                    bz1 bz1Var = v91Var.f11594l.f11195H;
                    jc1.f5363a.getClass();
                    v91Var.f11594l.m6421k(arrayListM6499e, z2);
                } else {
                    if (!z2) {
                        x91Var.f12504d.f12897i.m2734g(i2, b70.CANCEL);
                    }
                    v91Var.f11594l.m6423m(nv1VarM4614g, false, new j51());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            y91.m7052a(x91Var.f12504d, "Received header for unknown stream: " + i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6501j(x91 x91Var, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            wk0.m6804c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s = (b & 8) != 0 ? (short) (this.f11323a.readByte() & 255) : (short) 0;
        int i3 = this.f11323a.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListM6499e = m6499e(wk0.m6803b(i - 4, b, s), s, b, i2);
        qo0 qo0Var = x91Var.f12501a;
        if (qo0Var.m5588K()) {
            ((Logger) qo0Var.f9548b).log((Level) qo0Var.f9549c, "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + arrayListM6499e);
        }
        synchronized (x91Var.f12504d.f12899k) {
            x91Var.f12504d.f12897i.m2734g(i2, b70.PROTOCOL_ERROR);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6502l(x91 x91Var, int i, int i2) throws IOException {
        b70 b70Var;
        if (i != 4) {
            wk0.m6804c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            wk0.m6804c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i3 = this.f11323a.readInt();
        b70[] b70VarArrValues = b70.values();
        int length = b70VarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                b70Var = null;
                break;
            }
            b70Var = b70VarArrValues[i4];
            if (b70Var.f1246a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (b70Var == null) {
            wk0.m6804c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
            throw null;
        }
        x91Var.f12501a.m5593P(1, i2, b70Var);
        nv1 nv1VarM4611a = y91.m7055v(b70Var).m4611a("Rst Stream");
        mv1 mv1Var = nv1VarM4611a.f7562a;
        boolean z = mv1Var == mv1.CANCELLED || mv1Var == mv1.DEADLINE_EXCEEDED;
        synchronized (x91Var.f12504d.f12899k) {
            try {
                v91 v91Var = (v91) x91Var.f12504d.f12902n.get(Integer.valueOf(i2));
                if (v91Var != null) {
                    bz1 bz1Var = v91Var.f11594l.f11195H;
                    jc1.f5363a.getClass();
                    x91Var.f12504d.m7057i(i2, nv1VarM4611a, b70Var == b70.REFUSED_STREAM ? EnumC1376ro.f10080b : EnumC1376ro.f10079a, z, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6503o(x91 x91Var, int i, byte b, int i2) throws IOException {
        boolean z;
        int i3 = 0;
        if (i2 != 0) {
            wk0.m6804c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                return;
            }
            wk0.m6804c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 != 0) {
            wk0.m6804c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        C1296pi c1296pi = new C1296pi(4, false);
        int i4 = 0;
        while (true) {
            short s = 7;
            if (i4 >= i) {
                x91Var.f12501a.m5594Q(1, c1296pi);
                synchronized (x91Var.f12504d.f12899k) {
                    try {
                        if (c1296pi.m5261g(4)) {
                            x91Var.f12504d.f12876D = ((int[]) c1296pi.f8902b)[4];
                        }
                        if (c1296pi.m5261g(7)) {
                            int i5 = ((int[]) c1296pi.f8902b)[7];
                            l81 l81Var = x91Var.f12504d.f12898j;
                            if (i5 >= 0) {
                                int i6 = i5 - l81Var.f6260a;
                                l81Var.f6260a = i5;
                                for (ib1 ib1Var : ((y91) l81Var.f6261b).m7058j()) {
                                    ib1Var.m3416a(i6);
                                }
                                z = i6 > 0;
                            } else {
                                l81Var.getClass();
                                f40.m2713i(jd0.m3609g(i5, "Invalid initial window size: "));
                            }
                        }
                        if (x91Var.f12503c) {
                            y91 y91Var = x91Var.f12504d;
                            C1548wb c1548wb = y91Var.f12896h;
                            C1437tb c1437tb = y91Var.f12909u;
                            Iterator it = ((gp0) c1548wb.f12048d).f4270j.iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                throw new ClassCastException();
                            }
                            y91Var.f12909u = c1437tb;
                            C1548wb c1548wb2 = x91Var.f12504d.f12896h;
                            gp0 gp0Var = (gp0) c1548wb2.f12048d;
                            gp0Var.f4269i.mo2841G(2, "READY");
                            gp0Var.f4271k.execute(new ep0(c1548wb2, i3));
                            x91Var.f12503c = false;
                        }
                        f70 f70Var = x91Var.f12504d.f12897i;
                        qo0 qo0Var = f70Var.f3649c;
                        if (qo0Var.m5588K()) {
                            ((Logger) qo0Var.f9548b).log((Level) qo0Var.f9549c, "OUTBOUND".concat(" SETTINGS: ack=true"));
                        }
                        try {
                            f70Var.f3648b.m7268c(c1296pi);
                        } catch (IOException e) {
                            f70Var.f3647a.m7063o(e);
                        }
                        if (z) {
                            x91Var.f12504d.f12898j.m4146g();
                        }
                        x91Var.f12504d.m7066s();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i7 = c1296pi.f8901a;
                if (((i7 & 2) != 0 ? ((int[]) c1296pi.f8902b)[1] : -1) >= 0) {
                    pk0 pk0Var = this.f11325c;
                    int i8 = (i7 & 2) != 0 ? ((int[]) c1296pi.f8902b)[1] : -1;
                    pk0Var.f8918c = i8;
                    pk0Var.f8919d = i8;
                    int i9 = pk0Var.f8923h;
                    if (i8 < i9) {
                        if (i8 != 0) {
                            pk0Var.m5268a(i9 - i8);
                            return;
                        }
                        Arrays.fill(pk0Var.f8920e, (Object) null);
                        pk0Var.f8921f = pk0Var.f8920e.length - 1;
                        pk0Var.f8922g = 0;
                        pk0Var.f8923h = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            short s2 = this.f11323a.readShort();
            int i10 = this.f11323a.readInt();
            switch (s2) {
                case 1:
                case 6:
                    s = s2;
                    break;
                case 2:
                    if (i10 != 0 && i10 != 1) {
                        wk0.m6804c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s = s2;
                    break;
                    break;
                case 3:
                    s = 4;
                    break;
                case 4:
                    if (i10 < 0) {
                        wk0.m6804c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 5:
                    if (i10 < 16384 || i10 > 16777215) {
                        wk0.m6804c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i10));
                        throw null;
                    }
                    s = s2;
                    break;
                    break;
                default:
                    continue;
                    i4 += 6;
                    break;
            }
            c1296pi.m5263k(s, i10);
            i4 += 6;
        }
    }
}
