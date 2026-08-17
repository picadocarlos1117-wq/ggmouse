package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rh0 {

    /* JADX INFO: renamed from: a */
    public C0117c f10022a;

    /* JADX INFO: renamed from: b */
    public qo0 f10023b;

    /* JADX INFO: renamed from: c */
    public ay0 f10024c;

    /* JADX INFO: renamed from: d */
    public boolean f10025d;

    /* JADX INFO: renamed from: e */
    public boolean f10026e;

    /* JADX INFO: renamed from: f */
    public int f10027f;

    /* JADX INFO: renamed from: g */
    public byte[] f10028g;

    /* JADX INFO: renamed from: h */
    public byte[] f10029h;

    /* JADX INFO: renamed from: i */
    public byte[] f10030i;

    /* JADX INFO: renamed from: j */
    public byte[] f10031j;

    /* JADX INFO: renamed from: k */
    public byte[] f10032k;

    /* JADX INFO: renamed from: l */
    public byte[] f10033l;

    /* JADX INFO: renamed from: m */
    public byte[] f10034m;

    /* JADX INFO: renamed from: n */
    public byte[] f10035n;

    /* JADX INFO: renamed from: o */
    public byte[] f10036o;

    /* JADX INFO: renamed from: p */
    public byte[] f10037p;

    /* JADX INFO: renamed from: q */
    public byte[] f10038q;

    /* JADX INFO: renamed from: r */
    public int f10039r;

    /* JADX INFO: renamed from: s */
    public int f10040s;

    /* JADX INFO: renamed from: t */
    public long f10041t;

    /* JADX INFO: renamed from: u */
    public byte[] f10042u;

    /* JADX INFO: renamed from: v */
    public int f10043v;

    /* JADX INFO: renamed from: w */
    public long f10044w;

    /* JADX INFO: renamed from: x */
    public long f10045x;

    /* JADX INFO: renamed from: a */
    public final void m5847a() {
        if (this.f10026e) {
            return;
        }
        f40.m2719o(this.f10025d ? "GCM cipher cannot be reused for encryption" : "GCM cipher needs to be initialised");
    }

    /* JADX INFO: renamed from: b */
    public final void m5848b(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new tb1("Output buffer too short");
        }
        if (this.f10041t == 0) {
            m5853g();
        }
        byte[] bArr3 = new byte[16];
        m5852f(bArr3);
        byte[] bArr4 = this.f10035n;
        o21.m4634A0(i, bArr4, bArr);
        this.f10023b.m5596S(bArr4);
        int i3 = 0;
        do {
            bArr2[i2 + i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            int i4 = i3 + 1;
            bArr2[i2 + i4] = (byte) (bArr[i4 + i] ^ bArr3[i4]);
            int i5 = i3 + 2;
            bArr2[i2 + i5] = (byte) (bArr[i5 + i] ^ bArr3[i5]);
            int i6 = i3 + 3;
            bArr2[i2 + i6] = (byte) (bArr[i6 + i] ^ bArr3[i6]);
            i3 += 4;
        } while (i3 < 16);
        this.f10041t += 16;
    }

    /* JADX WARN: Failed to calculate best type for var: r1v10 Object jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 Object jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 Object jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: c */
    public final int m5849c(int r38, byte[] r39) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rh0.m5849c(int, byte[]):int");
    }

    /* JADX INFO: renamed from: d */
    public final void m5850d(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new tb1("Output buffer too short");
        }
        if (this.f10041t == 0) {
            m5853g();
        }
        byte[] bArr3 = new byte[16];
        m5852f(bArr3);
        o21.m4634A0(i, bArr3, bArr);
        byte[] bArr4 = this.f10035n;
        o21.m4636B0(bArr4, bArr3);
        this.f10023b.m5596S(bArr4);
        System.arraycopy(bArr3, 0, bArr2, i2, 16);
        this.f10041t += 16;
    }

    /* JADX INFO: renamed from: e */
    public final void m5851e(int i, int i2, byte[] bArr, byte[] bArr2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                this.f10023b.m5596S(bArr);
                return;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5852f(byte[] bArr) {
        int i = this.f10039r;
        if (i == 0) {
            f40.m2719o("Attempt to process too many blocks");
            return;
        }
        this.f10039r = i - 1;
        byte[] bArr2 = this.f10038q;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.f10022a.m1093c(0, 0, bArr2, bArr);
    }

    /* JADX INFO: renamed from: g */
    public final void m5853g() {
        if (this.f10044w > 0) {
            System.arraycopy(this.f10036o, 0, this.f10037p, 0, 16);
            this.f10045x = this.f10044w;
        }
        int i = this.f10043v;
        if (i > 0) {
            m5851e(0, i, this.f10037p, this.f10042u);
            this.f10045x += (long) this.f10043v;
        }
        if (this.f10045x > 0) {
            System.arraycopy(this.f10037p, 0, this.f10035n, 0, 16);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5854h(int i, byte[] bArr) {
        int i2;
        qo0 qo0Var = this.f10023b;
        m5847a();
        int i3 = this.f10043v;
        if (i3 > 0) {
            i2 = 16 - i3;
            byte[] bArr2 = this.f10042u;
            if (i < i2) {
                System.arraycopy(bArr, 0, bArr2, i3, i);
                this.f10043v += i;
                return;
            }
            System.arraycopy(bArr, 0, bArr2, i3, i2);
            byte[] bArr3 = this.f10036o;
            o21.m4636B0(bArr3, this.f10042u);
            qo0Var.m5596S(bArr3);
            this.f10044w += 16;
            i -= i2;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        int i5 = i4 - 16;
        while (i2 <= i5) {
            byte[] bArr4 = this.f10036o;
            o21.m4634A0(i2, bArr4, bArr);
            qo0Var.m5596S(bArr4);
            this.f10044w += 16;
            i2 += 16;
        }
        int i6 = i4 - i2;
        this.f10043v = i6;
        System.arraycopy(bArr, i2, this.f10042u, 0, i6);
    }
}
