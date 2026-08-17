package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f10084d = Logger.getLogger(ro0.class.getName());

    /* JADX INFO: renamed from: e */
    public static final ro0 f10085e = new ro0();

    /* JADX INFO: renamed from: a */
    public final ConcurrentSkipListMap f10086a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f10087b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f10088c;

    public ro0() {
        new ConcurrentSkipListMap();
        this.f10086a = new ConcurrentSkipListMap();
        this.f10087b = new ConcurrentHashMap();
        this.f10088c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
