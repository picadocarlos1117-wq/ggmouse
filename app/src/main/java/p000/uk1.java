package p000;

import android.app.RemoteInput;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uk1 {
    /* JADX INFO: renamed from: a */
    public static int m6504a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    /* JADX INFO: renamed from: b */
    public static RemoteInput.Builder m6505b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
