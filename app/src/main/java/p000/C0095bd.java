package p000;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095bd implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C0095bd f1302a = new C0095bd();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f1303b = FieldDescriptor.m1849of("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f1304c = FieldDescriptor.m1849of("eventCode");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f1305d = FieldDescriptor.m1849of("eventUptimeMs");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f1306e = FieldDescriptor.m1849of("sourceExtension");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f1307f = FieldDescriptor.m1849of("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f1308g = FieldDescriptor.m1849of("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f1309h = FieldDescriptor.m1849of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        qv0 qv0Var = (qv0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f1303b, ((C1661zd) qv0Var).f13349a);
        C1661zd c1661zd = (C1661zd) qv0Var;
        objectEncoderContext2.add(f1304c, c1661zd.f13350b);
        objectEncoderContext2.add(f1305d, c1661zd.f13351c);
        objectEncoderContext2.add(f1306e, c1661zd.f13352d);
        objectEncoderContext2.add(f1307f, c1661zd.f13353e);
        objectEncoderContext2.add(f1308g, c1661zd.f13354f);
        objectEncoderContext2.add(f1309h, c1661zd.f13355g);
    }
}
