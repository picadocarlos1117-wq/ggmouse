package p000;

import android.os.Bundle;
import com.example.ssmousepro.ForegroundAppDetector;
import com.example.ssmousepro.analytics.AppAnalytics;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1171o6 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f7668b;

    public /* synthetic */ C1171o6(String str, int i) {
        this.f7667a = i;
        this.f7668b = str;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f7667a;
        String str = this.f7668b;
        switch (i) {
            case 0:
                return AppAnalytics.rewardedError$lambda$4(str, (Bundle) obj);
            default:
                return Boolean.valueOf(ForegroundAppDetector.pacoteVisivelNoDumpsys$lambda$8(str, (String) obj));
        }
    }
}
