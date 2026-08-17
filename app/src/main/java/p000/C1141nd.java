package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: nd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1141nd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C1141nd f7370a = new C1141nd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f7371b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f7372c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        tv1 tv1Var = (tv1) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f7371b, tv1Var.f11023a);
        objectEncoderContext2.add(f7372c, tv1Var.f11024b);
    }
}
