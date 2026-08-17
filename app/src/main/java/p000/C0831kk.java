package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: kk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831kk {

    /* JADX INFO: renamed from: c */
    public static final String f5889c;

    /* JADX INFO: renamed from: d */
    public static final Set f5890d;

    /* JADX INFO: renamed from: e */
    public static final C0831kk f5891e;

    /* JADX INFO: renamed from: a */
    public final String f5892a;

    /* JADX INFO: renamed from: b */
    public final String f5893b;

    static {
        String strM3253D = hr1.m3253D("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5889c = strM3253D;
        hr1.m3253D("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        hr1.m3253D("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5890d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new t60("proto"), new t60("json"))));
        f5891e = new C0831kk(strM3253D, null);
    }

    public C0831kk(String str, String str2) {
        this.f5892a = str;
        this.f5893b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C0831kk m3894a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            f40.m2713i("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            f40.m2713i("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            f40.m2713i("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new C0831kk(str2, str3.isEmpty() ? null : str3);
    }
}
