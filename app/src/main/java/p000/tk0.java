package p000;

import com.example.ssmousepro.injection.InjectionProtocol;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tk0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f10898a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", InjectionProtocol.PING, "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b */
    public static final String[] f10899b = new String[64];

    /* JADX INFO: renamed from: c */
    public static final String[] f10900c = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f10900c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f10899b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = AbstractC1308pu.m5342i(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f10899b;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = AbstractC1308pu.m5342i(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f10899b;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f10900c[i];
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX INFO: renamed from: a */
    public static String m6284a(boolean z, int i, int i2, byte b, byte b2) {
        String strReplace;
        String str = b < 10 ? f10898a[b] : String.format("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            strReplace = "";
        } else {
            String[] strArr = f10900c;
            if (b == 2 || b == 3) {
                strReplace = strArr[b2];
            } else if (b == 4 || b == 6) {
                strReplace = b2 == 1 ? "ACK" : strArr[b2];
            } else if (b == 7 || b == 8) {
                strReplace = strArr[b2];
            } else {
                String str2 = b2 < 64 ? f10899b[b2] : strArr[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    strReplace = (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace);
    }
}
