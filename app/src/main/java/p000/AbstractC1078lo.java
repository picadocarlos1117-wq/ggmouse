package p000;

import java.util.logging.Logger;

/* JADX INFO: renamed from: lo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078lo {

    /* JADX INFO: renamed from: a */
    public static final C0101bj f6481a;

    static {
        Logger.getLogger(AbstractC1078lo.class.getName());
        if (!p32.m5152S(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f6481a = new C0101bj("internal-stub-type", 1);
    }
}
