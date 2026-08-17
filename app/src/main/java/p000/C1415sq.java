package p000;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;

/* JADX INFO: renamed from: sq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1415sq implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10481b;

    public /* synthetic */ C1415sq(Object obj, int i) {
        this.f10480a = i;
        this.f10481b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        int i = this.f10480a;
        Object obj = this.f10481b;
        switch (i) {
            case 0:
                return Component.lambda$of$2(obj, componentContainer);
            case 1:
                return Component.lambda$intoSet$4(obj, componentContainer);
            case 2:
                return Component.lambda$intoSet$3(obj, componentContainer);
            case 3:
                return Component.lambda$of$0(obj, componentContainer);
            case 4:
                return Component.lambda$of$1(obj, componentContainer);
            default:
                return DefaultHeartBeatController.lambda$component$3((Qualified) obj, componentContainer);
        }
    }
}
