package p000;

import android.sun.security.x509.CRLReasonCodeExtension;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: renamed from: kd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824kd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0824kd f5755a = new C0824kd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f5756b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f5757c = FieldDescriptor.builder(CRLReasonCodeExtension.REASON).withProperty(AtProtobuf.builder().tag(3).build()).build();

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        sv0 sv0Var = (sv0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f5756b, sv0Var.f10563a);
        objectEncoderContext2.add(f5757c, sv0Var.f10564b);
    }
}
