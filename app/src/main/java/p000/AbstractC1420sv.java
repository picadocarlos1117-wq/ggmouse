package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: sv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1420sv extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a */
    public boolean f10556a;

    /* JADX INFO: renamed from: b */
    public boolean f10557b;

    /* JADX INFO: renamed from: c */
    public Cursor f10558c;

    /* JADX INFO: renamed from: d */
    public int f10559d;

    /* JADX INFO: renamed from: e */
    public C1346qv f10560e;

    /* JADX INFO: renamed from: f */
    public C1383rv f10561f;

    /* JADX INFO: renamed from: g */
    public C1457tv f10562g;

    /* JADX INFO: renamed from: a */
    public abstract void mo2140a(View view, Cursor cursor);

    /* JADX INFO: renamed from: b */
    public void mo2141b(Cursor cursor) {
        Cursor cursor2 = this.f10558c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1346qv c1346qv = this.f10560e;
                if (c1346qv != null) {
                    cursor2.unregisterContentObserver(c1346qv);
                }
                C1383rv c1383rv = this.f10561f;
                if (c1383rv != null) {
                    cursor2.unregisterDataSetObserver(c1383rv);
                }
            }
            this.f10558c = cursor;
            if (cursor != null) {
                C1346qv c1346qv2 = this.f10560e;
                if (c1346qv2 != null) {
                    cursor.registerContentObserver(c1346qv2);
                }
                C1383rv c1383rv2 = this.f10561f;
                if (c1383rv2 != null) {
                    cursor.registerDataSetObserver(c1383rv2);
                }
                this.f10559d = cursor.getColumnIndexOrThrow("_id");
                this.f10556a = true;
                notifyDataSetChanged();
            } else {
                this.f10559d = -1;
                this.f10556a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo2142c(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract View mo2143d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f10556a || (cursor = this.f10558c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10556a) {
            return null;
        }
        this.f10558c.moveToPosition(i);
        if (view == null) {
            cy1 cy1Var = (cy1) this;
            view = cy1Var.f2669o.inflate(cy1Var.f2668n, viewGroup, false);
        }
        mo2140a(view, this.f10558c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f10562g == null) {
            C1457tv c1457tv = new C1457tv();
            c1457tv.f11020a = this;
            this.f10562g = c1457tv;
        }
        return this.f10562g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f10556a || (cursor = this.f10558c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10558c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f10556a && (cursor = this.f10558c) != null && cursor.moveToPosition(i)) {
            return this.f10558c.getLong(this.f10559d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10556a) {
            f40.m2719o("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f10558c.moveToPosition(i)) {
            f40.m2719o(jd0.m3609g(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = mo2143d(viewGroup);
        }
        mo2140a(view, this.f10558c);
        return view;
    }
}
