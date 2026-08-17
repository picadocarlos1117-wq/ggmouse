package android.sun.security.provider;

import android.sun.misc.IOUtils;
import android.sun.security.pkcs.EncryptedPrivateKeyInfo;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.DigestOutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
abstract class JavaKeyStore extends KeyStoreSpi {
    private static final int MAGIC = -17957139;
    private static final int VERSION_1 = 1;
    private static final int VERSION_2 = 2;
    private final Hashtable<String, Object> entries = new Hashtable<>();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class KeyEntry {
        Certificate[] chain;
        Date date;
        byte[] protectedPrivKey;

        private KeyEntry() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class TrustedCertEntry {
        Certificate cert;
        Date date;

        private TrustedCertEntry() {
        }
    }

    private MessageDigest getPreKeyedHash(char[] cArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        int length = cArr.length * 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (char c : cArr) {
            int i2 = i + 1;
            bArr[i] = (byte) (c >> '\b');
            i += 2;
            bArr[i2] = (byte) c;
        }
        messageDigest.update(bArr);
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = 0;
        }
        messageDigest.update("Mighty Aphrodite".getBytes(StandardCharsets.UTF_8));
        return messageDigest;
    }

    public abstract String convertAlias(String str);

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        return this.entries.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.entries.containsKey(convertAlias(str));
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        synchronized (this.entries) {
            this.entries.remove(convertAlias(str));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        Object obj = this.entries.get(convertAlias(str));
        if (obj == null) {
            return null;
        }
        if (obj instanceof TrustedCertEntry) {
            return ((TrustedCertEntry) obj).cert;
        }
        Certificate[] certificateArr = ((KeyEntry) obj).chain;
        if (certificateArr == null) {
            return null;
        }
        return certificateArr[0];
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Certificate certificate2;
        Certificate[] certificateArr;
        Enumeration<String> enumerationKeys = this.entries.keys();
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            Object obj = this.entries.get(strNextElement);
            if (obj instanceof TrustedCertEntry) {
                certificate2 = ((TrustedCertEntry) obj).cert;
            } else if (obj != null && (certificateArr = ((KeyEntry) obj).chain) != null) {
                certificate2 = certificateArr[0];
            }
            if (certificate2.equals(certificate)) {
                return strNextElement;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate[] certificateArr;
        Object obj = this.entries.get(convertAlias(str));
        if (!(obj instanceof KeyEntry) || (certificateArr = ((KeyEntry) obj).chain) == null) {
            return null;
        }
        return (Certificate[]) certificateArr.clone();
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        Object obj = this.entries.get(convertAlias(str));
        if (obj != null) {
            return obj instanceof TrustedCertEntry ? new Date(((TrustedCertEntry) obj).date.getTime()) : new Date(((KeyEntry) obj).date.getTime());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
        Object obj = this.entries.get(convertAlias(str));
        if (!(obj instanceof KeyEntry)) {
            return null;
        }
        if (cArr == null) {
            throw new UnrecoverableKeyException("Password must not be null");
        }
        try {
            return new KeyProtector(cArr).recover(new EncryptedPrivateKeyInfo(((KeyEntry) obj).protectedPrivKey));
        } catch (IOException unused) {
            throw new UnrecoverableKeyException("Private key not stored as PKCS #8 EncryptedPrivateKeyInfo");
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.entries.get(convertAlias(str)) instanceof TrustedCertEntry;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.entries.get(convertAlias(str)) instanceof KeyEntry;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        DataInputStream dataInputStream;
        MessageDigest preKeyedHash;
        Hashtable hashtable;
        CertificateFactory certificateFactory;
        int i;
        boolean z;
        synchronized (this.entries) {
            try {
                if (inputStream == null) {
                    return;
                }
                C00291 c00291 = null;
                if (cArr != null) {
                    preKeyedHash = getPreKeyedHash(cArr);
                    dataInputStream = new DataInputStream(new DigestInputStream(inputStream, preKeyedHash));
                } else {
                    dataInputStream = new DataInputStream(inputStream);
                    preKeyedHash = null;
                }
                int i2 = dataInputStream.readInt();
                int i3 = dataInputStream.readInt();
                if (i2 == MAGIC) {
                    int i4 = 2;
                    boolean z2 = true;
                    if (i3 == 1 || i3 == 2) {
                        if (i3 == 1) {
                            certificateFactory = CertificateFactory.getInstance("X509");
                            hashtable = null;
                        } else {
                            hashtable = new Hashtable(3);
                            certificateFactory = null;
                        }
                        this.entries.clear();
                        int i5 = dataInputStream.readInt();
                        int i6 = 0;
                        while (i6 < i5) {
                            int i7 = dataInputStream.readInt();
                            if (i7 == z2) {
                                KeyEntry keyEntry = new KeyEntry();
                                String utf = dataInputStream.readUTF();
                                keyEntry.date = new Date(dataInputStream.readLong());
                                keyEntry.protectedPrivKey = IOUtils.readFully(dataInputStream, dataInputStream.readInt(), z2);
                                int i8 = dataInputStream.readInt();
                                if (i8 > 0) {
                                    ArrayList arrayList = new ArrayList(Math.min(i8, 10));
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if (i3 == i4) {
                                            String utf2 = dataInputStream.readUTF();
                                            if (hashtable.containsKey(utf2)) {
                                                certificateFactory = (CertificateFactory) hashtable.get(utf2);
                                            } else {
                                                CertificateFactory certificateFactory2 = CertificateFactory.getInstance(utf2);
                                                hashtable.put(utf2, certificateFactory2);
                                                certificateFactory = certificateFactory2;
                                            }
                                        }
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.readFully(dataInputStream, dataInputStream.readInt(), z2));
                                        arrayList.add(certificateFactory.generateCertificate(byteArrayInputStream));
                                        byteArrayInputStream.close();
                                        i9++;
                                        i4 = 2;
                                        z2 = true;
                                    }
                                    keyEntry.chain = (Certificate[]) arrayList.toArray(new Certificate[i8]);
                                }
                                this.entries.put(utf, keyEntry);
                                c00291 = null;
                                i = 2;
                                z = true;
                            } else {
                                if (i7 != i4) {
                                    throw new IOException("Unrecognized keystore entry");
                                }
                                c00291 = null;
                                TrustedCertEntry trustedCertEntry = new TrustedCertEntry();
                                String utf3 = dataInputStream.readUTF();
                                trustedCertEntry.date = new Date(dataInputStream.readLong());
                                i = 2;
                                if (i3 == 2) {
                                    String utf4 = dataInputStream.readUTF();
                                    if (hashtable.containsKey(utf4)) {
                                        certificateFactory = (CertificateFactory) hashtable.get(utf4);
                                    } else {
                                        CertificateFactory certificateFactory3 = CertificateFactory.getInstance(utf4);
                                        hashtable.put(utf4, certificateFactory3);
                                        certificateFactory = certificateFactory3;
                                    }
                                }
                                z = true;
                                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(IOUtils.readFully(dataInputStream, dataInputStream.readInt(), true));
                                trustedCertEntry.cert = certificateFactory.generateCertificate(byteArrayInputStream2);
                                byteArrayInputStream2.close();
                                this.entries.put(utf3, trustedCertEntry);
                            }
                            i6++;
                            i4 = i;
                            z2 = z;
                            preKeyedHash = preKeyedHash;
                        }
                        MessageDigest messageDigest = preKeyedHash;
                        if (cArr != null) {
                            byte[] bArrDigest = messageDigest.digest();
                            byte[] bArr = new byte[bArrDigest.length];
                            dataInputStream.readFully(bArr);
                            for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                                if (bArrDigest[i10] != bArr[i10]) {
                                    throw ((IOException) new IOException("Keystore was tampered with, or password was incorrect").initCause(new UnrecoverableKeyException("Password verification failed")));
                                }
                            }
                        }
                        return;
                    }
                }
                throw new IOException("Invalid keystore format");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        synchronized (this.entries) {
            try {
                if (this.entries.get(convertAlias(str)) instanceof KeyEntry) {
                    throw new KeyStoreException("Cannot overwrite own certificate");
                }
                TrustedCertEntry trustedCertEntry = new TrustedCertEntry();
                trustedCertEntry.cert = certificate;
                trustedCertEntry.date = new Date();
                this.entries.put(convertAlias(str), trustedCertEntry);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("Cannot store non-PrivateKeys");
        }
        try {
            synchronized (this.entries) {
                try {
                    KeyEntry keyEntry = new KeyEntry();
                    keyEntry.date = new Date();
                    keyEntry.protectedPrivKey = new KeyProtector(cArr).protect(key);
                    if (certificateArr == null || certificateArr.length == 0) {
                        keyEntry.chain = null;
                    } else {
                        keyEntry.chain = (Certificate[]) certificateArr.clone();
                    }
                    this.entries.put(convertAlias(str), keyEntry);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new KeyStoreException("Key protection algorithm not found");
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        synchronized (this.entries) {
            try {
                if (cArr == null) {
                    throw new IllegalArgumentException("password can't be null");
                }
                MessageDigest preKeyedHash = getPreKeyedHash(cArr);
                DataOutputStream dataOutputStream = new DataOutputStream(new DigestOutputStream(outputStream, preKeyedHash));
                dataOutputStream.writeInt(MAGIC);
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.entries.size());
                Enumeration<String> enumerationKeys = this.entries.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String strNextElement = enumerationKeys.nextElement();
                    Object obj = this.entries.get(strNextElement);
                    if (obj instanceof KeyEntry) {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF(strNextElement);
                        dataOutputStream.writeLong(((KeyEntry) obj).date.getTime());
                        dataOutputStream.writeInt(((KeyEntry) obj).protectedPrivKey.length);
                        dataOutputStream.write(((KeyEntry) obj).protectedPrivKey);
                        int length = ((KeyEntry) obj).chain == null ? 0 : ((KeyEntry) obj).chain.length;
                        dataOutputStream.writeInt(length);
                        for (int i = 0; i < length; i++) {
                            byte[] encoded = ((KeyEntry) obj).chain[i].getEncoded();
                            dataOutputStream.writeUTF(((KeyEntry) obj).chain[i].getType());
                            dataOutputStream.writeInt(encoded.length);
                            dataOutputStream.write(encoded);
                        }
                    } else {
                        dataOutputStream.writeInt(2);
                        dataOutputStream.writeUTF(strNextElement);
                        dataOutputStream.writeLong(((TrustedCertEntry) obj).date.getTime());
                        byte[] encoded2 = ((TrustedCertEntry) obj).cert.getEncoded();
                        dataOutputStream.writeUTF(((TrustedCertEntry) obj).cert.getType());
                        dataOutputStream.writeInt(encoded2.length);
                        dataOutputStream.write(encoded2);
                    }
                }
                dataOutputStream.write(preKeyedHash.digest());
                dataOutputStream.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class CaseExactJKS extends JavaKeyStore {
        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore
        public String convertAlias(String str) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class JKS extends JavaKeyStore {
        @Override // android.sun.security.provider.JavaKeyStore
        public String convertAlias(String str) {
            return str.toLowerCase();
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // android.sun.security.provider.JavaKeyStore, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        synchronized (this.entries) {
            try {
                try {
                    new EncryptedPrivateKeyInfo(bArr);
                    KeyEntry keyEntry = new KeyEntry();
                    keyEntry.date = new Date();
                    keyEntry.protectedPrivKey = (byte[]) bArr.clone();
                    if (certificateArr != null && certificateArr.length != 0) {
                        keyEntry.chain = (Certificate[]) certificateArr.clone();
                    } else {
                        keyEntry.chain = null;
                    }
                    this.entries.put(convertAlias(str), keyEntry);
                } catch (IOException unused) {
                    throw new KeyStoreException("key is not encoded as EncryptedPrivateKeyInfo");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
