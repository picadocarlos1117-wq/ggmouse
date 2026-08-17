package com.example.ssmousepro;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ssmousepro.account.AccountConstants;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.account.EmailAddress;
import com.example.ssmousepro.account.GoogleAuthService;
import com.example.ssmousepro.account.RegistrationService;
import com.example.ssmousepro.account.TimeBalanceFormatter;
import com.example.ssmousepro.account.UserAccount;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.functions.FirebaseFunctionsException;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.tasks.TasksKt;
import p000.AbstractActivityC1469u6;
import p000.AbstractC1095m4;
import p000.AbstractC1337qm;
import p000.AbstractC1571wy;
import p000.C0694gy;
import p000.C0738i4;
import p000.C1058l4;
import p000.C1521vl;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.g50;
import p000.hp0;
import p000.jd0;
import p000.ny1;
import p000.rc2;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.xv0;
import p000.y60;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class LoginActivity extends AbstractActivityC1469u6 {

    @Deprecated
    public static final long AUTH_TIMEOUT_MS = 30000;
    private static final Companion Companion = new Companion(null);
    private MaterialButton btnAbaCadastrar;
    private MaterialButton btnAbaEntrar;
    private MaterialButton btnAcaoPrincipal;
    private MaterialButton btnEnviarCodigo;
    private MaterialButton btnGoogle;
    private boolean codigoEnviado;
    private TextInputEditText edtCodigo;
    private TextInputEditText edtConfirmarSenha;
    private TextInputEditText edtEmail;
    private TextInputEditText edtSenha;
    private final AbstractC1095m4 googleLauncher;
    private LinearLayout layoutCodigo;
    private TextInputLayout layoutConfirmarSenha;
    private Modo modo = Modo.ENTRAR;
    private ProgressBar progressLogin;
    private TextView txtCodigoAviso;
    private TextView txtLoginErro;
    private TextView txtLoginStatus;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Modo {
        ENTRAR,
        CADASTRAR;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Modo.values().length];
            try {
                iArr[Modo.ENTRAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Modo.CADASTRAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FirebaseFunctionsException.Code.values().length];
            try {
                iArr2[FirebaseFunctionsException.Code.ALREADY_EXISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.DEADLINE_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.PERMISSION_DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.FAILED_PRECONDITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FirebaseFunctionsException.Code.INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$autenticarEmailSenha$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$autenticarEmailSenha$2", m5373f = "LoginActivity.kt", m5374l = {LinuxInputConstants.BTN_TOUCH}, m5375m = "invokeSuspend")
    public static final class C01862 extends ny1 implements ch0 {
        final /* synthetic */ FirebaseAuth $auth;
        final /* synthetic */ String $email;
        final /* synthetic */ String $senha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01862(FirebaseAuth firebaseAuth, String str, String str2, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$auth = firebaseAuth;
            this.$email = str;
            this.$senha = str2;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C01862(this.$auth, this.$email, this.$senha, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01862) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ua0.m6440Z(obj);
                    return obj;
                }
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            Task<AuthResult> taskSignInWithEmailAndPassword = this.$auth.signInWithEmailAndPassword(this.$email, this.$senha);
            taskSignInWithEmailAndPassword.getClass();
            this.label = 1;
            Object objAwait = TasksKt.await(taskSignInWithEmailAndPassword, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            return objAwait == enumC1530vu ? enumC1530vu : objAwait;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$cadastrar$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$cadastrar$1", m5373f = "LoginActivity.kt", m5374l = {282, 285, 296}, m5375m = "invokeSuspend")
    public static final class C01871 extends ny1 implements ch0 {
        final /* synthetic */ String $codigo;
        final /* synthetic */ String $email;
        final /* synthetic */ String $senha;
        long J$0;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$cadastrar$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$cadastrar$1$1", m5373f = "LoginActivity.kt", m5374l = {283}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            final /* synthetic */ String $codigo;
            final /* synthetic */ String $email;
            final /* synthetic */ String $senha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, String str3, InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
                this.$email = str;
                this.$codigo = str2;
                this.$senha = str3;
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.$email, this.$codigo, this.$senha, interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RegistrationService registrationService = RegistrationService.INSTANCE;
                    String str = this.$email;
                    String str2 = this.$codigo;
                    String str3 = this.$senha;
                    this.label = 1;
                    Object objConcluirCadastro = registrationService.concluirCadastro(str, str2, str3, this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objConcluirCadastro == enumC1530vu) {
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

        /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$cadastrar$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$cadastrar$1$2", m5373f = "LoginActivity.kt", m5374l = {297}, m5375m = "invokeSuspend")
        public static final class AnonymousClass2 extends ny1 implements ch0 {
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            public AnonymousClass2(InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC0579du);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass2) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                Object tl1Var;
                Object objM7417carregarPerfilIoAF18A;
                int i = this.label;
                try {
                    if (i == 0) {
                        ua0.m6440Z(obj);
                        AccountRepository accountRepository = AccountRepository.INSTANCE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = 0;
                        this.label = 1;
                        objM7417carregarPerfilIoAF18A = accountRepository.m7417carregarPerfilIoAF18A(this);
                        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                        if (objM7417carregarPerfilIoAF18A == enumC1530vu) {
                            return enumC1530vu;
                        }
                    } else {
                        if (i != 1) {
                            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ua0.m6440Z(obj);
                        objM7417carregarPerfilIoAF18A = ((ul1) obj).f11356a;
                    }
                    tl1Var = new ul1(objM7417carregarPerfilIoAF18A);
                } catch (Throwable th) {
                    tl1Var = new tl1(th);
                }
                return new ul1(tl1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01871(String str, String str2, String str3, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$email = str;
            this.$senha = str2;
            this.$codigo = str3;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return LoginActivity.this.new C01871(this.$email, this.$senha, this.$codigo, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01871) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009e  */
        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            long jCurrentTimeMillis;
            CoroutineDispatcher io2;
            AnonymousClass2 anonymousClass2;
            long j;
            int i = this.label;
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    LoginActivity.this.bloquearUi("Criando conta…");
                    CoroutineDispatcher io3 = Dispatchers.getIO();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$email, this.$codigo, this.$senha, null);
                    this.label = 1;
                    if (BuildersKt.withContext(io3, anonymousClass1, this) == enumC1530vu) {
                    }
                    return enumC1530vu;
                }
                if (i == 1) {
                    ua0.m6440Z(obj);
                } else {
                    if (i == 2) {
                        ua0.m6440Z(obj);
                        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                        currentUser.getClass();
                        String uid = currentUser.getUid();
                        uid.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis() + AccountConstants.TRIAL_DURATION_MS;
                        AccountRepository.INSTANCE.aplicarContaLocal(new UserAccount(uid, this.$email, jCurrentTimeMillis, true));
                        io2 = Dispatchers.getIO();
                        anonymousClass2 = new AnonymousClass2(null);
                        this.L$0 = null;
                        this.J$0 = jCurrentTimeMillis;
                        this.label = 3;
                        if (BuildersKt.withContext(io2, anonymousClass2, this) != enumC1530vu) {
                            j = jCurrentTimeMillis;
                        }
                        return enumC1530vu;
                    }
                    if (i != 3) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.J$0;
                    ua0.m6440Z(obj);
                }
                Toast.makeText(LoginActivity.this, "Bem-vindo! " + TimeBalanceFormatter.INSTANCE.formatCredito(j), 1).show();
                LoginActivity.this.irParaMain();
                return z32.f13265a;
                LoginActivity loginActivity = LoginActivity.this;
                String str = this.$email;
                String str2 = this.$senha;
                this.label = 2;
                if (loginActivity.autenticarEmailSenha(str, str2, this) != enumC1530vu) {
                    FirebaseUser currentUser2 = FirebaseAuth.getInstance().getCurrentUser();
                    currentUser2.getClass();
                    String uid2 = currentUser2.getUid();
                    uid2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis() + AccountConstants.TRIAL_DURATION_MS;
                    AccountRepository.INSTANCE.aplicarContaLocal(new UserAccount(uid2, this.$email, jCurrentTimeMillis, true));
                    io2 = Dispatchers.getIO();
                    anonymousClass2 = new AnonymousClass2(null);
                    this.L$0 = null;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 3;
                    if (BuildersKt.withContext(io2, anonymousClass2, this) != enumC1530vu) {
                        j = jCurrentTimeMillis;
                        Toast.makeText(LoginActivity.this, "Bem-vindo! " + TimeBalanceFormatter.INSTANCE.formatCredito(j), 1).show();
                        LoginActivity.this.irParaMain();
                        return z32.f13265a;
                    }
                }
                return enumC1530vu;
            } catch (Exception e) {
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.mostrarErro(loginActivity2.tratarErroFunctions(e));
                LoginActivity.this.liberarUi();
            }
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$entrar$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$entrar$1", m5373f = "LoginActivity.kt", m5374l = {245, 247}, m5375m = "invokeSuspend")
    public static final class C01881 extends ny1 implements ch0 {
        final /* synthetic */ String $email;
        final /* synthetic */ String $senha;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$entrar$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$entrar$1$1", m5373f = "LoginActivity.kt", m5374l = {248}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            public AnonymousClass1(InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC0579du);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                Object tl1Var;
                Object objM7417carregarPerfilIoAF18A;
                int i = this.label;
                try {
                    if (i == 0) {
                        ua0.m6440Z(obj);
                        AccountRepository accountRepository = AccountRepository.INSTANCE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = 0;
                        this.label = 1;
                        objM7417carregarPerfilIoAF18A = accountRepository.m7417carregarPerfilIoAF18A(this);
                        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                        if (objM7417carregarPerfilIoAF18A == enumC1530vu) {
                            return enumC1530vu;
                        }
                    } else {
                        if (i != 1) {
                            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ua0.m6440Z(obj);
                        objM7417carregarPerfilIoAF18A = ((ul1) obj).f11356a;
                    }
                    tl1Var = new ul1(objM7417carregarPerfilIoAF18A);
                } catch (Throwable th) {
                    tl1Var = new tl1(th);
                }
                return new ul1(tl1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01881(String str, String str2, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$email = str;
            this.$senha = str2;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return LoginActivity.this.new C01881(this.$email, this.$senha, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01881) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r0, r6) == r4) goto L22;
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
                r1 = 0
                r2 = 2
                r3 = 1
                vu r4 = p000.EnumC1530vu.f11768a
                if (r0 == 0) goto L1d
                if (r0 == r3) goto L19
                if (r0 != r2) goto L13
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L11
                goto L55
            L11:
                r7 = move-exception
                goto L6d
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p000.f40.m2719o(r6)
                return r1
            L19:
                p000.ua0.m6440Z(r7)     // Catch: java.lang.Exception -> L11
                goto L36
            L1d:
                p000.ua0.m6440Z(r7)
                com.example.ssmousepro.LoginActivity r7 = com.example.ssmousepro.LoginActivity.this
                java.lang.String r0 = "Autenticando…"
                com.example.ssmousepro.LoginActivity.access$bloquearUi(r7, r0)
                com.example.ssmousepro.LoginActivity r7 = com.example.ssmousepro.LoginActivity.this     // Catch: java.lang.Exception -> L11
                java.lang.String r0 = r6.$email     // Catch: java.lang.Exception -> L11
                java.lang.String r5 = r6.$senha     // Catch: java.lang.Exception -> L11
                r6.label = r3     // Catch: java.lang.Exception -> L11
                java.lang.Object r7 = com.example.ssmousepro.LoginActivity.access$autenticarEmailSenha(r7, r0, r5, r6)     // Catch: java.lang.Exception -> L11
                if (r7 != r4) goto L36
                goto L54
            L36:
                com.example.ssmousepro.LoginActivity r7 = com.example.ssmousepro.LoginActivity.this     // Catch: java.lang.Exception -> L11
                android.widget.TextView r7 = com.example.ssmousepro.LoginActivity.access$getTxtLoginStatus$p(r7)     // Catch: java.lang.Exception -> L11
                if (r7 == 0) goto L67
                java.lang.String r0 = "Carregando saldo…"
                r7.setText(r0)     // Catch: java.lang.Exception -> L11
                kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L11
                com.example.ssmousepro.LoginActivity$entrar$1$1 r0 = new com.example.ssmousepro.LoginActivity$entrar$1$1     // Catch: java.lang.Exception -> L11
                r0.<init>(r1)     // Catch: java.lang.Exception -> L11
                r6.label = r2     // Catch: java.lang.Exception -> L11
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r0, r6)     // Catch: java.lang.Exception -> L11
                if (r7 != r4) goto L55
            L54:
                return r4
            L55:
                com.example.ssmousepro.LoginActivity r7 = com.example.ssmousepro.LoginActivity.this     // Catch: java.lang.Exception -> L11
                java.lang.String r0 = "Bem-vindo de volta!"
                r1 = 0
                android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)     // Catch: java.lang.Exception -> L11
                r7.show()     // Catch: java.lang.Exception -> L11
                com.example.ssmousepro.LoginActivity r7 = com.example.ssmousepro.LoginActivity.this     // Catch: java.lang.Exception -> L11
                com.example.ssmousepro.LoginActivity.access$irParaMain(r7)     // Catch: java.lang.Exception -> L11
                goto L7b
            L67:
                java.lang.String r7 = "txtLoginStatus"
                p000.hp0.m3207Q(r7)     // Catch: java.lang.Exception -> L11
                throw r1     // Catch: java.lang.Exception -> L11
            L6d:
                com.example.ssmousepro.LoginActivity r0 = com.example.ssmousepro.LoginActivity.this
                java.lang.String r7 = com.example.ssmousepro.LoginActivity.access$tratarErroAuth(r0, r7)
                com.example.ssmousepro.LoginActivity.access$mostrarErro(r0, r7)
                com.example.ssmousepro.LoginActivity r6 = com.example.ssmousepro.LoginActivity.this
                com.example.ssmousepro.LoginActivity.access$liberarUi(r6)
            L7b:
                z32 r6 = p000.z32.f13265a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.LoginActivity.C01881.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$enviarCodigo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$enviarCodigo$1", m5373f = "LoginActivity.kt", m5374l = {214}, m5375m = "invokeSuspend")
    public static final class C01891 extends ny1 implements ch0 {
        final /* synthetic */ String $email;
        int I$0;
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$enviarCodigo$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$enviarCodigo$1$1", m5373f = "LoginActivity.kt", m5374l = {215}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            final /* synthetic */ String $email;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
                this.$email = str;
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.$email, interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RegistrationService registrationService = RegistrationService.INSTANCE;
                    String str = this.$email;
                    this.label = 1;
                    Object objEnviarCodigo = registrationService.enviarCodigo(str, this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objEnviarCodigo == enumC1530vu) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01891(String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$email = str;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return LoginActivity.this.new C01891(this.$email, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01891) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0064  */
        /* JADX WARN: Code duplicated, block: B:32:0x006e  */
        /* JADX WARN: Code duplicated, block: B:34:0x008e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0092  */
        /* JADX WARN: Code duplicated, block: B:37:0x0096  */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x006e, please report this as an issue */
        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i;
            TextView textView;
            TextView textView2;
            int i2 = this.label;
            int i3 = 1;
            try {
                if (i2 == 0) {
                    ua0.m6440Z(obj);
                    LoginActivity.this.bloquearUi("Enviando código por e-mail…");
                    try {
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$email, null);
                        this.I$0 = 0;
                        this.label = 1;
                        Object objWithContext = BuildersKt.withContext(io2, anonymousClass1, this);
                        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                        if (objWithContext == enumC1530vu) {
                            return enumC1530vu;
                        }
                        i = 0;
                    } catch (Exception e) {
                        e = e;
                        i3 = 0;
                        LoginActivity loginActivity = LoginActivity.this;
                        loginActivity.mostrarErro(loginActivity.tratarErroFunctions(e));
                        LoginActivity.this.liberarUi();
                        if (i3 != 0) {
                            textView = LoginActivity.this.txtLoginStatus;
                            if (textView == null) {
                                hp0.m3207Q("txtLoginStatus");
                                throw null;
                            }
                            textView.setText("Código enviado para " + this.$email + ".\nVerifique entrada, Spam e Promoções (1–3 min).");
                            textView2 = LoginActivity.this.txtLoginStatus;
                            if (textView2 == null) {
                                hp0.m3207Q("txtLoginStatus");
                                throw null;
                            }
                            textView2.setVisibility(0);
                        }
                        return z32.f13265a;
                    }
                } else {
                    if (i2 != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    try {
                        ua0.m6440Z(obj);
                    } catch (Exception e2) {
                        e = e2;
                        i3 = i;
                        LoginActivity loginActivity2 = LoginActivity.this;
                        loginActivity2.mostrarErro(loginActivity2.tratarErroFunctions(e));
                        LoginActivity.this.liberarUi();
                        if (i3 != 0) {
                            textView = LoginActivity.this.txtLoginStatus;
                            if (textView == null) {
                                hp0.m3207Q("txtLoginStatus");
                                throw null;
                            }
                            textView.setText("Código enviado para " + this.$email + ".\nVerifique entrada, Spam e Promoções (1–3 min).");
                            textView2 = LoginActivity.this.txtLoginStatus;
                            if (textView2 == null) {
                                hp0.m3207Q("txtLoginStatus");
                                throw null;
                            }
                            textView2.setVisibility(0);
                        }
                        return z32.f13265a;
                    }
                }
                LoginActivity.this.codigoEnviado = true;
                try {
                    Toast.makeText(LoginActivity.this, "Código enviado! Veja também a pasta Spam.", 1).show();
                } catch (Exception e3) {
                    e = e3;
                    LoginActivity loginActivity3 = LoginActivity.this;
                    loginActivity3.mostrarErro(loginActivity3.tratarErroFunctions(e));
                }
                LoginActivity.this.liberarUi();
                if (i3 != 0) {
                    textView = LoginActivity.this.txtLoginStatus;
                    if (textView == null) {
                        hp0.m3207Q("txtLoginStatus");
                        throw null;
                    }
                    textView.setText("Código enviado para " + this.$email + ".\nVerifique entrada, Spam e Promoções (1–3 min).");
                    textView2 = LoginActivity.this.txtLoginStatus;
                    if (textView2 == null) {
                        hp0.m3207Q("txtLoginStatus");
                        throw null;
                    }
                    textView2.setVisibility(0);
                }
                return z32.f13265a;
            } catch (Throwable th) {
                LoginActivity.this.liberarUi();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$onCreate$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$onCreate$1", m5373f = "LoginActivity.kt", m5374l = {122}, m5375m = "invokeSuspend")
    public static final class C01911 extends ny1 implements ch0 {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C01911(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            C01911 c01911 = LoginActivity.this.new C01911(interfaceC0579du);
            c01911.L$0 = obj;
            return c01911;
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01911) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    try {
                        AccountRepository accountRepository = AccountRepository.INSTANCE;
                        if (accountRepository.isLoggedIn()) {
                            UserAccount cachedAccount = accountRepository.getCachedAccount();
                            if (cachedAccount == null || !TimeBalanceFormatter.estaAtivo$default(TimeBalanceFormatter.INSTANCE, cachedAccount.getAccessExpiresAt(), 0L, 2, null)) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.I$0 = 0;
                                this.label = 1;
                                Object objM7417carregarPerfilIoAF18A = accountRepository.m7417carregarPerfilIoAF18A(this);
                                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                                if (objM7417carregarPerfilIoAF18A == enumC1530vu) {
                                    return enumC1530vu;
                                }
                            } else {
                                LoginActivity.this.irParaMain();
                            }
                        }
                    } catch (Exception e) {
                        Log.e("LoginActivity", "Sessão automática falhou — mostrando login", e);
                    }
                    return z32.f13265a;
                }
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                Object obj2 = ((ul1) obj).f11356a;
            } catch (Throwable unused) {
            }
            LoginActivity.this.irParaMain();
            return z32.f13265a;
        }
    }

    public LoginActivity() {
        AbstractC1095m4 abstractC1095m4RegisterForActivityResult = registerForActivityResult(new C1058l4(2), new C1521vl(this, 26));
        abstractC1095m4RegisterForActivityResult.getClass();
        this.googleLauncher = abstractC1095m4RegisterForActivityResult;
    }

    private final String aplicarEmailNormalizado() {
        String string;
        EmailAddress emailAddress = EmailAddress.INSTANCE;
        TextInputEditText textInputEditText = this.edtEmail;
        if (textInputEditText == null) {
            hp0.m3207Q("edtEmail");
            throw null;
        }
        Editable text = textInputEditText.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        EmailAddress.Resultado resultadoNormalizar = emailAddress.normalizar(string);
        if (resultadoNormalizar.getCorrigido() && !zv1.m7371K0(resultadoNormalizar.getEmail())) {
            TextInputEditText textInputEditText2 = this.edtEmail;
            if (textInputEditText2 == null) {
                hp0.m3207Q("edtEmail");
                throw null;
            }
            textInputEditText2.setText(resultadoNormalizar.getEmail());
            TextInputEditText textInputEditText3 = this.edtEmail;
            if (textInputEditText3 == null) {
                hp0.m3207Q("edtEmail");
                throw null;
            }
            textInputEditText3.setSelection(resultadoNormalizar.getEmail().length());
            Toast.makeText(this, jd0.m3616n("Corrigimos o e-mail: ", resultadoNormalizar.getOriginal(), " → ", resultadoNormalizar.getEmail()), 1).show();
        }
        return resultadoNormalizar.getEmail();
    }

    private final void aplicarModo(Modo modo) {
        this.modo = modo;
        this.codigoEnviado = false;
        boolean z = modo == Modo.ENTRAR;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.parseColor("#5C6BC0"));
        colorStateListValueOf.getClass();
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(Color.parseColor("#5C6BC0"));
        colorStateListValueOf2.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.sousasantoslogic.sspro.R.dimen.mtrl_btn_stroke_size);
        if (z) {
            MaterialButton materialButton = this.btnAbaEntrar;
            if (materialButton == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton.setBackgroundTintList(colorStateListValueOf);
            MaterialButton materialButton2 = this.btnAbaEntrar;
            if (materialButton2 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton2.setTextColor(-1);
            MaterialButton materialButton3 = this.btnAbaEntrar;
            if (materialButton3 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton3.setStrokeWidth(0);
            MaterialButton materialButton4 = this.btnAbaCadastrar;
            if (materialButton4 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton4.setBackgroundTintList(ColorStateList.valueOf(0));
            MaterialButton materialButton5 = this.btnAbaCadastrar;
            if (materialButton5 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton5.setTextColor(Color.parseColor("#5C6BC0"));
            MaterialButton materialButton6 = this.btnAbaCadastrar;
            if (materialButton6 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton6.setStrokeColor(colorStateListValueOf2);
            MaterialButton materialButton7 = this.btnAbaCadastrar;
            if (materialButton7 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton7.setStrokeWidth(dimensionPixelSize);
        } else {
            MaterialButton materialButton8 = this.btnAbaCadastrar;
            if (materialButton8 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton8.setBackgroundTintList(colorStateListValueOf);
            MaterialButton materialButton9 = this.btnAbaCadastrar;
            if (materialButton9 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton9.setTextColor(-1);
            MaterialButton materialButton10 = this.btnAbaCadastrar;
            if (materialButton10 == null) {
                hp0.m3207Q("btnAbaCadastrar");
                throw null;
            }
            materialButton10.setStrokeWidth(0);
            MaterialButton materialButton11 = this.btnAbaEntrar;
            if (materialButton11 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton11.setBackgroundTintList(ColorStateList.valueOf(0));
            MaterialButton materialButton12 = this.btnAbaEntrar;
            if (materialButton12 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton12.setTextColor(Color.parseColor("#5C6BC0"));
            MaterialButton materialButton13 = this.btnAbaEntrar;
            if (materialButton13 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton13.setStrokeColor(colorStateListValueOf2);
            MaterialButton materialButton14 = this.btnAbaEntrar;
            if (materialButton14 == null) {
                hp0.m3207Q("btnAbaEntrar");
                throw null;
            }
            materialButton14.setStrokeWidth(dimensionPixelSize);
        }
        LinearLayout linearLayout = this.layoutCodigo;
        if (linearLayout == null) {
            hp0.m3207Q("layoutCodigo");
            throw null;
        }
        linearLayout.setVisibility(z ? 8 : 0);
        TextInputLayout textInputLayout = this.layoutConfirmarSenha;
        if (textInputLayout == null) {
            hp0.m3207Q("layoutConfirmarSenha");
            throw null;
        }
        textInputLayout.setVisibility(z ? 8 : 0);
        TextView textView = this.txtCodigoAviso;
        if (textView == null) {
            hp0.m3207Q("txtCodigoAviso");
            throw null;
        }
        textView.setVisibility(z ? 8 : 0);
        MaterialButton materialButton15 = this.btnAcaoPrincipal;
        if (materialButton15 == null) {
            hp0.m3207Q("btnAcaoPrincipal");
            throw null;
        }
        materialButton15.setText(z ? "Entrar" : "Cadastrar e entrar");
        TextView textView2 = this.txtLoginErro;
        if (textView2 == null) {
            hp0.m3207Q("txtLoginErro");
            throw null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.txtLoginStatus;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            hp0.m3207Q("txtLoginStatus");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object autenticarEmailSenha(String str, String str2, InterfaceC0579du interfaceC0579du) {
        Object objWithTimeout;
        String email;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.getClass();
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        z32 z32Var = z32.f13265a;
        return ((currentUser == null || (email = currentUser.getEmail()) == null || !email.equalsIgnoreCase(str)) && (objWithTimeout = TimeoutKt.withTimeout(AUTH_TIMEOUT_MS, new C01862(firebaseAuth, str, str2, null), interfaceC0579du)) == EnumC1530vu.f11768a) ? objWithTimeout : z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bloquearUi(String str) {
        MaterialButton materialButton = this.btnAcaoPrincipal;
        if (materialButton == null) {
            hp0.m3207Q("btnAcaoPrincipal");
            throw null;
        }
        materialButton.setEnabled(false);
        MaterialButton materialButton2 = this.btnGoogle;
        if (materialButton2 == null) {
            hp0.m3207Q("btnGoogle");
            throw null;
        }
        materialButton2.setEnabled(false);
        MaterialButton materialButton3 = this.btnAbaEntrar;
        if (materialButton3 == null) {
            hp0.m3207Q("btnAbaEntrar");
            throw null;
        }
        materialButton3.setEnabled(false);
        MaterialButton materialButton4 = this.btnAbaCadastrar;
        if (materialButton4 == null) {
            hp0.m3207Q("btnAbaCadastrar");
            throw null;
        }
        materialButton4.setEnabled(false);
        MaterialButton materialButton5 = this.btnEnviarCodigo;
        if (materialButton5 == null) {
            hp0.m3207Q("btnEnviarCodigo");
            throw null;
        }
        materialButton5.setEnabled(false);
        ProgressBar progressBar = this.progressLogin;
        if (progressBar == null) {
            hp0.m3207Q("progressLogin");
            throw null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.txtLoginStatus;
        if (textView == null) {
            hp0.m3207Q("txtLoginStatus");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.txtLoginStatus;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            hp0.m3207Q("txtLoginStatus");
            throw null;
        }
    }

    private final void cadastrar() {
        String string;
        String string2;
        String string3;
        String string4;
        String strAplicarEmailNormalizado = aplicarEmailNormalizado();
        TextInputEditText textInputEditText = this.edtCodigo;
        if (textInputEditText == null) {
            hp0.m3207Q("edtCodigo");
            throw null;
        }
        Editable text = textInputEditText.getText();
        String str = "";
        String str2 = (text == null || (string3 = text.toString()) == null || (string4 = zv1.m7383W0(string3).toString()) == null) ? "" : string4;
        TextInputEditText textInputEditText2 = this.edtSenha;
        if (textInputEditText2 == null) {
            hp0.m3207Q("edtSenha");
            throw null;
        }
        Editable text2 = textInputEditText2.getText();
        if (text2 == null || (string = text2.toString()) == null) {
            string = "";
        }
        TextInputEditText textInputEditText3 = this.edtConfirmarSenha;
        if (textInputEditText3 == null) {
            hp0.m3207Q("edtConfirmarSenha");
            throw null;
        }
        Editable text3 = textInputEditText3.getText();
        if (text3 != null && (string2 = text3.toString()) != null) {
            str = string2;
        }
        if (validarEmailSenha(strAplicarEmailNormalizado, string)) {
            if (!this.codigoEnviado) {
                mostrarErro("Toque em Enviar para receber o código no e-mail.");
                return;
            }
            Pattern patternCompile = Pattern.compile("^\\d{6}$");
            patternCompile.getClass();
            if (!patternCompile.matcher(str2).matches()) {
                mostrarErro("Informe o código de 6 dígitos.");
            } else if (string.equals(str)) {
                BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01871(strAplicarEmailNormalizado, string, str2, null), 3, null);
            } else {
                mostrarErro("As senhas não coincidem.");
            }
        }
    }

    private final void configurarAbas() {
        MaterialButton materialButton = this.btnAbaEntrar;
        if (materialButton == null) {
            hp0.m3207Q("btnAbaEntrar");
            throw null;
        }
        materialButton.setOnClickListener(new xv0(this, 0));
        MaterialButton materialButton2 = this.btnAbaCadastrar;
        if (materialButton2 == null) {
            hp0.m3207Q("btnAbaCadastrar");
            throw null;
        }
        materialButton2.setOnClickListener(new xv0(this, 1));
        aplicarModo(Modo.ENTRAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurarAbas$lambda$4(LoginActivity loginActivity, View view) {
        loginActivity.aplicarModo(Modo.ENTRAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurarAbas$lambda$5(LoginActivity loginActivity, View view) {
        loginActivity.aplicarModo(Modo.CADASTRAR);
    }

    private final void entrar() {
        String string;
        String strAplicarEmailNormalizado = aplicarEmailNormalizado();
        TextInputEditText textInputEditText = this.edtSenha;
        if (textInputEditText == null) {
            hp0.m3207Q("edtSenha");
            throw null;
        }
        Editable text = textInputEditText.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (validarEmailSenha(strAplicarEmailNormalizado, string)) {
            BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01881(strAplicarEmailNormalizado, string, null), 3, null);
        }
    }

    private final void entrarComGoogle() {
        bloquearUi("Abrindo Google…");
        try {
            this.googleLauncher.mo4381a(GoogleAuthService.INSTANCE.intentLogin(this));
        } catch (Exception e) {
            Log.e("LoginActivity", "Falha ao abrir Google Sign-In", e);
            mostrarErro(tratarErroGoogle(e));
            liberarUi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enviarCodigo() {
        String strAplicarEmailNormalizado = aplicarEmailNormalizado();
        if (EmailAddress.INSTANCE.ehValido(strAplicarEmailNormalizado)) {
            BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01891(strAplicarEmailNormalizado, null), 3, null);
        } else {
            mostrarErro("Informe um e-mail válido (ex.: nome@gmail.com).");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void googleLauncher$lambda$0(LoginActivity loginActivity, C0738i4 c0738i4) {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(loginActivity), null, null, new LoginActivity$googleLauncher$1$1(c0738i4, loginActivity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void irParaMain() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void liberarUi() {
        MaterialButton materialButton = this.btnAcaoPrincipal;
        if (materialButton == null) {
            hp0.m3207Q("btnAcaoPrincipal");
            throw null;
        }
        materialButton.setEnabled(true);
        MaterialButton materialButton2 = this.btnGoogle;
        if (materialButton2 == null) {
            hp0.m3207Q("btnGoogle");
            throw null;
        }
        materialButton2.setEnabled(true);
        MaterialButton materialButton3 = this.btnAbaEntrar;
        if (materialButton3 == null) {
            hp0.m3207Q("btnAbaEntrar");
            throw null;
        }
        materialButton3.setEnabled(true);
        MaterialButton materialButton4 = this.btnAbaCadastrar;
        if (materialButton4 == null) {
            hp0.m3207Q("btnAbaCadastrar");
            throw null;
        }
        materialButton4.setEnabled(true);
        MaterialButton materialButton5 = this.btnEnviarCodigo;
        if (materialButton5 == null) {
            hp0.m3207Q("btnEnviarCodigo");
            throw null;
        }
        materialButton5.setEnabled(true);
        ProgressBar progressBar = this.progressLogin;
        if (progressBar == null) {
            hp0.m3207Q("progressLogin");
            throw null;
        }
        progressBar.setVisibility(8);
        TextView textView = this.txtLoginStatus;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            hp0.m3207Q("txtLoginStatus");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mostrarErro(String str) {
        TextView textView = this.txtLoginErro;
        if (textView == null) {
            hp0.m3207Q("txtLoginErro");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.txtLoginErro;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            hp0.m3207Q("txtLoginErro");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tratarErroAuth(Exception exc) {
        if (exc instanceof FirebaseAuthInvalidUserException) {
            return "E-mail não cadastrado.";
        }
        if (exc instanceof FirebaseAuthInvalidCredentialsException) {
            return "E-mail ou senha incorretos.";
        }
        if (exc instanceof FirebaseAuthException) {
            String errorCode = ((FirebaseAuthException) exc).getErrorCode();
            if (errorCode.hashCode() == -1039544851 && errorCode.equals("ERROR_OPERATION_NOT_ALLOWED")) {
                return "Login por e-mail/senha está desativado no Firebase. Ative em Authentication → Sign-in method → E-mail/senha.";
            }
            String message = exc.getMessage();
            return message == null ? "Falha na autenticação." : message;
        }
        if (exc instanceof FirebaseNetworkException) {
            return "Sem conexão com o Firebase. Tente dados móveis ou outra rede Wi‑Fi.";
        }
        if (exc instanceof TimeoutCancellationException) {
            return "Login demorou demais. Verifique a internet e tente de novo.";
        }
        String message2 = exc.getMessage();
        return message2 == null ? "Falha na autenticação." : message2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tratarErroFunctions(Exception exc) {
        if (exc instanceof TimeoutCancellationException) {
            return "Login demorou demais. Verifique a internet e tente de novo.";
        }
        if (exc instanceof FirebaseNetworkException) {
            return "Sem conexão com o Firebase. Tente dados móveis ou outra rede Wi‑Fi.";
        }
        if (!(exc instanceof FirebaseFunctionsException)) {
            String message = exc.getMessage();
            return message == null ? "Falha na operação." : message;
        }
        FirebaseFunctionsException firebaseFunctionsException = (FirebaseFunctionsException) exc;
        switch (WhenMappings.$EnumSwitchMapping$1[firebaseFunctionsException.getCode().ordinal()]) {
            case 1:
                return "Este e-mail já está cadastrado. Use Entrar.";
            case 2:
                return "Servidor de cadastro offline. Aguarde a configuração.";
            case 3:
                return "Código expirado. Envie novamente.";
            case 4:
                return "Código incorreto.";
            case 5:
                String message2 = exc.getMessage();
                return message2 == null ? "Aguarde antes de tentar de novo." : message2;
            case 6:
                String message3 = exc.getMessage();
                return message3 == null ? "Servidor de e-mail não configurado." : message3;
            case 7:
                String message4 = exc.getMessage();
                return message4 == null ? "Erro no servidor. Se já cadastrou, tente Entrar." : message4;
            default:
                String message5 = exc.getMessage();
                if (message5 != null) {
                    return message5;
                }
                return "Erro no servidor (" + firebaseFunctionsException.getCode() + ").";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tratarErroGoogle(Exception exc) {
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            int statusCode = apiException.getStatusCode();
            if (statusCode != 10) {
                return statusCode != 12500 ? jd0.m3610h(apiException.getStatusCode(), "Google Sign-In falhou (", ").") : "Falha no Google Sign-In. Tente de novo.";
            }
            return "Configuração Google incompleta (SHA-1 / OAuth). No Firebase, ative Google Sign-In.";
        }
        if (exc instanceof FirebaseFunctionsException) {
            return tratarErroFunctions(exc);
        }
        if (exc instanceof FirebaseNetworkException) {
            return "Sem conexão com o Firebase. Tente dados móveis ou outra rede Wi‑Fi.";
        }
        if (exc instanceof TimeoutCancellationException) {
            return "Login Google demorou demais. Verifique a internet e tente de novo.";
        }
        String message = exc.getMessage();
        return message == null ? "Falha no login Google." : message;
    }

    private final boolean validarEmailSenha(String str, String str2) {
        if (!EmailAddress.INSTANCE.ehValido(str)) {
            mostrarErro("Informe um e-mail válido (ex.: nome@gmail.com).");
            return false;
        }
        if (str2.length() >= 6) {
            return true;
        }
        mostrarErro("A senha precisa ter pelo menos 6 caracteres.");
        return false;
    }

    private final void vincularViews() {
        View viewFindViewById = findViewById(C0203R.id.btnAbaEntrar);
        viewFindViewById.getClass();
        this.btnAbaEntrar = (MaterialButton) viewFindViewById;
        View viewFindViewById2 = findViewById(C0203R.id.btnAbaCadastrar);
        viewFindViewById2.getClass();
        this.btnAbaCadastrar = (MaterialButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(C0203R.id.edtEmail);
        viewFindViewById3.getClass();
        this.edtEmail = (TextInputEditText) viewFindViewById3;
        View viewFindViewById4 = findViewById(C0203R.id.edtCodigo);
        viewFindViewById4.getClass();
        this.edtCodigo = (TextInputEditText) viewFindViewById4;
        View viewFindViewById5 = findViewById(C0203R.id.edtSenha);
        viewFindViewById5.getClass();
        this.edtSenha = (TextInputEditText) viewFindViewById5;
        View viewFindViewById6 = findViewById(C0203R.id.edtConfirmarSenha);
        viewFindViewById6.getClass();
        this.edtConfirmarSenha = (TextInputEditText) viewFindViewById6;
        View viewFindViewById7 = findViewById(C0203R.id.layoutCodigo);
        viewFindViewById7.getClass();
        this.layoutCodigo = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(C0203R.id.layoutConfirmarSenha);
        viewFindViewById8.getClass();
        this.layoutConfirmarSenha = (TextInputLayout) viewFindViewById8;
        View viewFindViewById9 = findViewById(C0203R.id.btnEnviarCodigo);
        viewFindViewById9.getClass();
        this.btnEnviarCodigo = (MaterialButton) viewFindViewById9;
        View viewFindViewById10 = findViewById(C0203R.id.btnAcaoPrincipal);
        viewFindViewById10.getClass();
        this.btnAcaoPrincipal = (MaterialButton) viewFindViewById10;
        View viewFindViewById11 = findViewById(C0203R.id.btnGoogle);
        viewFindViewById11.getClass();
        this.btnGoogle = (MaterialButton) viewFindViewById11;
        View viewFindViewById12 = findViewById(C0203R.id.progressLogin);
        viewFindViewById12.getClass();
        this.progressLogin = (ProgressBar) viewFindViewById12;
        View viewFindViewById13 = findViewById(C0203R.id.txtLoginErro);
        viewFindViewById13.getClass();
        this.txtLoginErro = (TextView) viewFindViewById13;
        View viewFindViewById14 = findViewById(C0203R.id.txtLoginStatus);
        viewFindViewById14.getClass();
        this.txtLoginStatus = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(C0203R.id.txtCodigoAviso);
        viewFindViewById15.getClass();
        this.txtCodigoAviso = (TextView) viewFindViewById15;
        MaterialButton materialButton = this.btnEnviarCodigo;
        if (materialButton == null) {
            hp0.m3207Q("btnEnviarCodigo");
            throw null;
        }
        materialButton.setOnClickListener(new xv0(this, 2));
        MaterialButton materialButton2 = this.btnGoogle;
        if (materialButton2 == null) {
            hp0.m3207Q("btnGoogle");
            throw null;
        }
        materialButton2.setOnClickListener(new xv0(this, 3));
        MaterialButton materialButton3 = this.btnAcaoPrincipal;
        if (materialButton3 != null) {
            materialButton3.setOnClickListener(new xv0(this, 4));
        } else {
            hp0.m3207Q("btnAcaoPrincipal");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularViews$lambda$2(LoginActivity loginActivity, View view) {
        TextView textView = loginActivity.txtLoginErro;
        if (textView == null) {
            hp0.m3207Q("txtLoginErro");
            throw null;
        }
        textView.setVisibility(8);
        loginActivity.entrarComGoogle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularViews$lambda$3(LoginActivity loginActivity, View view) {
        TextView textView = loginActivity.txtLoginErro;
        if (textView == null) {
            hp0.m3207Q("txtLoginErro");
            throw null;
        }
        textView.setVisibility(8);
        int i = WhenMappings.$EnumSwitchMapping$0[loginActivity.modo.ordinal()];
        if (i == 1) {
            loginActivity.entrar();
        } else if (i == 2) {
            loginActivity.cadastrar();
        } else {
            C0694gy.m3076b();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        g50.m2937a(this);
        super.onCreate(bundle);
        setContentView(C0203R.layout.activity_login);
        UiEdgeToEdgeKt.aplicarPaddingSistema(this);
        vincularViews();
        configurarAbas();
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this), null, null, new C01911(null), 3, null);
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        private Companion() {
        }
    }
}
