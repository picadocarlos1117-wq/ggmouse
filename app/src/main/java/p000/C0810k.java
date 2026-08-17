package p000;

import java.io.IOException;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0810k extends IOException {

    /* JADX INFO: renamed from: a */
    public final RuntimeException f5622a;

    public C0810k(RuntimeException runtimeException, String str) {
        super(str);
        this.f5622a = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5622a;
    }
}
