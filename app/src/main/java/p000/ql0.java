package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ql0 {
    /* JADX INFO: renamed from: a */
    public static Uri m5503a(Object obj) {
        return sl0.m6115d(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m5504b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX INFO: renamed from: c */
    public static Icon m5505c(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        String strM6113b;
        InputStream inputStreamOpenInputStream;
        int i = iconCompat.f610a;
        switch (i) {
            case -1:
                return (Icon) iconCompat.f611b;
            case 0:
            default:
                f40.m2713i("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f611b);
                break;
            case 2:
                if (i == -1) {
                    strM6113b = sl0.m6113b(iconCompat.f611b);
                } else {
                    if (i != 2) {
                        C0694gy.m3081g(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.f619j;
                    strM6113b = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f611b).split(":", -1)[0] : iconCompat.f619j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM6113b, iconCompat.f614e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f611b, iconCompat.f614e, iconCompat.f615f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f611b);
                break;
            case 5:
                iconCreateWithBitmap = rl0.m5858b((Bitmap) iconCompat.f611b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = tl0.m6289a(iconCompat.m308c());
                } else {
                    if (context == null) {
                        l41.m4052u(iconCompat.m308c(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriM308c = iconCompat.m308c();
                    String scheme = uriM308c.getScheme();
                    if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM308c);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM308c, e);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f611b));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM308c, e2);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        l41.m4050s(iconCompat.m308c(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = rl0.m5858b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f616g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f617h;
        if (mode != IconCompat.f609k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
