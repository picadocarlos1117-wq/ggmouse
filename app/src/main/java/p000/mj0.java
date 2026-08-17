package p000;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a */
    public nn1 f7003a;

    /* JADX INFO: renamed from: b */
    public int f7004b;

    /* JADX INFO: renamed from: c */
    public int f7005c;

    /* JADX INFO: renamed from: d */
    public e31 f7006d;

    /* JADX INFO: renamed from: e */
    public e31 f7007e;

    /* JADX INFO: renamed from: f */
    public byte[] f7008f;

    /* JADX INFO: renamed from: g */
    public byte[] f7009g;

    static {
        Hashtable hashtable = new Hashtable();
        hashtable.put("GOST3411", 32);
        hashtable.put("MD2", 16);
        hashtable.put("MD4", 64);
        hashtable.put("MD5", 64);
        hashtable.put("RIPEMD128", 64);
        hashtable.put("RIPEMD160", 64);
        hashtable.put("SHA-1", 64);
        hashtable.put("SHA-224", 64);
        hashtable.put("SHA-256", 64);
        hashtable.put("SHA-384", 128);
        hashtable.put("SHA-512", 128);
        hashtable.put("Tiger", 64);
        hashtable.put("Whirlpool", 64);
    }

    /* JADX INFO: renamed from: a */
    public final void m4426a(byte[] bArr) {
        nn1 nn1Var = this.f7003a;
        byte[] bArr2 = this.f7009g;
        int i = this.f7005c;
        nn1Var.mo3526b(i, bArr2);
        e31 e31Var = this.f7007e;
        if (e31Var != null) {
            nn1Var.mo2488d(e31Var);
            nn1Var.mo729e(i, 32, bArr2);
        } else {
            nn1Var.mo729e(0, bArr2.length, bArr2);
        }
        nn1Var.mo3526b(0, bArr);
        while (i < bArr2.length) {
            bArr2[i] = 0;
            i++;
        }
        e31 e31Var2 = this.f7006d;
        if (e31Var2 != null) {
            nn1Var.mo2488d(e31Var2);
        } else {
            byte[] bArr3 = this.f7008f;
            nn1Var.mo729e(0, bArr3.length, bArr3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4427b(C1627yg c1627yg) {
        byte[] bArr = this.f7009g;
        byte[] bArr2 = this.f7008f;
        nn1 nn1Var = this.f7003a;
        nn1Var.m4571o();
        byte[] bArr3 = c1627yg.f12975a;
        int length = bArr3.length;
        int i = this.f7005c;
        if (length > i) {
            nn1Var.mo729e(0, length, bArr3);
            nn1Var.mo3526b(0, bArr2);
            length = this.f7004b;
        } else {
            System.arraycopy(bArr3, 0, bArr2, 0, length);
        }
        while (length < bArr2.length) {
            bArr2[length] = 0;
            length++;
        }
        System.arraycopy(bArr2, 0, bArr, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ 92);
        }
        e31 e31VarMo2487a = nn1Var.mo2487a();
        this.f7007e = e31VarMo2487a;
        ((j20) e31VarMo2487a).mo729e(0, i, bArr);
        nn1Var.mo729e(0, bArr2.length, bArr2);
        this.f7006d = nn1Var.mo2487a();
    }
}
