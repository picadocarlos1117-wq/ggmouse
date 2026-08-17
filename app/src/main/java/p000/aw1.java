package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aw1 extends rc2 {
    /* JADX INFO: renamed from: w0 */
    public static String m734w0(String str) {
        Comparable comparable;
        String strSubstring;
        List listM7373M0 = zv1.m7373M0(str);
        List list = listM7373M0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!zv1.m7371K0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1451tp.m6307o0(arrayList));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                char cCharAt = str2.charAt(length2);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM7373M0.size();
        int size2 = listM7373M0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            int i3 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && zv1.m7371K0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    f40.m2716l(jd0.m3610h(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC1377rp.m5872s0(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
