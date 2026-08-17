package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 extends sl1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5517a;

    /* JADX INFO: renamed from: b */
    public int f5518b;

    /* JADX INFO: renamed from: c */
    public int f5519c;

    /* JADX INFO: renamed from: d */
    public int f5520d;

    /* JADX INFO: renamed from: e */
    public Object f5521e;

    /* JADX INFO: renamed from: f */
    public Object f5522f;

    /* JADX INFO: renamed from: g */
    public Object f5523g;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f5524m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt1(Object obj, InterfaceC0579du interfaceC0579du, int i) {
        super(interfaceC0579du);
        this.f5517a = i;
        this.f5524m = obj;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        int i = this.f5517a;
        Object obj2 = this.f5524m;
        switch (i) {
            case 0:
                jt1 jt1Var = new jt1((Iterator) obj2, interfaceC0579du, 0);
                jt1Var.f5522f = obj;
                return jt1Var;
            default:
                jt1 jt1Var2 = new jt1((ViewGroup) obj2, interfaceC0579du, 1);
                jt1Var2.f5521e = obj;
                return jt1Var2;
        }
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5517a;
        z32 z32Var = z32.f13265a;
        xq1 xq1Var = (xq1) obj;
        InterfaceC0579du interfaceC0579du = (InterfaceC0579du) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((jt1) create(xq1Var, interfaceC0579du)).invokeSuspend(z32Var);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        um1 um1Var;
        xq1 xq1Var;
        ViewGroup viewGroup;
        int childCount;
        int i4;
        Object obj2;
        ViewGroup viewGroup2;
        xq1 xq1Var2;
        int i5 = this.f5517a;
        int i6 = 0;
        Object obj3 = this.f5524m;
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        z32 z32Var = z32.f13265a;
        int i7 = 1;
        InterfaceC0579du interfaceC0579du = null;
        switch (i5) {
            case 0:
                Iterator it2 = (Iterator) obj3;
                xq1 xq1Var3 = (xq1) this.f5522f;
                int i8 = this.f5520d;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                        } else if (i8 == 3) {
                            i2 = this.f5519c;
                            int i9 = this.f5518b;
                            Iterator it3 = (Iterator) this.f5523g;
                            um1 um1Var2 = (um1) this.f5521e;
                            ua0.m6440Z(obj);
                            um1Var2.m6511b();
                            while (true) {
                                int i10 = um1Var2.f11362b;
                                Object[] objArr = um1Var2.f11361a;
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    int i11 = i7;
                                    if (um1Var2.mo6170a() == i10) {
                                        f40.m2719o("ring buffer is full");
                                        return null;
                                    }
                                    int i12 = um1Var2.f11363c;
                                    int i13 = um1Var2.f11364d;
                                    objArr[(i12 + i13) % i10] = next;
                                    um1Var2.f11364d = i13 + 1;
                                    if (um1Var2.mo6170a() == i10) {
                                        if (um1Var2.f11364d >= 20) {
                                            ArrayList arrayList2 = new ArrayList(um1Var2);
                                            this.f5522f = xq1Var3;
                                            this.f5521e = um1Var2;
                                            this.f5523g = it3;
                                            this.f5518b = i9;
                                            this.f5519c = i2;
                                            this.f5520d = 3;
                                            xq1Var3.mo6820a(arrayList2, this);
                                            return enumC1530vu;
                                        }
                                        int i14 = i10 + (i10 >> 1) + 1;
                                        if (i14 > 20) {
                                            i14 = 20;
                                        }
                                        um1Var2 = new um1(um1Var2.f11363c == 0 ? Arrays.copyOf(objArr, i14) : um1Var2.toArray(new Object[i14]), um1Var2.f11364d);
                                    }
                                    i7 = i11;
                                } else {
                                    i3 = i9;
                                    um1Var = um1Var2;
                                }
                            }
                            if (um1Var.f11364d > 20) {
                                ArrayList arrayList3 = new ArrayList(um1Var);
                                this.f5522f = xq1Var3;
                                this.f5521e = um1Var;
                                this.f5523g = null;
                                this.f5518b = i3;
                                this.f5519c = i2;
                                this.f5520d = 4;
                                xq1Var3.mo6820a(arrayList3, this);
                                return enumC1530vu;
                            }
                            if (!um1Var.isEmpty()) {
                                this.f5522f = null;
                                this.f5521e = null;
                                this.f5523g = null;
                                this.f5518b = i3;
                                this.f5519c = i2;
                                this.f5520d = 5;
                                xq1Var3.mo6820a(um1Var, this);
                                return enumC1530vu;
                            }
                        } else if (i8 == 4) {
                            i2 = this.f5519c;
                            i3 = this.f5518b;
                            um1Var = (um1) this.f5521e;
                            ua0.m6440Z(obj);
                            um1Var.m6511b();
                            if (um1Var.f11364d > 20) {
                                ArrayList arrayList4 = new ArrayList(um1Var);
                                this.f5522f = xq1Var3;
                                this.f5521e = um1Var;
                                this.f5523g = null;
                                this.f5518b = i3;
                                this.f5519c = i2;
                                this.f5520d = 4;
                                xq1Var3.mo6820a(arrayList4, this);
                                return enumC1530vu;
                            }
                            if (!um1Var.isEmpty()) {
                                this.f5522f = null;
                                this.f5521e = null;
                                this.f5523g = null;
                                this.f5518b = i3;
                                this.f5519c = i2;
                                this.f5520d = 5;
                                xq1Var3.mo6820a(um1Var, this);
                                return enumC1530vu;
                            }
                        } else {
                            if (i8 != 5) {
                                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        ua0.m6440Z(obj);
                    } else {
                        i6 = this.f5519c;
                        int i15 = this.f5518b;
                        it = (Iterator) this.f5523g;
                        ua0.m6440Z(obj);
                        arrayList = new ArrayList(20);
                        i = i15;
                    }
                    return z32Var;
                }
                ua0.m6440Z(obj);
                it = it2;
                arrayList = new ArrayList(20);
                i = 20;
                int i16 = i6;
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (i6 > 0) {
                        i6--;
                    } else {
                        arrayList.add(next2);
                        if (arrayList.size() == 20) {
                            this.f5522f = xq1Var3;
                            this.f5521e = arrayList;
                            this.f5523g = it;
                            this.f5518b = i;
                            this.f5519c = i16;
                            this.f5520d = 1;
                            xq1Var3.mo6820a(arrayList, this);
                            return enumC1530vu;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f5522f = null;
                    this.f5521e = null;
                    this.f5523g = null;
                    this.f5518b = i;
                    this.f5519c = i16;
                    this.f5520d = 2;
                    xq1Var3.mo6820a(arrayList, this);
                    return enumC1530vu;
                }
                return z32Var;
            default:
                int i17 = this.f5520d;
                if (i17 != 0) {
                    if (i17 == 1) {
                        childCount = this.f5519c;
                        i4 = this.f5518b;
                        View view = (View) this.f5523g;
                        viewGroup = (ViewGroup) this.f5522f;
                        xq1Var = (xq1) this.f5521e;
                        ua0.m6440Z(obj);
                        if (view instanceof ViewGroup) {
                            jt1 jt1Var = new jt1((ViewGroup) view, interfaceC0579du, i7);
                            this.f5521e = xq1Var;
                            this.f5522f = viewGroup;
                            this.f5523g = null;
                            this.f5518b = i4;
                            this.f5519c = childCount;
                            this.f5520d = 2;
                            xq1Var.getClass();
                            wq1 wq1VarM3251B = hr1.m3251B(jt1Var);
                            wq1 wq1Var = (wq1) xq1Var;
                            if (wq1VarM3251B.hasNext()) {
                                wq1Var.f12252c = wq1VarM3251B;
                                wq1Var.f12250a = 2;
                                wq1Var.f12253d = this;
                                obj2 = enumC1530vu;
                            } else {
                                obj2 = z32Var;
                            }
                            if (obj2 != enumC1530vu) {
                                obj2 = z32Var;
                            }
                            if (obj2 == enumC1530vu) {
                                return enumC1530vu;
                            }
                            viewGroup2 = viewGroup;
                            xq1Var2 = xq1Var;
                        }
                        i6 = i4 + 1;
                    } else {
                        if (i17 != 2) {
                            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        childCount = this.f5519c;
                        i4 = this.f5518b;
                        viewGroup2 = (ViewGroup) this.f5522f;
                        xq1Var2 = (xq1) this.f5521e;
                        ua0.m6440Z(obj);
                    }
                    xq1Var = xq1Var2;
                    viewGroup = viewGroup2;
                    i6 = i4 + 1;
                } else {
                    ua0.m6440Z(obj);
                    xq1Var = (xq1) this.f5521e;
                    viewGroup = (ViewGroup) obj3;
                    childCount = viewGroup.getChildCount();
                }
                if (i6 >= childCount) {
                    return z32Var;
                }
                View childAt = viewGroup.getChildAt(i6);
                childAt.getClass();
                this.f5521e = xq1Var;
                this.f5522f = viewGroup;
                this.f5523g = childAt;
                this.f5518b = i6;
                this.f5519c = childCount;
                this.f5520d = 1;
                xq1Var.mo6820a(childAt, this);
                return enumC1530vu;
        }
    }
}
