package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import p000.AbstractC1356r4;
import p000.InterfaceC0615et;
import p000.InterfaceC1393s4;
import p000.ab1;
import p000.fs0;
import p000.h41;
import p000.hp1;
import p000.jp1;
import p000.k31;
import p000.kf0;
import p000.ra1;
import p000.sa1;
import p000.ta1;
import p000.v72;
import p000.w72;
import p000.wa1;
import p000.xa1;
import p000.xe0;

/* JADX INFO: renamed from: androidx.fragment.app.p */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0052p extends xe0 implements ta1, ab1, wa1, xa1, w72, sa1, InterfaceC1393s4, jp1, kf0, k31 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractActivityC0053q f695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052p(AbstractActivityC0053q abstractActivityC0053q) {
        super(abstractActivityC0053q);
        this.f695e = abstractActivityC0053q;
    }

    @Override // p000.kf0
    /* JADX INFO: renamed from: a */
    public final void mo361a(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f695e.onAttachFragment(abstractComponentCallbacksC0048l);
    }

    @Override // p000.k31
    public final void addMenuProvider(h41 h41Var) {
        this.f695e.addMenuProvider(h41Var);
    }

    @Override // p000.ta1
    public final void addOnConfigurationChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.addOnConfigurationChangedListener(interfaceC0615et);
    }

    @Override // p000.wa1
    public final void addOnMultiWindowModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.addOnMultiWindowModeChangedListener(interfaceC0615et);
    }

    @Override // p000.xa1
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.addOnPictureInPictureModeChangedListener(interfaceC0615et);
    }

    @Override // p000.ab1
    public final void addOnTrimMemoryListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.addOnTrimMemoryListener(interfaceC0615et);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: b */
    public final View mo352b(int i) {
        return this.f695e.findViewById(i);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: c */
    public final boolean mo353c() {
        Window window = this.f695e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.InterfaceC1393s4
    public final AbstractC1356r4 getActivityResultRegistry() {
        return this.f695e.getActivityResultRegistry();
    }

    @Override // p000.ms0
    public final fs0 getLifecycle() {
        return this.f695e.mFragmentLifecycleRegistry;
    }

    @Override // p000.sa1
    public final ra1 getOnBackPressedDispatcher() {
        return this.f695e.getOnBackPressedDispatcher();
    }

    @Override // p000.jp1
    public final hp1 getSavedStateRegistry() {
        return this.f695e.getSavedStateRegistry();
    }

    @Override // p000.w72
    public final v72 getViewModelStore() {
        return this.f695e.getViewModelStore();
    }

    @Override // p000.k31
    public final void removeMenuProvider(h41 h41Var) {
        this.f695e.removeMenuProvider(h41Var);
    }

    @Override // p000.ta1
    public final void removeOnConfigurationChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.removeOnConfigurationChangedListener(interfaceC0615et);
    }

    @Override // p000.wa1
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.removeOnMultiWindowModeChangedListener(interfaceC0615et);
    }

    @Override // p000.xa1
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.removeOnPictureInPictureModeChangedListener(interfaceC0615et);
    }

    @Override // p000.ab1
    public final void removeOnTrimMemoryListener(InterfaceC0615et interfaceC0615et) {
        this.f695e.removeOnTrimMemoryListener(interfaceC0615et);
    }
}
