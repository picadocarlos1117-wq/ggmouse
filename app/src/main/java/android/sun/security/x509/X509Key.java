package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.BitArray;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import p000.ca0;
import p000.jd0;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509Key implements PublicKey {
    private static final long serialVersionUID = -5359250853002055002L;
    protected AlgorithmId algid;
    protected byte[] encodedKey;

    @Deprecated
    protected byte[] key = null;
    private int unusedBits = 0;
    private BitArray bitStringKey = null;

    private X509Key(AlgorithmId algorithmId, BitArray bitArray) {
        this.algid = algorithmId;
        setKey(bitArray);
        encode();
    }

    public static PublicKey buildX509Key(AlgorithmId algorithmId, BitArray bitArray) throws IOException, InvalidKeyException {
        Class<?> clsLoadClass;
        DerOutputStream derOutputStream = new DerOutputStream();
        encode(derOutputStream, algorithmId, bitArray);
        try {
            return KeyFactory.getInstance(algorithmId.getName()).generatePublic(new X509EncodedKeySpec(derOutputStream.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            try {
                try {
                    Provider provider = Security.getProvider("SUN");
                    if (provider == null) {
                        throw new InstantiationException();
                    }
                    String property = provider.getProperty("PublicKey.X.509." + algorithmId.getName());
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
                    if (objNewInstance instanceof X509Key) {
                        X509Key x509Key = (X509Key) objNewInstance;
                        x509Key.algid = algorithmId;
                        x509Key.setKey(bitArray);
                        x509Key.parseKeyBits();
                        return x509Key;
                    }
                    return new X509Key(algorithmId, bitArray);
                } catch (ClassNotFoundException | InstantiationException unused3) {
                }
            } catch (IllegalAccessException unused4) {
                ca0.m1178j(jd0.m3614l("", " [internal error]"));
                return null;
            }
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException(e.getMessage(), e);
        }
    }

    public static void encode(DerOutputStream derOutputStream, AlgorithmId algorithmId, BitArray bitArray) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        algorithmId.encode(derOutputStream2);
        derOutputStream2.putUnalignedBitString(bitArray);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public static PublicKey parse(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ca0.m1178j("corrupt subject key");
            return null;
        }
        try {
            PublicKey publicKeyBuildX509Key = buildX509Key(AlgorithmId.parse(derValue.data.getDerValue()), derValue.data.getUnalignedBitString());
            if (derValue.data.available() == 0) {
                return publicKeyBuildX509Key;
            }
            ca0.m1178j("excess subject key");
            return null;
        } catch (InvalidKeyException e) {
            throw new IOException("subject key, " + e.getMessage(), e);
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

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.write(getEncoded());
    }

    public void decode(InputStream inputStream) throws InvalidKeyException {
        try {
            DerValue derValue = new DerValue(inputStream);
            if (derValue.tag != 48) {
                throw new InvalidKeyException("invalid key format");
            }
            this.algid = AlgorithmId.parse(derValue.data.getDerValue());
            setKey(derValue.data.getUnalignedBitString());
            parseKeyBits();
            if (derValue.data.available() != 0) {
                throw new InvalidKeyException("excess key data");
            }
        } catch (IOException e) {
            throw new InvalidKeyException(jd0.m3611i(e, new StringBuilder("IOException: ")));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Key)) {
            return false;
        }
        try {
            return Arrays.equals(getEncodedInternal(), obj instanceof X509Key ? ((X509Key) obj).getEncodedInternal() : ((Key) obj).getEncoded());
        } catch (InvalidKeyException unused) {
            return false;
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algid.getName();
    }

    public AlgorithmId getAlgorithmId() {
        return this.algid;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (byte[]) getEncodedInternal().clone();
        } catch (InvalidKeyException unused) {
            return null;
        }
    }

    public byte[] getEncodedInternal() throws InvalidKeyException {
        byte[] bArr = this.encodedKey;
        if (bArr != null) {
            return bArr;
        }
        try {
            DerOutputStream derOutputStream = new DerOutputStream();
            encode(derOutputStream);
            byte[] byteArray = derOutputStream.toByteArray();
            this.encodedKey = byteArray;
            return byteArray;
        } catch (IOException e) {
            throw new InvalidKeyException(jd0.m3611i(e, new StringBuilder("IOException : ")));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public BitArray getKey() {
        byte[] bArr = this.key;
        BitArray bitArray = new BitArray((bArr.length * 8) - this.unusedBits, bArr);
        this.bitStringKey = bitArray;
        return (BitArray) bitArray.clone();
    }

    public int hashCode() {
        try {
            byte[] encodedInternal = getEncodedInternal();
            int length = encodedInternal.length;
            for (byte b : encodedInternal) {
                length += (b & 255) * 37;
            }
            return length;
        } catch (InvalidKeyException unused) {
            return 0;
        }
    }

    public void parseKeyBits() {
        encode();
    }

    public void setKey(BitArray bitArray) {
        this.bitStringKey = (BitArray) bitArray.clone();
        this.key = bitArray.toByteArray();
        int length = bitArray.length() % 8;
        this.unusedBits = length == 0 ? 0 : 8 - length;
    }

    public String toString() {
        return "algorithm = " + this.algid.toString() + ", unparsed keybits = \n" + new HexDumpEncoder().encodeBuffer(this.key);
    }

    public byte[] encode() {
        return (byte[]) getEncodedInternal().clone();
    }

    public final void encode(DerOutputStream derOutputStream) throws IOException {
        encode(derOutputStream, this.algid, getKey());
    }

    public X509Key() {
    }

    public void decode(byte[] bArr) throws InvalidKeyException {
        decode(new ByteArrayInputStream(bArr));
    }
}
