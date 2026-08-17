package android.sun.security.util;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class NullCache extends Cache {
    static final Cache INSTANCE = new NullCache();

    private NullCache() {
    }

    @Override // android.sun.security.util.Cache
    public Object get(Object obj) {
        return null;
    }

    @Override // android.sun.security.util.Cache
    public int size() {
        return 0;
    }

    @Override // android.sun.security.util.Cache
    public void clear() {
    }

    @Override // android.sun.security.util.Cache
    public void accept(Cache.CacheVisitor cacheVisitor) {
    }

    @Override // android.sun.security.util.Cache
    public void remove(Object obj) {
    }

    @Override // android.sun.security.util.Cache
    public void setCapacity(int i) {
    }

    @Override // android.sun.security.util.Cache
    public void setTimeout(int i) {
    }

    @Override // android.sun.security.util.Cache
    public void put(Object obj, Object obj2) {
    }
}
