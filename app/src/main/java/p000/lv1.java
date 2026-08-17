package p000;

import android.view.View;
import com.example.ssmousepro.UiEdgeToEdgeKt;
import com.google.android.gms.internal.fido.zzdh;
import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzby;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv1 implements wz1, yg0, Continuation, a90, ha1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6526a;

    public /* synthetic */ lv1(int i) {
        this.f6526a = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4291b() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4292d(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4293e(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4294f(int i, int i2, Throwable th) throws zzby {
        throw new zzby(i, i2, th);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4295g(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m4296h(long j, Object obj) throws zzdh {
        throw new zzdh("Integer value " + j + obj);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4297i(Object obj, int i, int i2, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4298j(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4299k(String str) throws CertificateException {
        throw new CertificateException(str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4300l(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4301m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m4302n(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m4303o(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m4304p(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m4305q(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m4306r(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m4307s(String str) throws zzfq {
        throw new zzfq(str);
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: a */
    public x80[] mo120a() {
        switch (this.f6526a) {
            case 9:
                y02 y02Var = new y02(0L);
                om0 om0Var = qm0.f9540b;
                return new x80[]{new g32(1, wx1.f12357k, y02Var, new C0719hm(kk1.f5896e))};
            default:
                return new x80[]{new a92()};
        }
    }

    @Override // p000.yg0
    public Object apply(Object obj) {
        return Integer.valueOf(((y12) obj).f12804c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f6526a) {
            case 6:
                return Transaction.lambda$commit$1(task);
            default:
                return Util.lambda$static$0(task);
        }
    }

    @Override // p000.ha1
    /* JADX INFO: renamed from: v */
    public bb2 mo786v(View view, bb2 bb2Var) {
        return UiEdgeToEdgeKt.aplicarPaddingSistema$lambda$0(view, bb2Var);
    }
}
