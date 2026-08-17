package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: n9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1137n9 extends ki0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f7310q;

    public /* synthetic */ C1137n9(int i) {
        this.f7310q = i;
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: t */
    public final k51 mo194t(o51 o51Var, ByteBuffer byteBuffer) {
        switch (this.f7310q) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C0141cm c0141cm = new C0141cm(byteBuffer.array(), byteBuffer.limit());
                c0141cm.m1249t(12);
                int iM1235f = (c0141cm.m1235f() + c0141cm.m1238i(12)) - 4;
                c0141cm.m1249t(44);
                c0141cm.m1250u(c0141cm.m1238i(12));
                c0141cm.m1249t(16);
                ArrayList arrayList = new ArrayList();
                while (c0141cm.m1235f() < iM1235f) {
                    c0141cm.m1249t(48);
                    int iM1238i = c0141cm.m1238i(8);
                    c0141cm.m1249t(4);
                    int iM1235f2 = c0141cm.m1235f() + c0141cm.m1238i(12);
                    String str = null;
                    String str2 = null;
                    while (c0141cm.m1235f() < iM1235f2) {
                        int iM1238i2 = c0141cm.m1238i(8);
                        int iM1238i3 = c0141cm.m1238i(8);
                        int iM1235f3 = c0141cm.m1235f() + iM1238i3;
                        if (iM1238i2 == 2) {
                            int iM1238i4 = c0141cm.m1238i(16);
                            c0141cm.m1249t(8);
                            if (iM1238i4 == 3) {
                                while (c0141cm.m1235f() < iM1235f3) {
                                    int iM1238i5 = c0141cm.m1238i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iM1238i5];
                                    c0141cm.m1241l(iM1238i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int iM1238i6 = c0141cm.m1238i(8);
                                    for (int i = 0; i < iM1238i6; i++) {
                                        c0141cm.m1250u(c0141cm.m1238i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iM1238i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iM1238i3];
                            c0141cm.m1241l(iM1238i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        c0141cm.m1246q(iM1235f3 * 8);
                    }
                    c0141cm.m1246q(iM1235f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C1100m9(iM1238i, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new k51(arrayList);
            default:
                dc1 dc1Var = new dc1(byteBuffer.array(), byteBuffer.limit());
                String strM2332o = dc1Var.m2332o();
                strM2332o.getClass();
                String strM2332o2 = dc1Var.m2332o();
                strM2332o2.getClass();
                return new k51(new d70(strM2332o, strM2332o2, dc1Var.m2331n(), dc1Var.m2331n(), Arrays.copyOfRange(dc1Var.f2882a, dc1Var.f2883b, dc1Var.f2884c)));
        }
    }
}
