package com.example.ssmousepro;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.Jogo;
import com.example.ssmousepro.MainActivity;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.account.BalanceChangeNotifier;
import com.example.ssmousepro.account.PlayTimeSessionManager;
import com.example.ssmousepro.account.TimeBalanceFormatter;
import com.example.ssmousepro.account.UserAccount;
import com.example.ssmousepro.activation.ActivationModePrefs;
import com.example.ssmousepro.activation.ModoAtivacao;
import com.example.ssmousepro.activation.PrivilegeGate;
import com.example.ssmousepro.activation.WirelessActivationActivity;
import com.example.ssmousepro.ads.RewardedVideoCoordinator;
import com.example.ssmousepro.billing.BillingManager;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p000.AbstractActivityC1469u6;
import p000.AbstractC1377rp;
import p000.AbstractC1451tp;
import p000.C1133n5;
import p000.C1357r5;
import p000.C1452tq;
import p000.C1636yp;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.bc1;
import p000.ch0;
import p000.f40;
import p000.g50;
import p000.hp0;
import p000.jd0;
import p000.ki0;
import p000.ny1;
import p000.og0;
import p000.pc0;
import p000.rc2;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.vw0;
import p000.x10;
import p000.y90;
import p000.z32;
import p000.zq1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC1469u6 {
    private JogoAdapter adapter;
    private ImageButton btnAdicionarJogo;
    private ImageButton btnConfiguracoes;
    private ImageButton btnRecarregarTempo;
    private CardView cardSaldo;
    private View ledMouse;
    private View ledTeclado;
    private RecyclerView rvMeusJogos;
    private TextView txtSaldoAviso;
    private TextView txtSaldoTempo;
    private final List<Jogo> listaJogosExibidos = new ArrayList();
    private final MainActivity$inputDeviceListener$1 inputDeviceListener = new MainActivity$inputDeviceListener$1(this);

    /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1", m5373f = "MainActivity.kt", m5374l = {248, 259}, m5375m = "invokeSuspend")
    public static final class C01921 extends ny1 implements ch0 {
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$1", m5373f = "MainActivity.kt", m5374l = {}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            int label;
            final /* synthetic */ MainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
                this.this$0 = mainActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(ApplicationInfo applicationInfo) {
                return (applicationInfo.flags & 1) == 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bc1 invokeSuspend$lambda$1(PackageManager packageManager, ApplicationInfo applicationInfo) {
                return new bc1(applicationInfo, applicationInfo.loadLabel(packageManager).toString());
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.this$0, interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                PackageManager packageManager = this.this$0.getPackageManager();
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                installedApplications.getClass();
                int i = 0;
                List listM7334R = zq1.m7334R(new x10(new x10(new y90(new C1636yp(installedApplications, i), true, new C0241f()), new C0242g(packageManager, i), 2), new Comparator() { // from class: com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ki0.m3868n((String) ((bc1) t).f1293b, (String) ((bc1) t2).f1293b);
                    }
                }, 1));
                ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM7334R));
                Iterator it = listM7334R.iterator();
                while (it.hasNext()) {
                    arrayList.add((ApplicationInfo) ((bc1) it.next()).f1292a);
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1451tp.m6307o0(listM7334R));
                Iterator it2 = listM7334R.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((bc1) it2.next()).f1293b);
                }
                return new bc1(arrayList, arrayList2.toArray(new String[0]));
            }
        }

        /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$2", m5373f = "MainActivity.kt", m5374l = {}, m5375m = "invokeSuspend")
        public static final class AnonymousClass2 extends ny1 implements ch0 {
            final /* synthetic */ List<ApplicationInfo> $apps;
            final /* synthetic */ String[] $nomesApps;
            int label;
            final /* synthetic */ MainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(MainActivity mainActivity, String[] strArr, List<? extends ApplicationInfo> list, InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
                this.this$0 = mainActivity;
                this.$nomesApps = strArr;
                this.$apps = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(List list, MainActivity mainActivity, DialogInterface dialogInterface, int i) {
                String str = ((ApplicationInfo) list.get(i)).packageName;
                str.getClass();
                mainActivity.salvarNovoJogo(str);
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass2(this.this$0, this.$nomesApps, this.$apps, interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass2) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                boolean zIsFinishing = this.this$0.isFinishing();
                z32 z32Var = z32.f13265a;
                if (!zIsFinishing && !this.this$0.isDestroyed()) {
                    C1357r5 title = new C1357r5(this.this$0).setTitle("Escolha um Jogo para Adicionar");
                    String[] strArr = this.$nomesApps;
                    final List<ApplicationInfo> list = this.$apps;
                    final MainActivity mainActivity = this.this$0;
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.example.ssmousepro.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.C01921.AnonymousClass2.invokeSuspend$lambda$0(list, mainActivity, dialogInterface, i);
                        }
                    };
                    C1133n5 c1133n5 = title.f9726a;
                    c1133n5.f7229n = strArr;
                    c1133n5.f7231p = onClickListener;
                    c1133n5.f7224i = "Cancelar";
                    c1133n5.f7225j = null;
                    title.create().show();
                }
                return z32Var;
            }
        }

        public C01921(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return MainActivity.this.new C01921(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01921) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r2, r5, r7) == r4) goto L15;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 2
                r2 = 1
                r3 = 0
                vu r4 = p000.EnumC1530vu.f11768a
                if (r0 == 0) goto L23
                if (r0 == r2) goto L1f
                if (r0 != r1) goto L19
                java.lang.Object r0 = r7.L$1
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.lang.Object r7 = r7.L$0
                java.util.List r7 = (java.util.List) r7
                p000.ua0.m6440Z(r8)
                goto L5c
            L19:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r7)
                return r3
            L1f:
                p000.ua0.m6440Z(r8)
                goto L3a
            L23:
                p000.ua0.m6440Z(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
                com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$1 r0 = new com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$1
                com.example.ssmousepro.MainActivity r5 = com.example.ssmousepro.MainActivity.this
                r0.<init>(r5, r3)
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r0, r7)
                if (r8 != r4) goto L3a
                goto L5b
            L3a:
                bc1 r8 = (p000.bc1) r8
                java.lang.Object r0 = r8.f1292a
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r8 = r8.f1293b
                java.lang.String[] r8 = (java.lang.String[]) r8
                kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
                com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$2 r5 = new com.example.ssmousepro.MainActivity$abrirSeletorDeJogos$1$2
                com.example.ssmousepro.MainActivity r6 = com.example.ssmousepro.MainActivity.this
                r5.<init>(r6, r8, r0, r3)
                r7.L$0 = r3
                r7.L$1 = r3
                r7.label = r1
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r2, r5, r7)
                if (r7 != r4) goto L5c
            L5b:
                return r4
            L5c:
                z32 r7 = p000.z32.f13265a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.MainActivity.C01921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$atualizarSaldoRemoto$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$atualizarSaldoRemoto$1", m5373f = "MainActivity.kt", m5374l = {204}, m5375m = "invokeSuspend")
    public static final class C01941 extends ny1 implements ch0 {
        int label;

        public C01941(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return MainActivity.this.new C01941(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01941) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            Object objM7418refreshBalanceIoAF18A;
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                AccountRepository accountRepository = AccountRepository.INSTANCE;
                this.label = 1;
                objM7418refreshBalanceIoAF18A = accountRepository.m7418refreshBalanceIoAF18A(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objM7418refreshBalanceIoAF18A == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                objM7418refreshBalanceIoAF18A = ((ul1) obj).f11356a;
            }
            MainActivity mainActivity = MainActivity.this;
            if (!(objM7418refreshBalanceIoAF18A instanceof tl1)) {
                mainActivity.atualizarSaldoUi();
            }
            MainActivity mainActivity2 = MainActivity.this;
            if (ul1.m6508b(objM7418refreshBalanceIoAF18A) != null) {
                mainActivity2.atualizarSaldoUi();
                if (AccountRepository.INSTANCE.getCachedAccount() == null) {
                    TextView textView = mainActivity2.txtSaldoTempo;
                    if (textView == null) {
                        hp0.m3207Q("txtSaldoTempo");
                        throw null;
                    }
                    textView.setText("Erro ao carregar saldo");
                }
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$carregarJogosSalvos$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$carregarJogosSalvos$1", m5373f = "MainActivity.kt", m5374l = {309, 326}, m5375m = "invokeSuspend")
    public static final class C01951 extends ny1 implements ch0 {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$1", m5373f = "MainActivity.kt", m5374l = {}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            final /* synthetic */ List<Jogo> $jogos;
            int label;
            final /* synthetic */ MainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, List<Jogo> list, InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
                this.this$0 = mainActivity;
                this.$jogos = list;
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.this$0, this.$jogos, interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                boolean zIsFinishing = this.this$0.isFinishing();
                z32 z32Var = z32.f13265a;
                if (zIsFinishing || this.this$0.isDestroyed()) {
                    return z32Var;
                }
                this.this$0.listaJogosExibidos.clear();
                this.this$0.listaJogosExibidos.addAll(this.$jogos);
                JogoAdapter jogoAdapter = this.this$0.adapter;
                if (jogoAdapter != null) {
                    jogoAdapter.notifyDataSetChanged();
                    return z32Var;
                }
                hp0.m3207Q("adapter");
                throw null;
            }
        }

        public C01951(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return MainActivity.this.new C01951(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01951) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r0, r2, r6) == r4) goto L15;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                r3 = 0
                vu r4 = p000.EnumC1530vu.f11768a
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1b
                if (r0 != r1) goto L15
                java.lang.Object r6 = r6.L$0
                java.util.List r6 = (java.util.List) r6
                p000.ua0.m6440Z(r7)
                goto L4e
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r6)
                return r3
            L1b:
                p000.ua0.m6440Z(r7)
                goto L36
            L1f:
                p000.ua0.m6440Z(r7)
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
                com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$jogos$1 r0 = new com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$jogos$1
                com.example.ssmousepro.MainActivity r5 = com.example.ssmousepro.MainActivity.this
                r0.<init>(r5, r3)
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r0, r6)
                if (r7 != r4) goto L36
                goto L4d
            L36:
                java.util.List r7 = (java.util.List) r7
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
                com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$1 r2 = new com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$1
                com.example.ssmousepro.MainActivity r5 = com.example.ssmousepro.MainActivity.this
                r2.<init>(r5, r7, r3)
                r6.L$0 = r3
                r6.label = r1
                java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r0, r2, r6)
                if (r6 != r4) goto L4e
            L4d:
                return r4
            L4e:
                z32 r6 = p000.z32.f13265a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.MainActivity.C01951.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.MainActivity$onResume$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$onResume$2", m5373f = "MainActivity.kt", m5374l = {185}, m5375m = "invokeSuspend")
    public static final class C01962 extends ny1 implements ch0 {
        int label;

        public C01962(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return MainActivity.this.new C01962(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01962) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                PlayTimeSessionManager playTimeSessionManager = PlayTimeSessionManager.INSTANCE;
                this.label = 1;
                Object objSincronizarPendenteSeHouver = playTimeSessionManager.sincronizarPendenteSeHouver(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objSincronizarPendenteSeHouver == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
            }
            boolean zIsRunning = FloatingService.Companion.isRunning();
            MainActivity mainActivity = MainActivity.this;
            if (zIsRunning) {
                mainActivity.atualizarSaldoUi();
            } else {
                mainActivity.atualizarSaldoRemoto();
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirSeletorDeJogos() {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01921(null), 3, null);
    }

    public static final /* synthetic */ void access$atualizarLedsPerifericos(MainActivity mainActivity) {
        mainActivity.atualizarLedsPerifericos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarLedsPerifericos() {
        View view = this.ledMouse;
        if (view == null) {
            hp0.m3207Q("ledMouse");
            throw null;
        }
        PeripheralStatusDetector peripheralStatusDetector = PeripheralStatusDetector.INSTANCE;
        view.setBackgroundResource(peripheralStatusDetector.temMouse(this) ? C0203R.drawable.led_ativo : C0203R.drawable.led_inativo);
        View view2 = this.ledTeclado;
        if (view2 != null) {
            view2.setBackgroundResource(peripheralStatusDetector.temTeclado(this) ? C0203R.drawable.led_ativo : C0203R.drawable.led_inativo);
        } else {
            hp0.m3207Q("ledTeclado");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarSaldoRemoto() {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01941(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarSaldoUi() {
        UserAccount cachedAccount = AccountRepository.INSTANCE.getCachedAccount();
        if (cachedAccount == null) {
            TextView textView = this.txtSaldoTempo;
            if (textView == null) {
                hp0.m3207Q("txtSaldoTempo");
                throw null;
            }
            textView.setText("Carregando…");
            TextView textView2 = this.txtSaldoAviso;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                hp0.m3207Q("txtSaldoAviso");
                throw null;
            }
        }
        TimeBalanceFormatter timeBalanceFormatter = TimeBalanceFormatter.INSTANCE;
        boolean zEstaAtivo$default = TimeBalanceFormatter.estaAtivo$default(timeBalanceFormatter, cachedAccount.getAccessExpiresAt(), 0L, 2, null);
        TextView textView3 = this.txtSaldoTempo;
        if (textView3 == null) {
            hp0.m3207Q("txtSaldoTempo");
            throw null;
        }
        textView3.setText(TimeBalanceFormatter.formatVencimento$default(timeBalanceFormatter, cachedAccount.getAccessExpiresAt(), 0L, 2, null));
        CardView cardView = this.cardSaldo;
        if (zEstaAtivo$default) {
            if (cardView == null) {
                hp0.m3207Q("cardSaldo");
                throw null;
            }
            cardView.setCardBackgroundColor(Color.parseColor("#E8EAF6"));
            TextView textView4 = this.txtSaldoTempo;
            if (textView4 == null) {
                hp0.m3207Q("txtSaldoTempo");
                throw null;
            }
            textView4.setTextColor(Color.parseColor("#1A237E"));
            TextView textView5 = this.txtSaldoAviso;
            if (textView5 == null) {
                hp0.m3207Q("txtSaldoAviso");
                throw null;
            }
            textView5.setText(TimeBalanceFormatter.formatRestante$default(timeBalanceFormatter, cachedAccount.getAccessExpiresAt(), 0L, 2, null));
            TextView textView6 = this.txtSaldoAviso;
            if (textView6 != null) {
                textView6.setVisibility(0);
                return;
            } else {
                hp0.m3207Q("txtSaldoAviso");
                throw null;
            }
        }
        if (cardView == null) {
            hp0.m3207Q("cardSaldo");
            throw null;
        }
        cardView.setCardBackgroundColor(Color.parseColor("#FFEBEE"));
        TextView textView7 = this.txtSaldoTempo;
        if (textView7 == null) {
            hp0.m3207Q("txtSaldoTempo");
            throw null;
        }
        textView7.setTextColor(Color.parseColor("#C62828"));
        TextView textView8 = this.txtSaldoAviso;
        if (textView8 == null) {
            hp0.m3207Q("txtSaldoAviso");
            throw null;
        }
        textView8.setText(TimeBalanceFormatter.formatRestante$default(timeBalanceFormatter, cachedAccount.getAccessExpiresAt(), 0L, 2, null));
        TextView textView9 = this.txtSaldoAviso;
        if (textView9 != null) {
            textView9.setVisibility(0);
        } else {
            hp0.m3207Q("txtSaldoAviso");
            throw null;
        }
    }

    private final void carregarJogosSalvos() {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01951(null), 3, null);
    }

    private final void confirmarExclusaoJogo(Jogo jogo) {
        C1357r5 title = new C1357r5(this).setTitle("Excluir jogo");
        String strM3615m = jd0.m3615m("Remover \"", jogo.getNome(), "\" da lista?");
        C1133n5 c1133n5 = title.f9726a;
        c1133n5.f7221f = strM3615m;
        pc0 pc0Var = new pc0(this, jogo, 1);
        c1133n5.f7222g = "Excluir";
        c1133n5.f7223h = pc0Var;
        c1133n5.f7224i = "Cancelar";
        c1133n5.f7225j = null;
        title.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmarExclusaoJogo$lambda$8(MainActivity mainActivity, Jogo jogo, DialogInterface dialogInterface, int i) {
        mainActivity.excluirJogo(jogo.getPacote());
    }

    private final void excluirJogo(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(AtalhosPrefs.PREFS_NAME, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("jogos_mapeados", new LinkedHashSet());
        Set<String> setM5868C0 = stringSet != null ? AbstractC1377rp.m5868C0(stringSet) : new LinkedHashSet<>();
        if (setM5868C0.remove(str)) {
            sharedPreferences.edit().putStringSet("jogos_mapeados", setM5868C0).apply();
            carregarJogosSalvos();
            Toast.makeText(this, "Jogo removido!", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MainActivity mainActivity, View view) {
        new PlansBottomSheet(mainActivity).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onCreate$lambda$2(MainActivity mainActivity, Jogo jogo) {
        jogo.getClass();
        boolean zHasPlayableBalance = AccountRepository.INSTANCE.hasPlayableBalance();
        z32 z32Var = z32.f13265a;
        if (!zHasPlayableBalance) {
            Toast.makeText(mainActivity, "Sem tempo disponível. Recarregue para jogar.", 1).show();
            new PlansBottomSheet(mainActivity).show();
            return z32Var;
        }
        if (!Settings.canDrawOverlays(mainActivity)) {
            Toast.makeText(mainActivity, "Autorize a sobreposição de tela em Configurações (engrenagem).", 1).show();
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PreferencesActivity.class));
            return z32Var;
        }
        PrivilegeGate privilegeGate = PrivilegeGate.INSTANCE;
        if (!privilegeGate.estaProntoParaInjecao(mainActivity)) {
            Toast.makeText(mainActivity, privilegeGate.mensagemBloqueioMapeador(mainActivity), 1).show();
            if (ActivationModePrefs.INSTANCE.modo(mainActivity) == ModoAtivacao.WIFI) {
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) WirelessActivationActivity.class));
            } else {
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PreferencesActivity.class));
            }
            return z32Var;
        }
        Toast.makeText(mainActivity, "Abrindo o mapeador para: " + jogo.getNome(), 0).show();
        Intent intent = new Intent(mainActivity, (Class<?>) FloatingService.class);
        intent.putExtra("PACOTE_ALVO", jogo.getPacote());
        mainActivity.startService(intent);
        Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage(jogo.getPacote());
        if (launchIntentForPackage != null) {
            mainActivity.startActivity(launchIntentForPackage);
        } else {
            Toast.makeText(mainActivity, "Erro: Não conseguimos iniciar este jogo.", 0).show();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onCreate$lambda$3(MainActivity mainActivity, Jogo jogo) {
        jogo.getClass();
        mainActivity.confirmarExclusaoJogo(jogo);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(MainActivity mainActivity, View view) {
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PreferencesActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onResume$lambda$7(MainActivity mainActivity) {
        mainActivity.runOnUiThread(new vw0(mainActivity, 0));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void salvarNovoJogo(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(AtalhosPrefs.PREFS_NAME, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("jogos_mapeados", new LinkedHashSet());
        Set<String> setM5868C0 = stringSet != null ? AbstractC1377rp.m5868C0(stringSet) : new LinkedHashSet<>();
        if (!setM5868C0.add(str)) {
            Toast.makeText(this, "Esse jogo já está na lista!", 0).show();
            return;
        }
        sharedPreferences.edit().putStringSet("jogos_mapeados", setM5868C0).apply();
        carregarJogosSalvos();
        Toast.makeText(this, "Jogo adicionado!", 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        g50.m2937a(this);
        super.onCreate(bundle);
        if (!AccountRepository.INSTANCE.isLoggedIn()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            finish();
            return;
        }
        setContentView(C0203R.layout.activity_main);
        RewardedVideoCoordinator.INSTANCE.register(this);
        UiEdgeToEdgeKt.aplicarPaddingSistema(this);
        View viewFindViewById = findViewById(C0203R.id.btnConfiguracoes);
        viewFindViewById.getClass();
        this.btnConfiguracoes = (ImageButton) viewFindViewById;
        View viewFindViewById2 = findViewById(C0203R.id.btnAdicionarJogo);
        viewFindViewById2.getClass();
        this.btnAdicionarJogo = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(C0203R.id.btnRecarregarTempo);
        viewFindViewById3.getClass();
        this.btnRecarregarTempo = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(C0203R.id.rvMeusJogos);
        viewFindViewById4.getClass();
        this.rvMeusJogos = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C0203R.id.ledMouse);
        viewFindViewById5.getClass();
        this.ledMouse = viewFindViewById5;
        View viewFindViewById6 = findViewById(C0203R.id.ledTeclado);
        viewFindViewById6.getClass();
        this.ledTeclado = viewFindViewById6;
        View viewFindViewById7 = findViewById(C0203R.id.cardSaldo);
        viewFindViewById7.getClass();
        this.cardSaldo = (CardView) viewFindViewById7;
        View viewFindViewById8 = findViewById(C0203R.id.txtSaldoTempo);
        viewFindViewById8.getClass();
        this.txtSaldoTempo = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(C0203R.id.txtSaldoAviso);
        viewFindViewById9.getClass();
        this.txtSaldoAviso = (TextView) viewFindViewById9;
        ImageButton imageButton = this.btnRecarregarTempo;
        if (imageButton == null) {
            hp0.m3207Q("btnRecarregarTempo");
            throw null;
        }
        final int i = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: tw0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f11028b;

            {
                this.f11028b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                MainActivity mainActivity = this.f11028b;
                switch (i2) {
                    case 0:
                        MainActivity.onCreate$lambda$0(mainActivity, view);
                        break;
                    case 1:
                        MainActivity.onCreate$lambda$4(mainActivity, view);
                        break;
                    default:
                        mainActivity.abrirSeletorDeJogos();
                        break;
                }
            }
        });
        RecyclerView recyclerView = this.rvMeusJogos;
        if (recyclerView == null) {
            hp0.m3207Q("rvMeusJogos");
            throw null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager());
        final int i2 = 1;
        JogoAdapter jogoAdapter = new JogoAdapter(this.listaJogosExibidos, new og0(this) { // from class: uw0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f11441b;

            {
                this.f11441b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i3 = i;
                MainActivity mainActivity = this.f11441b;
                Jogo jogo = (Jogo) obj;
                switch (i3) {
                    case 0:
                        return MainActivity.onCreate$lambda$2(mainActivity, jogo);
                    default:
                        return MainActivity.onCreate$lambda$3(mainActivity, jogo);
                }
            }
        }, new og0(this) { // from class: uw0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f11441b;

            {
                this.f11441b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i3 = i2;
                MainActivity mainActivity = this.f11441b;
                Jogo jogo = (Jogo) obj;
                switch (i3) {
                    case 0:
                        return MainActivity.onCreate$lambda$2(mainActivity, jogo);
                    default:
                        return MainActivity.onCreate$lambda$3(mainActivity, jogo);
                }
            }
        });
        this.adapter = jogoAdapter;
        RecyclerView recyclerView2 = this.rvMeusJogos;
        if (recyclerView2 == null) {
            hp0.m3207Q("rvMeusJogos");
            throw null;
        }
        recyclerView2.setAdapter(jogoAdapter);
        ImageButton imageButton2 = this.btnConfiguracoes;
        if (imageButton2 == null) {
            hp0.m3207Q("btnConfiguracoes");
            throw null;
        }
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: tw0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f11028b;

            {
                this.f11028b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                MainActivity mainActivity = this.f11028b;
                switch (i3) {
                    case 0:
                        MainActivity.onCreate$lambda$0(mainActivity, view);
                        break;
                    case 1:
                        MainActivity.onCreate$lambda$4(mainActivity, view);
                        break;
                    default:
                        mainActivity.abrirSeletorDeJogos();
                        break;
                }
            }
        });
        ImageButton imageButton3 = this.btnAdicionarJogo;
        if (imageButton3 == null) {
            hp0.m3207Q("btnAdicionarJogo");
            throw null;
        }
        final int i3 = 2;
        imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: tw0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f11028b;

            {
                this.f11028b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                MainActivity mainActivity = this.f11028b;
                switch (i4) {
                    case 0:
                        MainActivity.onCreate$lambda$0(mainActivity, view);
                        break;
                    case 1:
                        MainActivity.onCreate$lambda$4(mainActivity, view);
                        break;
                    default:
                        mainActivity.abrirSeletorDeJogos();
                        break;
                }
            }
        });
        carregarJogosSalvos();
        atualizarSaldoUi();
        try {
            BillingManager.INSTANCE.init(this);
        } catch (Exception e) {
            Log.e("MainActivity", "Billing indisponível no boot", e);
        }
        Object systemService = getSystemService("input");
        systemService.getClass();
        ((InputManager) systemService).registerInputDeviceListener(this.inputDeviceListener, null);
        atualizarLedsPerifericos();
    }

    @Override // p000.AbstractActivityC1469u6, androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onDestroy() {
        Object systemService = getSystemService("input");
        systemService.getClass();
        ((InputManager) systemService).unregisterInputDeviceListener(this.inputDeviceListener);
        if (isFinishing()) {
            stopService(new Intent(this, (Class<?>) FloatingService.class));
            BillingManager.INSTANCE.encerrar();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onPause() {
        BalanceChangeNotifier.INSTANCE.setListener(null);
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onResume() {
        super.onResume();
        atualizarLedsPerifericos();
        BalanceChangeNotifier.INSTANCE.setListener(new C1452tq(this, 1));
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01962(null), 3, null);
        if (PrivilegeGate.INSTANCE.estaProntoParaInjecao(this)) {
            InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
            String packageName = getPackageName();
            packageName.getClass();
            injectionDaemonManager.vincularDaemon(packageName);
        }
    }
}
