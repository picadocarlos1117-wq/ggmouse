package p000;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 {

    /* JADX INFO: renamed from: a */
    public final Random f11764a;

    /* JADX INFO: renamed from: b */
    public final int[] f11765b;

    /* JADX INFO: renamed from: c */
    public final int[] f11766c;

    public vs1(int[] iArr, Random random) {
        this.f11765b = iArr;
        this.f11764a = random;
        this.f11766c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f11766c[iArr[i]] = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final vs1 m6656a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.f11765b;
            random = this.f11764a;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new vs1(iArr4, new Random(random.nextLong()));
    }

    public vs1() {
        this(new Random());
    }

    public vs1(Random random) {
        this(new int[0], random);
    }
}
