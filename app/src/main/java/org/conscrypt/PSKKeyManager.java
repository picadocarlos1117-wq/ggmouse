package org.conscrypt;

import java.net.Socket;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface PSKKeyManager extends KeyManager {
    public static final int MAX_IDENTITY_HINT_LENGTH_BYTES = 128;
    public static final int MAX_IDENTITY_LENGTH_BYTES = 128;
    public static final int MAX_KEY_LENGTH_BYTES = 256;

    String chooseClientKeyIdentity(String str, Socket socket);

    String chooseClientKeyIdentity(String str, SSLEngine sSLEngine);

    String chooseServerKeyIdentityHint(Socket socket);

    String chooseServerKeyIdentityHint(SSLEngine sSLEngine);

    SecretKey getKey(String str, String str2, Socket socket);

    SecretKey getKey(String str, String str2, SSLEngine sSLEngine);
}
