package p000;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p003ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: si */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1407si implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10411b;

    public /* synthetic */ ViewOnClickListenerC1407si(Object obj, int i) {
        this.f10410a = i;
        this.f10411b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.f10410a;
        Message messageObtain = null;
        messageObtain = null;
        boolean z = true;
        Object obj = this.f10411b;
        switch (i) {
            case 0:
                AbstractDialogC1555wi abstractDialogC1555wi = (AbstractDialogC1555wi) obj;
                if (abstractDialogC1555wi.cancelable && abstractDialogC1555wi.isShowing() && abstractDialogC1555wi.shouldWindowCloseOnTouchOutside()) {
                    abstractDialogC1555wi.cancel();
                    break;
                }
                break;
            case 1:
                ((AbstractC0086b4) obj).mo834a();
                break;
            case 2:
                C1320q5 c1320q5 = (C1320q5) obj;
                if (view == c1320q5.f9372i && (message3 = c1320q5.f9374k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == c1320q5.f9375l && (message2 = c1320q5.f9377n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == c1320q5.f9378o && (message = c1320q5.f9380q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c1320q5.f9362E.obtainMessage(1, c1320q5.f9365b).sendToTarget();
                break;
            case 3:
                qz0 qz0Var = (qz0) obj;
                int i2 = qz0Var.f9625e;
                if (i2 == 2) {
                    qz0Var.m5629g(1);
                } else if (i2 == 1) {
                    qz0Var.m5629g(2);
                }
                break;
            case 4:
                j12 j12Var = ((Toolbar) obj).f513R;
                r31 r31Var = j12Var != null ? j12Var.f5238b : null;
                if (r31Var != null) {
                    r31Var.collapseActionView();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                HashMap map = trackSelectionView.f836g;
                if (view == trackSelectionView.f832c) {
                    trackSelectionView.f841q = true;
                    map.clear();
                } else if (view == trackSelectionView.f833d) {
                    trackSelectionView.f841q = false;
                    map.clear();
                } else {
                    trackSelectionView.f841q = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    i22 i22Var = (i22) tag;
                    k22 k22Var = i22Var.f4780a;
                    y12 y12Var = k22Var.f5652b;
                    int i3 = i22Var.f4781b;
                    e22 e22Var = (e22) map.get(y12Var);
                    if (e22Var == null) {
                        if (!trackSelectionView.f838n && map.size() > 0) {
                            map.clear();
                        }
                        map.put(y12Var, new e22(y12Var, qm0.m5570t(Integer.valueOf(i3))));
                    } else {
                        ArrayList arrayList = new ArrayList(e22Var.f3181b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        byte b = trackSelectionView.f837m && k22Var.f5653c;
                        if (b == false && (!trackSelectionView.f838n || trackSelectionView.f835f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i3));
                            if (arrayList.isEmpty()) {
                                map.remove(y12Var);
                            } else {
                                map.put(y12Var, new e22(y12Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (b == true) {
                                arrayList.add(Integer.valueOf(i3));
                                map.put(y12Var, new e22(y12Var, arrayList));
                            } else {
                                map.put(y12Var, new e22(y12Var, qm0.m5570t(Integer.valueOf(i3))));
                            }
                        }
                    }
                }
                trackSelectionView.m464a();
                break;
        }
    }
}
