package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: bg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0098bg implements Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public gc2 f1359a;

    /* JADX INFO: renamed from: b */
    public final int f1360b;

    /* JADX INFO: renamed from: c */
    public int f1361c;

    /* JADX INFO: renamed from: d */
    public int f1362d;

    /* JADX INFO: renamed from: e */
    public boolean f1363e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1364f = false;

    public C0098bg(int i) {
        this.f1360b = i;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0098bg clone() {
        C0098bg c0098bg = new C0098bg(this.f1360b);
        c0098bg.f1359a = this.f1359a;
        c0098bg.f1361c = this.f1361c;
        c0098bg.f1362d = this.f1362d;
        c0098bg.f1363e = this.f1363e;
        c0098bg.f1364f = this.f1364f;
        return c0098bg;
    }

    /* JADX INFO: renamed from: b */
    public final int m973b() {
        if (!this.f1363e || this.f1364f) {
            return Integer.MAX_VALUE;
        }
        return this.f1361c;
    }
}
