package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 extends sl1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public int f9438a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f9439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f9440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(View view, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.f9440c = view;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        q72 q72Var = new q72(this.f9440c, interfaceC0579du);
        q72Var.f9439b = obj;
        return q72Var;
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        return ((q72) create((xq1) obj, (InterfaceC0579du) obj2)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.f9438a;
        View view = this.f9440c;
        int i2 = 1;
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        if (i == 0) {
            ua0.m6440Z(obj);
            xq1 xq1Var = (xq1) this.f9439b;
            this.f9439b = xq1Var;
            this.f9438a = 1;
            xq1Var.mo6820a(view, this);
            return enumC1530vu;
        }
        z32 z32Var = z32.f13265a;
        InterfaceC0579du interfaceC0579du = null;
        if (i == 1) {
            xq1 xq1Var2 = (xq1) this.f9439b;
            ua0.m6440Z(obj);
            if (view instanceof ViewGroup) {
                jt1 jt1Var = new jt1((ViewGroup) view, interfaceC0579du, i2);
                this.f9439b = null;
                this.f9438a = 2;
                xq1Var2.getClass();
                wq1 wq1VarM3251B = hr1.m3251B(jt1Var);
                wq1 wq1Var = (wq1) xq1Var2;
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
            }
        } else {
            if (i != 2) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
        }
        return z32Var;
    }
}
