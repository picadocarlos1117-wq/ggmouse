package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p000.BinderC0544cv;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a */
    public final BinderC0544cv f649a = new BinderC0544cv();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f649a;
    }
}
