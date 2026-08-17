package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia1 {
    private final CopyOnWriteArrayList<InterfaceC0832kl> cancellables = new CopyOnWriteArrayList<>();
    private mg0 enabledChangedCallback;
    private boolean isEnabled;

    public ia1(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(InterfaceC0832kl interfaceC0832kl) {
        interfaceC0832kl.getClass();
        this.cancellables.add(interfaceC0832kl);
    }

    public final mg0 getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C1368rg c1368rg) {
        c1368rg.getClass();
    }

    public void handleOnBackStarted(C1368rg c1368rg) {
        c1368rg.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0832kl) it.next()).cancel();
        }
    }

    public final void removeCancellable(InterfaceC0832kl interfaceC0832kl) {
        interfaceC0832kl.getClass();
        this.cancellables.remove(interfaceC0832kl);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        mg0 mg0Var = this.enabledChangedCallback;
        if (mg0Var != null) {
            mg0Var.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(mg0 mg0Var) {
        this.enabledChangedCallback = mg0Var;
    }

    public void handleOnBackCancelled() {
    }
}
