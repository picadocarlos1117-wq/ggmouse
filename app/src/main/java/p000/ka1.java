package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends or0 implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka1(Object obj, int i) {
        super(0);
        this.f5727a = i;
        this.f5728b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0038: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:14:0x0037, B:22:0x0038] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x002e: CHECK_CAST (ia1) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p000.mg0
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f5727a
            z32 r1 = p000.z32.f13265a
            java.lang.Object r5 = r5.f5728b
            switch(r0) {
                case 0: goto L42;
                case 1: goto L16;
                case 2: goto L10;
                default: goto L9;
            }
        L9:
            w72 r5 = (p000.w72) r5
            dp1 r5 = p000.hp0.m3229y(r5)
            return r5
        L10:
            ra1 r5 = (p000.ra1) r5
            r5.m5754b()
            return r1
        L16:
            ra1 r5 = (p000.ra1) r5
            y9 r0 = r5.f9858b
            int r2 = r0.mo701a()
            java.util.ListIterator r0 = r0.listIterator(r2)
        L22:
            boolean r2 = r0.hasPrevious()
            r3 = 0
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.previous()
            r4 = r2
            ia1 r4 = (p000.ia1) r4
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L22
            goto L38
        L37:
            r2 = r3
        L38:
            ia1 r2 = (p000.ia1) r2
            r5.f9859c = r3
            if (r2 == 0) goto L41
            r2.handleOnBackCancelled()
        L41:
            return r1
        L42:
            ra1 r5 = (p000.ra1) r5
            r5.m5754b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ka1.invoke():java.lang.Object");
    }
}
