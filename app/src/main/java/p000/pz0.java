package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0275c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 extends oj1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0275c f9238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f9239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qz0 f9240c;

    public pz0(qz0 qz0Var, C0275c c0275c, MaterialButton materialButton) {
        this.f9240c = qz0Var;
        this.f9238a = c0275c;
        this.f9239b = materialButton;
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: a */
    public final void mo4806a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f9239b.getText());
        }
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: b */
    public final void mo4807b(RecyclerView recyclerView, int i, int i2) {
        int iM513J0;
        C1409sk c1409sk = this.f9238a.f2067a;
        qz0 qz0Var = this.f9240c;
        RecyclerView recyclerView2 = qz0Var.f9628m;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View viewM515L0 = linearLayoutManager.m515L0(0, linearLayoutManager.m678v(), false);
            iM513J0 = viewM515L0 == null ? -1 : AbstractC0066e.m651F(viewM515L0);
        } else {
            iM513J0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).m513J0();
        }
        Calendar calendarM6227a = t42.m6227a(c1409sk.f10420a.f1222a);
        calendarM6227a.add(2, iM513J0);
        qz0Var.f9624d = new b61(calendarM6227a);
        Calendar calendarM6227a2 = t42.m6227a(c1409sk.f10420a.f1222a);
        calendarM6227a2.add(2, iM513J0);
        calendarM6227a2.set(5, 1);
        Calendar calendarM6227a3 = t42.m6227a(calendarM6227a2);
        calendarM6227a3.get(2);
        calendarM6227a3.get(1);
        calendarM6227a3.getMaximum(7);
        calendarM6227a3.getActualMaximum(5);
        calendarM6227a3.getTimeInMillis();
        long timeInMillis = calendarM6227a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = t42.f10749a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f9239b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
