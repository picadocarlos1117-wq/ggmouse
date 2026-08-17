package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sousasantoslogic.sspro.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: nx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1161nx extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f7567a;

    /* JADX INFO: renamed from: b */
    public final int f7568b;

    /* JADX INFO: renamed from: c */
    public final int f7569c;

    public C1161nx() {
        Calendar calendarM6229c = t42.m6229c(null);
        this.f7567a = calendarM6229c;
        this.f7568b = calendarM6229c.getMaximum(7);
        this.f7569c = calendarM6229c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7568b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f7568b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f7569c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f7569c;
        int i3 = this.f7568b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f7567a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C1161nx(int i) {
        Calendar calendarM6229c = t42.m6229c(null);
        this.f7567a = calendarM6229c;
        this.f7568b = calendarM6229c.getMaximum(7);
        this.f7569c = i;
    }
}
