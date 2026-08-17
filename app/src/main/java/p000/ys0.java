package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f13126a;

    /* JADX INFO: renamed from: b */
    public int f13127b;

    /* JADX INFO: renamed from: c */
    public int f13128c;

    /* JADX INFO: renamed from: d */
    public int f13129d;

    /* JADX INFO: renamed from: e */
    public int f13130e;

    public ys0(CharSequence charSequence) {
        charSequence.getClass();
        this.f13126a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f13127b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f13130e < 0) {
            this.f13127b = 2;
            return false;
        }
        CharSequence charSequence = this.f13126a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f13128c; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f13127b = 1;
                this.f13130e = i;
                this.f13129d = length;
                return true;
            }
        }
        i = -1;
        this.f13127b = 1;
        this.f13130e = i;
        this.f13129d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        this.f13127b = 0;
        int i = this.f13129d;
        int i2 = this.f13128c;
        this.f13128c = this.f13130e + i;
        return this.f13126a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
