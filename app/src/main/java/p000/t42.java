package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t42 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f10749a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m6227a(Calendar calendar) {
        Calendar calendarM6229c = m6229c(calendar);
        Calendar calendarM6229c2 = m6229c(null);
        calendarM6229c2.set(calendarM6229c.get(1), calendarM6229c.get(2), calendarM6229c.get(5));
        return calendarM6229c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m6228b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m6229c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
