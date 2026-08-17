package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: yc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1623yc implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C1623yc f12935a = new C1623yc();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f12936b = FieldDescriptor.m1849of("sdkVersion");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f12937c = FieldDescriptor.m1849of("model");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f12938d = FieldDescriptor.m1849of("hardware");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f12939e = FieldDescriptor.m1849of("device");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f12940f = FieldDescriptor.m1849of("product");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f12941g = FieldDescriptor.m1849of("osBuild");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f12942h = FieldDescriptor.m1849of("manufacturer");

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f12943i = FieldDescriptor.m1849of("fingerprint");

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f12944j = FieldDescriptor.m1849of("locale");

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f12945k = FieldDescriptor.m1849of("country");

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f12946l = FieldDescriptor.m1849of("mccMnc");

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f12947m = FieldDescriptor.m1849of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        AbstractC0124c6 abstractC0124c6 = (AbstractC0124c6) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f12936b, ((C1365rd) abstractC0124c6).f9896a);
        C1365rd c1365rd = (C1365rd) abstractC0124c6;
        objectEncoderContext2.add(f12937c, c1365rd.f9897b);
        objectEncoderContext2.add(f12938d, c1365rd.f9898c);
        objectEncoderContext2.add(f12939e, c1365rd.f9899d);
        objectEncoderContext2.add(f12940f, c1365rd.f9900e);
        objectEncoderContext2.add(f12941g, c1365rd.f9901f);
        objectEncoderContext2.add(f12942h, c1365rd.f9902g);
        objectEncoderContext2.add(f12943i, c1365rd.f9903h);
        objectEncoderContext2.add(f12944j, c1365rd.f9904i);
        objectEncoderContext2.add(f12945k, c1365rd.f9905j);
        objectEncoderContext2.add(f12946l, c1365rd.f9906k);
        objectEncoderContext2.add(f12947m, c1365rd.f9907l);
    }
}
