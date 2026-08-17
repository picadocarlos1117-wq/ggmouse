package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ai0 extends AbstractC0774j1 {
    private final fi0 defaultInstance;
    protected fi0 instance;

    public ai0(fi0 fi0Var) {
        this.defaultInstance = fi0Var;
        if (fi0Var.isMutable()) {
            f40.m2713i("Default instance must be immutable.");
            throw null;
        }
        this.instance = fi0Var.newMutableInstance();
    }

    /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
    public final fi0 m7404build() {
        fi0 fi0VarBuildPartial = buildPartial();
        if (fi0VarBuildPartial.isInitialized()) {
            return fi0VarBuildPartial;
        }
        throw AbstractC0774j1.newUninitializedMessageException(fi0VarBuildPartial);
    }

    @Override // p000.x41
    public fi0 buildPartial() {
        boolean zIsMutable = this.instance.isMutable();
        fi0 fi0Var = this.instance;
        if (!zIsMutable) {
            return fi0Var;
        }
        fi0Var.makeImmutable();
        return this.instance;
    }

    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final ai0 m7405clear() {
        if (this.defaultInstance.isMutable()) {
            f40.m2713i("Default instance must be immutable.");
            return null;
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ai0 m7408clone() {
        ai0 ai0VarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        ai0VarNewBuilderForType.instance = buildPartial();
        return ai0VarNewBuilderForType;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        fi0 fi0VarNewMutableInstance = this.defaultInstance.newMutableInstance();
        fi0 fi0Var = this.instance;
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        nh1Var.m4549a(fi0VarNewMutableInstance.getClass()).mo900a(fi0VarNewMutableInstance, fi0Var);
        this.instance = fi0VarNewMutableInstance;
    }

    @Override // p000.z41
    public final boolean isInitialized() {
        return fi0.isInitialized(this.instance, false);
    }

    @Override // p000.AbstractC0774j1
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public ai0 m7409mergeFrom(AbstractC0762ip abstractC0762ip, u80 u80Var) throws IOException {
        copyOnWrite();
        try {
            nh1 nh1Var = nh1.f7407c;
            fi0 fi0Var = this.instance;
            nh1Var.getClass();
            qp1 qp1VarM4549a = nh1Var.m4549a(fi0Var.getClass());
            fi0 fi0Var2 = this.instance;
            C0799jp c0799jp = abstractC0762ip.f5124c;
            if (c0799jp == null) {
                c0799jp = new C0799jp(abstractC0762ip);
            }
            qp1VarM4549a.mo905f(fi0Var2, c0799jp, u80Var);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // p000.z41
    public fi0 getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // p000.AbstractC0774j1
    public ai0 internalMergeFrom(fi0 fi0Var) {
        return mergeFrom(fi0Var);
    }

    public ai0 mergeFrom(fi0 fi0Var) {
        if (getDefaultInstanceForType().equals(fi0Var)) {
            return this;
        }
        copyOnWrite();
        fi0 fi0Var2 = this.instance;
        nh1 nh1Var = nh1.f7407c;
        nh1Var.getClass();
        nh1Var.m4549a(fi0Var2.getClass()).mo900a(fi0Var2, fi0Var);
        return this;
    }

    @Override // p000.AbstractC0774j1
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public ai0 m7411mergeFrom(byte[] bArr, int i, int i2, u80 u80Var) throws rp0 {
        copyOnWrite();
        try {
            nh1 nh1Var = nh1.f7407c;
            fi0 fi0Var = this.instance;
            nh1Var.getClass();
            nh1Var.m4549a(fi0Var.getClass()).mo908i(this.instance, bArr, i, i + i2, new C1583x9(u80Var));
            return this;
        } catch (IndexOutOfBoundsException unused) {
            throw rp0.m5887h();
        } catch (rp0 e) {
            throw e;
        } catch (IOException e2) {
            l41.m4043l("Reading from byte array should not throw IOException.", e2);
            return null;
        }
    }

    @Override // p000.AbstractC0774j1
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public ai0 m7410mergeFrom(byte[] bArr, int i, int i2) {
        return m7411mergeFrom(bArr, i, i2, u80.m6404a());
    }
}
