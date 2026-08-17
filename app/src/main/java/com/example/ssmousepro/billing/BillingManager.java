package com.example.ssmousepro.billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import com.android.billingclient.api.UnfetchedProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1451tp;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.mg0;
import p000.ny1;
import p000.og0;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingManager {
    private static final String TAG = "BillingManager";
    private static BillingClient billingClient;
    private static volatile mg0 onCatalogoCarregado;
    private static volatile og0 onCompraFinalizada;
    private static volatile og0 onErro;
    public static final BillingManager INSTANCE = new BillingManager();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    private static final LinkedHashMap<String, ProductDetails> productDetails = new LinkedHashMap<>();
    private static final PurchasesUpdatedListener purchasesUpdatedListener = new f40(13);

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class CancelledException extends Exception {
        public CancelledException() {
            super("Compra cancelada.");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.billing.BillingManager$processarCompra$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.billing.BillingManager$processarCompra$1", m5373f = "BillingManager.kt", m5374l = {201}, m5375m = "invokeSuspend")
    public static final class C02361 extends ny1 implements ch0 {
        final /* synthetic */ String $productId;
        final /* synthetic */ Purchase $purchase;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02361(Purchase purchase, String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$purchase = purchase;
            this.$productId = str;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02361(this.$purchase, this.$productId, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02361) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    BillingManager$processarCompra$1$balance$1 billingManager$processarCompra$1$balance$1 = new BillingManager$processarCompra$1$balance$1(this.$productId, this.$purchase, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, billingManager$processarCompra$1$balance$1, this);
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
                long jLongValue = ((Number) obj).longValue();
                BillingManager billingManager = BillingManager.INSTANCE;
                billingManager.consumirOuConfirmar(this.$purchase);
                og0 onCompraFinalizada = billingManager.getOnCompraFinalizada();
                if (onCompraFinalizada != null) {
                    onCompraFinalizada.invoke(new ul1(new Long(jLongValue)));
                }
            } catch (Exception e) {
                Log.e(BillingManager.TAG, "Falha ao verificar compra", e);
                BillingManager billingManager2 = BillingManager.INSTANCE;
                og0 onErro = billingManager2.getOnErro();
                if (onErro != null) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Falha ao creditar tempo.";
                    }
                    onErro.invoke(message);
                }
                og0 onCompraFinalizada2 = billingManager2.getOnCompraFinalizada();
                if (onCompraFinalizada2 != null) {
                    onCompraFinalizada2.invoke(new ul1(new tl1(e)));
                }
            }
            return z32.f13265a;
        }
    }

    private BillingManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void carregarCatalogo() {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 == null) {
            return;
        }
        List<String> ids = BillingProducts.INSTANCE.getIDS();
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(ids));
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType("inapp").build());
        }
        QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        queryProductDetailsParamsBuild.getClass();
        billingClient2.queryProductDetailsAsync(queryProductDetailsParamsBuild, new f40(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void carregarCatalogo$lambda$10(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        billingResult.getClass();
        queryProductDetailsResult.getClass();
        if (billingResult.getResponseCode() != 0) {
            Log.w(TAG, "Catálogo: " + billingResult.getDebugMessage());
            return;
        }
        productDetails.clear();
        List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
        productDetailsList.getClass();
        for (ProductDetails productDetails2 : productDetailsList) {
            productDetails.put(productDetails2.getProductId(), productDetails2);
        }
        List<UnfetchedProduct> unfetchedProductList = queryProductDetailsResult.getUnfetchedProductList();
        unfetchedProductList.getClass();
        Iterator<T> it = unfetchedProductList.iterator();
        while (it.hasNext()) {
            Log.w(TAG, "Play não retornou produto: " + ((UnfetchedProduct) it.next()).getProductId());
        }
        BillingManager billingManager = INSTANCE;
        List<String> listIdsFaltando = billingManager.idsFaltando();
        if (listIdsFaltando.isEmpty()) {
            AbstractC1377rp.m5873t0(BillingProducts.INSTANCE.getIDS(), null, null, null, null, 63);
        } else {
            int size = billingManager.idsCarregados().size();
            int size2 = BillingProducts.INSTANCE.getIDS().size();
            String strM5873t0 = AbstractC1377rp.m5873t0(listIdsFaltando, null, null, null, null, 63);
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("Catálogo: ", size, "/", size2, " com preço. Faltando: ");
            sbM5345l.append(strM5873t0);
            Log.w(TAG, sbM5345l.toString());
        }
        mg0 mg0Var = onCatalogoCarregado;
        if (mg0Var != null) {
            mg0Var.invoke();
        }
    }

    private final void conectar() {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 != null) {
            billingClient2.startConnection(new BillingClientStateListener() { // from class: com.example.ssmousepro.billing.BillingManager.conectar.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    Log.w(BillingManager.TAG, "Billing desconectado");
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    billingResult.getClass();
                    if (billingResult.getResponseCode() == 0) {
                        BillingManager billingManager = BillingManager.INSTANCE;
                        billingManager.carregarCatalogo();
                        billingManager.reprocessarComprasPendentes();
                    } else {
                        Log.w(BillingManager.TAG, "Billing setup: " + billingResult.getDebugMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumirOuConfirmar(Purchase purchase) {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 == null || purchase.isAcknowledged()) {
            return;
        }
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        consumeParamsBuild.getClass();
        billingClient2.consumeAsync(consumeParamsBuild, new f40(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumirOuConfirmar$lambda$13(BillingResult billingResult, String str) {
        billingResult.getClass();
        str.getClass();
        if (billingResult.getResponseCode() != 0) {
            Log.w(TAG, "Consume: " + billingResult.getDebugMessage());
        }
    }

    private final void processarCompra(Purchase purchase) {
        if (purchase.getPurchaseState() != 1) {
            return;
        }
        List<String> products = purchase.getProducts();
        products.getClass();
        String str = products.isEmpty() ? null : products.get(0);
        if (str == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C02361(purchase, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchasesUpdatedListener$lambda$2(BillingResult billingResult, List list) {
        billingResult.getClass();
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    BillingManager billingManager = INSTANCE;
                    purchase.getClass();
                    billingManager.processarCompra(purchase);
                }
                return;
            }
            return;
        }
        if (responseCode == 1) {
            og0 og0Var = onCompraFinalizada;
            if (og0Var != null) {
                og0Var.invoke(new ul1(new tl1(new CancelledException())));
                return;
            }
            return;
        }
        og0 og0Var2 = onErro;
        if (og0Var2 != null) {
            String debugMessage = billingResult.getDebugMessage();
            if (zv1.m7371K0(debugMessage)) {
                debugMessage = "Compra não concluída.";
            }
            og0Var2.invoke(debugMessage);
        }
        og0 og0Var3 = onCompraFinalizada;
        if (og0Var3 != null) {
            og0Var3.invoke(new ul1(new tl1(new IllegalStateException(billingResult.getDebugMessage()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reprocessarComprasPendentes() {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 == null) {
            return;
        }
        billingClient2.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new f40(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reprocessarComprasPendentes$lambda$12(BillingResult billingResult, List list) {
        billingResult.getClass();
        list.getClass();
        if (billingResult.getResponseCode() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                BillingManager billingManager = INSTANCE;
                purchase.getClass();
                billingManager.processarCompra(purchase);
            }
        }
    }

    public final boolean catalogoCompleto() {
        return idsFaltando().isEmpty();
    }

    public final ProductDetails detalhes(String str) {
        str.getClass();
        return productDetails.get(str);
    }

    public final void encerrar() {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 != null) {
            billingClient2.endConnection();
        }
        billingClient = null;
        productDetails.clear();
    }

    public final boolean estaPronto() {
        BillingClient billingClient2 = billingClient;
        return billingClient2 != null && billingClient2.isReady();
    }

    public final mg0 getOnCatalogoCarregado() {
        return onCatalogoCarregado;
    }

    public final og0 getOnCompraFinalizada() {
        return onCompraFinalizada;
    }

    public final og0 getOnErro() {
        return onErro;
    }

    public final Set<String> idsCarregados() {
        List<String> ids = BillingProducts.INSTANCE.getIDS();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ids) {
            if (INSTANCE.precoFormatado((String) obj) != null) {
                arrayList.add(obj);
            }
        }
        return AbstractC1377rp.m5869D0(arrayList);
    }

    public final List<String> idsFaltando() {
        List<String> ids = BillingProducts.INSTANCE.getIDS();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ids) {
            if (INSTANCE.precoFormatado((String) obj) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void iniciarCompra(Activity activity, String str) {
        og0 og0Var;
        activity.getClass();
        str.getClass();
        BillingClient billingClient2 = billingClient;
        if (billingClient2 == null || !billingClient2.isReady()) {
            og0 og0Var2 = onErro;
            if (og0Var2 != null) {
                og0Var2.invoke("Google Play indisponível. Tente de novo.");
            }
            conectar();
            return;
        }
        ProductDetails productDetails2 = productDetails.get(str);
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetailsMelhorOferta = melhorOferta(productDetails2);
        if (productDetails2 == null || oneTimePurchaseOfferDetailsMelhorOferta == null) {
            og0 og0Var3 = onErro;
            if (og0Var3 != null) {
                og0Var3.invoke("Plano não encontrado na Play Store.");
            }
            carregarCatalogo();
            return;
        }
        BillingFlowParams.ProductDetailsParams.Builder productDetails3 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails2);
        productDetails3.getClass();
        String offerToken = oneTimePurchaseOfferDetailsMelhorOferta.getOfferToken();
        if (offerToken != null) {
            productDetails3.setOfferToken(offerToken);
        }
        BillingFlowParams billingFlowParamsBuild = BillingFlowParams.newBuilder().setProductDetailsParamsList(AbstractC1337qm.m5511F(productDetails3.build())).build();
        billingFlowParamsBuild.getClass();
        BillingResult billingResultLaunchBillingFlow = billingClient2.launchBillingFlow(activity, billingFlowParamsBuild);
        billingResultLaunchBillingFlow.getClass();
        if (billingResultLaunchBillingFlow.getResponseCode() == 0 || (og0Var = onErro) == null) {
            return;
        }
        String debugMessage = billingResultLaunchBillingFlow.getDebugMessage();
        if (zv1.m7371K0(debugMessage)) {
            debugMessage = "Não foi possível abrir a compra.";
        }
        og0Var.invoke(debugMessage);
    }

    public final void init(Context context) {
        context.getClass();
        if (billingClient != null) {
            return;
        }
        billingClient = BillingClient.newBuilder(context.getApplicationContext()).setListener(purchasesUpdatedListener).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        conectar();
    }

    public final ProductDetails.OneTimePurchaseOfferDetails melhorOferta(ProductDetails productDetails2) {
        if (productDetails2 == null) {
            return null;
        }
        List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetails2.getOneTimePurchaseOfferDetailsList();
        List<ProductDetails.OneTimePurchaseOfferDetails> list = oneTimePurchaseOfferDetailsList;
        return (list == null || list.isEmpty()) ? productDetails2.getOneTimePurchaseOfferDetails() : (ProductDetails.OneTimePurchaseOfferDetails) AbstractC1377rp.m5870q0(oneTimePurchaseOfferDetailsList);
    }

    public final String precoFormatado(String str) {
        str.getClass();
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetailsMelhorOferta = melhorOferta(productDetails.get(str));
        if (oneTimePurchaseOfferDetailsMelhorOferta != null) {
            return oneTimePurchaseOfferDetailsMelhorOferta.getFormattedPrice();
        }
        return null;
    }

    public final void recarregarCatalogo() {
        BillingClient billingClient2 = billingClient;
        if (billingClient2 == null || !billingClient2.isReady()) {
            conectar();
        } else {
            carregarCatalogo();
        }
    }

    public final void setOnCatalogoCarregado(mg0 mg0Var) {
        onCatalogoCarregado = mg0Var;
    }

    public final void setOnCompraFinalizada(og0 og0Var) {
        onCompraFinalizada = og0Var;
    }

    public final void setOnErro(og0 og0Var) {
        onErro = og0Var;
    }
}
