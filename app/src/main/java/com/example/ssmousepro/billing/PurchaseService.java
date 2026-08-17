package com.example.ssmousepro.billing;

import com.example.ssmousepro.account.AccountConstants;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.firebase.functions.HttpsCallableResult;
import java.util.Map;
import kotlinx.coroutines.tasks.TasksKt;
import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.bc1;
import p000.f40;
import p000.qy0;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PurchaseService {
    public static final PurchaseService INSTANCE = new PurchaseService();
    private static final String REGION = "southamerica-east1";

    /* JADX INFO: renamed from: com.example.ssmousepro.billing.PurchaseService$verificarCompra$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.billing.PurchaseService", m5373f = "PurchaseService.kt", m5374l = {InjectionMetrics.I_TAP_ID_EXHAUST}, m5375m = "verificarCompra")
    public static final class C02371 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02371(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseService.this.verificarCompra(null, null, this);
        }
    }

    private PurchaseService() {
    }

    private final long extrairVencimento(Map<String, ? extends Object> map) {
        Object obj = map.get(AccountConstants.FIELD_ACCESS_EXPIRES_AT);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        Object obj2 = map.get(AccountConstants.FIELD_BALANCE_MS);
        if (obj2 instanceof Number) {
            return ((Number) obj2).longValue() + System.currentTimeMillis();
        }
        f40.m2719o("Vencimento não recebido.");
        return 0L;
    }

    private final FirebaseFunctions getFunctions() {
        return FunctionsKt.functions(Firebase.INSTANCE, REGION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object verificarCompra(String str, String str2, InterfaceC0579du interfaceC0579du) {
        C02371 c02371;
        if (interfaceC0579du instanceof C02371) {
            c02371 = (C02371) interfaceC0579du;
            int i = c02371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02371.label = i - Integer.MIN_VALUE;
            } else {
                c02371 = new C02371(interfaceC0579du);
            }
        } else {
            c02371 = new C02371(interfaceC0579du);
        }
        Object objAwait = c02371.result;
        int i2 = c02371.label;
        if (i2 == 0) {
            ua0.m6440Z(objAwait);
            Task<HttpsCallableResult> taskCall = getFunctions().getHttpsCallable("verifyPlayPurchase").call(qy0.m5620j0(new bc1("productId", str), new bc1("purchaseToken", str2), new bc1("packageName", "com.sousasantoslogic.sspro")));
            c02371.L$0 = null;
            c02371.L$1 = null;
            c02371.label = 1;
            objAwait = TasksKt.await(taskCall, c02371);
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
        Map<String, ? extends Object> map = data instanceof Map ? (Map) data : null;
        if (map == null) {
            f40.m2719o("Resposta inválida do servidor.");
            return null;
        }
        long jExtrairVencimento = extrairVencimento(map);
        AccountRepository.INSTANCE.aplicarAcessoServidor(jExtrairVencimento);
        return new Long(jExtrairVencimento);
    }
}
