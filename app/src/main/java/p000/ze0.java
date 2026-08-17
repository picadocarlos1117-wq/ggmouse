package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 implements InterfaceC0777j4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0056t f13381b;

    public /* synthetic */ ze0(AbstractC0056t abstractC0056t, int i) {
        this.f13380a = i;
        this.f13381b = abstractC0056t;
    }

    @Override // p000.InterfaceC0777j4
    public final void onActivityResult(Object obj) {
        int i = this.f13380a;
        AbstractC0056t abstractC0056t = this.f13381b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                ef0 ef0Var = (ef0) abstractC0056t.f701C.pollFirst();
                if (ef0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = ef0Var.f3328a;
                    int i3 = ef0Var.f3329b;
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM434c = abstractC0056t.f714c.m434c(str);
                    if (abstractComponentCallbacksC0048lM434c == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        abstractComponentCallbacksC0048lM434c.onRequestPermissionsResult(i3, strArr, iArr);
                    }
                }
                break;
            case 1:
                C0738i4 c0738i4 = (C0738i4) obj;
                ef0 ef0Var2 = (ef0) abstractC0056t.f701C.pollFirst();
                if (ef0Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = ef0Var2.f3328a;
                    int i4 = ef0Var2.f3329b;
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM434c2 = abstractC0056t.f714c.m434c(str2);
                    if (abstractComponentCallbacksC0048lM434c2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0048lM434c2.onActivityResult(i4, c0738i4.f4811a, c0738i4.f4812b);
                    }
                }
                break;
            default:
                C0738i4 c0738i5 = (C0738i4) obj;
                ef0 ef0Var3 = (ef0) abstractC0056t.f701C.pollFirst();
                if (ef0Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = ef0Var3.f3328a;
                    int i5 = ef0Var3.f3329b;
                    AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048lM434c3 = abstractC0056t.f714c.m434c(str3);
                    if (abstractComponentCallbacksC0048lM434c3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0048lM434c3.onActivityResult(i5, c0738i5.f4811a, c0738i5.f4812b);
                    }
                }
                break;
        }
    }
}
