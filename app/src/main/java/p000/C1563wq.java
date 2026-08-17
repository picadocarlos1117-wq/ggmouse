package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC0053q;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: wq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563wq extends AbstractC1356r4 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC0613er f12249h;

    public C1563wq(AbstractActivityC0613er abstractActivityC0613er) {
        this.f12249h = abstractActivityC0613er;
    }

    @Override // p000.AbstractC1356r4
    /* JADX INFO: renamed from: b */
    public final void mo5689b(int i, AbstractC0815k4 abstractC0815k4, Object obj) {
        Bundle bundleExtra;
        int i2;
        AbstractActivityC0613er abstractActivityC0613er = this.f12249h;
        ay0 ay0VarMo3770b = abstractC0815k4.mo3770b(abstractActivityC0613er, obj);
        if (ay0VarMo3770b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1582x8(this, i, ay0VarMo3770b, 2));
            return;
        }
        Intent intentMo3769a = abstractC0815k4.mo3769a(abstractActivityC0613er, obj);
        if (intentMo3769a.getExtras() != null && intentMo3769a.getExtras().getClassLoader() == null) {
            intentMo3769a.setExtrasClassLoader(abstractActivityC0613er.getClassLoader());
        }
        if (intentMo3769a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo3769a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo3769a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo3769a.getAction())) {
            String[] stringArrayExtra = intentMo3769a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    f40.m2713i(AbstractC1308pu.m5342i(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (!AbstractC1408sj.m6104a() && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            if (abstractActivityC0613er instanceof AbstractActivityC0053q) {
                ((AbstractActivityC0053q) abstractActivityC0613er).validateRequestPermissionsRequestCode(i);
            }
            AbstractC0590e4.m2493b(abstractActivityC0613er, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo3769a.getAction())) {
            AbstractC0122c4.m1124b(abstractActivityC0613er, intentMo3769a, i, bundle);
            return;
        }
        eo0 eo0Var = (eo0) intentMo3769a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                AbstractC0122c4.m1125c(abstractActivityC0613er, eo0Var.f3396a, i2, eo0Var.f3397b, eo0Var.f3398c, eo0Var.f3399d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new RunnableC1582x8(this, i2, e, 3));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }
}
