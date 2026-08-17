package com.example.ssmousepro.account;

import com.google.firebase.Firebase;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.firebase.functions.HttpsCallableReference;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.tasks.TasksKt;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.bc1;
import p000.qy0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RegistrationService {
    public static final RegistrationService INSTANCE = new RegistrationService();
    private static final String REGION = "southamerica-east1";

    private RegistrationService() {
    }

    private final FirebaseFunctions getFunctions() {
        return FunctionsKt.functions(Firebase.INSTANCE, REGION);
    }

    public final Object concluirCadastro(String str, String str2, String str3, InterfaceC0579du interfaceC0579du) {
        HttpsCallableReference httpsCallable = getFunctions().getHttpsCallable("completeRegistration");
        String lowerCase = zv1.m7383W0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Object objAwait = TasksKt.await(httpsCallable.call(qy0.m5620j0(new bc1("email", lowerCase), new bc1("code", zv1.m7383W0(str2).toString()), new bc1("password", str3))), interfaceC0579du);
        return objAwait == EnumC1530vu.f11768a ? objAwait : z32.f13265a;
    }

    public final Object enviarCodigo(String str, InterfaceC0579du interfaceC0579du) {
        HttpsCallableReference httpsCallable = getFunctions().getHttpsCallable("requestRegistrationCode");
        String lowerCase = zv1.m7383W0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Map mapSingletonMap = Collections.singletonMap("email", lowerCase);
        mapSingletonMap.getClass();
        Object objAwait = TasksKt.await(httpsCallable.call(mapSingletonMap), interfaceC0579du);
        return objAwait == EnumC1530vu.f11768a ? objAwait : z32.f13265a;
    }
}
