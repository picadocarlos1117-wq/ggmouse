package p000;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC0053q;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import androidx.fragment.app.C0061y;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0558d8 implements InterfaceC0005a4, InterfaceC0559d9, y01, InterfaceC0769ix, InterfaceC1075ll {

    /* JADX INFO: renamed from: d */
    public static final int[] f2818d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: e */
    public static final ax0 f2819e = new ax0(13);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2820a;

    /* JADX INFO: renamed from: b */
    public Object f2821b;

    /* JADX INFO: renamed from: c */
    public Object f2822c;

    public C0558d8(Context context) {
        this.f2820a = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ki0.m3851V(context, com.sousasantoslogic.sspro.R.attr.materialCalendarStyle, qz0.class.getCanonicalName()).data, ji1.f5403k);
        bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM4639H = o21.m4639H(context, typedArrayObtainStyledAttributes, 7);
        this.f2821b = bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2822c = bz1.m1076a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM4639H.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: C */
    public static int m2251C(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2252k(Editable editable, KeyEvent keyEvent, boolean z) {
        u32[] u32VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (u32VarArr = (u32[]) editable.getSpans(selectionStart, selectionEnd, u32.class)) != null && u32VarArr.length > 0) {
                for (u32 u32Var : u32VarArr) {
                    int spanStart = editable.getSpanStart(u32Var);
                    int spanEnd = editable.getSpanEnd(u32Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public KeyListener m2253A(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0558d8) ((ay0) this.f2822c).f1096b).getClass();
        if (keyListener instanceof b60) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new b60(keyListener);
    }

    /* JADX INFO: renamed from: B */
    public synchronized Map m2254B() {
        try {
            if (((Map) this.f2822c) == null) {
                this.f2822c = Collections.unmodifiableMap(new HashMap((HashMap) this.f2821b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f2822c;
    }

    /* JADX INFO: renamed from: D */
    public boolean m2255D(CharSequence charSequence, int i, int i2, c60 c60Var) {
        if (c60Var.f1681c == 0) {
            C0658fz c0658fz = (C0658fz) this.f2822c;
            p51 p51VarM1136b = c60Var.m1136b();
            int iM2406a = p51VarM1136b.m2406a(8);
            if (iM2406a != 0) {
                ((ByteBuffer) p51VarM1136b.f3076d).getShort(iM2406a + p51VarM1136b.f3073a);
            }
            c0658fz.getClass();
            ThreadLocal threadLocal = C0658fz.f3927b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0658fz.f3928a;
            String string = sb.toString();
            int i3 = ac1.f140a;
            c60Var.f1681c = zb1.m7300a(textPaint, string) ? 2 : 1;
        }
        return c60Var.f1681c == 2;
    }

    /* JADX INFO: renamed from: E */
    public void m2256E() {
        ((SparseIntArray) this.f2821b).clear();
    }

    /* JADX INFO: renamed from: F */
    public void mo2257F(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.f2820a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2821b;
                C1174o9 c1174o9M4734Q = C1174o9.m4734Q(absSeekBar.getContext(), attributeSet, f2818d, i);
                Drawable drawableM4737A = c1174o9M4734Q.m4737A(0);
                if (drawableM4737A != null) {
                    if (drawableM4737A instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM4737A;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM2264M = m2264M(animationDrawable.getFrame(i2), true);
                            drawableM2264M.setLevel(10000);
                            animationDrawable2.addFrame(drawableM2264M, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM4737A = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM4737A);
                }
                Drawable drawableM4737A2 = c1174o9M4734Q.m4737A(1);
                if (drawableM4737A2 != null) {
                    absSeekBar.setProgressDrawable(m2264M(drawableM4737A2, false));
                }
                c1174o9M4734Q.m4753T();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2821b).getContext().obtainStyledAttributes(attributeSet, ki1.f5854i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m2262K(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: G */
    public y50 m2258G(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ay0 ay0Var = (ay0) this.f2822c;
        if (inputConnection == null) {
            ay0Var.getClass();
            inputConnection2 = null;
        } else {
            C0558d8 c0558d8 = (C0558d8) ay0Var.f1096b;
            c0558d8.getClass();
            if (!(inputConnection instanceof y50)) {
                inputConnection = new y50(editorInfo, inputConnection, (EditText) c0558d8.f2821b);
            }
            inputConnection2 = inputConnection;
        }
        return (y50) inputConnection2;
    }

    /* JADX INFO: renamed from: H */
    public void m2259H(rd0 rd0Var) {
        Handler handler = (Handler) this.f2822c;
        pn0 pn0Var = (pn0) this.f2821b;
        int i = rd0Var.f9909b;
        if (i == 0) {
            handler.post(new RunnableC1466u3(pn0Var, rd0Var.f9908a, 3, false));
        } else {
            handler.post(new RunnableC0120c2(i, 1, pn0Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: I */
    public void m2260I(Context context, XmlResourceParser xmlResourceParser) {
        C1602xs c1602xs = new C1602xs();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C1417ss c1417ssM6948d = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (c1417ssM6948d == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1417ssM6948d.f10520d.m6334a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (c1417ssM6948d == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1417ssM6948d.f10519c.m6528a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c1417ssM6948d = C1602xs.m6948d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (c1417ssM6948d == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1417ssM6948d.f10518b.m6655a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (c1417ssM6948d == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        c1417ssM6948d.f10521e.m6825a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c1417ssM6948d = C1602xs.m6948d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c1417ssM6948d.f10520d.f10969a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (c1417ssM6948d != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C1119ms.m4451a(context, xmlResourceParser, c1417ssM6948d.f10522f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c1417ssM6948d = C1602xs.m6948d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        c1417ssM6948d.f10520d.f10984h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (c1417ssM6948d != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        C1119ms.m4451a(context, xmlResourceParser, c1417ssM6948d.f10522f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c1417ssM6948d = C1602xs.m6948d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c1602xs.f12703c.put(Integer.valueOf(c1417ssM6948d.f10517a), c1417ssM6948d);
                                        c1417ssM6948d = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c1602xs.f12703c.put(Integer.valueOf(c1417ssM6948d.f10517a), c1417ssM6948d);
                                        c1417ssM6948d = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c1602xs.f12703c.put(Integer.valueOf(c1417ssM6948d.f10517a), c1417ssM6948d);
                                        c1417ssM6948d = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f2822c).put(identifier, c1602xs);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.f2822c).put(identifier, c1602xs);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m2261J(C1400sb c1400sb, Object obj) {
        if (((IdentityHashMap) this.f2822c) == null) {
            this.f2822c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f2822c).put(c1400sb, obj);
    }

    /* JADX INFO: renamed from: K */
    public void m2262K(boolean z) {
        h60 h60Var = (h60) ((C0558d8) ((ay0) this.f2822c).f1096b).f2822c;
        if (h60Var.f4457c != z) {
            if (h60Var.f4456b != null) {
                t50 t50VarM6231a = t50.m6231a();
                g60 g60Var = h60Var.f4456b;
                t50VarM6231a.getClass();
                rc2.m5789j(g60Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = t50VarM6231a.f10754a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    t50VarM6231a.f10755b.remove(g60Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            h60Var.f4457c = z;
            if (z) {
                h60.m3109a(h60Var.f4455a, t50.m6231a().m6232b());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m2263L(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f2822c;
        cardView.f555d.set(i, i2, i3, i4);
        Rect rect = cardView.f554c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: M */
    public Drawable m2264M(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f2822c) == null) {
                this.f2822c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m2264M(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: a */
    public boolean mo69a(AbstractC0086b4 abstractC0086b4, MenuItem menuItem) {
        return ((InterfaceC0005a4) this.f2821b).mo69a(abstractC0086b4, menuItem);
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: c */
    public void mo70c(AbstractC0086b4 abstractC0086b4) {
        ((InterfaceC0005a4) this.f2821b).mo70c(abstractC0086b4);
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) this.f2822c;
        if (layoutInflaterFactory2C1359r7.f9754B != null) {
            layoutInflaterFactory2C1359r7.f9793q.getDecorView().removeCallbacks(layoutInflaterFactory2C1359r7.f9755C);
        }
        if (layoutInflaterFactory2C1359r7.f9753A != null) {
            b82 b82Var = layoutInflaterFactory2C1359r7.f9756D;
            if (b82Var != null) {
                b82Var.m943b();
            }
            b82 b82VarM3369a = i72.m3369a(layoutInflaterFactory2C1359r7.f9753A);
            b82VarM3369a.m942a(TouchPipeline.SIZE);
            layoutInflaterFactory2C1359r7.f9756D = b82VarM3369a;
            b82VarM3369a.m945d(new C0704h7(this, 2));
        }
        layoutInflaterFactory2C1359r7.f9795s.onSupportActionModeFinished(layoutInflaterFactory2C1359r7.f9802z);
        layoutInflaterFactory2C1359r7.f9802z = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1359r7.f9758F;
        WeakHashMap weakHashMap = i72.f4849a;
        w62.m6726c(viewGroup);
        layoutInflaterFactory2C1359r7.m5728I();
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: d */
    public boolean mo71d(AbstractC0086b4 abstractC0086b4, Menu menu) {
        return ((InterfaceC0005a4) this.f2821b).mo71d(abstractC0086b4, menu);
    }

    @Override // p000.InterfaceC0005a4
    /* JADX INFO: renamed from: e */
    public boolean mo72e(AbstractC0086b4 abstractC0086b4, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1359r7) this.f2822c).f9758F;
        WeakHashMap weakHashMap = i72.f4849a;
        w62.m6726c(viewGroup);
        return ((InterfaceC0005a4) this.f2821b).mo72e(abstractC0086b4, menu);
    }

    @Override // p000.InterfaceC0769ix
    /* JADX INFO: renamed from: f */
    public InterfaceC0807jx mo2265f() {
        return new C1608xy((Context) this.f2821b, ((l91) this.f2822c).mo2265f());
    }

    /* JADX INFO: renamed from: g */
    public C1437tb m2266g() {
        if (((IdentityHashMap) this.f2822c) != null) {
            for (Map.Entry entry : ((C1437tb) this.f2821b).f10817a.entrySet()) {
                if (!((IdentityHashMap) this.f2822c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f2822c).put((C1400sb) entry.getKey(), entry.getValue());
                }
            }
            this.f2821b = new C1437tb((IdentityHashMap) this.f2822c);
            this.f2822c = null;
        }
        return (C1437tb) this.f2821b;
    }

    /* JADX INFO: renamed from: h */
    public void m2267h() {
        this.f2821b = null;
        this.f2822c = null;
    }

    @Override // p000.y01
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1065lb mo739b(C1470u7 c1470u7) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((c11) c1470u7.f11141a).f1614a;
        C1065lb c1065lb = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C1065lb c1065lb2 = new C1065lb(mediaCodecCreateByCodecName, (HandlerThread) ((C0822kb) this.f2821b).get(), new C1139nb(mediaCodecCreateByCodecName, (HandlerThread) ((C0822kb) this.f2822c).get()), (C1174o9) c1470u7.f11146f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) c1470u7.f11144d;
                    C1065lb.m4166a(c1065lb2, (MediaFormat) c1470u7.f11142b, surface, (MediaCrypto) c1470u7.f11145e, (surface == null && ((c11) c1470u7.f11141a).f1621h && z42.f13274a >= 35) ? 8 : 0);
                    return c1065lb2;
                } catch (Exception e) {
                    e = e;
                    c1065lb = c1065lb2;
                    if (c1065lb != null) {
                        c1065lb.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0828kh[] m2269j(Handler handler, c80 c80Var, c80 c80Var2, c80 c80Var3, c80 c80Var4) {
        ArrayList arrayList = new ArrayList();
        RewardedVideoActivity rewardedVideoActivity = (RewardedVideoActivity) this.f2821b;
        ay0 ay0Var = (ay0) this.f2822c;
        arrayList.add(new p11(rewardedVideoActivity, ay0Var, handler, c80Var));
        C1088ly c1088ly = new C1088ly(rewardedVideoActivity);
        ki0.m3864h(!c1088ly.f6546a);
        c1088ly.f6546a = true;
        if (((C1174o9) c1088ly.f6548c) == null) {
            c1088ly.f6548c = new C1174o9(new InterfaceC1103mc[0]);
        }
        if (((C0558d8) c1088ly.f6551f) == null) {
            c1088ly.f6551f = new C0558d8((Object) rewardedVideoActivity, 14);
        }
        arrayList.add(new a11(rewardedVideoActivity, ay0Var, handler, c80Var2, new C1423sy(c1088ly)));
        arrayList.add(new yz1(c80Var3, handler.getLooper()));
        arrayList.add(new r51(c80Var4, handler.getLooper()));
        arrayList.add(new C0754il());
        arrayList.add(new im0(em0.f3384i));
        return (AbstractC0828kh[]) arrayList.toArray(new AbstractC0828kh[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m2270l(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2270l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2271m(boolean z) {
        AbstractC0056t abstractC0056t = (AbstractC0056t) this.f2822c;
        AbstractActivityC0053q abstractActivityC0053q = abstractC0056t.f731t.f12589b;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = abstractC0056t.f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2271m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2272n(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2272n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2273o(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2273o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC1075ll
    public void onCancel() {
        ((Animator) this.f2821b).end();
        if (AbstractC0056t.m363G(2)) {
            Objects.toString((C0061y) this.f2822c);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2274p(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2274p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2275q(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2275q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2276r(boolean z) {
        AbstractC0056t abstractC0056t = (AbstractC0056t) this.f2822c;
        AbstractActivityC0053q abstractActivityC0053q = abstractC0056t.f731t.f12589b;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = abstractC0056t.f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2276r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m2277s(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2277s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m2278t(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2278t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2279u(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2279u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2280v(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2280v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2281w(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2281w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2282x(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2282x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m2283y(boolean z) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((AbstractC0056t) this.f2822c).f733v;
        if (abstractComponentCallbacksC0048l != null) {
            abstractComponentCallbacksC0048l.getParentFragmentManager().f723l.m2283y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2821b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l41.m4035b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public x80 m2284z(Object... objArr) {
        Constructor constructorM3082a;
        synchronized (((AtomicBoolean) this.f2822c)) {
            try {
                if (!((AtomicBoolean) this.f2822c).get()) {
                    try {
                        constructorM3082a = ((C0694gy) this.f2821b).m3082a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f2822c).set(true);
                        constructorM3082a = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorM3082a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorM3082a == null) {
            return null;
        }
        try {
            return (x80) constructorM3082a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public /* synthetic */ C0558d8(int i, Object obj, Object obj2) {
        this.f2820a = i;
        this.f2821b = obj;
        this.f2822c = obj2;
    }

    public /* synthetic */ C0558d8(Object obj, int i) {
        this.f2820a = i;
        this.f2821b = obj;
    }

    public C0558d8(c62 c62Var, g62 g62Var) {
        this.f2820a = 19;
        this.f2821b = c62Var;
        this.f2822c = g62Var;
        new be0(new ae0());
    }

    public C0558d8(EditText editText, int i) {
        this.f2820a = i;
        switch (i) {
            case 20:
                this.f2821b = editText;
                h60 h60Var = new h60(editText);
                this.f2822c = h60Var;
                editText.addTextChangedListener(h60Var);
                if (x50.f12455b == null) {
                    synchronized (x50.f12454a) {
                        try {
                            if (x50.f12455b == null) {
                                x50 x50Var = new x50();
                                try {
                                    x50.f12456c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, x50.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                x50.f12455b = x50Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(x50.f12455b);
                return;
            default:
                this.f2821b = editText;
                this.f2822c = new ay0(editText);
                return;
        }
    }

    public C0558d8(byte b, int i) {
        this.f2820a = i;
        switch (i) {
            case 22:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
                this.f2821b = byteArrayOutputStream;
                this.f2822c = new DataOutputStream(byteArrayOutputStream);
                break;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                this.f2821b = new SparseIntArray();
                this.f2822c = new SparseIntArray();
                break;
            case 29:
                this.f2821b = new HashMap();
                break;
            default:
                bz1 bz1Var = bz1.f1582g;
                this.f2822c = p32.m5142H();
                this.f2821b = bz1Var;
                break;
        }
    }

    public C0558d8(String str) {
        this.f2820a = 7;
        qu0 qu0VarM5610a = qu0.m5610a();
        p32.m5188s(qu0VarM5610a, "registry");
        this.f2821b = qu0VarM5610a;
        p32.m5188s(str, "defaultPolicy");
        this.f2822c = str;
    }

    public C0558d8(AbstractC0056t abstractC0056t) {
        this.f2820a = 26;
        this.f2821b = new CopyOnWriteArrayList();
        this.f2822c = abstractC0056t;
    }

    public C0558d8(int i) {
        this.f2820a = 5;
        C0822kb c0822kb = new C0822kb(i, 0);
        C0822kb c0822kb2 = new C0822kb(i, 1);
        this.f2821b = c0822kb;
        this.f2822c = c0822kb2;
    }

    public /* synthetic */ C0558d8(char c, int i) {
        this.f2820a = i;
    }

    public C0558d8(RewardedVideoActivity rewardedVideoActivity, int i) {
        this.f2820a = i;
        switch (i) {
            case 17:
                this.f2821b = rewardedVideoActivity;
                this.f2822c = new ay0(rewardedVideoActivity, 22);
                break;
            default:
                l91 l91Var = new l91(4);
                this.f2821b = rewardedVideoActivity.getApplicationContext();
                this.f2822c = l91Var;
                break;
        }
    }

    public C0558d8(C0599ed c0599ed, bz1 bz1Var, C0658fz c0658fz) {
        this.f2820a = 21;
        this.f2821b = c0599ed;
        this.f2822c = c0658fz;
    }

    public C0558d8(MediaCodec.CryptoInfo cryptoInfo) {
        this.f2820a = 12;
        this.f2821b = cryptoInfo;
        this.f2822c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public C0558d8(Animation animation) {
        this.f2820a = 25;
        this.f2821b = animation;
        this.f2822c = null;
    }

    public C0558d8(Animator animator) {
        this.f2820a = 25;
        this.f2821b = null;
        this.f2822c = animator;
    }

    public C0558d8(ArrayList arrayList, ArrayList arrayList2) {
        this.f2820a = 27;
        int size = arrayList.size();
        this.f2821b = new int[size];
        this.f2822c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2821b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2822c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0558d8(int i, int i2) {
        this.f2820a = 27;
        this.f2821b = new int[]{i, i2};
        this.f2822c = new float[]{TouchPipeline.SIZE, 1.0f};
    }

    public C0558d8(int i, int i2, int i3) {
        this.f2820a = 27;
        this.f2821b = new int[]{i, i2, i3};
        this.f2822c = new float[]{TouchPipeline.SIZE, 0.5f, 1.0f};
    }

    public C0558d8(CardView cardView) {
        this.f2820a = 10;
        this.f2822c = cardView;
    }

    public C0558d8(C0694gy c0694gy) {
        this.f2820a = 16;
        this.f2821b = c0694gy;
        this.f2822c = new AtomicBoolean(false);
    }

    public C0558d8(C0595e9 c0595e9) {
        this.f2820a = 4;
        this.f2822c = c0595e9;
        this.f2821b = c0595e9;
    }

    public C0558d8(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, InterfaceC0005a4 interfaceC0005a4) {
        this.f2820a = 2;
        this.f2822c = layoutInflaterFactory2C1359r7;
        this.f2821b = interfaceC0005a4;
    }
}
