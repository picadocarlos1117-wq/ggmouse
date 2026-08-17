package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import io.github.muntashirakon.adb.AdbProtocol;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ax0 implements z80, lg1, i51, wx1, y01, k62, u72 {

    /* JADX INFO: renamed from: b */
    public static ax0 f1092b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1093a;

    public ax0(RewardedVideoActivity rewardedVideoActivity) {
        this.f1093a = 18;
        rewardedVideoActivity.getApplicationContext();
    }

    /* JADX INFO: renamed from: m */
    public static fa1 m736m(int i) {
        return new fa1(new C1073lj(), Math.min(AdbProtocol.MAX_PAYLOAD_V3, Math.max(4096, i)));
    }

    /* JADX INFO: renamed from: o */
    public static MediaCodec m737o(C1470u7 c1470u7) throws IOException {
        String str = ((c11) c1470u7.f11141a).f1614a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // p000.u72
    /* JADX INFO: renamed from: a */
    public r72 mo738a(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (r72) objNewInstance;
        } catch (IllegalAccessException e) {
            l41.m4042k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            l41.m4042k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            l41.m4042k("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // p000.y01
    /* JADX INFO: renamed from: b */
    public z01 mo739b(C1470u7 c1470u7) throws Throwable {
        MediaCodec mediaCodecM737o = null;
        try {
            mediaCodecM737o = m737o(c1470u7);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) c1470u7.f11144d;
            mediaCodecM737o.configure((MediaFormat) c1470u7.f11142b, surface, (MediaCrypto) c1470u7.f11145e, (surface == null && ((c11) c1470u7.f11141a).f1621h && z42.f13274a >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM737o.start();
            Trace.endSection();
            return new qo0(mediaCodecM737o, (C1174o9) c1470u7.f11146f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecM737o != null) {
                mediaCodecM737o.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecM737o != null) {
                mediaCodecM737o.release();
            }
            throw e;
        }
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: c */
    public byte[] mo740c(Object obj) {
        return ((nv1) obj).f7562a.f7127b;
    }

    @Override // p000.u72
    /* JADX INFO: renamed from: e */
    public r72 mo742e(Class cls, a71 a71Var) {
        return mo738a(cls);
    }

    @Override // p000.lg1
    /* JADX INFO: renamed from: f */
    public void mo743f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: g */
    public boolean mo744g(be0 be0Var) {
        return false;
    }

    @Override // p000.u72
    /* JADX INFO: renamed from: h */
    public r72 mo745h(C1412sn c1412sn, a71 a71Var) {
        Class clsMo5862a = c1412sn.mo5862a();
        clsMo5862a.getClass();
        return mo742e(clsMo5862a, a71Var);
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: j */
    public Object mo747j(byte[] bArr) {
        int i;
        byte b;
        char c = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return nv1.f7550e;
        }
        int length = bArr.length;
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return nv1.f7552g.m4614g("Unknown code ".concat(new String(bArr, AbstractC0646fn.f3855a)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = (b2 - 48) + i;
            List list = nv1.f7549d;
            if (i2 < list.size()) {
                return (nv1) list.get(i2);
            }
        }
        return nv1.f7552g.m4614g("Unknown code ".concat(new String(bArr, AbstractC0646fn.f3855a)));
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: l */
    public yx1 mo749l(be0 be0Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: n */
    public c22 mo750n(int i, int i2) {
        return new t20();
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: p */
    public int mo751p(be0 be0Var) {
        return 1;
    }

    /* JADX INFO: renamed from: r */
    public long m753r() {
        switch (this.f1093a) {
            case 14:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    public /* synthetic */ ax0(int i) {
        this.f1093a = i;
    }

    public ax0() {
        this.f1093a = 2;
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: d */
    public void mo741d() {
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: i */
    public void mo746i() {
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: k */
    public void mo748k() {
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: q */
    public void mo752q(kq1 kq1Var) {
    }
}
