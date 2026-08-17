package p000;

import android.content.Context;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.lang.reflect.Constructor;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: renamed from: gy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0694gy implements xt0, yg0, Continuation, LibraryVersionComponent.VersionExtractor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4359a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3076b() {
        throw new C0656fx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3077c(int i, String str) throws FastParser.ParseException {
        throw new FastParser.ParseException(str + ((char) i));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3078d(Object obj, String str) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException(str + obj);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3079e(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3080f(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3081g(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: a */
    public Constructor m3082a() {
        switch (this.f4359a) {
            case 15:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(x80.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(x80.class).getConstructor(null);
        }
    }

    @Override // p000.yg0
    public Object apply(Object obj) {
        return new C0808jy((xy1) obj);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f4359a) {
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
        }
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        switch (this.f4359a) {
            case 0:
                ((h21) obj).getClass();
                break;
            case 1:
                h21 h21Var = (h21) obj;
                h21Var.getClass();
                h21Var.f4418v = 1;
                break;
            case 2:
                ((h21) obj).getClass();
                break;
            case 3:
                ((h21) obj).getClass();
                break;
            case 4:
                ((h21) obj).getClass();
                break;
            case 5:
                ((h21) obj).getClass();
                break;
            case 6:
                ((h21) obj).getClass();
                break;
            case 7:
                ((h21) obj).getClass();
                break;
            case 8:
                ((h21) obj).getClass();
                break;
            case 9:
                ((h21) obj).getClass();
                break;
            case 10:
                ((h21) obj).getClass();
                break;
            case 11:
                ((h21) obj).getClass();
                break;
            case 12:
                ((h21) obj).getClass();
                break;
            case 13:
                ((h21) obj).getClass();
                break;
            case 14:
                ((h21) obj).getClass();
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                ((ce1) obj).onRenderedFirstFrame();
                break;
            case 23:
                ((ce1) obj).onPlayerError(new t70(2, new C0656fx("Player release timed out."), 1003));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FirebaseAppCheckTokenProvider.lambda$getToken$2(task);
    }

    public /* synthetic */ C0694gy(int i) {
        this.f4359a = i;
    }
}
