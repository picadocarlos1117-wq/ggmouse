package androidx.media3.p003ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.p003ui.PlayerView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.AdbProtocol;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0075au;
import p000.AbstractC1337qm;
import p000.InterfaceC1138na;
import p000.af1;
import p000.au0;
import p000.ay0;
import p000.c70;
import p000.c80;
import p000.ca0;
import p000.cf1;
import p000.df1;
import p000.ee1;
import p000.ef1;
import p000.f80;
import p000.hi1;
import p000.ie1;
import p000.k22;
import p000.ki0;
import p000.lu1;
import p000.m62;
import p000.pn0;
import p000.qe1;
import p000.qm0;
import p000.re1;
import p000.t70;
import p000.w52;
import p000.we1;
import p000.y52;
import p000.z42;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f788L = 0;

    /* JADX INFO: renamed from: A */
    public int f789A;

    /* JADX INFO: renamed from: B */
    public int f790B;

    /* JADX INFO: renamed from: C */
    public Drawable f791C;

    /* JADX INFO: renamed from: D */
    public int f792D;

    /* JADX INFO: renamed from: E */
    public boolean f793E;

    /* JADX INFO: renamed from: F */
    public CharSequence f794F;

    /* JADX INFO: renamed from: G */
    public int f795G;

    /* JADX INFO: renamed from: H */
    public boolean f796H;

    /* JADX INFO: renamed from: I */
    public boolean f797I;

    /* JADX INFO: renamed from: J */
    public boolean f798J;

    /* JADX INFO: renamed from: K */
    public boolean f799K;

    /* JADX INFO: renamed from: a */
    public final cf1 f800a;

    /* JADX INFO: renamed from: b */
    public final AspectRatioFrameLayout f801b;

    /* JADX INFO: renamed from: c */
    public final View f802c;

    /* JADX INFO: renamed from: d */
    public final View f803d;

    /* JADX INFO: renamed from: e */
    public final boolean f804e;

    /* JADX INFO: renamed from: f */
    public final pn0 f805f;

    /* JADX INFO: renamed from: g */
    public final ImageView f806g;

    /* JADX INFO: renamed from: m */
    public final ImageView f807m;

    /* JADX INFO: renamed from: n */
    public final SubtitleView f808n;

    /* JADX INFO: renamed from: o */
    public final View f809o;

    /* JADX INFO: renamed from: p */
    public final TextView f810p;

    /* JADX INFO: renamed from: q */
    public final re1 f811q;

    /* JADX INFO: renamed from: r */
    public final FrameLayout f812r;

    /* JADX INFO: renamed from: s */
    public final FrameLayout f813s;

    /* JADX INFO: renamed from: t */
    public final Handler f814t;

    /* JADX INFO: renamed from: u */
    public final Class f815u;

    /* JADX INFO: renamed from: v */
    public final Method f816v;

    /* JADX INFO: renamed from: w */
    public final Object f817w;

    /* JADX INFO: renamed from: x */
    public ee1 f818x;

    /* JADX INFO: renamed from: y */
    public boolean f819y;

    /* JADX INFO: renamed from: z */
    public qe1 f820z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        cf1 cf1Var = new cf1(this);
        this.f800a = cf1Var;
        this.f814t = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f801b = null;
            this.f802c = null;
            this.f803d = null;
            this.f804e = false;
            this.f805f = null;
            this.f806g = null;
            this.f807m = null;
            this.f808n = null;
            this.f809o = null;
            this.f810p = null;
            this.f811q = null;
            this.f812r = null;
            this.f813s = null;
            this.f815u = null;
            this.f816v = null;
            this.f817w = null;
            ImageView imageView = new ImageView(context);
            if (z42.f13274a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hi1.f4583d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f793E = typedArrayObtainStyledAttributes.getBoolean(16, this.f793E);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = zHasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 5000;
            i2 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(AdbProtocol.MAX_PAYLOAD_V2);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f801b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f802c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            i10 = 0;
            this.f803d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 != 2) {
                if (i7 == 3) {
                    try {
                        int i15 = lu1.f6511q;
                        this.f803d = (View) lu1.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i7 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (z42.f13274a >= 34) {
                        surfaceView.setSurfaceLifecycle(2);
                    }
                    this.f803d = surfaceView;
                } else {
                    try {
                        int i16 = w52.f11985b;
                        this.f803d = (View) w52.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.f803d.setLayoutParams(layoutParams);
                this.f803d.setOnClickListener(cf1Var);
                i10 = 0;
                this.f803d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f803d, 0);
            } else {
                this.f803d = new TextureView(context);
            }
            z7 = false;
            this.f803d.setLayoutParams(layoutParams);
            this.f803d.setOnClickListener(cf1Var);
            i10 = 0;
            this.f803d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f803d, 0);
        }
        this.f804e = z7;
        this.f805f = z42.f13274a == 34 ? new pn0() : null;
        this.f812r = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f813s = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f806g = (ImageView) findViewById(R.id.exo_image);
        this.f790B = i5;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: bf1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i17 = PlayerView.f788L;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f1358a;
                    playerView.f814t.post(new RunnableC1467u4(24, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f815u = cls;
        this.f816v = method;
        this.f817w = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f807m = imageView2;
        this.f789A = (!z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
        if (i4 != 0) {
            this.f791C = AbstractC0075au.getDrawable(getContext(), i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f808n = subtitleView;
        if (subtitleView != null) {
            subtitleView.m461a();
            subtitleView.m462b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f809o = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f792D = i3;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f810p = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        re1 re1Var = (re1) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (re1Var != null) {
            this.f811q = re1Var;
        } else if (viewFindViewById3 != null) {
            re1 re1Var2 = new re1(context, attributeSet);
            this.f811q = re1Var2;
            re1Var2.setId(R.id.exo_controller);
            re1Var2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(re1Var2, iIndexOfChild);
        } else {
            this.f811q = null;
        }
        re1 re1Var3 = this.f811q;
        this.f795G = re1Var3 != null ? i : i10;
        this.f798J = z;
        this.f796H = z2;
        this.f797I = z3;
        this.f819y = (!z5 || re1Var3 == null) ? i10 : 1;
        if (re1Var3 != null) {
            we1 we1Var = re1Var3.f9962a;
            int i17 = we1Var.f12119z;
            if (i17 != 3 && i17 != 2) {
                we1Var.m6768f();
                we1Var.m6771i(2);
            }
            re1 re1Var4 = this.f811q;
            cf1 cf1Var2 = this.f800a;
            re1Var4.getClass();
            cf1Var2.getClass();
            re1Var4.f9968d.add(cf1Var2);
        }
        if (z5) {
            setClickable(true);
        }
        m456l();
    }

    /* JADX INFO: renamed from: a */
    public static void m445a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        ee1 ee1Var = playerView.f818x;
        if (ee1Var != null) {
            f80 f80Var = (f80) ee1Var;
            if (f80Var.m2770r(30) && f80Var.m2764k().m4023a(2)) {
                return;
            }
        }
        ImageView imageView = playerView.f806g;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.m459o();
        }
        View view = playerView.f802c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f806g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m459o();
    }

    private void setImageOutput(ee1 ee1Var) {
        Class cls = this.f815u;
        if (cls == null || !cls.isAssignableFrom(ee1Var.getClass())) {
            return;
        }
        try {
            Method method = this.f816v;
            method.getClass();
            Object obj = this.f817w;
            obj.getClass();
            method.invoke(ee1Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ca0.m1184p(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m446b() {
        ee1 ee1Var = this.f818x;
        if (ee1Var == null || this.f817w == null) {
            return false;
        }
        f80 f80Var = (f80) ee1Var;
        return f80Var.m2770r(30) && f80Var.m2764k().m4023a(4);
    }

    /* JADX INFO: renamed from: c */
    public final void m447c() {
        ImageView imageView = this.f806g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m448d() {
        ee1 ee1Var = this.f818x;
        return ee1Var != null && ((f80) ee1Var).m2770r(16) && ((f80) this.f818x).m2772t() && ((f80) this.f818x).m2767n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pn0 pn0Var;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (z42.f13274a != 34 || (pn0Var = this.f805f) == null || !this.f799K || (surfaceSyncGroup = (SurfaceSyncGroup) pn0Var.f8968a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        pn0Var.f8968a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ee1 ee1Var = this.f818x;
        if (ee1Var != null && ((f80) ee1Var).m2770r(16) && ((f80) this.f818x).m2772t()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        re1 re1Var = this.f811q;
        if (z && m460p() && !re1Var.m5823g()) {
            m449e(true);
            return true;
        }
        if ((m460p() && re1Var.m5819c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m449e(true);
            return true;
        }
        if (z && m460p()) {
            m449e(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m449e(boolean z) {
        if (!(m448d() && this.f797I) && m460p()) {
            re1 re1Var = this.f811q;
            boolean z2 = re1Var.m5823g() && re1Var.getShowTimeoutMs() <= 0;
            boolean zM451g = m451g();
            if (z || z2 || zM451g) {
                m452h(zM451g);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m450f(Drawable drawable) {
        ImageView imageView = this.f807m;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f789A == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f801b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m451g() {
        ee1 ee1Var = this.f818x;
        if (ee1Var == null) {
            return true;
        }
        int iM2768o = ((f80) ee1Var).m2768o();
        if (!this.f796H) {
            return false;
        }
        if (((f80) this.f818x).m2770r(17) && ((f80) this.f818x).m2763j().m6176p()) {
            return false;
        }
        if (iM2768o != 1 && iM2768o != 4) {
            ee1 ee1Var2 = this.f818x;
            ee1Var2.getClass();
            if (((f80) ee1Var2).m2767n()) {
                return false;
            }
        }
        return true;
    }

    public List<ay0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        int i = 5;
        FrameLayout frameLayout = this.f813s;
        if (frameLayout != null) {
            arrayList.add(new ay0(frameLayout, i));
        }
        re1 re1Var = this.f811q;
        if (re1Var != null) {
            arrayList.add(new ay0(re1Var, i));
        }
        return qm0.m5567n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f812r;
        ki0.m3867k(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f789A;
    }

    public boolean getControllerAutoShow() {
        return this.f796H;
    }

    public boolean getControllerHideOnTouch() {
        return this.f798J;
    }

    public int getControllerShowTimeoutMs() {
        return this.f795G;
    }

    public Drawable getDefaultArtwork() {
        return this.f791C;
    }

    public int getImageDisplayMode() {
        return this.f790B;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f813s;
    }

    public ee1 getPlayer() {
        return this.f818x;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f801b;
        ki0.m3866j(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f808n;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f789A != 0;
    }

    public boolean getUseController() {
        return this.f819y;
    }

    public View getVideoSurfaceView() {
        return this.f803d;
    }

    /* JADX INFO: renamed from: h */
    public final void m452h(boolean z) {
        if (m460p()) {
            int i = z ? 0 : this.f795G;
            re1 re1Var = this.f811q;
            re1Var.setShowTimeoutMs(i);
            we1 we1Var = re1Var.f9962a;
            re1 re1Var2 = we1Var.f12094a;
            if (!re1Var2.m5824h()) {
                re1Var2.setVisibility(0);
                re1Var2.m5825i();
                ImageView imageView = re1Var2.f9995t;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            we1Var.m6772k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m453i() {
        if (!m460p() || this.f818x == null) {
            return;
        }
        re1 re1Var = this.f811q;
        if (!re1Var.m5823g()) {
            m449e(true);
        } else if (this.f798J) {
            re1Var.m5822f();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m454j() {
        m62 m62Var;
        ee1 ee1Var = this.f818x;
        if (ee1Var != null) {
            f80 f80Var = (f80) ee1Var;
            f80Var.m2753N();
            m62Var = f80Var.f3693e0;
        } else {
            m62Var = m62.f6671d;
        }
        int i = m62Var.f6672a;
        int i2 = m62Var.f6673b;
        float f = TouchPipeline.SIZE;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * m62Var.f6674c) / i2;
        if (!this.f804e) {
            f = f2;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f801b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX INFO: renamed from: k */
    public final void m455k() {
        boolean z;
        View view = this.f809o;
        if (view != null) {
            ee1 ee1Var = this.f818x;
            if (ee1Var == null || ((f80) ee1Var).m2768o() != 2) {
                z = false;
            } else {
                int i = this.f792D;
                z = true;
                if (i != 2 && (i != 1 || !((f80) this.f818x).m2767n())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m456l() {
        re1 re1Var = this.f811q;
        if (re1Var == null || !this.f819y) {
            setContentDescription(null);
        } else if (re1Var.m5823g()) {
            setContentDescription(this.f798J ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m457m() {
        TextView textView = this.f810p;
        if (textView != null) {
            CharSequence charSequence = this.f794F;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            ee1 ee1Var = this.f818x;
            if (ee1Var != null) {
                f80 f80Var = (f80) ee1Var;
                f80Var.m2753N();
                t70 t70Var = f80Var.f3697g0.f10376f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX INFO: renamed from: n */
    public final void m458n(boolean z) {
        boolean z2;
        boolean z3;
        Drawable drawable;
        ee1 ee1Var = this.f818x;
        boolean zM450f = false;
        if (ee1Var != null) {
            f80 f80Var = (f80) ee1Var;
            if (!f80Var.m2770r(30) || f80Var.m2764k().f6157a.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        boolean z4 = this.f793E;
        ImageView imageView = this.f807m;
        View view = this.f802c;
        if (!z4 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m447c();
        }
        if (z2) {
            ee1 ee1Var2 = this.f818x;
            if (ee1Var2 != null) {
                f80 f80Var2 = (f80) ee1Var2;
                if (f80Var2.m2770r(30) && f80Var2.m2764k().m4023a(2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            boolean zM446b = m446b();
            if (!z3 && !zM446b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m447c();
            }
            ImageView imageView2 = this.f806g;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM446b && !z3 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m459o();
                }
            } else if (z3 && !zM446b && z5) {
                m447c();
            }
            if (!z3 && !zM446b && this.f789A != 0) {
                ki0.m3866j(imageView);
                if (ee1Var != null) {
                    f80 f80Var3 = (f80) ee1Var;
                    if (f80Var3.m2770r(18)) {
                        f80Var3.m2753N();
                        byte[] bArr = f80Var3.f3672O.f2733f;
                        if (bArr != null) {
                            zM450f = m450f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                        }
                    }
                }
                if (zM450f || m450f(this.f791C)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m459o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f806g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f790B == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f801b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m460p() || this.f818x == null) {
            return false;
        }
        m449e(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m460p() {
        if (!this.f819y) {
            return false;
        }
        ki0.m3866j(this.f811q);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m453i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        ki0.m3864h(i == 0 || this.f807m != null);
        if (this.f789A != i) {
            this.f789A = i;
            m458n(false);
        }
    }

    public void setAspectRatioListener(InterfaceC1138na interfaceC1138na) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f801b;
        ki0.m3866j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC1138na);
    }

    public void setControllerAnimationEnabled(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.f796H = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f797I = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        ki0.m3866j(this.f811q);
        this.f798J = z;
        m456l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(ie1 ie1Var) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setOnFullScreenModeChangedListener(ie1Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        this.f795G = i;
        if (re1Var.m5823g()) {
            m452h(m451g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(qe1 qe1Var) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        CopyOnWriteArrayList copyOnWriteArrayList = re1Var.f9968d;
        qe1 qe1Var2 = this.f820z;
        if (qe1Var2 == qe1Var) {
            return;
        }
        if (qe1Var2 != null) {
            copyOnWriteArrayList.remove(qe1Var2);
        }
        this.f820z = qe1Var;
        if (qe1Var != null) {
            copyOnWriteArrayList.add(qe1Var);
            setControllerVisibilityListener((df1) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ki0.m3864h(this.f810p != null);
        this.f794F = charSequence;
        m457m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f791C != drawable) {
            this.f791C = drawable;
            m458n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.f799K = z;
    }

    public void setErrorMessageProvider(c70 c70Var) {
        if (c70Var != null) {
            m457m();
        }
    }

    public void setFullscreenButtonClickListener(ef1 ef1Var) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setOnFullScreenModeChangedListener(this.f800a);
    }

    public void setFullscreenButtonState(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.m5827k(z);
    }

    public void setImageDisplayMode(int i) {
        ki0.m3864h(this.f806g != null);
        if (this.f790B != i) {
            this.f790B = i;
            m459o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f793E != z) {
            this.f793E = z;
            m458n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    public void setPlayer(ee1 ee1Var) {
        boolean z = true;
        ki0.m3864h(Looper.myLooper() == Looper.getMainLooper());
        ki0.m3857c(ee1Var == null || ((f80) ee1Var).f3711s == Looper.getMainLooper());
        ee1 ee1Var2 = this.f818x;
        if (ee1Var2 == ee1Var) {
            return;
        }
        View view = this.f803d;
        cf1 cf1Var = this.f800a;
        if (ee1Var2 != null) {
            f80 f80Var = (f80) ee1Var2;
            f80Var.m2777y(cf1Var);
            if (f80Var.m2770r(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    f80Var.m2753N();
                    if (textureView == f80Var.f3678U) {
                        f80Var.m2755b();
                    }
                } else if (view instanceof SurfaceView) {
                    f80Var.m2753N();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    f80Var.m2753N();
                    if (holder != null && holder == f80Var.f3675R) {
                        f80Var.m2755b();
                    }
                }
            }
            Class cls = this.f815u;
            if (cls != null && cls.isAssignableFrom(ee1Var2.getClass())) {
                try {
                    Method method = this.f816v;
                    method.getClass();
                    method.invoke(ee1Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    ca0.m1184p(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.f808n;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f818x = ee1Var;
        boolean zM460p = m460p();
        re1 re1Var = this.f811q;
        if (zM460p) {
            re1Var.setPlayer(ee1Var);
        }
        m455k();
        m457m();
        m458n(true);
        if (ee1Var == null) {
            if (re1Var != null) {
                re1Var.m5822f();
                return;
            }
            return;
        }
        f80 f80Var2 = (f80) ee1Var;
        c80 c80Var = f80Var2.f3717y;
        if (f80Var2.m2770r(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                f80Var2.m2753N();
                f80Var2.m2778z();
                f80Var2.f3678U = textureView2;
                if (textureView2.getSurfaceTextureListener() != null) {
                    AbstractC1337qm.m5542i0("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                }
                textureView2.setSurfaceTextureListener(c80Var);
                SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    f80Var2.m2748I(null);
                    f80Var2.m2775w(0, 0);
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    f80Var2.m2748I(surface);
                    f80Var2.f3674Q = surface;
                    f80Var2.m2775w(textureView2.getWidth(), textureView2.getHeight());
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                f80Var2.m2753N();
                if (surfaceView instanceof y52) {
                    f80Var2.m2778z();
                    f80Var2.m2748I(surfaceView);
                    f80Var2.m2744E(surfaceView.getHolder());
                } else if (surfaceView instanceof lu1) {
                    f80Var2.m2778z();
                    f80Var2.f3676S = (lu1) surfaceView;
                    af1 af1VarM2756c = f80Var2.m2756c(f80Var2.f3718z);
                    ki0.m3864h(!af1VarM2756c.f222g);
                    af1VarM2756c.f219d = 10000;
                    lu1 lu1Var = f80Var2.f3676S;
                    ki0.m3864h(!af1VarM2756c.f222g);
                    af1VarM2756c.f220e = lu1Var;
                    af1VarM2756c.m147c();
                    f80Var2.f3676S.f6512a.add(c80Var);
                    f80Var2.m2748I(f80Var2.f3676S.getVideoSurface());
                    f80Var2.m2744E(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    f80Var2.m2753N();
                    if (holder2 == null) {
                        f80Var2.m2755b();
                    } else {
                        f80Var2.m2778z();
                        f80Var2.f3677T = true;
                        f80Var2.f3675R = holder2;
                        holder2.addCallback(c80Var);
                        Surface surface2 = holder2.getSurface();
                        if (surface2 == null || !surface2.isValid()) {
                            f80Var2.m2748I(null);
                            f80Var2.m2775w(0, 0);
                        } else {
                            f80Var2.m2748I(surface2);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            f80Var2.m2775w(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            if (f80Var2.m2770r(30)) {
                qm0 qm0Var = f80Var2.m2764k().f6157a;
                int i = 0;
                loop0: while (true) {
                    if (i >= qm0Var.size()) {
                        z = false;
                        break;
                    }
                    if (((k22) qm0Var.get(i)).f5652b.f12804c == 2) {
                        k22 k22Var = (k22) qm0Var.get(i);
                        for (int i2 = 0; i2 < k22Var.f5654d.length; i2++) {
                            if (k22Var.m3765a(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (z) {
                    m454j();
                }
            } else {
                m454j();
            }
        }
        if (subtitleView != null && f80Var2.m2770r(28)) {
            f80Var2.m2753N();
            subtitleView.setCues(f80Var2.f3685a0.f6037a);
        }
        au0 au0Var = f80Var2.f3704l;
        cf1Var.getClass();
        au0Var.m710a(cf1Var);
        setImageOutput(ee1Var);
        m449e(false);
    }

    public void setRepeatToggleModes(int i) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f801b;
        ki0.m3866j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f792D != i) {
            this.f792D = i;
            m455k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        re1 re1Var = this.f811q;
        ki0.m3866j(re1Var);
        re1Var.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f802c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        re1 re1Var = this.f811q;
        ki0.m3864h((z && re1Var == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.f819y == z) {
            return;
        }
        this.f819y = z;
        if (m460p()) {
            re1Var.setPlayer(this.f818x);
        } else if (re1Var != null) {
            re1Var.m5822f();
            re1Var.setPlayer(null);
        }
        m456l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f803d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(df1 df1Var) {
        if (df1Var != null) {
            setControllerVisibilityListener((qe1) null);
        }
    }
}
