package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: cd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131cd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0131cd f1767a = new C0131cd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f1768b = FieldDescriptor.m1849of("requestTimeMs");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f1769c = FieldDescriptor.m1849of("requestUptimeMs");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f1770d = FieldDescriptor.m1849of("clientInfo");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f1771e = FieldDescriptor.m1849of("logSource");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f1772f = FieldDescriptor.m1849of("logSourceName");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f1773g = FieldDescriptor.m1849of("logEvent");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f1774h = FieldDescriptor.m1849of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        uv0 uv0Var = (uv0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1768b, ((C0015ae) uv0Var).f168a);
        C0015ae c0015ae = (C0015ae) uv0Var;
        objectEncoderContext2.add(f1769c, c0015ae.f169b);
        objectEncoderContext2.add(f1770d, c0015ae.f170c);
        objectEncoderContext2.add(f1771e, c0015ae.f171d);
        objectEncoderContext2.add(f1772f, c0015ae.f172e);
        objectEncoderContext2.add(f1773g, c0015ae.f173f);
        objectEncoderContext2.add(f1774h, ai1.f240a);
    }
}
