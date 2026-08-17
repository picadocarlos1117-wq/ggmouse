package p000;

import android.net.Uri;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u01 extends ny1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public int f11081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v01 f11082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f11083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(v01 v01Var, Uri uri, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.f11082b = v01Var;
        this.f11083c = uri;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new u01(this.f11082b, this.f11083c, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        return ((u01) create((CoroutineScope) obj, (InterfaceC0579du) obj2)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f11081a;
        if (i == 0) {
            ua0.m6440Z(obj);
            r01 r01Var = this.f11082b.f11472a;
            this.f11081a = 1;
            Object objM5641d = r01Var.m5641d(this.f11083c, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objM5641d == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
        }
        return z32.f13265a;
    }
}
