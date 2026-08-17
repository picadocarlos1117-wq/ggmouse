package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p000.C0694gy;
import p000.f40;
import p000.ql0;
import p000.sl0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f609k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f610a;

    /* JADX INFO: renamed from: b */
    public Object f611b;

    /* JADX INFO: renamed from: c */
    public byte[] f612c;

    /* JADX INFO: renamed from: d */
    public Parcelable f613d;

    /* JADX INFO: renamed from: e */
    public int f614e;

    /* JADX INFO: renamed from: f */
    public int f615f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f616g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f617h;

    /* JADX INFO: renamed from: i */
    public String f618i;

    /* JADX INFO: renamed from: j */
    public String f619j;

    /* JADX INFO: renamed from: a */
    public static IconCompat m306a(int i) {
        if (i == 0) {
            f40.m2713i("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f612c = null;
        iconCompat.f613d = null;
        iconCompat.f615f = 0;
        iconCompat.f616g = null;
        iconCompat.f617h = f609k;
        iconCompat.f618i = null;
        iconCompat.f610a = 2;
        iconCompat.f614e = i;
        iconCompat.f611b = "";
        iconCompat.f619j = "";
        return iconCompat;
    }

    /* JADX INFO: renamed from: b */
    public final int m307b() {
        int i = this.f610a;
        if (i == -1) {
            return sl0.m6112a(this.f611b);
        }
        if (i == 2) {
            return this.f614e;
        }
        C0694gy.m3081g(this, "called getResId() on ");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m308c() {
        int i = this.f610a;
        if (i == -1) {
            return ql0.m5503a(this.f611b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f611b);
        }
        C0694gy.m3081g(this, "called getUri() on ");
        return null;
    }

    public final String toString() {
        String str;
        if (this.f610a == -1) {
            return String.valueOf(this.f611b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f610a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f610a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f611b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f611b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f619j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m307b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f614e);
                if (this.f615f != 0) {
                    sb.append(" off=");
                    sb.append(this.f615f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f611b);
                break;
        }
        if (this.f616g != null) {
            sb.append(" tint=");
            sb.append(this.f616g);
        }
        if (this.f617h != f609k) {
            sb.append(" mode=");
            sb.append(this.f617h);
        }
        sb.append(")");
        return sb.toString();
    }
}
