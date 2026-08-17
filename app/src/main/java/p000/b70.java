package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum b70 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STREAM(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_VERSION(1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS(-1);


    /* JADX INFO: renamed from: a */
    public final int f1246a;

    b70(int i) {
        this.f1246a = i;
    }
}
