package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: rr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1379rr extends AbstractC1353r1 {

    /* JADX INFO: renamed from: e */
    public static final bz1 f10103e = new bz1(14);

    /* JADX INFO: renamed from: f */
    public static final k50 f10104f = new k50((byte) 0, 15);

    /* JADX INFO: renamed from: g */
    public static final bz1 f10105g = new bz1(15);

    /* JADX INFO: renamed from: m */
    public static final k50 f10106m = new k50((byte) 0, 16);

    /* JADX INFO: renamed from: n */
    public static final bz1 f10107n = new bz1(16);

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f10108a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f10109b;

    /* JADX INFO: renamed from: c */
    public int f10110c;

    /* JADX INFO: renamed from: d */
    public boolean f10111d;

    public C1379rr() {
        new ArrayDeque(2);
        this.f10108a = new ArrayDeque();
    }

    /* JADX INFO: renamed from: A */
    public final int m5892A(InterfaceC1342qr interfaceC1342qr, int i, Object obj, int i2) throws IOException {
        m5652c(i);
        ArrayDeque arrayDeque = this.f10108a;
        if (!arrayDeque.isEmpty() && ((AbstractC1353r1) arrayDeque.peek()).mo1196r() == 0) {
            m5895z();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            AbstractC1353r1 abstractC1353r1 = (AbstractC1353r1) arrayDeque.peek();
            int iMin = Math.min(i, abstractC1353r1.mo1196r());
            i2 = interfaceC1342qr.mo1087o(abstractC1353r1, iMin, obj, i2);
            i -= iMin;
            this.f10110c -= iMin;
            if (((AbstractC1353r1) arrayDeque.peek()).mo1196r() == 0) {
                m5895z();
            }
        }
        if (i <= 0) {
            return i2;
        }
        f40.m2711g("Failed executing read operation");
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m5893B(InterfaceC1305pr interfaceC1305pr, int i, Object obj, int i2) {
        try {
            return m5892A(interfaceC1305pr, i, obj, i2);
        } catch (IOException e) {
            f40.m2711g(e);
            return 0;
        }
    }

    @Override // p000.AbstractC1353r1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f10108a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC1353r1) arrayDeque.remove()).close();
            }
        }
        if (this.f10109b != null) {
            while (!this.f10109b.isEmpty()) {
                ((AbstractC1353r1) this.f10109b.remove()).close();
            }
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: d */
    public final void mo5653d() throws IOException {
        ArrayDeque arrayDeque = this.f10109b;
        ArrayDeque arrayDeque2 = this.f10108a;
        if (arrayDeque == null) {
            this.f10109b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f10109b.isEmpty()) {
            ((AbstractC1353r1) this.f10109b.remove()).close();
        }
        this.f10111d = true;
        AbstractC1353r1 abstractC1353r1 = (AbstractC1353r1) arrayDeque2.peek();
        if (abstractC1353r1 != null) {
            abstractC1353r1.mo5653d();
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: e */
    public final boolean mo5654e() {
        Iterator it = this.f10108a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC1353r1) it.next()).mo5654e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [r1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [r1] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [rr] */
    /* JADX WARN: Type inference failed for: r1v3, types: [rr] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC1353r1 mo1191g(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            wi1 r7 = p000.xi1.f12615a
            return r7
        L5:
            r7.m5652c(r8)
            int r0 = r7.f10110c
            int r0 = r0 - r8
            r7.f10110c = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f10108a
            java.lang.Object r3 = r2.peek()
            r1 r3 = (p000.AbstractC1353r1) r3
            int r4 = r3.mo1196r()
            if (r4 <= r8) goto L23
            r1 r8 = r3.mo1191g(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f10111d
            if (r5 == 0) goto L2f
            r1 r3 = r3.mo1191g(r4)
            r7.m5895z()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            r1 r3 = (p000.AbstractC1353r1) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            rr r1 = new rr
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.m5894y(r0)
            r0 = r1
        L57:
            r1.m5894y(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1379rr.mo1191g(int):r1");
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: j */
    public final void mo1192j(int i, int i2, byte[] bArr) {
        m5893B(f10105g, i2, bArr, i);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: l */
    public final void mo1193l(OutputStream outputStream, int i) throws IOException {
        m5892A(f10107n, i, outputStream, 0);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: o */
    public final void mo1194o(ByteBuffer byteBuffer) {
        m5893B(f10106m, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: p */
    public final int mo1195p() {
        return m5893B(f10103e, 1, null, 0);
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: r */
    public final int mo1196r() {
        return this.f10110c;
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: s */
    public final void mo5655s() {
        if (!this.f10111d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f10108a;
        AbstractC1353r1 abstractC1353r1 = (AbstractC1353r1) arrayDeque.peek();
        if (abstractC1353r1 != null) {
            int iMo1196r = abstractC1353r1.mo1196r();
            abstractC1353r1.mo5655s();
            this.f10110c = (abstractC1353r1.mo1196r() - iMo1196r) + this.f10110c;
        }
        while (true) {
            AbstractC1353r1 abstractC1353r2 = (AbstractC1353r1) this.f10109b.pollLast();
            if (abstractC1353r2 == null) {
                return;
            }
            abstractC1353r2.mo5655s();
            arrayDeque.addFirst(abstractC1353r2);
            this.f10110c = abstractC1353r2.mo1196r() + this.f10110c;
        }
    }

    @Override // p000.AbstractC1353r1
    /* JADX INFO: renamed from: x */
    public final void mo1197x(int i) {
        m5893B(f10104f, i, null, 0);
    }

    /* JADX INFO: renamed from: y */
    public final void m5894y(AbstractC1353r1 abstractC1353r1) throws IOException {
        boolean z = this.f10111d;
        ArrayDeque arrayDeque = this.f10108a;
        boolean z2 = z && arrayDeque.isEmpty();
        if (abstractC1353r1 instanceof C1379rr) {
            C1379rr c1379rr = (C1379rr) abstractC1353r1;
            ArrayDeque arrayDeque2 = c1379rr.f10108a;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((AbstractC1353r1) arrayDeque2.remove());
            }
            this.f10110c += c1379rr.f10110c;
            c1379rr.f10110c = 0;
            c1379rr.close();
        } else {
            arrayDeque.add(abstractC1353r1);
            this.f10110c = abstractC1353r1.mo1196r() + this.f10110c;
        }
        if (z2) {
            ((AbstractC1353r1) arrayDeque.peek()).mo5653d();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5895z() throws IOException {
        boolean z = this.f10111d;
        ArrayDeque arrayDeque = this.f10108a;
        if (!z) {
            ((AbstractC1353r1) arrayDeque.remove()).close();
            return;
        }
        this.f10109b.add((AbstractC1353r1) arrayDeque.remove());
        AbstractC1353r1 abstractC1353r1 = (AbstractC1353r1) arrayDeque.peek();
        if (abstractC1353r1 != null) {
            abstractC1353r1.mo5653d();
        }
    }

    public C1379rr(int i) {
        new ArrayDeque(2);
        this.f10108a = new ArrayDeque(i);
    }
}
