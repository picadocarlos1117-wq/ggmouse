package android.sun.security.pkcs;

import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class SigningCertificateInfo {
    private byte[] ber = null;
    private ESSCertId[] certId = null;

    public SigningCertificateInfo(byte[] bArr) throws IOException {
        parse(bArr);
    }

    public void parse(byte[] bArr) throws IOException {
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Bad encoding for signingCertificate");
            return;
        }
        DerValue[] sequence = derValue.data.getSequence(1);
        this.certId = new ESSCertId[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            this.certId[i] = new ESSCertId(sequence[i]);
        }
        if (derValue.data.available() > 0) {
            for (int i2 = 0; i2 < derValue.data.getSequence(1).length; i2++) {
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[\n");
        int i = 0;
        while (true) {
            ESSCertId[] eSSCertIdArr = this.certId;
            if (i >= eSSCertIdArr.length) {
                stringBuffer.append("\n]");
                return stringBuffer.toString();
            }
            stringBuffer.append(eSSCertIdArr[i].toString());
            i++;
        }
    }
}
