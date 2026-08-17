package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.example.ssmousepro.billing.BillingManager;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f40 implements a90, PurchasesResponseListener, ProductDetailsResponseListener, PurchasesUpdatedListener, ConsumeResponseListener, yg0, ComponentRegistrarProcessor, xt0 {

    /* JADX INFO: renamed from: b */
    public static final f40 f3611b = new f40(0);

    /* JADX INFO: renamed from: c */
    public static final f40 f3612c = new f40(1);

    /* JADX INFO: renamed from: d */
    public static final f40 f3613d = new f40(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3614a;

    public /* synthetic */ f40(int i) {
        this.f3614a = i;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m2707b(int i, byte[] bArr) throws fm0 {
        try {
            return hr1.m3273i(i, bArr);
        } catch (fc1 e) {
            throw new fm0("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new fm0(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2708d() throws EOFException {
        throw new EOFException();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2709e(int i, int i2) throws EOFException {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2710f(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2711g(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2712h(Object obj, String str) throws C0810k {
        throw new C0810k(str + obj);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2713i(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m2714j(String str, Object obj, Object obj2, Object obj3) {
        throw new RuntimeException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2715k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2716l(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m2717m(Object obj, String str) throws CRLException {
        throw new CRLException(str + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m2718n(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2719o(String str) {
        throw new IllegalStateException(str);
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: a */
    public x80[] mo120a() {
        switch (this.f3614a) {
            case 6:
                return new x80[]{new C0552d2()};
            case 7:
                return new x80[]{new C0625f2()};
            case 8:
                return new x80[]{new C0555d5()};
            default:
                return new x80[]{new C1505v5()};
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0297  */
    /* JADX WARN: Code duplicated, block: B:90:0x02eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // p000.yg0
    public Object apply(Object obj) {
        Object r17;
        Bitmap bitmapDecodeByteArray;
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        boolean z;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        switch (this.f3614a) {
            case 22:
                x80 x80Var = (x80) obj;
                x80Var.getClass();
                return x80Var.getClass().getSimpleName();
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                Bundle bundle = (Bundle) obj;
                Object charSequence = bundle.getCharSequence(C0805jv.f5545r);
                if (charSequence != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0805jv.f5546s);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        int size = parcelableArrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = parcelableArrayList.get(i7);
                            i7++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i8 = bundle2.getInt(AbstractC1531vv.f11775a);
                            int i9 = bundle2.getInt(AbstractC1531vv.f11776b);
                            int i10 = bundle2.getInt(AbstractC1531vv.f11777c);
                            int i11 = bundle2.getInt(AbstractC1531vv.f11778d, -1);
                            Bundle bundle3 = bundle2.getBundle(AbstractC1531vv.f11779e);
                            if (i11 == i6) {
                                bundle3.getClass();
                                String string = bundle3.getString(fn1.f3859c);
                                string.getClass();
                                charSequence.setSpan(new fn1(string, bundle3.getInt(fn1.f3860d)), i8, i9, i10);
                            } else if (i11 == i5) {
                                bundle3.getClass();
                                charSequence.setSpan(new sz1(bundle3.getInt(sz1.f10657d), bundle3.getInt(sz1.f10658e), bundle3.getInt(sz1.f10659f)), i8, i9, i10);
                            } else if (i11 == i4) {
                                charSequence.setSpan(new nk0(), i8, i9, i10);
                            } else if (i11 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(q82.f9443b);
                                string2.getClass();
                                charSequence.setSpan(new q82(string2), i8, i9, i10);
                            }
                            i4 = 3;
                            i5 = 2;
                            i6 = 1;
                        }
                    }
                    r17 = charSequence;
                } else {
                    r17 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C0805jv.f5547t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C0805jv.f5548u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C0805jv.f5549v);
                if (bitmap != null) {
                    bitmapDecodeByteArray = bitmap;
                } else {
                    byte[] byteArray = bundle.getByteArray(C0805jv.f5550w);
                    bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length) : null;
                }
                String str = C0805jv.f5551x;
                if (bundle.containsKey(str)) {
                    String str2 = C0805jv.f5552y;
                    if (bundle.containsKey(str2)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str2);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                String str3 = C0805jv.f5553z;
                int i12 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C0805jv.f5535A;
                float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C0805jv.f5536B;
                int i13 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C0805jv.f5538D;
                if (bundle.containsKey(str6)) {
                    String str7 = C0805jv.f5537C;
                    if (bundle.containsKey(str7)) {
                        f2 = bundle.getFloat(str6);
                        i2 = bundle.getInt(str7);
                    } else {
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                    }
                } else {
                    f2 = -3.4028235E38f;
                    i2 = Integer.MIN_VALUE;
                }
                String str8 = C0805jv.f5539E;
                float f4 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C0805jv.f5540F;
                float f5 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C0805jv.f5541G;
                if (bundle.containsKey(str10)) {
                    i3 = bundle.getInt(str10);
                    z = true;
                } else {
                    i3 = -16777216;
                    z = false;
                }
                int i14 = i3;
                boolean z2 = !bundle.getBoolean(C0805jv.f5542H, false) ? false : z;
                String str11 = C0805jv.f5543I;
                int i15 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C0805jv.f5544J;
                return new C0805jv(r17, alignment2, alignment4, bitmapDecodeByteArray, f, i, i12, f3, i13, i2, f2, f4, f5, z2, i14, i15, bundle.containsKey(str12) ? bundle.getFloat(str12) : TouchPipeline.SIZE);
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                C0805jv c0805jv = (C0805jv) obj;
                Bitmap bitmap2 = c0805jv.f5557d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = c0805jv.f5554a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(C0805jv.f5545r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str13 = AbstractC1531vv.f11775a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (fn1 fn1Var : (fn1[]) spanned.getSpans(0, spanned.length(), fn1.class)) {
                            fn1Var.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(fn1.f3859c, fn1Var.f3861a);
                            bundle5.putInt(fn1.f3860d, fn1Var.f3862b);
                            arrayList.add(AbstractC1531vv.m6662a(spanned, fn1Var, 1, bundle5));
                        }
                        for (sz1 sz1Var : (sz1[]) spanned.getSpans(0, spanned.length(), sz1.class)) {
                            sz1Var.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(sz1.f10657d, sz1Var.f10660a);
                            bundle6.putInt(sz1.f10658e, sz1Var.f10661b);
                            bundle6.putInt(sz1.f10659f, sz1Var.f10662c);
                            arrayList.add(AbstractC1531vv.m6662a(spanned, sz1Var, 2, bundle6));
                        }
                        for (nk0 nk0Var : (nk0[]) spanned.getSpans(0, spanned.length(), nk0.class)) {
                            arrayList.add(AbstractC1531vv.m6662a(spanned, nk0Var, 3, null));
                        }
                        for (q82 q82Var : (q82[]) spanned.getSpans(0, spanned.length(), q82.class)) {
                            q82Var.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(q82.f9443b, q82Var.f9444a);
                            arrayList.add(AbstractC1531vv.m6662a(spanned, q82Var, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(C0805jv.f5546s, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(C0805jv.f5547t, c0805jv.f5555b);
                bundle4.putSerializable(C0805jv.f5548u, c0805jv.f5556c);
                bundle4.putFloat(C0805jv.f5551x, c0805jv.f5558e);
                bundle4.putInt(C0805jv.f5552y, c0805jv.f5559f);
                bundle4.putInt(C0805jv.f5553z, c0805jv.f5560g);
                bundle4.putFloat(C0805jv.f5535A, c0805jv.f5561h);
                bundle4.putInt(C0805jv.f5536B, c0805jv.f5562i);
                bundle4.putInt(C0805jv.f5537C, c0805jv.f5567n);
                bundle4.putFloat(C0805jv.f5538D, c0805jv.f5568o);
                bundle4.putFloat(C0805jv.f5539E, c0805jv.f5563j);
                bundle4.putFloat(C0805jv.f5540F, c0805jv.f5564k);
                bundle4.putBoolean(C0805jv.f5542H, c0805jv.f5565l);
                bundle4.putInt(C0805jv.f5541G, c0805jv.f5566m);
                bundle4.putInt(C0805jv.f5543I, c0805jv.f5569p);
                bundle4.putFloat(C0805jv.f5544J, c0805jv.f5570q);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ki0.m3864h(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(C0805jv.f5550w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            default:
                long j = ((C1122mv) obj).f7104b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        ((h21) obj).getClass();
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        BillingManager.consumirOuConfirmar$lambda$13(billingResult, str);
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        BillingManager.carregarCatalogo$lambda$10(billingResult, queryProductDetailsResult);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        BillingManager.purchasesUpdatedListener$lambda$2(billingResult, list);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        BillingManager.reprocessarComprasPendentes$lambda$12(billingResult, list);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    /* JADX INFO: renamed from: p */
    public void m2720p() {
    }
}
