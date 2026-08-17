package p000;

import android.app.Notification;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.sousasantoslogic.sspro.R;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.zip.Adler32;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: o9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1174o9 implements InterfaceC1413so, gq1, z80, qx1 {

    /* JADX INFO: renamed from: e */
    public static volatile C1174o9 f7693e;

    /* JADX INFO: renamed from: f */
    public static final Object f7694f = new Object();

    /* JADX INFO: renamed from: g */
    public static final tu0 f7695g;

    /* JADX INFO: renamed from: m */
    public static final tu0 f7696m;

    /* JADX INFO: renamed from: n */
    public static C1174o9 f7697n;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7698a;

    /* JADX INFO: renamed from: b */
    public Object f7699b;

    /* JADX INFO: renamed from: c */
    public Object f7700c;

    /* JADX INFO: renamed from: d */
    public Object f7701d;

    static {
        long j = -9223372036854775807L;
        f7695g = new tu0(2, j);
        f7696m = new tu0(3, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1174o9(r81 r81Var) {
        String str;
        Bundle[] bundleArr;
        int i;
        int i2;
        this.f7698a = 18;
        new ArrayList();
        this.f7701d = new Bundle();
        this.f7700c = r81Var;
        Context context = r81Var.f9809a;
        ArrayList arrayList = r81Var.f9812d;
        Notification.Builder builderM7260a = z81.m7260a(context, r81Var.f9821m);
        this.f7699b = builderM7260a;
        Notification notification = r81Var.f9823o;
        Context context2 = null;
        int i3 = 0;
        builderM7260a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(r81Var.f9813e).setContentText(r81Var.f9814f).setContentInfo(null).setContentIntent(r81Var.f9815g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        s81.m6005b(s81.m6007d(s81.m6006c(builderM7260a, null), false), r81Var.f9816h);
        ArrayList arrayList2 = r81Var.f9810b;
        int size = arrayList2.size();
        int i4 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList2.get(i4);
            i4++;
            p81 p81Var = (p81) obj;
            if (p81Var.f8799b == null && (i2 = p81Var.f8803f) != 0) {
                p81Var.f8799b = IconCompat.m306a(i2);
            }
            IconCompat iconCompat = p81Var.f8799b;
            boolean z = p81Var.f8801d;
            Bundle bundle = p81Var.f8798a;
            Notification.Action.Builder builderM6870a = x81.m6870a(iconCompat != null ? ql0.m5505c(iconCompat, context2) : context2, p81Var.f8804g, p81Var.f8805h);
            vk1[] vk1VarArr = p81Var.f8800c;
            if (vk1VarArr != null) {
                int length = vk1VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                while (i3 < vk1VarArr.length) {
                    remoteInputArr[i3] = vk1.m6641a(vk1VarArr[i3]);
                    i3++;
                }
                for (int i5 = 0; i5 < length; i5++) {
                    v81.m6601c(builderM6870a, remoteInputArr[i5]);
                }
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            y81.m7040a(builderM6870a, z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            a91.m123b(builderM6870a, 0);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                b91.m950c(builderM6870a, false);
            }
            if (i6 >= 31) {
                c91.m1171a(builderM6870a, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", p81Var.f8802e);
            v81.m6600b(builderM6870a, bundle2);
            v81.m6599a((Notification.Builder) this.f7699b, v81.m6602d(builderM6870a));
            arrayList2 = arrayList2;
            context2 = null;
            i3 = 0;
        }
        Bundle bundle3 = r81Var.f9820l;
        if (bundle3 != null) {
            ((Bundle) this.f7701d).putAll(bundle3);
        }
        t81.m6249a((Notification.Builder) this.f7699b, r81Var.f9817i);
        v81.m6607i((Notification.Builder) this.f7699b, r81Var.f9819k);
        v81.m6605g((Notification.Builder) this.f7699b, null);
        v81.m6608j((Notification.Builder) this.f7699b, null);
        v81.m6606h((Notification.Builder) this.f7699b, false);
        w81.m6728b((Notification.Builder) this.f7699b, null);
        w81.m6729c((Notification.Builder) this.f7699b, 0);
        w81.m6732f((Notification.Builder) this.f7699b, 0);
        w81.m6730d((Notification.Builder) this.f7699b, null);
        w81.m6731e((Notification.Builder) this.f7699b, notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = r81Var.f9824p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                w81.m6727a((Notification.Builder) this.f7699b, (String) obj2);
            }
        }
        if (arrayList.size() > 0) {
            if (r81Var.f9820l == null) {
                r81Var.f9820l = new Bundle();
            }
            Bundle bundle4 = r81Var.f9820l.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList.size()) {
                String string = Integer.toString(i8);
                p81 p81Var2 = (p81) arrayList.get(i8);
                Bundle bundle7 = new Bundle();
                if (p81Var2.f8799b == null && (i = p81Var2.f8803f) != 0) {
                    p81Var2.f8799b = IconCompat.m306a(i);
                }
                IconCompat iconCompat2 = p81Var2.f8799b;
                Bundle bundle8 = p81Var2.f8798a;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.m307b() : 0);
                bundle7.putCharSequence("title", p81Var2.f8804g);
                bundle7.putParcelable("actionIntent", p81Var2.f8805h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean(str, p81Var2.f8801d);
                bundle7.putBundle("extras", bundle9);
                vk1[] vk1VarArr2 = p81Var2.f8800c;
                if (vk1VarArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[vk1VarArr2.length];
                    int i9 = 0;
                    while (i9 < vk1VarArr2.length) {
                        vk1 vk1Var = vk1VarArr2[i9];
                        int i10 = i8;
                        Bundle bundle10 = new Bundle();
                        vk1Var.getClass();
                        String str2 = str;
                        vk1[] vk1VarArr3 = vk1VarArr2;
                        bundle10.putString("resultKey", "wifi_pair_code");
                        bundle10.putCharSequence("label", "Código de 6 dígitos");
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", vk1Var.f11698a);
                        HashSet hashSet = vk1Var.f11699b;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList4 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList4.add((String) it.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList4);
                        }
                        bundleArr[i9] = bundle10;
                        i9++;
                        i8 = i10;
                        str = str2;
                        vk1VarArr2 = vk1VarArr3;
                    }
                }
                int i11 = i8;
                String str3 = str;
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", p81Var2.f8802e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i8 = i11 + 1;
                arrayList = arrayList;
                str = str3;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (r81Var.f9820l == null) {
                r81Var.f9820l = new Bundle();
            }
            r81Var.f9820l.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f7701d).putBundle("android.car.EXTENSIONS", bundle5);
        }
        u81.m6405a((Notification.Builder) this.f7699b, r81Var.f9820l);
        y81.m7044e((Notification.Builder) this.f7699b, null);
        z81.m7261b((Notification.Builder) this.f7699b, 0);
        z81.m7264e((Notification.Builder) this.f7699b, null);
        z81.m7265f((Notification.Builder) this.f7699b, null);
        z81.m7266g((Notification.Builder) this.f7699b, 0L);
        z81.m7263d((Notification.Builder) this.f7699b, 0);
        if (!TextUtils.isEmpty(r81Var.f9821m)) {
            ((Notification.Builder) this.f7699b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it2 = r81Var.f9811c.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            l41.m4035b();
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b91.m948a((Notification.Builder) this.f7699b, r81Var.f9822n);
            b91.m949b((Notification.Builder) this.f7699b, null);
        }
    }

    /* JADX INFO: renamed from: C */
    public static C1174o9 m4732C(Context context) {
        if (f7693e == null) {
            synchronized (f7694f) {
                try {
                    if (f7693e == null) {
                        f7693e = new C1174o9(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7693e;
    }

    /* JADX INFO: renamed from: F */
    public static Method m4733F(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return m4733F(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static C1174o9 m4734Q(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C1174o9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: U */
    public static int m4735U(C1174o9 c1174o9, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    ((int[]) c1174o9.f7699b)[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    ((int[]) c1174o9.f7699b)[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    ((int[]) c1174o9.f7699b)[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    ((int[]) c1174o9.f7699b)[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: V */
    public static int m4736V(C1174o9 c1174o9, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255)) & 8388607;
            if (i7 < 8380417) {
                ((int[]) c1174o9.f7699b)[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    /* JADX INFO: renamed from: A */
    public Drawable m4737A(int i) {
        int resourceId;
        Drawable drawableM3663d;
        if (!((TypedArray) this.f7699b).hasValue(i) || (resourceId = ((TypedArray) this.f7699b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1507v7 c1507v7M6592a = C1507v7.m6592a();
        Context context = (Context) this.f7701d;
        synchronized (c1507v7M6592a) {
            drawableM3663d = c1507v7M6592a.f11571a.m3663d(context, resourceId, true);
        }
        return drawableM3663d;
    }

    /* JADX INFO: renamed from: B */
    public Typeface m4738B(int i, int i2, C1545w8 c1545w8) {
        int resourceId = ((TypedArray) this.f7699b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f7700c) == null) {
            this.f7700c = new TypedValue();
        }
        Context context = (Context) this.f7701d;
        TypedValue typedValue = (TypedValue) this.f7700c;
        ThreadLocal threadLocal = pl1.f8932a;
        if (context.isRestricted()) {
            return null;
        }
        return pl1.m5280a(context, resourceId, typedValue, i2, c1545w8, true, false);
    }

    /* JADX INFO: renamed from: D */
    public Method m4739D(Class cls) {
        Class cls2;
        Method methodM4733F = m4733F(cls, (String) this.f7700c, (Class[]) this.f7701d);
        if (methodM4733F == null || (cls2 = (Class) this.f7699b) == null || cls2.isAssignableFrom(methodM4733F.getReturnType())) {
            return methodM4733F;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public int m4740E(int i) {
        C1289pb c1289pb = (C1289pb) this.f7700c;
        if (i < 0) {
            return -1;
        }
        int childCount = ((dj1) this.f7699b).f2954a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM5242s = i - (i2 - c1289pb.m5242s(i2));
            if (iM5242s == 0) {
                while (c1289pb.m5244u(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM5242s;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public View m4741G(int i) {
        return ((dj1) this.f7699b).f2954a.getChildAt(i);
    }

    /* JADX INFO: renamed from: H */
    public int m4742H() {
        return ((dj1) this.f7699b).f2954a.getChildCount();
    }

    /* JADX INFO: renamed from: I */
    public r72 m4743I(C1412sn c1412sn, String str) {
        r72 r72VarMo738a;
        u72 u72Var = (u72) this.f7700c;
        v72 v72Var = (v72) this.f7699b;
        v72Var.getClass();
        LinkedHashMap linkedHashMap = v72Var.f11575a;
        r72 r72Var = (r72) linkedHashMap.get(str);
        if (c1412sn.m6122c(r72Var)) {
            if (u72Var instanceof kp1) {
                kp1 kp1Var = (kp1) u72Var;
                r72Var.getClass();
                fs0 fs0Var = kp1Var.f5982d;
                if (fs0Var != null) {
                    hp1 hp1Var = kp1Var.f5983e;
                    hp1Var.getClass();
                    hr1.m3266b(r72Var, hp1Var, fs0Var);
                }
            }
            r72Var.getClass();
            return r72Var;
        }
        a71 a71Var = new a71((AbstractC0076av) this.f7701d);
        a71Var.f1067a.put(bz1.f1583m, str);
        try {
            try {
                r72VarMo738a = u72Var.mo745h(c1412sn, a71Var);
            } catch (AbstractMethodError unused) {
                Class clsMo5862a = c1412sn.mo5862a();
                clsMo5862a.getClass();
                r72VarMo738a = u72Var.mo738a(clsMo5862a);
            }
        } catch (AbstractMethodError unused2) {
            Class clsMo5862a2 = c1412sn.mo5862a();
            clsMo5862a2.getClass();
            r72VarMo738a = u72Var.mo742e(clsMo5862a2, a71Var);
        }
        r72VarMo738a.getClass();
        r72 r72Var2 = (r72) linkedHashMap.put(str, r72VarMo738a);
        if (r72Var2 != null) {
            r72Var2.m5741a();
        }
        return r72VarMo738a;
    }

    /* JADX INFO: renamed from: J */
    public void m4744J(View view) {
        ((ArrayList) this.f7701d).add(view);
        dj1 dj1Var = (dj1) this.f7699b;
        AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(view);
        if (abstractC0068gM547J != null) {
            abstractC0068gM547J.onEnteredHiddenState(dj1Var.f2954a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX INFO: renamed from: K */
    public void m4745K(InterfaceC0807jx interfaceC0807jx, Uri uri, Map map, long j, long j2, wg1 wg1Var) throws cz1 {
        C0584dz c0584dz = new C0584dz(interfaceC0807jx, j, j2);
        this.f7701d = c0584dz;
        if (((x80) this.f7700c) != null) {
            return;
        }
        x80[] x80VarArrMo121c = ((a90) this.f7699b).mo121c(uri, map);
        int length = x80VarArrMo121c.length;
        om0 om0Var = qm0.f9540b;
        sc2.m6060d(length, "expectedSize");
        nm0 nm0Var = new nm0(length);
        boolean z = true;
        if (x80VarArrMo121c.length == 1) {
            this.f7700c = x80VarArrMo121c[0];
        } else {
            for (x80 x80Var : x80VarArrMo121c) {
                try {
                    if (x80Var.mo125e(c0584dz)) {
                        this.f7700c = x80Var;
                        c0584dz.f3082f = 0;
                        break;
                    }
                    nm0Var.m3904d(x80Var.mo2808g());
                    boolean z2 = ((x80) this.f7700c) != null || c0584dz.f3080d == j;
                    ki0.m3864h(z2);
                    c0584dz.f3082f = 0;
                } catch (EOFException unused) {
                    if (((x80) this.f7700c) != null || c0584dz.f3080d == j) {
                    }
                } catch (Throwable th) {
                    if (((x80) this.f7700c) == null && c0584dz.f3080d != j) {
                        z = false;
                    }
                    ki0.m3864h(z);
                    c0584dz.f3082f = 0;
                    throw th;
                }
                ki0.m3864h(z2);
                c0584dz.f3082f = 0;
            }
            if (((x80) this.f7700c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                C0101bj c0101bj = new C0101bj(", ");
                Iterator it = AbstractC1337qm.m5540h0(qm0.m5568p(x80VarArrMo121c), new f40(22)).iterator();
                StringBuilder sb2 = new StringBuilder();
                c0101bj.m996a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                kk1 kk1VarM4561g = nm0Var.m4561g();
                cz1 cz1Var = new cz1(string, null, false, 1);
                qm0.m5567n(kk1VarM4561g);
                throw cz1Var;
            }
        }
        ((x80) this.f7700c).mo127k(wg1Var);
    }

    /* JADX INFO: renamed from: L */
    public Object m4746L(SSLSocket sSLSocket, Object... objArr) {
        Method methodM4739D = m4739D(sSLSocket.getClass());
        if (methodM4739D == null) {
            throw new AssertionError("Method " + ((String) this.f7700c) + " not supported for object " + sSLSocket);
        }
        try {
            return methodM4739D.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM4739D);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m4747M(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM4739D = m4739D(sSLSocket.getClass());
            if (methodM4739D == null) {
                return;
            }
            try {
                methodM4739D.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: N */
    public Object m4748N(SSLSocket sSLSocket, Object... objArr) {
        try {
            return m4746L(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m4749O() {
        return ((uu0) this.f7700c) != null;
    }

    /* JADX INFO: renamed from: P */
    public boolean m4750P(int i, C1639ys c1639ys, ch1 ch1Var) {
        C1332qh c1332qh = (C1332qh) this.f7700c;
        int[] iArr = c1639ys.f13115p0;
        int[] iArr2 = c1639ys.f13119t;
        c1332qh.f9500a = iArr[0];
        c1332qh.f9501b = iArr[1];
        c1332qh.f9502c = c1639ys.m7135q();
        c1332qh.f9503d = c1639ys.m7131k();
        c1332qh.f9508i = false;
        c1332qh.f9509j = i;
        boolean z = c1332qh.f9500a == 3;
        boolean z2 = c1332qh.f9501b == 3;
        boolean z3 = z && c1639ys.f13080W > TouchPipeline.SIZE;
        boolean z4 = z2 && c1639ys.f13080W > TouchPipeline.SIZE;
        if (z3 && iArr2[0] == 4) {
            c1332qh.f9500a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c1332qh.f9501b = 1;
        }
        ch1Var.m1220d(c1639ys, c1332qh);
        c1639ys.m7122O(c1332qh.f9504e);
        c1639ys.m7119L(c1332qh.f9505f);
        c1639ys.f13062E = c1332qh.f9507h;
        c1639ys.m7116I(c1332qh.f9506g);
        c1332qh.f9509j = 0;
        return c1332qh.f9508i;
    }

    /* JADX INFO: renamed from: R */
    public void m4751R(int i, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i2 = ((ch1) this.f7700c).f1809d;
        if (i2 != 2) {
            if (i2 != 4) {
                l41.m4048q("Eta needs to be 2 or 4!");
                return;
            }
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.f7699b;
                byte b = (byte) (i2 - iArr[i4]);
                bArr2[0] = b;
                byte b2 = (byte) (i2 - iArr[i4 + 1]);
                bArr2[1] = b2;
                bArr[i + i3] = (byte) ((b2 << 4) | b);
            }
            return;
        }
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = i5 * 8;
            int[] iArr2 = (int[]) this.f7699b;
            byte b3 = (byte) (i2 - iArr2[i6]);
            bArr2[0] = b3;
            byte b4 = (byte) (i2 - iArr2[i6 + 1]);
            bArr2[1] = b4;
            byte b5 = (byte) (i2 - iArr2[i6 + 2]);
            bArr2[2] = b5;
            bArr2[3] = (byte) (i2 - iArr2[i6 + 3]);
            bArr2[4] = (byte) (i2 - iArr2[i6 + 4]);
            bArr2[5] = (byte) (i2 - iArr2[i6 + 5]);
            bArr2[6] = (byte) (i2 - iArr2[i6 + 6]);
            bArr2[7] = (byte) (i2 - iArr2[i6 + 7]);
            int i7 = (i5 * 3) + i;
            bArr[i7] = (byte) ((b4 << 3) | b3 | (b5 << 6));
            bArr[i7 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i7 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m4752S(int i, byte[] bArr) {
        int i2 = ((ch1) this.f7700c).f1809d;
        int i3 = 0;
        if (i2 != 2) {
            if (i2 == 4) {
                while (i3 < 128) {
                    int i4 = i3 * 2;
                    byte b = bArr[i + i3];
                    int[] iArr = (int[]) this.f7699b;
                    iArr[i4] = b & 15;
                    int i5 = i4 + 1;
                    iArr[i5] = (b & 255) >> 4;
                    iArr[i4] = i2 - iArr[i4];
                    iArr[i5] = i2 - iArr[i5];
                    i3++;
                }
                return;
            }
            return;
        }
        while (i3 < 32) {
            int i6 = (i3 * 3) + i;
            int i7 = i3 * 8;
            byte b2 = bArr[i6];
            int[] iArr2 = (int[]) this.f7699b;
            iArr2[i7] = b2 & 7;
            int i8 = i7 + 1;
            int i9 = b2 & 255;
            iArr2[i8] = (i9 >> 3) & 7;
            int i10 = i7 + 2;
            int i11 = bArr[i6 + 1] & 255;
            iArr2[i10] = (i9 >> 6) | ((i11 << 2) & 7);
            int i12 = i7 + 3;
            iArr2[i12] = (i11 >> 1) & 7;
            int i13 = i7 + 4;
            iArr2[i13] = (i11 >> 4) & 7;
            int i14 = i7 + 5;
            int i15 = bArr[i6 + 2] & 255;
            iArr2[i14] = (i11 >> 7) | ((i15 << 1) & 7);
            int i16 = i7 + 6;
            iArr2[i16] = (i15 >> 2) & 7;
            int i17 = i7 + 7;
            iArr2[i17] = (i15 >> 5) & 7;
            iArr2[i7] = i2 - iArr2[i7];
            iArr2[i8] = i2 - iArr2[i8];
            iArr2[i10] = i2 - iArr2[i10];
            iArr2[i12] = i2 - iArr2[i12];
            iArr2[i13] = i2 - iArr2[i13];
            iArr2[i14] = i2 - iArr2[i14];
            iArr2[i16] = i2 - iArr2[i16];
            iArr2[i17] = i2 - iArr2[i17];
            i3++;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m4753T() {
        ((TypedArray) this.f7699b).recycle();
    }

    /* JADX INFO: renamed from: W */
    public void m4754W(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f7700c).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f7701d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: X */
    public void m4755X(C0674ge c0674ge, int i, boolean z) {
        C0600ee c0600ee = (C0600ee) this.f7700c;
        Context context = (Context) this.f7701d;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c0674ge.f4155a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        cg1 cg1Var = c0674ge.f4157c;
        adler32.update(byteBufferAllocate.putInt(eg1.m2586a(cg1Var)).array());
        byte[] bArr = c0674ge.f4156b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    hr1.m3272h("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c0674ge);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((no1) this.f7699b).m4577c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(eg1.m2586a(cg1Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c0600ee.m2576a(cg1Var, jLongValue, i));
            Set set = ((C0637fe) c0600ee.f3325b.get(cg1Var)).f3769c;
            if (set.contains(op1.f8418a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(op1.f8420c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(op1.f8419b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", eg1.m2586a(cg1Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c0674ge, Integer.valueOf(value), Long.valueOf(c0600ee.m2576a(cg1Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m4756Y(String str) {
        if (str != null) {
            this.f7699b = str;
        } else {
            l41.m4051t("Null backendName");
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m4757Z(C1676zs c1676zs, int i, int i2, int i3) {
        int i4 = c1676zs.f13087b0;
        int i5 = c1676zs.f13089c0;
        c1676zs.f13087b0 = 0;
        c1676zs.f13089c0 = 0;
        c1676zs.m7122O(i2);
        c1676zs.m7119L(i3);
        if (i4 < 0) {
            c1676zs.f13087b0 = 0;
        } else {
            c1676zs.f13087b0 = i4;
        }
        if (i5 < 0) {
            c1676zs.f13089c0 = 0;
        } else {
            c1676zs.f13089c0 = i5;
        }
        C1676zs c1676zs2 = (C1676zs) this.f7701d;
        c1676zs2.f13539t0 = i;
        c1676zs2.m7340U();
    }

    @Override // p000.gq1
    /* JADX INFO: renamed from: a */
    public void mo3050a(dc1 dc1Var) {
        long jM6986d;
        long j;
        ki0.m3866j((y02) this.f7700c);
        int i = z42.f13274a;
        y02 y02Var = (y02) this.f7700c;
        synchronized (y02Var) {
            try {
                long j2 = y02Var.f12798c;
                jM6986d = j2 != -9223372036854775807L ? j2 + y02Var.f12797b : y02Var.m6986d();
            } catch (Throwable th) {
                throw th;
            }
        }
        y02 y02Var2 = (y02) this.f7700c;
        synchronized (y02Var2) {
            j = y02Var2.f12797b;
        }
        if (jM6986d == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        be0 be0Var = (be0) this.f7699b;
        if (j != be0Var.f1346s) {
            ae0 ae0VarM969a = be0Var.m969a();
            ae0VarM969a.f202r = j;
            be0 be0Var2 = new be0(ae0VarM969a);
            this.f7699b = be0Var2;
            ((c22) this.f7701d).mo1117d(be0Var2);
        }
        int iM2318a = dc1Var.m2318a();
        ((c22) this.f7701d).mo1115b(dc1Var, iM2318a, 0);
        ((c22) this.f7701d).mo1114a(jM6986d, 1, iM2318a, 0, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4758a0(View view) {
        if (((ArrayList) this.f7701d).remove(view)) {
            dj1 dj1Var = (dj1) this.f7699b;
            AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(view);
            if (abstractC0068gM547J != null) {
                abstractC0068gM547J.onLeftHiddenState(dj1Var.f2954a);
            }
        }
    }

    @Override // p000.gq1
    /* JADX INFO: renamed from: b */
    public void mo3051b(y02 y02Var, z80 z80Var, qk0 qk0Var) {
        this.f7700c = y02Var;
        qk0Var.m5498a();
        qk0Var.m5500c();
        c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 5);
        this.f7701d = c22VarMo750n;
        c22VarMo750n.mo1117d((be0) this.f7699b);
    }

    /* JADX INFO: renamed from: b0 */
    public void m4759b0(byte[] bArr, short s) {
        int i;
        qo0 qo0Var = (qo0) this.f7701d;
        int i2 = ((ch1) this.f7700c).f1809d;
        if (i2 == 2) {
            qo0Var.getClass();
            i = 1;
        } else if (i2 != 4) {
            l41.m4048q("Wrong Dilithium Eta!");
            return;
        } else {
            qo0Var.getClass();
            i = 2;
        }
        qo0Var.getClass();
        rn1 rn1Var = (rn1) qo0Var.f9549c;
        int i3 = i * 136;
        byte[] bArr2 = new byte[i3];
        rn1Var.m6130k();
        rn1Var.mo729e(0, bArr.length, bArr);
        rn1Var.mo729e(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
        rn1Var.m5865n(0, i3, bArr2);
        int iM4735U = m4735U(this, 0, 256, bArr2, i3, i2);
        while (iM4735U < 256) {
            rn1Var.m5865n(0, 136, bArr2);
            iM4735U += m4735U(this, iM4735U, 256 - iM4735U, bArr2, 136, i2);
        }
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: c */
    public int mo2822c(long j) {
        long[] jArr = (long[]) this.f7701d;
        int iM7227a = z42.m7227a(jArr, j, false);
        if (iM7227a < jArr.length) {
            return iM7227a;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c0 */
    public void m4760c0(C1676zs c1676zs) {
        ArrayList arrayList = (ArrayList) this.f7699b;
        arrayList.clear();
        int size = c1676zs.f13536q0.size();
        for (int i = 0; i < size; i++) {
            C1639ys c1639ys = (C1639ys) c1676zs.f13536q0.get(i);
            int[] iArr = c1639ys.f13115p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1639ys);
            }
        }
        c1676zs.f13538s0.f13223b = true;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: d */
    public long mo2823d(int i) {
        long[] jArr = (long[]) this.f7701d;
        ki0.m3857c(i >= 0);
        ki0.m3857c(i < jArr.length);
        return jArr[i];
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: e */
    public List mo2824e(long j) {
        List list = (List) this.f7699b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.f7700c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                j92 j92Var = (j92) list.get(i);
                C0805jv c0805jv = j92Var.f5331a;
                if (c0805jv.f5558e == -3.4028235E38f) {
                    arrayList2.add(j92Var);
                } else {
                    arrayList.add(c0805jv);
                }
            }
        }
        Collections.sort(arrayList2, new C1473ua(23));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C0767iv c0767ivM3713a = ((j92) arrayList2.get(i3)).f5331a.m3713a();
            c0767ivM3713a.f5168e = (-1) - i3;
            c0767ivM3713a.f5169f = 1;
            arrayList.add(c0767ivM3713a.m3495a());
        }
        return arrayList;
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: f */
    public void mo4761f(j51 j51Var) {
        C0798jo c0798jo = (C0798jo) this.f7701d;
        jc1.m3599c();
        try {
            jc1.m3597a();
            jc1.m3598b();
            c0798jo.f5466b.execute(new C0647fo(this, j51Var));
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: g */
    public int mo2825g() {
        return ((long[]) this.f7701d).length;
    }

    /* JADX INFO: renamed from: h */
    public void m4762h(View view, int i, boolean z) {
        RecyclerView recyclerView = ((dj1) this.f7699b).f2954a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4740E(i);
        ((C1289pb) this.f7700c).m5245v(childCount, z);
        if (z) {
            m4744J(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(view);
        AbstractC0064c abstractC0064c = recyclerView.f929r;
        if (abstractC0064c == null || abstractC0068gM547J == null) {
            return;
        }
        abstractC0064c.onViewAttachedToWindow(abstractC0068gM547J);
    }

    /* JADX INFO: renamed from: i */
    public void m4763i(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((dj1) this.f7699b).f2954a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m4740E(i);
        ((C1289pb) this.f7700c).m5245v(childCount, z);
        if (z) {
            m4744J(view);
        }
        AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(view);
        if (abstractC0068gM547J != null) {
            if (!abstractC0068gM547J.isTmpDetached() && !abstractC0068gM547J.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0068gM547J + recyclerView.m605z());
            }
            abstractC0068gM547J.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public C0674ge m4764j() {
        String strConcat = ((String) this.f7699b) == null ? " backendName" : "";
        if (((cg1) this.f7701d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C0674ge((String) this.f7699b, (byte[]) this.f7700c, (cg1) this.f7701d);
        }
        f40.m2719o("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: k */
    public void mo748k() {
        ((z80) this.f7699b).mo748k();
    }

    /* JADX INFO: renamed from: l */
    public void m4765l(nv1 nv1Var, j51 j51Var) {
        C0798jo c0798jo = (C0798jo) this.f7701d;
        C1274ox c1274ox = c0798jo.f5472h.f258a;
        c0798jo.f5469e.getClass();
        if (c1274ox == null) {
            c1274ox = null;
        }
        if (nv1Var.f7562a == mv1.CANCELLED && c1274ox != null && c1274ox.m5075a()) {
            zj0 zj0Var = new zj0(1);
            c0798jo.f5473i.mo1031g(zj0Var);
            nv1Var = nv1.f7553h.m4611a("ClientCall was cancelled at or after deadline. " + zj0Var);
            j51Var = new j51();
        }
        jc1.m3598b();
        c0798jo.f5466b.execute(new C0684go(this, nv1Var, j51Var));
    }

    /* JADX INFO: renamed from: m */
    public void m4766m(z80 z80Var, qk0 qk0Var) {
        c22[] c22VarArr = (c22[]) this.f7700c;
        for (int i = 0; i < c22VarArr.length; i++) {
            qk0Var.m5498a();
            qk0Var.m5500c();
            c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 3);
            be0 be0Var = (be0) ((List) this.f7699b).get(i);
            String str = be0Var.f1341n;
            ki0.m3859d("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = be0Var.f1328a;
            if (str2 == null) {
                qk0Var.m5500c();
                str2 = (String) qk0Var.f9523e;
            }
            ae0 ae0Var = new ae0();
            ae0Var.f185a = str2;
            ae0Var.f197m = v51.m6582l(str);
            ae0Var.f189e = be0Var.f1332e;
            ae0Var.f188d = be0Var.f1331d;
            ae0Var.f180G = be0Var.f1322H;
            ae0Var.f200p = be0Var.f1344q;
            c22VarMo750n.mo1117d(new be0(ae0Var));
            c22VarArr[i] = c22VarMo750n;
        }
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: n */
    public c22 mo750n(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.f7701d;
        z80 z80Var = (z80) this.f7699b;
        if (i2 != 3) {
            return z80Var.mo750n(i, i2);
        }
        zx1 zx1Var = (zx1) sparseArray.get(i);
        if (zx1Var != null) {
            return zx1Var;
        }
        zx1 zx1Var2 = new zx1(z80Var.mo750n(i, i2), (wx1) this.f7700c);
        sparseArray.put(i, zx1Var2);
        return zx1Var2;
    }

    /* JADX INFO: renamed from: o */
    public void m4767o(int i) {
        AbstractC0068g abstractC0068gM547J;
        int iM4740E = m4740E(i);
        ((C1289pb) this.f7700c).m5246w(iM4740E);
        RecyclerView recyclerView = ((dj1) this.f7699b).f2954a;
        View childAt = recyclerView.getChildAt(iM4740E);
        if (childAt != null && (abstractC0068gM547J = RecyclerView.m547J(childAt)) != null) {
            if (abstractC0068gM547J.isTmpDetached() && !abstractC0068gM547J.shouldIgnore()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC0068gM547J + recyclerView.m605z());
            }
            abstractC0068gM547J.addFlags(256);
        }
        recyclerView.detachViewFromParent(iM4740E);
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: p */
    public void mo4768p() {
        C0798jo c0798jo = (C0798jo) this.f7701d;
        t51 t51Var = c0798jo.f5465a.f11125a;
        t51Var.getClass();
        if (t51Var == t51.f10762a || t51Var == t51.f10763b) {
            return;
        }
        jc1.m3599c();
        try {
            jc1.m3597a();
            jc1.m3598b();
            c0798jo.f5466b.execute(new C0721ho(this));
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: q */
    public void mo752q(kq1 kq1Var) {
        ((z80) this.f7699b).mo752q(kq1Var);
    }

    /* JADX INFO: renamed from: r */
    public void m4769r(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f7700c;
        String string = ((Context) this.f7701d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (nn0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m4771t((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0656fx(e);
            }
        }
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: s */
    public void mo4770s(pn0 pn0Var) {
        C0798jo c0798jo = (C0798jo) this.f7701d;
        jc1.m3599c();
        try {
            jc1.m3597a();
            jc1.m3598b();
            c0798jo.f5466b.execute(new C0647fo(this, pn0Var));
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public Object m4771t(Class cls, HashSet hashSet) {
        Object objMo328a;
        HashMap map = (HashMap) this.f7699b;
        if (rc2.m5771T()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo328a = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                nn0 nn0Var = (nn0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = nn0Var.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            m4771t(cls2, hashSet);
                        }
                    }
                }
                objMo328a = nn0Var.mo328a((Context) this.f7701d);
                hashSet.remove(cls);
                map.put(cls, objMo328a);
            } catch (Throwable th2) {
                throw new C0656fx(th2);
            }
        }
        Trace.endSection();
        return objMo328a;
    }

    public String toString() {
        switch (this.f7698a) {
            case 7:
                return ((C1289pb) this.f7700c).toString() + ", hidden list:" + ((ArrayList) this.f7701d).size();
            case 21:
                StringBuffer stringBuffer = new StringBuffer("[");
                int i = 0;
                while (true) {
                    int[] iArr = (int[]) this.f7699b;
                    if (i >= iArr.length) {
                        stringBuffer.append("]");
                        return stringBuffer.toString();
                    }
                    stringBuffer.append(iArr[i]);
                    if (i != ((int[]) this.f7699b).length - 1) {
                        stringBuffer.append(", ");
                    }
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public View m4772u(int i) {
        return ((dj1) this.f7699b).f2954a.getChildAt(m4740E(i));
    }

    /* JADX INFO: renamed from: v */
    public int m4773v() {
        return ((dj1) this.f7699b).f2954a.getChildCount() - ((ArrayList) this.f7701d).size();
    }

    /* JADX INFO: renamed from: w */
    public ColorStateList m4774w(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f7699b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList((Context) this.f7701d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: x */
    public void mo4775x(nv1 nv1Var, EnumC1376ro enumC1376ro, j51 j51Var) {
        jc1.m3599c();
        try {
            jc1.m3597a();
            m4765l(nv1Var, j51Var);
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public long m4776y() {
        C0584dz c0584dz = (C0584dz) this.f7701d;
        if (c0584dz != null) {
            return c0584dz.f3080d;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: z */
    public Drawable m4777z(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f7699b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : hr1.m3282r((Context) this.f7701d, resourceId);
    }

    public C1174o9(ch1 ch1Var) {
        this.f7698a = 21;
        this.f7699b = new int[256];
        this.f7700c = ch1Var;
        qo0 qo0Var = (qo0) ch1Var.f1813h;
        this.f7701d = qo0Var;
        qo0Var.getClass();
    }

    public /* synthetic */ C1174o9(Context context, Object obj, Object obj2, int i) {
        this.f7698a = i;
        this.f7701d = context;
        this.f7699b = obj;
        this.f7700c = obj2;
    }

    public /* synthetic */ C1174o9(Object obj, int i) {
        this.f7698a = i;
        this.f7699b = obj;
    }

    public /* synthetic */ C1174o9(Object obj, Object obj2, Object obj3, int i) {
        this.f7698a = i;
        this.f7699b = obj;
        this.f7700c = obj2;
        this.f7701d = obj3;
    }

    public C1174o9(v72 v72Var, u72 u72Var, AbstractC0076av abstractC0076av) {
        this.f7698a = 28;
        v72Var.getClass();
        abstractC0076av.getClass();
        this.f7699b = v72Var;
        this.f7700c = u72Var;
        this.f7701d = abstractC0076av;
    }

    public C1174o9(ArrayList arrayList) {
        this.f7698a = 29;
        this.f7699b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f7700c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            j92 j92Var = (j92) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.f7700c;
            jArr[i2] = j92Var.f5332b;
            jArr[i2 + 1] = j92Var.f5333c;
        }
        long[] jArr2 = (long[]) this.f7700c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f7701d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C1174o9(List list) {
        this.f7698a = 23;
        this.f7699b = list;
        this.f7700c = new c22[list.size()];
        this.f7701d = new C1652z4(new uq1(this, 0));
    }

    public C1174o9(dj1 dj1Var) {
        this.f7698a = 7;
        this.f7699b = dj1Var;
        this.f7700c = new C1289pb();
        this.f7701d = new ArrayList();
    }

    public C1174o9(z80 z80Var, wx1 wx1Var) {
        this.f7698a = 24;
        this.f7699b = z80Var;
        this.f7700c = wx1Var;
        this.f7701d = new SparseArray();
    }

    public C1174o9() {
        this.f7698a = 15;
        f40 f40Var = f40.f3612c;
        this.f7700c = new HashSet();
        this.f7699b = f40Var;
    }

    public C1174o9(Context context, TypedArray typedArray) {
        this.f7698a = 25;
        this.f7701d = context;
        this.f7699b = typedArray;
    }

    public C1174o9(Context context, LocationManager locationManager) {
        this.f7698a = 27;
        this.f7700c = new xx1();
        this.f7701d = context;
        this.f7699b = locationManager;
    }

    public C1174o9(C1676zs c1676zs) {
        this.f7698a = 3;
        this.f7699b = new ArrayList();
        this.f7700c = new C1332qh();
        this.f7701d = c1676zs;
    }

    public C1174o9(Context context) {
        this.f7698a = 0;
        this.f7701d = context.getApplicationContext();
        this.f7700c = new HashSet();
        this.f7699b = new HashMap();
    }

    public /* synthetic */ C1174o9(int i) {
        this.f7698a = i;
    }

    public C1174o9(InterfaceC1103mc[] interfaceC1103mcArr) {
        this.f7698a = 10;
        ys1 ys1Var = new ys1();
        cu1 cu1Var = new cu1();
        cu1Var.f2628c = 1.0f;
        cu1Var.f2629d = 1.0f;
        C0823kc c0823kc = C0823kc.f5741e;
        cu1Var.f2630e = c0823kc;
        cu1Var.f2631f = c0823kc;
        cu1Var.f2632g = c0823kc;
        cu1Var.f2633h = c0823kc;
        ByteBuffer byteBuffer = InterfaceC1103mc.f6750a;
        cu1Var.f2636k = byteBuffer;
        cu1Var.f2637l = byteBuffer.asShortBuffer();
        cu1Var.f2638m = byteBuffer;
        cu1Var.f2627b = -1;
        InterfaceC1103mc[] interfaceC1103mcArr2 = new InterfaceC1103mc[interfaceC1103mcArr.length + 2];
        this.f7699b = interfaceC1103mcArr2;
        System.arraycopy(interfaceC1103mcArr, 0, interfaceC1103mcArr2, 0, interfaceC1103mcArr.length);
        this.f7700c = ys1Var;
        this.f7701d = cu1Var;
        interfaceC1103mcArr2[interfaceC1103mcArr.length] = ys1Var;
        interfaceC1103mcArr2[interfaceC1103mcArr.length + 1] = cu1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1174o9(String str, int i) {
        this.f7698a = i;
        switch (i) {
            case 20:
                ae0 ae0Var = new ae0();
                ae0Var.f197m = v51.m6582l(str);
                this.f7699b = new be0(ae0Var);
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                int i2 = z42.f13274a;
                this(new fx0(Executors.newSingleThreadExecutor(new ThreadFactoryC1638yr(strConcat, 1)), new ca0(28)), 1);
                break;
        }
    }

    public C1174o9(C0798jo c0798jo, AbstractC0143co abstractC0143co) {
        this.f7698a = 8;
        this.f7701d = c0798jo;
        p32.m5188s(abstractC0143co, "observer");
        this.f7699b = abstractC0143co;
    }

    public C1174o9(AudioTrack audioTrack, C0130cc c0130cc) {
        this.f7698a = 11;
        this.f7699b = audioTrack;
        this.f7700c = c0130cc;
        this.f7701d = new AudioRouting.OnRoutingChangedListener() { // from class: oy
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C1174o9 c1174o9 = this.f8573a;
                if (((C1275oy) c1174o9.f7701d) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((C0130cc) c1174o9.f7700c).m1210b(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((C1275oy) this.f7701d, new Handler(Looper.myLooper()));
    }

    public C1174o9(C1423sy c1423sy) {
        this.f7698a = 12;
        this.f7701d = c1423sy;
        this.f7699b = new Handler(Looper.myLooper());
        this.f7700c = new C1386ry(this);
    }
}
