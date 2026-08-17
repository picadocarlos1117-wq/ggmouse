package com.example.ssmousepro.activation;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.graphics.drawable.IconCompat;
import com.example.ssmousepro.C0203R;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p000.AbstractC1571wy;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.ny1;
import p000.p81;
import p000.qo0;
import p000.r81;
import p000.sk1;
import p000.vk1;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AdbPairingService extends Service {
    public static final String ACTION_PAIR_RESULT = "com.example.ssmousepro.WIFI_PAIR_RESULT";
    public static final String ACTION_SHOW = "com.example.ssmousepro.WIFI_PAIR_SHOW";
    public static final String ACTION_STOP = "com.example.ssmousepro.WIFI_PAIR_STOP";
    public static final String ACTION_SUBMIT = "com.example.ssmousepro.WIFI_PAIR_SUBMIT";
    public static final String CHANNEL_ID = "sspro_wifi_pair";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ACTIVATED = "activated";
    public static final String EXTRA_MSG = "msg";
    public static final String EXTRA_OK = "ok";
    private static final String KEY_CODIGO = "wifi_pair_code";
    public static final int NOTIF_ID = 44021;
    private static final String TAG = "AdbPairingService";
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.AdbPairingService$onStartCommand$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.AdbPairingService$onStartCommand$1", m5373f = "AdbPairingService.kt", m5374l = {FirestoreIndexValueWriter.INDEX_TYPE_MAP, 77}, m5375m = "invokeSuspend")
    public static final class C02101 extends ny1 implements ch0 {
        final /* synthetic */ String $codigo;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02101(String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$codigo = str;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return AdbPairingService.this.new C02101(this.$codigo, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02101) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
        
            if (r1 == r14) goto L32;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.AdbPairingService.C02101.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void criarCanal() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Emparelhamento Wi‑Fi", 4);
        notificationChannel.setDescription("Digite o código de pareamento da Depuração sem fio");
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification montarNotificacaoCodigo(String str) {
        vk1 vk1Var = new vk1(new Bundle(), new HashSet());
        PendingIntent service = PendingIntent.getService(this, 1, new Intent(this, (Class<?>) AdbPairingService.class).setAction(ACTION_SUBMIT), 167772160);
        IconCompat iconCompatM306a = IconCompat.m306a(R.drawable.ic_menu_send);
        Bundle bundle = new Bundle();
        CharSequence charSequenceM5742b = r81.m5742b("Enviar");
        ArrayList arrayList = new ArrayList();
        arrayList.add(vk1Var);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vk1 vk1Var2 = (vk1) obj;
            vk1Var2.getClass();
            arrayList3.add(vk1Var2);
        }
        if (!arrayList2.isEmpty()) {
        }
        p81 p81Var = new p81(iconCompatM306a, charSequenceM5742b, service, bundle, arrayList3.isEmpty() ? null : (vk1[]) arrayList3.toArray(new vk1[arrayList3.size()]));
        r81 r81Var = new r81(this, CHANNEL_ID);
        r81Var.f9823o.icon = C0203R.mipmap.ic_launcher;
        r81Var.f9813e = r81.m5742b("SS Pro — código de pareamento");
        r81Var.f9814f = r81.m5742b(str == null ? "Digite o código de 6 dígitos e toque em Enviar" : str);
        qo0 qo0Var = new qo0(9, false);
        qo0Var.f9549c = r81.m5742b((str != null ? str.concat("\n") : "").concat("Em Opções do desenvolvedor → Depuração sem fio → Parear dispositivo com código de pareamento."));
        if (r81Var.f9818j != qo0Var) {
            r81Var.f9818j = qo0Var;
            qo0Var.m5602Z(r81Var);
        }
        r81Var.m5744c(2, true);
        r81Var.f9816h = 1;
        r81Var.f9810b.add(p81Var);
        Notification notificationM5743a = r81Var.m5743a();
        notificationM5743a.getClass();
        return notificationM5743a;
    }

    public static /* synthetic */ Notification montarNotificacaoCodigo$default(AdbPairingService adbPairingService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return adbPairingService.montarNotificacaoCodigo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Notification montarNotificacaoStatus(String str) {
        r81 r81Var = new r81(this, CHANNEL_ID);
        r81Var.f9823o.icon = C0203R.mipmap.ic_launcher;
        r81Var.f9813e = r81.m5742b("SS Pro — Depuração Wi‑Fi");
        r81Var.f9814f = r81.m5742b(str);
        r81Var.m5744c(2, false);
        r81Var.m5744c(16, true);
        Notification notificationM5743a = r81Var.m5743a();
        notificationM5743a.getClass();
        return notificationM5743a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        CharSequence charSequence;
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 2;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == -994878387) {
            if (!action.equals(ACTION_SHOW)) {
                return 2;
            }
            criarCanal();
            Notification notificationMontarNotificacaoCodigo$default = montarNotificacaoCodigo$default(this, null, 1, null);
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(NOTIF_ID, notificationMontarNotificacaoCodigo$default, 1073741824);
                return 2;
            }
            startForeground(NOTIF_ID, notificationMontarNotificacaoCodigo$default);
            return 2;
        }
        if (iHashCode == -994866862) {
            if (!action.equals(ACTION_STOP)) {
                return 2;
            }
            stopForeground(1);
            stopSelf();
            return 2;
        }
        if (iHashCode != 1711188328 || !action.equals(ACTION_SUBMIT)) {
            return 2;
        }
        Bundle bundleM6108b = sk1.m6108b(intent);
        String string = (bundleM6108b == null || (charSequence = bundleM6108b.getCharSequence(KEY_CODIGO)) == null) ? null : charSequence.toString();
        if (string == null) {
            string = "";
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C02101(string, null), 3, null);
        return 2;
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final void mostrar(Context context) {
            context.getClass();
            Intent action = new Intent(context, (Class<?>) AdbPairingService.class).setAction(AdbPairingService.ACTION_SHOW);
            action.getClass();
            context.startForegroundService(action);
        }

        public final void parar(Context context) {
            context.getClass();
            context.startService(new Intent(context, (Class<?>) AdbPairingService.class).setAction(AdbPairingService.ACTION_STOP));
        }

        private Companion() {
        }
    }
}
