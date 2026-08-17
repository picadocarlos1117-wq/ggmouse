package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r32 extends hp0 {

    /* JADX INFO: renamed from: A */
    public static Constructor f9697A = null;

    /* JADX INFO: renamed from: B */
    public static Method f9698B = null;

    /* JADX INFO: renamed from: C */
    public static Method f9699C = null;

    /* JADX INFO: renamed from: D */
    public static boolean f9700D = false;

    /* JADX INFO: renamed from: z */
    public static Class f9701z;

    /* JADX INFO: renamed from: s */
    public final Class f9702s;

    /* JADX INFO: renamed from: t */
    public final Constructor f9703t;

    /* JADX INFO: renamed from: u */
    public final Method f9704u;

    /* JADX INFO: renamed from: v */
    public final Method f9705v;

    /* JADX INFO: renamed from: w */
    public final Method f9706w;

    /* JADX INFO: renamed from: x */
    public final Method f9707x;

    /* JADX INFO: renamed from: y */
    public final Method f9708y;

    public r32() throws NoSuchMethodException {
        Method methodM5684a0;
        Constructor<?> constructor;
        Method methodM5683Z;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM5683Z = m5683Z(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM5684a0 = m5684a0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodM5684a0 = null;
            constructor = null;
            methodM5683Z = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f9702s = cls;
        this.f9703t = constructor;
        this.f9704u = methodM5683Z;
        this.f9705v = method;
        this.f9706w = method2;
        this.f9707x = method3;
        this.f9708y = methodM5684a0;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m5681V(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m5682Y();
        try {
            return ((Boolean) f9698B.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            ca0.m1184p(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m5682Y() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9700D) {
            return;
        }
        f9700D = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f9697A = constructor;
        f9701z = cls;
        f9698B = method2;
        f9699C = method;
    }

    /* JADX INFO: renamed from: Z */
    public static Method m5683Z(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: a0 */
    public static Method m5684a0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m5685U(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9704u.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: W */
    public final Typeface m5686W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f9702s, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f9708y.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ca0.m1184p(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m5687X(Object obj) {
        try {
            return ((Boolean) this.f9706w.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: h */
    public final Typeface mo3230h(Context context, vd0 vd0Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        wd0[] wd0VarArr = vd0Var.f11637a;
        Method method = this.f9704u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            m5682Y();
            try {
                Object objNewInstance2 = f9697A.newInstance(null);
                for (wd0 wd0Var : wd0VarArr) {
                    File fileM4645P = o21.m4645P(context);
                    if (fileM4645P != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(wd0Var.f12072f);
                                try {
                                    boolean zM4683u = o21.m4683u(fileM4645P, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zM4683u) {
                                        fileM4645P.delete();
                                        return null;
                                    }
                                    if (!m5681V(objNewInstance2, fileM4645P.getPath(), wd0Var.f12068b, wd0Var.f12069c)) {
                                        fileM4645P.delete();
                                        return null;
                                    }
                                    fileM4645P.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileM4645P.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileM4645P.delete();
                            throw th4;
                        }
                    }
                }
                m5682Y();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f9701z, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f9699C.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    ca0.m1184p(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                ca0.m1184p(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f9703t.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = wd0VarArr.length;
            while (i2 < length) {
                wd0 wd0Var2 = wd0VarArr[i2];
                r32 r32Var = this;
                Context context2 = context;
                if (r32Var.m5685U(context2, objNewInstance, wd0Var2.f12067a, wd0Var2.f12071e, wd0Var2.f12068b, wd0Var2.f12069c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(wd0Var2.f12070d))) {
                    i2++;
                    this = r32Var;
                    context = context2;
                } else {
                    try {
                        r32Var.f9707x.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            r32 r32Var2 = this;
            if (r32Var2.m5687X(objNewInstance)) {
                return r32Var2.m5686W(objNewInstance);
            }
        }
        return null;
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: i */
    public final Typeface mo3231i(Context context, yd0[] yd0VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceM5686W;
        boolean zBooleanValue;
        if (yd0VarArr.length >= 1) {
            Method method = this.f9704u;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (yd0 yd0Var : yd0VarArr) {
                        if (yd0Var.f12964e == 0) {
                            Uri uri = yd0Var.f12960a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, o21.m4653X(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f9703t.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = yd0VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f9707x;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m5687X(objNewInstance) || (typefaceM5686W = m5686W(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceM5686W, i);
                            }
                            yd0 yd0Var2 = yd0VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(yd0Var2.f12960a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f9705v.invoke(objNewInstance, byteBuffer, Integer.valueOf(yd0Var2.f12961b), null, Integer.valueOf(yd0Var2.f12962c), Integer.valueOf(yd0Var2.f12963d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    yd0 yd0Var3 = null;
                    for (yd0 yd0Var4 : yd0VarArr) {
                        int iAbs = (Math.abs(yd0Var4.f12962c - i3) * 2) + (yd0Var4.f12963d == z2 ? 0 : 1);
                        if (yd0Var3 == null || i4 > iAbs) {
                            yd0Var3 = yd0Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(yd0Var3.f12960a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(yd0Var3.f12962c).setItalic(yd0Var3.f12963d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: j */
    public final Typeface mo3232j(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f9704u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f9703t.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m5685U(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f9707x.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m5687X(objNewInstance)) {
                    return m5686W(objNewInstance);
                }
            }
        } else {
            File fileM4645P = o21.m4645P(context);
            try {
                if (fileM4645P != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zM4683u = o21.m4683u(fileM4645P, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zM4683u) {
                                fileM4645P.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM4645P.getPath());
                            fileM4645P.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileM4645P.delete();
            }
        }
        return null;
    }
}
