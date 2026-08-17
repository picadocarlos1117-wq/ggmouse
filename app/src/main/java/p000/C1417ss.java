package p000;

import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1417ss {

    /* JADX INFO: renamed from: a */
    public int f10517a;

    /* JADX INFO: renamed from: b */
    public final C1528vs f10518b;

    /* JADX INFO: renamed from: c */
    public final C1491us f10519c;

    /* JADX INFO: renamed from: d */
    public final C1454ts f10520d;

    /* JADX INFO: renamed from: e */
    public final C1565ws f10521e;

    /* JADX INFO: renamed from: f */
    public HashMap f10522f;

    public C1417ss() {
        C1528vs c1528vs = new C1528vs();
        c1528vs.f11757a = 0;
        c1528vs.f11758b = 0;
        c1528vs.f11759c = 1.0f;
        c1528vs.f11760d = Float.NaN;
        this.f10518b = c1528vs;
        C1491us c1491us = new C1491us();
        c1491us.f11399a = -1;
        c1491us.f11400b = 0;
        c1491us.f11401c = -1;
        c1491us.f11402d = Float.NaN;
        c1491us.f11403e = Float.NaN;
        c1491us.f11404f = Float.NaN;
        c1491us.f11405g = -1;
        c1491us.f11406h = null;
        c1491us.f11407i = -1;
        this.f10519c = c1491us;
        C1454ts c1454ts = new C1454ts();
        c1454ts.f10969a = false;
        c1454ts.f10975d = -1;
        c1454ts.f10977e = -1;
        c1454ts.f10979f = -1.0f;
        c1454ts.f10981g = true;
        c1454ts.f10983h = -1;
        c1454ts.f10985i = -1;
        c1454ts.f10987j = -1;
        c1454ts.f10989k = -1;
        c1454ts.f10991l = -1;
        c1454ts.f10993m = -1;
        c1454ts.f10995n = -1;
        c1454ts.f10997o = -1;
        c1454ts.f10999p = -1;
        c1454ts.f11000q = -1;
        c1454ts.f11001r = -1;
        c1454ts.f11002s = -1;
        c1454ts.f11003t = -1;
        c1454ts.f11004u = -1;
        c1454ts.f11005v = -1;
        c1454ts.f11006w = 0.5f;
        c1454ts.f11007x = 0.5f;
        c1454ts.f11008y = null;
        c1454ts.f11009z = -1;
        c1454ts.f10943A = 0;
        c1454ts.f10944B = TouchPipeline.SIZE;
        c1454ts.f10945C = -1;
        c1454ts.f10946D = -1;
        c1454ts.f10947E = -1;
        c1454ts.f10948F = 0;
        c1454ts.f10949G = 0;
        c1454ts.f10950H = 0;
        c1454ts.f10951I = 0;
        c1454ts.f10952J = 0;
        c1454ts.f10953K = 0;
        c1454ts.f10954L = 0;
        c1454ts.f10955M = Integer.MIN_VALUE;
        c1454ts.f10956N = Integer.MIN_VALUE;
        c1454ts.f10957O = Integer.MIN_VALUE;
        c1454ts.f10958P = Integer.MIN_VALUE;
        c1454ts.f10959Q = Integer.MIN_VALUE;
        c1454ts.f10960R = Integer.MIN_VALUE;
        c1454ts.f10961S = Integer.MIN_VALUE;
        c1454ts.f10962T = -1.0f;
        c1454ts.f10963U = -1.0f;
        c1454ts.f10964V = 0;
        c1454ts.f10965W = 0;
        c1454ts.f10966X = 0;
        c1454ts.f10967Y = 0;
        c1454ts.f10968Z = 0;
        c1454ts.f10970a0 = 0;
        c1454ts.f10972b0 = 0;
        c1454ts.f10974c0 = 0;
        c1454ts.f10976d0 = 1.0f;
        c1454ts.f10978e0 = 1.0f;
        c1454ts.f10980f0 = -1;
        c1454ts.f10982g0 = 0;
        c1454ts.f10984h0 = -1;
        c1454ts.f10992l0 = false;
        c1454ts.f10994m0 = false;
        c1454ts.f10996n0 = true;
        c1454ts.f10998o0 = 0;
        this.f10520d = c1454ts;
        C1565ws c1565ws = new C1565ws();
        c1565ws.f12258a = TouchPipeline.SIZE;
        c1565ws.f12259b = TouchPipeline.SIZE;
        c1565ws.f12260c = TouchPipeline.SIZE;
        c1565ws.f12261d = 1.0f;
        c1565ws.f12262e = 1.0f;
        c1565ws.f12263f = Float.NaN;
        c1565ws.f12264g = Float.NaN;
        c1565ws.f12265h = -1;
        c1565ws.f12266i = TouchPipeline.SIZE;
        c1565ws.f12267j = TouchPipeline.SIZE;
        c1565ws.f12268k = TouchPipeline.SIZE;
        c1565ws.f12269l = false;
        c1565ws.f12270m = TouchPipeline.SIZE;
        this.f10521e = c1565ws;
        this.f10522f = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m6134a(C1306ps c1306ps) {
        C1454ts c1454ts = this.f10520d;
        c1306ps.f9092e = c1454ts.f10983h;
        c1306ps.f9094f = c1454ts.f10985i;
        c1306ps.f9096g = c1454ts.f10987j;
        c1306ps.f9098h = c1454ts.f10989k;
        c1306ps.f9100i = c1454ts.f10991l;
        c1306ps.f9102j = c1454ts.f10993m;
        c1306ps.f9104k = c1454ts.f10995n;
        c1306ps.f9106l = c1454ts.f10997o;
        c1306ps.f9108m = c1454ts.f10999p;
        c1306ps.f9110n = c1454ts.f11000q;
        c1306ps.f9112o = c1454ts.f11001r;
        c1306ps.f9118s = c1454ts.f11002s;
        c1306ps.f9119t = c1454ts.f11003t;
        c1306ps.f9120u = c1454ts.f11004u;
        c1306ps.f9121v = c1454ts.f11005v;
        ((ViewGroup.MarginLayoutParams) c1306ps).leftMargin = c1454ts.f10948F;
        ((ViewGroup.MarginLayoutParams) c1306ps).rightMargin = c1454ts.f10949G;
        ((ViewGroup.MarginLayoutParams) c1306ps).topMargin = c1454ts.f10950H;
        ((ViewGroup.MarginLayoutParams) c1306ps).bottomMargin = c1454ts.f10951I;
        c1306ps.f9058A = c1454ts.f10960R;
        c1306ps.f9059B = c1454ts.f10959Q;
        c1306ps.f9123x = c1454ts.f10956N;
        c1306ps.f9125z = c1454ts.f10958P;
        c1306ps.f9062E = c1454ts.f11006w;
        c1306ps.f9063F = c1454ts.f11007x;
        c1306ps.f9114p = c1454ts.f11009z;
        c1306ps.f9116q = c1454ts.f10943A;
        c1306ps.f9117r = c1454ts.f10944B;
        c1306ps.f9064G = c1454ts.f11008y;
        c1306ps.f9077T = c1454ts.f10945C;
        c1306ps.f9078U = c1454ts.f10946D;
        c1306ps.f9066I = c1454ts.f10962T;
        c1306ps.f9065H = c1454ts.f10963U;
        c1306ps.f9068K = c1454ts.f10965W;
        c1306ps.f9067J = c1454ts.f10964V;
        c1306ps.f9080W = c1454ts.f10992l0;
        c1306ps.f9081X = c1454ts.f10994m0;
        c1306ps.f9069L = c1454ts.f10966X;
        c1306ps.f9070M = c1454ts.f10967Y;
        c1306ps.f9073P = c1454ts.f10968Z;
        c1306ps.f9074Q = c1454ts.f10970a0;
        c1306ps.f9071N = c1454ts.f10972b0;
        c1306ps.f9072O = c1454ts.f10974c0;
        c1306ps.f9075R = c1454ts.f10976d0;
        c1306ps.f9076S = c1454ts.f10978e0;
        c1306ps.f9079V = c1454ts.f10947E;
        c1306ps.f9088c = c1454ts.f10979f;
        c1306ps.f9084a = c1454ts.f10975d;
        c1306ps.f9086b = c1454ts.f10977e;
        ((ViewGroup.MarginLayoutParams) c1306ps).width = c1454ts.f10971b;
        ((ViewGroup.MarginLayoutParams) c1306ps).height = c1454ts.f10973c;
        String str = c1454ts.f10990k0;
        if (str != null) {
            c1306ps.f9082Y = str;
        }
        c1306ps.f9083Z = c1454ts.f10998o0;
        c1306ps.setMarginStart(c1454ts.f10953K);
        c1306ps.setMarginEnd(c1454ts.f10952J);
        c1306ps.m5314a();
    }

    public final Object clone() {
        C1417ss c1417ss = new C1417ss();
        C1454ts c1454ts = c1417ss.f10520d;
        c1454ts.getClass();
        C1454ts c1454ts2 = this.f10520d;
        c1454ts.f10969a = c1454ts2.f10969a;
        c1454ts.f10971b = c1454ts2.f10971b;
        c1454ts.f10973c = c1454ts2.f10973c;
        c1454ts.f10975d = c1454ts2.f10975d;
        c1454ts.f10977e = c1454ts2.f10977e;
        c1454ts.f10979f = c1454ts2.f10979f;
        c1454ts.f10981g = c1454ts2.f10981g;
        c1454ts.f10983h = c1454ts2.f10983h;
        c1454ts.f10985i = c1454ts2.f10985i;
        c1454ts.f10987j = c1454ts2.f10987j;
        c1454ts.f10989k = c1454ts2.f10989k;
        c1454ts.f10991l = c1454ts2.f10991l;
        c1454ts.f10993m = c1454ts2.f10993m;
        c1454ts.f10995n = c1454ts2.f10995n;
        c1454ts.f10997o = c1454ts2.f10997o;
        c1454ts.f10999p = c1454ts2.f10999p;
        c1454ts.f11000q = c1454ts2.f11000q;
        c1454ts.f11001r = c1454ts2.f11001r;
        c1454ts.f11002s = c1454ts2.f11002s;
        c1454ts.f11003t = c1454ts2.f11003t;
        c1454ts.f11004u = c1454ts2.f11004u;
        c1454ts.f11005v = c1454ts2.f11005v;
        c1454ts.f11006w = c1454ts2.f11006w;
        c1454ts.f11007x = c1454ts2.f11007x;
        c1454ts.f11008y = c1454ts2.f11008y;
        c1454ts.f11009z = c1454ts2.f11009z;
        c1454ts.f10943A = c1454ts2.f10943A;
        c1454ts.f10944B = c1454ts2.f10944B;
        c1454ts.f10945C = c1454ts2.f10945C;
        c1454ts.f10946D = c1454ts2.f10946D;
        c1454ts.f10947E = c1454ts2.f10947E;
        c1454ts.f10948F = c1454ts2.f10948F;
        c1454ts.f10949G = c1454ts2.f10949G;
        c1454ts.f10950H = c1454ts2.f10950H;
        c1454ts.f10951I = c1454ts2.f10951I;
        c1454ts.f10952J = c1454ts2.f10952J;
        c1454ts.f10953K = c1454ts2.f10953K;
        c1454ts.f10954L = c1454ts2.f10954L;
        c1454ts.f10955M = c1454ts2.f10955M;
        c1454ts.f10956N = c1454ts2.f10956N;
        c1454ts.f10957O = c1454ts2.f10957O;
        c1454ts.f10958P = c1454ts2.f10958P;
        c1454ts.f10959Q = c1454ts2.f10959Q;
        c1454ts.f10960R = c1454ts2.f10960R;
        c1454ts.f10961S = c1454ts2.f10961S;
        c1454ts.f10962T = c1454ts2.f10962T;
        c1454ts.f10963U = c1454ts2.f10963U;
        c1454ts.f10964V = c1454ts2.f10964V;
        c1454ts.f10965W = c1454ts2.f10965W;
        c1454ts.f10966X = c1454ts2.f10966X;
        c1454ts.f10967Y = c1454ts2.f10967Y;
        c1454ts.f10968Z = c1454ts2.f10968Z;
        c1454ts.f10970a0 = c1454ts2.f10970a0;
        c1454ts.f10972b0 = c1454ts2.f10972b0;
        c1454ts.f10974c0 = c1454ts2.f10974c0;
        c1454ts.f10976d0 = c1454ts2.f10976d0;
        c1454ts.f10978e0 = c1454ts2.f10978e0;
        c1454ts.f10980f0 = c1454ts2.f10980f0;
        c1454ts.f10982g0 = c1454ts2.f10982g0;
        c1454ts.f10984h0 = c1454ts2.f10984h0;
        c1454ts.f10990k0 = c1454ts2.f10990k0;
        int[] iArr = c1454ts2.f10986i0;
        if (iArr == null || c1454ts2.f10988j0 != null) {
            c1454ts.f10986i0 = null;
        } else {
            c1454ts.f10986i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c1454ts.f10988j0 = c1454ts2.f10988j0;
        c1454ts.f10992l0 = c1454ts2.f10992l0;
        c1454ts.f10994m0 = c1454ts2.f10994m0;
        c1454ts.f10996n0 = c1454ts2.f10996n0;
        c1454ts.f10998o0 = c1454ts2.f10998o0;
        C1491us c1491us = c1417ss.f10519c;
        c1491us.getClass();
        C1491us c1491us2 = this.f10519c;
        c1491us2.getClass();
        c1491us.f11399a = c1491us2.f11399a;
        c1491us.f11401c = c1491us2.f11401c;
        c1491us.f11403e = c1491us2.f11403e;
        c1491us.f11402d = c1491us2.f11402d;
        C1528vs c1528vs = this.f10518b;
        int i = c1528vs.f11757a;
        C1528vs c1528vs2 = c1417ss.f10518b;
        c1528vs2.f11757a = i;
        c1528vs2.f11759c = c1528vs.f11759c;
        c1528vs2.f11760d = c1528vs.f11760d;
        c1528vs2.f11758b = c1528vs.f11758b;
        C1565ws c1565ws = c1417ss.f10521e;
        c1565ws.getClass();
        C1565ws c1565ws2 = this.f10521e;
        c1565ws2.getClass();
        c1565ws.f12258a = c1565ws2.f12258a;
        c1565ws.f12259b = c1565ws2.f12259b;
        c1565ws.f12260c = c1565ws2.f12260c;
        c1565ws.f12261d = c1565ws2.f12261d;
        c1565ws.f12262e = c1565ws2.f12262e;
        c1565ws.f12263f = c1565ws2.f12263f;
        c1565ws.f12264g = c1565ws2.f12264g;
        c1565ws.f12265h = c1565ws2.f12265h;
        c1565ws.f12266i = c1565ws2.f12266i;
        c1565ws.f12267j = c1565ws2.f12267j;
        c1565ws.f12268k = c1565ws2.f12268k;
        c1565ws.f12269l = c1565ws2.f12269l;
        c1565ws.f12270m = c1565ws2.f12270m;
        c1417ss.f10517a = this.f10517a;
        return c1417ss;
    }
}
