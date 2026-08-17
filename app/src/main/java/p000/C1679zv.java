package p000;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: zv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1679zv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13574a;

    /* JADX INFO: renamed from: b */
    public boolean f13575b;

    /* JADX INFO: renamed from: c */
    public final Object f13576c;

    /* JADX INFO: renamed from: d */
    public Object f13577d;

    /* JADX INFO: renamed from: e */
    public Object f13578e;

    public C1679zv(int i) {
        this.f13574a = i;
        switch (i) {
            case 2:
                this.f13576c = new float[16];
                this.f13577d = new float[16];
                this.f13578e = new C0716hj();
                break;
            default:
                this.f13576c = new Intent("android.intent.action.VIEW");
                this.f13577d = new k50((byte) 0, 18);
                this.f13575b = true;
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7358g(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    /* JADX INFO: renamed from: a */
    public void m7359a(Object obj, String str) {
        C1174o9 c1174o9 = new C1174o9(17);
        ((C1174o9) this.f13578e).f7701d = c1174o9;
        this.f13578e = c1174o9;
        c1174o9.f7700c = obj;
        c1174o9.f7699b = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7360b(String str, long j) {
        m7362d(str, String.valueOf(j));
    }

    /* JADX INFO: renamed from: c */
    public void m7361c(String str, boolean z) {
        m7362d(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: d */
    public void m7362d(String str, String str2) {
        d61 d61Var = new d61(17);
        ((C1174o9) this.f13578e).f7701d = d61Var;
        this.f13578e = d61Var;
        d61Var.f7700c = str2;
        d61Var.f7699b = str;
    }

    /* JADX INFO: renamed from: e */
    public C0558d8 m7363e() {
        Intent intent = (Intent) this.f13576c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f13575b);
        ((k50) this.f13577d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String strM6977a = AbstractC1605xv.m6977a();
        if (!TextUtils.isEmpty(strM6977a)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strM6977a);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (((ActivityOptions) this.f13578e) == null) {
                this.f13578e = AbstractC1568wv.m6836a();
            }
            AbstractC1642yv.m7150a((ActivityOptions) this.f13578e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f13578e;
        return new C0558d8(13, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m7364f(C1474ub c1474ub, be0 be0Var) {
        String str = be0Var.f1341n;
        int i = be0Var.f1317C;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iM7240n = z42.m7240n(i);
        if (iM7240n == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM7240n);
        int i2 = be0Var.f1318D;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.f13576c).canBeSpatialized((AudioAttributes) c1474ub.m6482a().f1096b, channelMask.build());
    }

    public String toString() {
        switch (this.f13574a) {
            case 3:
                boolean z = this.f13575b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f13576c);
                sb.append('{');
                String str = "";
                for (C1174o9 c1174o9 = (C1174o9) ((C1174o9) this.f13577d).f7701d; c1174o9 != null; c1174o9 = (C1174o9) c1174o9.f7701d) {
                    Object obj = c1174o9.f7700c;
                    if ((c1174o9 instanceof d61) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) c1174o9.f7699b;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1679zv(String str) {
        this.f13574a = 3;
        C1174o9 c1174o9 = new C1174o9(17);
        this.f13577d = c1174o9;
        this.f13578e = c1174o9;
        this.f13575b = false;
        this.f13576c = str;
    }

    public C1679zv(Spatializer spatializer) {
        this.f13574a = 1;
        this.f13576c = spatializer;
        this.f13575b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
