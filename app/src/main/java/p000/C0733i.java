package p000;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes.dex */
public final class C0733i implements d82 {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0696h[] f4750e = new InterfaceC0696h[0];

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4751a;

    /* JADX INFO: renamed from: b */
    public boolean f4752b;

    /* JADX INFO: renamed from: c */
    public int f4753c;

    /* JADX INFO: renamed from: d */
    public Object f4754d;

    public C0733i(int i) {
        this.f4751a = 0;
        if (i < 0) {
            f40.m2713i("'initialCapacity' must not be negative");
            throw null;
        }
        this.f4754d = i == 0 ? f4750e : new InterfaceC0696h[i];
        this.f4753c = 0;
        this.f4752b = false;
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: a */
    public void mo2288a() {
        this.f4752b = true;
    }

    /* JADX INFO: renamed from: b */
    public void m3324b(InterfaceC0696h interfaceC0696h) {
        if (interfaceC0696h == null) {
            l41.m4051t("'element' cannot be null");
            return;
        }
        InterfaceC0696h[] interfaceC0696hArr = (InterfaceC0696h[]) this.f4754d;
        int length = interfaceC0696hArr.length;
        int i = this.f4753c + 1;
        if (this.f4752b | (i > length)) {
            InterfaceC0696h[] interfaceC0696hArr2 = new InterfaceC0696h[Math.max(interfaceC0696hArr.length, (i >> 1) + i)];
            System.arraycopy((InterfaceC0696h[]) this.f4754d, 0, interfaceC0696hArr2, 0, this.f4753c);
            this.f4754d = interfaceC0696hArr2;
            this.f4752b = false;
        }
        ((InterfaceC0696h[]) this.f4754d)[this.f4753c] = interfaceC0696h;
        this.f4753c = i;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0696h m3325c(int i) {
        if (i < this.f4753c) {
            return ((InterfaceC0696h[]) this.f4754d)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f4753c);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0696h[] m3326d() {
        int i = this.f4753c;
        if (i == 0) {
            return f4750e;
        }
        InterfaceC0696h[] interfaceC0696hArr = (InterfaceC0696h[]) this.f4754d;
        if (interfaceC0696hArr.length == i) {
            this.f4752b = true;
            return interfaceC0696hArr;
        }
        InterfaceC0696h[] interfaceC0696hArr2 = new InterfaceC0696h[i];
        System.arraycopy(interfaceC0696hArr, 0, interfaceC0696hArr2, 0, i);
        return interfaceC0696hArr2;
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: e */
    public void mo2289e() {
        super/*android.view.View*/.setVisibility(0);
        this.f4752b = false;
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: f */
    public void mo139f() {
        if (this.f4752b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4754d;
        actionBarContextView.f384f = null;
        super/*android.view.View*/.setVisibility(this.f4753c);
    }

    public String toString() {
        switch (this.f4751a) {
            case 2:
                C1679zv c1679zvM5176k0 = p32.m5176k0(this);
                c1679zvM5176k0.m7359a((C0022al) this.f4754d, "callOptions");
                c1679zvM5176k0.m7362d("previousAttempts", String.valueOf(this.f4753c));
                c1679zvM5176k0.m7361c("isTransparentRetry", this.f4752b);
                return c1679zvM5176k0.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0733i() {
        this(10);
        this.f4751a = 0;
    }

    public C0733i(C0022al c0022al, int i, boolean z) {
        this.f4751a = 2;
        p32.m5188s(c0022al, "callOptions");
        this.f4754d = c0022al;
        this.f4753c = i;
        this.f4752b = z;
    }

    public C0733i(ActionBarContextView actionBarContextView) {
        this.f4751a = 1;
        this.f4754d = actionBarContextView;
        this.f4752b = false;
    }
}
