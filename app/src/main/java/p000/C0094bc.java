package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: bc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094bc extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f1286a;

    /* JADX INFO: renamed from: b */
    public final Uri f1287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0130cc f1288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094bc(C0130cc c0130cc, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f1288c = c0130cc;
        this.f1286a = contentResolver;
        this.f1287b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C0130cc c0130cc = this.f1288c;
        c0130cc.m1209a(C1659zb.m7296b(c0130cc.f1745a, c0130cc.f1753i, c0130cc.f1752h));
    }
}
