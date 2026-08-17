package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0056t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1058l4 extends AbstractC0815k4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6174a;

    public /* synthetic */ C1058l4(int i) {
        this.f6174a = i;
    }

    @Override // p000.AbstractC0815k4
    /* JADX INFO: renamed from: a */
    public final Intent mo3769a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f6174a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case 3:
                eo0 eo0Var = (eo0) obj;
                eo0Var.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eo0Var);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            default:
                eo0 eo0Var2 = (eo0) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = eo0Var2.f3397b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = eo0Var2.f3396a;
                        intentSender.getClass();
                        eo0Var2 = new eo0(intentSender, null, eo0Var2.f3398c, eo0Var2.f3399d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eo0Var2);
                if (AbstractC0056t.m363G(2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }

    @Override // p000.AbstractC0815k4
    /* JADX INFO: renamed from: b */
    public ay0 mo3770b(Context context, Object obj) {
        int i = 4;
        switch (this.f6174a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new ay0(o60.f7669a, i);
                }
                for (String str : strArr) {
                    if (AbstractC0075au.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int iM5619i0 = qy0.m5619i0(strArr.length);
                if (iM5619i0 < 16) {
                    iM5619i0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM5619i0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new ay0(linkedHashMap, i);
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                if (AbstractC0075au.checkSelfPermission(context, str3) == 0) {
                    return new ay0(Boolean.TRUE, i);
                }
                return null;
            default:
                return super.mo3770b(context, obj);
        }
    }

    @Override // p000.AbstractC0815k4
    /* JADX INFO: renamed from: c */
    public final Object mo3771c(int i, Intent intent) {
        z = false;
        boolean z = false;
        switch (this.f6174a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC1451tp.m6307o0(arrayList2), AbstractC1451tp.m6307o0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new bc1(it.next(), it2.next()));
                        }
                        return qy0.m5621k0(arrayList3);
                    }
                }
                return o60.f7669a;
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return new C0738i4(i, intent);
            case 3:
                return new C0738i4(i, intent);
            default:
                return new C0738i4(i, intent);
        }
    }
}
