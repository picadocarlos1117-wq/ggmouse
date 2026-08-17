package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 implements Comparable, Parcelable {
    public static final Parcelable.Creator<b61> CREATOR = new n21(4);

    /* JADX INFO: renamed from: a */
    public final Calendar f1222a;

    /* JADX INFO: renamed from: b */
    public final int f1223b;

    /* JADX INFO: renamed from: c */
    public final int f1224c;

    /* JADX INFO: renamed from: d */
    public final int f1225d;

    /* JADX INFO: renamed from: e */
    public final int f1226e;

    /* JADX INFO: renamed from: f */
    public final long f1227f;

    /* JADX INFO: renamed from: g */
    public String f1228g;

    public b61(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM6227a = t42.m6227a(calendar);
        this.f1222a = calendarM6227a;
        this.f1223b = calendarM6227a.get(2);
        this.f1224c = calendarM6227a.get(1);
        this.f1225d = calendarM6227a.getMaximum(7);
        this.f1226e = calendarM6227a.getActualMaximum(5);
        this.f1227f = calendarM6227a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static b61 m935a(int i, int i2) {
        Calendar calendarM6229c = t42.m6229c(null);
        calendarM6229c.set(1, i);
        calendarM6229c.set(2, i2);
        return new b61(calendarM6229c);
    }

    /* JADX INFO: renamed from: b */
    public static b61 m936b(long j) {
        Calendar calendarM6229c = t42.m6229c(null);
        calendarM6229c.setTimeInMillis(j);
        return new b61(calendarM6229c);
    }

    /* JADX INFO: renamed from: c */
    public final String m937c() {
        if (this.f1228g == null) {
            long timeInMillis = this.f1222a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = t42.f10749a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f1228g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f1228g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1222a.compareTo(((b61) obj).f1222a);
    }

    /* JADX INFO: renamed from: d */
    public final int m938d(b61 b61Var) {
        if (this.f1222a instanceof GregorianCalendar) {
            return (b61Var.f1223b - this.f1223b) + ((b61Var.f1224c - this.f1224c) * 12);
        }
        f40.m2713i("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b61)) {
            return false;
        }
        b61 b61Var = (b61) obj;
        return this.f1223b == b61Var.f1223b && this.f1224c == b61Var.f1224c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1223b), Integer.valueOf(this.f1224c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1224c);
        parcel.writeInt(this.f1223b);
    }
}
