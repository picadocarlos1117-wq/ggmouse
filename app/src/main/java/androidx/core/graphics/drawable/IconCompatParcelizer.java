package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.f40;
import p000.r52;
import p000.s52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(r52 r52Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f610a = -1;
        iconCompat.f612c = null;
        iconCompat.f613d = null;
        iconCompat.f614e = 0;
        iconCompat.f615f = 0;
        iconCompat.f616g = null;
        iconCompat.f617h = IconCompat.f609k;
        iconCompat.f618i = null;
        iconCompat.f610a = r52Var.m5709f(-1, 1);
        byte[] bArr = iconCompat.f612c;
        if (r52Var.mo5708e(2)) {
            Parcel parcel = ((s52) r52Var).f10239e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f612c = bArr;
        iconCompat.f613d = r52Var.m5710g(iconCompat.f613d, 3);
        iconCompat.f614e = r52Var.m5709f(iconCompat.f614e, 4);
        iconCompat.f615f = r52Var.m5709f(iconCompat.f615f, 5);
        iconCompat.f616g = (ColorStateList) r52Var.m5710g(iconCompat.f616g, 6);
        String string = iconCompat.f618i;
        if (r52Var.mo5708e(7)) {
            string = ((s52) r52Var).f10239e.readString();
        }
        iconCompat.f618i = string;
        String string2 = iconCompat.f619j;
        if (r52Var.mo5708e(8)) {
            string2 = ((s52) r52Var).f10239e.readString();
        }
        iconCompat.f619j = string2;
        iconCompat.f617h = PorterDuff.Mode.valueOf(iconCompat.f618i);
        switch (iconCompat.f610a) {
            case -1:
                Parcelable parcelable = iconCompat.f613d;
                if (parcelable != null) {
                    iconCompat.f611b = parcelable;
                    return iconCompat;
                }
                f40.m2713i("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f613d;
                if (parcelable2 != null) {
                    iconCompat.f611b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f612c;
                iconCompat.f611b = bArr3;
                iconCompat.f610a = 3;
                iconCompat.f614e = 0;
                iconCompat.f615f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f612c, Charset.forName("UTF-16"));
                iconCompat.f611b = str;
                if (iconCompat.f610a == 2 && iconCompat.f619j == null) {
                    iconCompat.f619j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f611b = iconCompat.f612c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, r52 r52Var) {
        r52Var.getClass();
        iconCompat.f618i = iconCompat.f617h.name();
        switch (iconCompat.f610a) {
            case -1:
                iconCompat.f613d = (Parcelable) iconCompat.f611b;
                break;
            case 1:
            case 5:
                iconCompat.f613d = (Parcelable) iconCompat.f611b;
                break;
            case 2:
                iconCompat.f612c = ((String) iconCompat.f611b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f612c = (byte[]) iconCompat.f611b;
                break;
            case 4:
            case 6:
                iconCompat.f612c = iconCompat.f611b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f610a;
        if (-1 != i) {
            r52Var.m5713j(i, 1);
        }
        byte[] bArr = iconCompat.f612c;
        if (bArr != null) {
            r52Var.mo5712i(2);
            Parcel parcel = ((s52) r52Var).f10239e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f613d;
        if (parcelable != null) {
            r52Var.m5714k(parcelable, 3);
        }
        int i2 = iconCompat.f614e;
        if (i2 != 0) {
            r52Var.m5713j(i2, 4);
        }
        int i3 = iconCompat.f615f;
        if (i3 != 0) {
            r52Var.m5713j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f616g;
        if (colorStateList != null) {
            r52Var.m5714k(colorStateList, 6);
        }
        String str = iconCompat.f618i;
        if (str != null) {
            r52Var.mo5712i(7);
            ((s52) r52Var).f10239e.writeString(str);
        }
        String str2 = iconCompat.f619j;
        if (str2 != null) {
            r52Var.mo5712i(8);
            ((s52) r52Var).f10239e.writeString(str2);
        }
    }
}
