package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 implements Configurator, InterfaceC1419su, i51, ut1, InterfaceC0643fk, InterfaceC1305pr, InterfaceC1342qr, cs1 {

    /* JADX INFO: renamed from: b */
    public static final bz1 f1577b = new bz1(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bz1 f1578c = new bz1(2);

    /* JADX INFO: renamed from: d */
    public static final bz1 f1579d = new bz1(3);

    /* JADX INFO: renamed from: e */
    public static final bz1 f1580e = new bz1(4);

    /* JADX INFO: renamed from: f */
    public static final byte[] f1581f = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: g */
    public static final bz1 f1582g = new bz1(6);

    /* JADX INFO: renamed from: m */
    public static final bz1 f1583m = new bz1(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1584a;

    public /* synthetic */ bz1(int i) {
        this.f1584a = i;
    }

    /* JADX INFO: renamed from: a */
    public static bz1 m1076a(Context context, int i) {
        rc2.m5784g(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ji1.f5404l);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        o21.m4639H(context, typedArrayObtainStyledAttributes, 4);
        o21.m4639H(context, typedArrayObtainStyledAttributes, 9);
        o21.m4639H(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        pr1.m5309a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0811k0(TouchPipeline.SIZE)).m5050a();
        typedArrayObtainStyledAttributes.recycle();
        bz1 bz1Var = new bz1(12);
        rc2.m5785h(rect.left);
        rc2.m5785h(rect.top);
        rc2.m5785h(rect.right);
        rc2.m5785h(rect.bottom);
        return bz1Var;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m1077g(qm0 qm0Var, long j) {
        f40 f40Var = new f40(27);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qm0Var.size());
        int size = qm0Var.size();
        int i = 0;
        while (i < size) {
            Object obj = qm0Var.get(i);
            i++;
            arrayList.add((Bundle) f40Var.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX INFO: renamed from: h */
    public static p80 m1078h() {
        p80 p80Var = new p80();
        p80Var.f8793a = new Random();
        p80Var.f8794b = 120000000000L;
        p80Var.f8795c = 1.6d;
        p80Var.f8796d = 0.2d;
        p80Var.f8797e = 1000000000L;
        return p80Var;
    }

    /* JADX INFO: renamed from: k */
    public static AudioAttributes m1079k(C1474ub c1474ub, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c1474ub.m6482a().f1096b;
    }

    /* JADX INFO: renamed from: b */
    public ki0 m1080b(be0 be0Var) {
        String str = be0Var.f1341n;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C1137n9(i2);
                case "application/x-icy":
                    return new vl0();
                case "application/id3":
                    return new am0(null);
                case "application/x-emsg":
                    return new C1137n9(i);
                case "application/x-scte35":
                    return new nu1();
            }
        }
        f40.m2713i(AbstractC1308pu.m5339f("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: c */
    public byte[] mo740c(Object obj) {
        switch (this.f1584a) {
            case 5:
                byte[] bytes = ((String) obj).getBytes(AbstractC0646fn.f3856b);
                int i = 0;
                while (i < bytes.length) {
                    byte b = bytes[i];
                    if (b < 32 || b >= 126 || b == 37) {
                        byte[] bArr = new byte[((bytes.length - i) * 3) + i];
                        if (i != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i);
                        }
                        int i2 = i;
                        while (i < bytes.length) {
                            byte b2 = bytes[i];
                            if (b2 < 32 || b2 >= 126 || b2 == 37) {
                                bArr[i2] = 37;
                                byte[] bArr2 = f1581f;
                                bArr[i2 + 1] = bArr2[(b2 >> 4) & 15];
                                bArr[i2 + 2] = bArr2[b2 & 15];
                                i2 += 3;
                            } else {
                                bArr[i2] = b2;
                                i2++;
                            }
                            i++;
                        }
                        return Arrays.copyOf(bArr, i2);
                    }
                    i++;
                }
                return bytes;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(jh1.class, C1104md.f6771a);
        encoderConfig.registerEncoder(C1302po.class, C0747id.f4945a);
        encoderConfig.registerEncoder(p02.class, C1178od.f7757a);
        encoderConfig.registerEncoder(vv0.class, C1067ld.f6316a);
        encoderConfig.registerEncoder(sv0.class, C0824kd.f5755a);
        encoderConfig.registerEncoder(li0.class, C0786jd.f5372a);
        encoderConfig.registerEncoder(tv1.class, C1141nd.f7370a);
    }

    @Override // p000.InterfaceC0643fk
    /* JADX INFO: renamed from: d */
    public byte[] mo1081d(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: e */
    public Object mo1082e() {
        return Executors.newCachedThreadPool(vi0.m6633e("grpc-default-executor-%d"));
    }

    /* JADX INFO: renamed from: f */
    public long m1083f() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public AudioTrack m1084i(C0662g2 c0662g2, C1474ub c1474ub, int i) {
        boolean z = c0662g2.f4016d;
        int i2 = c0662g2.f4013a;
        int i3 = c0662g2.f4015c;
        int i4 = c0662g2.f4014b;
        int i5 = z42.f13274a;
        if (i5 < 23) {
            return new AudioTrack(m1079k(c1474ub, z), z42.m7239m(i4, i3, i2), c0662g2.f4018f, 1, i);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m1079k(c1474ub, z)).setAudioFormat(z42.m7239m(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(c0662g2.f4018f).setSessionId(i);
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(c0662g2.f4017e);
        }
        return sessionId.build();
    }

    @Override // p000.i51
    /* JADX INFO: renamed from: j */
    public Object mo747j(byte[] bArr) {
        switch (this.f1584a) {
            case 5:
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            if (bArr[i2] == 37 && i2 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, AbstractC0646fn.f3855a), 16));
                                    i2 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i2]);
                                    i2++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i2]);
                            i2++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0646fn.f3856b);
                    }
                }
                return new String(bArr, 0);
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, wo0.f12241a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    /* JADX INFO: renamed from: l */
    public int m1085l(int i) {
        return i == 7 ? 6 : 3;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1086m(be0 be0Var) {
        String str = be0Var.f1341n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // p000.InterfaceC1342qr
    /* JADX INFO: renamed from: o */
    public int mo1087o(AbstractC1353r1 abstractC1353r1, int i, Object obj, int i2) {
        switch (this.f1584a) {
            case 14:
                return abstractC1353r1.mo1195p();
            case 15:
                abstractC1353r1.mo1192j(i2, i, (byte[]) obj);
                return i2 + i;
            default:
                abstractC1353r1.mo1193l((OutputStream) obj, i);
                return 0;
        }
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: s */
    public void mo1088s(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public String toString() {
        switch (this.f1584a) {
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                return "grpc-default-executor";
            case 29:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }
}
