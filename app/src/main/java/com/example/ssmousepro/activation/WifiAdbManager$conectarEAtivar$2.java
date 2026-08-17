package com.example.ssmousepro.activation;

import android.content.Context;
import android.util.Log;
import kotlinx.coroutines.CoroutineScope;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.hw1;
import p000.ny1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$conectarEAtivar$2", m5373f = "WifiAdbManager.kt", m5374l = {192, 195, 200, 220, 306, 307}, m5375m = "invokeSuspend")
public final class WifiAdbManager$conectarEAtivar$2 extends ny1 implements ch0 {
    final /* synthetic */ Context $context;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiAdbManager$conectarEAtivar$2(Context context, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2(String str) {
        return zv1.m7383W0(zv1.m7376P0(str, "package:")).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$3(String str) {
        return hw1.m3306A0(str, ".apk");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(SsproAdbConnectionManager ssproAdbConnectionManager, String str) {
        try {
            ssproAdbConnectionManager.shellBloqueante(str);
            Log.w("WifiAdbManager", "Keep-alive ADB encerrou (daemon morreu ou sessão caiu)");
        } catch (Exception e) {
            Log.w("WifiAdbManager", "Keep-alive ADB falhou", e);
        } finally {
            if (WifiAdbManager.adbKeepAliveAtivo) {
                WifiAdbManager.adbKeepAliveAtivo = false;
                WifiAdbManager.daemonOk = false;
                WifiAdbManager.ultimoPingOk = false;
            }
            SsproAdbConnectionManager.Companion.fecharSeExistir();
        }
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        WifiAdbManager$conectarEAtivar$2 wifiAdbManager$conectarEAtivar$2 = new WifiAdbManager$conectarEAtivar$2(this.$context, interfaceC0579du);
        wifiAdbManager$conectarEAtivar$2.L$0 = obj;
        return wifiAdbManager$conectarEAtivar$2;
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((WifiAdbManager$conectarEAtivar$2) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01d9 A[Catch: all -> 0x0221, Exception -> 0x0224, TryCatch #0 {all -> 0x0221, blocks: (B:101:0x0407, B:107:0x0421, B:104:0x0410, B:92:0x03a5, B:94:0x03ad, B:98:0x03dc, B:112:0x044d, B:65:0x0212, B:76:0x022b, B:78:0x0231, B:81:0x026d, B:83:0x0293, B:86:0x02c7, B:88:0x02ec, B:91:0x0320, B:60:0x01d3, B:62:0x01d9, B:56:0x01b4, B:59:0x01ca), top: B:119:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0210  */
    /* JADX WARN: Code duplicated, block: B:65:0x0212 A[Catch: all -> 0x0221, Exception -> 0x0224, PHI: r1 r2 r7 r12 r13 r14 r16
  0x0212: PHI (r1v45 int) = (r1v23 int), (r1v46 int) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r2v32 java.util.Iterator) = (r2v16 java.util.Iterator), (r2v36 java.util.Iterator) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r7v16 java.lang.Object) = (r7v13 java.lang.Object), (r7v20 java.lang.Object) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r12v12 com.example.ssmousepro.activation.SsproAdbConnectionManager) = 
  (r12v8 com.example.ssmousepro.activation.SsproAdbConnectionManager)
  (r12v18 com.example.ssmousepro.activation.SsproAdbConnectionManager)
 binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r13v12 bc1) = (r13v8 bc1), (r13v14 bc1) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r14v5 android.content.SharedPreferences) = (r14v3 android.content.SharedPreferences), (r14v9 android.content.SharedPreferences) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r16v9 long) = (r16v6 long), (r16v10 long) binds: [B:63:0x020e, B:18:0x00bc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0221, blocks: (B:101:0x0407, B:107:0x0421, B:104:0x0410, B:92:0x03a5, B:94:0x03ad, B:98:0x03dc, B:112:0x044d, B:65:0x0212, B:76:0x022b, B:78:0x0231, B:81:0x026d, B:83:0x0293, B:86:0x02c7, B:88:0x02ec, B:91:0x0320, B:60:0x01d3, B:62:0x01d9, B:56:0x01b4, B:59:0x01ca), top: B:119:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x021a  */
    /* JADX WARN: Code duplicated, block: B:69:0x021f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x020e -> B:65:0x0212). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0404 -> B:101:0x0407). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0018ah
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.WifiAdbManager$conectarEAtivar$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
