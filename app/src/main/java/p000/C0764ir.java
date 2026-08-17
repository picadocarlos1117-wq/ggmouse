package p000;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: ir */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0764ir implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentRegistrar f5134b;

    public /* synthetic */ C0764ir(ComponentRegistrar componentRegistrar, int i) {
        this.f5133a = i;
        this.f5134b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.f5133a;
        ComponentRegistrar componentRegistrar = this.f5134b;
        switch (i) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(componentRegistrar);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
        }
    }
}
