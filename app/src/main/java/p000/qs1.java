package p000;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs1 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9573b;

    public /* synthetic */ qs1(Object obj, int i) {
        this.f9572a = i;
        this.f9573b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f9572a;
        Object obj = this.f9573b;
        switch (i) {
            case 0:
                rs1 rs1Var = (rs1) obj;
                rs1Var.f10127a = null;
                rs1.f10126d.remove(rs1Var);
                break;
            default:
                ss1 ss1Var = (ss1) obj;
                if (!ss1Var.f10541c) {
                    ss1Var.f10541c = true;
                    ss1.f10538d.post(new fs1(ss1Var, 2));
                    break;
                }
                break;
        }
    }
}
