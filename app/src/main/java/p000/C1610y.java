package p000;

import java.util.Enumeration;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610y implements Enumeration {

    /* JADX INFO: renamed from: a */
    public int f12789a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1647z f12790b;

    public C1610y(AbstractC1647z abstractC1647z) {
        this.f12790b = abstractC1647z;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f12789a < this.f12790b.f13209a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.f12789a;
        InterfaceC0696h[] interfaceC0696hArr = this.f12790b.f13209a;
        if (i < interfaceC0696hArr.length) {
            this.f12789a = i + 1;
            return interfaceC0696hArr[i];
        }
        ca0.m1185q();
        return null;
    }
}
