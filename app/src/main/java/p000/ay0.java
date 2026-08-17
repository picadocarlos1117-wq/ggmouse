package p000;

import android.content.ClipData;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sousasantoslogic.sspro.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ay0 implements f41, g31, em0, ha1, q31, InterfaceC0803jt, InterfaceC1083lt, y01, a22, j91, lh0 {

    /* JADX INFO: renamed from: c */
    public static final zh0 f1094c = new zh0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1095a;

    /* JADX INFO: renamed from: b */
    public Object f1096b;

    public ay0(int i) {
        w41 w41Var;
        this.f1095a = i;
        switch (i) {
            case 1:
                this.f1096b = new C1576x2(this);
                break;
            case 8:
                this.f1096b = new CopyOnWriteArrayList();
                break;
            case 9:
                break;
            case 10:
                this.f1096b = new f40(15);
                break;
            default:
                try {
                    w41Var = (w41) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    w41Var = f1094c;
                }
                w41[] w41VarArr = {zh0.f13417b, w41Var};
                zx0 zx0Var = new zx0();
                zx0Var.f13599a = w41VarArr;
                Charset charset = no0.f7481a;
                this.f1096b = zx0Var;
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean mo762A(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r6 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r6 >= 34) goto L45;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m764C(p000.be0 r6) {
        /*
            r5 = this;
            java.lang.String r5 = r6.f1341n
            r0 = 0
            if (r5 == 0) goto L82
            boolean r5 = p000.v51.m6579i(r5)
            if (r5 != 0) goto Ld
            goto L82
        Ld:
            java.lang.String r5 = r6.f1341n
            int r6 = p000.z42.f13274a
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r1) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r1 = "image/png"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r1 = "image/bmp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r1 = "image/webp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r1 = "image/jpeg"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r1 = "image/heif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r1 = "image/heic"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r1 = "image/avif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            switch(r4) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                default: goto L6e;
            }
        L6e:
            goto L7d
        L6f:
            r5 = 26
            if (r6 < r5) goto L7d
            goto L78
        L74:
            r5 = 34
            if (r6 < r5) goto L7d
        L78:
            int r5 = p000.AbstractC0828kh.m3828f(r2, r0, r0, r0)
            return r5
        L7d:
            int r5 = p000.AbstractC0828kh.m3828f(r3, r0, r0, r0)
            return r5
        L82:
            int r5 = p000.AbstractC0828kh.m3828f(r0, r0, r0, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ay0.m764C(be0):int");
    }

    /* JADX INFO: renamed from: D */
    public void m765D(int i, Object obj, qp1 qp1Var) {
        AbstractC1153np abstractC1153np = (AbstractC1153np) this.f1096b;
        abstractC1153np.mo3992w(i, 3);
        qp1Var.mo903d((y41) obj, abstractC1153np.f7492a);
        abstractC1153np.mo3992w(i, 4);
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public void mo766a(i31 i31Var, boolean z) {
        if (i31Var instanceof nx1) {
            ((nx1) i31Var).f7581z.mo3348k().m3340c(false);
        }
        f41 f41Var = ((C1540w3) this.f1096b).f11943e;
        if (f41Var != null) {
            f41Var.mo766a(i31Var, z);
        }
    }

    @Override // p000.lh0
    public AbstractC1356r4 apply() {
        return (AbstractC1356r4) this.f1096b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r2.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen") != false) goto L11;
     */
    @Override // p000.y01
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.z01 mo739b(p000.C1470u7 r3) {
        /*
            r2 = this;
            int r0 = p000.z42.f13274a
            r1 = 23
            if (r0 < r1) goto L40
            r1 = 31
            if (r0 < r1) goto Lb
            goto L1f
        Lb:
            java.lang.Object r2 = r2.f1096b
            com.example.ssmousepro.ads.RewardedVideoActivity r2 = (com.example.ssmousepro.ads.RewardedVideoActivity) r2
            r1 = 28
            if (r0 < r1) goto L40
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.amazon.hardware.tv_screen"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L40
        L1f:
            java.lang.Object r2 = r3.f11143c
            be0 r2 = (p000.be0) r2
            java.lang.String r2 = r2.f1341n
            int r2 = p000.v51.m6577g(r2)
            java.lang.String r0 = p000.z42.m7248v(r2)
            java.lang.String r1 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r0 = r1.concat(r0)
            p000.AbstractC1337qm.m5508C(r0)
            d8 r0 = new d8
            r0.<init>(r2)
            lb r2 = r0.mo739b(r3)
            return r2
        L40:
            ax0 r2 = new ax0
            r0 = 12
            r2.<init>(r0)
            z01 r2 = r2.mo739b(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ay0.mo739b(u7):z01");
    }

    @Override // p000.InterfaceC0803jt
    public C1120mt build() {
        return new C1120mt(new ay0(((ContentInfo.Builder) this.f1096b).build()));
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: c */
    public ClipData mo767c() {
        return ((ContentInfo) this.f1096b).getClip();
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public boolean mo768d(i31 i31Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC1651z3 interfaceC1651z3 = ((ActionMenuView) this.f1096b).f432F;
        if (interfaceC1651z3 != null) {
            Toolbar toolbar = ((h12) interfaceC1651z3).f4391a;
            if (toolbar.f507L.m4706a(menuItem)) {
                zOnMenuItemSelected = true;
            } else {
                l12 l12Var = toolbar.f509N;
                zOnMenuItemSelected = l12Var != null ? ((n12) l12Var).f7172a.f7612b.onMenuItemSelected(0, menuItem) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: e */
    public void mo769e(i31 i31Var, MenuItem menuItem) {
        ((ViewOnKeyListenerC1484ul) this.f1096b).f11335f.removeCallbacksAndMessages(i31Var);
    }

    @Override // p000.InterfaceC0803jt
    /* JADX INFO: renamed from: f */
    public void mo770f(Uri uri) {
        ((ContentInfo.Builder) this.f1096b).setLinkUri(uri);
    }

    @Override // p000.InterfaceC0803jt
    /* JADX INFO: renamed from: g */
    public void mo771g(int i) {
        ((ContentInfo.Builder) this.f1096b).setFlags(i);
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: h */
    public int mo772h() {
        return ((ContentInfo) this.f1096b).getFlags();
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: i */
    public ContentInfo mo773i() {
        return (ContentInfo) this.f1096b;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    public void mo774j(i31 i31Var) {
        g31 g31Var = ((ActionMenuView) this.f1096b).f427A;
        if (g31Var != null) {
            g31Var.mo774j(i31Var);
        }
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: k */
    public int mo775k() {
        return ((ContentInfo) this.f1096b).getSource();
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: l */
    public void mo776l(i31 i31Var, r31 r31Var) {
        ViewOnKeyListenerC1484ul viewOnKeyListenerC1484ul = (ViewOnKeyListenerC1484ul) this.f1096b;
        Handler handler = viewOnKeyListenerC1484ul.f11335f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1484ul.f11337m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (i31Var == ((C1447tl) arrayList.get(i)).f10902b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC1091m0(this, i2 < arrayList.size() ? (C1447tl) arrayList.get(i2) : null, r31Var, i31Var, 1), i31Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.j91
    /* JADX INFO: renamed from: m */
    public void mo777m(Object obj) {
        ms0 ms0Var = (ms0) obj;
        DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g = (DialogInterfaceOnCancelListenerC0043g) this.f1096b;
        if (ms0Var == null || !dialogInterfaceOnCancelListenerC0043g.mShowsDialog) {
            return;
        }
        View viewRequireView = dialogInterfaceOnCancelListenerC0043g.requireView();
        if (viewRequireView.getParent() != null) {
            f40.m2719o("DialogFragment can not be attached to a container view");
        } else if (dialogInterfaceOnCancelListenerC0043g.mDialog != null) {
            if (AbstractC0056t.m363G(3)) {
                Objects.toString(dialogInterfaceOnCancelListenerC0043g.mDialog);
            }
            dialogInterfaceOnCancelListenerC0043g.mDialog.setContentView(viewRequireView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: o */
    public String m779o(be0 be0Var) {
        String displayName;
        String str = be0Var.f1331d;
        String str2 = be0Var.f1329b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = z42.f13274a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM790z = m790z(displayName, m780p(be0Var));
        if (!TextUtils.isEmpty(strM790z)) {
            return strM790z;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX INFO: renamed from: p */
    public String m780p(be0 be0Var) {
        Resources resources = (Resources) this.f1096b;
        int i = be0Var.f1333f;
        int i2 = be0Var.f1333f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = m790z(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = m790z(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? m790z(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX INFO: renamed from: q */
    public C1539w2 mo781q(int i) {
        return null;
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: r */
    public boolean mo782r(i31 i31Var) {
        C1540w3 c1540w3 = (C1540w3) this.f1096b;
        if (i31Var == c1540w3.f11941c) {
            return false;
        }
        ((nx1) i31Var).f7580A.getClass();
        f41 f41Var = c1540w3.f11943e;
        if (f41Var != null) {
            return f41Var.mo782r(i31Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public C1539w2 mo783s(int i) {
        return null;
    }

    @Override // p000.InterfaceC0803jt
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1096b).setExtras(bundle);
    }

    /* JADX INFO: renamed from: t */
    public hg0 m784t() {
        return null;
    }

    public String toString() {
        switch (this.f1095a) {
            case 19:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1096b) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public a40 m785u() {
        return (a40) this.f1096b;
    }

    @Override // p000.ha1
    /* JADX INFO: renamed from: v */
    public bb2 mo786v(View view, bb2 bb2Var) {
        switch (this.f1095a) {
            case 11:
                AbstractDialogC1555wi abstractDialogC1555wi = (AbstractDialogC1555wi) this.f1096b;
                if (abstractDialogC1555wi.edgeToEdgeCallback != null) {
                    abstractDialogC1555wi.behavior.f1977W.remove(abstractDialogC1555wi.edgeToEdgeCallback);
                }
                abstractDialogC1555wi.edgeToEdgeCallback = new C1518vi(abstractDialogC1555wi.bottomSheet, bb2Var);
                abstractDialogC1555wi.edgeToEdgeCallback.m6628e(abstractDialogC1555wi.getWindow());
                BottomSheetBehavior bottomSheetBehavior = abstractDialogC1555wi.behavior;
                C1518vi c1518vi = abstractDialogC1555wi.edgeToEdgeCallback;
                ArrayList arrayList = bottomSheetBehavior.f1977W;
                if (!arrayList.contains(c1518vi)) {
                    arrayList.add(c1518vi);
                }
                break;
            default:
                ya2 ya2Var = bb2Var.f1285a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1096b;
                if (!i91.m3395a(coordinatorLayout.f597s, bb2Var)) {
                    coordinatorLayout.f597s = bb2Var;
                    boolean z = bb2Var.m964d() > 0;
                    coordinatorLayout.f598t = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!ya2Var.mo6262m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = i72.f4849a;
                            if (!s62.m5981b(childAt) || ((C1047ku) childAt.getLayoutParams()).f6007a == null || !ya2Var.mo6262m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return bb2Var;
    }

    /* JADX INFO: renamed from: w */
    public UUID m787w() {
        return AbstractC0794jk.f5433a;
    }

    /* JADX INFO: renamed from: x */
    public int m788x() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX INFO: renamed from: y */
    public String m789y(be0 be0Var) {
        String strM779o;
        String string;
        String strM6573c;
        Resources resources = (Resources) this.f1096b;
        String str = be0Var.f1341n;
        int i = be0Var.f1337j;
        int i2 = be0Var.f1317C;
        int i3 = be0Var.f1349v;
        int i4 = be0Var.f1348u;
        String str2 = be0Var.f1338k;
        int iM6577g = v51.m6577g(str);
        if (iM6577g == -1) {
            String str3 = null;
            if (str2 == null) {
                strM6573c = null;
                break;
            }
            String[] strArrM7225M = z42.m7225M(str2);
            int length = strArrM7225M.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    strM6573c = null;
                    break;
                }
                strM6573c = v51.m6573c(strArrM7225M[i5]);
                if (strM6573c != null && v51.m6581k(strM6573c)) {
                    break;
                }
                i5++;
            }
            if (strM6573c == null) {
                if (str2 != null) {
                    for (String str4 : z42.m7225M(str2)) {
                        String strM6573c2 = v51.m6573c(str4);
                        if (strM6573c2 != null && v51.m6578h(strM6573c2)) {
                            str3 = strM6573c2;
                            break;
                        }
                    }
                }
                if (str3 != null) {
                    iM6577g = 1;
                } else if (i4 != -1 || i3 != -1) {
                    iM6577g = 2;
                } else if (i2 == -1 && be0Var.f1318D == -1) {
                    iM6577g = -1;
                } else {
                    iM6577g = 1;
                }
            } else {
                iM6577g = 2;
            }
        }
        if (iM6577g == 2) {
            strM779o = m790z(m780p(be0Var), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (iM6577g == 1) {
            String strM779o2 = m779o(be0Var);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strM779o = m790z(strM779o2, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strM779o = m779o(be0Var);
        }
        if (strM779o.length() != 0) {
            return strM779o;
        }
        String str5 = be0Var.f1331d;
        return (str5 == null || str5.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str5);
    }

    /* JADX INFO: renamed from: z */
    public String m790z(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f1096b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: B */
    public void m763B(c40 c40Var) {
    }

    /* JADX INFO: renamed from: n */
    public void m778n(c40 c40Var) {
    }

    public ay0(AbstractC1153np abstractC1153np) {
        this.f1095a = 16;
        no0.m4572a(abstractC1153np, "output");
        this.f1096b = abstractC1153np;
        abstractC1153np.f7492a = this;
    }

    public ay0(Resources resources) {
        this.f1095a = 23;
        resources.getClass();
        this.f1096b = resources;
    }

    public ay0(C1474ub c1474ub) {
        this.f1095a = 6;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = z42.f13274a;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f1096b = usage.build();
    }

    public ay0(TextView textView) {
        this.f1095a = 26;
        this.f1096b = new f60(textView);
    }

    public /* synthetic */ ay0(Object obj, int i) {
        this.f1095a = i;
        this.f1096b = obj;
    }

    public ay0(EditText editText) {
        this.f1095a = 25;
        this.f1096b = new C0558d8(editText, 20);
    }

    public ay0(ContentInfo contentInfo) {
        this.f1095a = 19;
        contentInfo.getClass();
        this.f1096b = AbstractC1585xb.m6906y(contentInfo);
    }

    public ay0(ClipData clipData, int i) {
        this.f1095a = 18;
        this.f1096b = AbstractC1585xb.m6890i(clipData, i);
    }
}
