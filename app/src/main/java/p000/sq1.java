package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sq1 {

    /* JADX INFO: renamed from: a */
    public static final rq1 f10489a = new rq1(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b */
    public static final int f10490b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f10491c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10490b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f10491c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m6132a(rq1 rq1Var) {
        rq1Var.getClass();
        if (rq1Var.f10101f != null || rq1Var.f10102g != null) {
            f40.m2713i("Failed requirement.");
            return;
        }
        if (rq1Var.f10099d) {
            return;
        }
        AtomicReference atomicReference = f10491c[(int) (Thread.currentThread().getId() & (((long) f10490b) - 1))];
        rq1 rq1Var2 = f10489a;
        rq1 rq1Var3 = (rq1) atomicReference.getAndSet(rq1Var2);
        if (rq1Var3 == rq1Var2) {
            return;
        }
        int i = rq1Var3 != null ? rq1Var3.f10098c : 0;
        if (i >= 65536) {
            atomicReference.set(rq1Var3);
            return;
        }
        rq1Var.f10101f = rq1Var3;
        rq1Var.f10097b = 0;
        rq1Var.f10098c = i + PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE;
        atomicReference.set(rq1Var);
    }

    /* JADX INFO: renamed from: b */
    public static final rq1 m6133b() {
        AtomicReference atomicReference = f10491c[(int) (Thread.currentThread().getId() & (((long) f10490b) - 1))];
        rq1 rq1Var = f10489a;
        rq1 rq1Var2 = (rq1) atomicReference.getAndSet(rq1Var);
        if (rq1Var2 == rq1Var) {
            return new rq1();
        }
        if (rq1Var2 == null) {
            atomicReference.set(null);
            return new rq1();
        }
        atomicReference.set(rq1Var2.f10101f);
        rq1Var2.f10101f = null;
        rq1Var2.f10098c = 0;
        return rq1Var2;
    }
}
