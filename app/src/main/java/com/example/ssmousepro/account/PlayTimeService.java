package com.example.ssmousepro.account;

import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.firebase.functions.HttpsCallableReference;
import com.google.firebase.functions.HttpsCallableResult;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.tasks.TasksKt;
import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.f40;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PlayTimeService {
    public static final PlayTimeService INSTANCE = new PlayTimeService();
    private static final String REGION = "southamerica-east1";

    /* JADX INFO: renamed from: com.example.ssmousepro.account.PlayTimeService$debitarTempo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.account.PlayTimeService", m5373f = "PlayTimeService.kt", m5374l = {21}, m5375m = "debitarTempo")
    public static final class C02071 extends AbstractC0616eu {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C02071(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlayTimeService.this.debitarTempo(0L, this);
        }
    }

    private PlayTimeService() {
    }

    private final FirebaseFunctions getFunctions() {
        return FunctionsKt.functions(Firebase.INSTANCE, REGION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object debitarTempo(long j, InterfaceC0579du interfaceC0579du) {
        C02071 c02071;
        if (interfaceC0579du instanceof C02071) {
            c02071 = (C02071) interfaceC0579du;
            int i = c02071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02071.label = i - Integer.MIN_VALUE;
            } else {
                c02071 = new C02071(interfaceC0579du);
            }
        } else {
            c02071 = new C02071(interfaceC0579du);
        }
        Object objAwait = c02071.result;
        int i2 = c02071.label;
        if (i2 == 0) {
            ua0.m6440Z(objAwait);
            HttpsCallableReference httpsCallable = getFunctions().getHttpsCallable("debitPlayTime");
            Map mapSingletonMap = Collections.singletonMap("deltaMs", new Long(j));
            mapSingletonMap.getClass();
            Task<HttpsCallableResult> taskCall = httpsCallable.call(mapSingletonMap);
            c02071.J$0 = j;
            c02071.label = 1;
            objAwait = TasksKt.await(taskCall, c02071);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAwait == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAwait);
        }
        Object data = ((HttpsCallableResult) objAwait).getData();
        Map map = data instanceof Map ? (Map) data : null;
        if (map == null) {
            return new Long(AccountRepository.INSTANCE.accessExpiresAt());
        }
        Object obj = map.get(AccountConstants.FIELD_ACCESS_EXPIRES_AT);
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : AccountRepository.INSTANCE.accessExpiresAt();
        AccountRepository.INSTANCE.aplicarAcessoServidor(jLongValue);
        return new Long(jLongValue);
    }
}
