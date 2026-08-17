package com.example.ssmousepro.account;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.bc1;
import p000.hp0;
import p000.hw1;
import p000.jd0;
import p000.jk1;
import p000.qy0;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EmailAddress {
    public static final EmailAddress INSTANCE = new EmailAddress();
    private static final jk1 EMAIL_REGEX = new jk1("^[a-z0-9._%+\\-]+@[a-z0-9.\\-]+\\.[a-z]{2,}$");
    private static final Map<String, String> CORRECOES_DOMINIO = qy0.m5620j0(new bc1("gmail.co", "gmail.com"), new bc1("gmail.cm", "gmail.com"), new bc1("gmail.con", "gmail.com"), new bc1("gmail.comm", "gmail.com"), new bc1("gmail.com.com", "gmail.com"), new bc1("gmail.com.br.com", "gmail.com.br"), new bc1("gnail.com", "gmail.com"), new bc1("gmal.com", "gmail.com"), new bc1("gamil.com", "gmail.com"), new bc1("gmial.com", "gmail.com"), new bc1("gmai.com", "gmail.com"), new bc1("gmail.com.br", "gmail.com.br"), new bc1("googlemail.co", "googlemail.com"), new bc1("hotmail.co", "hotmail.com"), new bc1("hotmail.cm", "hotmail.com"), new bc1("hotmail.con", "hotmail.com"), new bc1("hotnail.com", "hotmail.com"), new bc1("hotmai.com", "hotmail.com"), new bc1("hotmial.com", "hotmail.com"), new bc1("outlook.co", "outlook.com"), new bc1("outlook.cm", "outlook.com"), new bc1("outlook.con", "outlook.com"), new bc1("outlok.com", "outlook.com"), new bc1("outloo.com", "outlook.com"), new bc1("yahoo.co", "yahoo.com"), new bc1("yahoo.cm", "yahoo.com"), new bc1("yahoo.con", "yahoo.com"), new bc1("yaho.com", "yahoo.com"), new bc1("ymail.co", "ymail.com"), new bc1("icloud.co", "icloud.com"), new bc1("icloud.cm", "icloud.com"), new bc1("live.co", "live.com"), new bc1("msn.co", "msn.com"));

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Resultado {
        private final boolean corrigido;
        private final String email;
        private final String original;

        public Resultado(String str, boolean z, String str2) {
            str.getClass();
            str2.getClass();
            this.email = str;
            this.corrigido = z;
            this.original = str2;
        }

        public static /* synthetic */ Resultado copy$default(Resultado resultado, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resultado.email;
            }
            if ((i & 2) != 0) {
                z = resultado.corrigido;
            }
            if ((i & 4) != 0) {
                str2 = resultado.original;
            }
            return resultado.copy(str, z, str2);
        }

        public final String component1() {
            return this.email;
        }

        public final boolean component2() {
            return this.corrigido;
        }

        public final String component3() {
            return this.original;
        }

        public final Resultado copy(String str, boolean z, String str2) {
            str.getClass();
            str2.getClass();
            return new Resultado(str, z, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resultado)) {
                return false;
            }
            Resultado resultado = (Resultado) obj;
            return hp0.m3214e(this.email, resultado.email) && this.corrigido == resultado.corrigido && hp0.m3214e(this.original, resultado.original);
        }

        public final boolean getCorrigido() {
            return this.corrigido;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getOriginal() {
            return this.original;
        }

        public int hashCode() {
            return this.original.hashCode() + ((Boolean.hashCode(this.corrigido) + (this.email.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.email;
            boolean z = this.corrigido;
            String str2 = this.original;
            StringBuilder sb = new StringBuilder("Resultado(email=");
            sb.append(str);
            sb.append(", corrigido=");
            sb.append(z);
            sb.append(", original=");
            return AbstractC1308pu.m5342i(sb, str2, ")");
        }
    }

    private EmailAddress() {
    }

    public final boolean ehValido(String str) {
        str.getClass();
        if (str.length() >= 6 && str.length() <= 254) {
            jk1 jk1Var = EMAIL_REGEX;
            jk1Var.getClass();
            if (jk1Var.f5439a.matcher(str).matches()) {
                int iIndexOf = str.indexOf(64, 0);
                String strSubstring = iIndexOf == -1 ? "" : str.substring(iIndexOf + 1, str.length());
                if (!hw1.m3309D0(strSubstring, ".", false) && !strSubstring.endsWith(".") && !zv1.m7365E0(strSubstring, "..", false)) {
                    int iM7372L0 = zv1.m7372L0(strSubstring, '.');
                    if ((iM7372L0 != -1 ? strSubstring.substring(iM7372L0 + 1, strSubstring.length()) : "").length() >= 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Resultado normalizar(String str) {
        str.getClass();
        String lowerCase = zv1.m7383W0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strM3308C0 = hw1.m3308C0(lowerCase, " ", "");
        if (zv1.m7371K0(strM3308C0)) {
            return new Resultado("", false, strM3308C0);
        }
        int iM7372L0 = zv1.m7372L0(strM3308C0, '@');
        if (iM7372L0 <= 0 || iM7372L0 >= strM3308C0.length() - 1) {
            return new Resultado(strM3308C0, false, strM3308C0);
        }
        String strSubstring = strM3308C0.substring(0, iM7372L0);
        String strM3308C1 = hw1.m3308C0(hw1.m3308C0(strM3308C0.substring(iM7372L0 + 1), ",", "."), "..", ".");
        char[] cArr = {'.'};
        int length = strM3308C1.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = strM3308C1.charAt(!z ? i : length);
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = strM3308C1.subSequence(i, length + 1).toString();
        String str2 = CORRECOES_DOMINIO.get(string);
        if (str2 != null) {
            string = str2;
        } else {
            List listM7378R0 = zv1.m7378R0(string, new char[]{'.'});
            if (listM7378R0.size() == 2) {
                String str3 = (String) listM7378R0.get(0);
                String str4 = (String) listM7378R0.get(1);
                if (AbstractC1337qm.m5531c0("gmail", "googlemail", "hotmail", "outlook", "yahoo", "ymail", "icloud", "live", "msn", "protonmail", "uol").contains(str3) && hp0.m3214e(str4, "co")) {
                    string = jd0.m3614l(str3, ".com");
                }
            }
        }
        String strM5340g = AbstractC1308pu.m5340g(strSubstring, "@", string);
        return new Resultado(strM5340g, !strM5340g.equals(strM3308C0), strM3308C0);
    }
}
