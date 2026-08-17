package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pl1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8932a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f8933b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f8934c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX INFO: renamed from: a */
    public static Typeface m5280a(Context context, int i, TypedValue typedValue, int i2, AbstractC1337qm abstractC1337qm, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM5441a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            hw0 hw0Var = q32.f9323b;
            Typeface typeface = (Typeface) hw0Var.get(q32.m5442b(resources, i, string, i3, i2));
            int i4 = 27;
            if (typeface != null) {
                if (abstractC1337qm != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1467u4(i4, abstractC1337qm, typeface));
                }
                typefaceM5441a = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ud0 ud0VarM6428J = ua0.m6428J(resources.getXml(i), resources);
                        if (ud0VarM6428J == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC1337qm != null) {
                                abstractC1337qm.m5564g(-3);
                            }
                        } else {
                            typefaceM5441a = q32.m5441a(context, ud0VarM6428J, resources, i, string, typedValue.assetCookie, i2, abstractC1337qm, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo3232j = q32.f9322a.mo3232j(context, resources, i, string);
                        if (typefaceMo3232j != null) {
                            hw0Var.put(q32.m5442b(resources, i, string, i5, i2), typefaceMo3232j);
                        }
                        if (abstractC1337qm != null) {
                            if (typefaceMo3232j != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC1467u4(i4, abstractC1337qm, typefaceMo3232j));
                            } else {
                                abstractC1337qm.m5564g(-3);
                            }
                        }
                        typefaceM5441a = typefaceMo3232j;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC1337qm != null) {
                        abstractC1337qm.m5564g(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC1337qm != null) {
                        abstractC1337qm.m5564g(-3);
                    }
                }
            }
        } else if (abstractC1337qm != null) {
            abstractC1337qm.m5564g(-3);
        }
        if (typefaceM5441a != null || abstractC1337qm != null || z2) {
            return typefaceM5441a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
