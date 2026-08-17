package p000;

import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c52 {
    static {
        Logger.getLogger(c52.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m1134a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        int size2 = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            yj0 yj0Var = (yj0) obj;
            int i3 = i + 1;
            bArr[i] = yj0Var.f12995a.mo3171l();
            i += 2;
            bArr[i3] = yj0Var.f12996b.mo3171l();
        }
        byte[] bArr2 = c32.f1661b;
        int i4 = 0;
        while (i4 < size) {
            byte[] bArr3 = bArr[i4];
            int i5 = i4 + 1;
            byte[] bArr4 = bArr[i5];
            if (c32.m1122a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i6 = 0; i6 < i4; i6++) {
                            arrayList2.add(bArr[i6]);
                        }
                        while (i4 < size) {
                            byte[] bArr5 = bArr[i4];
                            byte[] bArr6 = bArr[i4 + 1];
                            if (c32.m1122a(bArr5, bArr2)) {
                                int i7 = 0;
                                for (int i8 = 0; i8 <= bArr6.length; i8++) {
                                    if (i8 == bArr6.length || bArr6[i8] == 44) {
                                        byte[] bArrM2983a = C0677gh.f4189c.m2983a(new String(bArr6, i7, i8 - i7, AbstractC0646fn.f3855a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrM2983a);
                                        i7 = i8 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i4 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i5] = C0677gh.f4189c.m2983a(new String(bArr4, AbstractC0646fn.f3855a));
            }
            i4 += 2;
        }
        return bArr;
    }
}
