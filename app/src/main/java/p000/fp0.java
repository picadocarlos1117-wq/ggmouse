package p000;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public vo0 f3877h;

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: G */
    public final void mo2841G(int i, String str) {
        vo0 vo0Var = this.f3877h;
        Level levelM5859o0 = C1374rm.m5859o0(i);
        if (C1485um.f11357c.isLoggable(levelM5859o0)) {
            C1485um.m6509a(vo0Var, levelM5859o0, str);
        }
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: H */
    public final void mo2842H(int i, String str, Object... objArr) {
        vo0 vo0Var = this.f3877h;
        Level levelM5859o0 = C1374rm.m5859o0(i);
        if (C1485um.f11357c.isLoggable(levelM5859o0)) {
            C1485um.m6509a(vo0Var, levelM5859o0, MessageFormat.format(str, objArr));
        }
    }
}
