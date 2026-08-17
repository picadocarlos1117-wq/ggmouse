package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1582x8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f12477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f12479d;

    public RunnableC1582x8(TextView textView, Typeface typeface, int i) {
        this.f12476a = 0;
        this.f12478c = textView;
        this.f12479d = typeface;
        this.f12477b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0777j4 interfaceC0777j4;
        int i = this.f12476a;
        Object obj = this.f12478c;
        int i2 = this.f12477b;
        Object obj2 = this.f12479d;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                break;
            case 1:
                ((BottomSheetBehavior) obj2).m1659K((View) obj, i2, false);
                break;
            case 2:
                C1563wq c1563wq = (C1563wq) obj2;
                Serializable serializable = (Serializable) ((ay0) obj).f1096b;
                String str = (String) c1563wq.f9709a.get(Integer.valueOf(i2));
                if (str != null) {
                    C1282p4 c1282p4 = (C1282p4) c1563wq.f9713e.get(str);
                    if (c1282p4 == null || (interfaceC0777j4 = c1282p4.f8698a) == null) {
                        c1563wq.f9715g.remove(str);
                        c1563wq.f9714f.put(str, serializable);
                    } else if (c1563wq.f9712d.remove(str)) {
                        interfaceC0777j4.onActivityResult(serializable);
                    }
                    break;
                }
                break;
            default:
                ((C1563wq) obj2).m5688a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
        }
    }

    public /* synthetic */ RunnableC1582x8(C1563wq c1563wq, int i, Object obj, int i2) {
        this.f12476a = i2;
        this.f12479d = c1563wq;
        this.f12477b = i;
        this.f12478c = obj;
    }

    public RunnableC1582x8(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f12476a = 1;
        this.f12479d = bottomSheetBehavior;
        this.f12478c = view;
        this.f12477b = i;
    }
}
