package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sousasantoslogic.sspro.R;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c61 extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f1682d = t42.m6229c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f1683e = (t42.m6229c(null).getMaximum(7) + t42.m6229c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final b61 f1684a;

    /* JADX INFO: renamed from: b */
    public C0558d8 f1685b;

    /* JADX INFO: renamed from: c */
    public final C1409sk f1686c;

    public c61(b61 b61Var, C1409sk c1409sk) {
        this.f1684a = b61Var;
        this.f1686c = c1409sk;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1137a() {
        int firstDayOfWeek = this.f1686c.f10424e;
        b61 b61Var = this.f1684a;
        Calendar calendar = b61Var.f1222a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + b61Var.f1225d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m1137a() || i > m1139c()) {
            return null;
        }
        int iM1137a = (i - m1137a()) + 1;
        Calendar calendarM6227a = t42.m6227a(this.f1684a.f1222a);
        calendarM6227a.set(5, iM1137a);
        return Long.valueOf(calendarM6227a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m1139c() {
        return (m1137a() + this.f1684a.f1226e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1683e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f1684a.f1225d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1685b == null) {
            this.f1685b = new C0558d8(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM1137a = i - m1137a();
        if (iM1137a >= 0) {
            b61 b61Var = this.f1684a;
            if (iM1137a >= b61Var.f1226e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(b61Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM1137a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        t42.m6228b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
