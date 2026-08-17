package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0563dd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0563dd f2892a = new C0563dd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f2893b = FieldDescriptor.m1849of("networkType");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f2894c = FieldDescriptor.m1849of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        j81 j81Var = (j81) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f2893b, ((C0132ce) j81Var).f1777a);
        objectEncoderContext2.add(f2894c, ((C0132ce) j81Var).f1778b);
    }
}
