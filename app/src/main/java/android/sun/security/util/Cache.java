package android.sun.security.util;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cache {

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public interface CacheVisitor {
        void visit(Map<Object, Object> map);
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class EqualByteArray {

        /* JADX INFO: renamed from: b */
        private final byte[] f281b;
        private volatile int hash;

        public EqualByteArray(byte[] bArr) {
            this.f281b = bArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EqualByteArray) {
                return Arrays.equals(this.f281b, ((EqualByteArray) obj).f281b);
            }
            return false;
        }

        public int hashCode() {
            int length = this.hash;
            if (length == 0) {
                length = this.f281b.length + 1;
                int i = 0;
                while (true) {
                    byte[] bArr = this.f281b;
                    if (i >= bArr.length) {
                        break;
                    }
                    length += (bArr[i] & 255) * 37;
                    i++;
                }
                this.hash = length;
            }
            return length;
        }
    }

    public static Cache newHardMemoryCache(int i) {
        return new MemoryCache(false, i);
    }

    public static Cache newNullCache() {
        return NullCache.INSTANCE;
    }

    public static Cache newSoftMemoryCache(int i) {
        return new MemoryCache(true, i);
    }

    public abstract void accept(CacheVisitor cacheVisitor);

    public abstract void clear();

    public abstract Object get(Object obj);

    public abstract void put(Object obj, Object obj2);

    public abstract void remove(Object obj);

    public abstract void setCapacity(int i);

    public abstract void setTimeout(int i);

    public abstract int size();

    public static Cache newHardMemoryCache(int i, int i2) {
        return new MemoryCache(false, i, i2);
    }

    public static Cache newSoftMemoryCache(int i, int i2) {
        return new MemoryCache(true, i, i2);
    }
}
