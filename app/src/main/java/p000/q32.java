package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q32 {

    /* JADX INFO: renamed from: a */
    public static final hp0 f9322a;

    /* JADX INFO: renamed from: b */
    public static final hw0 f9323b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9322a = new s32();
        } else {
            f9322a = new r32();
        }
        f9323b = new hw0(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static Typeface m5441a(Context context, ud0 ud0Var, Resources resources, int i, String str, int i2, int i3, AbstractC1337qm abstractC1337qm, boolean z) {
        Typeface typefaceMo3230h;
        Typeface typefaceCreate;
        int i4 = 27;
        int i5 = -3;
        if (ud0Var instanceof xd0) {
            xd0 xd0Var = (xd0) ud0Var;
            String str2 = xd0Var.f12585d;
            Typeface typeface = null;
            boolean z2 = false;
            byte b = 0;
            byte b2 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC1337qm != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1467u4(i4, abstractC1337qm, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i6 = 1;
            byte b3 = !z ? abstractC1337qm != null : xd0Var.f12584c != 0;
            int i7 = z ? xd0Var.f12583b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            pn0 pn0Var = new pn0();
            pn0Var.f8968a = abstractC1337qm;
            hv0 hv0Var = xd0Var.f12582a;
            C0558d8 c0558d8 = new C0558d8(9, pn0Var, handler);
            int i8 = 3;
            if (b3 == true) {
                hw0 hw0Var = sd0.f10366a;
                String str3 = ((String) hv0Var.f4725f) + "-" + i3;
                Typeface typeface2 = (Typeface) sd0.f10366a.get(str3);
                if (typeface2 != null) {
                    handler.post(new RunnableC1466u3(pn0Var, typeface2, i8, z2));
                    typeface = typeface2;
                } else if (i7 == -1) {
                    rd0 rd0VarM6084a = sd0.m6084a(str3, context, hv0Var, i3);
                    c0558d8.m2259H(rd0VarM6084a);
                    typeface = rd0VarM6084a.f9908a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    rd0 rd0Var = (rd0) sd0.f10367b.submit(new pd0(str3, context, hv0Var, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                    c0558d8.m2259H(rd0Var);
                                    typeface = rd0Var.f9908a;
                                } catch (InterruptedException e) {
                                    throw e;
                                }
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0558d8.f2822c).post(new RunnableC0120c2(i5, i6, (pn0) c0558d8.f2821b));
                    }
                }
            } else {
                hw0 hw0Var2 = sd0.f10366a;
                String str4 = ((String) hv0Var.f4725f) + "-" + i3;
                Typeface typeface3 = (Typeface) sd0.f10366a.get(str4);
                if (typeface3 != null) {
                    handler.post(new RunnableC1466u3(pn0Var, typeface3, i8, b2 == true ? 1 : 0));
                    typeface = typeface3;
                } else {
                    qd0 qd0Var = new qd0(c0558d8, b == true ? 1 : 0);
                    synchronized (sd0.f10368c) {
                        try {
                            zs1 zs1Var = sd0.f10369d;
                            ArrayList arrayList = (ArrayList) zs1Var.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(qd0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(qd0Var);
                                zs1Var.put(str4, arrayList2);
                                pd0 pd0Var = new pd0(str4, context, hv0Var, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = sd0.f10367b;
                                qd0 qd0Var2 = new qd0(str4, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                i10 i10Var = new i10();
                                i10Var.f4770c = pd0Var;
                                i10Var.f4769b = qd0Var2;
                                i10Var.f4771d = handler2;
                                threadPoolExecutor.execute(i10Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            typefaceMo3230h = typeface;
        } else {
            typefaceMo3230h = f9322a.mo3230h(context, (vd0) ud0Var, resources, i3);
            if (abstractC1337qm != null) {
                if (typefaceMo3230h != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1467u4(i4, abstractC1337qm, typefaceMo3230h));
                } else {
                    abstractC1337qm.m5564g(-3);
                }
            }
        }
        if (typefaceMo3230h != null) {
            f9323b.put(m5442b(resources, i, str, i2, i3), typefaceMo3230h);
        }
        return typefaceMo3230h;
    }

    /* JADX INFO: renamed from: b */
    public static String m5442b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
