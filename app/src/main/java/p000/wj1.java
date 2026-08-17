package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 {

    /* JADX INFO: renamed from: a */
    public int f12193a;

    /* JADX INFO: renamed from: b */
    public int f12194b;

    /* JADX INFO: renamed from: c */
    public int f12195c;

    /* JADX INFO: renamed from: d */
    public int f12196d;

    /* JADX INFO: renamed from: e */
    public int f12197e;

    /* JADX INFO: renamed from: f */
    public boolean f12198f;

    /* JADX INFO: renamed from: g */
    public boolean f12199g;

    /* JADX INFO: renamed from: h */
    public boolean f12200h;

    /* JADX INFO: renamed from: i */
    public boolean f12201i;

    /* JADX INFO: renamed from: j */
    public boolean f12202j;

    /* JADX INFO: renamed from: k */
    public boolean f12203k;

    /* JADX INFO: renamed from: l */
    public int f12204l;

    /* JADX INFO: renamed from: m */
    public long f12205m;

    /* JADX INFO: renamed from: n */
    public int f12206n;

    /* JADX INFO: renamed from: a */
    public final void m6800a(int i) {
        if ((this.f12196d & i) != 0) {
            return;
        }
        lv1.m4301m("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.f12196d));
    }

    /* JADX INFO: renamed from: b */
    public final int m6801b() {
        return this.f12199g ? this.f12194b - this.f12195c : this.f12197e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f12193a + ", mData=null, mItemCount=" + this.f12197e + ", mIsMeasuring=" + this.f12201i + ", mPreviousLayoutItemCount=" + this.f12194b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f12195c + ", mStructureChanged=" + this.f12198f + ", mInPreLayout=" + this.f12199g + ", mRunSimpleAnimations=" + this.f12202j + ", mRunPredictiveAnimations=" + this.f12203k + '}';
    }
}
