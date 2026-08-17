package com.example.ssmousepro.account;

import android.content.Context;
import android.content.Intent;
import com.example.ssmousepro.C0203R;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.firebase.functions.HttpsCallableResult;
import java.util.Map;
import kotlinx.coroutines.tasks.TasksKt;
import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.f40;
import p000.o60;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class GoogleAuthService {
    public static final GoogleAuthService INSTANCE = new GoogleAuthService();
    private static final String REGION = "southamerica-east1";

    /* JADX INFO: renamed from: com.example.ssmousepro.account.GoogleAuthService$concluirComIdToken$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.account.GoogleAuthService", m5373f = "GoogleAuthService.kt", m5374l = {InjectionMetrics.SNAPSHOT_LEN, 36}, m5375m = "concluirComIdToken")
    public static final class C02051 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C02051(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleAuthService.this.concluirComIdToken(null, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.account.GoogleAuthService$garantirPerfilServidor$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.account.GoogleAuthService", m5373f = "GoogleAuthService.kt", m5374l = {48}, m5375m = "garantirPerfilServidor")
    public static final class C02061 extends AbstractC0616eu {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02061(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleAuthService.this.garantirPerfilServidor(this);
        }
    }

    private GoogleAuthService() {
    }

    private final FirebaseFunctions getFunctions() {
        return FunctionsKt.functions(Firebase.INSTANCE, REGION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object concluirComIdToken(String str, InterfaceC0579du interfaceC0579du) {
        C02051 c02051;
        if (interfaceC0579du instanceof C02051) {
            c02051 = (C02051) interfaceC0579du;
            int i = c02051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02051.label = i - Integer.MIN_VALUE;
            } else {
                c02051 = new C02051(interfaceC0579du);
            }
        } else {
            c02051 = new C02051(interfaceC0579du);
        }
        Object obj = c02051.result;
        int i2 = c02051.label;
        Object obj2 = EnumC1530vu.f11768a;
        if (i2 == 0) {
            ua0.m6440Z(obj);
            AuthCredential credential = GoogleAuthProvider.getCredential(str, null);
            credential.getClass();
            Task<AuthResult> taskSignInWithCredential = FirebaseAuth.getInstance().signInWithCredential(credential);
            taskSignInWithCredential.getClass();
            c02051.L$0 = null;
            c02051.L$1 = null;
            c02051.label = 1;
            if (TasksKt.await(taskSignInWithCredential, c02051) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            return obj;
        }
        ua0.m6440Z(obj);
        c02051.L$0 = null;
        c02051.L$1 = null;
        c02051.label = 2;
        Object objGarantirPerfilServidor = garantirPerfilServidor(c02051);
        return objGarantirPerfilServidor == obj2 ? obj2 : objGarantirPerfilServidor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object garantirPerfilServidor(InterfaceC0579du interfaceC0579du) {
        C02061 c02061;
        FirebaseUser firebaseUser;
        if (interfaceC0579du instanceof C02061) {
            c02061 = (C02061) interfaceC0579du;
            int i = c02061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02061.label = i - Integer.MIN_VALUE;
            } else {
                c02061 = new C02061(interfaceC0579du);
            }
        } else {
            c02061 = new C02061(interfaceC0579du);
        }
        Object obj = c02061.result;
        int i2 = c02061.label;
        Map map = o60.f7669a;
        if (i2 == 0) {
            ua0.m6440Z(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                f40.m2719o("Não autenticado com Google.");
                return null;
            }
            Task<HttpsCallableResult> taskCall = getFunctions().getHttpsCallable("ensureGoogleProfile").call(map);
            c02061.L$0 = currentUser;
            c02061.label = 1;
            Object objAwait = TasksKt.await(taskCall, c02061);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAwait == enumC1530vu) {
                return enumC1530vu;
            }
            obj = objAwait;
            firebaseUser = currentUser;
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            firebaseUser = (FirebaseUser) c02061.L$0;
            ua0.m6440Z(obj);
        }
        Object data = ((HttpsCallableResult) obj).getData();
        Map map2 = data instanceof Map ? (Map) data : null;
        if (map2 != null) {
            map = map2;
        }
        Object obj2 = map.get(AccountConstants.FIELD_ACCESS_EXPIRES_AT);
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        long jLongValue = number != null ? number.longValue() : System.currentTimeMillis() + AccountConstants.TRIAL_DURATION_MS;
        Object obj3 = map.get(AccountConstants.FIELD_TRIAL_GRANTED);
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        String uid = firebaseUser.getUid();
        uid.getClass();
        String email = firebaseUser.getEmail();
        if (email == null) {
            email = "";
        }
        UserAccount userAccount = new UserAccount(uid, email, jLongValue, zBooleanValue);
        AccountRepository.INSTANCE.aplicarContaLocal(userAccount);
        return userAccount;
    }

    public final Intent intentLogin(Context context) {
        context.getClass();
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(context.getString(C0203R.string.default_web_client_id)).requestEmail().build();
        googleSignInOptionsBuild.getClass();
        Intent signInIntent = GoogleSignIn.getClient(context, googleSignInOptionsBuild).getSignInIntent();
        signInIntent.getClass();
        return signInIntent;
    }

    public final void signOut(Context context) {
        context.getClass();
        try {
            GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(context.getString(C0203R.string.default_web_client_id)).requestEmail().build();
            googleSignInOptionsBuild.getClass();
            GoogleSignIn.getClient(context, googleSignInOptionsBuild).signOut();
        } catch (Throwable unused) {
        }
    }
}
