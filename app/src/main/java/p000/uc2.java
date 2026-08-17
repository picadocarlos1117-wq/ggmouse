package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 extends qd2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ IBinder f11260g;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ wc2 f11261m;

    public uc2(wc2 wc2Var, IBinder iBinder) {
        this.f11261m = wc2Var;
        this.f11260g = iBinder;
    }

    @Override // p000.qd2
    /* JADX INFO: renamed from: b */
    public final void mo1743b() {
        xc2 xc2Var = this.f11261m.f12065a;
        xc2Var.f12575n = (IInterface) xc2Var.f12570i.mo1741a(this.f11260g);
        pd2 pd2Var = xc2Var.f12563b;
        int i = 0;
        pd2Var.m5254b("linkToDeath", new Object[0]);
        try {
            xc2Var.f12575n.asBinder().linkToDeath(xc2Var.f12572k, 0);
        } catch (RemoteException e) {
            pd2Var.m5253a(e, "linkToDeath failed", new Object[0]);
        }
        xc2Var.f12568g = false;
        ArrayList arrayList = xc2Var.f12565d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        xc2Var.f12565d.clear();
    }
}
