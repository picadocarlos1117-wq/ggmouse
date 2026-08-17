package p000;

import java.io.ByteArrayInputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 extends ObjectInputStream {

    /* JADX INFO: renamed from: c */
    public static final HashSet f7367c;

    /* JADX INFO: renamed from: a */
    public final Class f7368a;

    /* JADX INFO: renamed from: b */
    public boolean f7369b;

    static {
        HashSet hashSet = new HashSet();
        f7367c = hashSet;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public nc2(Class cls, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f7369b = false;
        this.f7368a = cls;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
        if (this.f7369b) {
            if (!f7367c.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!objectStreamClass.getName().equals(this.f7368a.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.f7369b = true;
        }
        return super.resolveClass(objectStreamClass);
    }
}
