package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1660zc implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C1660zc f13340a = new C1660zc();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f13341b = FieldDescriptor.m1849of("logRequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f13341b, ((C1439td) ((AbstractC1517vh) obj)).f10842a);
    }
}
