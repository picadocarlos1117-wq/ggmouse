package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.AdbProtocol;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class re1 extends FrameLayout {

    /* JADX INFO: renamed from: E0 */
    public static final float[] f9934E0;

    /* JADX INFO: renamed from: A */
    public final ImageView f9935A;

    /* JADX INFO: renamed from: A0 */
    public final long[] f9936A0;

    /* JADX INFO: renamed from: B */
    public final ImageView f9937B;

    /* JADX INFO: renamed from: B0 */
    public final boolean[] f9938B0;

    /* JADX INFO: renamed from: C */
    public final ImageView f9939C;

    /* JADX INFO: renamed from: C0 */
    public long f9940C0;

    /* JADX INFO: renamed from: D */
    public final ImageView f9941D;

    /* JADX INFO: renamed from: D0 */
    public boolean f9942D0;

    /* JADX INFO: renamed from: E */
    public final View f9943E;

    /* JADX INFO: renamed from: F */
    public final View f9944F;

    /* JADX INFO: renamed from: G */
    public final View f9945G;

    /* JADX INFO: renamed from: H */
    public final TextView f9946H;

    /* JADX INFO: renamed from: I */
    public final TextView f9947I;

    /* JADX INFO: renamed from: J */
    public final q00 f9948J;

    /* JADX INFO: renamed from: K */
    public final StringBuilder f9949K;

    /* JADX INFO: renamed from: L */
    public final Formatter f9950L;

    /* JADX INFO: renamed from: M */
    public final r02 f9951M;

    /* JADX INFO: renamed from: N */
    public final s02 f9952N;

    /* JADX INFO: renamed from: O */
    public final RunnableC1430t4 f9953O;

    /* JADX INFO: renamed from: P */
    public final Drawable f9954P;

    /* JADX INFO: renamed from: Q */
    public final Drawable f9955Q;

    /* JADX INFO: renamed from: R */
    public final Drawable f9956R;

    /* JADX INFO: renamed from: S */
    public final Drawable f9957S;

    /* JADX INFO: renamed from: T */
    public final Drawable f9958T;

    /* JADX INFO: renamed from: U */
    public final String f9959U;

    /* JADX INFO: renamed from: V */
    public final String f9960V;

    /* JADX INFO: renamed from: W */
    public final String f9961W;

    /* JADX INFO: renamed from: a */
    public final we1 f9962a;

    /* JADX INFO: renamed from: a0 */
    public final Drawable f9963a0;

    /* JADX INFO: renamed from: b */
    public final Resources f9964b;

    /* JADX INFO: renamed from: b0 */
    public final Drawable f9965b0;

    /* JADX INFO: renamed from: c */
    public final he1 f9966c;

    /* JADX INFO: renamed from: c0 */
    public final float f9967c0;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f9968d;

    /* JADX INFO: renamed from: d0 */
    public final float f9969d0;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f9970e;

    /* JADX INFO: renamed from: e0 */
    public final String f9971e0;

    /* JADX INFO: renamed from: f */
    public final ne1 f9972f;

    /* JADX INFO: renamed from: f0 */
    public final String f9973f0;

    /* JADX INFO: renamed from: g */
    public final ke1 f9974g;

    /* JADX INFO: renamed from: g0 */
    public final Drawable f9975g0;

    /* JADX INFO: renamed from: h0 */
    public final Drawable f9976h0;

    /* JADX INFO: renamed from: i0 */
    public final String f9977i0;

    /* JADX INFO: renamed from: j0 */
    public final String f9978j0;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f9979k0;

    /* JADX INFO: renamed from: l0 */
    public final Drawable f9980l0;

    /* JADX INFO: renamed from: m */
    public final ge1 f9981m;

    /* JADX INFO: renamed from: m0 */
    public final String f9982m0;

    /* JADX INFO: renamed from: n */
    public final ge1 f9983n;

    /* JADX INFO: renamed from: n0 */
    public final String f9984n0;

    /* JADX INFO: renamed from: o */
    public final ay0 f9985o;

    /* JADX INFO: renamed from: o0 */
    public ee1 f9986o0;

    /* JADX INFO: renamed from: p */
    public final PopupWindow f9987p;

    /* JADX INFO: renamed from: p0 */
    public boolean f9988p0;

    /* JADX INFO: renamed from: q */
    public final int f9989q;

    /* JADX INFO: renamed from: q0 */
    public boolean f9990q0;

    /* JADX INFO: renamed from: r */
    public final ImageView f9991r;

    /* JADX INFO: renamed from: r0 */
    public boolean f9992r0;

    /* JADX INFO: renamed from: s */
    public final ImageView f9993s;

    /* JADX INFO: renamed from: s0 */
    public boolean f9994s0;

    /* JADX INFO: renamed from: t */
    public final ImageView f9995t;

    /* JADX INFO: renamed from: t0 */
    public boolean f9996t0;

    /* JADX INFO: renamed from: u */
    public final View f9997u;

    /* JADX INFO: renamed from: u0 */
    public boolean f9998u0;

    /* JADX INFO: renamed from: v */
    public final View f9999v;

    /* JADX INFO: renamed from: v0 */
    public int f10000v0;

    /* JADX INFO: renamed from: w */
    public final TextView f10001w;

    /* JADX INFO: renamed from: w0 */
    public int f10002w0;

    /* JADX INFO: renamed from: x */
    public final TextView f10003x;

    /* JADX INFO: renamed from: x0 */
    public int f10004x0;

    /* JADX INFO: renamed from: y */
    public final ImageView f10005y;

    /* JADX INFO: renamed from: y0 */
    public long[] f10006y0;

    /* JADX INFO: renamed from: z */
    public final ImageView f10007z;

    /* JADX INFO: renamed from: z0 */
    public boolean[] f10008z0;

    static {
        a21.m54a("media3.ui");
        f9934E0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public re1(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        boolean z8;
        int i7;
        ImageView imageView;
        ImageView imageView2;
        he1 he1Var;
        Typeface typefaceM5280a;
        super(context, null, 0);
        this.f9994s0 = true;
        this.f10000v0 = 5000;
        this.f10004x0 = 0;
        this.f10002w0 = 200;
        int i8 = R.layout.exo_player_control_view;
        int resourceId6 = R.drawable.exo_styled_controls_play;
        int resourceId7 = R.drawable.exo_styled_controls_pause;
        int resourceId8 = R.drawable.exo_styled_controls_next;
        int resourceId9 = R.drawable.exo_styled_controls_simple_fastforward;
        int resourceId10 = R.drawable.exo_styled_controls_previous;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hi1.f4582c, 0, 0);
            try {
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                resourceId6 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                resourceId7 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                resourceId8 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                resourceId9 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                resourceId10 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.f10000v0 = typedArrayObtainStyledAttributes.getInt(32, this.f10000v0);
                this.f10004x0 = typedArrayObtainStyledAttributes.getInt(19, this.f10004x0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z5 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                z = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f10002w0));
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                z7 = z13;
                i3 = resourceId12;
                i4 = resourceId13;
                i5 = resourceId14;
                i6 = resourceId15;
                i = resourceId17;
                z3 = z9;
                z4 = z10;
                i8 = resourceId11;
                z8 = z11;
                i2 = resourceId16;
                z2 = z12;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            resourceId = R.drawable.exo_styled_controls_repeat_all;
            resourceId2 = R.drawable.exo_styled_controls_shuffle_on;
            resourceId3 = R.drawable.exo_styled_controls_shuffle_off;
            resourceId4 = R.drawable.exo_styled_controls_subtitle_on;
            resourceId5 = R.drawable.exo_styled_controls_subtitle_off;
            i = R.drawable.exo_styled_controls_vr;
            i2 = R.drawable.exo_styled_controls_repeat_one;
            i3 = R.drawable.exo_styled_controls_simple_rewind;
            i4 = R.drawable.exo_styled_controls_fullscreen_exit;
            i5 = R.drawable.exo_styled_controls_fullscreen_enter;
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            i6 = R.drawable.exo_styled_controls_repeat_off;
            z8 = false;
        }
        int i9 = resourceId10;
        int i10 = resourceId7;
        int i11 = resourceId9;
        int i12 = resourceId6;
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(AdbProtocol.MAX_PAYLOAD_V2);
        he1 he1Var2 = new he1(this);
        this.f9966c = he1Var2;
        this.f9968d = new CopyOnWriteArrayList();
        this.f9951M = new r02();
        this.f9952N = new s02();
        StringBuilder sb = new StringBuilder();
        this.f9949K = sb;
        boolean z14 = z2;
        this.f9950L = new Formatter(sb, Locale.getDefault());
        this.f10006y0 = new long[0];
        this.f10008z0 = new boolean[0];
        this.f9936A0 = new long[0];
        this.f9938B0 = new boolean[0];
        this.f9953O = new RunnableC1430t4(this, 24);
        this.f9946H = (TextView) findViewById(R.id.exo_duration);
        this.f9947I = (TextView) findViewById(R.id.exo_position);
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f9937B = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(he1Var2);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f9939C = imageView4;
        boolean z15 = z8;
        ViewOnClickListenerC1597xn viewOnClickListenerC1597xn = new ViewOnClickListenerC1597xn(this, 4);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(viewOnClickListenerC1597xn);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f9941D = imageView5;
        ViewOnClickListenerC1597xn viewOnClickListenerC1597xn2 = new ViewOnClickListenerC1597xn(this, 4);
        if (imageView5 != null) {
            imageView5.setVisibility(8);
            imageView5.setOnClickListener(viewOnClickListenerC1597xn2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f9943E = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(he1Var2);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f9944F = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(he1Var2);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f9945G = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(he1Var2);
        }
        q00 q00Var = (q00) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (q00Var != null) {
            this.f9948J = q00Var;
        } else if (viewFindViewById4 != null) {
            q00 q00Var2 = new q00(context, attributeSet);
            q00Var2.setId(R.id.exo_progress);
            q00Var2.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(q00Var2, iIndexOfChild);
            this.f9948J = q00Var2;
        } else {
            this.f9948J = null;
        }
        q00 q00Var3 = this.f9948J;
        if (q00Var3 != null) {
            q00Var3.f9249C.add(he1Var2);
        }
        Resources resources = context.getResources();
        this.f9964b = resources;
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f9995t = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(he1Var2);
        }
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_prev);
        this.f9991r = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            imageView7.setOnClickListener(he1Var2);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_next);
        this.f9993s = imageView8;
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(resourceId8, context.getTheme()));
            imageView8.setOnClickListener(he1Var2);
        }
        ThreadLocal threadLocal = pl1.f8932a;
        if (context.isRestricted()) {
            i7 = i;
            imageView = imageView7;
            imageView2 = imageView8;
            typefaceM5280a = null;
            he1Var = he1Var2;
        } else {
            i7 = i;
            imageView = imageView7;
            imageView2 = imageView8;
            he1Var = he1Var2;
            typefaceM5280a = pl1.m5280a(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(i3, context.getTheme()));
            this.f9999v = imageView9;
            this.f10003x = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM5280a);
            this.f10003x = textView;
            this.f9999v = textView;
        } else {
            this.f10003x = null;
            this.f9999v = null;
        }
        View view = this.f9999v;
        if (view != null) {
            view.setOnClickListener(he1Var);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView10 != null) {
            imageView10.setImageDrawable(resources.getDrawable(i11, context.getTheme()));
            this.f9997u = imageView10;
            this.f10001w = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM5280a);
            this.f10001w = textView2;
            this.f9997u = textView2;
        } else {
            this.f10001w = null;
            this.f9997u = null;
        }
        View view2 = this.f9997u;
        if (view2 != null) {
            view2.setOnClickListener(he1Var);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f10005y = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(he1Var);
        }
        ImageView imageView12 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f10007z = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(he1Var);
        }
        this.f9967c0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f9969d0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView13 = (ImageView) findViewById(R.id.exo_vr);
        this.f9935A = imageView13;
        if (imageView13 != null) {
            imageView13.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
            m5826j(imageView13, false);
        }
        we1 we1Var = new we1(this);
        this.f9962a = we1Var;
        we1Var.f12093C = z7;
        ne1 ne1Var = new ne1(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f9972f = ne1Var;
        this.f9989q = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f9970e = recyclerView;
        recyclerView.setAdapter(ne1Var);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f9987p = popupWindow;
        if (z42.f13274a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(he1Var);
        this.f9942D0 = true;
        this.f9985o = new ay0(getResources());
        this.f9975g0 = resources.getDrawable(resourceId4, context.getTheme());
        this.f9976h0 = resources.getDrawable(resourceId5, context.getTheme());
        this.f9977i0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f9978j0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f9981m = new ge1(this, 1);
        this.f9983n = new ge1(this, 0);
        this.f9974g = new ke1(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f9934E0);
        this.f9954P = resources.getDrawable(i12, context.getTheme());
        this.f9955Q = resources.getDrawable(i10, context.getTheme());
        this.f9979k0 = resources.getDrawable(i4, context.getTheme());
        this.f9980l0 = resources.getDrawable(i5, context.getTheme());
        this.f9956R = resources.getDrawable(i6, context.getTheme());
        this.f9957S = resources.getDrawable(i2, context.getTheme());
        this.f9958T = resources.getDrawable(resourceId, context.getTheme());
        this.f9963a0 = resources.getDrawable(resourceId2, context.getTheme());
        this.f9965b0 = resources.getDrawable(resourceId3, context.getTheme());
        this.f9982m0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f9984n0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f9959U = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f9960V = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f9961W = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f9971e0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f9973f0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        we1Var.m6770h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        we1Var.m6770h(this.f9997u, z4);
        we1Var.m6770h(this.f9999v, z3);
        we1Var.m6770h(imageView, z5);
        we1Var.m6770h(imageView2, z6);
        we1Var.m6770h(imageView12, z);
        we1Var.m6770h(imageView3, z15);
        we1Var.m6770h(imageView13, z14);
        we1Var.m6770h(imageView11, this.f10004x0 != 0);
        addOnLayoutChangeListener(new fe1(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5818b(ee1 ee1Var, s02 s02Var) {
        t02 t02VarM2763j;
        int iMo1059o;
        f80 f80Var = (f80) ee1Var;
        if (!f80Var.m2770r(17) || (iMo1059o = (t02VarM2763j = f80Var.m2763j()).mo1059o()) <= 1 || iMo1059o > 100) {
            return false;
        }
        for (int i = 0; i < iMo1059o; i++) {
            if (t02VarM2763j.mo1058m(i, s02Var, 0L).f10191k == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        ee1 ee1Var = this.f9986o0;
        if (ee1Var == null || !((f80) ee1Var).m2770r(13)) {
            return;
        }
        f80 f80Var = (f80) this.f9986o0;
        f80Var.m2753N();
        td1 td1Var = new td1(f, f80Var.f3697g0.f10385o.f10845b);
        f80Var.m2753N();
        if (f80Var.f3697g0.f10385o.equals(td1Var)) {
            return;
        }
        sd1 sd1VarM6091f = f80Var.f3697g0.m6091f(td1Var);
        f80Var.f3665H++;
        f80Var.f3703k.f6246n.m7386a(4, td1Var).m7164b();
        f80Var.m2751L(sd1VarM6091f, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX INFO: renamed from: c */
    public final boolean m5819c(KeyEvent keyEvent) {
        f80 f80Var;
        int keyCode = keyEvent.getKeyCode();
        ee1 ee1Var = this.f9986o0;
        if (ee1Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                f80 f80Var2 = (f80) ee1Var;
                if (f80Var2.m2768o() != 4 && f80Var2.m2770r(12)) {
                    f80Var2.m2753N();
                    long jM2761h = f80Var2.m2761h() + f80Var2.f3714v;
                    long jM2766m = f80Var2.m2766m();
                    if (jM2766m != -9223372036854775807L) {
                        jM2761h = Math.min(jM2761h, jM2766m);
                    }
                    f80Var2.m2740A(f80Var2.m2760g(), false, Math.max(jM2761h, 0L));
                }
            } else if (keyCode == 89) {
                f80 f80Var3 = (f80) ee1Var;
                if (f80Var3.m2770r(11)) {
                    f80Var3.m2753N();
                    long jM2761h2 = f80Var3.m2761h() + (-f80Var3.f3713u);
                    long jM2766m2 = f80Var3.m2766m();
                    if (jM2766m2 != -9223372036854775807L) {
                        jM2761h2 = Math.min(jM2761h2, jM2766m2);
                    }
                    f80Var3.m2740A(f80Var3.m2760g(), false, Math.max(jM2761h2, 0L));
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (z42.m7224L(ee1Var, this.f9994s0)) {
                            z42.m7249w(ee1Var);
                        } else {
                            f80Var = (f80) ee1Var;
                            if (f80Var.m2770r(1)) {
                                f80Var.m2745F(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        f80 f80Var4 = (f80) ee1Var;
                        if (f80Var4.m2770r(9)) {
                            f80Var4.m2741B();
                        }
                    } else if (keyCode == 88) {
                        f80 f80Var5 = (f80) ee1Var;
                        if (f80Var5.m2770r(7)) {
                            f80Var5.m2742C();
                        }
                    } else if (keyCode == 126) {
                        z42.m7249w(ee1Var);
                    } else if (keyCode == 127) {
                        int i = z42.f13274a;
                        f80 f80Var6 = (f80) ee1Var;
                        if (f80Var6.m2770r(1)) {
                            f80Var6.m2745F(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (z42.m7224L(ee1Var, this.f9994s0)) {
                        z42.m7249w(ee1Var);
                    } else {
                        f80Var = (f80) ee1Var;
                        if (f80Var.m2770r(1)) {
                            f80Var.m2745F(false);
                        }
                    }
                } else if (z42.m7224L(ee1Var, this.f9994s0)) {
                    z42.m7249w(ee1Var);
                } else {
                    f80Var = (f80) ee1Var;
                    if (f80Var.m2770r(1)) {
                        f80Var.m2745F(false);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m5820d(AbstractC0064c abstractC0064c, View view) {
        this.f9970e.setAdapter(abstractC0064c);
        m5833q();
        this.f9942D0 = false;
        PopupWindow popupWindow = this.f9987p;
        popupWindow.dismiss();
        this.f9942D0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f9989q;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m5819c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final kk1 m5821e(l22 l22Var, int i) {
        sc2.m6060d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        qm0 qm0Var = l22Var.f6157a;
        int i2 = 0;
        for (int i3 = 0; i3 < qm0Var.size(); i3++) {
            k22 k22Var = (k22) qm0Var.get(i3);
            if (k22Var.f5652b.f12804c == i) {
                for (int i4 = 0; i4 < k22Var.f5651a; i4++) {
                    if (k22Var.m3765a(i4)) {
                        be0 be0Var = k22Var.f5652b.f12805d[i4];
                        if ((be0Var.f1332e & 2) == 0) {
                            pe1 pe1Var = new pe1(l22Var, i3, i4, this.f9985o.m789y(be0Var));
                            int i5 = i2 + 1;
                            int iM3900f = km0.m3900f(objArrCopyOf.length, i5);
                            if (iM3900f > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM3900f);
                            }
                            objArrCopyOf[i2] = pe1Var;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return qm0.m5565k(i2, objArrCopyOf);
    }

    /* JADX INFO: renamed from: f */
    public final void m5822f() {
        we1 we1Var = this.f9962a;
        int i = we1Var.f12119z;
        if (i == 3 || i == 2) {
            return;
        }
        we1Var.m6768f();
        if (!we1Var.f12093C) {
            we1Var.m6771i(2);
        } else if (we1Var.f12119z == 1) {
            we1Var.f12106m.start();
        } else {
            we1Var.f12107n.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5823g() {
        we1 we1Var = this.f9962a;
        return we1Var.f12119z == 0 && we1Var.f12094a.m5824h();
    }

    public ee1 getPlayer() {
        return this.f9986o0;
    }

    public int getRepeatToggleModes() {
        return this.f10004x0;
    }

    public boolean getShowShuffleButton() {
        return this.f9962a.m6766b(this.f10007z);
    }

    public boolean getShowSubtitleButton() {
        return this.f9962a.m6766b(this.f9937B);
    }

    public int getShowTimeoutMs() {
        return this.f10000v0;
    }

    public boolean getShowVrButton() {
        return this.f9962a.m6766b(this.f9935A);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5824h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m5825i() {
        m5829m();
        m5828l();
        m5832p();
        m5834r();
        m5836t();
        m5830n();
        m5835s();
    }

    /* JADX INFO: renamed from: j */
    public final void m5826j(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f9967c0 : this.f9969d0);
    }

    /* JADX INFO: renamed from: k */
    public final void m5827k(boolean z) {
        if (this.f9988p0 == z) {
            return;
        }
        this.f9988p0 = z;
        String str = this.f9984n0;
        Drawable drawable = this.f9980l0;
        String str2 = this.f9982m0;
        Drawable drawable2 = this.f9979k0;
        ImageView imageView = this.f9939C;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f9941D;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5828l() {
        boolean zM2770r;
        boolean zM2770r2;
        boolean zM2770r3;
        boolean zM2770r4;
        boolean zM2770r5;
        long j;
        long j2;
        if (m5824h() && this.f9990q0) {
            ee1 ee1Var = this.f9986o0;
            if (ee1Var != null) {
                zM2770r = (this.f9992r0 && m5818b(ee1Var, this.f9952N)) ? ((f80) ee1Var).m2770r(10) : ((f80) ee1Var).m2770r(5);
                f80 f80Var = (f80) ee1Var;
                zM2770r3 = f80Var.m2770r(7);
                zM2770r4 = f80Var.m2770r(11);
                zM2770r5 = f80Var.m2770r(12);
                zM2770r2 = f80Var.m2770r(9);
            } else {
                zM2770r = false;
                zM2770r2 = false;
                zM2770r3 = false;
                zM2770r4 = false;
                zM2770r5 = false;
            }
            Resources resources = this.f9964b;
            View view = this.f9999v;
            if (zM2770r4) {
                ee1 ee1Var2 = this.f9986o0;
                if (ee1Var2 != null) {
                    f80 f80Var2 = (f80) ee1Var2;
                    f80Var2.m2753N();
                    j2 = f80Var2.f3713u;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.f10003x;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.f9997u;
            if (zM2770r5) {
                ee1 ee1Var3 = this.f9986o0;
                if (ee1Var3 != null) {
                    f80 f80Var3 = (f80) ee1Var3;
                    f80Var3.m2753N();
                    j = f80Var3.f3714v;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.f10001w;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            m5826j(this.f9991r, zM2770r3);
            m5826j(view, zM2770r4);
            m5826j(view2, zM2770r5);
            m5826j(this.f9993s, zM2770r2);
            q00 q00Var = this.f9948J;
            if (q00Var != null) {
                q00Var.setEnabled(zM2770r);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX INFO: renamed from: m */
    public final void m5829m() {
        ImageView imageView;
        boolean z;
        if (m5824h() && this.f9990q0 && (imageView = this.f9995t) != null) {
            boolean zM7224L = z42.m7224L(this.f9986o0, this.f9994s0);
            Drawable drawable = zM7224L ? this.f9954P : this.f9955Q;
            int i = zM7224L ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f9964b.getString(i));
            ee1 ee1Var = this.f9986o0;
            if (ee1Var != null) {
                z = true;
                if (!((f80) ee1Var).m2770r(1) || (((f80) this.f9986o0).m2770r(17) && ((f80) this.f9986o0).m2763j().m6176p())) {
                    z = false;
                }
            } else {
                z = false;
            }
            m5826j(imageView, z);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5830n() {
        ke1 ke1Var;
        ee1 ee1Var = this.f9986o0;
        if (ee1Var == null) {
            return;
        }
        f80 f80Var = (f80) ee1Var;
        f80Var.m2753N();
        float f = f80Var.f3697g0.f10385o.f10844a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            ke1Var = this.f9974g;
            float[] fArr = ke1Var.f5784b;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        ke1Var.f5785c = i2;
        String str = ke1Var.f5783a[i2];
        ne1 ne1Var = this.f9972f;
        ne1Var.f7391b[0] = str;
        m5826j(this.f9943E, ne1Var.m4538a(1) || ne1Var.m4538a(0));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX INFO: renamed from: o */
    public final void m5831o() {
        long j;
        long jM7226N;
        if (m5824h() && this.f9990q0) {
            ee1 ee1Var = this.f9986o0;
            long j2 = 0;
            if (ee1Var != null) {
                f80 f80Var = (f80) ee1Var;
                if (f80Var.m2770r(16)) {
                    long j3 = this.f9940C0;
                    f80Var.m2753N();
                    long jM2757d = f80Var.m2757d(f80Var.f3697g0) + j3;
                    long j4 = this.f9940C0;
                    f80Var.m2753N();
                    if (f80Var.f3697g0.f10371a.m6176p()) {
                        jM7226N = f80Var.f3701i0;
                    } else {
                        sd1 sd1Var = f80Var.f3697g0;
                        if (sd1Var.f10381k.f9312d != sd1Var.f10372b.f9312d) {
                            jM7226N = z42.m7226N(sd1Var.f10371a.mo1058m(f80Var.m2760g(), f80Var.f3684a, 0L).f10191k);
                        } else {
                            long j5 = sd1Var.f10387q;
                            if (f80Var.f3697g0.f10381k.m5438b()) {
                                sd1 sd1Var2 = f80Var.f3697g0;
                                sd1Var2.f10371a.mo2973g(sd1Var2.f10381k.f9309a, f80Var.f3706n).m5647d(f80Var.f3697g0.f10381k.f9310b);
                            } else {
                                j2 = j5;
                            }
                            sd1 sd1Var3 = f80Var.f3697g0;
                            t02 t02Var = sd1Var3.f10371a;
                            Object obj = sd1Var3.f10381k.f9309a;
                            r02 r02Var = f80Var.f3706n;
                            t02Var.mo2973g(obj, r02Var);
                            jM7226N = z42.m7226N(j2 + r02Var.f9653e);
                        }
                    }
                    j = jM7226N + j4;
                    j2 = jM2757d;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            TextView textView = this.f9947I;
            if (textView != null && !this.f9998u0) {
                textView.setText(z42.m7246t(this.f9949K, this.f9950L, j2));
            }
            q00 q00Var = this.f9948J;
            if (q00Var != null) {
                q00Var.setPosition(j2);
                this.f9948J.setBufferedPosition(j);
            }
            removeCallbacks(this.f9953O);
            int iM2768o = ee1Var == null ? 1 : ((f80) ee1Var).m2768o();
            if (ee1Var != null) {
                f80 f80Var2 = (f80) ee1Var;
                if (f80Var2.m2768o() == 3 && f80Var2.m2767n()) {
                    f80Var2.m2753N();
                    if (f80Var2.f3697g0.f10384n == 0) {
                        q00 q00Var2 = this.f9948J;
                        long jMin = Math.min(q00Var2 != null ? q00Var2.getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
                        f80Var2.m2753N();
                        float f = f80Var2.f3697g0.f10385o.f10844a;
                        postDelayed(this.f9953O, z42.m7234h(f > TouchPipeline.SIZE ? (long) (jMin / f) : 1000L, this.f10002w0, 1000L));
                        return;
                    }
                }
            }
            if (iM2768o == 4 || iM2768o == 1) {
                return;
            }
            postDelayed(this.f9953O, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        we1 we1Var = this.f9962a;
        we1Var.f12094a.addOnLayoutChangeListener(we1Var.f12117x);
        this.f9990q0 = true;
        if (m5823g()) {
            we1Var.m6769g();
        }
        m5825i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        we1 we1Var = this.f9962a;
        we1Var.f12094a.removeOnLayoutChangeListener(we1Var.f12117x);
        this.f9990q0 = false;
        removeCallbacks(this.f9953O);
        we1Var.m6768f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f9962a.f12095b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5832p() {
        ImageView imageView;
        if (m5824h() && this.f9990q0 && (imageView = this.f10005y) != null) {
            if (this.f10004x0 == 0) {
                m5826j(imageView, false);
                return;
            }
            ee1 ee1Var = this.f9986o0;
            String str = this.f9959U;
            Drawable drawable = this.f9956R;
            if (ee1Var != null) {
                f80 f80Var = (f80) ee1Var;
                if (f80Var.m2770r(15)) {
                    m5826j(imageView, true);
                    f80Var.m2753N();
                    int i = f80Var.f3663F;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.f9957S);
                        imageView.setContentDescription(this.f9960V);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.f9958T);
                        imageView.setContentDescription(this.f9961W);
                        return;
                    }
                }
            }
            m5826j(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5833q() {
        RecyclerView recyclerView = this.f9970e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.f9989q;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f9987p;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: r */
    public final void m5834r() {
        ImageView imageView;
        if (m5824h() && this.f9990q0 && (imageView = this.f10007z) != null) {
            ee1 ee1Var = this.f9986o0;
            if (!this.f9962a.m6766b(imageView)) {
                m5826j(imageView, false);
                return;
            }
            String str = this.f9973f0;
            Drawable drawable = this.f9965b0;
            if (ee1Var != null) {
                f80 f80Var = (f80) ee1Var;
                if (f80Var.m2770r(14)) {
                    m5826j(imageView, true);
                    f80Var.m2753N();
                    if (f80Var.f3664G) {
                        drawable = this.f9963a0;
                    }
                    imageView.setImageDrawable(drawable);
                    f80Var.m2753N();
                    if (f80Var.f3664G) {
                        str = this.f9971e0;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            m5826j(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [r02] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [t02] */
    /* JADX WARN: Type inference failed for: r2v13, types: [t02] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [w4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public final void m5835s() {
        boolean z;
        long j;
        long jM7216D;
        int i;
        long jM7226N;
        Object r4;
        Object r2;
        Object r24;
        boolean z2;
        Object r3;
        boolean[] zArr;
        boolean z3;
        int length;
        ee1 ee1Var = this.f9986o0;
        if (ee1Var == null) {
            return;
        }
        boolean z4 = this.f9992r0;
        s02 s02Var = this.f9952N;
        boolean z5 = false;
        boolean z6 = true;
        this.f9996t0 = z4 && m5818b(ee1Var, s02Var);
        long j2 = 0;
        this.f9940C0 = 0L;
        f80 f80Var = (f80) ee1Var;
        t02 t02VarM2763j = f80Var.m2770r(17) ? f80Var.m2763j() : t02.f10690a;
        if (t02VarM2763j.m6176p()) {
            z = true;
            if (f80Var.m2770r(16)) {
                t02 t02VarM2763j2 = f80Var.m2763j();
                if (t02VarM2763j2.m6176p()) {
                    jM7226N = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jM7226N = z42.m7226N(t02VarM2763j2.mo1058m(f80Var.m2760g(), f80Var.f3684a, 0L).f10191k);
                }
                if (jM7226N != -9223372036854775807L) {
                    jM7216D = z42.m7216D(jM7226N);
                }
                i = 0;
            } else {
                j = 0;
            }
            jM7216D = j;
            i = 0;
        } else {
            int iM2760g = f80Var.m2760g();
            boolean z7 = this.f9996t0;
            int i2 = z7 ? 0 : iM2760g;
            int iMo1059o = z7 ? t02VarM2763j.mo1059o() - 1 : iM2760g;
            i = 0;
            long j3 = 0;
            Object r5 = t02VarM2763j;
            while (i2 <= iMo1059o) {
                long j4 = -9223372036854775807L;
                if (i2 == iM2760g) {
                    this.f9940C0 = z42.m7226N(j3);
                }
                r5.m6175n(i2, s02Var);
                if (s02Var.f10191k == -9223372036854775807L) {
                    ki0.m3864h(this.f9996t0 ^ z6);
                    break;
                }
                int i3 = s02Var.f10192l;
                Object r6 = r5;
                boolean z8 = z5;
                while (i3 <= s02Var.f10193m) {
                    Object r10 = this.f9951M;
                    r6.mo1055f(i3, r10, z8);
                    long j5 = j4;
                    C1541w4 c1541w4 = r10.f9655g;
                    c1541w4.getClass();
                    int i4 = c1541w4.f11963a;
                    while (r4 < i4) {
                        r10.m5647d(r4);
                        long j6 = j2;
                        long j7 = r10.f9653e;
                        if (j7 >= j6) {
                            long[] jArr = this.f10006y0;
                            if (i == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r6;
                                    r4 = z8;
                                    length = 1;
                                } else {
                                    r2 = r6;
                                    r4 = z8;
                                    length = jArr.length * 2;
                                }
                                this.f10006y0 = Arrays.copyOf(jArr, length);
                                this.f10008z0 = Arrays.copyOf(this.f10008z0, length);
                            }
                            r2 = r6;
                            r4 = z8;
                            this.f10006y0[i] = z42.m7226N(j7 + j3);
                            boolean[] zArr2 = this.f10008z0;
                            C1504v4 c1504v4M6701a = r10.f9655g.m6701a(r4);
                            int i5 = c1504v4M6701a.f11504a;
                            if (i5 != -1) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r24 = r3;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i7 = c1504v4M6701a.f11508e[i6];
                                    Object r25 = r3;
                                    z2 = true;
                                    if (i7 == 0) {
                                        r3 = r2;
                                    } else if (i7 != 1) {
                                        i6++;
                                        zArr2 = zArr;
                                        r3 = r25;
                                    }
                                    z3 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r2;
                            z2 = true;
                            z3 = true;
                            zArr[i] = !z3;
                            i++;
                        } else {
                            r2 = r6;
                            r4 = z8;
                            r24 = r2;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        iM2760g = iM2760g;
                        r2 = r24;
                        r4++;
                    }
                    r2 = r6;
                    r4 = z8;
                    i3++;
                    j4 = j5;
                    r6 = r2;
                    z8 = false;
                }
                j3 += s02Var.f10191k;
                i2++;
                z6 = z6;
                r5 = r6;
                z5 = false;
            }
            z = z6;
            jM7216D = j3;
        }
        long jM7226N2 = z42.m7226N(jM7216D);
        TextView textView = this.f9946H;
        if (textView != null) {
            textView.setText(z42.m7246t(this.f9949K, this.f9950L, jM7226N2));
        }
        q00 q00Var = this.f9948J;
        if (q00Var != null) {
            q00Var.setDuration(jM7226N2);
            long[] jArr2 = this.f9936A0;
            int length2 = jArr2.length;
            int i8 = i + length2;
            long[] jArr3 = this.f10006y0;
            if (i8 > jArr3.length) {
                this.f10006y0 = Arrays.copyOf(jArr3, i8);
                this.f10008z0 = Arrays.copyOf(this.f10008z0, i8);
            }
            System.arraycopy(jArr2, 0, this.f10006y0, i, length2);
            System.arraycopy(this.f9938B0, 0, this.f10008z0, i, length2);
            long[] jArr4 = this.f10006y0;
            boolean[] zArr3 = this.f10008z0;
            if (i8 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            ki0.m3857c(z);
            q00Var.f9264R = i8;
            q00Var.f9265S = jArr4;
            q00Var.f9266T = zArr3;
            q00Var.m5384e();
        }
        m5831o();
    }

    public void setAnimationEnabled(boolean z) {
        this.f9962a.f12093C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(ie1 ie1Var) {
        boolean z = ie1Var != null;
        ImageView imageView = this.f9939C;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = ie1Var != null;
        ImageView imageView2 = this.f9941D;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(ee1 ee1Var) {
        ki0.m3864h(Looper.myLooper() == Looper.getMainLooper());
        ki0.m3857c(ee1Var == null || ((f80) ee1Var).f3711s == Looper.getMainLooper());
        ee1 ee1Var2 = this.f9986o0;
        if (ee1Var2 == ee1Var) {
            return;
        }
        he1 he1Var = this.f9966c;
        if (ee1Var2 != null) {
            ((f80) ee1Var2).m2777y(he1Var);
        }
        this.f9986o0 = ee1Var;
        if (ee1Var != null) {
            au0 au0Var = ((f80) ee1Var).f3704l;
            he1Var.getClass();
            au0Var.m710a(he1Var);
        }
        m5825i();
    }

    public void setRepeatToggleModes(int i) {
        this.f10004x0 = i;
        ee1 ee1Var = this.f9986o0;
        if (ee1Var != null && ((f80) ee1Var).m2770r(15)) {
            f80 f80Var = (f80) this.f9986o0;
            f80Var.m2753N();
            int i2 = f80Var.f3663F;
            if (i == 0 && i2 != 0) {
                ((f80) this.f9986o0).m2746G(0);
            } else if (i == 1 && i2 == 2) {
                ((f80) this.f9986o0).m2746G(1);
            } else if (i == 2 && i2 == 1) {
                ((f80) this.f9986o0).m2746G(2);
            }
        }
        this.f9962a.m6770h(this.f10005y, i != 0);
        m5832p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f9962a.m6770h(this.f9997u, z);
        m5828l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.f9992r0 = z;
        m5835s();
    }

    public void setShowNextButton(boolean z) {
        this.f9962a.m6770h(this.f9993s, z);
        m5828l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.f9994s0 = z;
        m5829m();
    }

    public void setShowPreviousButton(boolean z) {
        this.f9962a.m6770h(this.f9991r, z);
        m5828l();
    }

    public void setShowRewindButton(boolean z) {
        this.f9962a.m6770h(this.f9999v, z);
        m5828l();
    }

    public void setShowShuffleButton(boolean z) {
        this.f9962a.m6770h(this.f10007z, z);
        m5834r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f9962a.m6770h(this.f9937B, z);
    }

    public void setShowTimeoutMs(int i) {
        this.f10000v0 = i;
        if (m5823g()) {
            this.f9962a.m6769g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f9962a.m6770h(this.f9935A, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f10002w0 = z42.m7233g(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f9935A;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m5826j(imageView, onClickListener != null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5836t() {
        ge1 ge1Var = this.f9981m;
        ge1Var.getClass();
        List list = Collections.EMPTY_LIST;
        ge1Var.f4167a = list;
        ge1 ge1Var2 = this.f9983n;
        ge1Var2.getClass();
        ge1Var2.f4167a = list;
        ee1 ee1Var = this.f9986o0;
        ImageView imageView = this.f9937B;
        if (ee1Var != null && ((f80) ee1Var).m2770r(30) && ((f80) this.f9986o0).m2770r(29)) {
            l22 l22VarM2764k = ((f80) this.f9986o0).m2764k();
            kk1 kk1VarM5821e = m5821e(l22VarM2764k, 1);
            ge1Var2.f4167a = kk1VarM5821e;
            re1 re1Var = ge1Var2.f4170d;
            ee1 ee1Var2 = re1Var.f9986o0;
            ne1 ne1Var = re1Var.f9972f;
            ee1Var2.getClass();
            x00 x00VarM2769q = ((f80) ee1Var2).m2769q();
            if (kk1VarM5821e.isEmpty()) {
                ne1Var.f7391b[1] = re1Var.getResources().getString(R.string.exo_track_selection_none);
            } else if (ge1Var2.m2966a(x00VarM2769q)) {
                for (int i = 0; i < kk1VarM5821e.f5898d; i++) {
                    pe1 pe1Var = (pe1) kk1VarM5821e.get(i);
                    if (pe1Var.f8868a.f5655e[pe1Var.f8869b]) {
                        ne1Var.f7391b[1] = pe1Var.f8870c;
                        break;
                    }
                }
            } else {
                ne1Var.f7391b[1] = re1Var.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f9962a.m6766b(imageView)) {
                ge1Var.m2967b(m5821e(l22VarM2764k, 3));
            } else {
                ge1Var.m2967b(kk1.f5896e);
            }
        }
        m5826j(imageView, ge1Var.getItemCount() > 0);
        ne1 ne1Var2 = this.f9972f;
        m5826j(this.f9943E, ne1Var2.m4538a(1) || ne1Var2.m4538a(0));
    }

    public void setProgressUpdateListener(le1 le1Var) {
    }
}
