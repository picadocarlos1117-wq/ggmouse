package p000;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum rv0 implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a */
    public final int f10147a;

    rv0(int i) {
        this.f10147a = i;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.f10147a;
    }
}
