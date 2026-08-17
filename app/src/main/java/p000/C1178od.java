package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: od */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1178od implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C1178od f7757a = new C1178od();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f7758b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f7759c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        p02 p02Var = (p02) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f7758b, p02Var.f8610a);
        objectEncoderContext2.add(f7759c, p02Var.f8611b);
    }
}
