package android.sun.security.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class MemoryCache extends Cache {
    private static final boolean DEBUG = false;
    private static final float LOAD_FACTOR = 0.75f;
    private final Map<Object, CacheEntry> cacheMap;
    private long lifetime;
    private int maxSize;
    private final ReferenceQueue queue;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public interface CacheEntry {
        Object getKey();

        Object getValue();

        void invalidate();

        boolean isValid(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class HardCacheEntry implements CacheEntry {
        private long expirationTime;
        private Object key;
        private Object value;

        public HardCacheEntry(Object obj, Object obj2, long j) {
            this.key = obj;
            this.value = obj2;
            this.expirationTime = j;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public Object getKey() {
            return this.key;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public Object getValue() {
            return this.value;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public void invalidate() {
            this.key = null;
            this.value = null;
            this.expirationTime = -1L;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public boolean isValid(long j) {
            boolean z = j <= this.expirationTime;
            if (!z) {
                invalidate();
            }
            return z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class SoftCacheEntry extends SoftReference implements CacheEntry {
        private long expirationTime;
        private Object key;

        public SoftCacheEntry(Object obj, Object obj2, long j, ReferenceQueue referenceQueue) {
            super(obj2, referenceQueue);
            this.key = obj;
            this.expirationTime = j;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public Object getKey() {
            return this.key;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public Object getValue() {
            return get();
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public void invalidate() {
            clear();
            this.key = null;
            this.expirationTime = -1L;
        }

        @Override // android.sun.security.util.MemoryCache.CacheEntry
        public boolean isValid(long j) {
            boolean z = j <= this.expirationTime && get() != 0;
            if (!z) {
                invalidate();
            }
            return z;
        }
    }

    public MemoryCache(boolean z, int i, int i2) {
        this.maxSize = i;
        this.lifetime = i2 * 1000;
        this.queue = z ? new ReferenceQueue() : null;
        this.cacheMap = new LinkedHashMap(((int) (i / LOAD_FACTOR)) + 1, LOAD_FACTOR, true);
    }

    private void emptyQueue() {
        CacheEntry cacheEntryRemove;
        if (this.queue == null) {
            return;
        }
        this.cacheMap.size();
        while (true) {
            CacheEntry cacheEntry = (CacheEntry) this.queue.poll();
            if (cacheEntry == null) {
                return;
            }
            Object key = cacheEntry.getKey();
            if (key != null && (cacheEntryRemove = this.cacheMap.remove(key)) != null && cacheEntry != cacheEntryRemove) {
                this.cacheMap.put(key, cacheEntryRemove);
            }
        }
    }

    private void expungeExpiredEntries() {
        emptyQueue();
        if (this.lifetime == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<CacheEntry> it = this.cacheMap.values().iterator();
        while (it.hasNext()) {
            if (!it.next().isValid(jCurrentTimeMillis)) {
                it.remove();
            }
        }
    }

    private Map<Object, Object> getCachedEntries() {
        HashMap map = new HashMap(this.cacheMap.size());
        for (CacheEntry cacheEntry : this.cacheMap.values()) {
            map.put(cacheEntry.getKey(), cacheEntry.getValue());
        }
        return map;
    }

    @Override // android.sun.security.util.Cache
    public synchronized void accept(Cache.CacheVisitor cacheVisitor) {
        expungeExpiredEntries();
        cacheVisitor.visit(getCachedEntries());
    }

    @Override // android.sun.security.util.Cache
    public synchronized void clear() {
        try {
            if (this.queue != null) {
                Iterator<CacheEntry> it = this.cacheMap.values().iterator();
                while (it.hasNext()) {
                    it.next().invalidate();
                }
                while (this.queue.poll() != null) {
                }
            }
            this.cacheMap.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.sun.security.util.Cache
    public synchronized Object get(Object obj) {
        emptyQueue();
        CacheEntry cacheEntry = this.cacheMap.get(obj);
        if (cacheEntry == null) {
            return null;
        }
        long jCurrentTimeMillis = 0;
        if (this.lifetime != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (cacheEntry.isValid(jCurrentTimeMillis)) {
            return cacheEntry.getValue();
        }
        this.cacheMap.remove(obj);
        return null;
    }

    public CacheEntry newEntry(Object obj, Object obj2, long j, ReferenceQueue referenceQueue) {
        return referenceQueue != null ? new SoftCacheEntry(obj, obj2, j, referenceQueue) : new HardCacheEntry(obj, obj2, j);
    }

    @Override // android.sun.security.util.Cache
    public synchronized void put(Object obj, Object obj2) throws Throwable {
        try {
            try {
                emptyQueue();
                long jCurrentTimeMillis = 0;
                if (this.lifetime != 0) {
                    jCurrentTimeMillis = this.lifetime + System.currentTimeMillis();
                }
                CacheEntry cacheEntryPut = this.cacheMap.put(obj, newEntry(obj, obj2, jCurrentTimeMillis, this.queue));
                if (cacheEntryPut != null) {
                    cacheEntryPut.invalidate();
                    return;
                }
                if (this.maxSize > 0 && this.cacheMap.size() > this.maxSize) {
                    expungeExpiredEntries();
                    if (this.cacheMap.size() > this.maxSize) {
                        Iterator<CacheEntry> it = this.cacheMap.values().iterator();
                        CacheEntry next = it.next();
                        it.remove();
                        next.invalidate();
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.sun.security.util.Cache
    public synchronized void remove(Object obj) {
        emptyQueue();
        CacheEntry cacheEntryRemove = this.cacheMap.remove(obj);
        if (cacheEntryRemove != null) {
            cacheEntryRemove.invalidate();
        }
    }

    @Override // android.sun.security.util.Cache
    public synchronized void setCapacity(int i) {
        try {
            expungeExpiredEntries();
            if (i > 0 && this.cacheMap.size() > i) {
                Iterator<CacheEntry> it = this.cacheMap.values().iterator();
                for (int size = this.cacheMap.size() - i; size > 0; size--) {
                    CacheEntry next = it.next();
                    it.remove();
                    next.invalidate();
                }
            }
            if (i <= 0) {
                i = 0;
            }
            this.maxSize = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.sun.security.util.Cache
    public synchronized void setTimeout(int i) {
        emptyQueue();
        this.lifetime = i > 0 ? ((long) i) * 1000 : 0L;
    }

    @Override // android.sun.security.util.Cache
    public synchronized int size() {
        expungeExpiredEntries();
        return this.cacheMap.size();
    }

    public MemoryCache(boolean z, int i) {
        this(z, i, 0);
    }
}
