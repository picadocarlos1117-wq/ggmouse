package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1357r5 {

    /* JADX INFO: renamed from: a */
    public final C1133n5 f9726a;

    /* JADX INFO: renamed from: b */
    public final int f9727b;

    public C1357r5(Context context, int i) {
        this.f9726a = new C1133n5(new ContextThemeWrapper(context, DialogInterfaceC1394s5.m5978b(context, i)));
        this.f9727b = i;
    }

    public DialogInterfaceC1394s5 create() {
        C1133n5 c1133n5 = this.f9726a;
        DialogInterfaceC1394s5 dialogInterfaceC1394s5 = new DialogInterfaceC1394s5(c1133n5.f7216a, this.f9727b);
        View view = c1133n5.f7220e;
        C1320q5 c1320q5 = dialogInterfaceC1394s5.f10235a;
        if (view != null) {
            c1320q5.f9386w = view;
        } else {
            CharSequence charSequence = c1133n5.f7219d;
            if (charSequence != null) {
                c1320q5.f9367d = charSequence;
                TextView textView = c1320q5.f9384u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1133n5.f7218c;
            if (drawable != null) {
                c1320q5.f9382s = drawable;
                ImageView imageView = c1320q5.f9383t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1320q5.f9383t.setImageDrawable(drawable);
                }
            }
        }
        String str = c1133n5.f7221f;
        if (str != null) {
            c1320q5.f9368e = str;
            TextView textView2 = c1320q5.f9385v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c1133n5.f7222g;
        if (charSequence2 != null) {
            c1320q5.m5447c(-1, charSequence2, c1133n5.f7223h);
        }
        CharSequence charSequence3 = c1133n5.f7224i;
        if (charSequence3 != null) {
            c1320q5.m5447c(-2, charSequence3, c1133n5.f7225j);
        }
        String str2 = c1133n5.f7226k;
        if (str2 != null) {
            c1320q5.m5447c(-3, str2, c1133n5.f7227l);
        }
        if (c1133n5.f7229n != null || c1133n5.f7230o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1133n5.f7217b.inflate(c1320q5.f9358A, (ViewGroup) null);
            int i = c1133n5.f7233r ? c1320q5.f9359B : c1320q5.f9360C;
            ListAdapter c1283p5 = c1133n5.f7230o;
            if (c1283p5 == null) {
                c1283p5 = new C1283p5(c1133n5.f7216a, i, R.id.text1, c1133n5.f7229n);
            }
            c1320q5.f9387x = c1283p5;
            c1320q5.f9388y = c1133n5.f7234s;
            if (c1133n5.f7231p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1096m5(c1133n5, c1320q5));
            }
            if (c1133n5.f7233r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1320q5.f9369f = alertController$RecycleListView;
        }
        View view2 = c1133n5.f7232q;
        if (view2 != null) {
            c1320q5.f9370g = view2;
            c1320q5.f9371h = false;
        }
        dialogInterfaceC1394s5.setCancelable(true);
        dialogInterfaceC1394s5.setCanceledOnTouchOutside(true);
        dialogInterfaceC1394s5.setOnCancelListener(null);
        dialogInterfaceC1394s5.setOnDismissListener(null);
        j31 j31Var = c1133n5.f7228m;
        if (j31Var != null) {
            dialogInterfaceC1394s5.setOnKeyListener(j31Var);
        }
        return dialogInterfaceC1394s5;
    }

    public Context getContext() {
        return this.f9726a.f7216a;
    }

    public C1357r5 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1133n5 c1133n5 = this.f9726a;
        c1133n5.f7224i = c1133n5.f7216a.getText(i);
        c1133n5.f7225j = onClickListener;
        return this;
    }

    public C1357r5 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1133n5 c1133n5 = this.f9726a;
        c1133n5.f7222g = c1133n5.f7216a.getText(i);
        c1133n5.f7223h = onClickListener;
        return this;
    }

    public C1357r5 setTitle(CharSequence charSequence) {
        this.f9726a.f7219d = charSequence;
        return this;
    }

    public C1357r5 setView(View view) {
        this.f9726a.f7232q = view;
        return this;
    }

    public C1357r5(Context context) {
        this(context, DialogInterfaceC1394s5.m5978b(context, 0));
    }
}
