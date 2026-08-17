package p000;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc2 {

    /* JADX INFO: renamed from: a */
    public static final pd2 f13348a = new pd2("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m7302a(Signature[] signatureArr) {
        String strEncodeToString;
        if (signatureArr == null || (signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            pd2 pd2Var = f13348a;
            pd2Var.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", pd2.m5252c(pd2Var.f8863a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
            return false;
        }
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                strEncodeToString = "";
            }
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        return false;
    }
}
