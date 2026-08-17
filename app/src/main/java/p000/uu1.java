package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 implements Iterator {

    /* JADX INFO: renamed from: b */
    public String f11432b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f11433c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1596xm f11434d;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ pn0 f11437g;

    /* JADX INFO: renamed from: a */
    public int f11431a = 2;

    /* JADX INFO: renamed from: e */
    public int f11435e = 0;

    /* JADX INFO: renamed from: f */
    public int f11436f = Integer.MAX_VALUE;

    public uu1(pn0 pn0Var, qo0 qo0Var, CharSequence charSequence) {
        this.f11437g = pn0Var;
        this.f11434d = (AbstractC1596xm) qo0Var.f9548b;
        this.f11433c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC1596xm abstractC1596xm;
        p32.m5192w(this.f11431a != 4);
        int iM5359z = AbstractC1308pu.m5359z(this.f11431a);
        if (iM5359z == 0) {
            return true;
        }
        if (iM5359z != 2) {
            this.f11431a = 4;
            int i = this.f11435e;
            while (true) {
                int length = this.f11435e;
                if (length == -1) {
                    this.f11431a = 3;
                    string = null;
                    break;
                }
                C1633ym c1633ym = (C1633ym) this.f11437g.f8968a;
                CharSequence charSequence = this.f11433c;
                int length2 = charSequence.length();
                p32.m5189t(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (c1633ym.mo196a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.f11435e = -1;
                } else {
                    this.f11435e = length + 1;
                }
                int i2 = this.f11435e;
                if (i2 != i) {
                    while (true) {
                        abstractC1596xm = this.f11434d;
                        if (i >= length || !abstractC1596xm.mo196a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && abstractC1596xm.mo196a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i3 = this.f11436f;
                    if (i3 == 1) {
                        length = charSequence.length();
                        this.f11435e = -1;
                        while (length > i && abstractC1596xm.mo196a(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f11436f = i3 - 1;
                    }
                    string = charSequence.subSequence(i, length).toString();
                    break;
                }
                int i4 = i2 + 1;
                this.f11435e = i4;
                if (i4 > charSequence.length()) {
                    this.f11435e = -1;
                }
            }
            this.f11432b = string;
            if (this.f11431a != 3) {
                this.f11431a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        this.f11431a = 2;
        String str = this.f11432b;
        this.f11432b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
