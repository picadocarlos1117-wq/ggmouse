package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0747id implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0747id f4945a = new C0747id();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f4946b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f4947c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f4948d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f4949e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C1302po c1302po = (C1302po) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f4946b, c1302po.f8970a);
        objectEncoderContext2.add(f4947c, c1302po.f8971b);
        objectEncoderContext2.add(f4948d, c1302po.f8972c);
        objectEncoderContext2.add(f4949e, c1302po.f8973d);
    }
}
