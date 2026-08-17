package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sh0 extends hr1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f10403j;

    public /* synthetic */ sh0(int i) {
        this.f10403j = i;
    }

    /* JADX INFO: renamed from: P */
    public final short m6098P(int i) {
        int i2;
        switch (this.f10403j) {
            case 0:
                int i3 = (2093056 & i) >>> 9;
                int i4 = (14680064 & i) >>> 18;
                i2 = ((((i & 4095) ^ (i >>> 12)) ^ i3) ^ i4) ^ (i >>> 21);
                break;
            default:
                int i5 = i & 8191;
                int i6 = i >>> 13;
                int i7 = ((i6 << 4) ^ (i6 << 3)) ^ (i6 << 1);
                int i8 = i7 >>> 13;
                i2 = (((i5 ^ i6) ^ i8) ^ (i7 & 8191)) ^ (((i8 << 4) ^ (i8 << 3)) ^ (i8 << 1));
                break;
        }
        return (short) i2;
    }

    /* JADX INFO: renamed from: Q */
    public short m6099Q(short s) {
        return m6098P(hr1.m3278n(s));
    }

    /* JADX INFO: renamed from: R */
    public short m6100R(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 18) * (64 & j);
        long j4 = j ^ (j << 21);
        long j5 = ((j2 << 15) * (j4 & 8589934624L)) ^ (((((j3 ^ ((268435457 & j4) * j2)) ^ ((j2 << 3) * (536870914 & j4))) ^ ((j2 << 6) * (1073741828 & j4))) ^ ((j2 << 9) * (2147483656L & j4))) ^ ((j2 << 12) * (4294967312L & j4)));
        long j6 = 2305834213120671744L & j5;
        long j7 = j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24)));
        long j8 = 8796025913344L & j7;
        return m6098P(((int) (j7 ^ ((j8 >>> 26) ^ (((j8 >>> 18) ^ (j8 >>> 20)) ^ (j8 >>> 24))))) & 67108863);
    }

    /* JADX INFO: renamed from: S */
    public short m6101S(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 6) * (64 & j);
        long j4 = j ^ (j << 7);
        long j5 = ((j2 << 5) * (j4 & 524320)) ^ (((((j3 ^ ((16385 & j4) * j2)) ^ ((j2 << 1) * (32770 & j4))) ^ ((j2 << 2) * (65540 & j4))) ^ ((j2 << 3) * (131080 & j4))) ^ ((j2 << 4) * (262160 & j4)));
        long j6 = 137371844608L & j5;
        return m6098P(((int) (j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24))))) & 67108863);
    }

    @Override // p000.hr1
    /* JADX INFO: renamed from: u */
    public final short mo3289u(short s) {
        switch (this.f10403j) {
            case 0:
                short sMo3290v = mo3290v(m6099Q(s), s);
                short sMo3290v2 = mo3290v(m6099Q(m6099Q(sMo3290v)), sMo3290v);
                return m6099Q(mo3290v(m6099Q(mo3290v(m6099Q(m6099Q(mo3290v(m6099Q(m6099Q(m6099Q(m6099Q(sMo3290v2)))), sMo3290v2))), sMo3290v)), s));
            default:
                short sM6101S = m6101S(s, s);
                short sM6100R = m6100R(sM6101S, sM6101S);
                return m6101S(m6100R(m6098P(hr1.m3278n(m6098P(hr1.m3278n(m6100R(m6098P(hr1.m3278n(m6098P(hr1.m3278n(sM6100R)))), sM6100R))))), sM6100R), (short) 1);
        }
    }

    @Override // p000.hr1
    /* JADX INFO: renamed from: v */
    public final short mo3290v(short s, short s2) {
        switch (this.f10403j) {
            case 0:
                int i = (s2 & 1) * s;
                for (int i2 = 1; i2 < 12; i2++) {
                    i ^= ((1 << i2) & s2) * s;
                }
                return m6098P(i);
            default:
                int i3 = (s2 & 1) * s;
                for (int i4 = 1; i4 < 13; i4++) {
                    i3 ^= ((1 << i4) & s2) * s;
                }
                return m6098P(i3);
        }
    }
}
