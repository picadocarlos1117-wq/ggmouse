package p000;

import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b51 implements qp1 {

    /* JADX INFO: renamed from: n */
    public static final int[] f1159n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f1160o = k42.m3785j();

    /* JADX INFO: renamed from: a */
    public final int[] f1161a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1162b;

    /* JADX INFO: renamed from: c */
    public final int f1163c;

    /* JADX INFO: renamed from: d */
    public final int f1164d;

    /* JADX INFO: renamed from: e */
    public final y41 f1165e;

    /* JADX INFO: renamed from: f */
    public final boolean f1166f;

    /* JADX INFO: renamed from: g */
    public final int[] f1167g;

    /* JADX INFO: renamed from: h */
    public final int f1168h;

    /* JADX INFO: renamed from: i */
    public final int f1169i;

    /* JADX INFO: renamed from: j */
    public final m81 f1170j;

    /* JADX INFO: renamed from: k */
    public final ft0 f1171k;

    /* JADX INFO: renamed from: l */
    public final b42 f1172l;

    /* JADX INFO: renamed from: m */
    public final jy0 f1173m;

    public b51(int[] iArr, Object[] objArr, int i, int i2, y41 y41Var, int[] iArr2, int i3, int i4, m81 m81Var, ft0 ft0Var, b42 b42Var, v80 v80Var, jy0 jy0Var) {
        this.f1161a = iArr;
        this.f1162b = objArr;
        this.f1163c = i;
        this.f1164d = i2;
        this.f1166f = y41Var instanceof fi0;
        this.f1167g = iArr2;
        this.f1168h = i3;
        this.f1169i = i4;
        this.f1170j = m81Var;
        this.f1171k = ft0Var;
        this.f1172l = b42Var;
        this.f1165e = y41Var;
        this.f1173m = jy0Var;
    }

    /* JADX INFO: renamed from: A */
    public static b51 m876A(si1 si1Var, m81 m81Var, ft0 ft0Var, b42 b42Var, v80 v80Var, jy0 jy0Var) {
        if (si1Var instanceof si1) {
            return m877B(si1Var, m81Var, ft0Var, b42Var, v80Var, jy0Var);
        }
        l41.m4035b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    /* JADX INFO: renamed from: B */
    public static b51 m877B(si1 si1Var, m81 m81Var, ft0 ft0Var, b42 b42Var, v80 v80Var, jy0 jy0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldM881M;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM881M2;
        int i27;
        Object obj2;
        Field fieldM881M3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = si1Var.f10413b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f1159n;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i61;
            i7 = iCharAt9;
        }
        Unsafe unsafe = f1160o;
        Object[] objArr = si1Var.f10414c;
        Class<?> cls = si1Var.f10412a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= i32) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i16;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i30;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i72 = i29;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int iCharAt12 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i25 = i6 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i80 == 12 && (AbstractC1308pu.m5334a(si1Var.m6103a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldM881M2 = (Field) obj;
                    } else {
                        fieldM881M2 = m881M(cls, (String) obj);
                        objArr3[i26] = fieldM881M2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM881M2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldM881M3 = (Field) obj2;
                    } else {
                        fieldM881M3 = m881M(cls, (String) obj2);
                        objArr3[i27] = fieldM881M3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM881M3);
                    int i82 = i4;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i23 = iObjectFieldOffset3;
                    i18 = i82;
                    i22 = i6;
                    i20 = i81;
                    i21 = 0;
                    cls = cls;
                }
                i6 = i25;
                i26 = iCharAt12 * 2;
                obj = objArr3[i26];
                if (obj instanceof Field) {
                    fieldM881M2 = (Field) obj;
                } else {
                    fieldM881M2 = m881M(cls, (String) obj);
                    objArr3[i26] = fieldM881M2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM881M2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldM881M3 = (Field) obj2;
                } else {
                    fieldM881M3 = m881M(cls, (String) obj2);
                    objArr3[i27] = fieldM881M3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldM881M3);
                int i83 = i4;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i23 = iObjectFieldOffset5;
                i18 = i83;
                i22 = i6;
                i20 = i81;
                i21 = 0;
                cls = cls;
            } else {
                int i84 = i6 + 1;
                Field fieldM881M4 = m881M(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldM881M4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (si1Var.m6103a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM881M4);
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            int i85 = i72 + 1;
                            int iCharAt13 = str.charAt(i72);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i20 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldM881M = (Field) obj3;
                            } else {
                                fieldM881M = m881M(cls, (String) obj3);
                                objArr3[i88] = fieldM881M;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM881M);
                            i21 = iCharAt13 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            iArr[i64] = iObjectFieldOffset;
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i67;
                            int i90 = (i67 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr2[i90] = objArr3[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                                i18 = i4;
                                i65 = i89;
                            } else {
                                i19 = i91;
                                i65 = i89;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM881M4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        }
                        if (i75 >= 18) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        }
                    }
                    i19 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM881M4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM881M4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                } else {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
            }
            int i92 = i67 + 1;
            iArr4[i67] = i76;
            int i93 = i67 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
            i67 += 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i34 = i20;
            i32 = 55296;
            i6 = i22;
            iArr3 = iArr4;
        }
        return new b51(iArr3, objArr2, i2, i5, si1Var.f10412a, iArr, i7, i63, m81Var, ft0Var, b42Var, v80Var, jy0Var);
    }

    /* JADX INFO: renamed from: C */
    public static long m878C(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: D */
    public static int m879D(long j, Object obj) {
        return ((Integer) k42.f5664c.m3556k(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: E */
    public static long m880E(long j, Object obj) {
        return ((Long) k42.f5664c.m3556k(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: M */
    public static Field m881M(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM5347n = AbstractC1308pu.m5347n("Field ", str, " for ");
            sbM5347n.append(cls.getName());
            sbM5347n.append(" not found. Known fields are ");
            l41.m4044m(sbM5347n, Arrays.toString(declaredFields));
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static int m882S(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: l */
    public static void m883l(Object obj) {
        if (m885t(obj)) {
            return;
        }
        l41.m4038g(obj, "Mutating immutable message: ");
    }

    /* JADX INFO: renamed from: m */
    public static int m884m(byte[] bArr, int i, int i2, hb2 hb2Var, Class cls, C1583x9 c1583x9) throws rp0 {
        switch (hb2Var.ordinal()) {
            case 0:
                c1583x9.f12496c = Double.valueOf(Double.longBitsToDouble(rc2.m5801r(i, bArr)));
                return i + 8;
            case 1:
                c1583x9.f12496c = Float.valueOf(Float.intBitsToFloat(rc2.m5800q(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int iM5761B = rc2.m5761B(bArr, i, c1583x9);
                c1583x9.f12496c = Long.valueOf(c1583x9.f12495b);
                return iM5761B;
            case 4:
            case 12:
            case 13:
                int iM5811z = rc2.m5811z(bArr, i, c1583x9);
                c1583x9.f12496c = Integer.valueOf(c1583x9.f12494a);
                return iM5811z;
            case 5:
            case 15:
                c1583x9.f12496c = Long.valueOf(rc2.m5801r(i, bArr));
                return i + 8;
            case 6:
            case 14:
                c1583x9.f12496c = Integer.valueOf(rc2.m5800q(i, bArr));
                return i + 4;
            case 7:
                int iM5761B2 = rc2.m5761B(bArr, i, c1583x9);
                c1583x9.f12496c = Boolean.valueOf(c1583x9.f12495b != 0);
                return iM5761B2;
            case 8:
                int iM5811z2 = rc2.m5811z(bArr, i, c1583x9);
                int i3 = c1583x9.f12494a;
                if (i3 < 0) {
                    throw rp0.m5885f();
                }
                if (i3 == 0) {
                    c1583x9.f12496c = "";
                    return iM5811z2;
                }
                c1583x9.f12496c = w42.f11969a.mo5815v(iM5811z2, i3, bArr);
                return iM5811z2 + i3;
            case 9:
            default:
                l41.m4048q("unsupported field type.");
                return 0;
            case 10:
                qp1 qp1VarM4549a = nh1.f7407c.m4549a(cls);
                Object objMo909j = qp1VarM4549a.mo909j();
                int iM5775Y = rc2.m5775Y(objMo909j, qp1VarM4549a, bArr, i, i2, c1583x9);
                qp1VarM4549a.mo901b(objMo909j);
                c1583x9.f12496c = objMo909j;
                return iM5775Y;
            case 11:
                return rc2.m5798p(bArr, i, c1583x9);
            case 16:
                int iM5811z3 = rc2.m5811z(bArr, i, c1583x9);
                c1583x9.f12496c = Integer.valueOf(AbstractC0762ip.m3466b(c1583x9.f12494a));
                return iM5811z3;
            case 17:
                int iM5761B3 = rc2.m5761B(bArr, i, c1583x9);
                c1583x9.f12496c = Long.valueOf(AbstractC0762ip.m3467c(c1583x9.f12495b));
                return iM5761B3;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m885t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof fi0) {
            return ((fi0) obj).isMutable();
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final int m886F(Object obj, byte[] bArr, int i, int i2, int i3, long j, C1583x9 c1583x9) throws rp0 {
        int iM884m;
        Unsafe unsafe = f1160o;
        Object objM913p = m913p(i3);
        Object object = unsafe.getObject(obj, j);
        this.f1173m.getClass();
        if (!((iy0) object).f5199a) {
            iy0 iy0VarM3499c = iy0.f5198b.m3499c();
            jy0.m3726a(iy0VarM3499c, object);
            unsafe.putObject(obj, j, iy0VarM3499c);
            object = iy0VarM3499c;
        }
        C1174o9 c1174o9 = ((hy0) objM913p).f4745a;
        iy0 iy0Var = (iy0) object;
        int iM5811z = rc2.m5811z(bArr, i, c1583x9);
        int i4 = c1583x9.f12494a;
        if (i4 < 0 || i4 > i2 - iM5811z) {
            throw rp0.m5887h();
        }
        int i5 = iM5811z + i4;
        Object obj2 = c1174o9.f7701d;
        Object obj3 = "";
        Object obj4 = obj2;
        while (iM5811z < i5) {
            int iM5810y = iM5811z + 1;
            int i6 = bArr[iM5811z];
            if (i6 < 0) {
                iM5810y = rc2.m5810y(i6, bArr, iM5810y, c1583x9);
                i6 = c1583x9.f12494a;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2) {
                    hb2 hb2Var = (hb2) c1174o9.f7700c;
                    if (i8 == hb2Var.f4518b) {
                        iM884m = m884m(bArr, iM5810y, i2, hb2Var, obj2.getClass(), c1583x9);
                        obj4 = c1583x9.f12496c;
                        iM5811z = iM884m;
                    }
                }
                iM5811z = rc2.m5799p0(i6, bArr, iM5810y, i2, c1583x9);
            } else {
                hb2 hb2Var2 = (hb2) c1174o9.f7699b;
                if (i8 == hb2Var2.f4518b) {
                    iM884m = m884m(bArr, iM5810y, i2, hb2Var2, null, c1583x9);
                    obj3 = c1583x9.f12496c;
                    iM5811z = iM884m;
                } else {
                    iM5811z = rc2.m5799p0(i6, bArr, iM5810y, i2, c1583x9);
                }
            }
        }
        if (iM5811z != i5) {
            throw rp0.m5886g();
        }
        iy0Var.put(obj3, obj4);
        return i5;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: G */
    public final int m887G(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, p000.C1583x9 r34) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b51.m887G(java.lang.Object, byte[], int, int, int, x9):int");
    }

    /* JADX INFO: renamed from: H */
    public final int m888H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C1583x9 c1583x9) throws rp0 {
        int i9;
        Unsafe unsafe = f1160o;
        long j2 = this.f1161a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(rc2.m5801r(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(rc2.m5800q(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int iM5761B = rc2.m5761B(bArr, i, c1583x9);
                unsafe.putObject(obj, j, Long.valueOf(c1583x9.f12495b));
                unsafe.putInt(obj, j2, i4);
                return iM5761B;
            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM5811z = rc2.m5811z(bArr, i, c1583x9);
                unsafe.putObject(obj, j, Integer.valueOf(c1583x9.f12494a));
                unsafe.putInt(obj, j2, i4);
                return iM5811z;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(rc2.m5801r(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(rc2.m5800q(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM5761B2 = rc2.m5761B(bArr, i, c1583x9);
                unsafe.putObject(obj, j, Boolean.valueOf(c1583x9.f12495b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM5761B2;
            case LinuxInputConstants.KEY_F1 /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int iM5811z2 = rc2.m5811z(bArr, i, c1583x9);
                int i14 = c1583x9.f12494a;
                if (i14 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!w42.f11969a.m5813V(iM5811z2, iM5811z2 + i14, bArr)) {
                            throw rp0.m5882c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM5811z2, i14, no0.f7481a));
                    iM5811z2 += i14;
                }
                unsafe.putInt(obj, j2, i4);
                return iM5811z2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objM922z = m922z(i4, i8, obj);
                    int iM5775Y = rc2.m5775Y(objM922z, m914q(i8), bArr, i9, i2, c1583x9);
                    m897R(obj, i4, i8, objM922z);
                    return iM5775Y;
                }
                return i9;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                i9 = i;
                if (i5 == 2) {
                    int iM5798p = rc2.m5798p(bArr, i9, c1583x9);
                    unsafe.putObject(obj, j, c1583x9.f12496c);
                    unsafe.putInt(obj, j2, i4);
                    return iM5798p;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int iM5811z3 = rc2.m5811z(bArr, i9, c1583x9);
                    int i15 = c1583x9.f12494a;
                    m912o(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i15));
                    unsafe.putInt(obj, j2, i4);
                    return iM5811z3;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int iM5811z4 = rc2.m5811z(bArr, i9, c1583x9);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC0762ip.m3466b(c1583x9.f12494a)));
                    unsafe.putInt(obj, j2, i4);
                    return iM5811z4;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iM5761B3 = rc2.m5761B(bArr, i9, c1583x9);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC0762ip.m3467c(c1583x9.f12495b)));
                    unsafe.putInt(obj, j2, i4);
                    return iM5761B3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objM922z2 = m922z(i4, i8, obj);
                    int iM5774X = rc2.m5774X(objM922z2, m914q(i8), bArr, i, i2, (i3 & (-8)) | 4, c1583x9);
                    m897R(obj, i4, i8, objM922z2);
                    return iM5774X;
                }
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m889I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C1583x9 c1583x9) throws rp0 {
        int iM5811z;
        int i7;
        int i8;
        int iM5760A;
        Unsafe unsafe = f1160o;
        mo0 mo0VarMo2783d = (mo0) unsafe.getObject(obj, j2);
        if (!((AbstractC1316q1) mo0VarMo2783d).f9289a) {
            int size = mo0VarMo2783d.size();
            mo0VarMo2783d = mo0VarMo2783d.mo2783d(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, mo0VarMo2783d);
        }
        mo0 mo0Var = mo0VarMo2783d;
        switch (i6) {
            case 18:
            case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                if (i4 == 2) {
                    q30 q30Var = (q30) mo0Var;
                    int iM5811z2 = rc2.m5811z(bArr, i, c1583x9);
                    int i9 = c1583x9.f12494a + iM5811z2;
                    while (iM5811z2 < i9) {
                        q30Var.m5439b(Double.longBitsToDouble(rc2.m5801r(iM5811z2, bArr)));
                        iM5811z2 += 8;
                    }
                    if (iM5811z2 == i9) {
                        return iM5811z2;
                    }
                    throw rp0.m5887h();
                }
                if (i4 != 1) {
                    return i;
                }
                q30 q30Var2 = (q30) mo0Var;
                q30Var2.m5439b(Double.longBitsToDouble(rc2.m5801r(i, bArr)));
                int i10 = i + 8;
                while (i10 < i2) {
                    int iM5811z3 = rc2.m5811z(bArr, i10, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return i10;
                    }
                    q30Var2.m5439b(Double.longBitsToDouble(rc2.m5801r(iM5811z3, bArr)));
                    i10 = iM5811z3 + 8;
                }
                return i10;
            case 19:
            case 36:
                if (i4 == 2) {
                    fb0 fb0Var = (fb0) mo0Var;
                    int iM5811z4 = rc2.m5811z(bArr, i, c1583x9);
                    int i11 = c1583x9.f12494a + iM5811z4;
                    while (iM5811z4 < i11) {
                        fb0Var.m2782b(Float.intBitsToFloat(rc2.m5800q(iM5811z4, bArr)));
                        iM5811z4 += 4;
                    }
                    if (iM5811z4 == i11) {
                        return iM5811z4;
                    }
                    throw rp0.m5887h();
                }
                if (i4 != 5) {
                    return i;
                }
                fb0 fb0Var2 = (fb0) mo0Var;
                fb0Var2.m2782b(Float.intBitsToFloat(rc2.m5800q(i, bArr)));
                int i12 = i + 4;
                while (i12 < i2) {
                    int iM5811z5 = rc2.m5811z(bArr, i12, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return i12;
                    }
                    fb0Var2.m2782b(Float.intBitsToFloat(rc2.m5800q(iM5811z5, bArr)));
                    i12 = iM5811z5 + 4;
                }
                return i12;
            case 20:
            case 21:
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
            case 38:
                if (i4 == 2) {
                    yv0 yv0Var = (yv0) mo0Var;
                    int iM5811z6 = rc2.m5811z(bArr, i, c1583x9);
                    int i13 = c1583x9.f12494a + iM5811z6;
                    while (iM5811z6 < i13) {
                        iM5811z6 = rc2.m5761B(bArr, iM5811z6, c1583x9);
                        yv0Var.m7151b(c1583x9.f12495b);
                    }
                    if (iM5811z6 == i13) {
                        return iM5811z6;
                    }
                    throw rp0.m5887h();
                }
                if (i4 != 0) {
                    return i;
                }
                yv0 yv0Var2 = (yv0) mo0Var;
                int iM5761B = rc2.m5761B(bArr, i, c1583x9);
                yv0Var2.m7151b(c1583x9.f12495b);
                while (iM5761B < i2) {
                    int iM5811z7 = rc2.m5811z(bArr, iM5761B, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return iM5761B;
                    }
                    iM5761B = rc2.m5761B(bArr, iM5811z7, c1583x9);
                    yv0Var2.m7151b(c1583x9.f12495b);
                }
                return iM5761B;
            case 22:
            case 29:
            case BuildConfig.VERSION_CODE /* 39 */:
            case 43:
                iM5811z = i;
                if (i4 == 2) {
                    yn0 yn0Var = (yn0) mo0Var;
                    int iM5811z8 = rc2.m5811z(bArr, i, c1583x9);
                    int i14 = c1583x9.f12494a + iM5811z8;
                    while (iM5811z8 < i14) {
                        iM5811z8 = rc2.m5811z(bArr, iM5811z8, c1583x9);
                        yn0Var.m7099b(c1583x9.f12494a);
                    }
                    if (iM5811z8 == i14) {
                        return iM5811z8;
                    }
                    throw rp0.m5887h();
                }
                if (i4 == 0) {
                    return rc2.m5760A(i3, bArr, iM5811z, i2, mo0Var, c1583x9);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                iM5811z = i;
                if (i4 == 2) {
                    yv0 yv0Var3 = (yv0) mo0Var;
                    int iM5811z9 = rc2.m5811z(bArr, i, c1583x9);
                    int i15 = c1583x9.f12494a + iM5811z9;
                    while (iM5811z9 < i15) {
                        yv0Var3.m7151b(rc2.m5801r(iM5811z9, bArr));
                        iM5811z9 += 8;
                    }
                    if (iM5811z9 == i15) {
                        return iM5811z9;
                    }
                    throw rp0.m5887h();
                }
                if (i4 == 1) {
                    yv0 yv0Var4 = (yv0) mo0Var;
                    yv0Var4.m7151b(rc2.m5801r(i, bArr));
                    while (true) {
                        i7 = iM5811z + 8;
                        if (i7 < i2) {
                            iM5811z = rc2.m5811z(bArr, i7, c1583x9);
                            if (i3 == c1583x9.f12494a) {
                                yv0Var4.m7151b(rc2.m5801r(iM5811z, bArr));
                            }
                        }
                    }
                    return i7;
                }
                break;
            case 24:
            case InjectionMetrics.I_APPLY_DELTA /* 31 */:
            case 41:
            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                iM5811z = i;
                if (i4 == 2) {
                    yn0 yn0Var2 = (yn0) mo0Var;
                    int iM5811z10 = rc2.m5811z(bArr, i, c1583x9);
                    int i16 = c1583x9.f12494a + iM5811z10;
                    while (iM5811z10 < i16) {
                        yn0Var2.m7099b(rc2.m5800q(iM5811z10, bArr));
                        iM5811z10 += 4;
                    }
                    if (iM5811z10 == i16) {
                        return iM5811z10;
                    }
                    throw rp0.m5887h();
                }
                if (i4 == 5) {
                    yn0 yn0Var3 = (yn0) mo0Var;
                    yn0Var3.m7099b(rc2.m5800q(i, bArr));
                    while (true) {
                        i8 = iM5811z + 4;
                        if (i8 < i2) {
                            iM5811z = rc2.m5811z(bArr, i8, c1583x9);
                            if (i3 == c1583x9.f12494a) {
                                yn0Var3.m7099b(rc2.m5800q(iM5811z, bArr));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 25:
            case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                iM5811z = i;
                if (i4 == 2) {
                    C0829ki c0829ki = (C0829ki) mo0Var;
                    int iM5811z11 = rc2.m5811z(bArr, i, c1583x9);
                    int i17 = c1583x9.f12494a + iM5811z11;
                    while (iM5811z11 < i17) {
                        iM5811z11 = rc2.m5761B(bArr, iM5811z11, c1583x9);
                        c0829ki.m3836b(c1583x9.f12495b != 0);
                    }
                    if (iM5811z11 == i17) {
                        return iM5811z11;
                    }
                    throw rp0.m5887h();
                }
                if (i4 == 0) {
                    C0829ki c0829ki2 = (C0829ki) mo0Var;
                    int iM5761B2 = rc2.m5761B(bArr, i, c1583x9);
                    c0829ki2.m3836b(c1583x9.f12495b != 0);
                    while (iM5761B2 < i2) {
                        int iM5811z12 = rc2.m5811z(bArr, iM5761B2, c1583x9);
                        if (i3 != c1583x9.f12494a) {
                            return iM5761B2;
                        }
                        iM5761B2 = rc2.m5761B(bArr, iM5811z12, c1583x9);
                        c0829ki2.m3836b(c1583x9.f12495b != 0);
                    }
                    return iM5761B2;
                }
                break;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                iM5811z = i;
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iM5811z13 = rc2.m5811z(bArr, i, c1583x9);
                        int i18 = c1583x9.f12494a;
                        if (i18 < 0) {
                            throw rp0.m5885f();
                        }
                        if (i18 == 0) {
                            mo0Var.add("");
                        } else {
                            mo0Var.add(new String(bArr, iM5811z13, i18, no0.f7481a));
                            iM5811z13 += i18;
                        }
                        while (iM5811z13 < i2) {
                            int iM5811z14 = rc2.m5811z(bArr, iM5811z13, c1583x9);
                            if (i3 != c1583x9.f12494a) {
                                return iM5811z13;
                            }
                            iM5811z13 = rc2.m5811z(bArr, iM5811z14, c1583x9);
                            int i19 = c1583x9.f12494a;
                            if (i19 < 0) {
                                throw rp0.m5885f();
                            }
                            if (i19 == 0) {
                                mo0Var.add("");
                            } else {
                                mo0Var.add(new String(bArr, iM5811z13, i19, no0.f7481a));
                                iM5811z13 += i19;
                            }
                        }
                        return iM5811z13;
                    }
                    int iM5811z15 = rc2.m5811z(bArr, i, c1583x9);
                    int i20 = c1583x9.f12494a;
                    if (i20 < 0) {
                        throw rp0.m5885f();
                    }
                    if (i20 == 0) {
                        mo0Var.add("");
                    } else {
                        int i21 = iM5811z15 + i20;
                        if (!w42.f11969a.m5813V(iM5811z15, i21, bArr)) {
                            throw rp0.m5882c();
                        }
                        mo0Var.add(new String(bArr, iM5811z15, i20, no0.f7481a));
                        iM5811z15 = i21;
                    }
                    while (iM5811z15 < i2) {
                        int iM5811z16 = rc2.m5811z(bArr, iM5811z15, c1583x9);
                        if (i3 != c1583x9.f12494a) {
                            return iM5811z15;
                        }
                        iM5811z15 = rc2.m5811z(bArr, iM5811z16, c1583x9);
                        int i22 = c1583x9.f12494a;
                        if (i22 < 0) {
                            throw rp0.m5885f();
                        }
                        if (i22 == 0) {
                            mo0Var.add("");
                        } else {
                            int i23 = iM5811z15 + i22;
                            if (!w42.f11969a.m5813V(iM5811z15, i23, bArr)) {
                                throw rp0.m5882c();
                            }
                            mo0Var.add(new String(bArr, iM5811z15, i22, no0.f7481a));
                            iM5811z15 = i23;
                        }
                    }
                    return iM5811z15;
                }
                break;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return i4 == 2 ? rc2.m5804t(m914q(i5), i3, bArr, i, i2, mo0Var, c1583x9) : i;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                if (i4 != 2) {
                    return i;
                }
                int iM5811z17 = rc2.m5811z(bArr, i, c1583x9);
                int i24 = c1583x9.f12494a;
                if (i24 < 0) {
                    throw rp0.m5885f();
                }
                if (i24 > bArr.length - iM5811z17) {
                    throw rp0.m5887h();
                }
                if (i24 == 0) {
                    mo0Var.add(AbstractC0753ik.f5042b);
                } else {
                    mo0Var.add(AbstractC0753ik.m3441i(iM5811z17, i24, bArr));
                    iM5811z17 += i24;
                }
                while (iM5811z17 < i2) {
                    int iM5811z18 = rc2.m5811z(bArr, iM5811z17, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return iM5811z17;
                    }
                    iM5811z17 = rc2.m5811z(bArr, iM5811z18, c1583x9);
                    int i25 = c1583x9.f12494a;
                    if (i25 < 0) {
                        throw rp0.m5885f();
                    }
                    if (i25 > bArr.length - iM5811z17) {
                        throw rp0.m5887h();
                    }
                    if (i25 == 0) {
                        mo0Var.add(AbstractC0753ik.f5042b);
                    } else {
                        mo0Var.add(AbstractC0753ik.m3441i(iM5811z17, i25, bArr));
                        iM5811z17 += i25;
                    }
                }
                return iM5811z17;
            case 30:
            case 44:
                if (i4 == 2) {
                    yn0 yn0Var4 = (yn0) mo0Var;
                    iM5760A = rc2.m5811z(bArr, i, c1583x9);
                    int i26 = c1583x9.f12494a + iM5760A;
                    while (iM5760A < i26) {
                        iM5760A = rc2.m5811z(bArr, iM5760A, c1583x9);
                        yn0Var4.m7099b(c1583x9.f12494a);
                    }
                    if (iM5760A != i26) {
                        throw rp0.m5887h();
                    }
                } else {
                    if (i4 != 0) {
                        return i;
                    }
                    iM5760A = rc2.m5760A(i3, bArr, i, i2, mo0Var, c1583x9);
                }
                m912o(i5);
                Class cls = tp1.f10919a;
                return iM5760A;
            case InjectionMetrics.I_KEY_EVENTS /* 33 */:
            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                if (i4 == 2) {
                    yn0 yn0Var5 = (yn0) mo0Var;
                    int iM5811z19 = rc2.m5811z(bArr, i, c1583x9);
                    int i27 = c1583x9.f12494a + iM5811z19;
                    while (iM5811z19 < i27) {
                        iM5811z19 = rc2.m5811z(bArr, iM5811z19, c1583x9);
                        yn0Var5.m7099b(AbstractC0762ip.m3466b(c1583x9.f12494a));
                    }
                    if (iM5811z19 == i27) {
                        return iM5811z19;
                    }
                    throw rp0.m5887h();
                }
                if (i4 != 0) {
                    return i;
                }
                yn0 yn0Var6 = (yn0) mo0Var;
                int iM5811z20 = rc2.m5811z(bArr, i, c1583x9);
                yn0Var6.m7099b(AbstractC0762ip.m3466b(c1583x9.f12494a));
                while (iM5811z20 < i2) {
                    int iM5811z21 = rc2.m5811z(bArr, iM5811z20, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return iM5811z20;
                    }
                    iM5811z20 = rc2.m5811z(bArr, iM5811z21, c1583x9);
                    yn0Var6.m7099b(AbstractC0762ip.m3466b(c1583x9.f12494a));
                }
                return iM5811z20;
            case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
            case 48:
                if (i4 == 2) {
                    yv0 yv0Var5 = (yv0) mo0Var;
                    int iM5811z22 = rc2.m5811z(bArr, i, c1583x9);
                    int i28 = c1583x9.f12494a + iM5811z22;
                    while (iM5811z22 < i28) {
                        iM5811z22 = rc2.m5761B(bArr, iM5811z22, c1583x9);
                        yv0Var5.m7151b(AbstractC0762ip.m3467c(c1583x9.f12495b));
                    }
                    if (iM5811z22 == i28) {
                        return iM5811z22;
                    }
                    throw rp0.m5887h();
                }
                if (i4 != 0) {
                    return i;
                }
                yv0 yv0Var6 = (yv0) mo0Var;
                int iM5761B3 = rc2.m5761B(bArr, i, c1583x9);
                yv0Var6.m7151b(AbstractC0762ip.m3467c(c1583x9.f12495b));
                while (iM5761B3 < i2) {
                    int iM5811z23 = rc2.m5811z(bArr, iM5761B3, c1583x9);
                    if (i3 != c1583x9.f12494a) {
                        return iM5761B3;
                    }
                    iM5761B3 = rc2.m5761B(bArr, iM5811z23, c1583x9);
                    yv0Var6.m7151b(AbstractC0762ip.m3467c(c1583x9.f12495b));
                }
                return iM5761B3;
            case 49:
                if (i4 == 3) {
                    qp1 qp1VarM914q = m914q(i5);
                    int i29 = (i3 & (-8)) | 4;
                    int iM5802s = rc2.m5802s(qp1VarM914q, bArr, i, i2, i29, c1583x9);
                    qp1 qp1Var = qp1VarM914q;
                    int i30 = i29;
                    mo0Var.add(c1583x9.f12496c);
                    while (iM5802s < i2) {
                        int iM5811z24 = rc2.m5811z(bArr, iM5802s, c1583x9);
                        if (i3 != c1583x9.f12494a) {
                            return iM5802s;
                        }
                        qp1 qp1Var2 = qp1Var;
                        int i31 = i30;
                        iM5802s = rc2.m5802s(qp1Var2, bArr, iM5811z24, i2, i31, c1583x9);
                        mo0Var.add(c1583x9.f12496c);
                        qp1Var = qp1Var2;
                        i30 = i31;
                    }
                    return iM5802s;
                }
            default:
                return i;
        }
        return iM5811z;
    }

    /* JADX INFO: renamed from: J */
    public final void m890J(Object obj, long j, C0799jp c0799jp, qp1 qp1Var, u80 u80Var) throws qp0 {
        int iMo2635z;
        List listMo2389c = this.f1171k.mo2389c(j, obj);
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) c0799jp.f5485d;
        int i = c0799jp.f5482a;
        if ((i & 7) != 3) {
            throw rp0.m5883d();
        }
        do {
            Object objMo909j = qp1Var.mo909j();
            c0799jp.m3682b(objMo909j, qp1Var, u80Var);
            qp1Var.mo901b(objMo909j);
            listMo2389c.add(objMo909j);
            if (abstractC0762ip.mo2617e() || c0799jp.f5484c != 0) {
                return;
            } else {
                iMo2635z = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z == i);
        c0799jp.f5484c = iMo2635z;
    }

    /* JADX INFO: renamed from: K */
    public final void m891K(Object obj, int i, C0799jp c0799jp, qp1 qp1Var, u80 u80Var) throws rp0 {
        int iMo2635z;
        List listMo2389c = this.f1171k.mo2389c(i & 1048575, obj);
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) c0799jp.f5485d;
        int i2 = c0799jp.f5482a;
        if ((i2 & 7) != 2) {
            throw rp0.m5883d();
        }
        do {
            Object objMo909j = qp1Var.mo909j();
            c0799jp.m3683c(objMo909j, qp1Var, u80Var);
            qp1Var.mo901b(objMo909j);
            listMo2389c.add(objMo909j);
            if (abstractC0762ip.mo2617e() || c0799jp.f5484c != 0) {
                return;
            } else {
                iMo2635z = abstractC0762ip.mo2635z();
            }
        } while (iMo2635z == i2);
        c0799jp.f5484c = iMo2635z;
    }

    /* JADX INFO: renamed from: L */
    public final void m892L(Object obj, int i, C0799jp c0799jp) throws qp0 {
        if ((536870912 & i) != 0) {
            c0799jp.m3704x(2);
            k42.m3791p(obj, i & 1048575, ((AbstractC0762ip) c0799jp.f5485d).mo2634y());
        } else if (!this.f1166f) {
            k42.m3791p(obj, i & 1048575, c0799jp.m3685e());
        } else {
            c0799jp.m3704x(2);
            k42.m3791p(obj, i & 1048575, ((AbstractC0762ip) c0799jp.f5485d).mo2633x());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m893N(int i, Object obj) {
        int i2 = this.f1161a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        k42.m3789n(obj, (1 << (i2 >>> 20)) | k42.f5664c.m3554i(j, obj), j);
    }

    /* JADX INFO: renamed from: O */
    public final void m894O(int i, int i2, Object obj) {
        k42.m3789n(obj, i, this.f1161a[i2 + 2] & 1048575);
    }

    /* JADX INFO: renamed from: P */
    public final int m895P(int i, int i2) {
        int[] iArr = this.f1161a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m896Q(int i, Object obj, Object obj2) {
        f1160o.putObject(obj, m898T(i) & 1048575, obj2);
        m893N(i, obj);
    }

    /* JADX INFO: renamed from: R */
    public final void m897R(Object obj, int i, int i2, Object obj2) {
        f1160o.putObject(obj, m898T(i2) & 1048575, obj2);
        m894O(i, i2, obj);
    }

    /* JADX INFO: renamed from: T */
    public final int m898T(int i) {
        return this.f1161a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: U */
    public final void m899U(Object obj, ay0 ay0Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        b51 b51Var = this;
        int[] iArr = b51Var.f1161a;
        int length = iArr.length;
        Unsafe unsafe = f1160o;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int iM898T = b51Var.m898T(i6);
            int i8 = iArr[i6];
            int iM882S = m882S(iM898T);
            int i9 = 1;
            if (iM882S <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i4;
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(obj, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iM898T & i4;
            switch (iM882S) {
                case 0:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        double dMo3101g = k42.f5664c.mo3101g(j, obj);
                        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
                        abstractC1153np.getClass();
                        abstractC1153np.mo3983n(i8, Double.doubleToRawLongBits(dMo3101g));
                    }
                    break;
                case 1:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        float fMo3102h = k42.f5664c.mo3102h(j, obj);
                        AbstractC1153np abstractC1153np2 = (AbstractC1153np) ay0Var.f1096b;
                        abstractC1153np2.getClass();
                        abstractC1153np2.mo3981l(i8, Float.floatToRawIntBits(fMo3102h));
                    }
                    b51Var = this;
                    break;
                case 2:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, unsafe.getLong(obj, j));
                    }
                    b51Var = this;
                    break;
                case 3:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, unsafe.getLong(obj, j));
                    }
                    b51Var = this;
                    break;
                case 4:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3985p(i8, unsafe.getInt(obj, j));
                    }
                    b51Var = this;
                    break;
                case 5:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3983n(i8, unsafe.getLong(obj, j));
                    }
                    b51Var = this;
                    break;
                case 6:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3981l(i8, unsafe.getInt(obj, j));
                    }
                    b51Var = this;
                    break;
                case 7:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3977h(i8, k42.f5664c.mo3098d(j, obj));
                    }
                    b51Var = this;
                    break;
                case 8:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC1153np) ay0Var.f1096b).mo3990u(i8, (String) object);
                        } else {
                            ((AbstractC1153np) ay0Var.f1096b).mo3979j(i8, (AbstractC0753ik) object);
                        }
                    }
                    b51Var = this;
                    break;
                case 9:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3988s(i8, (y41) unsafe.getObject(obj, j), b51Var.m914q(i6));
                    }
                    break;
                case 10:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3979j(i8, (AbstractC0753ik) unsafe.getObject(obj, j));
                    }
                    b51Var = this;
                    break;
                case 11:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3993x(i8, unsafe.getInt(obj, j));
                    }
                    b51Var = this;
                    break;
                case 12:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3985p(i8, unsafe.getInt(obj, j));
                    }
                    b51Var = this;
                    break;
                case 13:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3981l(i8, unsafe.getInt(obj, j));
                    }
                    b51Var = this;
                    break;
                case 14:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3983n(i8, unsafe.getLong(obj, j));
                    }
                    b51Var = this;
                    break;
                case 15:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((AbstractC1153np) ay0Var.f1096b).mo3993x(i8, (i12 >> 31) ^ (i12 << 1));
                    }
                    b51Var = this;
                    break;
                case 16:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    b51Var = this;
                    break;
                case 17:
                    if (b51Var.m916s(obj, i6, i5, i7, i)) {
                        ay0Var.m765D(i8, unsafe.getObject(obj, j), b51Var.m914q(i6));
                    }
                    break;
                case 18:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6320m(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 19:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6324q(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 20:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6326s(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 21:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6332y(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 22:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6325r(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 23:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6323p(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 24:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6322o(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 25:
                    i5 = i5;
                    i7 = i7;
                    tp1.m6319l(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    i2 = i5;
                    i3 = i7;
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = tp1.f10919a;
                    if (list != null && !list.isEmpty()) {
                        AbstractC1153np abstractC1153np3 = (AbstractC1153np) ay0Var.f1096b;
                        if (list instanceof yr0) {
                            yr0 yr0Var = (yr0) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object objMo2502r = yr0Var.mo2502r(i14);
                                if (objMo2502r instanceof String) {
                                    abstractC1153np3.mo3990u(i13, (String) objMo2502r);
                                } else {
                                    abstractC1153np3.mo3979j(i13, (AbstractC0753ik) objMo2502r);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                abstractC1153np3.mo3990u(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i7 = i3;
                    i5 = i2;
                    break;
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    i2 = i5;
                    i3 = i7;
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    qp1 qp1VarM914q = b51Var.m914q(i6);
                    Class cls2 = tp1.f10919a;
                    if (list2 != null && !list2.isEmpty()) {
                        ay0Var.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ((AbstractC1153np) ay0Var.f1096b).mo3988s(i16, (y41) list2.get(i17), qp1VarM914q);
                        }
                    }
                    i7 = i3;
                    i5 = i2;
                    break;
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    i2 = i5;
                    i3 = i7;
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = tp1.f10919a;
                    if (list3 != null && !list3.isEmpty()) {
                        ay0Var.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((AbstractC1153np) ay0Var.f1096b).mo3979j(i18, (AbstractC0753ik) list3.get(i19));
                        }
                    }
                    i7 = i3;
                    i5 = i2;
                    break;
                case 29:
                    z = false;
                    tp1.m6331x(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 30:
                    z = false;
                    tp1.m6321n(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                    z = false;
                    tp1.m6327t(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case 32:
                    z = false;
                    tp1.m6328u(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    z = false;
                    tp1.m6329v(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    z = false;
                    tp1.m6330w(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, false);
                    i7 = i7;
                    i5 = i5;
                    break;
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6320m(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 36:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6324q(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6326s(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 38:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6332y(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case BuildConfig.VERSION_CODE /* 39 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6325r(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 40:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6323p(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 41:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6322o(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6319l(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 43:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6331x(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 44:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6321n(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6327t(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 46:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6328u(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6329v(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 48:
                    i2 = i5;
                    i3 = i7;
                    tp1.m6330w(iArr[i6], (List) unsafe.getObject(obj, j), ay0Var, true);
                    i7 = i3;
                    i5 = i2;
                    break;
                case 49:
                    i2 = i5;
                    i3 = i7;
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    qp1 qp1VarM914q2 = b51Var.m914q(i6);
                    Class cls4 = tp1.f10919a;
                    if (list4 != null && !list4.isEmpty()) {
                        ay0Var.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ay0Var.m765D(i20, list4.get(i21), qp1VarM914q2);
                        }
                    }
                    i7 = i3;
                    i5 = i2;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objM913p = b51Var.m913p(i6);
                        b51Var.f1173m.getClass();
                        C1174o9 c1174o9 = ((hy0) objM913p).f4745a;
                        hb2 hb2Var = (hb2) c1174o9.f7700c;
                        hb2 hb2Var2 = (hb2) c1174o9.f7699b;
                        AbstractC1153np abstractC1153np4 = (AbstractC1153np) ay0Var.f1096b;
                        abstractC1153np4.getClass();
                        for (Map.Entry entry : ((iy0) object2).entrySet()) {
                            abstractC1153np4.mo3992w(i8, 2);
                            int i22 = i5;
                            abstractC1153np4.mo3994y(t90.m6254a(hb2Var, 2, entry.getValue()) + t90.m6254a(hb2Var2, i9, entry.getKey()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            t90.m6256e(abstractC1153np4, hb2Var2, 1, key);
                            t90.m6256e(abstractC1153np4, hb2Var, 2, value);
                            i7 = i7;
                            i5 = i22;
                            i9 = 1;
                        }
                    }
                    i2 = i5;
                    i3 = i7;
                    i7 = i3;
                    i5 = i2;
                    break;
                case 51:
                    if (b51Var.m917u(i8, i6, obj)) {
                        double dDoubleValue = ((Double) k42.f5664c.m3556k(j, obj)).doubleValue();
                        AbstractC1153np abstractC1153np5 = (AbstractC1153np) ay0Var.f1096b;
                        abstractC1153np5.getClass();
                        abstractC1153np5.mo3983n(i8, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (b51Var.m917u(i8, i6, obj)) {
                        float fFloatValue = ((Float) k42.f5664c.m3556k(j, obj)).floatValue();
                        AbstractC1153np abstractC1153np6 = (AbstractC1153np) ay0Var.f1096b;
                        abstractC1153np6.getClass();
                        abstractC1153np6.mo3981l(i8, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, m880E(j, obj));
                    }
                    break;
                case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, m880E(j, obj));
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3985p(i8, m879D(j, obj));
                    }
                    break;
                case 56:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3983n(i8, m880E(j, obj));
                    }
                    break;
                case 57:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3981l(i8, m879D(j, obj));
                    }
                    break;
                case 58:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3977h(i8, ((Boolean) k42.f5664c.m3556k(j, obj)).booleanValue());
                    }
                    break;
                case LinuxInputConstants.KEY_F1 /* 59 */:
                    if (b51Var.m917u(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((AbstractC1153np) ay0Var.f1096b).mo3990u(i8, (String) object3);
                        } else {
                            ((AbstractC1153np) ay0Var.f1096b).mo3979j(i8, (AbstractC0753ik) object3);
                        }
                    }
                    break;
                case 60:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3988s(i8, (y41) unsafe.getObject(obj, j), b51Var.m914q(i6));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3979j(i8, (AbstractC0753ik) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3993x(i8, m879D(j, obj));
                    }
                    break;
                case 63:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3985p(i8, m879D(j, obj));
                    }
                    break;
                case 64:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3981l(i8, m879D(j, obj));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ((AbstractC1153np) ay0Var.f1096b).mo3983n(i8, m880E(j, obj));
                    }
                    break;
                case 66:
                    if (b51Var.m917u(i8, i6, obj)) {
                        int iM879D = m879D(j, obj);
                        ((AbstractC1153np) ay0Var.f1096b).mo3993x(i8, (iM879D >> 31) ^ (iM879D << 1));
                    }
                    break;
                case 67:
                    if (b51Var.m917u(i8, i6, obj)) {
                        long jM880E = m880E(j, obj);
                        ((AbstractC1153np) ay0Var.f1096b).mo3995z(i8, (jM880E << 1) ^ (jM880E >> 63));
                    }
                    break;
                case 68:
                    if (b51Var.m917u(i8, i6, obj)) {
                        ay0Var.m765D(i8, unsafe.getObject(obj, j), b51Var.m914q(i6));
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        b51Var.f1172l.getClass();
        ((fi0) obj).unknownFields.m81g(ay0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.qp1
    /* JADX INFO: renamed from: a */
    public final void mo900a(Object obj, Object obj2) {
        Object obj3;
        m883l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f1161a;
            if (i >= iArr.length) {
                tp1.m6317j(this.f1172l, obj, obj2);
                return;
            }
            int iM898T = m898T(i);
            long j = 1048575 & iM898T;
            int i2 = iArr[i];
            switch (m882S(iM898T)) {
                case 0:
                    if (!m915r(i, obj2)) {
                        obj3 = obj;
                    } else {
                        j42 j42Var = k42.f5664c;
                        obj3 = obj;
                        j42Var.mo3105o(obj3, j, j42Var.mo3101g(j, obj2));
                        m893N(i, obj3);
                    }
                    break;
                case 1:
                    if (m915r(i, obj2)) {
                        j42 j42Var2 = k42.f5664c;
                        j42Var2.mo3106p(obj, j, j42Var2.mo3102h(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m915r(i, obj2)) {
                        k42.m3790o(obj, j, k42.f5664c.m3555j(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m915r(i, obj2)) {
                        k42.m3790o(obj, j, k42.f5664c.m3555j(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m915r(i, obj2)) {
                        k42.m3790o(obj, j, k42.f5664c.m3555j(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m915r(i, obj2)) {
                        j42 j42Var3 = k42.f5664c;
                        j42Var3.mo3103m(obj, j, j42Var3.mo3098d(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m915r(i, obj2)) {
                        k42.m3791p(obj, j, k42.f5664c.m3556k(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m919w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m915r(i, obj2)) {
                        k42.m3791p(obj, j, k42.f5664c.m3556k(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m915r(i, obj2)) {
                        k42.m3790o(obj, j, k42.f5664c.m3555j(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m915r(i, obj2)) {
                        k42.m3789n(obj, k42.f5664c.m3554i(j, obj2), j);
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m915r(i, obj2)) {
                        k42.m3790o(obj, j, k42.f5664c.m3555j(j, obj2));
                        m893N(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m919w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                case 29:
                case 30:
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                case 32:
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case BuildConfig.VERSION_CODE /* 39 */:
                case 40:
                case 41:
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                case 48:
                case 49:
                    this.f1171k.mo2388b(obj, j, obj2);
                    obj3 = obj;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Class cls = tp1.f10919a;
                    j42 j42Var4 = k42.f5664c;
                    Object objM3556k = j42Var4.m3556k(j, obj);
                    Object objM3556k2 = j42Var4.m3556k(j, obj2);
                    this.f1173m.getClass();
                    k42.m3791p(obj, j, jy0.m3726a(objM3556k, objM3556k2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                case 56:
                case 57:
                case 58:
                case LinuxInputConstants.KEY_F1 /* 59 */:
                    if (m917u(i2, i, obj2)) {
                        k42.m3791p(obj, j, k42.f5664c.m3556k(j, obj2));
                        m894O(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m920x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (m917u(i2, i, obj2)) {
                        k42.m3791p(obj, j, k42.f5664c.m3556k(j, obj2));
                        m894O(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m920x(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    @Override // p000.qp1
    /* JADX INFO: renamed from: b */
    public final void mo901b(Object obj) {
        if (m885t(obj)) {
            if (obj instanceof fi0) {
                fi0 fi0Var = (fi0) obj;
                fi0Var.clearMemoizedSerializedSize();
                fi0Var.clearMemoizedHashCode();
                fi0Var.markImmutable();
            }
            int[] iArr = this.f1161a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM898T = m898T(i);
                long j = 1048575 & iM898T;
                int iM882S = m882S(iM898T);
                if (iM882S != 9) {
                    if (iM882S != 60 && iM882S != 68) {
                        switch (iM882S) {
                            case 17:
                                if (m915r(i, obj)) {
                                    m914q(i).mo901b(f1160o.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                            case 29:
                            case 30:
                            case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                            case 32:
                            case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                            case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                            case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                            case 36:
                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                            case 38:
                            case BuildConfig.VERSION_CODE /* 39 */:
                            case 40:
                            case 41:
                            case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                            case 43:
                            case 44:
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            case 46:
                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                            case 48:
                            case 49:
                                this.f1171k.mo2387a(j, obj);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                Unsafe unsafe = f1160o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f1173m.getClass();
                                    ((iy0) object).f5199a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m917u(iArr[i], i, obj)) {
                        m914q(i).mo901b(f1160o.getObject(obj, j));
                    }
                } else if (m915r(i, obj)) {
                    m914q(i).mo901b(f1160o.getObject(obj, j));
                }
            }
            this.f1172l.getClass();
            a42 a42Var = ((fi0) obj).unknownFields;
            if (a42Var.f49e) {
                a42Var.f49e = false;
            }
        }
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: c */
    public final boolean mo902c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f1168h) {
            int i6 = this.f1167g[i5];
            int[] iArr = this.f1161a;
            int i7 = iArr[i6];
            int iM898T = m898T(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f1160o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM898T) == 0 || m916s(obj, i6, i, i2, i10)) {
                int iM882S = m882S(iM898T);
                if (iM882S == 9 || iM882S == 17) {
                    if (m916s(obj, i6, i, i2, i10)) {
                        if (!m914q(i6).mo902c(k42.f5664c.m3556k(iM898T & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM882S != 27) {
                        if (iM882S == 60 || iM882S == 68) {
                            if (m917u(i7, i6, obj)) {
                                if (!m914q(i6).mo902c(k42.f5664c.m3556k(iM898T & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM882S != 49) {
                            if (iM882S != 50) {
                                continue;
                            } else {
                                Object objM3556k = k42.f5664c.m3556k(iM898T & 1048575, obj);
                                this.f1173m.getClass();
                                iy0 iy0Var = (iy0) objM3556k;
                                if (!iy0Var.isEmpty() && ((hb2) ((hy0) m913p(i6)).f4745a.f7700c).f4517a == ib2.MESSAGE) {
                                    qp1 qp1VarM4549a = null;
                                    for (Object obj2 : iy0Var.values()) {
                                        if (qp1VarM4549a == null) {
                                            qp1VarM4549a = nh1.f7407c.m4549a(obj2.getClass());
                                        }
                                        if (!qp1VarM4549a.mo902c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) k42.f5664c.m3556k(iM898T & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qp1 qp1VarM914q = m914q(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (qp1VarM914q.mo902c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: d */
    public final void mo903d(Object obj, ay0 ay0Var) {
        ay0Var.getClass();
        m899U(obj, ay0Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.qp1
    /* JADX INFO: renamed from: e */
    public final boolean mo904e(fi0 fi0Var, fi0 fi0Var2) {
        int[] iArr = this.f1161a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM6318k = true;
            if (i < length) {
                int iM898T = m898T(i);
                long j = iM898T & 1048575;
                switch (m882S(iM898T)) {
                    case 0:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var = k42.f5664c;
                            if (Double.doubleToLongBits(j42Var.mo3101g(j, fi0Var)) != Double.doubleToLongBits(j42Var.mo3101g(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var2 = k42.f5664c;
                            if (Float.floatToIntBits(j42Var2.mo3102h(j, fi0Var)) != Float.floatToIntBits(j42Var2.mo3102h(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var3 = k42.f5664c;
                            if (j42Var3.m3555j(j, fi0Var) != j42Var3.m3555j(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var4 = k42.f5664c;
                            if (j42Var4.m3555j(j, fi0Var) != j42Var4.m3555j(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var5 = k42.f5664c;
                            if (j42Var5.m3554i(j, fi0Var) != j42Var5.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var6 = k42.f5664c;
                            if (j42Var6.m3555j(j, fi0Var) != j42Var6.m3555j(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var7 = k42.f5664c;
                            if (j42Var7.m3554i(j, fi0Var) != j42Var7.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var8 = k42.f5664c;
                            if (j42Var8.mo3098d(j, fi0Var) != j42Var8.mo3098d(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var9 = k42.f5664c;
                            if (!tp1.m6318k(j42Var9.m3556k(j, fi0Var), j42Var9.m3556k(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var10 = k42.f5664c;
                            if (!tp1.m6318k(j42Var10.m3556k(j, fi0Var), j42Var10.m3556k(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var11 = k42.f5664c;
                            if (!tp1.m6318k(j42Var11.m3556k(j, fi0Var), j42Var11.m3556k(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 11:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var12 = k42.f5664c;
                            if (j42Var12.m3554i(j, fi0Var) != j42Var12.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 12:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var13 = k42.f5664c;
                            if (j42Var13.m3554i(j, fi0Var) != j42Var13.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 13:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var14 = k42.f5664c;
                            if (j42Var14.m3554i(j, fi0Var) != j42Var14.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var15 = k42.f5664c;
                            if (j42Var15.m3555j(j, fi0Var) != j42Var15.m3555j(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var16 = k42.f5664c;
                            if (j42Var16.m3554i(j, fi0Var) != j42Var16.m3554i(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var17 = k42.f5664c;
                            if (j42Var17.m3555j(j, fi0Var) != j42Var17.m3555j(j, fi0Var2)) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m910k(fi0Var, fi0Var2, i)) {
                            zM6318k = false;
                        } else {
                            j42 j42Var18 = k42.f5664c;
                            if (!tp1.m6318k(j42Var18.m3556k(j, fi0Var), j42Var18.m3556k(j, fi0Var2))) {
                                zM6318k = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    case 29:
                    case 30:
                    case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                    case 32:
                    case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    case 36:
                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    case 38:
                    case BuildConfig.VERSION_CODE /* 39 */:
                    case 40:
                    case 41:
                    case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                    case 43:
                    case 44:
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    case 46:
                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                    case 48:
                    case 49:
                        j42 j42Var19 = k42.f5664c;
                        zM6318k = tp1.m6318k(j42Var19.m3556k(j, fi0Var), j42Var19.m3556k(j, fi0Var2));
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        j42 j42Var20 = k42.f5664c;
                        zM6318k = tp1.m6318k(j42Var20.m3556k(j, fi0Var), j42Var20.m3556k(j, fi0Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case LinuxInputConstants.KEY_F1 /* 59 */:
                    case 60:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 62:
                    case 63:
                    case 64:
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        j42 j42Var21 = k42.f5664c;
                        if (j42Var21.m3554i(j2, fi0Var) != j42Var21.m3554i(j2, fi0Var2) || !tp1.m6318k(j42Var21.m3556k(j, fi0Var), j42Var21.m3556k(j, fi0Var2))) {
                            zM6318k = false;
                        }
                        break;
                }
                if (zM6318k) {
                    i += 3;
                }
            } else {
                this.f1172l.getClass();
                if (fi0Var.unknownFields.equals(fi0Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x064b A[Catch: all -> 0x03cf, TryCatch #11 {all -> 0x03cf, blocks: (B:150:0x0646, B:152:0x064b, B:153:0x0650, B:109:0x03bb, B:110:0x03c4, B:114:0x03d5, B:115:0x03e4, B:116:0x03f3, B:117:0x0402, B:118:0x0411, B:119:0x0421, B:120:0x0431, B:121:0x0441, B:122:0x0451, B:123:0x046a, B:124:0x0485, B:125:0x04a0, B:126:0x04bc, B:127:0x04d9, B:128:0x04f8, B:129:0x0514, B:130:0x0529, B:131:0x0543, B:132:0x0550, B:133:0x056e, B:134:0x058b, B:135:0x05a8, B:136:0x05c4, B:137:0x05e0, B:138:0x05fc, B:139:0x061b, B:140:0x0630, B:144:0x063b), top: B:185:0x0646 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0658 A[LOOP:2: B:155:0x0656->B:156:0x0658, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0670 A[LOOP:3: B:163:0x066e->B:164:0x0670, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x067a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    @Override // p000.qp1
    /* JADX INFO: renamed from: f */
    public final void mo905f(Object obj, C0799jp c0799jp, u80 u80Var) throws Throwable {
        C0799jp c0799jp2;
        C0799jp c0799jp3;
        b51 b51Var = this;
        Object obj2 = obj;
        C0799jp c0799jp4 = c0799jp;
        u80 u80Var2 = u80Var;
        u80Var2.getClass();
        m883l(obj2);
        b42 b42Var = b51Var.f1172l;
        int[] iArr = b51Var.f1167g;
        int i = b51Var.f1169i;
        int i2 = b51Var.f1168h;
        a42 a42VarM849a = null;
        while (true) {
            try {
                int iM3681a = c0799jp4.m3681a();
                int iM895P = (iM3681a < b51Var.f1163c || iM3681a > b51Var.f1164d) ? -1 : b51Var.m895P(iM3681a, 0);
                if (iM895P >= 0) {
                    int iM898T = b51Var.m898T(iM895P);
                    try {
                        int iM882S = m882S(iM898T);
                        ft0 ft0Var = b51Var.f1171k;
                        switch (iM882S) {
                            case 0:
                                int i3 = iM895P;
                                C0799jp c0799jp5 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C = m878C(iM898T);
                                c0799jp5.m3704x(1);
                                try {
                                    Object obj3 = obj2;
                                    c0799jp2 = c0799jp;
                                    try {
                                        k42.f5664c.mo3105o(obj3, jM878C, ((AbstractC0762ip) c0799jp5.f5485d).mo2622l());
                                        obj2 = obj3;
                                        try {
                                            b51Var.m893N(i3, obj2);
                                            break;
                                        } catch (qp0 unused) {
                                            try {
                                                b42Var.getClass();
                                                if (a42VarM849a == null) {
                                                    a42VarM849a = b42.m849a(obj2);
                                                }
                                                if (!b42.m850b(a42VarM849a, c0799jp2)) {
                                                    while (i2 < i) {
                                                        b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                                        i2++;
                                                    }
                                                    if (a42VarM849a == null) {
                                                        return;
                                                    }
                                                    ((fi0) obj2).unknownFields = a42VarM849a;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                while (i2 < i) {
                                                    b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                                    i2++;
                                                }
                                                if (a42VarM849a != null) {
                                                    b42Var.getClass();
                                                    ((fi0) obj2).unknownFields = a42VarM849a;
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (qp0 unused2) {
                                        obj2 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj3;
                                        while (i2 < i) {
                                            b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                            i2++;
                                        }
                                        if (a42VarM849a != null) {
                                            b42Var.getClass();
                                            ((fi0) obj2).unknownFields = a42VarM849a;
                                        }
                                        throw th;
                                    }
                                } catch (qp0 unused3) {
                                    c0799jp2 = c0799jp;
                                }
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 1:
                                int i4 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C2 = m878C(iM898T);
                                c0799jp3.m3704x(5);
                                k42.f5664c.mo3106p(obj2, jM878C2, ((AbstractC0762ip) c0799jp3.f5485d).mo2626p());
                                b51Var.m893N(i4, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 2:
                                int i5 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C3 = m878C(iM898T);
                                c0799jp3.m3704x(0);
                                k42.m3790o(obj2, jM878C3, ((AbstractC0762ip) c0799jp3.f5485d).mo2628r());
                                b51Var.m893N(i5, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 3:
                                int i6 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C4 = m878C(iM898T);
                                c0799jp3.m3704x(0);
                                k42.m3790o(obj2, jM878C4, ((AbstractC0762ip) c0799jp3.f5485d).mo2606B());
                                b51Var.m893N(i6, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 4:
                                int i7 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C5 = m878C(iM898T);
                                c0799jp3.m3704x(0);
                                k42.m3789n(obj2, ((AbstractC0762ip) c0799jp3.f5485d).mo2627q(), jM878C5);
                                b51Var.m893N(i7, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 5:
                                int i8 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C6 = m878C(iM898T);
                                c0799jp3.m3704x(1);
                                k42.m3790o(obj2, jM878C6, ((AbstractC0762ip) c0799jp3.f5485d).mo2625o());
                                b51Var.m893N(i8, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 6:
                                int i9 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C7 = m878C(iM898T);
                                c0799jp3.m3704x(5);
                                k42.m3789n(obj2, ((AbstractC0762ip) c0799jp3.f5485d).mo2624n(), jM878C7);
                                b51Var.m893N(i9, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 7:
                                int i10 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C8 = m878C(iM898T);
                                c0799jp3.m3704x(0);
                                k42.f5664c.mo3103m(obj2, jM878C8, ((AbstractC0762ip) c0799jp3.f5485d).mo2620j());
                                b51Var.m893N(i10, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 8:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                b51Var.m892L(obj2, iM898T, c0799jp3);
                                b51Var.m893N(iM895P, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 9:
                                b51Var = b51Var;
                                int i11 = iM895P;
                                c0799jp3 = c0799jp4;
                                y41 y41Var = (y41) b51Var.m921y(i11, obj2);
                                qp1 qp1VarM914q = b51Var.m914q(i11);
                                c0799jp3.m3704x(2);
                                c0799jp3.m3683c(y41Var, qp1VarM914q, u80Var2);
                                b51Var.m896Q(i11, obj2, y41Var);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 10:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                k42.m3791p(obj2, m878C(iM898T), c0799jp3.m3685e());
                                b51Var.m893N(iM895P, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 11:
                                int i12 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C9 = m878C(iM898T);
                                c0799jp3.m3704x(0);
                                k42.m3789n(obj2, ((AbstractC0762ip) c0799jp3.f5485d).mo2605A(), jM878C9);
                                b51Var.m893N(i12, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 12:
                                int i13 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3704x(0);
                                int iMo2623m = ((AbstractC0762ip) c0799jp3.f5485d).mo2623m();
                                b51Var.m912o(i13);
                                k42.m3789n(obj2, iMo2623m, m878C(iM898T));
                                b51Var.m893N(i13, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 13:
                                int i14 = iM895P;
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                long jM878C10 = m878C(iM898T);
                                c0799jp3.m3704x(5);
                                k42.m3789n(obj2, ((AbstractC0762ip) c0799jp3.f5485d).mo2629t(), jM878C10);
                                b51Var.m893N(i14, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 14:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3704x(1);
                                k42.m3790o(obj2, iM898T & 1048575, ((AbstractC0762ip) c0799jp3.f5485d).mo2630u());
                                b51Var.m893N(iM895P, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 15:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3704x(0);
                                k42.m3789n(obj2, ((AbstractC0762ip) c0799jp3.f5485d).mo2631v(), iM898T & 1048575);
                                b51Var.m893N(iM895P, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 16:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3704x(0);
                                k42.m3790o(obj2, iM898T & 1048575, ((AbstractC0762ip) c0799jp3.f5485d).mo2632w());
                                b51Var.m893N(iM895P, obj2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 17:
                                b51Var = b51Var;
                                int i15 = iM895P;
                                c0799jp3 = c0799jp4;
                                y41 y41Var2 = (y41) b51Var.m921y(i15, obj2);
                                qp1 qp1VarM914q2 = b51Var.m914q(i15);
                                c0799jp3.m3704x(3);
                                c0799jp3.m3682b(y41Var2, qp1VarM914q2, u80Var2);
                                b51Var.m896Q(i15, obj2, y41Var2);
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 18:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3687g(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 19:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3692l(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 20:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3694n(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 21:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3701u(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 22:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3693m(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 23:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3691k(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 24:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3690j(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 25:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                c0799jp3.m3684d(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                c0799jp3 = c0799jp4;
                                b51Var = b51Var;
                                if ((536870912 & iM898T) != 0) {
                                    try {
                                        c0799jp3.m3699s(ft0Var.mo2389c(iM898T & 1048575, obj2), true);
                                    } catch (qp0 unused4) {
                                        c0799jp2 = c0799jp3;
                                        b42Var.getClass();
                                        if (a42VarM849a == null) {
                                            a42VarM849a = b42.m849a(obj2);
                                        }
                                        if (!b42.m850b(a42VarM849a, c0799jp2)) {
                                            while (i2 < i) {
                                                b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                                i2++;
                                            }
                                            if (a42VarM849a == null) {
                                                return;
                                            }
                                            ((fi0) obj2).unknownFields = a42VarM849a;
                                        }
                                    }
                                } else {
                                    c0799jp3.m3699s(ft0Var.mo2389c(iM898T & 1048575, obj2), false);
                                }
                                c0799jp2 = c0799jp3;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                try {
                                    try {
                                        b51Var.m891K(obj2, iM898T, c0799jp4, b51Var.m914q(iM895P), u80Var);
                                        b51Var = b51Var;
                                        c0799jp3 = c0799jp4;
                                        c0799jp2 = c0799jp3;
                                    } catch (qp0 unused5) {
                                        c0799jp2 = c0799jp4;
                                        b42Var.getClass();
                                        if (a42VarM849a == null) {
                                            a42VarM849a = b42.m849a(obj2);
                                        }
                                        if (!b42.m850b(a42VarM849a, c0799jp2)) {
                                            while (i2 < i) {
                                                b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                                i2++;
                                            }
                                            if (a42VarM849a == null) {
                                                return;
                                            }
                                            ((fi0) obj2).unknownFields = a42VarM849a;
                                        }
                                    }
                                } catch (qp0 unused6) {
                                }
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                c0799jp4.m3686f(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 29:
                                c0799jp4.m3700t(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 30:
                                c0799jp4.m3688h(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var.m912o(iM895P);
                                Class cls = tp1.f10919a;
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                c0799jp4.m3695o(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 32:
                                c0799jp4.m3696p(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                c0799jp4.m3697q(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                c0799jp4.m3698r(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                                c0799jp4.m3687g(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 36:
                                c0799jp4.m3692l(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                c0799jp4.m3694n(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 38:
                                c0799jp4.m3701u(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case BuildConfig.VERSION_CODE /* 39 */:
                                c0799jp4.m3693m(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 40:
                                c0799jp4.m3691k(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 41:
                                c0799jp4.m3690j(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                c0799jp4.m3684d(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 43:
                                c0799jp4.m3700t(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 44:
                                c0799jp4.m3688h(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var.m912o(iM895P);
                                Class cls2 = tp1.f10919a;
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                c0799jp4.m3695o(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 46:
                                c0799jp4.m3696p(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                c0799jp4.m3697q(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 48:
                                c0799jp4.m3698r(ft0Var.mo2389c(iM898T & 1048575, obj2));
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 49:
                                obj2 = obj;
                                try {
                                    b51Var.m890J(obj2, iM898T & 1048575, c0799jp, b51Var.m914q(iM895P), u80Var);
                                    c0799jp4 = c0799jp;
                                    b51Var = b51Var;
                                    c0799jp2 = c0799jp4;
                                } catch (qp0 unused7) {
                                    b51Var = b51Var;
                                    c0799jp2 = c0799jp;
                                    b42Var.getClass();
                                    if (a42VarM849a == null) {
                                        a42VarM849a = b42.m849a(obj2);
                                    }
                                    if (!b42.m850b(a42VarM849a, c0799jp2)) {
                                        while (i2 < i) {
                                            b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                            i2++;
                                        }
                                        if (a42VarM849a == null) {
                                            return;
                                        }
                                        ((fi0) obj2).unknownFields = a42VarM849a;
                                    }
                                }
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                try {
                                    b51Var.m918v(obj2, iM895P, b51Var.m913p(iM895P), u80Var2, c0799jp);
                                    obj2 = obj;
                                    c0799jp2 = c0799jp;
                                    b51Var = b51Var;
                                } catch (qp0 unused8) {
                                    obj2 = obj;
                                    c0799jp2 = c0799jp;
                                    b51Var = b51Var;
                                    b42Var.getClass();
                                    if (a42VarM849a == null) {
                                        a42VarM849a = b42.m849a(obj2);
                                    }
                                    if (!b42.m850b(a42VarM849a, c0799jp2)) {
                                        while (i2 < i) {
                                            b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                            i2++;
                                        }
                                        if (a42VarM849a == null) {
                                            return;
                                        }
                                        ((fi0) obj2).unknownFields = a42VarM849a;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                    b51Var = b51Var;
                                    while (i2 < i) {
                                        b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                        i2++;
                                    }
                                    if (a42VarM849a != null) {
                                        b42Var.getClass();
                                        ((fi0) obj2).unknownFields = a42VarM849a;
                                    }
                                    throw th;
                                }
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 51:
                                c0799jp4.m3704x(1);
                                k42.m3791p(obj2, iM898T & 1048575, Double.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2622l()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 52:
                                c0799jp4.m3704x(5);
                                k42.m3791p(obj2, iM898T & 1048575, Float.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2626p()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 53:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Long.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2628r()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Long.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2606B()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2627q()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 56:
                                c0799jp4.m3704x(1);
                                k42.m3791p(obj2, iM898T & 1048575, Long.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2625o()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 57:
                                c0799jp4.m3704x(5);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2624n()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 58:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Boolean.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2620j()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case LinuxInputConstants.KEY_F1 /* 59 */:
                                b51Var.m892L(obj2, iM898T, c0799jp4);
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 60:
                                y41 y41Var3 = (y41) b51Var.m922z(iM3681a, iM895P, obj2);
                                qp1 qp1VarM914q3 = b51Var.m914q(iM895P);
                                c0799jp4.m3704x(2);
                                c0799jp4.m3683c(y41Var3, qp1VarM914q3, u80Var2);
                                b51Var.m897R(obj2, iM3681a, iM895P, y41Var3);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                k42.m3791p(obj2, iM898T & 1048575, c0799jp4.m3685e());
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 62:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2605A()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 63:
                                c0799jp4.m3704x(0);
                                int iMo2623m2 = ((AbstractC0762ip) c0799jp4.f5485d).mo2623m();
                                b51Var.m912o(iM895P);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(iMo2623m2));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 64:
                                c0799jp4.m3704x(5);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2629t()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                c0799jp4.m3704x(1);
                                k42.m3791p(obj2, iM898T & 1048575, Long.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2630u()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 66:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Integer.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2631v()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 67:
                                c0799jp4.m3704x(0);
                                k42.m3791p(obj2, iM898T & 1048575, Long.valueOf(((AbstractC0762ip) c0799jp4.f5485d).mo2632w()));
                                b51Var.m894O(iM3681a, iM895P, obj2);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            case 68:
                                y41 y41Var4 = (y41) b51Var.m922z(iM3681a, iM895P, obj2);
                                qp1 qp1VarM914q4 = b51Var.m914q(iM895P);
                                c0799jp4.m3704x(3);
                                c0799jp4.m3682b(y41Var4, qp1VarM914q4, u80Var2);
                                b51Var.m897R(obj2, iM3681a, iM895P, y41Var4);
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                            default:
                                if (a42VarM849a == null) {
                                    b42Var.getClass();
                                    a42VarM849a = b42.m849a(obj2);
                                }
                                b42Var.getClass();
                                if (!b42.m850b(a42VarM849a, c0799jp4)) {
                                    while (i2 < i) {
                                        b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                                        i2++;
                                    }
                                    if (a42VarM849a == null) {
                                        return;
                                    }
                                }
                                b51Var = b51Var;
                                c0799jp2 = c0799jp4;
                                u80Var2 = u80Var;
                                c0799jp4 = c0799jp2;
                                b51Var = b51Var;
                                break;
                        }
                    } catch (qp0 unused9) {
                    }
                } else if (iM3681a == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                        i2++;
                    }
                    if (a42VarM849a == null) {
                        return;
                    } else {
                        b42Var.getClass();
                    }
                } else {
                    b42Var.getClass();
                    if (a42VarM849a == null) {
                        a42VarM849a = b42.m849a(obj2);
                    }
                    if (!b42.m850b(a42VarM849a, c0799jp4)) {
                        while (i2 < i) {
                            b51Var.m911n(iArr[i2], obj2, a42VarM849a);
                            i2++;
                        }
                        if (a42VarM849a == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        ((fi0) obj2).unknownFields = a42VarM849a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.qp1
    /* JADX INFO: renamed from: g */
    public final int mo906g(fi0 fi0Var) {
        int i;
        int iM4573b;
        int i2;
        int[] iArr = this.f1161a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM898T = m898T(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM898T;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m882S(iM898T)) {
                case 0:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(Double.doubleToLongBits(k42.f5664c.mo3101g(j, fi0Var)));
                    i3 = iM4573b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM4573b = Float.floatToIntBits(k42.f5664c.mo3102h(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(k42.f5664c.m3555j(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(k42.f5664c.m3555j(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(k42.f5664c.m3555j(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo3098d = k42.f5664c.mo3098d(j, fi0Var);
                    Charset charset = no0.f7481a;
                    if (zMo3098d) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM4573b = ((String) k42.f5664c.m3556k(j, fi0Var)).hashCode();
                    i3 = iM4573b + i;
                    break;
                case 9:
                    Object objM3556k = k42.f5664c.m3556k(j, fi0Var);
                    if (objM3556k != null) {
                        iHashCode = objM3556k.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                    i3 = iM4573b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(k42.f5664c.m3555j(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3554i(j, fi0Var);
                    i3 = iM4573b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM4573b = no0.m4573b(k42.f5664c.m3555j(j, fi0Var));
                    i3 = iM4573b + i;
                    break;
                case 17:
                    Object objM3556k2 = k42.f5664c.m3556k(j, fi0Var);
                    if (objM3556k2 != null) {
                        iHashCode = objM3556k2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                case 29:
                case 30:
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                case 32:
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                case 36:
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                case 38:
                case BuildConfig.VERSION_CODE /* 39 */:
                case 40:
                case 41:
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                case 43:
                case 44:
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                case 46:
                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                    i3 = iM4573b + i;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    i = i3 * 53;
                    iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                    i3 = iM4573b + i;
                    break;
                case 51:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(Double.doubleToLongBits(((Double) k42.f5664c.m3556k(j, fi0Var)).doubleValue()));
                        i3 = iM4573b + i;
                    }
                    break;
                case 52:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = Float.floatToIntBits(((Float) k42.f5664c.m3556k(j, fi0Var)).floatValue());
                        i3 = iM4573b + i;
                    }
                    break;
                case 53:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(m880E(j, fi0Var));
                        i3 = iM4573b + i;
                    }
                    break;
                case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(m880E(j, fi0Var));
                        i3 = iM4573b + i;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case 56:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(m880E(j, fi0Var));
                        i3 = iM4573b + i;
                    }
                    break;
                case 57:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case 58:
                    if (m917u(i5, i4, fi0Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) k42.f5664c.m3556k(j, fi0Var)).booleanValue();
                        Charset charset2 = no0.f7481a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case LinuxInputConstants.KEY_F1 /* 59 */:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = ((String) k42.f5664c.m3556k(j, fi0Var)).hashCode();
                        i3 = iM4573b + i;
                    }
                    break;
                case 60:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                        i3 = iM4573b + i;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                        i3 = iM4573b + i;
                    }
                    break;
                case 62:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case 63:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case 64:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(m880E(j, fi0Var));
                        i3 = iM4573b + i;
                    }
                    break;
                case 66:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = m879D(j, fi0Var);
                        i3 = iM4573b + i;
                    }
                    break;
                case 67:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = no0.m4573b(m880E(j, fi0Var));
                        i3 = iM4573b + i;
                    }
                    break;
                case 68:
                    if (m917u(i5, i4, fi0Var)) {
                        i = i3 * 53;
                        iM4573b = k42.f5664c.m3556k(j, fi0Var).hashCode();
                        i3 = iM4573b + i;
                    }
                    break;
            }
        }
        this.f1172l.getClass();
        return fi0Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x039c A[PHI: r17
  0x039c: PHI (r17v19 int) = 
  (r17v2 int)
  (r17v3 int)
  (r17v4 int)
  (r17v8 int)
  (r17v10 int)
  (r17v11 int)
  (r17v12 int)
  (r17v16 int)
  (r17v20 int)
 binds: [B:213:0x055e, B:209:0x0542, B:205:0x0526, B:179:0x048a, B:165:0x0423, B:161:0x0409, B:157:0x03ef, B:150:0x03b9, B:144:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.qp1
    /* JADX INFO: renamed from: h */
    public final int mo907h(fi0 fi0Var) {
        int i;
        int iM4584c;
        int iM4584c2;
        int iM4584c3;
        int iM4586e;
        int iM4584c4;
        int iM4582a;
        int iM4584c5;
        int iM4584c6;
        int iM4583b;
        int serializedSize;
        int iM6310c;
        int iM4584c7;
        int size;
        int iM6316i;
        int iM4584c8;
        int iM4584c9;
        int size2;
        int iM4584c10;
        int serializedSize2;
        int iM5335b;
        int iM4584c11;
        int iM4584c12;
        int iM4586e2;
        int iM4584c13;
        int iM4582a2;
        int iM4583b2;
        b51 b51Var = this;
        fi0 fi0Var2 = fi0Var;
        Unsafe unsafe = f1160o;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iM5335b2 = 0;
        while (true) {
            int[] iArr = b51Var.f1161a;
            if (i4 >= iArr.length) {
                b51Var.f1172l.getClass();
                return fi0Var2.unknownFields.m78c() + iM5335b2;
            }
            int iM898T = b51Var.m898T(i4);
            int iM882S = m882S(iM898T);
            int i6 = iArr[i4];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & i2;
            if (iM882S <= 17) {
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(fi0Var2, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM898T & i2;
            if (iM882S >= u90.f11182b.f11186a) {
                int i9 = u90.f11183c.f11186a;
            }
            switch (iM882S) {
                case 0:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c + 8;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 1:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c2 = AbstractC1153np.m4584c(i6);
                        iM4584c6 = iM4584c2 + 4;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 2:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(fi0Var2, j);
                        iM4584c3 = AbstractC1153np.m4584c(i6);
                        iM4586e = AbstractC1153np.m4586e(j2);
                        iM5335b2 += iM4586e + iM4584c3;
                    }
                    b51Var = this;
                    break;
                case 3:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(fi0Var2, j);
                        iM4584c3 = AbstractC1153np.m4584c(i6);
                        iM4586e = AbstractC1153np.m4586e(j3);
                        iM5335b2 += iM4586e + iM4584c3;
                    }
                    b51Var = this;
                    break;
                case 4:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(fi0Var2, j);
                        iM4584c4 = AbstractC1153np.m4584c(i6);
                        iM4582a = AbstractC1153np.m4582a(i10);
                        iM5335b2 += iM4582a + iM4584c4;
                    }
                    b51Var = this;
                    break;
                case 5:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c5 = AbstractC1153np.m4584c(i6);
                        iM4584c6 = iM4584c5 + 8;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 6:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c2 = AbstractC1153np.m4584c(i6);
                        iM4584c6 = iM4584c2 + 4;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 7:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c6 = AbstractC1153np.m4584c(i6) + 1;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 8:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(fi0Var2, j);
                        if (object instanceof AbstractC0753ik) {
                            int iM4584c14 = AbstractC1153np.m4584c(i6);
                            int size3 = ((AbstractC0753ik) object).size();
                            iM4583b = AbstractC1308pu.m5335b(size3, size3, iM4584c14, iM5335b2);
                        } else {
                            iM4583b = AbstractC1153np.m4583b((String) object) + AbstractC1153np.m4584c(i6) + iM5335b2;
                        }
                        iM5335b2 = iM4583b;
                    }
                    b51Var = this;
                    break;
                case 9:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(fi0Var2, j);
                        qp1 qp1VarM914q = b51Var.m914q(i4);
                        Class cls = tp1.f10919a;
                        int iM4584c15 = AbstractC1153np.m4584c(i6);
                        int serializedSize3 = ((AbstractC0812k1) ((y41) object2)).getSerializedSize(qp1VarM914q);
                        iM5335b2 = AbstractC1308pu.m5335b(serializedSize3, serializedSize3, iM4584c15, iM5335b2);
                    }
                    break;
                case 10:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        AbstractC0753ik abstractC0753ik = (AbstractC0753ik) unsafe.getObject(fi0Var2, j);
                        int iM4584c16 = AbstractC1153np.m4584c(i6);
                        int size4 = abstractC0753ik.size();
                        iM5335b2 = AbstractC1308pu.m5335b(size4, size4, iM4584c16, iM5335b2);
                    }
                    b51Var = this;
                    break;
                case 11:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(fi0Var2, j);
                        iM4584c4 = AbstractC1153np.m4584c(i6);
                        iM4582a = AbstractC1153np.m4585d(i11);
                        iM5335b2 += iM4582a + iM4584c4;
                    }
                    b51Var = this;
                    break;
                case 12:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        int i12 = unsafe.getInt(fi0Var2, j);
                        iM4584c4 = AbstractC1153np.m4584c(i6);
                        iM4582a = AbstractC1153np.m4582a(i12);
                        iM5335b2 += iM4582a + iM4584c4;
                    }
                    b51Var = this;
                    break;
                case 13:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c2 = AbstractC1153np.m4584c(i6);
                        iM4584c6 = iM4584c2 + 4;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 14:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        iM4584c5 = AbstractC1153np.m4584c(i6);
                        iM4584c6 = iM4584c5 + 8;
                        iM5335b2 += iM4584c6;
                    }
                    b51Var = this;
                    fi0Var2 = fi0Var;
                    break;
                case 15:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        int i13 = unsafe.getInt(fi0Var2, j);
                        iM4584c4 = AbstractC1153np.m4584c(i6);
                        iM4582a = AbstractC1153np.m4585d((i13 >> 31) ^ (i13 << 1));
                        iM5335b2 += iM4582a + iM4584c4;
                    }
                    b51Var = this;
                    break;
                case 16:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        long j4 = unsafe.getLong(fi0Var2, j);
                        iM4584c3 = AbstractC1153np.m4584c(i6);
                        iM4586e = AbstractC1153np.m4586e((j4 >> 63) ^ (j4 << 1));
                        iM5335b2 += iM4586e + iM4584c3;
                    }
                    b51Var = this;
                    break;
                case 17:
                    if (b51Var.m916s(fi0Var2, i4, i3, i5, i)) {
                        serializedSize = ((AbstractC0812k1) ((y41) unsafe.getObject(fi0Var2, j))).getSerializedSize(b51Var.m914q(i4)) + (AbstractC1153np.m4584c(i6) * 2);
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 18:
                    iM6310c = tp1.m6310c(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case 19:
                    iM6310c = tp1.m6309b(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case 20:
                    i3 = i3;
                    List list = (List) unsafe.getObject(fi0Var2, j);
                    Class cls2 = tp1.f10919a;
                    if (list.size() == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM4584c7 = (AbstractC1153np.m4584c(i6) * list.size()) + tp1.m6312e(list);
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case 21:
                    i3 = i3;
                    List list2 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls3 = tp1.f10919a;
                    size = list2.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6316i(list2);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case 22:
                    i3 = i3;
                    List list3 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls4 = tp1.f10919a;
                    size = list3.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6311d(list3);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case 23:
                    iM6310c = tp1.m6310c(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case 24:
                    iM6310c = tp1.m6309b(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case 25:
                    i3 = i3;
                    List list4 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls5 = tp1.f10919a;
                    int size5 = list4.size();
                    iM5335b2 += size5 == 0 ? 0 : (AbstractC1153np.m4584c(i6) + 1) * size5;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    i3 = i3;
                    List list5 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls6 = tp1.f10919a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM4584c7 = AbstractC1153np.m4584c(i6) * size6;
                        if (list5 instanceof yr0) {
                            yr0 yr0Var = (yr0) list5;
                            for (int i14 = 0; i14 < size6; i14++) {
                                Object objMo2502r = yr0Var.mo2502r(i14);
                                if (objMo2502r instanceof AbstractC0753ik) {
                                    int size7 = ((AbstractC0753ik) objMo2502r).size();
                                    iM4584c7 = AbstractC1153np.m4585d(size7) + size7 + iM4584c7;
                                } else {
                                    iM4584c7 = AbstractC1153np.m4583b((String) objMo2502r) + iM4584c7;
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < size6; i15++) {
                                Object obj = list5.get(i15);
                                if (obj instanceof AbstractC0753ik) {
                                    int size8 = ((AbstractC0753ik) obj).size();
                                    iM4584c7 = AbstractC1153np.m4585d(size8) + size8 + iM4584c7;
                                } else {
                                    iM4584c7 = AbstractC1153np.m4583b((String) obj) + iM4584c7;
                                }
                            }
                        }
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    i3 = i3;
                    List list6 = (List) unsafe.getObject(fi0Var2, j);
                    qp1 qp1VarM914q2 = b51Var.m914q(i4);
                    Class cls7 = tp1.f10919a;
                    int size9 = list6.size();
                    if (size9 == 0) {
                        iM4584c9 = 0;
                    } else {
                        iM4584c9 = AbstractC1153np.m4584c(i6) * size9;
                        for (int i16 = 0; i16 < size9; i16++) {
                            int serializedSize4 = ((AbstractC0812k1) ((y41) list6.get(i16))).getSerializedSize(qp1VarM914q2);
                            iM4584c9 += AbstractC1153np.m4585d(serializedSize4) + serializedSize4;
                        }
                    }
                    iM5335b2 += iM4584c9;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    i3 = i3;
                    List list7 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls8 = tp1.f10919a;
                    int size10 = list7.size();
                    if (size10 == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM4584c7 = AbstractC1153np.m4584c(i6) * size10;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int size11 = ((AbstractC0753ik) list7.get(i17)).size();
                            iM4584c7 += AbstractC1153np.m4585d(size11) + size11;
                        }
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case 29:
                    i3 = i3;
                    List list8 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls9 = tp1.f10919a;
                    size = list8.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6315h(list8);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case 30:
                    i3 = i3;
                    List list9 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls10 = tp1.f10919a;
                    size = list9.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6308a(list9);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                    iM6310c = tp1.m6309b(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case 32:
                    iM6310c = tp1.m6310c(i6, (List) unsafe.getObject(fi0Var2, j));
                    iM5335b2 += iM6310c;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    i3 = i3;
                    List list10 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls11 = tp1.f10919a;
                    size = list10.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6313f(list10);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    i3 = i3;
                    List list11 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls12 = tp1.f10919a;
                    size = list11.size();
                    if (size == 0) {
                        iM4584c7 = 0;
                    } else {
                        iM6316i = tp1.m6314g(list11);
                        iM4584c8 = AbstractC1153np.m4584c(i6);
                        iM4584c7 = (iM4584c8 * size) + iM6316i;
                    }
                    iM5335b2 += iM4584c7;
                    i3 = i3;
                    break;
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    i3 = i3;
                    List list12 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls13 = tp1.f10919a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 36:
                    i3 = i3;
                    List list13 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls14 = tp1.f10919a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    i3 = i3;
                    size2 = tp1.m6312e((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 38:
                    i3 = i3;
                    size2 = tp1.m6316i((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case BuildConfig.VERSION_CODE /* 39 */:
                    i3 = i3;
                    size2 = tp1.m6311d((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 40:
                    i3 = i3;
                    List list14 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls15 = tp1.f10919a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 41:
                    i3 = i3;
                    List list15 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls16 = tp1.f10919a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                    i3 = i3;
                    List list16 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls17 = tp1.f10919a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 43:
                    i3 = i3;
                    size2 = tp1.m6315h((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 44:
                    i3 = i3;
                    size2 = tp1.m6308a((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    i3 = i3;
                    List list17 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls18 = tp1.f10919a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 46:
                    i3 = i3;
                    List list18 = (List) unsafe.getObject(fi0Var2, j);
                    Class cls19 = tp1.f10919a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                    i3 = i3;
                    size2 = tp1.m6313f((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 48:
                    i3 = i3;
                    size2 = tp1.m6314g((List) unsafe.getObject(fi0Var2, j));
                    if (size2 > 0) {
                        iM4584c10 = AbstractC1153np.m4584c(i6);
                        iM5335b2 = AbstractC1308pu.m5335b(size2, iM4584c10, size2, iM5335b2);
                    }
                    i3 = i3;
                    break;
                case 49:
                    i3 = i3;
                    List list19 = (List) unsafe.getObject(fi0Var2, j);
                    qp1 qp1VarM914q3 = b51Var.m914q(i4);
                    Class cls20 = tp1.f10919a;
                    int size12 = list19.size();
                    if (size12 == 0) {
                        serializedSize2 = 0;
                    } else {
                        serializedSize2 = 0;
                        for (int i18 = 0; i18 < size12; i18++) {
                            serializedSize2 += ((AbstractC0812k1) ((y41) list19.get(i18))).getSerializedSize(qp1VarM914q3) + (AbstractC1153np.m4584c(i6) * 2);
                        }
                    }
                    iM5335b2 += serializedSize2;
                    i3 = i3;
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    Object object3 = unsafe.getObject(fi0Var2, j);
                    Object objM913p = b51Var.m913p(i4);
                    b51Var.f1173m.getClass();
                    iy0 iy0Var = (iy0) object3;
                    hy0 hy0Var = (hy0) objM913p;
                    if (iy0Var.isEmpty()) {
                        iM5335b = 0;
                    } else {
                        iM5335b = 0;
                        for (Map.Entry entry : iy0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            hy0Var.getClass();
                            int iM4584c17 = AbstractC1153np.m4584c(i6);
                            C1174o9 c1174o9 = hy0Var.f4745a;
                            int iM6254a = t90.m6254a((hb2) c1174o9.f7700c, 2, value) + t90.m6254a((hb2) c1174o9.f7699b, 1, key);
                            iM5335b = AbstractC1308pu.m5335b(iM6254a, iM6254a, iM4584c17, iM5335b);
                            i3 = i3;
                        }
                    }
                    i3 = i3;
                    iM5335b2 += iM5335b;
                    i3 = i3;
                    break;
                case 51:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c + 8;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 52:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c11 = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c11 + 4;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 53:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        long jM880E = m880E(j, fi0Var2);
                        iM4584c12 = AbstractC1153np.m4584c(i6);
                        iM4586e2 = AbstractC1153np.m4586e(jM880E);
                        iM5335b2 += iM4586e2 + iM4584c12;
                    }
                    break;
                case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        long jM880E2 = m880E(j, fi0Var2);
                        iM4584c12 = AbstractC1153np.m4584c(i6);
                        iM4586e2 = AbstractC1153np.m4586e(jM880E2);
                        iM5335b2 += iM4586e2 + iM4584c12;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        int iM879D = m879D(j, fi0Var2);
                        iM4584c13 = AbstractC1153np.m4584c(i6);
                        iM4582a2 = AbstractC1153np.m4582a(iM879D);
                        serializedSize = iM4582a2 + iM4584c13;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 56:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c + 8;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 57:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c11 = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c11 + 4;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 58:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        serializedSize = AbstractC1153np.m4584c(i6) + 1;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case LinuxInputConstants.KEY_F1 /* 59 */:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        Object object4 = unsafe.getObject(fi0Var2, j);
                        if (object4 instanceof AbstractC0753ik) {
                            int iM4584c18 = AbstractC1153np.m4584c(i6);
                            int size13 = ((AbstractC0753ik) object4).size();
                            iM4583b2 = AbstractC1308pu.m5335b(size13, size13, iM4584c18, iM5335b2);
                        } else {
                            iM4583b2 = AbstractC1153np.m4583b((String) object4) + AbstractC1153np.m4584c(i6) + iM5335b2;
                        }
                        iM5335b2 = iM4583b2;
                    }
                    break;
                case 60:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        Object object5 = unsafe.getObject(fi0Var2, j);
                        qp1 qp1VarM914q4 = b51Var.m914q(i4);
                        Class cls21 = tp1.f10919a;
                        int iM4584c19 = AbstractC1153np.m4584c(i6);
                        int serializedSize5 = ((AbstractC0812k1) ((y41) object5)).getSerializedSize(qp1VarM914q4);
                        iM5335b2 = AbstractC1308pu.m5335b(serializedSize5, serializedSize5, iM4584c19, iM5335b2);
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        AbstractC0753ik abstractC0753ik2 = (AbstractC0753ik) unsafe.getObject(fi0Var2, j);
                        int iM4584c20 = AbstractC1153np.m4584c(i6);
                        int size14 = abstractC0753ik2.size();
                        iM5335b2 = AbstractC1308pu.m5335b(size14, size14, iM4584c20, iM5335b2);
                    }
                    break;
                case 62:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        int iM879D2 = m879D(j, fi0Var2);
                        iM4584c13 = AbstractC1153np.m4584c(i6);
                        iM4582a2 = AbstractC1153np.m4585d(iM879D2);
                        serializedSize = iM4582a2 + iM4584c13;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 63:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        int iM879D3 = m879D(j, fi0Var2);
                        iM4584c13 = AbstractC1153np.m4584c(i6);
                        iM4582a2 = AbstractC1153np.m4582a(iM879D3);
                        serializedSize = iM4582a2 + iM4584c13;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 64:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c11 = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c11 + 4;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        iM4584c = AbstractC1153np.m4584c(i6);
                        serializedSize = iM4584c + 8;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 66:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        int iM879D4 = m879D(j, fi0Var2);
                        iM4584c13 = AbstractC1153np.m4584c(i6);
                        iM4582a2 = AbstractC1153np.m4585d((iM879D4 >> 31) ^ (iM879D4 << 1));
                        serializedSize = iM4582a2 + iM4584c13;
                        iM5335b2 += serializedSize;
                    }
                    break;
                case 67:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        long jM880E3 = m880E(j, fi0Var2);
                        iM4584c12 = AbstractC1153np.m4584c(i6);
                        iM4586e2 = AbstractC1153np.m4586e((jM880E3 << 1) ^ (jM880E3 >> 63));
                        iM5335b2 += iM4586e2 + iM4584c12;
                    }
                    break;
                case 68:
                    if (b51Var.m917u(i6, i4, fi0Var2)) {
                        serializedSize = ((AbstractC0812k1) ((y41) unsafe.getObject(fi0Var2, j))).getSerializedSize(b51Var.m914q(i4)) + (AbstractC1153np.m4584c(i6) * 2);
                        iM5335b2 += serializedSize;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: i */
    public final void mo908i(Object obj, byte[] bArr, int i, int i2, C1583x9 c1583x9) {
        m887G(obj, bArr, i, i2, 0, c1583x9);
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: j */
    public final Object mo909j() {
        this.f1170j.getClass();
        return ((fi0) this.f1165e).newMutableInstance();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m910k(fi0 fi0Var, fi0 fi0Var2, int i) {
        return m915r(i, fi0Var) == m915r(i, fi0Var2);
    }

    /* JADX INFO: renamed from: n */
    public final void m911n(int i, Object obj, Object obj2) {
        int i2 = this.f1161a[i];
        if (k42.f5664c.m3556k(m898T(i) & 1048575, obj) == null) {
            return;
        }
        m912o(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m912o(int i) {
        if (this.f1162b[((i / 3) * 2) + 1] == null) {
            return;
        }
        l41.m4035b();
    }

    /* JADX INFO: renamed from: p */
    public final Object m913p(int i) {
        return this.f1162b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: q */
    public final qp1 m914q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f1162b;
        qp1 qp1Var = (qp1) objArr[i2];
        if (qp1Var != null) {
            return qp1Var;
        }
        qp1 qp1VarM4549a = nh1.f7407c.m4549a((Class) objArr[i2 + 1]);
        objArr[i2] = qp1VarM4549a;
        return qp1VarM4549a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    /* JADX INFO: renamed from: r */
    public final boolean m915r(int i, Object obj) {
        int i2 = this.f1161a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & k42.f5664c.m3554i(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iM898T = m898T(i);
        long j2 = iM898T & 1048575;
        switch (m882S(iM898T)) {
            case 0:
                if (Double.doubleToRawLongBits(k42.f5664c.mo3101g(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(k42.f5664c.mo3102h(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (k42.f5664c.m3555j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (k42.f5664c.m3555j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (k42.f5664c.m3555j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return k42.f5664c.mo3098d(j2, obj);
            case 8:
                Object objM3556k = k42.f5664c.m3556k(j2, obj);
                if (objM3556k instanceof String) {
                    return !((String) objM3556k).isEmpty();
                }
                if (objM3556k instanceof AbstractC0753ik) {
                    return !AbstractC0753ik.f5042b.equals(objM3556k);
                }
                l41.m4049r();
                return false;
            case 9:
                if (k42.f5664c.m3556k(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !AbstractC0753ik.f5042b.equals(k42.f5664c.m3556k(j2, obj));
            case 11:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (k42.f5664c.m3555j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (k42.f5664c.m3554i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (k42.f5664c.m3555j(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (k42.f5664c.m3556k(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                l41.m4049r();
                return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m916s(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m915r(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m917u(int i, int i2, Object obj) {
        return k42.f5664c.m3554i((long) (this.f1161a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: v */
    public final void m918v(Object obj, int i, Object obj2, u80 u80Var, C0799jp c0799jp) throws qp0 {
        long jM898T = m898T(i) & 1048575;
        Object objM3556k = k42.f5664c.m3556k(jM898T, obj);
        jy0 jy0Var = this.f1173m;
        if (objM3556k == null) {
            jy0Var.getClass();
            objM3556k = iy0.f5198b.m3499c();
            k42.m3791p(obj, jM898T, objM3556k);
        } else {
            jy0Var.getClass();
            if (!((iy0) objM3556k).f5199a) {
                iy0 iy0VarM3499c = iy0.f5198b.m3499c();
                jy0.m3726a(iy0VarM3499c, objM3556k);
                k42.m3791p(obj, jM898T, iy0VarM3499c);
                objM3556k = iy0VarM3499c;
            }
        }
        jy0Var.getClass();
        iy0 iy0Var = (iy0) objM3556k;
        C1174o9 c1174o9 = ((hy0) obj2).f4745a;
        c0799jp.m3704x(2);
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) c0799jp.f5485d;
        int iMo2619i = abstractC0762ip.mo2619i(abstractC0762ip.mo2605A());
        Object obj3 = c1174o9.f7701d;
        Object objM3689i = "";
        Object objM3689i2 = obj3;
        while (true) {
            try {
                int iM3681a = c0799jp.m3681a();
                if (iM3681a == Integer.MAX_VALUE || abstractC0762ip.mo2617e()) {
                    break;
                }
                if (iM3681a == 1) {
                    objM3689i = c0799jp.m3689i((hb2) c1174o9.f7699b, null, null);
                } else if (iM3681a != 2) {
                    try {
                        if (!c0799jp.m3705y()) {
                            throw new rp0("Unable to parse map entry.");
                        }
                    } catch (qp0 unused) {
                        if (!c0799jp.m3705y()) {
                            throw new rp0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM3689i2 = c0799jp.m3689i((hb2) c1174o9.f7700c, obj3.getClass(), u80Var);
                }
            } catch (Throwable th) {
                abstractC0762ip.mo2618h(iMo2619i);
                throw th;
            }
        }
        iy0Var.put(objM3689i, objM3689i2);
        abstractC0762ip.mo2618h(iMo2619i);
    }

    /* JADX INFO: renamed from: w */
    public final void m919w(int i, Object obj, Object obj2) {
        if (m915r(i, obj2)) {
            long jM898T = m898T(i) & 1048575;
            Unsafe unsafe = f1160o;
            Object object = unsafe.getObject(obj2, jM898T);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1161a[i] + " is present but null: " + obj2);
            }
            qp1 qp1VarM914q = m914q(i);
            if (!m915r(i, obj)) {
                if (m885t(object)) {
                    Object objMo909j = qp1VarM914q.mo909j();
                    qp1VarM914q.mo900a(objMo909j, object);
                    unsafe.putObject(obj, jM898T, objMo909j);
                } else {
                    unsafe.putObject(obj, jM898T, object);
                }
                m893N(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM898T);
            if (!m885t(object2)) {
                Object objMo909j2 = qp1VarM914q.mo909j();
                qp1VarM914q.mo900a(objMo909j2, object2);
                unsafe.putObject(obj, jM898T, objMo909j2);
                object2 = objMo909j2;
            }
            qp1VarM914q.mo900a(object2, object);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m920x(int i, Object obj, Object obj2) {
        int[] iArr = this.f1161a;
        int i2 = iArr[i];
        if (m917u(i2, i, obj2)) {
            long jM898T = m898T(i) & 1048575;
            Unsafe unsafe = f1160o;
            Object object = unsafe.getObject(obj2, jM898T);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            qp1 qp1VarM914q = m914q(i);
            if (!m917u(i2, i, obj)) {
                if (m885t(object)) {
                    Object objMo909j = qp1VarM914q.mo909j();
                    qp1VarM914q.mo900a(objMo909j, object);
                    unsafe.putObject(obj, jM898T, objMo909j);
                } else {
                    unsafe.putObject(obj, jM898T, object);
                }
                m894O(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM898T);
            if (!m885t(object2)) {
                Object objMo909j2 = qp1VarM914q.mo909j();
                qp1VarM914q.mo900a(objMo909j2, object2);
                unsafe.putObject(obj, jM898T, objMo909j2);
                object2 = objMo909j2;
            }
            qp1VarM914q.mo900a(object2, object);
        }
    }

    /* JADX INFO: renamed from: y */
    public final Object m921y(int i, Object obj) {
        qp1 qp1VarM914q = m914q(i);
        long jM898T = m898T(i) & 1048575;
        if (!m915r(i, obj)) {
            return qp1VarM914q.mo909j();
        }
        Object object = f1160o.getObject(obj, jM898T);
        if (m885t(object)) {
            return object;
        }
        Object objMo909j = qp1VarM914q.mo909j();
        if (object != null) {
            qp1VarM914q.mo900a(objMo909j, object);
        }
        return objMo909j;
    }

    /* JADX INFO: renamed from: z */
    public final Object m922z(int i, int i2, Object obj) {
        qp1 qp1VarM914q = m914q(i2);
        if (!m917u(i, i2, obj)) {
            return qp1VarM914q.mo909j();
        }
        Object object = f1160o.getObject(obj, m898T(i2) & 1048575);
        if (m885t(object)) {
            return object;
        }
        Object objMo909j = qp1VarM914q.mo909j();
        if (object != null) {
            qp1VarM914q.mo900a(objMo909j, object);
        }
        return objMo909j;
    }
}
