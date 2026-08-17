package p000;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dq0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2994a;

    public /* synthetic */ dq0(int i) {
        this.f2994a = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        switch (this.f2994a) {
            case 0:
                JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext2);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext2);
                break;
        }
    }
}
