package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p000.RunnableC0089b7;
import p000.mg1;
import p000.nn0;
import p000.pu0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements nn0 {
    @Override // p000.nn0
    /* JADX INFO: renamed from: a */
    public final Object mo328a(Context context) {
        mg1.m4423a(new RunnableC0089b7(this, context.getApplicationContext()));
        return new pu0(7);
    }

    @Override // p000.nn0
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
