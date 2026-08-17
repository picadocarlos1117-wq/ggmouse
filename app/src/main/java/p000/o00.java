package p000;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o00 extends hp0 {

    /* JADX INFO: renamed from: s */
    public final Object f7599s = new Object();

    /* JADX INFO: renamed from: t */
    public final ExecutorService f7600t = Executors.newFixedThreadPool(4, new n00());

    /* JADX INFO: renamed from: u */
    public volatile Handler f7601u;
}
