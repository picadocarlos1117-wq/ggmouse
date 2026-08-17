package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f3898a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3899b;

    public fu1(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f3899b = new ArrayList();
        rc2.m5789j(cls, "watcherClass cannot be null");
        this.f3898a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m2852a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3899b;
            if (i >= arrayList.size()) {
                return;
            }
            ((eu1) arrayList.get(i)).f3441b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m2853b() {
        m2856e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3899b;
            if (i >= arrayList.size()) {
                return;
            }
            ((eu1) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final eu1 m2854c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3899b;
            if (i >= arrayList.size()) {
                return null;
            }
            eu1 eu1Var = (eu1) arrayList.get(i);
            if (eu1Var.f3440a == obj) {
                return eu1Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2855d(Object obj) {
        if (obj != null) {
            return this.f3898a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m2856e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3899b;
            if (i >= arrayList.size()) {
                return;
            }
            ((eu1) arrayList.get(i)).f3441b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        eu1 eu1VarM2854c;
        if (m2855d(obj) && (eu1VarM2854c = m2854c(obj)) != null) {
            obj = eu1VarM2854c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        eu1 eu1VarM2854c;
        if (m2855d(obj) && (eu1VarM2854c = m2854c(obj)) != null) {
            obj = eu1VarM2854c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        eu1 eu1VarM2854c;
        if (m2855d(obj) && (eu1VarM2854c = m2854c(obj)) != null) {
            obj = eu1VarM2854c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f3898a != cls) {
            return super.getSpans(i, i2, cls);
        }
        eu1[] eu1VarArr = (eu1[]) super.getSpans(i, i2, eu1.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, eu1VarArr.length);
        for (int i3 = 0; i3 < eu1VarArr.length; i3++) {
            objArr[i3] = eu1VarArr[i3].f3440a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f3898a == cls) {
            cls = eu1.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        eu1 eu1VarM2854c;
        if (m2855d(obj)) {
            eu1VarM2854c = m2854c(obj);
            if (eu1VarM2854c != null) {
                obj = eu1VarM2854c;
            }
        } else {
            eu1VarM2854c = null;
        }
        super.removeSpan(obj);
        if (eu1VarM2854c != null) {
            this.f3899b.remove(eu1VarM2854c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m2852a();
        super.replace(i, i2, charSequence);
        m2856e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m2855d(obj)) {
            eu1 eu1Var = new eu1(obj);
            this.f3899b.add(eu1Var);
            obj = eu1Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new fu1(this.f3898a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m2852a();
        super.replace(i, i2, charSequence, i3, i4);
        m2856e();
        return this;
    }

    public fu1(Class cls, fu1 fu1Var, int i, int i2) {
        super(fu1Var, i, i2);
        this.f3899b = new ArrayList();
        rc2.m5789j(cls, "watcherClass cannot be null");
        this.f3898a = cls;
    }
}
