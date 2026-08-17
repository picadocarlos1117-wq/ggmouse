package p000;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mk0 extends or0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HiddenActivity f7028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(HiddenActivity hiddenActivity, int i, int i2) {
        super(1);
        this.f7027a = i2;
        this.f7028b = hiddenActivity;
        this.f7029c = i;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        int i = this.f7027a;
        z32 z32Var = z32.f13265a;
        switch (i) {
            case 0:
                HiddenActivity hiddenActivity = this.f7028b;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.f652b = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.f7029c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e) {
                    ResultReceiver resultReceiver = hiddenActivity.f651a;
                    resultReceiver.getClass();
                    hiddenActivity.m327a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.f7028b;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.f652b = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.f7029c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f651a;
                    resultReceiver2.getClass();
                    hiddenActivity2.m327a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e2.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.f7028b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                try {
                    hiddenActivity3.f652b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f7029c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e3) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f651a;
                    resultReceiver3.getClass();
                    hiddenActivity3.m327a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e3.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.f7028b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.f652b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f7029c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e4) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f651a;
                    resultReceiver4.getClass();
                    hiddenActivity4.m327a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e4.getMessage());
                }
                break;
        }
        return z32Var;
        return z32Var;
        return z32Var;
        return z32Var;
    }
}
