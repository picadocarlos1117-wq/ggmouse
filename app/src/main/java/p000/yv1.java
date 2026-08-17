package p000;

import java.security.AccessController;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yv1 {

    /* JADX INFO: renamed from: a */
    public static final String f13156a;

    static {
        try {
            try {
                f13156a = (String) AccessController.doPrivileged(new C1592xi());
            } catch (Exception unused) {
                f13156a = "\n";
            }
        } catch (Exception unused2) {
            f13156a = String.format("%n", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7153a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m7154b(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m7155c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
