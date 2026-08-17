package org.conscrypt;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import p000.ca0;
import p000.f40;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    final long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final Map<ByteArray, NativeSslSession> sessions = new LinkedHashMap<ByteArray, NativeSslSession>() { // from class: org.conscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession(entry.getValue());
            return true;
        }
    };

    public AbstractSessionContext(int i) {
        this.maximumSize = i;
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            try {
                int size = this.sessions.size();
                if (size > this.maximumSize) {
                    int i = size - this.maximumSize;
                    Iterator<NativeSslSession> it = this.sessions.values().iterator();
                    while (true) {
                        int i2 = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        onBeforeRemoveSession(it.next());
                        it.remove();
                        i = i2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            try {
                ByteArray byteArray = new ByteArray(id);
                if (this.sessions.containsKey(byteArray)) {
                    removeSession(this.sessions.get(byteArray));
                }
                onBeforeAddSession(nativeSslSession);
                this.sessions.put(byteArray, nativeSslSession);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            NativeCrypto.SSL_CTX_free(this.sslCtxNativePointer, this);
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList(this.sessions.values().toArray(new NativeSslSession[this.sessions.size()])).iterator();
        }
        return new Enumeration<byte[]>() { // from class: org.conscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    ca0.m1185q();
                    return null;
                }
                byte[] id = this.next.getId();
                this.next = null;
                return id;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            l41.m4051t("sessionId");
            return null;
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    public final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    public abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    public abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    public abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    public final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i) {
        if (i < 0) {
            f40.m2713i("size < 0");
            return;
        }
        int i2 = this.maximumSize;
        this.maximumSize = i;
        if (i < i2) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i) {
        if (i < 0) {
            f40.m2713i("seconds < 0");
            return;
        }
        synchronized (this.sessions) {
            try {
                this.timeout = i;
                long j = this.sslCtxNativePointer;
                if (i > 0) {
                    NativeCrypto.SSL_CTX_set_timeout(j, this, i);
                } else {
                    NativeCrypto.SSL_CTX_set_timeout(j, this, 2147483647L);
                }
                Iterator<NativeSslSession> it = this.sessions.values().iterator();
                while (it.hasNext()) {
                    NativeSslSession next = it.next();
                    if (!next.isValid()) {
                        onBeforeRemoveSession(next);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
