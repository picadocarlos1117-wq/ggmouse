package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class kf1 {

    /* JADX INFO: renamed from: a */
    public final Object[] f5789a;

    /* JADX INFO: renamed from: b */
    public int f5790b;

    public kf1(int i) {
        if (i > 0) {
            this.f5789a = new Object[i];
        } else {
            f40.m2713i("The max pool size must be > 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object mo3822a() {
        int i = this.f5790b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5789a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5790b = i2;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m3823b(C0670ga c0670ga) {
        int i = this.f5790b;
        Object[] objArr = this.f5789a;
        if (i < objArr.length) {
            objArr[i] = c0670ga;
            this.f5790b = i + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo3824c(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.f5790b;
            Object[] objArr = this.f5789a;
            if (i >= i2) {
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f5790b = i2 + 1;
                return true;
            }
            if (objArr[i] == obj) {
                f40.m2719o("Already in the pool!");
                return false;
            }
            i++;
        }
    }

    public kf1() {
        this.f5789a = new Object[256];
    }
}
