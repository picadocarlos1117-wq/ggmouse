package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p91 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final p91 f8817a = new p91();

    /* JADX INFO: renamed from: b */
    public static final Pattern f8818b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: a */
    public static List m5232a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX INFO: renamed from: b */
    public static boolean m5233b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (f8818b.matcher(str).matches()) {
            List listM5232a = m5232a(x509Certificate, 7);
            int size = listM5232a.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (str.equalsIgnoreCase((String) listM5232a.get(i2))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List listM5232a2 = m5232a(x509Certificate, 2);
        int size2 = listM5232a2.size();
        int i3 = 0;
        boolean z5 = false;
        while (i3 < size2) {
            if (m5234c(lowerCase, (String) listM5232a2.get(i3))) {
                return true;
            }
            i3++;
            z5 = true;
        }
        if (!z5) {
            it1 it1Var = new it1(x509Certificate.getSubjectX500Principal());
            it1Var.f5153b = 0;
            it1Var.f5154c = 0;
            it1Var.f5155d = 0;
            it1Var.f5156e = 0;
            String str3 = (String) it1Var.f5157f;
            it1Var.f5158g = str3.toCharArray();
            String strM3489e = it1Var.m3489e();
            String str4 = null;
            if (strM3489e == null) {
                z = z3;
            } else {
                while (true) {
                    int i4 = it1Var.f5153b;
                    int i5 = it1Var.f5152a;
                    if (i4 == i5) {
                        break;
                    }
                    char c4 = ((char[]) it1Var.f5158g)[i4];
                    char c5 = c3;
                    z = z3;
                    if (c4 == '\"') {
                        z2 = z4;
                        int i6 = i4 + 1;
                        it1Var.f5153b = i6;
                        it1Var.f5154c = i6;
                        it1Var.f5155d = i6;
                        while (true) {
                            int i7 = it1Var.f5153b;
                            if (i7 == i5) {
                                f40.m2719o("Unexpected end of DN: ".concat(str3));
                                return z;
                            }
                            char[] cArr2 = (char[]) it1Var.f5158g;
                            char c6 = cArr2[i7];
                            if (c6 == '\"') {
                                it1Var.f5153b = i7 + 1;
                                while (true) {
                                    int i8 = it1Var.f5153b;
                                    if (i8 >= i5 || ((char[]) it1Var.f5158g)[i8] != ' ') {
                                        break;
                                    }
                                    it1Var.f5153b = i8 + 1;
                                }
                                char[] cArr3 = (char[]) it1Var.f5158g;
                                int i9 = it1Var.f5154c;
                                str2 = new String(cArr3, i9, it1Var.f5155d - i9);
                                break;
                            }
                            int i10 = it1Var.f5155d;
                            if (c6 == '\\') {
                                cArr2[i10] = it1Var.m3487c();
                            } else {
                                cArr2[i10] = c6;
                            }
                            it1Var.f5153b++;
                            it1Var.f5155d++;
                        }
                    } else if (c4 == '#') {
                        z2 = z4;
                        if (i4 + 4 >= i5) {
                            f40.m2719o("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        it1Var.f5154c = i4;
                        it1Var.f5153b = i4 + 1;
                        while (true) {
                            int i11 = it1Var.f5153b;
                            if (i11 == i5 || (c = (cArr = (char[]) it1Var.f5158g)[i11]) == '+' || c == ',' || c == ';') {
                                it1Var.f5155d = i11;
                                break;
                            }
                            if (c == ' ') {
                                it1Var.f5155d = i11;
                                it1Var.f5153b = i11 + 1;
                                while (true) {
                                    int i12 = it1Var.f5153b;
                                    if (i12 >= i5 || ((char[]) it1Var.f5158g)[i12] != ' ') {
                                        break;
                                    }
                                    it1Var.f5153b = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ' ');
                                }
                                it1Var.f5153b = i11 + 1;
                            }
                        }
                        int i13 = it1Var.f5155d;
                        int i14 = it1Var.f5154c;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            f40.m2719o("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (Object r12 = z; r12 < i16; r12++) {
                            bArr[r12] = (byte) it1Var.m3486b(i17);
                            i17 += 2;
                        }
                        str2 = new String((char[]) it1Var.f5158g, it1Var.f5154c, i15);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        it1Var.f5154c = i4;
                        it1Var.f5155d = i4;
                        while (true) {
                            int i18 = it1Var.f5153b;
                            char[] cArr4 = (char[]) it1Var.f5158g;
                            if (i18 >= i5) {
                                int i19 = it1Var.f5154c;
                                str2 = new String(cArr4, i19, it1Var.f5155d - i19);
                                z2 = z4;
                            } else {
                                char c7 = cArr4[i18];
                                if (c7 != ' ') {
                                    if (c7 != ';') {
                                        if (c7 == '\\') {
                                            z2 = z4;
                                            int i20 = it1Var.f5155d;
                                            it1Var.f5155d = i20 + 1;
                                            cArr4[i20] = it1Var.m3487c();
                                            it1Var.f5153b++;
                                        } else if (c7 != '+' && c7 != ',') {
                                            int i21 = it1Var.f5155d;
                                            z2 = z4;
                                            it1Var.f5155d = i21 + 1;
                                            cArr4[i21] = c7;
                                            it1Var.f5153b = i18 + 1;
                                        }
                                        z4 = z2;
                                    }
                                    z2 = z4;
                                    int i22 = it1Var.f5154c;
                                    str2 = new String(cArr4, i22, it1Var.f5155d - i22);
                                } else {
                                    z2 = z4;
                                    int i23 = it1Var.f5155d;
                                    it1Var.f5156e = i23;
                                    it1Var.f5153b = i18 + 1;
                                    it1Var.f5155d = i23 + 1;
                                    cArr4[i23] = ' ';
                                    while (true) {
                                        i = it1Var.f5153b;
                                        if (i >= i5) {
                                            break;
                                        }
                                        char[] cArr5 = (char[]) it1Var.f5158g;
                                        if (cArr5[i] != ' ') {
                                            break;
                                        }
                                        int i24 = it1Var.f5155d;
                                        it1Var.f5155d = i24 + 1;
                                        cArr5[i24] = ' ';
                                        it1Var.f5153b = i + 1;
                                    }
                                    if (i == i5 || (c2 = ((char[]) it1Var.f5158g)[i]) == ',' || c2 == '+' || c2 == ';') {
                                        char[] cArr6 = (char[]) it1Var.f5158g;
                                        int i25 = it1Var.f5154c;
                                        str2 = new String(cArr6, i25, it1Var.f5156e - i25);
                                    } else {
                                        z4 = z2;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strM3489e)) {
                        str4 = str2;
                    } else {
                        int i26 = it1Var.f5153b;
                        if (i26 < i5) {
                            char c8 = ((char[]) it1Var.f5158g)[i26];
                            if (c8 != ',' && c8 != ';' && c8 != '+') {
                                f40.m2719o("Malformed DN: ".concat(str3));
                                return z;
                            }
                            it1Var.f5153b = i26 + 1;
                            strM3489e = it1Var.m3489e();
                            if (strM3489e == null) {
                                f40.m2719o("Malformed DN: ".concat(str3));
                                return z;
                            }
                            c3 = c5;
                            z3 = z;
                            z4 = z2;
                        }
                    }
                }
                z = z3;
            }
            return str4 != null ? m5234c(lowerCase, str4) : z;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5234c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m5233b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
