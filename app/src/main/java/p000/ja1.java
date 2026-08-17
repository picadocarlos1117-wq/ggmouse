package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends or0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ra1 f5338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(ra1 ra1Var, int i) {
        super(1);
        this.f5337a = i;
        this.f5338b = ra1Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    @Override // p000.og0
    public final Object invoke(Object obj) {
        ia1 ia1Var;
        ia1 ia1Var2;
        int i = this.f5337a;
        z32 z32Var = z32.f13265a;
        Object obj2 = null;
        ra1 ra1Var = this.f5338b;
        switch (i) {
            case 0:
                C1368rg c1368rg = (C1368rg) obj;
                c1368rg.getClass();
                C1620y9 c1620y9 = ra1Var.f9858b;
                ListIterator listIterator = c1620y9.listIterator(c1620y9.mo701a());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((ia1) objPrevious).isEnabled()) {
                        obj2 = objPrevious;
                        ia1Var = (ia1) obj2;
                        ra1Var.f9859c = ia1Var;
                        if (ia1Var != null) {
                            ia1Var.handleOnBackStarted(c1368rg);
                        }
                        break;
                    }
                }
                ia1Var = (ia1) obj2;
                ra1Var.f9859c = ia1Var;
                if (ia1Var != null) {
                    ia1Var.handleOnBackStarted(c1368rg);
                }
                break;
            default:
                C1368rg c1368rg2 = (C1368rg) obj;
                c1368rg2.getClass();
                C1620y9 c1620y10 = ra1Var.f9858b;
                ListIterator listIterator2 = c1620y10.listIterator(c1620y10.mo701a());
                while (listIterator2.hasPrevious()) {
                    Object objPrevious2 = listIterator2.previous();
                    if (((ia1) objPrevious2).isEnabled()) {
                        obj2 = objPrevious2;
                        ia1Var2 = (ia1) obj2;
                        if (ia1Var2 != null) {
                            ia1Var2.handleOnBackProgressed(c1368rg2);
                        }
                        break;
                    }
                }
                ia1Var2 = (ia1) obj2;
                if (ia1Var2 != null) {
                    ia1Var2.handleOnBackProgressed(c1368rg2);
                }
                break;
        }
        return z32Var;
    }
}
