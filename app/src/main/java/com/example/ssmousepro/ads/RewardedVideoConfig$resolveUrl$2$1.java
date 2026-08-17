package com.example.ssmousepro.ads;

import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.Source;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.hw1;
import p000.ny1;
import p000.ua0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedVideoConfig$resolveUrl$2$1", m5373f = "RewardedVideoConfig.kt", m5374l = {InjectionMetrics.I_KEY_EVENTS}, m5375m = "invokeSuspend")
public final class RewardedVideoConfig$resolveUrl$2$1 extends ny1 implements ch0 {
    final /* synthetic */ RewardedVideoConfig $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedVideoConfig$resolveUrl$2$1(RewardedVideoConfig rewardedVideoConfig, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$this_runCatching = rewardedVideoConfig;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new RewardedVideoConfig$resolveUrl$2$1(this.$this_runCatching, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((RewardedVideoConfig$resolveUrl$2$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        String string;
        int i = this.label;
        if (i == 0) {
            ua0.m6440Z(obj);
            Task<DocumentSnapshot> task = this.$this_runCatching.getDb().collection("config").document("rewarded_video").get(Source.SERVER);
            task.getClass();
            this.label = 1;
            obj = TasksKt.await(task, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (obj == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
        }
        String string2 = ((DocumentSnapshot) obj).getString(ImagesContract.URL);
        if (string2 == null || (string = zv1.m7383W0(string2).toString()) == null || !hw1.m3309D0(string, "https://", false)) {
            return null;
        }
        return string;
    }
}
