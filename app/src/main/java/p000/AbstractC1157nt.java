package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: nt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1157nt {

    /* JADX INFO: renamed from: a */
    public static final AbstractC1270ot f7533a;

    static {
        AbstractC1270ot j02Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            j02Var = (AbstractC1270ot) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC1270ot.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            j02Var = new j02();
        } catch (Exception e2) {
            l41.m4043l("Storage override failed to initialize", e2);
            return;
        }
        f7533a = j02Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C1307pt.f9139a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
