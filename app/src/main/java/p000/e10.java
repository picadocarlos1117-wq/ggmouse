package p000;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e10 implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3152a;

    public /* synthetic */ e10(int i) {
        this.f3152a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f3152a) {
            case 0:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            case 1:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 5:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            default:
                return FirestoreRegistrar.lambda$getComponents$0(componentContainer);
        }
    }
}
