package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s41 implements Closeable {

    /* JADX INFO: renamed from: a */
    public u91 f10217a;

    /* JADX INFO: renamed from: b */
    public int f10218b;

    /* JADX INFO: renamed from: c */
    public final kv1 f10219c;

    /* JADX INFO: renamed from: d */
    public final C0558d8 f10220d;

    /* JADX INFO: renamed from: e */
    public k50 f10221e;

    /* JADX INFO: renamed from: f */
    public byte[] f10222f;

    /* JADX INFO: renamed from: g */
    public int f10223g;

    /* JADX INFO: renamed from: m */
    public int f10224m;

    /* JADX INFO: renamed from: n */
    public int f10225n;

    /* JADX INFO: renamed from: o */
    public boolean f10226o;

    /* JADX INFO: renamed from: p */
    public C1379rr f10227p;

    /* JADX INFO: renamed from: q */
    public C1379rr f10228q;

    /* JADX INFO: renamed from: r */
    public long f10229r;

    /* JADX INFO: renamed from: s */
    public boolean f10230s;

    /* JADX INFO: renamed from: t */
    public int f10231t;

    /* JADX INFO: renamed from: u */
    public int f10232u;

    /* JADX INFO: renamed from: v */
    public boolean f10233v;

    /* JADX INFO: renamed from: w */
    public volatile boolean f10234w;

    public s41(u91 u91Var, int i, kv1 kv1Var, C0558d8 c0558d8) {
        k50 k50Var = k50.f5671c;
        this.f10224m = 1;
        this.f10225n = 5;
        this.f10228q = new C1379rr();
        this.f10230s = false;
        this.f10231t = -1;
        this.f10233v = false;
        this.f10234w = false;
        this.f10217a = u91Var;
        this.f10221e = k50Var;
        this.f10218b = i;
        this.f10219c = kv1Var;
        p32.m5188s(c0558d8, "transportTracer");
        this.f10220d = c0558d8;
    }

    /* JADX INFO: renamed from: c */
    public final void m5973c() {
        String str;
        if (this.f10230s) {
            return;
        }
        boolean z = true;
        this.f10230s = true;
        while (!this.f10234w && this.f10229r > 0 && m5976g()) {
            try {
                int iM5359z = AbstractC1308pu.m5359z(this.f10224m);
                if (iM5359z == 0) {
                    m5975e();
                } else {
                    if (iM5359z != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i = this.f10224m;
                        if (i != 1) {
                            str = i != 2 ? "null" : "BODY";
                        } else {
                            str = "HEADER";
                        }
                        sb.append(str);
                        throw new AssertionError(sb.toString());
                    }
                    m5974d();
                    this.f10229r--;
                }
            } catch (Throwable th) {
                this.f10230s = false;
                throw th;
            }
        }
        if (this.f10234w) {
            close();
            this.f10230s = false;
            return;
        }
        if (this.f10233v) {
            if (this.f10228q.f10110c != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.f10230s = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        C1379rr c1379rr = this.f10227p;
        boolean z = c1379rr != null && c1379rr.f10110c > 0;
        try {
            C1379rr c1379rr2 = this.f10228q;
            if (c1379rr2 != null) {
                c1379rr2.close();
            }
            C1379rr c1379rr3 = this.f10227p;
            if (c1379rr3 != null) {
                c1379rr3.close();
            }
            this.f10228q = null;
            this.f10227p = null;
            u91 u91Var = this.f10217a;
            EnumC1376ro enumC1376ro = EnumC1376ro.f10079a;
            boolean z2 = u91Var.f11212n;
            y91 y91Var = u91Var.f11193F;
            int i = u91Var.f11197J;
            if (z2) {
                y91Var.m7057i(i, null, enumC1376ro, false, null, null);
            } else {
                y91Var.m7057i(i, null, enumC1376ro, false, b70.CANCEL, null);
            }
            p32.m5193x(u91Var.f11213o, "status should have been reported on deframer closed");
            u91Var.f11210l = true;
            if (u91Var.f11214p && z) {
                u91Var.m6423m(nv1.f7558m.m4614g("Encountered end-of-stream mid-frame"), true, new j51());
            }
            RunnableC1091m0 runnableC1091m0 = u91Var.f11211m;
            if (runnableC1091m0 != null) {
                runnableC1091m0.run();
                u91Var.f11211m = null;
            }
        } catch (Throwable th) {
            this.f10228q = null;
            this.f10227p = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5974d() {
        Object r41Var;
        int i = this.f10231t;
        long j = this.f10232u;
        kv1 kv1Var = this.f10219c;
        for (rc2 rc2Var : kv1Var.f6043a) {
            rc2Var.mo4518P(i, j);
        }
        this.f10232u = 0;
        if (this.f10226o) {
            k50 k50Var = this.f10221e;
            if (k50Var == k50.f5671c) {
                throw new qv1(nv1.f7558m.m4614g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                C1379rr c1379rr = this.f10227p;
                wi1 wi1Var = xi1.f12615a;
                vi1 vi1Var = new vi1();
                p32.m5188s(c1379rr, "buffer");
                vi1Var.f11692a = c1379rr;
                InputStream gZIPInputStream = vi1Var;
                switch (k50Var.f5678a) {
                    case 2:
                        break;
                    default:
                        gZIPInputStream = new GZIPInputStream(vi1Var);
                        break;
                }
                r41Var = new r41(gZIPInputStream, this.f10218b, kv1Var);
            } catch (IOException e) {
                ca0.m1184p(e);
                return;
            }
        } else {
            long j2 = this.f10227p.f10110c;
            for (rc2 rc2Var2 : kv1Var.f6043a) {
                rc2Var2.mo4520R(j2);
            }
            C1379rr c1379rr2 = this.f10227p;
            wi1 wi1Var2 = xi1.f12615a;
            vi1 vi1Var2 = new vi1();
            p32.m5188s(c1379rr2, "buffer");
            vi1Var2.f11692a = c1379rr2;
            r41Var = vi1Var2;
        }
        this.f10227p.getClass();
        this.f10227p = null;
        u91 u91Var = this.f10217a;
        pn0 pn0Var = new pn0();
        pn0Var.f8968a = r41Var;
        u91Var.f11208j.mo4770s(pn0Var);
        this.f10224m = 1;
        this.f10225n = 5;
    }

    /* JADX INFO: renamed from: e */
    public final void m5975e() {
        int iMo1195p = this.f10227p.mo1195p();
        if ((iMo1195p & 254) != 0) {
            throw new qv1(nv1.f7558m.m4614g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f10226o = (iMo1195p & 1) != 0;
        C1379rr c1379rr = this.f10227p;
        c1379rr.m5652c(4);
        int iMo1195p2 = c1379rr.mo1195p() | (c1379rr.mo1195p() << 24) | (c1379rr.mo1195p() << 16) | (c1379rr.mo1195p() << 8);
        this.f10225n = iMo1195p2;
        if (iMo1195p2 < 0 || iMo1195p2 > this.f10218b) {
            nv1 nv1Var = nv1.f7556k;
            Locale locale = Locale.US;
            throw new qv1(nv1Var.m4614g("gRPC message exceeds maximum size " + this.f10218b + ": " + iMo1195p2));
        }
        int i = this.f10231t + 1;
        this.f10231t = i;
        for (rc2 rc2Var : this.f10219c.f6043a) {
            rc2Var.mo4517O(i);
        }
        C0558d8 c0558d8 = this.f10220d;
        ((zv0) c0558d8.f2822c).mo3445a();
        ((bz1) c0558d8.f2821b).m1083f();
        this.f10224m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.f10224m == 2) goto L17;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5976g() throws java.lang.Throwable {
        /*
            r8 = this;
            kv1 r0 = r8.f10219c
            r1 = 2
            r2 = 0
            rr r3 = r8.f10227p     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L12
            rr r3 = new rr     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            r8.f10227p = r3     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L5b
        L12:
            r3 = r2
        L13:
            int r4 = r8.f10225n     // Catch: java.lang.Throwable -> L48
            rr r5 = r8.f10227p     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f10110c     // Catch: java.lang.Throwable -> L48
            int r4 = r4 - r5
            if (r4 <= 0) goto L4d
            rr r5 = r8.f10228q     // Catch: java.lang.Throwable -> L48
            int r5 = r5.f10110c     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L37
            if (r3 <= 0) goto L36
            u91 r4 = r8.f10217a
            r4.m6414c(r3)
            int r4 = r8.f10224m
            if (r4 != r1) goto L36
        L2d:
            long r4 = (long) r3
            r0.m4000a(r4)
            int r0 = r8.f10232u
            int r0 = r0 + r3
            r8.f10232u = r0
        L36:
            return r2
        L37:
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + r4
            rr r5 = r8.f10227p     // Catch: java.lang.Throwable -> L48
            rr r6 = r8.f10228q     // Catch: java.lang.Throwable -> L48
            r1 r4 = r6.mo1191g(r4)     // Catch: java.lang.Throwable -> L48
            r5.m5894y(r4)     // Catch: java.lang.Throwable -> L48
            goto L13
        L48:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L5b
        L4d:
            r2 = 1
            if (r3 <= 0) goto L5a
            u91 r4 = r8.f10217a
            r4.m6414c(r3)
            int r4 = r8.f10224m
            if (r4 != r1) goto L5a
            goto L2d
        L5a:
            return r2
        L5b:
            if (r2 <= 0) goto L6f
            u91 r4 = r8.f10217a
            r4.m6414c(r2)
            int r4 = r8.f10224m
            if (r4 != r1) goto L6f
            long r4 = (long) r2
            r0.m4000a(r4)
            int r0 = r8.f10232u
            int r0 = r0 + r2
            r8.f10232u = r0
        L6f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s41.m5976g():boolean");
    }

    public final boolean isClosed() {
        return this.f10228q == null;
    }
}
