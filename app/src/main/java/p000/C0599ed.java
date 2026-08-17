package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.C0040d;
import androidx.fragment.app.C0061y;
import com.android.billingclient.api.zzcm;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ed */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599ed implements InterfaceC1075ll, yx1, InterfaceC0005a4, a32 {

    /* JADX INFO: renamed from: a */
    public Object f3313a;

    /* JADX INFO: renamed from: b */
    public Object f3314b;

    /* JADX INFO: renamed from: c */
    public Object f3315c;

    /* JADX INFO: renamed from: d */
    public Object f3316d;

    public C0599ed(Typeface typeface, q51 q51Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f3316d = typeface;
        this.f3313a = q51Var;
        this.f3315c = new s51(1024);
        int iM2406a = q51Var.m2406a(6);
        if (iM2406a != 0) {
            int i5 = iM2406a + q51Var.f3073a;
            i = ((ByteBuffer) q51Var.f3076d).getInt(((ByteBuffer) q51Var.f3076d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f3314b = new char[i * 2];
        int iM2406a2 = q51Var.m2406a(6);
        if (iM2406a2 != 0) {
            int i6 = iM2406a2 + q51Var.f3073a;
            i2 = ((ByteBuffer) q51Var.f3076d).getInt(((ByteBuffer) q51Var.f3076d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            c60 c60Var = new c60(this, i7);
            p51 p51VarM1136b = c60Var.m1136b();
            int iM2406a3 = p51VarM1136b.m2406a(4);
            Character.toChars(iM2406a3 != 0 ? ((ByteBuffer) p51VarM1136b.f3076d).getInt(iM2406a3 + p51VarM1136b.f3073a) : 0, (char[]) this.f3314b, i7 * 2);
            p51 p51VarM1136b2 = c60Var.m1136b();
            int iM2406a4 = p51VarM1136b2.m2406a(16);
            if (iM2406a4 != 0) {
                int i8 = iM2406a4 + p51VarM1136b2.f3073a;
                i3 = ((ByteBuffer) p51VarM1136b2.f3076d).getInt(((ByteBuffer) p51VarM1136b2.f3076d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            rc2.m5784g(i3 > 0, "invalid metadata codepoint length");
            s51 s51Var = (s51) this.f3315c;
            p51 p51VarM1136b3 = c60Var.m1136b();
            int iM2406a5 = p51VarM1136b3.m2406a(16);
            if (iM2406a5 != 0) {
                int i9 = iM2406a5 + p51VarM1136b3.f3073a;
                i4 = ((ByteBuffer) p51VarM1136b3.f3076d).getInt(((ByteBuffer) p51VarM1136b3.f3076d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            s51Var.m5979a(c60Var, 0, i4 - 1);
        }
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: a */
    public boolean mo69a(AbstractC0086b4 abstractC0086b4, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f3313a).onActionItemClicked(m2568g(abstractC0086b4), new v31((Context) this.f3314b, (my1) menuItem));
    }

    /* JADX INFO: renamed from: b */
    public byte[] m2566b(byte[] bArr, int i, h91 h91Var) {
        k20 k20Var = (k20) this.f3314b;
        C0799jp c0799jp = (C0799jp) this.f3313a;
        int i2 = c0799jp.f5482a;
        if (bArr.length != i2) {
            f40.m2713i(jd0.m3610h(i2, "startHash needs to be ", "bytes"));
            return null;
        }
        h91Var.mo3113a();
        if (i > c0799jp.f5483b - 1) {
            f40.m2713i("max chain length must not be greater than w");
            return null;
        }
        if (i == 0) {
            return bArr;
        }
        byte[] bArrM2566b = m2566b(bArr, i - 1, h91Var);
        lr0 lr0Var = new lr0(1);
        lr0Var.f12518c = h91Var.f12516a;
        lr0Var.f12517b = h91Var.f12517b;
        lr0Var.f6495e = h91Var.f4476e;
        lr0Var.f6496f = h91Var.f4477f;
        lr0Var.f6497g = i - 1;
        lr0Var.f12519d = 0;
        h91 h91Var2 = new h91(lr0Var);
        byte[] bArrM3752a = k20Var.m3752a((byte[]) this.f3316d, h91Var2.mo3113a());
        lr0 lr0Var2 = new lr0(1);
        lr0Var2.f12518c = h91Var2.f12516a;
        lr0Var2.f12517b = h91Var2.f12517b;
        lr0Var2.f6495e = h91Var2.f4476e;
        lr0Var2.f6496f = h91Var2.f4477f;
        lr0Var2.f6497g = h91Var2.f4478g;
        lr0Var2.f12519d = 1;
        byte[] bArrM3752a2 = k20Var.m3752a((byte[]) this.f3316d, new h91(lr0Var2).mo3113a());
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArrM2566b[i3] ^ bArrM3752a2[i3]);
        }
        int length = bArrM3752a.length;
        int i4 = k20Var.f5634b;
        if (length != i4) {
            f40.m2713i("wrong key length");
            return null;
        }
        if (i2 == i4) {
            return k20Var.m3753d(0, bArrM3752a, bArr2);
        }
        f40.m2713i("wrong in length");
        return null;
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: c */
    public void mo70c(AbstractC0086b4 abstractC0086b4) {
        ((ActionMode.Callback) this.f3313a).onDestroyActionMode(m2568g(abstractC0086b4));
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: d */
    public boolean mo71d(AbstractC0086b4 abstractC0086b4, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3313a;
        iy1 iy1VarM2568g = m2568g(abstractC0086b4);
        zs1 zs1Var = (zs1) this.f3316d;
        Menu k41Var = (Menu) zs1Var.getOrDefault(menu, null);
        if (k41Var == null) {
            k41Var = new k41((Context) this.f3314b, (i31) menu);
            zs1Var.put(menu, k41Var);
        }
        return callback.onCreateActionMode(iy1VarM2568g, k41Var);
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: e */
    public boolean mo72e(AbstractC0086b4 abstractC0086b4, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3313a;
        iy1 iy1VarM2568g = m2568g(abstractC0086b4);
        zs1 zs1Var = (zs1) this.f3316d;
        Menu k41Var = (Menu) zs1Var.getOrDefault(menu, null);
        if (k41Var == null) {
            k41Var = new k41((Context) this.f3314b, (i31) menu);
            zs1Var.put(menu, k41Var);
        }
        return callback.onPrepareActionMode(iy1VarM2568g, k41Var);
    }

    /* JADX INFO: renamed from: f */
    public void m2567f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            l41.m4048q("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((zs1) this.f3314b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m2567f(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: g */
    public iy1 m2568g(AbstractC0086b4 abstractC0086b4) {
        ArrayList arrayList = (ArrayList) this.f3315c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            iy1 iy1Var = (iy1) arrayList.get(i);
            if (iy1Var != null && iy1Var.f5201b == abstractC0086b4) {
                return iy1Var;
            }
        }
        iy1 iy1Var2 = new iy1((Context) this.f3314b, abstractC0086b4);
        arrayList.add(iy1Var2);
        return iy1Var2;
    }

    /* JADX INFO: renamed from: h */
    public pn0 m2569h(h91 h91Var) {
        C0799jp c0799jp = (C0799jp) this.f3313a;
        byte[][] bArr = new byte[c0799jp.f5484c][];
        int i = 0;
        while (true) {
            int i2 = c0799jp.f5484c;
            if (i >= i2) {
                pn0 pn0Var = new pn0();
                if (c0799jp == null) {
                    l41.m4051t("params == null");
                    throw null;
                }
                for (byte[] bArr2 : bArr) {
                    if (bArr2 == null) {
                        l41.m4051t("publicKey byte array == null");
                        throw null;
                    }
                }
                if (bArr.length != c0799jp.f5484c) {
                    f40.m2713i("wrong publicKey size");
                    throw null;
                }
                for (byte[] bArr3 : bArr) {
                    if (bArr3.length != c0799jp.f5482a) {
                        f40.m2713i("wrong publicKey format");
                        throw null;
                    }
                }
                pn0Var.f8968a = o21.m4671n(bArr);
                return pn0Var;
            }
            lr0 lr0Var = new lr0(1);
            lr0Var.f12518c = h91Var.f12516a;
            lr0Var.f12517b = h91Var.f12517b;
            lr0Var.f6495e = h91Var.f4476e;
            lr0Var.f6496f = i;
            lr0Var.f6497g = h91Var.f4478g;
            lr0Var.f12519d = h91Var.f12519d;
            h91Var = new h91(lr0Var);
            if (i < 0 || i >= i2) {
                f40.m2713i("index out of bounds");
                return null;
            }
            bArr[i] = m2566b(((k20) this.f3314b).m3752a((byte[]) this.f3315c, o21.m4687w0(32, i)), c0799jp.f5483b - 1, h91Var);
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public byte[] m2570i(byte[] bArr, h91 h91Var) {
        lr0 lr0Var = new lr0(1);
        lr0Var.f12518c = h91Var.f12516a;
        lr0Var.f12517b = h91Var.f12517b;
        lr0Var.f6495e = h91Var.f4476e;
        return ((k20) this.f3314b).m3752a(bArr, new h91(lr0Var).mo3113a());
    }

    /* JADX INFO: renamed from: j */
    public void m2571j(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((C0799jp) this.f3313a).f5482a;
        if (length != i) {
            f40.m2713i("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            l41.m4051t("publicSeed == null");
        } else if (bArr2.length != i) {
            f40.m2713i("size of publicSeed needs to be equal to size of digest");
        } else {
            this.f3315c = bArr;
            this.f3316d = bArr2;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2572k(nv1 nv1Var) {
        synchronized (this.f3313a) {
            try {
                if (((nv1) this.f3315c) != null) {
                    return;
                }
                this.f3315c = nv1Var;
                boolean zIsEmpty = ((HashSet) this.f3314b).isEmpty();
                if (zIsEmpty) {
                    ((ox0) this.f3316d).f8528M.mo2580h(nv1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2573l(C1550wd c1550wd) {
        lv1 lv1Var = new lv1(7);
        d32 d32Var = (d32) this.f3316d;
        C0674ge c0674ge = (C0674ge) this.f3313a;
        zzcm zzcmVar = (zzcm) this.f3315c;
        t60 t60Var = (t60) this.f3314b;
        h00 h00Var = d32Var.f2777c;
        C1174o9 c1174o9M2960a = C0674ge.m2960a();
        c1174o9M2960a.m4756Y(c0674ge.f4155a);
        c1174o9M2960a.f7701d = cg1.f1791a;
        c1174o9M2960a.f7700c = c0674ge.f4156b;
        C0674ge c0674geM4764j = c1174o9M2960a.m4764j();
        C1470u7 c1470u7 = new C1470u7();
        c1470u7.f11146f = new HashMap();
        c1470u7.f11144d = Long.valueOf(d32Var.f2775a.m753r());
        c1470u7.f11145e = Long.valueOf(d32Var.f2776b.m753r());
        c1470u7.f11141a = "PLAY_BILLING_LIBRARY";
        c1470u7.f11143c = new s60(t60Var, (byte[]) zzcmVar.apply(c1550wd.f12066a));
        c1470u7.f11142b = null;
        h00Var.f4370b.execute(new RunnableC1436ta(h00Var, c0674geM4764j, lv1Var, c1470u7.m6401d()));
    }

    @Override // p000.InterfaceC1075ll
    public void onCancel() {
        View view = (View) this.f3313a;
        view.clearAnimation();
        ((ViewGroup) this.f3314b).endViewTransition(view);
        ((C0040d) this.f3315c).m336a();
        if (AbstractC0056t.m363G(2)) {
            Objects.toString((C0061y) this.f3316d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        int[] iArr;
        ArrayList arrayList;
        C0805jv c0805jv;
        int i3;
        int i4;
        int iM2337t;
        int i5;
        int i6;
        int iM2340w;
        nc1 nc1Var = (nc1) this.f3315c;
        dc1 dc1Var = (dc1) this.f3313a;
        dc1Var.m2314D(i + i2, bArr);
        dc1Var.m2316F(i);
        dc1 dc1Var2 = (dc1) this.f3314b;
        if (dc1Var.m2318a() > 0 && (dc1Var.f2882a[dc1Var.f2883b] & 255) == 120) {
            if (((Inflater) this.f3316d) == null) {
                this.f3316d = new Inflater();
            }
            if (z42.m7251y(dc1Var, dc1Var2, (Inflater) this.f3316d)) {
                dc1Var.m2314D(dc1Var2.f2884c, dc1Var2.f2882a);
            }
        }
        int i7 = 0;
        nc1Var.f7361d = 0;
        int[] iArr2 = nc1Var.f7359b;
        dc1 dc1Var3 = nc1Var.f7358a;
        nc1Var.f7362e = 0;
        nc1Var.f7363f = 0;
        nc1Var.f7364g = 0;
        nc1Var.f7365h = 0;
        nc1Var.f7366i = 0;
        dc1Var3.m2313C(0);
        nc1Var.f7360c = false;
        ArrayList arrayList2 = new ArrayList();
        while (dc1Var.m2318a() >= 3) {
            int i8 = dc1Var.f2884c;
            int iM2337t2 = dc1Var.m2337t();
            int iM2343z = dc1Var.m2343z();
            int i9 = dc1Var.f2883b + iM2343z;
            if (i9 > i8) {
                dc1Var.m2316F(i8);
                i3 = i7;
                iArr = iArr2;
                arrayList = arrayList2;
                c0805jv = null;
            } else {
                char c = 128;
                if (iM2337t2 != 128) {
                    switch (iM2337t2) {
                        case 20:
                            if (iM2343z % 5 == 2) {
                                dc1Var.m2317G(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iM2343z / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iM2337t3 = dc1Var.m2337t();
                                    char c2 = c;
                                    double dM2337t = dc1Var.m2337t();
                                    double dM2337t2 = dc1Var.m2337t() - 128;
                                    int[] iArr3 = iArr2;
                                    double dM2337t3 = dc1Var.m2337t() - 128;
                                    iArr3[iM2337t3] = z42.m7233g((int) ((dM2337t3 * 1.772d) + dM2337t), 0, 255) | (dc1Var.m2337t() << 24) | (z42.m7233g((int) ((1.402d * dM2337t2) + dM2337t), 0, 255) << 16) | (z42.m7233g((int) ((dM2337t - (0.34414d * dM2337t3)) - (dM2337t2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    arrayList2 = arrayList2;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                arrayList = arrayList2;
                                nc1Var.f7360c = true;
                            } else {
                                iArr = iArr2;
                                arrayList = arrayList2;
                            }
                            break;
                        case 21:
                            if (iM2343z >= 4) {
                                dc1Var.m2317G(3);
                                int i12 = iM2343z - 4;
                                if (((128 & dc1Var.m2337t()) != 0 ? 1 : i7) == 0) {
                                    i5 = dc1Var3.f2883b;
                                    i6 = dc1Var3.f2884c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        dc1Var.m2322e(i5, iMin, dc1Var3.f2882a);
                                        dc1Var3.m2316F(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iM2340w = dc1Var.m2340w()) >= 4) {
                                    nc1Var.f7365h = dc1Var.m2343z();
                                    nc1Var.f7366i = dc1Var.m2343z();
                                    dc1Var3.m2313C(iM2340w - 4);
                                    i12 = iM2343z - 11;
                                    i5 = dc1Var3.f2883b;
                                    i6 = dc1Var3.f2884c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        dc1Var.m2322e(i5, iMin2, dc1Var3.f2882a);
                                        dc1Var3.m2316F(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (iM2343z >= 19) {
                                nc1Var.f7361d = dc1Var.m2343z();
                                nc1Var.f7362e = dc1Var.m2343z();
                                dc1Var.m2317G(11);
                                nc1Var.f7363f = dc1Var.m2343z();
                                nc1Var.f7364g = dc1Var.m2343z();
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        default:
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                    }
                    i3 = 0;
                    c0805jv = null;
                } else {
                    iArr = iArr2;
                    arrayList = arrayList2;
                    if (nc1Var.f7361d == 0 || nc1Var.f7362e == 0 || nc1Var.f7365h == 0 || nc1Var.f7366i == 0 || (i4 = dc1Var3.f2884c) == 0 || dc1Var3.f2883b != i4 || !nc1Var.f7360c) {
                        c0805jv = null;
                    } else {
                        dc1Var3.m2316F(0);
                        int i13 = nc1Var.f7365h * nc1Var.f7366i;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iM2337t4 = dc1Var3.m2337t();
                            if (iM2337t4 != 0) {
                                iM2337t = i14 + 1;
                                iArr4[i14] = iArr[iM2337t4];
                            } else {
                                int iM2337t5 = dc1Var3.m2337t();
                                if (iM2337t5 != 0) {
                                    iM2337t = ((iM2337t5 & 64) == 0 ? iM2337t5 & 63 : ((iM2337t5 & 63) << 8) | dc1Var3.m2337t()) + i14;
                                    Arrays.fill(iArr4, i14, iM2337t, (iM2337t5 & 128) == 0 ? iArr[0] : iArr[dc1Var3.m2337t()]);
                                }
                            }
                            i14 = iM2337t;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, nc1Var.f7365h, nc1Var.f7366i, Bitmap.Config.ARGB_8888);
                        float f = nc1Var.f7363f;
                        float f2 = nc1Var.f7361d;
                        float f3 = f / f2;
                        float f4 = nc1Var.f7364g;
                        float f5 = nc1Var.f7362e;
                        c0805jv = new C0805jv(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, nc1Var.f7365h / f2, nc1Var.f7366i / f5, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
                    }
                    i3 = 0;
                    nc1Var.f7361d = 0;
                    nc1Var.f7362e = 0;
                    nc1Var.f7363f = 0;
                    nc1Var.f7364g = 0;
                    nc1Var.f7365h = 0;
                    nc1Var.f7366i = 0;
                    dc1Var3.m2313C(0);
                    nc1Var.f7360c = false;
                }
                dc1Var.m2316F(i9);
            }
            arrayList2 = arrayList;
            if (c0805jv != null) {
                arrayList2.add(c0805jv);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        interfaceC0578dt.accept(new C1122mv(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    public /* synthetic */ C0599ed(Object obj) {
        this.f3314b = null;
        this.f3315c = null;
        this.f3316d = null;
        this.f3313a = obj;
    }

    public /* synthetic */ C0599ed(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3313a = obj;
        this.f3314b = obj2;
        this.f3315c = obj3;
        this.f3316d = obj4;
    }

    public C0599ed(int i) {
        switch (i) {
            case 4:
                this.f3313a = new kf1(10);
                this.f3314b = new zs1();
                this.f3315c = new ArrayList();
                this.f3316d = new HashSet();
                break;
            case 8:
                this.f3313a = new dc1();
                this.f3314b = new dc1();
                this.f3315c = new nc1();
                break;
            case 11:
                this.f3313a = new rn1(128);
                this.f3316d = new rn1(256);
                this.f3315c = new pn1(256);
                this.f3314b = new pn1(UserVerificationMethods.USER_VERIFY_NONE);
                break;
            case 12:
                this.f3313a = new C0633fa();
                this.f3314b = new SparseArray();
                this.f3315c = new ew0();
                this.f3316d = new C0633fa();
                break;
            default:
                bz1 bz1Var = bz1.f1582g;
                this.f3314b = p32.m5142H();
                this.f3315c = p32.m5142H();
                this.f3316d = p32.m5142H();
                this.f3313a = bz1Var;
                break;
        }
    }

    public C0599ed(C0799jp c0799jp) {
        if (c0799jp == null) {
            l41.m4051t("params == null");
            throw null;
        }
        this.f3313a = c0799jp;
        int i = c0799jp.f5482a;
        this.f3314b = new k20(i, (C1351r) c0799jp.f5485d);
        this.f3315c = new byte[i];
        this.f3316d = new byte[i];
    }

    public C0599ed(kk1 kk1Var, n71 n71Var, n71 n71Var2, n71 n71Var3) {
        Object objM5567n;
        if (kk1Var != null) {
            objM5567n = qm0.m5567n(kk1Var);
        } else {
            om0 om0Var = qm0.f9540b;
            objM5567n = kk1.f5896e;
        }
        this.f3313a = objM5567n;
        this.f3314b = n71Var;
        this.f3315c = n71Var2;
        this.f3316d = n71Var3;
    }
}
