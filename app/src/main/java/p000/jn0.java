package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f5457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f5459d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ln0 f5460e;

    public jn0(ln0 ln0Var, int i, TextView textView, int i2, TextView textView2) {
        this.f5460e = ln0Var;
        this.f5456a = i;
        this.f5457b = textView;
        this.f5458c = i2;
        this.f5459d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0595e9 c0595e9;
        int i = this.f5456a;
        ln0 ln0Var = this.f5460e;
        ln0Var.f6467n = i;
        ln0Var.f6465l = null;
        TextView textView = this.f5457b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f5458c == 1 && (c0595e9 = ln0Var.f6471r) != null) {
                c0595e9.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f5459d;
        if (textView2 != null) {
            textView2.setTranslationY(TouchPipeline.SIZE);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f5459d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(TouchPipeline.SIZE);
        }
    }
}
