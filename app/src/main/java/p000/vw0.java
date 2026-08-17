package p000;

import com.example.ssmousepro.MainActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f11786b;

    public /* synthetic */ vw0(MainActivity mainActivity, int i) {
        this.f11785a = i;
        this.f11786b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11785a;
        MainActivity mainActivity = this.f11786b;
        switch (i) {
            case 0:
                mainActivity.atualizarSaldoUi();
                break;
            case 1:
                MainActivity.access$atualizarLedsPerifericos(mainActivity);
                break;
            case 2:
                MainActivity.access$atualizarLedsPerifericos(mainActivity);
                break;
            default:
                MainActivity.access$atualizarLedsPerifericos(mainActivity);
                break;
        }
    }
}
