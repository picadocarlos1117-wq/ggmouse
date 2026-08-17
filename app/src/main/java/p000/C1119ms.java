package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.HashMap;

/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1119ms {

    /* JADX INFO: renamed from: a */
    public boolean f7086a = false;

    /* JADX INFO: renamed from: b */
    public int f7087b;

    /* JADX INFO: renamed from: c */
    public int f7088c;

    /* JADX INFO: renamed from: d */
    public float f7089d;

    /* JADX INFO: renamed from: e */
    public String f7090e;

    /* JADX INFO: renamed from: f */
    public boolean f7091f;

    /* JADX INFO: renamed from: g */
    public int f7092g;

    public C1119ms(C1119ms c1119ms, Object obj) {
        c1119ms.getClass();
        this.f7087b = c1119ms.f7087b;
        m4452b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m4451a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), di1.f2941d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, TouchPipeline.SIZE), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, TouchPipeline.SIZE));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            C1119ms c1119ms = new C1119ms();
            c1119ms.f7087b = i;
            c1119ms.f7086a = z;
            c1119ms.m4452b(objValueOf);
            map.put(string, c1119ms);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m4452b(Object obj) {
        switch (AbstractC1308pu.m5359z(this.f7087b)) {
            case 0:
            case 7:
                this.f7088c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f7089d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f7092g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f7090e = (String) obj;
                break;
            case 5:
                this.f7091f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f7089d = ((Float) obj).floatValue();
                break;
        }
    }
}
