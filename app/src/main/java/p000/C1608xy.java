package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1608xy implements InterfaceC0807jx {

    /* JADX INFO: renamed from: a */
    public final Context f12766a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f12767b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0807jx f12768c;

    /* JADX INFO: renamed from: d */
    public w90 f12769d;

    /* JADX INFO: renamed from: e */
    public C1325qa f12770e;

    /* JADX INFO: renamed from: f */
    public C0689gt f12771f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0807jx f12772g;

    /* JADX INFO: renamed from: m */
    public x32 f12773m;

    /* JADX INFO: renamed from: n */
    public C0730hx f12774n;

    /* JADX INFO: renamed from: o */
    public ui1 f12775o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0807jx f12776p;

    public C1608xy(Context context, InterfaceC0807jx interfaceC0807jx) {
        this.f12766a = context.getApplicationContext();
        interfaceC0807jx.getClass();
        this.f12768c = interfaceC0807jx;
        this.f12767b = new ArrayList();
    }

    /* JADX INFO: renamed from: n */
    public static void m6978n(InterfaceC0807jx interfaceC0807jx, C1534vy c1534vy) {
        if (interfaceC0807jx != null) {
            interfaceC0807jx.mo991p(c1534vy);
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) {
        ki0.m3864h(this.f12776p == null);
        Uri uri = c1087lx.f6535a;
        String scheme = uri.getScheme();
        int i = z42.f13274a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f12766a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f12769d == null) {
                    w90 w90Var = new w90(false);
                    this.f12769d = w90Var;
                    m6979k(w90Var);
                }
                this.f12776p = this.f12769d;
            } else {
                if (this.f12770e == null) {
                    C1325qa c1325qa = new C1325qa(context);
                    this.f12770e = c1325qa;
                    m6979k(c1325qa);
                }
                this.f12776p = this.f12770e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f12770e == null) {
                C1325qa c1325qa2 = new C1325qa(context);
                this.f12770e = c1325qa2;
                m6979k(c1325qa2);
            }
            this.f12776p = this.f12770e;
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.f12771f == null) {
                C0689gt c0689gt = new C0689gt(context);
                this.f12771f = c0689gt;
                m6979k(c0689gt);
            }
            this.f12776p = this.f12771f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC0807jx interfaceC0807jx = this.f12768c;
            if (zEquals) {
                if (this.f12772g == null) {
                    try {
                        InterfaceC0807jx interfaceC0807jx2 = (InterfaceC0807jx) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f12772g = interfaceC0807jx2;
                        m6979k(interfaceC0807jx2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1337qm.m5542i0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        l41.m4043l("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.f12772g == null) {
                        this.f12772g = interfaceC0807jx;
                    }
                }
                this.f12776p = this.f12772g;
            } else if ("udp".equals(scheme)) {
                if (this.f12773m == null) {
                    x32 x32Var = new x32();
                    this.f12773m = x32Var;
                    m6979k(x32Var);
                }
                this.f12776p = this.f12773m;
            } else if ("data".equals(scheme)) {
                if (this.f12774n == null) {
                    C0730hx c0730hx = new C0730hx(false);
                    this.f12774n = c0730hx;
                    m6979k(c0730hx);
                }
                this.f12776p = this.f12774n;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f12775o == null) {
                    ui1 ui1Var = new ui1(context);
                    this.f12775o = ui1Var;
                    m6979k(ui1Var);
                }
                this.f12776p = this.f12775o;
            } else {
                this.f12776p = interfaceC0807jx;
            }
        }
        return this.f12776p.mo3053c(c1087lx);
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        InterfaceC0807jx interfaceC0807jx = this.f12776p;
        if (interfaceC0807jx != null) {
            try {
                interfaceC0807jx.close();
            } finally {
                this.f12776p = null;
            }
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: j */
    public final Map mo3714j() {
        InterfaceC0807jx interfaceC0807jx = this.f12776p;
        return interfaceC0807jx == null ? Collections.EMPTY_MAP : interfaceC0807jx.mo3714j();
    }

    /* JADX INFO: renamed from: k */
    public final void m6979k(InterfaceC0807jx interfaceC0807jx) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12767b;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC0807jx.mo991p((C1534vy) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        InterfaceC0807jx interfaceC0807jx = this.f12776p;
        if (interfaceC0807jx == null) {
            return null;
        }
        return interfaceC0807jx.mo3054o();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: p */
    public final void mo991p(C1534vy c1534vy) {
        c1534vy.getClass();
        this.f12768c.mo991p(c1534vy);
        this.f12767b.add(c1534vy);
        m6978n(this.f12769d, c1534vy);
        m6978n(this.f12770e, c1534vy);
        m6978n(this.f12771f, c1534vy);
        m6978n(this.f12772g, c1534vy);
        m6978n(this.f12773m, c1534vy);
        m6978n(this.f12774n, c1534vy);
        m6978n(this.f12775o, c1534vy);
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC0807jx interfaceC0807jx = this.f12776p;
        interfaceC0807jx.getClass();
        return interfaceC0807jx.read(bArr, i, i2);
    }
}
