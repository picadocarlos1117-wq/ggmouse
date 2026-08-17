package p000;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: cl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0139cl implements iq0, Serializable {
    public static final Object NO_RECEIVER = C0103bl.f1399a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient iq0 reflected;
    private final String signature;

    public AbstractC0139cl(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // p000.iq0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p000.iq0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public iq0 compute() {
        iq0 iq0Var = this.reflected;
        if (iq0Var != null) {
            return iq0Var;
        }
        iq0 iq0VarComputeReflected = computeReflected();
        this.reflected = iq0VarComputeReflected;
        return iq0VarComputeReflected;
    }

    public abstract iq0 computeReflected();

    @Override // p000.hq0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public kq0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return gk1.m3006a(cls);
        }
        gk1.f4217a.getClass();
        return new wb1(cls);
    }

    @Override // p000.iq0
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract iq0 getReflected();

    @Override // p000.iq0
    public qq0 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p000.iq0
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p000.iq0
    public rq0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p000.iq0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p000.iq0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p000.iq0
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p000.iq0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
