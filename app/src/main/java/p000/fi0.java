package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fi0 extends AbstractC0812k1 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, fi0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected a42 unknownFields;

    public fi0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = a42.f44f;
    }

    public static di0 access$000(s80 s80Var) {
        s80Var.getClass();
        return (di0) s80Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m2812c(fi0 fi0Var) throws rp0 {
        if (fi0Var != null && !fi0Var.isInitialized()) {
            throw new rp0(fi0Var.newUninitializedMessageException().getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public static fi0 m2813d(fi0 fi0Var, InputStream inputStream, u80 u80Var) throws rp0 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC0762ip abstractC0762ipM3469g = AbstractC0762ip.m3469g(new C0735i1(inputStream, AbstractC0762ip.m3470s(i, inputStream)));
            fi0 partialFrom = parsePartialFrom(fi0Var, abstractC0762ipM3469g, u80Var);
            abstractC0762ipM3469g.mo2615a(0);
            return partialFrom;
        } catch (rp0 e) {
            if (e.f10092a) {
                throw new rp0(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new rp0(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static fi0 m2814e(fi0 fi0Var, byte[] bArr, int i, int i2, u80 u80Var) throws rp0 {
        fi0 fi0VarNewMutableInstance = fi0Var.newMutableInstance();
        try {
            nh1 nh1Var = nh1.f7407c;
            nh1Var.getClass();
            qp1 qp1VarM4549a = nh1Var.m4549a(fi0VarNewMutableInstance.getClass());
            qp1VarM4549a.mo908i(fi0VarNewMutableInstance, bArr, i, i + i2, new C1583x9(u80Var));
            qp1VarM4549a.mo901b(fi0VarNewMutableInstance);
            return fi0VarNewMutableInstance;
        } catch (rp0 e) {
            if (e.f10092a) {
                throw new rp0(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof rp0) {
                throw ((rp0) e2.getCause());
            }
            throw new rp0(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            throw rp0.m5887h();
        } catch (y32 e3) {
            throw new rp0(e3.getMessage());
        }
    }

    public static fo0 emptyBooleanList() {
        return C0829ki.f5826d;
    }

    public static go0 emptyDoubleList() {
        return q30.f9319d;
    }

    public static jo0 emptyFloatList() {
        return fb0.f3742d;
    }

    public static ko0 emptyIntList() {
        return yn0.f13031d;
    }

    public static lo0 emptyLongList() {
        return yv0.f13153d;
    }

    public static <E> mo0 emptyProtobufList() {
        return oh1.f7791d;
    }

    public static <T extends fi0> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((fi0) k42.m3777b(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        l41.m4046o();
        return null;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            l41.m4043l("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            l41.m4043l("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final <T extends fi0> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(ei0.f3345a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        boolean zMo902c = nh1Var.m4549a(t.getClass()).mo902c(t);
        if (z) {
            t.dynamicMethod(ei0.f3346b, zMo902c ? t : null);
        }
        return zMo902c;
    }

    public static ko0 mutableCopy(ko0 ko0Var) {
        int size = ko0Var.size();
        int i = size == 0 ? 10 : size * 2;
        yn0 yn0Var = (yn0) ko0Var;
        if (i >= yn0Var.f13033c) {
            return new yn0(Arrays.copyOf(yn0Var.f13032b, i), yn0Var.f13033c, true);
        }
        l41.m4049r();
        return null;
    }

    public static Object newMessageInfo(y41 y41Var, String str, Object[] objArr) {
        return new si1(y41Var, str, objArr);
    }

    public static <ContainingType extends y41, Type> di0 newRepeatedGeneratedExtension(ContainingType containingtype, y41 y41Var, io0 io0Var, int i, hb2 hb2Var, boolean z, Class cls) {
        return new di0(containingtype, Collections.EMPTY_LIST, y41Var, new ci0(io0Var, i, hb2Var, true, z));
    }

    public static <ContainingType extends y41, Type> di0 newSingularGeneratedExtension(ContainingType containingtype, Type type, y41 y41Var, io0 io0Var, int i, hb2 hb2Var, Class cls) {
        return new di0(containingtype, type, y41Var, new ci0(io0Var, i, hb2Var, false, false));
    }

    public static <T extends fi0> T parseDelimitedFrom(T t, InputStream inputStream) throws rp0 {
        T t2 = (T) m2813d(t, inputStream, u80.m6404a());
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, ByteBuffer byteBuffer, u80 u80Var) throws rp0 {
        AbstractC0762ip abstractC0762ipM3468f;
        if (byteBuffer.hasArray()) {
            abstractC0762ipM3468f = AbstractC0762ip.m3468f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && k42.f5665d) {
            abstractC0762ipM3468f = new C0722hp(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC0762ipM3468f = AbstractC0762ip.m3468f(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, abstractC0762ipM3468f, u80Var);
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parsePartialFrom(T t, AbstractC0762ip abstractC0762ip, u80 u80Var) throws rp0 {
        T t2 = (T) t.newMutableInstance();
        try {
            nh1 nh1Var = nh1.f7407c;
            nh1Var.getClass();
            qp1 qp1VarM4549a = nh1Var.m4549a(t2.getClass());
            C0799jp c0799jp = abstractC0762ip.f5124c;
            if (c0799jp == null) {
                c0799jp = new C0799jp(abstractC0762ip);
            }
            qp1VarM4549a.mo905f(t2, c0799jp, u80Var);
            qp1VarM4549a.mo901b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof rp0) {
                throw ((rp0) e.getCause());
            }
            throw new rp0(e.getMessage(), e);
        } catch (y32 e2) {
            throw new rp0(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof rp0) {
                throw ((rp0) e3.getCause());
            }
            throw e3;
        } catch (rp0 e4) {
            if (e4.f10092a) {
                throw new rp0(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    public static <T extends fi0> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(ei0.f3347c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        return nh1Var.m4549a(getClass()).mo906g(this);
    }

    public final <MessageType extends fi0, BuilderType extends ai0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(ei0.f3349e);
    }

    public Object dynamicMethod(ei0 ei0Var, Object obj) {
        return dynamicMethod(ei0Var, obj, null);
    }

    public abstract Object dynamicMethod(ei0 ei0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        return nh1Var.m4549a(getClass()).mo904e(this, (fi0) obj);
    }

    @Override // p000.z41
    public final fi0 getDefaultInstanceForType() {
        return (fi0) dynamicMethod(ei0.f3350f);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // p000.y41
    public final ec1 getParserForType() {
        return (ec1) dynamicMethod(ei0.f3351g);
    }

    @Override // p000.AbstractC0812k1
    public int getSerializedSize(qp1 qp1Var) {
        int iMo907h;
        int iMo907h2;
        if (isMutable()) {
            if (qp1Var == null) {
                nh1 nh1Var = nh1.f7407c;
                nh1Var.getClass();
                iMo907h2 = nh1Var.m4549a(getClass()).mo907h(this);
            } else {
                iMo907h2 = qp1Var.mo907h(this);
            }
            if (iMo907h2 >= 0) {
                return iMo907h2;
            }
            f40.m2719o(jd0.m3609g(iMo907h2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (qp1Var == null) {
            nh1 nh1Var2 = nh1.f7407c;
            nh1Var2.getClass();
            iMo907h = nh1Var2.m4549a(getClass()).mo907h(this);
        } else {
            iMo907h = qp1Var.mo907h(this);
        }
        setMemoizedSerializedSize(iMo907h);
        return iMo907h;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        nh1Var.m4549a(getClass()).mo901b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, AbstractC0753ik abstractC0753ik) {
        if (this.unknownFields == a42.f44f) {
            this.unknownFields = new a42();
        }
        a42 a42Var = this.unknownFields;
        a42Var.m76a();
        if (i != 0) {
            a42Var.m80f((i << 3) | 2, abstractC0753ik);
        } else {
            f40.m2713i("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(a42 a42Var) {
        this.unknownFields = a42.m75e(this.unknownFields, a42Var);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == a42.f44f) {
            this.unknownFields = new a42();
        }
        a42 a42Var = this.unknownFields;
        a42Var.m76a();
        if (i != 0) {
            a42Var.m80f(i << 3, Long.valueOf(i2));
        } else {
            f40.m2713i("Zero is not a valid field number.");
        }
    }

    @Override // p000.y41
    public final ai0 newBuilderForType() {
        return (ai0) dynamicMethod(ei0.f3349e);
    }

    public fi0 newMutableInstance() {
        return (fi0) dynamicMethod(ei0.f3348d);
    }

    public boolean parseUnknownField(int i, AbstractC0762ip abstractC0762ip) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == a42.f44f) {
            this.unknownFields = new a42();
        }
        return this.unknownFields.m79d(i, abstractC0762ip);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            f40.m2719o(jd0.m3609g(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* JADX INFO: renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final ai0 m7440toBuilder() {
        return ((ai0) dynamicMethod(ei0.f3349e)).mergeFrom(this);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = a51.f61a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        a51.m84c(this, sb, 0);
        return sb.toString();
    }

    @Override // p000.y41
    public void writeTo(AbstractC1153np abstractC1153np) {
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        qp1 qp1VarM4549a = nh1Var.m4549a(getClass());
        ay0 ay0Var = abstractC1153np.f7492a;
        if (ay0Var == null) {
            ay0Var = new ay0(abstractC1153np);
        }
        qp1VarM4549a.mo903d(this, ay0Var);
    }

    public Object dynamicMethod(ei0 ei0Var) {
        return dynamicMethod(ei0Var, null, null);
    }

    public final <MessageType extends fi0, BuilderType extends ai0> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((fi0) messagetype);
    }

    public static <T extends fi0> T parseDelimitedFrom(T t, InputStream inputStream, u80 u80Var) throws rp0 {
        T t2 = (T) m2813d(t, inputStream, u80Var);
        m2812c(t2);
        return t2;
    }

    public static lo0 mutableCopy(lo0 lo0Var) {
        int size = lo0Var.size();
        int i = size == 0 ? 10 : size * 2;
        yv0 yv0Var = (yv0) lo0Var;
        if (i >= yv0Var.f13155c) {
            return new yv0(Arrays.copyOf(yv0Var.f13154b, i), yv0Var.f13155c, true);
        }
        l41.m4049r();
        return null;
    }

    public static jo0 mutableCopy(jo0 jo0Var) {
        int size = jo0Var.size();
        int i = size == 0 ? 10 : size * 2;
        fb0 fb0Var = (fb0) jo0Var;
        if (i >= fb0Var.f3744c) {
            return new fb0(Arrays.copyOf(fb0Var.f3743b, i), fb0Var.f3744c, true);
        }
        l41.m4049r();
        return null;
    }

    public static go0 mutableCopy(go0 go0Var) {
        int size = go0Var.size();
        int i = size == 0 ? 10 : size * 2;
        q30 q30Var = (q30) go0Var;
        if (i >= q30Var.f9321c) {
            return new q30(Arrays.copyOf(q30Var.f9320b, i), q30Var.f9321c, true);
        }
        l41.m4049r();
        return null;
    }

    @Override // p000.z41
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static fo0 mutableCopy(fo0 fo0Var) {
        int size = fo0Var.size();
        int i = size == 0 ? 10 : size * 2;
        C0829ki c0829ki = (C0829ki) fo0Var;
        if (i >= c0829ki.f5828c) {
            return new C0829ki(Arrays.copyOf(c0829ki.f5827b, i), c0829ki.f5828c, true);
        }
        l41.m4049r();
        return null;
    }

    public static <E> mo0 mutableCopy(mo0 mo0Var) {
        int size = mo0Var.size();
        return mo0Var.mo2783d(size == 0 ? 10 : size * 2);
    }

    public static <T extends fi0> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, u80.m6404a());
    }

    public static <T extends fi0> T parseFrom(T t, AbstractC0753ik abstractC0753ik) throws rp0 {
        T t2 = (T) parseFrom(t, abstractC0753ik, u80.m6404a());
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, AbstractC0753ik abstractC0753ik, u80 u80Var) throws rp0 {
        AbstractC0762ip abstractC0762ipMo2994q = abstractC0753ik.mo2994q();
        T t2 = (T) parsePartialFrom(t, abstractC0762ipMo2994q, u80Var);
        abstractC0762ipMo2994q.mo2615a(0);
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, byte[] bArr) throws rp0 {
        T t2 = (T) m2814e(t, bArr, 0, bArr.length, u80.m6404a());
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, byte[] bArr, u80 u80Var) throws rp0 {
        T t2 = (T) m2814e(t, bArr, 0, bArr.length, u80Var);
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, InputStream inputStream) throws rp0 {
        T t2 = (T) parsePartialFrom(t, AbstractC0762ip.m3469g(inputStream), u80.m6404a());
        m2812c(t2);
        return t2;
    }

    @Override // p000.y41
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends fi0> T parseFrom(T t, InputStream inputStream, u80 u80Var) throws rp0 {
        T t2 = (T) parsePartialFrom(t, AbstractC0762ip.m3469g(inputStream), u80Var);
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parseFrom(T t, AbstractC0762ip abstractC0762ip) {
        return (T) parseFrom(t, abstractC0762ip, u80.m6404a());
    }

    public static <T extends fi0> T parseFrom(T t, AbstractC0762ip abstractC0762ip, u80 u80Var) throws rp0 {
        T t2 = (T) parsePartialFrom(t, abstractC0762ip, u80Var);
        m2812c(t2);
        return t2;
    }

    public static <T extends fi0> T parsePartialFrom(T t, AbstractC0762ip abstractC0762ip) {
        return (T) parsePartialFrom(t, abstractC0762ip, u80.m6404a());
    }
}
