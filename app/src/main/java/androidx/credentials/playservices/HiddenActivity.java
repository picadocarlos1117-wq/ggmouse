package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.OnFailureListener;
import p000.C1521vl;
import p000.mk0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f650c = 0;

    /* JADX INFO: renamed from: a */
    public ResultReceiver f651a;

    /* JADX INFO: renamed from: b */
    public boolean f652b;

    /* JADX INFO: renamed from: a */
    public final void m327a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f651a;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
        this.f652b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f651a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f652b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f652b) {
            return;
        }
        if (stringExtra != null) {
            final int i2 = 2;
            final int i3 = 3;
            final int i4 = 1;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((beginSignInRequest != null ? Identity.getSignInClient((Activity) this).beginSignIn(beginSignInRequest).addOnSuccessListener(new C1521vl(new mk0(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 0), 22)).addOnFailureListener(new OnFailureListener(this) { // from class: lk0

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ HiddenActivity f6382b;

                            {
                                this.f6382b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                String str;
                                String str2;
                                int i5 = i3;
                                HiddenActivity hiddenActivity = this.f6382b;
                                switch (i5) {
                                    case 0:
                                        int i6 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver2 = hiddenActivity.f651a;
                                        resultReceiver2.getClass();
                                        hiddenActivity.m327a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                        break;
                                    case 1:
                                        int i7 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver3 = hiddenActivity.f651a;
                                        resultReceiver3.getClass();
                                        hiddenActivity.m327a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                        break;
                                    case 2:
                                        int i8 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver4 = hiddenActivity.f651a;
                                        resultReceiver4.getClass();
                                        hiddenActivity.m327a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                        break;
                                    default:
                                        int i9 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver5 = hiddenActivity.f651a;
                                        resultReceiver5.getClass();
                                        hiddenActivity.m327a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((publicKeyCredentialCreationOptions != null ? Fido.getFido2ApiClient((Activity) this).getRegisterPendingIntent(publicKeyCredentialCreationOptions).addOnSuccessListener(new C1521vl(new mk0(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 2), 19)).addOnFailureListener(new OnFailureListener(this) { // from class: lk0

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ HiddenActivity f6382b;

                            {
                                this.f6382b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                String str;
                                String str2;
                                int i5 = i;
                                HiddenActivity hiddenActivity = this.f6382b;
                                switch (i5) {
                                    case 0:
                                        int i6 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver2 = hiddenActivity.f651a;
                                        resultReceiver2.getClass();
                                        hiddenActivity.m327a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                        break;
                                    case 1:
                                        int i7 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver3 = hiddenActivity.f651a;
                                        resultReceiver3.getClass();
                                        hiddenActivity.m327a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                        break;
                                    case 2:
                                        int i8 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver4 = hiddenActivity.f651a;
                                        resultReceiver4.getClass();
                                        hiddenActivity.m327a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                        break;
                                    default:
                                        int i9 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver5 = hiddenActivity.f651a;
                                        resultReceiver5.getClass();
                                        hiddenActivity.m327a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((savePasswordRequest != null ? Identity.getCredentialSavingClient((Activity) this).savePassword(savePasswordRequest).addOnSuccessListener(new C1521vl(new mk0(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 1), 20)).addOnFailureListener(new OnFailureListener(this) { // from class: lk0

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ HiddenActivity f6382b;

                            {
                                this.f6382b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                String str;
                                String str2;
                                int i5 = i4;
                                HiddenActivity hiddenActivity = this.f6382b;
                                switch (i5) {
                                    case 0:
                                        int i6 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver2 = hiddenActivity.f651a;
                                        resultReceiver2.getClass();
                                        hiddenActivity.m327a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                        break;
                                    case 1:
                                        int i7 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver3 = hiddenActivity.f651a;
                                        resultReceiver3.getClass();
                                        hiddenActivity.m327a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                        break;
                                    case 2:
                                        int i8 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver4 = hiddenActivity.f651a;
                                        resultReceiver4.getClass();
                                        hiddenActivity.m327a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                        break;
                                    default:
                                        int i9 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver5 = hiddenActivity.f651a;
                                        resultReceiver5.getClass();
                                        hiddenActivity.m327a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((getSignInIntentRequest != null ? Identity.getSignInClient((Activity) this).getSignInIntent(getSignInIntentRequest).addOnSuccessListener(new C1521vl(new mk0(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 3), 21)).addOnFailureListener(new OnFailureListener(this) { // from class: lk0

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ HiddenActivity f6382b;

                            {
                                this.f6382b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                String str;
                                String str2;
                                int i5 = i2;
                                HiddenActivity hiddenActivity = this.f6382b;
                                switch (i5) {
                                    case 0:
                                        int i6 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver2 = hiddenActivity.f651a;
                                        resultReceiver2.getClass();
                                        hiddenActivity.m327a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                        break;
                                    case 1:
                                        int i7 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                        ResultReceiver resultReceiver3 = hiddenActivity.f651a;
                                        resultReceiver3.getClass();
                                        hiddenActivity.m327a(resultReceiver3, str, "During save password, found password failure response from one tap " + exc.getMessage());
                                        break;
                                    case 2:
                                        int i8 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver4 = hiddenActivity.f651a;
                                        resultReceiver4.getClass();
                                        hiddenActivity.m327a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                        break;
                                    default:
                                        int i9 = HiddenActivity.f650c;
                                        exc.getClass();
                                        str2 = ((exc instanceof ApiException) && AbstractC0113bv.f1556a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                        ResultReceiver resultReceiver5 = hiddenActivity.f651a;
                                        resultReceiver5.getClass();
                                        hiddenActivity.m327a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f652b);
        super.onSaveInstanceState(bundle);
    }
}
