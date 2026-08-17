package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.sousasantoslogic.sspro.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1320q5 {

    /* JADX INFO: renamed from: A */
    public final int f9358A;

    /* JADX INFO: renamed from: B */
    public final int f9359B;

    /* JADX INFO: renamed from: C */
    public final int f9360C;

    /* JADX INFO: renamed from: D */
    public final boolean f9361D;

    /* JADX INFO: renamed from: E */
    public final HandlerC1170o5 f9362E;

    /* JADX INFO: renamed from: a */
    public final Context f9364a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC1394s5 f9365b;

    /* JADX INFO: renamed from: c */
    public final Window f9366c;

    /* JADX INFO: renamed from: d */
    public CharSequence f9367d;

    /* JADX INFO: renamed from: e */
    public String f9368e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f9369f;

    /* JADX INFO: renamed from: g */
    public View f9370g;

    /* JADX INFO: renamed from: i */
    public Button f9372i;

    /* JADX INFO: renamed from: j */
    public CharSequence f9373j;

    /* JADX INFO: renamed from: k */
    public Message f9374k;

    /* JADX INFO: renamed from: l */
    public Button f9375l;

    /* JADX INFO: renamed from: m */
    public CharSequence f9376m;

    /* JADX INFO: renamed from: n */
    public Message f9377n;

    /* JADX INFO: renamed from: o */
    public Button f9378o;

    /* JADX INFO: renamed from: p */
    public CharSequence f9379p;

    /* JADX INFO: renamed from: q */
    public Message f9380q;

    /* JADX INFO: renamed from: r */
    public NestedScrollView f9381r;

    /* JADX INFO: renamed from: s */
    public Drawable f9382s;

    /* JADX INFO: renamed from: t */
    public ImageView f9383t;

    /* JADX INFO: renamed from: u */
    public TextView f9384u;

    /* JADX INFO: renamed from: v */
    public TextView f9385v;

    /* JADX INFO: renamed from: w */
    public View f9386w;

    /* JADX INFO: renamed from: x */
    public ListAdapter f9387x;

    /* JADX INFO: renamed from: z */
    public final int f9389z;

    /* JADX INFO: renamed from: h */
    public boolean f9371h = false;

    /* JADX INFO: renamed from: y */
    public int f9388y = -1;

    /* JADX INFO: renamed from: F */
    public final ViewOnClickListenerC1407si f9363F = new ViewOnClickListenerC1407si(this, 2);

    public C1320q5(Context context, DialogInterfaceC1394s5 dialogInterfaceC1394s5, Window window) {
        this.f9364a = context;
        this.f9365b = dialogInterfaceC1394s5;
        this.f9366c = window;
        HandlerC1170o5 handlerC1170o5 = new HandlerC1170o5();
        handlerC1170o5.f7663b = new WeakReference(dialogInterfaceC1394s5);
        this.f9362E = handlerC1170o5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ki1.f5850e, R.attr.alertDialogStyle, 0);
        this.f9389z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f9358A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f9359B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f9360C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f9361D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1394s5.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5445a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m5445a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m5446b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: c */
    public final void m5447c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f9362E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f9379p = charSequence;
            this.f9380q = messageObtainMessage;
        } else if (i == -2) {
            this.f9376m = charSequence;
            this.f9377n = messageObtainMessage;
        } else if (i != -1) {
            f40.m2713i("Button does not exist");
        } else {
            this.f9373j = charSequence;
            this.f9374k = messageObtainMessage;
        }
    }
}
