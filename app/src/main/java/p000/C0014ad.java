package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: ad */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0014ad implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0014ad f146a = new C0014ad();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f147b = FieldDescriptor.m1849of("clientType");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f148c = FieldDescriptor.m1849of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        AbstractC1152no abstractC1152no = (AbstractC1152no) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        ((C1476ud) abstractC1152no).getClass();
        objectEncoderContext2.add(f147b, EnumC1115mo.f7055a);
        objectEncoderContext2.add(f148c, ((C1476ud) abstractC1152no).f11262a);
    }
}
