package com.example.ssmousepro.injection;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InjectionMetrics {
    public static final int I_AIM_ATIVO = 24;
    public static final int I_AIM_DEDO = 25;
    public static final int I_AIM_LOOP_TICKS = 28;
    public static final int I_APPLY_DELTA = 31;
    public static final int I_APPLY_DELTA_ZERO = 32;
    public static final int I_CLICK_LAT_COUNT = 21;
    public static final int I_CLICK_LAT_NS_LAST = 23;
    public static final int I_CLICK_LAT_NS_MAX = 22;
    public static final int I_CLICK_LAT_NS_SUM = 20;
    public static final int I_COALESCE_PENDENTE = 9;
    public static final int I_FLUSH_FORCADO = 30;
    public static final int I_INJECT_DOWN_FAIL = 17;
    public static final int I_INJECT_DOWN_OK = 16;
    public static final int I_INJECT_FAIL = 11;
    public static final int I_INJECT_MOVE_FAIL = 15;
    public static final int I_INJECT_MOVE_OK = 14;
    public static final int I_INJECT_NS_MAX = 13;
    public static final int I_INJECT_NS_SUM = 12;
    public static final int I_INJECT_OK = 10;
    public static final int I_INJECT_UP_FAIL = 19;
    public static final int I_INJECT_UP_OK = 18;
    public static final int I_KEY_EVENTS = 33;
    public static final int I_MAX_ACTIVE_REJ = 26;
    public static final int I_MONO_NS = 1;
    public static final int I_MOUSE_FLUSH = 4;
    public static final int I_MOUSE_FLUSH_DX = 7;
    public static final int I_MOUSE_FLUSH_DY = 8;
    public static final int I_MOUSE_RAW = 3;
    public static final int I_MOUSE_RAW_DX = 5;
    public static final int I_MOUSE_RAW_DY = 6;
    public static final int I_POLL_HZ = 2;
    public static final int I_READER_SYN = 29;
    public static final int I_SCHEMA = 0;
    public static final int I_TAP_ID_EXHAUST = 27;
    public static final int I_TOQUES_ATIVOS = 34;
    public static final int SCHEMA = 5;
    public static final int SNAPSHOT_LEN = 35;
    public static final InjectionMetrics INSTANCE = new InjectionMetrics();
    private static final LongAdder mouseRaw = new LongAdder();
    private static final LongAdder mouseFlush = new LongAdder();
    private static final LongAdder mouseRawDx = new LongAdder();
    private static final LongAdder mouseRawDy = new LongAdder();
    private static final LongAdder mouseFlushDx = new LongAdder();
    private static final LongAdder mouseFlushDy = new LongAdder();
    private static final LongAdder injectOk = new LongAdder();
    private static final LongAdder injectFail = new LongAdder();
    private static final LongAdder injectNsSum = new LongAdder();
    private static final AtomicLong injectNsMax = new AtomicLong(0);
    private static final LongAdder injectMoveOk = new LongAdder();
    private static final LongAdder injectMoveFail = new LongAdder();
    private static final LongAdder injectDownOk = new LongAdder();
    private static final LongAdder injectDownFail = new LongAdder();
    private static final LongAdder injectUpOk = new LongAdder();
    private static final LongAdder injectUpFail = new LongAdder();
    private static final LongAdder clickLatNsSum = new LongAdder();
    private static final LongAdder clickLatCount = new LongAdder();
    private static final AtomicLong clickLatNsMax = new AtomicLong(0);
    private static final AtomicLong clickLatNsLast = new AtomicLong(0);
    private static final LongAdder maxActiveRej = new LongAdder();
    private static final LongAdder tapIdExhaust = new LongAdder();
    private static final LongAdder aimLoopTicks = new LongAdder();
    private static final LongAdder readerSyn = new LongAdder();
    private static final LongAdder flushForcado = new LongAdder();
    private static final LongAdder applyDelta = new LongAdder();
    private static final LongAdder applyDeltaZero = new LongAdder();
    private static final LongAdder keyEvents = new LongAdder();

    private InjectionMetrics() {
    }

    private final void atualizarMax(AtomicLong atomicLong, long j) {
        long j2 = atomicLong.get();
        while (j > j2 && !atomicLong.compareAndSet(j2, j)) {
            j2 = atomicLong.get();
        }
    }

    public final void onAimLoopTick() {
        aimLoopTicks.increment();
    }

    public final void onApplyDelta(int i, int i2, float f, float f2) {
        applyDelta.increment();
        if (f == TouchPipeline.SIZE && f2 == TouchPipeline.SIZE) {
            if (i == 0 && i2 == 0) {
                return;
            }
            applyDeltaZero.increment();
        }
    }

    public final void onClickLatency(long j) {
        if (j < 0) {
            return;
        }
        clickLatNsSum.add(j);
        clickLatCount.increment();
        clickLatNsLast.set(j);
        atualizarMax(clickLatNsMax, j);
    }

    public final void onFlushForcado() {
        flushForcado.increment();
    }

    public final void onInject(int i, boolean z, long j) {
        (z ? injectOk : injectFail).increment();
        if (j > 0) {
            injectNsSum.add(j);
            atualizarMax(injectNsMax, j);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (z) {
                        injectMoveOk.increment();
                        return;
                    } else {
                        injectMoveFail.increment();
                        return;
                    }
                }
                if (i != 5) {
                    if (i != 6) {
                        return;
                    }
                }
            }
            if (z) {
                injectUpOk.increment();
                return;
            } else {
                injectUpFail.increment();
                return;
            }
        }
        if (z) {
            injectDownOk.increment();
        } else {
            injectDownFail.increment();
        }
    }

    public final void onKeyEvent() {
        keyEvents.increment();
    }

    public final void onMaxActiveReject() {
        maxActiveRej.increment();
    }

    public final void onMouseFlush(int i, int i2) {
        mouseFlush.increment();
        mouseFlushDx.add(Math.abs(i));
        mouseFlushDy.add(Math.abs(i2));
    }

    public final void onMouseRaw(int i, int i2) {
        mouseRaw.increment();
        mouseRawDx.add(Math.abs(i));
        mouseRawDy.add(Math.abs(i2));
    }

    public final void onReaderSyn() {
        readerSyn.increment();
    }

    public final void onTapIdExhaust() {
        tapIdExhaust.increment();
    }

    public final long[] snapshot(int i, boolean z, boolean z2, boolean z3, int i2) {
        return new long[]{5, System.nanoTime(), i, mouseRaw.sum(), mouseFlush.sum(), mouseRawDx.sum(), mouseRawDy.sum(), mouseFlushDx.sum(), mouseFlushDy.sum(), z ? 1L : 0L, injectOk.sum(), injectFail.sum(), injectNsSum.sum(), injectNsMax.get(), injectMoveOk.sum(), injectMoveFail.sum(), injectDownOk.sum(), injectDownFail.sum(), injectUpOk.sum(), injectUpFail.sum(), clickLatNsSum.sum(), clickLatCount.sum(), clickLatNsMax.get(), clickLatNsLast.get(), z2 ? 1L : 0L, z3 ? 1L : 0L, maxActiveRej.sum(), tapIdExhaust.sum(), aimLoopTicks.sum(), readerSyn.sum(), flushForcado.sum(), applyDelta.sum(), applyDeltaZero.sum(), keyEvents.sum(), i2};
    }
}
