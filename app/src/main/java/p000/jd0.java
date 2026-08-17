package p000;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.internal.play_billing.zzep;
import com.google.android.recaptcha.internal.zzjg;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.FlowKt;
import org.conscrypt.OpenSSLProvider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jd0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m3600A(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "PLAINTEXT";
        }
        return "TLS";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m3601B(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "OUTBOUND";
        }
        return "INBOUND";
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m3602C(int i) {
        switch (i) {
            case 1:
                return "NULL_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "INTEGER_VALUE";
            case 4:
                return "DOUBLE_VALUE";
            case 5:
                return "TIMESTAMP_VALUE";
            case 6:
                return "STRING_VALUE";
            case 7:
                return "BYTES_VALUE";
            case 8:
                return "REFERENCE_VALUE";
            case 9:
                return "GEO_POINT_VALUE";
            case 10:
                return "ARRAY_VALUE";
            case 11:
                return "MAP_VALUE";
            case 12:
                return "VALUETYPE_NOT_SET";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3603a(View view, int i) {
        int iM5359z = AbstractC1308pu.m5359z(i);
        if (iM5359z == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (AbstractC0056t.m363G(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM5359z == 1) {
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (iM5359z == 2) {
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (iM5359z != 3) {
                return;
            }
            if (AbstractC0056t.m363G(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3604b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        f40.m2713i(m3609g(i, "Unknown visibility "));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m3605c(View view) {
        if (view.getAlpha() == TouchPipeline.SIZE && view.getVisibility() == 0) {
            return 4;
        }
        return m3604b(view.getVisibility());
    }

    /* JADX INFO: renamed from: d */
    public static int m3606d(int i, int i2, int i3) {
        return zzep.zzC(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m3607e(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: f */
    public static C0656fx m3608f() {
        FlowKt.noImpl();
        return new C0656fx();
    }

    /* JADX INFO: renamed from: g */
    public static String m3609g(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: h */
    public static String m3610h(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m3611i(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m3612j(String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: k */
    public static String m3613k(String str, AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, String str2) {
        return str + abstractComponentCallbacksC0048l + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m3614l(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m3615m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: n */
    public static String m3616n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: o */
    public static String m3617o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m3618p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m3619q(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: r */
    public static void m3620r(int i, int i2, C1351r c1351r, HashMap map, Integer num) {
        map.put(num, new ac2(i, i2, c1351r));
    }

    /* JADX INFO: renamed from: s */
    public static void m3621s(int i, String str, String str2) {
        AbstractC1337qm.m5542i0(str2, str + i);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m3622t(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                l41.m4049r();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m3623u(StringBuilder sb, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        openSSLProvider.put(str3, sb.toString());
    }

    /* JADX INFO: renamed from: v */
    public static void m3624v(HashMap map, C1351r c1351r) {
        map.put(c1351r, new wh1(18));
    }

    /* JADX INFO: renamed from: w */
    public static int m3625w(int i, int i2, int i3) {
        return zzjg.zzx(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: x */
    public static void m3626x(HashMap map, C1351r c1351r) {
        map.put(c1351r, new wh1(21));
    }

    /* JADX INFO: renamed from: y */
    public static void m3627y(HashMap map, C1351r c1351r) {
        map.put(c1351r, new wh1(22));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m3628z(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
