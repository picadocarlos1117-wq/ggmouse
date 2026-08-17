package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: jd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786jd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0786jd f5372a = new C0786jd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f5373b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f5373b, ((li0) obj).f6356a);
    }
}
