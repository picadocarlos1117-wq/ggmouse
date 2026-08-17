package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: xg */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1590xg {

    /* JADX INFO: renamed from: a */
    public static final C1627yg f12598a = new C1627yg();

    /* JADX INFO: renamed from: a */
    public static byte[] m6923a(byte[] bArr) {
        int length = bArr.length;
        C1627yg c1627yg = f12598a;
        c1627yg.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c1627yg.m7079a(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1499v("exception encoding base64 string: " + e.getMessage(), e, 2);
        }
    }
}
