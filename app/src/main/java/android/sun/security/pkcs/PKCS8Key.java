package android.sun.security.pkcs;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.Debug;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyRep;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import p000.ca0;
import p000.jd0;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PKCS8Key implements PrivateKey {
    private static final long serialVersionUID = -3836890099307167124L;
    public static final BigInteger version = BigInteger.ZERO;
    protected AlgorithmId algid;
    protected byte[] encodedKey;
    protected byte[] key;

    private PKCS8Key(AlgorithmId algorithmId, byte[] bArr) throws InvalidKeyException {
        this.algid = algorithmId;
        this.key = bArr;
        encode();
    }

    public static PrivateKey buildPKCS8Key(AlgorithmId algorithmId, byte[] bArr) throws IOException {
        Class<?> clsLoadClass;
        DerOutputStream derOutputStream = new DerOutputStream();
        encode(derOutputStream, algorithmId, bArr);
        try {
            return KeyFactory.getInstance(algorithmId.getName()).generatePrivate(new PKCS8EncodedKeySpec(derOutputStream.toByteArray()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            try {
                try {
                    Provider provider = Security.getProvider("SUN");
                    if (provider == null) {
                        throw new InstantiationException();
                    }
                    String property = provider.getProperty("PrivateKey.PKCS#8." + algorithmId.getName());
                    if (property == null) {
                        throw new InstantiationException();
                    }
                    try {
                        clsLoadClass = Class.forName(property);
                    } catch (ClassNotFoundException unused2) {
                        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                        clsLoadClass = systemClassLoader != null ? systemClassLoader.loadClass(property) : null;
                    }
                    Object objNewInstance = clsLoadClass != null ? clsLoadClass.newInstance() : null;
                    if (objNewInstance instanceof PKCS8Key) {
                        PKCS8Key pKCS8Key = (PKCS8Key) objNewInstance;
                        pKCS8Key.algid = algorithmId;
                        pKCS8Key.key = bArr;
                        pKCS8Key.parseKeyBits();
                        return pKCS8Key;
                    }
                    PKCS8Key pKCS8Key2 = new PKCS8Key();
                    pKCS8Key2.algid = algorithmId;
                    pKCS8Key2.key = bArr;
                    return pKCS8Key2;
                } catch (ClassNotFoundException | InstantiationException unused3) {
                }
            } catch (IllegalAccessException unused4) {
                ca0.m1178j(jd0.m3614l("", " [internal error]"));
                return null;
            }
        }
    }

    public static PKCS8Key parse(DerValue derValue) throws IOException {
        PrivateKey key = parseKey(derValue);
        if (key instanceof PKCS8Key) {
            return (PKCS8Key) key;
        }
        ca0.m1178j("Provider did not return PKCS8Key");
        return null;
    }

    public static PrivateKey parseKey(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ca0.m1178j("corrupt private key");
            return null;
        }
        BigInteger bigInteger = derValue.data.getBigInteger();
        BigInteger bigInteger2 = version;
        if (!bigInteger2.equals(bigInteger)) {
            throw new IOException("version mismatch: (supported: " + Debug.toHexString(bigInteger2) + ", parsed: " + Debug.toHexString(bigInteger));
        }
        try {
            PrivateKey privateKeyBuildPKCS8Key = buildPKCS8Key(AlgorithmId.parse(derValue.data.getDerValue()), derValue.data.getOctetString());
            if (derValue.data.available() == 0) {
                return privateKeyBuildPKCS8Key;
            }
            ca0.m1178j("excess private key");
            return null;
        } catch (InvalidKeyException unused) {
            ca0.m1178j("corrupt private key");
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        try {
            decode(objectInputStream);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            lv1.m4305q(e.getMessage(), "deserialized key is invalid: ");
        }
    }

    public void decode(InputStream inputStream) throws InvalidKeyException {
        try {
            DerValue derValue = new DerValue(inputStream);
            if (derValue.tag != 48) {
                throw new InvalidKeyException("invalid key format");
            }
            BigInteger bigInteger = derValue.data.getBigInteger();
            BigInteger bigInteger2 = version;
            if (bigInteger.equals(bigInteger2)) {
                this.algid = AlgorithmId.parse(derValue.data.getDerValue());
                this.key = derValue.data.getOctetString();
                parseKeyBits();
                derValue.data.available();
                return;
            }
            throw new IOException("version mismatch: (supported: " + Debug.toHexString(bigInteger2) + ", parsed: " + Debug.toHexString(bigInteger));
        } catch (IOException e) {
            throw new InvalidKeyException(jd0.m3611i(e, new StringBuilder("IOException : ")));
        }
    }

    public byte[] encode() throws InvalidKeyException {
        if (this.encodedKey == null) {
            try {
                DerOutputStream derOutputStream = new DerOutputStream();
                encode(derOutputStream);
                this.encodedKey = derOutputStream.toByteArray();
            } catch (IOException e) {
                throw new InvalidKeyException(jd0.m3611i(e, new StringBuilder("IOException : ")));
            }
        }
        return (byte[]) this.encodedKey.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Key)) {
            return false;
        }
        byte[] encoded = this.encodedKey;
        if (encoded == null) {
            encoded = getEncoded();
        }
        byte[] encoded2 = ((Key) obj).getEncoded();
        if (encoded.length != encoded2.length) {
            return false;
        }
        for (int i = 0; i < encoded.length; i++) {
            if (encoded[i] != encoded2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algid.getName();
    }

    public AlgorithmId getAlgorithmId() {
        return this.algid;
    }

    @Override // java.security.Key
    public synchronized byte[] getEncoded() {
        byte[] bArrEncode;
        try {
            bArrEncode = encode();
        } catch (InvalidKeyException unused) {
            bArrEncode = null;
        }
        return bArrEncode;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        byte[] encoded = getEncoded();
        int i = 0;
        for (int i2 = 1; i2 < encoded.length; i2++) {
            i += encoded[i2] * i2;
        }
        return i;
    }

    public void parseKeyBits() throws InvalidKeyException {
        encode();
    }

    public String toString() {
        return "algorithm = " + this.algid.toString() + ", unparsed keybits = \n" + new HexDumpEncoder().encodeBuffer(this.key);
    }

    public Object writeReplace() {
        return new KeyRep(KeyRep.Type.PRIVATE, getAlgorithm(), getFormat(), getEncoded());
    }

    public PKCS8Key() {
    }

    public final void encode(DerOutputStream derOutputStream) throws IOException {
        encode(derOutputStream, this.algid, this.key);
    }

    public static void encode(DerOutputStream derOutputStream, AlgorithmId algorithmId, byte[] bArr) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.putInteger(version);
        algorithmId.encode(derOutputStream2);
        derOutputStream2.putOctetString(bArr);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public void decode(byte[] bArr) throws InvalidKeyException {
        decode(new ByteArrayInputStream(bArr));
    }
}
