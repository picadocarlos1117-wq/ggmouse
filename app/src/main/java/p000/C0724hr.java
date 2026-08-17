package p000;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.functions.FunctionsRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: renamed from: hr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0724hr implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4669c;

    public /* synthetic */ C0724hr(int i, Object obj, Object obj2) {
        this.f4667a = i;
        this.f4668b = obj;
        this.f4669c = obj2;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i = this.f4667a;
        Object obj = this.f4669c;
        Object obj2 = this.f4668b;
        switch (i) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0((String) obj2, (Component) obj, componentContainer);
            case 1:
                return FunctionsRegistrar.getComponents$lambda$0((Qualified) obj2, (Qualified) obj, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0((String) obj2, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
        }
    }
}
