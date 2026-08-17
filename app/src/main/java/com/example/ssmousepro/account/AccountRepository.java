package com.example.ssmousepro.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.example.ssmousepro.ads.RewardedAdProgressStore;
import com.example.ssmousepro.analytics.AppAnalytics;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.Source;
import java.util.Map;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.tasks.TasksKt;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.f40;
import p000.hp0;
import p000.o60;
import p000.tl1;
import p000.ua0;
import p000.ul1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountRepository {
    private static final long FIRESTORE_TIMEOUT_MS = 12000;
    public static final AccountRepository INSTANCE = new AccountRepository();
    private static final String PREFS = "SSAccountCache";
    private static final String TAG = "AccountRepository";
    private static Context appContext;
    private static volatile UserAccount cachedAccount;
    private static volatile boolean firestoreConfigurado;

    private AccountRepository() {
    }

    private final UserAccount carregarCacheLocal() {
        try {
            return carregarCacheLocalInterno();
        } catch (Exception e) {
            Log.w(TAG, "Cache local corrompido — limpando", e);
            Context context = appContext;
            if (context != null) {
                context.getSharedPreferences(PREFS, 0).edit().clear().apply();
                return null;
            }
            hp0.m3207Q("appContext");
            throw null;
        }
    }

    private final UserAccount carregarCacheLocalInterno() {
        Context context = appContext;
        if (context == null) {
            hp0.m3207Q("appContext");
            throw null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        String string = sharedPreferences.getString("uid", null);
        if (string == null) {
            return null;
        }
        FirebaseUser firebaseUserCurrentUser = currentUser();
        if (!hp0.m3214e(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null, string)) {
            return null;
        }
        long jCurrentTimeMillis = 0;
        if (sharedPreferences.contains(AccountConstants.FIELD_ACCESS_EXPIRES_AT)) {
            jCurrentTimeMillis = sharedPreferences.getLong(AccountConstants.FIELD_ACCESS_EXPIRES_AT, 0L);
        } else {
            long j = sharedPreferences.getLong(AccountConstants.FIELD_BALANCE_MS, 0L);
            if (j > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() + j;
            }
        }
        long j2 = jCurrentTimeMillis;
        String string2 = sharedPreferences.getString("email", "");
        UserAccount userAccount = new UserAccount(string, string2 == null ? "" : string2, j2, sharedPreferences.getBoolean(AccountConstants.FIELD_TRIAL_GRANTED, false));
        cachedAccount = userAccount;
        return userAccount;
    }

    private final FirebaseAuth getAuth() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.getClass();
        return firebaseAuth;
    }

    private final FirebaseFirestore getDb() {
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(FirebaseApp.getInstance(), AccountConstants.FIRESTORE_DATABASE_ID);
        firebaseFirestore.getClass();
        if (firestoreConfigurado) {
            return firebaseFirestore;
        }
        synchronized (this) {
            if (!firestoreConfigurado) {
                try {
                    firebaseFirestore.setFirestoreSettings(new FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build());
                } catch (Throwable unused) {
                }
                firestoreConfigurado = true;
            }
        }
        return firebaseFirestore;
    }

    private final UserAccount parseAccount(String str, Map<String, ? extends Object> map) {
        Object obj = map.get(AccountConstants.FIELD_TRIAL_GRANTED);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object obj2 = map.get("email");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        return new UserAccount(str, str2, resolverAccessExpiresAt(map), zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: refreshBalanceFromServer-IoAF18A, reason: not valid java name */
    public final Object m7416refreshBalanceFromServerIoAF18A(InterfaceC0579du interfaceC0579du) {
        AccountRepository$refreshBalanceFromServer$1 accountRepository$refreshBalanceFromServer$1;
        FirebaseUser firebaseUser;
        if (interfaceC0579du instanceof AccountRepository$refreshBalanceFromServer$1) {
            accountRepository$refreshBalanceFromServer$1 = (AccountRepository$refreshBalanceFromServer$1) interfaceC0579du;
            int i = accountRepository$refreshBalanceFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepository$refreshBalanceFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepository$refreshBalanceFromServer$1 = new AccountRepository$refreshBalanceFromServer$1(this, interfaceC0579du);
            }
        } else {
            accountRepository$refreshBalanceFromServer$1 = new AccountRepository$refreshBalanceFromServer$1(this, interfaceC0579du);
        }
        Object obj = accountRepository$refreshBalanceFromServer$1.result;
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        int i2 = accountRepository$refreshBalanceFromServer$1.label;
        try {
            if (i2 == 0) {
                ua0.m6440Z(obj);
                FirebaseUser firebaseUserCurrentUser = currentUser();
                if (firebaseUserCurrentUser == null) {
                    return new tl1(new IllegalStateException("Não autenticado"));
                }
                DocumentReference documentReferenceDocument = getDb().collection(AccountConstants.COL_USERS).document(firebaseUserCurrentUser.getUid());
                documentReferenceDocument.getClass();
                AccountRepository$refreshBalanceFromServer$snapshot$1 accountRepository$refreshBalanceFromServer$snapshot$1 = new AccountRepository$refreshBalanceFromServer$snapshot$1(documentReferenceDocument, null);
                accountRepository$refreshBalanceFromServer$1.L$0 = firebaseUserCurrentUser;
                accountRepository$refreshBalanceFromServer$1.L$1 = null;
                accountRepository$refreshBalanceFromServer$1.label = 1;
                Object objWithTimeout = TimeoutKt.withTimeout(FIRESTORE_TIMEOUT_MS, accountRepository$refreshBalanceFromServer$snapshot$1, accountRepository$refreshBalanceFromServer$1);
                if (objWithTimeout == enumC1530vu) {
                    return enumC1530vu;
                }
                firebaseUser = firebaseUserCurrentUser;
                obj = objWithTimeout;
            } else {
                if (i2 != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                firebaseUser = (FirebaseUser) accountRepository$refreshBalanceFromServer$1.L$0;
                ua0.m6440Z(obj);
            }
            DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj;
            if (!documentSnapshot.exists()) {
                UserAccount userAccountCarregarCacheLocal = cachedAccount;
                if (userAccountCarregarCacheLocal == null) {
                    userAccountCarregarCacheLocal = carregarCacheLocal();
                }
                return userAccountCarregarCacheLocal != null ? userAccountCarregarCacheLocal : new tl1(new IllegalStateException("Perfil não encontrado."));
            }
            String uid = firebaseUser.getUid();
            uid.getClass();
            Map<String, Object> data = documentSnapshot.getData();
            if (data == null) {
                data = o60.f7669a;
            }
            UserAccount account = parseAccount(uid, data);
            salvarCacheLocal(account);
            return account;
        } catch (Exception e) {
            Log.e(TAG, "Falha ao atualizar acesso", e);
            UserAccount userAccountCarregarCacheLocal2 = cachedAccount;
            if (userAccountCarregarCacheLocal2 == null) {
                userAccountCarregarCacheLocal2 = carregarCacheLocal();
            }
            return userAccountCarregarCacheLocal2 != null ? userAccountCarregarCacheLocal2 : new tl1(e);
        }
    }

    private final long resolverAccessExpiresAt(Map<String, ? extends Object> map) {
        Object obj = map.get(AccountConstants.FIELD_ACCESS_EXPIRES_AT);
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (jLongValue > 0) {
            return jLongValue;
        }
        Object obj2 = map.get(AccountConstants.FIELD_BALANCE_MS);
        long jLongValue2 = obj2 instanceof Number ? ((Number) obj2).longValue() : 0L;
        if (jLongValue2 > 0) {
            return System.currentTimeMillis() + jLongValue2;
        }
        return 0L;
    }

    private final void salvarCacheLocal(UserAccount userAccount) {
        cachedAccount = userAccount;
        Context context = appContext;
        if (context != null) {
            context.getSharedPreferences(PREFS, 0).edit().putString("uid", userAccount.getUid()).putString("email", userAccount.getEmail()).putLong(AccountConstants.FIELD_ACCESS_EXPIRES_AT, userAccount.getAccessExpiresAt()).putBoolean(AccountConstants.FIELD_TRIAL_GRANTED, userAccount.getTrialGranted()).apply();
        } else {
            hp0.m3207Q("appContext");
            throw null;
        }
    }

    public final long accessExpiresAt() {
        UserAccount userAccount = cachedAccount;
        if (userAccount != null) {
            return userAccount.getAccessExpiresAt();
        }
        UserAccount userAccountCarregarCacheLocal = carregarCacheLocal();
        if (userAccountCarregarCacheLocal != null) {
            return userAccountCarregarCacheLocal.getAccessExpiresAt();
        }
        return 0L;
    }

    public final void aplicarAcessoServidor(long j) {
        UserAccount userAccountCarregarCacheLocal = cachedAccount;
        if (userAccountCarregarCacheLocal == null && (userAccountCarregarCacheLocal = carregarCacheLocal()) == null) {
            return;
        }
        salvarCacheLocal(UserAccount.copy$default(userAccountCarregarCacheLocal, null, null, j, false, 11, null));
    }

    public final void aplicarContaLocal(UserAccount userAccount) {
        userAccount.getClass();
        salvarCacheLocal(userAccount);
        try {
            AppAnalytics.INSTANCE.setUserId(userAccount.getUid());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00df A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:13:0x0033, B:50:0x00d7, B:52:0x00df, B:54:0x00ec, B:58:0x00fb, B:46:0x00c2), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:13:0x0033, B:50:0x00d7, B:52:0x00df, B:54:0x00ec, B:58:0x00fb, B:46:0x00c2), top: B:71:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: carregarPerfil-IoAF18A, reason: not valid java name */
    public final Object m7417carregarPerfilIoAF18A(InterfaceC0579du interfaceC0579du) {
        AccountRepository$carregarPerfil$1 accountRepository$carregarPerfil$1;
        DocumentReference documentReferenceDocument;
        FirebaseUser firebaseUser;
        Exception e;
        FirebaseUser firebaseUser2;
        DocumentSnapshot documentSnapshot;
        Map<String, Object> data;
        Map<String, Object> map = o60.f7669a;
        if (interfaceC0579du instanceof AccountRepository$carregarPerfil$1) {
            accountRepository$carregarPerfil$1 = (AccountRepository$carregarPerfil$1) interfaceC0579du;
            int i = accountRepository$carregarPerfil$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepository$carregarPerfil$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepository$carregarPerfil$1 = new AccountRepository$carregarPerfil$1(this, interfaceC0579du);
            }
        } else {
            accountRepository$carregarPerfil$1 = new AccountRepository$carregarPerfil$1(this, interfaceC0579du);
        }
        Object objWithTimeout = accountRepository$carregarPerfil$1.result;
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        int i2 = accountRepository$carregarPerfil$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    documentReferenceDocument = (DocumentReference) accountRepository$carregarPerfil$1.L$1;
                    firebaseUser = (FirebaseUser) accountRepository$carregarPerfil$1.L$0;
                    try {
                        ua0.m6440Z(objWithTimeout);
                    } catch (Exception e2) {
                        e = e2;
                        Log.w(TAG, "Cache Firestore indisponível", e);
                    }
                } else {
                    if (i2 != 2) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    firebaseUser2 = (FirebaseUser) accountRepository$carregarPerfil$1.L$0;
                    ua0.m6440Z(objWithTimeout);
                }
                documentSnapshot = (DocumentSnapshot) objWithTimeout;
                if (!documentSnapshot.exists()) {
                    return new tl1(new IllegalStateException("Perfil não encontrado no servidor."));
                }
                String uid = firebaseUser2.getUid();
                uid.getClass();
                data = documentSnapshot.getData();
                if (data == null) {
                    map = data;
                }
                UserAccount account = parseAccount(uid, map);
                salvarCacheLocal(account);
                return account;
            }
            ua0.m6440Z(objWithTimeout);
            FirebaseUser firebaseUserCurrentUser = currentUser();
            if (firebaseUserCurrentUser == null) {
                return new tl1(new IllegalStateException("Não autenticado"));
            }
            UserAccount userAccountCarregarCacheLocal = carregarCacheLocal();
            if (userAccountCarregarCacheLocal != null) {
                return userAccountCarregarCacheLocal;
            }
            documentReferenceDocument = getDb().collection(AccountConstants.COL_USERS).document(firebaseUserCurrentUser.getUid());
            documentReferenceDocument.getClass();
            try {
                Task<DocumentSnapshot> task = documentReferenceDocument.get(Source.CACHE);
                task.getClass();
                accountRepository$carregarPerfil$1.L$0 = firebaseUserCurrentUser;
                accountRepository$carregarPerfil$1.L$1 = documentReferenceDocument;
                accountRepository$carregarPerfil$1.label = 1;
                Object objAwait = TasksKt.await(task, accountRepository$carregarPerfil$1);
                if (objAwait != enumC1530vu) {
                    firebaseUser = firebaseUserCurrentUser;
                    objWithTimeout = objAwait;
                }
            } catch (Exception e3) {
                firebaseUser = firebaseUserCurrentUser;
                e = e3;
                Log.w(TAG, "Cache Firestore indisponível", e);
            }
            return enumC1530vu;
            DocumentSnapshot documentSnapshot2 = (DocumentSnapshot) objWithTimeout;
            if (documentSnapshot2.exists()) {
                String uid2 = firebaseUser.getUid();
                uid2.getClass();
                Map<String, Object> data2 = documentSnapshot2.getData();
                if (data2 == null) {
                    data2 = map;
                }
                UserAccount account2 = parseAccount(uid2, data2);
                salvarCacheLocal(account2);
                return account2;
            }
            AccountRepository$carregarPerfil$server$1 accountRepository$carregarPerfil$server$1 = new AccountRepository$carregarPerfil$server$1(documentReferenceDocument, null);
            accountRepository$carregarPerfil$1.L$0 = firebaseUser;
            accountRepository$carregarPerfil$1.L$1 = null;
            accountRepository$carregarPerfil$1.label = 2;
            objWithTimeout = TimeoutKt.withTimeout(FIRESTORE_TIMEOUT_MS, accountRepository$carregarPerfil$server$1, accountRepository$carregarPerfil$1);
            if (objWithTimeout != enumC1530vu) {
                firebaseUser2 = firebaseUser;
                documentSnapshot = (DocumentSnapshot) objWithTimeout;
                if (!documentSnapshot.exists()) {
                    return new tl1(new IllegalStateException("Perfil não encontrado no servidor."));
                }
                String uid3 = firebaseUser2.getUid();
                uid3.getClass();
                data = documentSnapshot.getData();
                if (data == null) {
                    map = data;
                }
                UserAccount account3 = parseAccount(uid3, map);
                salvarCacheLocal(account3);
                return account3;
            }
            return enumC1530vu;
        } catch (Exception e4) {
            Log.e(TAG, "Falha ao carregar perfil", e4);
            UserAccount userAccountCarregarCacheLocal2 = cachedAccount;
            if (userAccountCarregarCacheLocal2 == null) {
                userAccountCarregarCacheLocal2 = carregarCacheLocal();
            }
            return userAccountCarregarCacheLocal2 != null ? userAccountCarregarCacheLocal2 : new tl1(e4);
        }
    }

    public final FirebaseUser currentUser() {
        return getAuth().getCurrentUser();
    }

    public final UserAccount getCachedAccount() {
        return cachedAccount;
    }

    public final boolean hasPlayableBalance() {
        long accessExpiresAt;
        UserAccount userAccount = cachedAccount;
        if (userAccount != null) {
            accessExpiresAt = userAccount.getAccessExpiresAt();
        } else {
            UserAccount userAccountCarregarCacheLocal = carregarCacheLocal();
            accessExpiresAt = userAccountCarregarCacheLocal != null ? userAccountCarregarCacheLocal.getAccessExpiresAt() : 0L;
        }
        return TimeBalanceFormatter.estaAtivo$default(TimeBalanceFormatter.INSTANCE, accessExpiresAt, 0L, 2, null);
    }

    public final void init(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
        if (isLoggedIn()) {
            carregarCacheLocal();
        }
    }

    public final boolean isLoggedIn() {
        return currentUser() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: refreshBalance-IoAF18A, reason: not valid java name */
    public final Object m7418refreshBalanceIoAF18A(InterfaceC0579du interfaceC0579du) {
        AccountRepository$refreshBalance$1 accountRepository$refreshBalance$1;
        if (interfaceC0579du instanceof AccountRepository$refreshBalance$1) {
            accountRepository$refreshBalance$1 = (AccountRepository$refreshBalance$1) interfaceC0579du;
            int i = accountRepository$refreshBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepository$refreshBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepository$refreshBalance$1 = new AccountRepository$refreshBalance$1(this, interfaceC0579du);
            }
        } else {
            accountRepository$refreshBalance$1 = new AccountRepository$refreshBalance$1(this, interfaceC0579du);
        }
        Object obj = accountRepository$refreshBalance$1.result;
        int i2 = accountRepository$refreshBalance$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ua0.m6440Z(obj);
                return ((ul1) obj).f11356a;
            }
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ua0.m6440Z(obj);
        accountRepository$refreshBalance$1.label = 1;
        Object objM7416refreshBalanceFromServerIoAF18A = m7416refreshBalanceFromServerIoAF18A(accountRepository$refreshBalance$1);
        Object obj2 = EnumC1530vu.f11768a;
        return objM7416refreshBalanceFromServerIoAF18A == obj2 ? obj2 : objM7416refreshBalanceFromServerIoAF18A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: refreshBalancePreservandoLocal-IoAF18A, reason: not valid java name */
    public final Object m7419refreshBalancePreservandoLocalIoAF18A(InterfaceC0579du interfaceC0579du) {
        AccountRepository$refreshBalancePreservandoLocal$1 accountRepository$refreshBalancePreservandoLocal$1;
        if (interfaceC0579du instanceof AccountRepository$refreshBalancePreservandoLocal$1) {
            accountRepository$refreshBalancePreservandoLocal$1 = (AccountRepository$refreshBalancePreservandoLocal$1) interfaceC0579du;
            int i = accountRepository$refreshBalancePreservandoLocal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountRepository$refreshBalancePreservandoLocal$1.label = i - Integer.MIN_VALUE;
            } else {
                accountRepository$refreshBalancePreservandoLocal$1 = new AccountRepository$refreshBalancePreservandoLocal$1(this, interfaceC0579du);
            }
        } else {
            accountRepository$refreshBalancePreservandoLocal$1 = new AccountRepository$refreshBalancePreservandoLocal$1(this, interfaceC0579du);
        }
        Object obj = accountRepository$refreshBalancePreservandoLocal$1.result;
        Object obj2 = EnumC1530vu.f11768a;
        int i2 = accountRepository$refreshBalancePreservandoLocal$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            return ((ul1) obj).f11356a;
        }
        ua0.m6440Z(obj);
        UserAccount userAccountCarregarCacheLocal = cachedAccount;
        if (userAccountCarregarCacheLocal == null) {
            userAccountCarregarCacheLocal = carregarCacheLocal();
        }
        if (userAccountCarregarCacheLocal != null) {
            return userAccountCarregarCacheLocal;
        }
        accountRepository$refreshBalancePreservandoLocal$1.L$0 = null;
        accountRepository$refreshBalancePreservandoLocal$1.label = 1;
        Object objM7416refreshBalanceFromServerIoAF18A = m7416refreshBalanceFromServerIoAF18A(accountRepository$refreshBalancePreservandoLocal$1);
        return objM7416refreshBalanceFromServerIoAF18A == obj2 ? obj2 : objM7416refreshBalanceFromServerIoAF18A;
    }

    public final void signOut() {
        cachedAccount = null;
        Context context = appContext;
        if (context == null) {
            hp0.m3207Q("appContext");
            throw null;
        }
        context.getSharedPreferences(PREFS, 0).edit().clear().apply();
        RewardedAdProgressStore.INSTANCE.limparAsync();
        try {
            AppAnalytics.INSTANCE.setUserId(null);
        } catch (Throwable unused) {
        }
        GoogleAuthService googleAuthService = GoogleAuthService.INSTANCE;
        Context context2 = appContext;
        if (context2 == null) {
            hp0.m3207Q("appContext");
            throw null;
        }
        googleAuthService.signOut(context2);
        getAuth().signOut();
    }
}
