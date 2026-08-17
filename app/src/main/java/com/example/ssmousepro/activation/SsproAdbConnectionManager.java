package com.example.ssmousepro.activation;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import io.github.muntashirakon.adb.AbsAdbConnectionManager;
import io.github.muntashirakon.adb.AdbInputStream;
import io.github.muntashirakon.adb.AdbStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.conscrypt.Conscrypt;
import p000.AbstractC1571wy;
import p000.hw1;
import p000.rc2;
import p000.tl1;
import p000.ul1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class SsproAdbConnectionManager extends AbsAdbConnectionManager {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SsproAdb";
    private static volatile SsproAdbConnectionManager instance;
    private final AdbKeyStoreHelper keys;

    private SsproAdbConnectionManager(Context context) {
        AdbKeyStoreHelper adbKeyStoreHelperLoadOrCreate = AdbKeyStoreHelper.loadOrCreate(context.getApplicationContext());
        adbKeyStoreHelperLoadOrCreate.getClass();
        this.keys = adbKeyStoreHelperLoadOrCreate;
        Companion.ensureConscrypt();
        setApi(Build.VERSION.SDK_INT);
        setTimeout(8L, TimeUnit.SECONDS);
        setThrowOnUnauthorised(true);
    }

    public final void fecharConexao() {
        Object tl1Var;
        try {
            disconnect();
            tl1Var = z32.f13265a;
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Throwable thM6508b = ul1.m6508b(tl1Var);
        if (thM6508b != null) {
            Log.w(TAG, "disconnect", thM6508b);
        }
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public Certificate getCertificate() {
        Certificate certificate = this.keys.certificate;
        certificate.getClass();
        return certificate;
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public String getDeviceName() {
        return "SSKeyMousePro";
    }

    @Override // io.github.muntashirakon.adb.AbsAdbConnectionManager
    public PrivateKey getPrivateKey() {
        PrivateKey privateKey = this.keys.privateKey;
        privateKey.getClass();
        return privateKey;
    }

    public final String shell(String str) {
        str.getClass();
        if (!hw1.m3309D0(str, "shell:", false)) {
            str = "shell:".concat(str);
        }
        AdbStream adbStreamOpenStream = openStream(str);
        adbStreamOpenStream.getClass();
        try {
            AdbInputStream adbInputStreamOpenInputStream = adbStreamOpenStream.openInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    try {
                        int i = adbInputStreamOpenInputStream.read(bArr);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    } catch (IOException e) {
                        if (!Companion.ehFimDeStreamAdb(e)) {
                            throw e;
                        }
                    }
                }
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                string.getClass();
                rc2.m5797n(adbInputStreamOpenInputStream, null);
                adbStreamOpenStream.close();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rc2.m5797n(adbInputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                adbStreamOpenStream.close();
            } catch (Throwable unused) {
            }
            throw th3;
        }
    }

    public final void shellBloqueante(String str) {
        str.getClass();
        if (!hw1.m3309D0(str, "shell:", false)) {
            str = "shell:".concat(str);
        }
        AdbStream adbStreamOpenStream = openStream(str);
        adbStreamOpenStream.getClass();
        try {
            AdbInputStream adbInputStreamOpenInputStream = adbStreamOpenStream.openInputStream();
            try {
                do {
                    try {
                    } catch (IOException e) {
                        if (!Companion.ehFimDeStreamAdb(e)) {
                            throw e;
                        }
                    }
                } while (adbInputStreamOpenInputStream.read(new byte[1024]) >= 0);
                rc2.m5797n(adbInputStreamOpenInputStream, null);
                try {
                    adbStreamOpenStream.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rc2.m5797n(adbInputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                adbStreamOpenStream.close();
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final boolean ehFimDeStreamAdb(Exception exc) {
            String lowerCase;
            exc.getClass();
            String message = exc.getMessage();
            if (message != null) {
                lowerCase = message.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            return zv1.m7365E0(lowerCase, "stream closed", false) || zv1.m7365E0(lowerCase, "stream is closed", false);
        }

        public final void ensureConscrypt() {
            if (Security.getProvider("Conscrypt") != null) {
                return;
            }
            try {
                Security.insertProviderAt(Conscrypt.newProvider(), 1);
            } catch (Exception e) {
                Log.e(SsproAdbConnectionManager.TAG, "Falha ao instalar Conscrypt", e);
            }
        }

        public final void fecharSeExistir() {
            SsproAdbConnectionManager ssproAdbConnectionManager = SsproAdbConnectionManager.instance;
            if (ssproAdbConnectionManager != null) {
                ssproAdbConnectionManager.fecharConexao();
            }
        }

        public final synchronized SsproAdbConnectionManager get(Context context) {
            context.getClass();
            SsproAdbConnectionManager ssproAdbConnectionManager = SsproAdbConnectionManager.instance;
            if (ssproAdbConnectionManager != null) {
                return ssproAdbConnectionManager;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            SsproAdbConnectionManager ssproAdbConnectionManager2 = new SsproAdbConnectionManager(applicationContext, null);
            SsproAdbConnectionManager.instance = ssproAdbConnectionManager2;
            return ssproAdbConnectionManager2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SsproAdbConnectionManager(Context context, AbstractC1571wy abstractC1571wy) {
        this(context);
    }
}
