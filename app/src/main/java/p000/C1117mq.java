package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1117mq extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: o */
    public static final Object f7065o = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f7066a;

    /* JADX INFO: renamed from: b */
    public transient int[] f7067b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f7068c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f7069d;

    /* JADX INFO: renamed from: e */
    public transient int f7070e;

    /* JADX INFO: renamed from: f */
    public transient int f7071f;

    /* JADX INFO: renamed from: g */
    public transient C1043kq f7072g;

    /* JADX INFO: renamed from: m */
    public transient C1043kq f7073m;

    /* JADX INFO: renamed from: n */
    public transient C1055l1 f7074n;

    /* JADX INFO: renamed from: a */
    public static C1117mq m4438a() {
        C1117mq c1117mq = new C1117mq();
        c1117mq.f7070e = Math.min(Math.max(8, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return c1117mq;
    }

    /* JADX INFO: renamed from: b */
    public final Map m4439b() {
        Object obj = this.f7066a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m4440c() {
        return (1 << (this.f7070e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m4443f()) {
            return;
        }
        this.f7070e += 32;
        Map mapM4439b = m4439b();
        if (mapM4439b != null) {
            this.f7070e = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapM4439b.clear();
            this.f7066a = null;
            this.f7071f = 0;
            return;
        }
        Arrays.fill(m4446i(), 0, this.f7071f, (Object) null);
        Arrays.fill(m4447j(), 0, this.f7071f, (Object) null);
        Object obj = this.f7066a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m4445h(), 0, this.f7071f, 0);
        this.f7071f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM4439b = m4439b();
        if (mapM4439b != null) {
            return mapM4439b.containsKey(obj);
        }
        return m4441d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM4439b = m4439b();
        if (mapM4439b != null) {
            return mapM4439b.containsValue(obj);
        }
        for (int i = 0; i < this.f7071f; i++) {
            if (hr1.m3275k(obj, m4447j()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m4441d(Object obj) {
        if (m4443f()) {
            return -1;
        }
        int iM5535e0 = AbstractC1337qm.m5535e0(obj);
        int iM4440c = m4440c();
        Object obj2 = this.f7066a;
        Objects.requireNonNull(obj2);
        int iM6438X = ua0.m6438X(iM5535e0 & iM4440c, obj2);
        if (iM6438X == 0) {
            return -1;
        }
        int i = ~iM4440c;
        int i2 = iM5535e0 & i;
        do {
            int i3 = iM6438X - 1;
            int i4 = m4445h()[i3];
            if ((i4 & i) == i2 && hr1.m3275k(obj, m4446i()[i3])) {
                return i3;
            }
            iM6438X = i4 & iM4440c;
        } while (iM6438X != 0);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m4442e(int i, int i2) {
        Object obj = this.f7066a;
        Objects.requireNonNull(obj);
        int[] iArrM4445h = m4445h();
        Object[] objArrM4446i = m4446i();
        Object[] objArrM4447j = m4447j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM4446i[i] = null;
            objArrM4447j[i] = null;
            iArrM4445h[i] = 0;
            return;
        }
        Object obj2 = objArrM4446i[i3];
        objArrM4446i[i] = obj2;
        objArrM4447j[i] = objArrM4447j[i3];
        objArrM4446i[i3] = null;
        objArrM4447j[i3] = null;
        iArrM4445h[i] = iArrM4445h[i3];
        iArrM4445h[i3] = 0;
        int iM5535e0 = AbstractC1337qm.m5535e0(obj2) & i2;
        int iM6438X = ua0.m6438X(iM5535e0, obj);
        if (iM6438X == size) {
            ua0.m6439Y(iM5535e0, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iM6438X - 1;
            int i5 = iArrM4445h[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrM4445h[i4] = ua0.m6427I(i5, i + 1, i2);
                return;
            }
            iM6438X = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1043kq c1043kq = this.f7073m;
        if (c1043kq != null) {
            return c1043kq;
        }
        C1043kq c1043kq2 = new C1043kq(this, 0);
        this.f7073m = c1043kq2;
        return c1043kq2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4443f() {
        return this.f7066a == null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4444g(Object obj) {
        if (!m4443f()) {
            int iM4440c = m4440c();
            Object obj2 = this.f7066a;
            Objects.requireNonNull(obj2);
            int iM6430M = ua0.m6430M(obj, null, iM4440c, obj2, m4445h(), m4446i(), null);
            if (iM6430M != -1) {
                Object obj3 = m4447j()[iM6430M];
                m4442e(iM6430M, iM4440c);
                this.f7071f--;
                this.f7070e += 32;
                return obj3;
            }
        }
        return f7065o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM4439b = m4439b();
        if (mapM4439b != null) {
            return mapM4439b.get(obj);
        }
        int iM4441d = m4441d(obj);
        if (iM4441d == -1) {
            return null;
        }
        return m4447j()[iM4441d];
    }

    /* JADX INFO: renamed from: h */
    public final int[] m4445h() {
        int[] iArr = this.f7067b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m4446i() {
        Object[] objArr = this.f7068c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m4447j() {
        Object[] objArr = this.f7069d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m4448k(int i, int i2, int i3, int i4) {
        Object objM6457m = ua0.m6457m(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ua0.m6439Y(i3 & i5, i4 + 1, objM6457m);
        }
        Object obj = this.f7066a;
        Objects.requireNonNull(obj);
        int[] iArrM4445h = m4445h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM6438X = ua0.m6438X(i6, obj);
            while (iM6438X != 0) {
                int i7 = iM6438X - 1;
                int i8 = iArrM4445h[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM6438X2 = ua0.m6438X(i10, objM6457m);
                ua0.m6439Y(i10, iM6438X, objM6457m);
                iArrM4445h[i7] = ua0.m6427I(i9, iM6438X2, i5);
                iM6438X = i8 & i;
            }
        }
        this.f7066a = objM6457m;
        this.f7070e = ua0.m6427I(this.f7070e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1043kq c1043kq = this.f7072g;
        if (c1043kq != null) {
            return c1043kq;
        }
        C1043kq c1043kq2 = new C1043kq(this, 1);
        this.f7072g = c1043kq2;
        return c1043kq2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1117mq.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM4439b = m4439b();
        if (mapM4439b != null) {
            return mapM4439b.remove(obj);
        }
        Object objM4444g = m4444g(obj);
        if (objM4444g == f7065o) {
            return null;
        }
        return objM4444g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM4439b = m4439b();
        return mapM4439b != null ? mapM4439b.size() : this.f7071f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1055l1 c1055l1 = this.f7074n;
        if (c1055l1 != null) {
            return c1055l1;
        }
        C1055l1 c1055l2 = new C1055l1(1, this);
        this.f7074n = c1055l2;
        return c1055l2;
    }
}
