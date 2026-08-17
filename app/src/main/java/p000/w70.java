package p000;

import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w70 implements xt0, Continuation, Supplier, InterfaceC0700h3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f12015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12016c;

    public /* synthetic */ w70(int i, int i2, Object obj) {
        this.f12014a = i2;
        this.f12016c = obj;
        this.f12015b = i;
    }

    @Override // p000.InterfaceC0700h3
    /* JADX INFO: renamed from: a */
    public boolean mo3095a(View view) {
        ((SideSheetBehavior) this.f12016c).m1694v(this.f12015b);
        return true;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        return ((LocalStore) this.f12016c).lambda$rejectBatch$4(this.f12015b);
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        switch (this.f12014a) {
            case 0:
                ((ce1) obj).onTimelineChanged(((sd1) this.f12016c).f10371a, this.f12015b);
                break;
            default:
                ((ce1) obj).onMediaItemTransition((z11) this.f12016c, this.f12015b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((FirebaseAuthCredentialsProvider) this.f12016c).lambda$getToken$2(this.f12015b, task);
    }
}
