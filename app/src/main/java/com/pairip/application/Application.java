package com.pairip.application;

import android.content.Context;
import com.example.ssmousepro.SSMouseProApplication;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends SSMouseProApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
