package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C0275c;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6563a;

    /* JADX INFO: renamed from: b */
    public final Object f6564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6565c;

    public lz0(q12 q12Var) {
        this.f6563a = 2;
        this.f6565c = q12Var;
        Context context = q12Var.f9293a.getContext();
        CharSequence charSequence = q12Var.f9300h;
        C1281p3 c1281p3 = new C1281p3();
        c1281p3.f8675e = 4096;
        c1281p3.f8677g = 4096;
        c1281p3.f8682l = null;
        c1281p3.f8683m = null;
        c1281p3.f8684n = false;
        c1281p3.f8685o = false;
        c1281p3.f8686p = 16;
        c1281p3.f8679i = context;
        c1281p3.f8671a = charSequence;
        this.f6564b = c1281p3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6563a;
        Object obj = this.f6564b;
        Object obj2 = this.f6565c;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                int iM513J0 = ((LinearLayoutManager) qz0Var.f9628m.getLayoutManager()).m513J0() - 1;
                if (iM513J0 >= 0) {
                    Calendar calendarM6227a = t42.m6227a(((C0275c) obj).f2067a.f10420a.f1222a);
                    calendarM6227a.add(2, iM513J0);
                    qz0Var.m5628f(new b61(calendarM6227a));
                }
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qz0Var2.f9628m.getLayoutManager();
                View viewM515L0 = linearLayoutManager.m515L0(0, linearLayoutManager.m678v(), false);
                int iM651F = (viewM515L0 == null ? -1 : AbstractC0066e.m651F(viewM515L0)) + 1;
                if (iM651F < qz0Var2.f9628m.getAdapter().getItemCount()) {
                    Calendar calendarM6227a2 = t42.m6227a(((C0275c) obj).f2067a.f10420a.f1222a);
                    calendarM6227a2.add(2, iM651F);
                    qz0Var2.m5628f(new b61(calendarM6227a2));
                }
                break;
            default:
                q12 q12Var = (q12) obj2;
                Window.Callback callback = q12Var.f9303k;
                if (callback != null && q12Var.f9304l) {
                    callback.onMenuItemSelected(0, (C1281p3) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lz0(qz0 qz0Var, C0275c c0275c, int i) {
        this.f6563a = i;
        this.f6565c = qz0Var;
        this.f6564b = c0275c;
    }
}
