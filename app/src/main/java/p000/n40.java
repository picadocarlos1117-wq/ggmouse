package p000;

import android.view.MotionEvent;
import android.view.View;
import com.example.ssmousepro.FloatingService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n40 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7210b;

    public /* synthetic */ n40(Object obj, int i) {
        this.f7209a = i;
        this.f7210b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f7209a;
        Object obj = this.f7210b;
        switch (i) {
            case 0:
                p40 p40Var = (p40) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - p40Var.f8710o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        p40Var.f8708m = false;
                    }
                    p40Var.m5201t();
                    p40Var.f8708m = true;
                    p40Var.f8710o = System.currentTimeMillis();
                }
                return false;
            default:
                return FloatingService.ativarModoEscutaComponente$lambda$279((FloatingService) obj, view, motionEvent);
        }
    }
}
