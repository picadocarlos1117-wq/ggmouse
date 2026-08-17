package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11893a;

    /* JADX INFO: renamed from: b */
    public int f11894b;

    /* JADX INFO: renamed from: c */
    public int f11895c;

    /* JADX INFO: renamed from: d */
    public int f11896d;

    /* JADX INFO: renamed from: e */
    public Object f11897e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f11898f;

    public w10(x10 x10Var) {
        this.f11893a = 0;
        this.f11898f = x10Var;
        this.f11894b = -1;
        int iM5140F = p32.m5140F(0, 0, ((CharSequence) x10Var.f12410b).length());
        this.f11895c = iM5140F;
        this.f11896d = iM5140F;
    }

    /* JADX INFO: renamed from: a */
    public void m6681a() {
        x10 x10Var = (x10) this.f11898f;
        CharSequence charSequence = (CharSequence) x10Var.f12410b;
        int i = this.f11896d;
        if (i < 0) {
            this.f11894b = 0;
            this.f11897e = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.f11895c;
            charSequence.getClass();
            this.f11897e = new co0(i2, charSequence.length() - 1, 1);
            this.f11896d = -1;
        } else {
            bc1 bc1Var = (bc1) ((ch0) x10Var.f12411c).invoke(charSequence, Integer.valueOf(this.f11896d));
            if (bc1Var == null) {
                int i3 = this.f11895c;
                charSequence.getClass();
                this.f11897e = new co0(i3, charSequence.length() - 1, 1);
                this.f11896d = -1;
            } else {
                int iIntValue = ((Number) bc1Var.f1292a).intValue();
                int iIntValue2 = ((Number) bc1Var.f1293b).intValue();
                this.f11897e = p32.m5178l0(this.f11895c, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f11895c = i4;
                this.f11896d = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.f11894b = 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m6682b() {
        this.f11894b = 3;
        int i = this.f11895c;
        if (i == 0) {
            this.f11894b = 2;
        } else {
            um1 um1Var = (um1) this.f11898f;
            Object[] objArr = um1Var.f11361a;
            int i2 = this.f11896d;
            this.f11897e = objArr[i2];
            this.f11894b = 1;
            this.f11896d = (i2 + 1) % um1Var.f11362b;
            this.f11895c = i - 1;
        }
        return this.f11894b == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11893a) {
            case 0:
                if (this.f11894b == -1) {
                    m6681a();
                }
                return this.f11894b == 1;
            default:
                int i = this.f11894b;
                if (i == 0) {
                    return m6682b();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    f40.m2713i("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11893a) {
            case 0:
                if (this.f11894b == -1) {
                    m6681a();
                }
                if (this.f11894b == 0) {
                    ca0.m1185q();
                    return null;
                }
                co0 co0Var = (co0) this.f11897e;
                co0Var.getClass();
                this.f11897e = null;
                this.f11894b = -1;
                return co0Var;
            default:
                int i = this.f11894b;
                if (i == 1) {
                    this.f11894b = 0;
                    return this.f11897e;
                }
                if (i == 2 || !m6682b()) {
                    ca0.m1185q();
                    return null;
                }
                this.f11894b = 0;
                return this.f11897e;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11893a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w10(um1 um1Var) {
        this.f11893a = 1;
        this.f11898f = um1Var;
        this.f11895c = um1Var.f11364d;
        this.f11896d = um1Var.f11363c;
    }
}
