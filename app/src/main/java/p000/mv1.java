package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum mv1 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* JADX INFO: renamed from: a */
    public final int f7126a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7127b;

    mv1(int i) {
        this.f7126a = i;
        this.f7127b = Integer.toString(i).getBytes(AbstractC0646fn.f3855a);
    }

    /* JADX INFO: renamed from: a */
    public final nv1 m4462a() {
        return (nv1) nv1.f7549d.get(this.f7126a);
    }
}
