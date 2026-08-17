package p000;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: renamed from: jr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0801jr implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5496a;

    public /* synthetic */ C0801jr(int i) {
        this.f5496a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f5496a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.lambda$static$0();
            case 2:
                return ExecutorsRegistrar.lambda$static$1();
            case 3:
                return ExecutorsRegistrar.lambda$static$2();
            default:
                return ExecutorsRegistrar.lambda$static$3();
        }
    }
}
