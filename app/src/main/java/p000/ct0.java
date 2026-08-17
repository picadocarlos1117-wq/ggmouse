package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 implements InterfaceC0787je {

    /* JADX INFO: renamed from: a */
    public final qm0 f2610a;

    /* JADX INFO: renamed from: b */
    public final int f2611b;

    public ct0(int i, kk1 kk1Var) {
        this.f2611b = i;
        this.f2610a = kk1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static ct0 m2121b(int i, dc1 dc1Var) {
        String str;
        InterfaceC0787je vv1Var;
        String str2;
        int i2;
        int i3 = 4;
        sc2.m6060d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = dc1Var.f2884c;
        int i5 = 0;
        int i6 = -2;
        int i7 = 0;
        while (dc1Var.m2318a() > 8) {
            int iM2326i = dc1Var.m2326i();
            int iM2326i2 = dc1Var.f2883b + dc1Var.m2326i();
            dc1Var.m2315E(iM2326i2);
            if (iM2326i != 1414744396) {
                C1142ne c1142ne = null;
                switch (iM2326i) {
                    case 1718776947:
                        if (i6 != 2) {
                            if (i6 == 1) {
                                int iM2330m = dc1Var.m2330m();
                                if (iM2330m == 1) {
                                    str = "audio/raw";
                                } else if (iM2330m == 85) {
                                    str = "audio/mpeg";
                                } else if (iM2330m == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM2330m != 8192) {
                                    str = iM2330m != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM2330m2 = dc1Var.m2330m();
                                    int iM2326i3 = dc1Var.m2326i();
                                    dc1Var.m2317G(6);
                                    int iM7244r = z42.m7244r(dc1Var.m2330m());
                                    int iM2330m3 = dc1Var.m2318a() > 0 ? dc1Var.m2330m() : i5;
                                    byte[] bArr = new byte[iM2330m3];
                                    dc1Var.m2322e(i5, iM2330m3, bArr);
                                    ae0 ae0Var = new ae0();
                                    ae0Var.f197m = v51.m6582l(str);
                                    ae0Var.f175B = iM2330m2;
                                    ae0Var.f176C = iM2326i3;
                                    if ("audio/raw".equals(str) && iM7244r != 0) {
                                        ae0Var.f177D = iM7244r;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iM2330m3 > 0) {
                                        ae0Var.f200p = qm0.m5570t(bArr);
                                    }
                                    vv1Var = new vv1(new be0(ae0Var));
                                } else {
                                    jd0.m3621s(iM2330m, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                AbstractC1337qm.m5542i0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(z42.m7248v(i6)));
                            }
                            vv1Var = c1142ne;
                            break;
                        } else {
                            dc1Var.m2317G(i3);
                            int iM2326i4 = dc1Var.m2326i();
                            int iM2326i5 = dc1Var.m2326i();
                            dc1Var.m2317G(i3);
                            int iM2326i6 = dc1Var.m2326i();
                            switch (iM2326i6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                ae0 ae0Var2 = new ae0();
                                ae0Var2.f204t = iM2326i4;
                                ae0Var2.f205u = iM2326i5;
                                ae0Var2.f197m = v51.m6582l(str2);
                                vv1Var = new vv1(new be0(ae0Var2));
                            } else {
                                jd0.m3621s(iM2326i6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                vv1Var = c1142ne;
                            }
                        }
                        break;
                    case 1751742049:
                        int iM2326i7 = dc1Var.m2326i();
                        dc1Var.m2317G(8);
                        int iM2326i8 = dc1Var.m2326i();
                        int iM2326i9 = dc1Var.m2326i();
                        dc1Var.m2317G(i3);
                        dc1Var.m2326i();
                        dc1Var.m2317G(12);
                        vv1Var = new C1105me(iM2326i7, iM2326i8, iM2326i9);
                        break;
                    case 1752331379:
                        int iM2326i10 = dc1Var.m2326i();
                        dc1Var.m2317G(12);
                        dc1Var.m2326i();
                        int iM2326i11 = dc1Var.m2326i();
                        int iM2326i12 = dc1Var.m2326i();
                        dc1Var.m2317G(i3);
                        int iM2326i13 = dc1Var.m2326i();
                        int iM2326i14 = dc1Var.m2326i();
                        dc1Var.m2317G(8);
                        c1142ne = new C1142ne(iM2326i10, iM2326i11, iM2326i12, iM2326i13, iM2326i14);
                        vv1Var = c1142ne;
                        break;
                    case 1852994675:
                        vv1Var = new wv1(dc1Var.m2335r(dc1Var.m2318a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        vv1Var = c1142ne;
                        break;
                }
            } else {
                vv1Var = m2121b(dc1Var.m2326i(), dc1Var);
            }
            if (vv1Var != null) {
                if (vv1Var.getType() == 1752331379) {
                    int i8 = ((C1142ne) vv1Var).f7384a;
                    if (i8 == 1935960438) {
                        i6 = 2;
                    } else if (i8 != 1935963489) {
                        if (i8 != 1937012852) {
                            AbstractC1337qm.m5542i0("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i8));
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                        i6 = i2;
                    } else {
                        i6 = 1;
                    }
                }
                int i9 = i7 + 1;
                int iM3900f = km0.m3900f(objArrCopyOf.length, i9);
                if (iM3900f > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM3900f);
                }
                objArrCopyOf[i7] = vv1Var;
                i7 = i9;
            }
            dc1Var.m2316F(iM2326i2);
            dc1Var.m2315E(i4);
            i3 = 4;
            i5 = 0;
        }
        return new ct0(i, qm0.m5565k(i7, objArrCopyOf));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0787je m2122a(Class cls) {
        om0 om0VarListIterator = this.f2610a.listIterator(0);
        while (om0VarListIterator.hasNext()) {
            InterfaceC0787je interfaceC0787je = (InterfaceC0787je) om0VarListIterator.next();
            if (interfaceC0787je.getClass() == cls) {
                return interfaceC0787je;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC0787je
    public final int getType() {
        return this.f2611b;
    }
}
