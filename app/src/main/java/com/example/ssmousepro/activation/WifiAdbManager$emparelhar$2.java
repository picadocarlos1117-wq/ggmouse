package com.example.ssmousepro.activation;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.Objects;
import kotlinx.coroutines.CoroutineScope;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.bc1;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$emparelhar$2", m5373f = "WifiAdbManager.kt", m5374l = {158}, m5375m = "invokeSuspend")
public final class WifiAdbManager$emparelhar$2 extends ny1 implements ch0 {
    final /* synthetic */ String $codigo;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $hostManual;
    final /* synthetic */ Integer $portaManual;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiAdbManager$emparelhar$2(String str, Context context, String str2, Integer num, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$codigo = str;
        this.$context = context;
        this.$hostManual = str2;
        this.$portaManual = num;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new WifiAdbManager$emparelhar$2(this.$codigo, this.$context, this.$hostManual, this.$portaManual, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((WifiAdbManager$emparelhar$2) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String string;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    if (Build.VERSION.SDK_INT < 30) {
                        return new ul1(new tl1(new IllegalStateException("Android 11+ necessário")));
                    }
                    String string2 = zv1.m7383W0(this.$codigo).toString();
                    StringBuilder sb = new StringBuilder();
                    int length = string2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = string2.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    string = sb.toString();
                    if (string.length() != 6) {
                        return new ul1(new tl1(new IllegalArgumentException("Código deve ter 6 dígitos")));
                    }
                    if (!WifiAdbManager.pairingEmCurso.compareAndSet(false, true)) {
                        return new ul1(new tl1(new IllegalStateException("Emparelhamento já em curso")));
                    }
                    WifiAdbManager wifiAdbManager = WifiAdbManager.INSTANCE;
                    Context context = this.$context;
                    String str = this.$hostManual;
                    Integer num = this.$portaManual;
                    this.L$0 = string;
                    this.label = 1;
                    obj = wifiAdbManager.resolverEndpointPareamento(context, str, num, this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (obj == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    string = (String) this.L$0;
                    ua0.m6440Z(obj);
                }
                bc1 bc1Var = (bc1) obj;
                if (bc1Var == null) {
                    ul1 ul1Var = new ul1(new tl1(new IllegalStateException("Não achei a porta de pareamento. Abra “Parear com código” e tente de novo.")));
                    WifiAdbManager.pairingEmCurso.set(false);
                    return ul1Var;
                }
                Object obj3 = bc1Var.f1293b;
                Object obj4 = bc1Var.f1292a;
                Objects.toString(obj4);
                Objects.toString(obj3);
                SsproAdbConnectionManager.Companion.get(this.$context).pair((String) obj4, ((Number) obj3).intValue(), string);
                this.$context.getApplicationContext().getSharedPreferences("sspro_wifi_adb", 0).edit().putBoolean("paired", true).putString("last_host", (String) obj4).apply();
                obj2 = "Emparelhado com " + obj4 + ":" + obj3;
                WifiAdbManager.pairingEmCurso.set(false);
                return new ul1(obj2);
            } catch (Exception e) {
                Log.e("WifiAdbManager", "Falha no pair", e);
                tl1 tl1Var = new tl1(e);
                WifiAdbManager.pairingEmCurso.set(false);
                obj2 = tl1Var;
            }
        } catch (Throwable th) {
            WifiAdbManager.pairingEmCurso.set(false);
            throw th;
        }
    }
}
