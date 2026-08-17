package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: vz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1535vz {

    /* JADX INFO: renamed from: a */
    public final C0547cy f11866a;

    /* JADX INFO: renamed from: b */
    public final long f11867b;

    /* JADX INFO: renamed from: c */
    public final long f11868c;

    /* JADX INFO: renamed from: d */
    public final long f11869d;

    /* JADX INFO: renamed from: e */
    public final long f11870e;

    /* JADX INFO: renamed from: f */
    public final int f11871f;

    /* JADX INFO: renamed from: g */
    public final long f11872g;

    /* JADX INFO: renamed from: h */
    public final HashMap f11873h;

    /* JADX INFO: renamed from: i */
    public long f11874i;

    public C1535vz() {
        C0547cy c0547cy = new C0547cy();
        m6671a("bufferForPlaybackMs", 2500, 0, "0");
        m6671a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        m6671a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        m6671a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        m6671a("maxBufferMs", 50000, 50000, "minBufferMs");
        m6671a("backBufferDurationMs", 0, 0, "0");
        this.f11866a = c0547cy;
        long jM7216D = z42.m7216D(50000L);
        this.f11867b = jM7216D;
        this.f11868c = jM7216D;
        this.f11869d = z42.m7216D(2500L);
        this.f11870e = z42.m7216D(5000L);
        this.f11871f = -1;
        this.f11872g = z42.m7216D(0L);
        this.f11873h = new HashMap();
        this.f11874i = -1L;
    }

    /* JADX INFO: renamed from: a */
    public static void m6671a(String str, int i, int i2, String str2) {
        ki0.m3859d(i >= i2, str + " cannot be less than " + str2);
    }

    /* JADX INFO: renamed from: b */
    public final int m6672b() {
        Iterator it = this.f11873h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C1498uz) it.next()).f11460b;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6673c(ru0 ru0Var) {
        int i;
        long j = this.f11868c;
        C1498uz c1498uz = (C1498uz) this.f11873h.get(ru0Var.f10132a);
        c1498uz.getClass();
        C0547cy c0547cy = this.f11866a;
        synchronized (c0547cy) {
            i = c0547cy.f2658d * c0547cy.f2656b;
        }
        boolean z = i >= m6672b();
        long jMin = this.f11867b;
        float f = ru0Var.f10134c;
        if (f > 1.0f) {
            jMin = Math.min(z42.m7243q(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = ru0Var.f10133b;
        if (j2 < jMax) {
            c1498uz.f11459a = !z;
            if (z && j2 < 500000) {
                AbstractC1337qm.m5542i0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c1498uz.f11459a = false;
        }
        return c1498uz.f11459a;
    }

    /* JADX INFO: renamed from: d */
    public final void m6674d() {
        boolean zIsEmpty = this.f11873h.isEmpty();
        C0547cy c0547cy = this.f11866a;
        if (!zIsEmpty) {
            c0547cy.m2136a(m6672b());
            return;
        }
        synchronized (c0547cy) {
            if (c0547cy.f2655a) {
                c0547cy.m2136a(0);
            }
        }
    }
}
