package p000;

import android.database.sqlite.SQLiteDatabase;
import com.example.ssmousepro.activation.WirelessActivationActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.Transaction;
import java.util.Iterator;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq1 implements zk1, InterfaceC0578dt, OnCompleteListener, Continuation, ty1, InterfaceC0777j4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11390b;

    public /* synthetic */ uq1(Object obj, int i) {
        this.f11389a = i;
        this.f11390b = obj;
    }

    @Override // p000.zk1
    /* JADX INFO: renamed from: a */
    public void mo6522a(long j, dc1 dc1Var) {
        ki0.m3869o(j, dc1Var, (c22[]) ((C1174o9) this.f11390b).f7700c);
    }

    @Override // p000.InterfaceC0578dt
    public void accept(Object obj) {
        ((nm0) this.f11390b).m3901a((C1122mv) obj);
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public Object mo940b() {
        int i = this.f11389a;
        Object obj = this.f11390b;
        switch (i) {
            case 5:
                no1 no1Var = ((p42) obj).f8724i;
                SQLiteDatabase sQLiteDatabaseM4577c = no1Var.m4577c();
                sQLiteDatabaseM4577c.beginTransaction();
                try {
                    sQLiteDatabaseM4577c.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM4577c.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + no1Var.f7486b.m753r()).execute();
                    sQLiteDatabaseM4577c.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM4577c.endTransaction();
                }
            default:
                C0599ed c0599ed = (C0599ed) obj;
                Iterator it = ((Iterable) ((no1) c0599ed.f3314b).m4578e(new l41(25))).iterator();
                while (it.hasNext()) {
                    ((C1174o9) c0599ed.f3315c).m4755X((C0674ge) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p000.InterfaceC0777j4
    public void onActivityResult(Object obj) {
        WirelessActivationActivity.pedidoNotificacao$lambda$0((WirelessActivationActivity) this.f11390b, (Boolean) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        TasksKt.asDeferredImpl$lambda$1((CompletableDeferred) this.f11390b, task);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.f11389a;
        Object obj = this.f11390b;
        switch (i) {
            case 3:
                return ((Transaction) obj).lambda$lookup$0(task);
            default:
                return ((com.google.firebase.firestore.Transaction) obj).lambda$getAsync$0(task);
        }
    }
}
