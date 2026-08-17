package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: kt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1046kt implements InterfaceC0803jt, InterfaceC1083lt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5998a = 0;

    /* JADX INFO: renamed from: b */
    public ClipData f5999b;

    /* JADX INFO: renamed from: c */
    public int f6000c;

    /* JADX INFO: renamed from: d */
    public int f6001d;

    /* JADX INFO: renamed from: e */
    public Uri f6002e;

    /* JADX INFO: renamed from: f */
    public Bundle f6003f;

    public C1046kt(C1046kt c1046kt) {
        ClipData clipData = c1046kt.f5999b;
        clipData.getClass();
        this.f5999b = clipData;
        int i = c1046kt.f6000c;
        if (i < 0) {
            Locale locale = Locale.US;
            f40.m2713i("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            f40.m2713i("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f6000c = i;
        int i2 = c1046kt.f6001d;
        if ((i2 & 1) != i2) {
            f40.m2715k("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.f6001d = i2;
        this.f6002e = c1046kt.f6002e;
        this.f6003f = c1046kt.f6003f;
    }

    @Override // p000.InterfaceC0803jt
    public C1120mt build() {
        return new C1120mt(new C1046kt(this));
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: c */
    public ClipData mo767c() {
        return this.f5999b;
    }

    @Override // p000.InterfaceC0803jt
    /* JADX INFO: renamed from: f */
    public void mo770f(Uri uri) {
        this.f6002e = uri;
    }

    @Override // p000.InterfaceC0803jt
    /* JADX INFO: renamed from: g */
    public void mo771g(int i) {
        this.f6001d = i;
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: h */
    public int mo772h() {
        return this.f6001d;
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: i */
    public ContentInfo mo773i() {
        return null;
    }

    @Override // p000.InterfaceC1083lt
    /* JADX INFO: renamed from: k */
    public int mo775k() {
        return this.f6000c;
    }

    @Override // p000.InterfaceC0803jt
    public void setExtras(Bundle bundle) {
        this.f6003f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f5998a) {
            case 1:
                Uri uri = this.f6002e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f5999b.getDescription());
                sb.append(", source=");
                int i = this.f6000c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f6001d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1308pu.m5342i(sb, this.f6003f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1046kt() {
    }
}
