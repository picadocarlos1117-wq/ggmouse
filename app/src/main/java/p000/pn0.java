package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.C0061y;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements xx0, gz0, k62, lg1, InterfaceC1075ll, tx1, InterfaceC0700h3 {

    /* JADX INFO: renamed from: a */
    public Object f8968a;

    public pn0(int i) {
        switch (i) {
            case 21:
                this.f8968a = new ArrayDeque();
                break;
            case 25:
                this.f8968a = new k50((byte) 0, 20);
                break;
            default:
                this.f8968a = new C1146ni();
                break;
        }
    }

    @Override // p000.InterfaceC0700h3
    /* JADX INFO: renamed from: a */
    public boolean mo3095a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f8968a;
        if (!swipeDismissBehavior.mo1647v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = i72.f4849a;
        boolean z = t62.m6240d(view) == 1;
        int i = swipeDismissBehavior.f1951d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(TouchPipeline.SIZE);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m5283b(int i, boolean z) {
        C1146ni c1146ni = (C1146ni) this.f8968a;
        if (z) {
            c1146ni.m4550b(i);
        } else {
            c1146ni.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x029a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m5284c(int i, int i2, y80 y80Var) throws fc1 {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        f01 f01Var = (f01) this.f8968a;
        l91 l91Var = f01Var.f3546b;
        SparseArray sparseArray = f01Var.f3548c;
        dc1 dc1Var = f01Var.f3558k;
        dc1 dc1Var2 = f01Var.f3556i;
        int i14 = 1;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (f01Var.f3526I != 2) {
                    return;
                }
                e01 e01Var = (e01) sparseArray.get(f01Var.f3532O);
                int i16 = f01Var.f3535R;
                dc1 dc1Var3 = f01Var.f3563p;
                if (i16 != 4 || !"V_VP9".equals(e01Var.f3126b)) {
                    y80Var.mo2423m(i2);
                    return;
                } else {
                    dc1Var3.m2313C(i2);
                    y80Var.readFully(dc1Var3.f2882a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                f01Var.m2665c(i);
                e01 e01Var2 = f01Var.f3570w;
                int i17 = e01Var2.f3131g;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    y80Var.mo2423m(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                e01Var2.f3113O = bArr;
                y80Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                f01Var.m2665c(i);
                byte[] bArr2 = new byte[i2];
                f01Var.f3570w.f3133i = bArr2;
                y80Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                y80Var.readFully(bArr3, 0, i2);
                f01Var.m2665c(i);
                f01Var.f3570w.f3134j = new b22(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(dc1Var.f2882a, (byte) 0);
                y80Var.readFully(dc1Var.f2882a, 4 - i2, i2);
                dc1Var.m2316F(0);
                f01Var.f3572y = (int) dc1Var.m2339v();
                return;
            }
            if (i == 25506) {
                f01Var.m2665c(i);
                byte[] bArr4 = new byte[i2];
                f01Var.f3570w.f3135k = bArr4;
                y80Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw fc1.m2799a(null, "Unexpected id: " + i);
            }
            f01Var.m2665c(i);
            byte[] bArr5 = new byte[i2];
            f01Var.f3570w.f3147w = bArr5;
            y80Var.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (f01Var.f3526I == 0) {
            f01Var.f3532O = (int) l91Var.m4151g(y80Var, false, true, 8);
            f01Var.f3533P = l91Var.f6279c;
            f01Var.f3528K = -9223372036854775807L;
            f01Var.f3526I = 1;
            dc1Var2.m2313C(0);
        }
        e01 e01Var3 = (e01) sparseArray.get(f01Var.f3532O);
        if (e01Var3 == null) {
            y80Var.mo2423m(i2 - f01Var.f3533P);
            f01Var.f3526I = 0;
            return;
        }
        e01Var3.f3123Y.getClass();
        if (f01Var.f3526I == 1) {
            f01Var.m2667i(y80Var, 3);
            int i19 = (dc1Var2.f2882a[2] & 6) >> 1;
            if (i19 == 0) {
                f01Var.f3530M = 1;
                int[] iArr2 = f01Var.f3531N;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                f01Var.f3531N = iArr2;
                iArr2[0] = (i2 - f01Var.f3533P) - 3;
            } else {
                f01Var.m2667i(y80Var, 4);
                int i20 = (dc1Var2.f2882a[3] & 255) + 1;
                f01Var.f3530M = i20;
                int[] iArr3 = f01Var.f3531N;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i4 = 4;
                } else {
                    i4 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                f01Var.f3531N = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - f01Var.f3533P) - 4;
                    int i22 = f01Var.f3530M;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i4;
                        while (true) {
                            i10 = f01Var.f3530M - 1;
                            iArr = f01Var.f3531N;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                f01Var.m2667i(y80Var, i11);
                                int i26 = dc1Var2.f2882a[i25] & 255;
                                int[] iArr4 = f01Var.f3531N;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - f01Var.f3533P) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw fc1.m2799a(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i4;
                        while (true) {
                            int i30 = f01Var.f3530M - i14;
                            int[] iArr5 = f01Var.f3531N;
                            if (i27 >= i30) {
                                i3 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - f01Var.f3533P) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            f01Var.m2667i(y80Var, i31);
                            if (dc1Var2.f2882a[i29] == 0) {
                                throw fc1.m2799a(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = i14 << (7 - i32);
                                i7 = i14;
                                if ((dc1Var2.f2882a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    f01Var.m2667i(y80Var, i9);
                                    i8 = i15;
                                    j = (~i33) & dc1Var2.f2882a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (dc1Var2.f2882a[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i14 = i7;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw fc1.m2799a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = f01Var.f3531N;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i14 = i7;
                            i18 = i6;
                            i15 = i8;
                        }
                    }
                    byte[] bArr6 = dc1Var2.f2882a;
                    f01Var.f3527J = f01Var.m2669l((bArr6[i3] & 255) | (bArr6[i5] << 8)) + f01Var.f3521D;
                    if (e01Var3.f3128d != 2 || (i == 163 && (dc1Var2.f2882a[2] & 128) == 128)) {
                        i13 = i3;
                    } else {
                        i13 = i5;
                    }
                    f01Var.f3534Q = i13;
                    f01Var.f3526I = 2;
                    f01Var.f3529L = i5;
                }
            }
            i3 = 1;
            i5 = 0;
            byte[] bArr7 = dc1Var2.f2882a;
            f01Var.f3527J = f01Var.m2669l((bArr7[i3] & 255) | (bArr7[i5] << 8)) + f01Var.f3521D;
            if (e01Var3.f3128d != 2) {
                i13 = i3;
            } else {
                i13 = i3;
            }
            f01Var.f3534Q = i13;
            f01Var.f3526I = 2;
            f01Var.f3529L = i5;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i35 = f01Var.f3529L;
                if (i35 >= f01Var.f3530M) {
                    f01Var.f3526I = 0;
                    return;
                }
                f01Var.m2666d(e01Var3, ((long) ((f01Var.f3529L * e01Var3.f3129e) / 1000)) + f01Var.f3527J, f01Var.f3534Q, f01Var.m2670m(y80Var, e01Var3, f01Var.f3531N[i35], false), 0);
                f01Var.f3529L++;
            }
        } else {
            while (true) {
                int i36 = f01Var.f3529L;
                if (i36 >= f01Var.f3530M) {
                    return;
                }
                int[] iArr7 = f01Var.f3531N;
                boolean z = i3;
                iArr7[i36] = f01Var.m2670m(y80Var, e01Var3, iArr7[i36], z);
                f01Var.f3529L += z ? 1 : 0;
            }
        }
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: d */
    public void mo741d() {
        p11 p11Var = (p11) this.f8968a;
        Surface surface = p11Var.f8640U0;
        if (surface != null) {
            C1290pc c1290pc = p11Var.f8629J0;
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new j62(c1290pc, surface, SystemClock.elapsedRealtime()));
            }
            p11Var.f8643X0 = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5285e(AbstractC0753ik abstractC0753ik) {
        if (!abstractC0753ik.mo2992n()) {
            if (!(abstractC0753ik instanceof xm1)) {
                l41.m4052u(abstractC0753ik.getClass(), "Has a new type of ByteString been created? Found ");
                return;
            }
            xm1 xm1Var = (xm1) abstractC0753ik;
            m5285e(xm1Var.f12647e);
            m5285e(xm1Var.f12648f);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(xm1.f12645n, abstractC0753ik.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iM6936z = xm1.m6936z(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f8968a;
        if (arrayDeque.isEmpty() || ((AbstractC0753ik) arrayDeque.peek()).size() >= iM6936z) {
            arrayDeque.push(abstractC0753ik);
            return;
        }
        int iM6936z2 = xm1.m6936z(iBinarySearch);
        AbstractC0753ik xm1Var2 = (AbstractC0753ik) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC0753ik) arrayDeque.peek()).size() < iM6936z2) {
            xm1Var2 = new xm1((AbstractC0753ik) arrayDeque.pop(), xm1Var2);
        }
        xm1 xm1Var3 = new xm1(xm1Var2, abstractC0753ik);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(xm1.f12645n, xm1Var3.f12646d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0753ik) arrayDeque.peek()).size() >= xm1.m6936z(iBinarySearch2 + 1)) {
                break;
            } else {
                xm1Var3 = new xm1((AbstractC0753ik) arrayDeque.pop(), xm1Var3);
            }
        }
        arrayDeque.push(xm1Var3);
    }

    @Override // p000.lg1
    /* JADX INFO: renamed from: f */
    public void mo743f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f8968a).setResultCode(i);
    }

    /* JADX INFO: renamed from: g */
    public void m5286g(byte[] bArr) {
        int i = 0;
        while (true) {
            hf1[] hf1VarArr = (hf1[]) this.f8968a;
            if (i >= hf1VarArr.length) {
                return;
            }
            hf1 hf1Var = hf1VarArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                C1174o9[] c1174o9Arr = hf1Var.f4558b;
                if (i3 < c1174o9Arr.length) {
                    C1174o9 c1174o9 = c1174o9Arr[i3];
                    short s = (short) (i2 + i3);
                    qo0 qo0Var = (qo0) c1174o9.f7701d;
                    qo0Var.getClass();
                    rn1 rn1Var = (rn1) qo0Var.f9548b;
                    byte[] bArr2 = new byte[842];
                    rn1Var.m6130k();
                    rn1Var.mo729e(0, bArr.length, bArr);
                    rn1Var.mo729e(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
                    int i4 = 840;
                    rn1Var.m5865n(0, 840, bArr2);
                    int iM4736V = C1174o9.m4736V(c1174o9, 0, 256, bArr2, 840);
                    while (iM4736V < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        rn1Var.m5865n(i5, 168, bArr2);
                        i4 = 168 + i5;
                        iM4736V += C1174o9.m4736V(c1174o9, iM4736V, 256 - iM4736V, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public r72 m5287h(Class cls) {
        String canonicalName;
        String strM5136B;
        C1412sn c1412snM3006a = gk1.m3006a(cls);
        C1174o9 c1174o9 = (C1174o9) this.f8968a;
        Map map = C1412sn.f10441b;
        Class cls2 = c1412snM3006a.f10442a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            canonicalName = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            canonicalName = (!componentType.isPrimitive() || (strM5136B = p32.m5136B(componentType.getName())) == null) ? null : strM5136B.concat("Array");
            if (canonicalName == null) {
                canonicalName = "kotlin.Array";
            }
        } else {
            String strM5136B2 = p32.m5136B(cls2.getName());
            canonicalName = strM5136B2 == null ? cls2.getCanonicalName() : strM5136B2;
        }
        if (canonicalName != null) {
            return c1174o9.m4743I(c1412snM3006a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        f40.m2713i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: i */
    public void mo746i() {
        p11 p11Var = (p11) this.f8968a;
        if (p11Var.f8640U0 != null) {
            p11Var.m5114H0(0, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m5288j(int i, long j) throws fc1 {
        f01 f01Var = (f01) this.f8968a;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw fc1.m2799a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw fc1.m2799a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                f01Var.m2665c(i);
                f01Var.f3570w.f3128d = (int) j;
                return;
            case 136:
                f01Var.m2665c(i);
                f01Var.f3570w.f3121W = j == 1;
                return;
            case 155:
                f01Var.f3528K = f01Var.m2669l(j);
                return;
            case 159:
                f01Var.m2665c(i);
                f01Var.f3570w.f3114P = (int) j;
                return;
            case 176:
                f01Var.m2665c(i);
                f01Var.f3570w.f3137m = (int) j;
                return;
            case 179:
                f01Var.m2664a(i);
                f01Var.f3522E.m5258c(f01Var.m2669l(j));
                return;
            case 186:
                f01Var.m2665c(i);
                f01Var.f3570w.f3138n = (int) j;
                return;
            case 215:
                f01Var.m2665c(i);
                f01Var.f3570w.f3127c = (int) j;
                return;
            case 231:
                f01Var.f3521D = f01Var.m2669l(j);
                return;
            case 238:
                f01Var.f3535R = (int) j;
                return;
            case 241:
                if (f01Var.f3524G) {
                    return;
                }
                f01Var.m2664a(i);
                f01Var.f3523F.m5258c(j);
                f01Var.f3524G = true;
                return;
            case 251:
                f01Var.f3536S = true;
                return;
            case 16871:
                f01Var.m2665c(i);
                f01Var.f3570w.f3131g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw fc1.m2799a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw fc1.m2799a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw fc1.m2799a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw fc1.m2799a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw fc1.m2799a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                f01Var.f3573z = j + f01Var.f3566s;
                return;
            case 21432:
                int i2 = (int) j;
                f01Var.m2665c(i);
                if (i2 == 0) {
                    f01Var.f3570w.f3148x = 0;
                    return;
                }
                if (i2 == 1) {
                    f01Var.f3570w.f3148x = 2;
                    return;
                } else if (i2 == 3) {
                    f01Var.f3570w.f3148x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    f01Var.f3570w.f3148x = 3;
                    return;
                }
            case 21680:
                f01Var.m2665c(i);
                f01Var.f3570w.f3140p = (int) j;
                return;
            case 21682:
                f01Var.m2665c(i);
                f01Var.f3570w.f3142r = (int) j;
                return;
            case 21690:
                f01Var.m2665c(i);
                f01Var.f3570w.f3141q = (int) j;
                return;
            case 21930:
                f01Var.m2665c(i);
                f01Var.f3570w.f3120V = j == 1;
                return;
            case 21938:
                f01Var.m2665c(i);
                e01 e01Var = f01Var.f3570w;
                e01Var.f3149y = true;
                e01Var.f3139o = (int) j;
                return;
            case 21998:
                f01Var.m2665c(i);
                f01Var.f3570w.f3130f = (int) j;
                return;
            case 22186:
                f01Var.m2665c(i);
                f01Var.f3570w.f3117S = j;
                return;
            case 22203:
                f01Var.m2665c(i);
                f01Var.f3570w.f3118T = j;
                return;
            case 25188:
                f01Var.m2665c(i);
                f01Var.f3570w.f3115Q = (int) j;
                return;
            case 30114:
                f01Var.f3537T = j;
                return;
            case 30321:
                f01Var.m2665c(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    f01Var.f3570w.f3143s = 0;
                    return;
                }
                if (i3 == 1) {
                    f01Var.f3570w.f3143s = 1;
                    return;
                } else if (i3 == 2) {
                    f01Var.f3570w.f3143s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    f01Var.f3570w.f3143s = 3;
                    return;
                }
            case 2352003:
                f01Var.m2665c(i);
                f01Var.f3570w.f3129e = (int) j;
                return;
            case 2807729:
                f01Var.f3567t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        f01Var.m2665c(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            f01Var.f3570w.f3100B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            f01Var.f3570w.f3100B = 1;
                            return;
                        }
                    case 21946:
                        f01Var.m2665c(i);
                        int iM7330g = C1673zp.m7330g((int) j);
                        if (iM7330g != -1) {
                            f01Var.f3570w.f3099A = iM7330g;
                            return;
                        }
                        return;
                    case 21947:
                        f01Var.m2665c(i);
                        f01Var.f3570w.f3149y = true;
                        int iM7329f = C1673zp.m7329f((int) j);
                        if (iM7329f != -1) {
                            f01Var.f3570w.f3150z = iM7329f;
                            return;
                        }
                        return;
                    case 21948:
                        f01Var.m2665c(i);
                        f01Var.f3570w.f3101C = (int) j;
                        return;
                    case 21949:
                        f01Var.m2665c(i);
                        f01Var.f3570w.f3102D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: k */
    public InputStream m5289k() {
        InputStream inputStream = (InputStream) this.f8968a;
        this.f8968a = null;
        return inputStream;
    }

    /* JADX INFO: renamed from: l */
    public void m5290l(Exception exc) {
        AbstractC1337qm.m5551n("MediaCodecAudioRenderer", "Audio sink error", exc);
        C1290pc c1290pc = ((a11) this.f8968a).f11I0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1140nc(c1290pc, exc, 4));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5291m(hf1 hf1Var, hf1 hf1Var2) {
        C1174o9[] c1174o9Arr = hf1Var2.f4558b;
        int i = 0;
        int i2 = 0;
        while (true) {
            hf1[] hf1VarArr = (hf1[]) this.f8968a;
            if (i2 >= hf1VarArr.length) {
                return;
            }
            C1174o9 c1174o9 = hf1Var.f4558b[i2];
            hf1 hf1Var3 = hf1VarArr[i2];
            ch1 ch1Var = (ch1) c1174o9.f7700c;
            int[] iArr = new int[256];
            ((qo0) ch1Var.f1813h).getClass();
            C1174o9 c1174o10 = hf1Var3.f4558b[i];
            C1174o9 c1174o11 = c1174o9Arr[i];
            for (int i3 = i; i3 < 256; i3++) {
                ((int[]) c1174o9.f7699b)[i3] = sc2.m6036F(((long) ((int[]) c1174o10.f7699b)[i3]) * ((long) ((int[]) c1174o11.f7699b)[i3]));
            }
            for (int i4 = 1; i4 < ch1Var.f1808c; i4++) {
                C1174o9 c1174o12 = hf1Var3.f4558b[i4];
                C1174o9 c1174o13 = c1174o9Arr[i4];
                for (int i5 = 0; i5 < 256; i5++) {
                    iArr[i5] = sc2.m6036F(((long) ((int[]) c1174o12.f7699b)[i5]) * ((long) ((int[]) c1174o13.f7699b)[i5]));
                }
                for (int i6 = 0; i6 < 256; i6++) {
                    int[] iArr2 = (int[]) c1174o9.f7699b;
                    iArr2[i6] = iArr2[i6] + iArr[i6];
                }
            }
            i2++;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m5292n(boolean z) {
        ox0 ox0Var = (ox0) this.f8968a;
        ox0Var.f8549h0.m2155h(ox0Var.f8528M, z);
    }

    /* JADX INFO: renamed from: o */
    public void m5293o(j51 j51Var, byte[] bArr) {
        jc1.m3599c();
        try {
            String str = "/" + ((v91) this.f8968a).f11590h.f11126b;
            if (bArr != null) {
                ((v91) this.f8968a).f11597o = true;
                str = str + "?" + C0677gh.f4189c.m2984c(bArr);
            }
            synchronized (((v91) this.f8968a).f11594l.f11220v) {
                u91.m6410a(((v91) this.f8968a).f11594l, j51Var, str);
            }
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC1075ll
    public void onCancel() {
        ((C0061y) this.f8968a).m440a();
    }

    public /* synthetic */ pn0(Object obj) {
        this.f8968a = obj;
    }

    public pn0(v72 v72Var, u72 u72Var) {
        v72Var.getClass();
        C1678zu c1678zu = C1678zu.f13563b;
        c1678zu.getClass();
        this.f8968a = new C1174o9(v72Var, u72Var, c1678zu);
    }

    public pn0(ch1 ch1Var) {
        int i = ch1Var.f1807b;
        this.f8968a = new hf1[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((hf1[]) this.f8968a)[i2] = new hf1(ch1Var, 1);
        }
    }
}
