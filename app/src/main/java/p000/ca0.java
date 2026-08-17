package p000;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.functions.FirebaseContextProvider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca0 implements LibraryVersionComponent.VersionExtractor, Continuation, AppCheckTokenListener, OnSuccessListener, Listener, a90, yg0, yl0, ImmutableSortedMap.Builder.KeyTranslator, InterfaceC0578dt, l11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1726a;

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1173e() {
        throw new OutOfMemoryError();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1174f(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1175g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1176h(Object obj) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(obj.toString());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1177i(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m1178j(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m1179k(String str, long j, Object obj, int i, Object obj2) {
        throw new IllegalArgumentException(str + j + obj + i + obj2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1180l(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1181m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1182n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m1183o(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1184p(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1185q() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m1186r(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m1187s(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m1188t(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: a */
    public x80[] mo120a() {
        switch (this.f1726a) {
            case 6:
                return new x80[]{new ab0()};
            default:
                return new x80[]{new kd0()};
        }
    }

    @Override // p000.InterfaceC0578dt
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // p000.yg0
    public Object apply(Object obj) {
        switch (this.f1726a) {
            case 8:
                nr0 nr0Var = (nr0) obj;
                return nr0Var.f7510a + ": " + nr0Var.f7511b;
            default:
                return (v12) obj;
        }
    }

    @Override // p000.l11
    /* JADX INFO: renamed from: b */
    public int mo1189b(Object obj) {
        String str = ((c11) obj).f1614a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (z42.f13274a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // p000.yl0
    /* JADX INFO: renamed from: d */
    public boolean mo1190d(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        FirebaseContextProvider.lambda$1$lambda$0(appCheckTokenResult);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((AbstractC0610eo) obj).halfClose();
    }

    @Override // com.google.firebase.firestore.util.Listener
    public void onValue(Object obj) {
        FirestoreClient.lambda$new$3((String) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f1726a) {
            case 1:
                return FirebaseContextProvider.getAuthToken$lambda$3(task);
            default:
                return FirestoreClient.lambda$getDocumentFromLocalCache$10(task);
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    public Object translate(Object obj) {
        return ImmutableSortedMap.Builder.lambda$static$0(obj);
    }

    public /* synthetic */ ca0(int i) {
        this.f1726a = i;
    }
}
