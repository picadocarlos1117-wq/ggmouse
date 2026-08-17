package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f6552e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f6553f;

    /* JADX INFO: renamed from: a */
    public final Object[] f6554a;

    /* JADX INFO: renamed from: b */
    public final Object[] f6555b;

    /* JADX INFO: renamed from: c */
    public final Context f6556c;

    /* JADX INFO: renamed from: d */
    public Object f6557d;

    static {
        Class[] clsArr = {Context.class};
        f6552e = clsArr;
        f6553f = clsArr;
    }

    public ly1(Context context) {
        super(context);
        this.f6556c = context;
        Object[] objArr = {context};
        this.f6554a = objArr;
        this.f6555b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m4331a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4331a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m4332b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        ky1 ky1Var = new ky1(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    l41.m4048q("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                l41.m4048q("Unexpected end of document");
                return;
            }
            Menu menu2 = ky1Var.f6085a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f6556c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ki1.f5861p);
                        ky1Var.f6086b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        ky1Var.f6087c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        ky1Var.f6088d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        ky1Var.f6089e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        ky1Var.f6090f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        ky1Var.f6091g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ki1.f5862q);
                        ky1Var.f6093i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        ky1Var.f6094j = (typedArrayObtainStyledAttributes2.getInt(5, ky1Var.f6087c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, ky1Var.f6088d) & 65535);
                        ky1Var.f6095k = typedArrayObtainStyledAttributes2.getText(7);
                        ky1Var.f6096l = typedArrayObtainStyledAttributes2.getText(8);
                        ky1Var.f6097m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        ky1Var.f6098n = string == null ? (char) 0 : string.charAt(0);
                        ky1Var.f6099o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        ky1Var.f6100p = string2 == null ? (char) 0 : string2.charAt(0);
                        ky1Var.f6101q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            ky1Var.f6102r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            ky1Var.f6102r = ky1Var.f6089e;
                        }
                        ky1Var.f6103s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        ky1Var.f6104t = typedArrayObtainStyledAttributes2.getBoolean(4, ky1Var.f6090f);
                        ky1Var.f6105u = typedArrayObtainStyledAttributes2.getBoolean(1, ky1Var.f6091g);
                        ky1Var.f6106v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        ky1Var.f6109y = typedArrayObtainStyledAttributes2.getString(12);
                        ky1Var.f6107w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        ky1Var.f6108x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && ky1Var.f6107w == 0 && ky1Var.f6108x == null) {
                            ky1Var.f6110z = (s31) ky1Var.m4009a(string3, f6553f, this.f6555b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            ky1Var.f6110z = null;
                        }
                        ky1Var.f6080A = typedArrayObtainStyledAttributes2.getText(17);
                        ky1Var.f6081B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            ky1Var.f6083D = x30.m6865b(typedArrayObtainStyledAttributes2.getInt(19, -1), ky1Var.f6083D);
                        } else {
                            ky1Var.f6083D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            ky1Var.f6082C = colorStateList;
                        } else {
                            ky1Var.f6082C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        ky1Var.f6092h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        ky1Var.f6092h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(ky1Var.f6086b, ky1Var.f6093i, ky1Var.f6094j, ky1Var.f6095k);
                        ky1Var.m4010b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m4332b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        ky1Var.f6086b = 0;
                        ky1Var.f6087c = 0;
                        ky1Var.f6088d = 0;
                        ky1Var.f6089e = 0;
                        ky1Var.f6090f = true;
                        ky1Var.f6091g = true;
                    } else if (name3.equals("item")) {
                        if (!ky1Var.f6092h) {
                            s31 s31Var = ky1Var.f6110z;
                            if (s31Var == null || !s31Var.f10214a.hasSubMenu()) {
                                ky1Var.f6092h = true;
                                ky1Var.m4010b(menu2.add(ky1Var.f6086b, ky1Var.f6093i, ky1Var.f6094j, ky1Var.f6095k));
                            } else {
                                ky1Var.f6092h = true;
                                ky1Var.m4010b(menu2.addSubMenu(ky1Var.f6086b, ky1Var.f6093i, ky1Var.f6094j, ky1Var.f6095k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i31)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f6556c.getResources().getLayout(i);
                    m4332b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
