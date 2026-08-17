package p000;

import com.example.ssmousepro.PreferencesActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PreferencesActivity f11284b;

    public /* synthetic */ uf1(PreferencesActivity preferencesActivity, int i) {
        this.f11283a = i;
        this.f11284b = preferencesActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11283a;
        PreferencesActivity preferencesActivity = this.f11284b;
        switch (i) {
            case 0:
                preferencesActivity.atualizarInterface();
                break;
            case 1:
                preferencesActivity.atualizarInterface();
                break;
            default:
                preferencesActivity.atualizarInterface();
                break;
        }
    }
}
