package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: ld */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1067ld implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C1067ld f6316a = new C1067ld();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f6317b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f6318c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        vv0 vv0Var = (vv0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f6317b, vv0Var.f11781a);
        objectEncoderContext2.add(f6318c, vv0Var.f11782b);
    }
}
