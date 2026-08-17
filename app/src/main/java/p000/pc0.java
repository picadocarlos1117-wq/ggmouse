package p000;

import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.widget.EditText;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.Jogo;
import com.example.ssmousepro.MainActivity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContextWrapper f8842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8843c;

    public /* synthetic */ pc0(ContextWrapper contextWrapper, Object obj, int i) {
        this.f8841a = i;
        this.f8842b = contextWrapper;
        this.f8843c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f8841a;
        Object obj = this.f8843c;
        ContextWrapper contextWrapper = this.f8842b;
        switch (i2) {
            case 0:
                FloatingService.mostrarDialogoNumeroComp$lambda$20((FloatingService) contextWrapper, (EditText) obj, dialogInterface, i);
                break;
            default:
                MainActivity.confirmarExclusaoJogo$lambda$8((MainActivity) contextWrapper, (Jogo) obj, dialogInterface, i);
                break;
        }
    }
}
