package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1326qb {

    /* JADX INFO: renamed from: c */
    public static final Logger f9463c = Logger.getLogger(C1326qb.class.getName());

    /* JADX INFO: renamed from: a */
    public final String f9464a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f9465b;

    public C1326qb(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f9465b = atomicLong;
        p32.m5177l(j > 0, "value must be positive");
        this.f9464a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
