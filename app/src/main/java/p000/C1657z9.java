package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1657z9 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13315a;

    /* JADX INFO: renamed from: b */
    public final Object f13316b;

    /* JADX INFO: renamed from: c */
    public int f13317c;

    public C1657z9(Object[] objArr, int i) {
        this.f13315a = i;
        switch (i) {
            case 1:
                this.f13317c = 0;
                this.f13316b = objArr;
                break;
            default:
                objArr.getClass();
                this.f13316b = objArr;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f13315a;
        Object obj = this.f13316b;
        switch (i) {
            case 0:
                return this.f13317c < ((Object[]) obj).length;
            case 1:
                return this.f13317c < ((Object[]) obj).length;
            default:
                return this.f13317c < ((AbstractC1463u0) obj).mo6170a();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13315a;
        Object obj = this.f13316b;
        switch (i) {
            case 0:
                try {
                    int i2 = this.f13317c;
                    this.f13317c = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f13317c--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                int i3 = this.f13317c;
                Object[] objArr = (Object[]) obj;
                if (i3 != objArr.length) {
                    this.f13317c = i3 + 1;
                    return objArr[i3];
                }
                throw new NoSuchElementException("Out of elements: " + this.f13317c);
            default:
                if (!hasNext()) {
                    ca0.m1185q();
                    return null;
                }
                int i4 = this.f13317c;
                this.f13317c = i4 + 1;
                return ((AbstractC1463u0) obj).get(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13315a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1657z9(AbstractC1463u0 abstractC1463u0) {
        this.f13315a = 2;
        this.f13316b = abstractC1463u0;
    }
}
