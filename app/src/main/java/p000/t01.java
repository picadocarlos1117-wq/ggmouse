package p000;

import android.net.Uri;
import android.view.InputEvent;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 extends ny1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public int f10686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v01 f10687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f10688c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InputEvent f10689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t01(v01 v01Var, Uri uri, InputEvent inputEvent, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.f10687b = v01Var;
        this.f10688c = uri;
        this.f10689d = inputEvent;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new t01(this.f10687b, this.f10688c, this.f10689d, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        return ((t01) create((CoroutineScope) obj, (InterfaceC0579du) obj2)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f10686a;
        if (i == 0) {
            ua0.m6440Z(obj);
            r01 r01Var = this.f10687b.f11472a;
            this.f10686a = 1;
            Object objM5640c = r01Var.m5640c(this.f10688c, this.f10689d, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objM5640c == enumC1530vu) {
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
