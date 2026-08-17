package p000;

import android.content.DialogInterface;
import com.example.ssmousepro.PreferencesActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13396b;

    public /* synthetic */ zf1(Object obj, int i) {
        this.f13395a = i;
        this.f13396b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f13395a;
        Object obj = this.f13396b;
        switch (i2) {
            case 0:
                PreferencesActivity.abrirEscolhaModoAtivacao$lambda$20((PreferencesActivity) obj, dialogInterface, i);
                break;
            case 1:
                PreferencesActivity.abrirEscolhaModoAtivacao$lambda$22$lambda$21((PreferencesActivity) obj, dialogInterface, i);
                break;
            default:
                ((mg0) obj).invoke();
                break;
        }
    }
}
