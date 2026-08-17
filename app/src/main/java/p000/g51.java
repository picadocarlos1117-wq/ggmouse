package p000;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g51 {

    /* JADX INFO: renamed from: d */
    public static final BitSet f4065d;

    /* JADX INFO: renamed from: a */
    public final String f4066a;

    /* JADX INFO: renamed from: b */
    public final byte[] f4067b;

    /* JADX INFO: renamed from: c */
    public final Object f4068c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        f4065d = bitSet;
    }

    public g51(boolean z, String str, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p32.m5188s(lowerCase, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p32.m5177l(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            j51.f5268c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((!z || cCharAt != ':' || i != 0) && !f4065d.get(cCharAt)) {
                f40.m2713i(p32.m5153T("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                throw null;
            }
        }
        this.f4066a = lowerCase;
        this.f4067b = lowerCase.getBytes(AbstractC0646fn.f3855a);
        this.f4068c = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2224a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo2225b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4066a.equals(((g51) obj).f4066a);
    }

    public final int hashCode() {
        return this.f4066a.hashCode();
    }

    public final String toString() {
        return AbstractC1308pu.m5342i(new StringBuilder("Key{name='"), this.f4066a, "'}");
    }
}
