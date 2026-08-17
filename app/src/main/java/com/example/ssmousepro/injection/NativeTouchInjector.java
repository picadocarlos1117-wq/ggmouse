package com.example.ssmousepro.injection;

import android.util.Log;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.AbstractC1064la;
import p000.AbstractC1279p1;
import p000.AbstractC1337qm;
import p000.AbstractC1599xp;
import p000.C0694gy;
import p000.bc1;
import p000.p32;
import p000.q60;
import p000.ri1;
import p000.y60;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeTouchInjector {
    private static final int MAX_ACTIVE = 10;
    private static final String TAG = "NativeTouchInjector";
    private static volatile boolean aberto;
    private static volatile int alturaAberta;
    private static volatile int larguraAberta;
    private static final TreeSet<Integer> pointerIdsLivres;
    private static volatile int screenH;
    private static volatile int screenW;
    public static final NativeTouchInjector INSTANCE = new NativeTouchInjector();
    private static RotacaoAbs rotacao = RotacaoAbs.ROT_90;
    private static final Object lock = new Object();
    private static final TreeSet<Integer> activeIds = new TreeSet<>();
    private static final SparseArray<Finger> fingers = new SparseArray<>(10);
    private static final SparseArray<Integer> pointerIdPorPapel = new SparseArray<>(10);

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Finger {

        /* JADX INFO: renamed from: x */
        private float f1915x;

        /* JADX INFO: renamed from: y */
        private float f1916y;

        public Finger(float f, float f2) {
            this.f1915x = f;
            this.f1916y = f2;
        }

        public static /* synthetic */ Finger copy$default(Finger finger, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = finger.f1915x;
            }
            if ((i & 2) != 0) {
                f2 = finger.f1916y;
            }
            return finger.copy(f, f2);
        }

        public final float component1() {
            return this.f1915x;
        }

        public final float component2() {
            return this.f1916y;
        }

        public final Finger copy(float f, float f2) {
            return new Finger(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finger)) {
                return false;
            }
            Finger finger = (Finger) obj;
            return Float.compare(this.f1915x, finger.f1915x) == 0 && Float.compare(this.f1916y, finger.f1916y) == 0;
        }

        public final float getX() {
            return this.f1915x;
        }

        public final float getY() {
            return this.f1916y;
        }

        public int hashCode() {
            return Float.hashCode(this.f1916y) + (Float.hashCode(this.f1915x) * 31);
        }

        public final void setX(float f) {
            this.f1915x = f;
        }

        public final void setY(float f) {
            this.f1916y = f;
        }

        public String toString() {
            return "Finger(x=" + this.f1915x + ", y=" + this.f1916y + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum RotacaoAbs {
        NENHUMA,
        ROT_90,
        ROT_270;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RotacaoAbs.values().length];
            try {
                iArr[RotacaoAbs.NENHUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RotacaoAbs.ROT_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RotacaoAbs.ROT_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        TreeSet<Integer> treeSet = new TreeSet<>();
        AbstractC1599xp.m6946p0(p32.m5178l0(0, 10), treeSet);
        pointerIdsLivres = treeSet;
    }

    private NativeTouchInjector() {
    }

    private final RotacaoAbs escolherRotacao(int i, int i2, int i3, int i4) {
        boolean z = i >= i2;
        boolean z2 = i3 >= i4;
        if (z == z2) {
            return RotacaoAbs.NENHUMA;
        }
        return (!z || z2) ? RotacaoAbs.NENHUMA : RotacaoAbs.ROT_90;
    }

    private final void liberarExcetoLocked(Set<Integer> set) {
        if (!aberto) {
            activeIds.clear();
            fingers.clear();
            pointerIdPorPapel.clear();
            TreeSet<Integer> treeSet = pointerIdsLivres;
            treeSet.clear();
            AbstractC1599xp.m6946p0(p32.m5178l0(0, 10), treeSet);
            return;
        }
        Iterator it = new TreeSet((SortedSet) activeIds).descendingSet().iterator();
        it.getClass();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (!set.contains(num)) {
                SparseArray<Integer> sparseArray = pointerIdPorPapel;
                num.getClass();
                Integer num2 = sparseArray.get(num.intValue());
                if (num2 != null) {
                    SsproTouchNative.nativeTouchUp(num2.intValue());
                    soltarSlotLocked(num.intValue());
                }
            }
        }
    }

    private final void liberarTudoLocked() {
        liberarExcetoLocked(q60.f9397a);
    }

    private final boolean moverLocked(int i, float f, float f2) {
        Finger finger;
        if (!aberto || !activeIds.contains(Integer.valueOf(i)) || (finger = fingers.get(i)) == null) {
            return false;
        }
        finger.setX(f);
        finger.setY(f2);
        Integer num = pointerIdPorPapel.get(i);
        if (num != null) {
            int iIntValue = num.intValue();
            bc1 bc1VarParaAbs = paraAbs(f, f2);
            return SsproTouchNative.nativeTouchMove(iIntValue, ((Number) bc1VarParaAbs.f1292a).intValue(), ((Number) bc1VarParaAbs.f1293b).intValue());
        }
        return false;
    }

    private final bc1 paraAbs(float f, float f2) {
        int i = screenW;
        if (i < 1) {
            i = 1;
        }
        int i2 = screenH;
        if (i2 < 1) {
            i2 = 1;
        }
        int i3 = larguraAberta;
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = alturaAberta;
        if (i4 < 1) {
            i4 = 1;
        }
        float fM5139E = p32.m5139E(f, TouchPipeline.SIZE, i - 1);
        float fM5139E2 = p32.m5139E(f2, TouchPipeline.SIZE, i2 - 1);
        int i5 = WhenMappings.$EnumSwitchMapping$0[rotacao.ordinal()];
        if (i5 == 1) {
            return new bc1(Integer.valueOf(p32.m5140F((int) ((fM5139E * i3) / i), 0, i3 - 1)), Integer.valueOf(p32.m5140F((int) ((fM5139E2 * i4) / i2), 0, i4 - 1)));
        }
        if (i5 == 2) {
            int i6 = i3 - 1;
            return new bc1(Integer.valueOf(p32.m5140F((int) (i6 - ((fM5139E2 * i3) / i2)), 0, i6)), Integer.valueOf(p32.m5140F((int) ((fM5139E * i4) / i), 0, i4 - 1)));
        }
        if (i5 != 3) {
            C0694gy.m3076b();
            return null;
        }
        int i7 = i4 - 1;
        return new bc1(Integer.valueOf(p32.m5140F((int) ((fM5139E2 * i3) / i2), 0, i3 - 1)), Integer.valueOf(p32.m5140F((int) (i7 - ((fM5139E * i4) / i)), 0, i7)));
    }

    private final void soltarSlotLocked(int i) {
        activeIds.remove(Integer.valueOf(i));
        fingers.remove(i);
        SparseArray<Integer> sparseArray = pointerIdPorPapel;
        Integer num = sparseArray.get(i);
        if (num != null) {
            pointerIdsLivres.add(Integer.valueOf(num.intValue()));
        }
        sparseArray.remove(i);
    }

    public final boolean disponivel() {
        return aberto && SsproTouchNative.INSTANCE.getLoaded();
    }

    public final boolean down(int i, float f, float f2) {
        boolean zNativeTouchDown;
        synchronized (lock) {
            try {
                zNativeTouchDown = false;
                if (aberto) {
                    TreeSet<Integer> treeSet = activeIds;
                    if (treeSet.contains(Integer.valueOf(i))) {
                        zNativeTouchDown = INSTANCE.moverLocked(i, f, f2);
                    } else if (treeSet.size() >= 10) {
                        InjectionMetrics.INSTANCE.onMaxActiveReject();
                    } else {
                        Integer numPollFirst = pointerIdsLivres.pollFirst();
                        if (numPollFirst != null) {
                            int iIntValue = numPollFirst.intValue();
                            treeSet.add(Integer.valueOf(i));
                            fingers.put(i, new Finger(f, f2));
                            pointerIdPorPapel.put(i, numPollFirst);
                            NativeTouchInjector nativeTouchInjector = INSTANCE;
                            bc1 bc1VarParaAbs = nativeTouchInjector.paraAbs(f, f2);
                            zNativeTouchDown = SsproTouchNative.nativeTouchDown(iIntValue, ((Number) bc1VarParaAbs.f1292a).intValue(), ((Number) bc1VarParaAbs.f1293b).intValue());
                            if (!zNativeTouchDown) {
                                nativeTouchInjector.soltarSlotLocked(i);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNativeTouchDown;
    }

    public final boolean estaAtivo(int i) {
        boolean zContains;
        synchronized (lock) {
            zContains = activeIds.contains(Integer.valueOf(i));
        }
        return zContains;
    }

    public final void fechar() {
        synchronized (lock) {
            try {
                INSTANCE.liberarTudoLocked();
                if (SsproTouchNative.INSTANCE.getLoaded() && SsproTouchNative.nativeTouchIsOpen()) {
                    SsproTouchNative.nativeTouchClose();
                }
                aberto = false;
                screenW = 0;
                screenH = 0;
                larguraAberta = 0;
                alturaAberta = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getAlturaAberta() {
        return alturaAberta;
    }

    public final int getLarguraAberta() {
        return larguraAberta;
    }

    public final int getScreenH() {
        return screenH;
    }

    public final int getScreenW() {
        return screenW;
    }

    public final bc1 jitterDown(float f, float f2, int i) {
        if (i <= 0) {
            return new bc1(Float.valueOf(f), Float.valueOf(f2));
        }
        int i2 = -i;
        int i3 = i + 1;
        AbstractC1279p1 abstractC1279p1 = ri1.f10057b;
        return new bc1(Float.valueOf(f + abstractC1279p1.mo5485f(i2, i3)), Float.valueOf(f2 + abstractC1279p1.mo5485f(i2, i3)));
    }

    public final void liberarExceto(int... iArr) {
        iArr.getClass();
        synchronized (lock) {
            INSTANCE.liberarExcetoLocked(AbstractC1064la.m4162w0(iArr));
        }
    }

    public final void liberarTudo() {
        synchronized (lock) {
            INSTANCE.liberarTudoLocked();
        }
    }

    public final boolean mover(int i, float f, float f2) {
        boolean zMoverLocked;
        synchronized (lock) {
            zMoverLocked = INSTANCE.moverLocked(i, f, f2);
        }
        return zMoverLocked;
    }

    public final boolean probeInject(int i, int i2) {
        boolean z = false;
        if (!aberto) {
            return false;
        }
        synchronized (lock) {
            bc1 bc1VarParaAbs = INSTANCE.paraAbs(i, i2);
            if (SsproTouchNative.nativeTouchDown(0, ((Number) bc1VarParaAbs.f1292a).intValue(), ((Number) bc1VarParaAbs.f1293b).intValue()) && SsproTouchNative.nativeTouchUp(0)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean tentarAbrir(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || !SsproTouchNative.INSTANCE.ensureLoaded()) {
            return false;
        }
        synchronized (lock) {
            try {
                NativeTouchInjector nativeTouchInjector = INSTANCE;
                nativeTouchInjector.liberarTudoLocked();
                if (SsproTouchNative.nativeTouchIsOpen()) {
                    SsproTouchNative.nativeTouchClose();
                }
                screenW = 0;
                screenH = 0;
                larguraAberta = 0;
                alturaAberta = 0;
                rotacao = nativeTouchInjector.escolherRotacao(i, i2, i3, i4);
                boolean zNativeTouchOpen = SsproTouchNative.nativeTouchOpen(i3, i4, 10);
                aberto = zNativeTouchOpen;
                if (!zNativeTouchOpen) {
                    Log.w(TAG, "nativeTouchOpen falhou abs=" + i3 + "x" + i4);
                    return false;
                }
                screenW = i;
                screenH = i2;
                larguraAberta = i3;
                alturaAberta = i4;
                bc1 bc1VarParaAbs = nativeTouchInjector.paraAbs(i / 2.0f, i2 / 2.0f);
                if (SsproTouchNative.nativeTouchDown(0, ((Number) bc1VarParaAbs.f1292a).intValue(), ((Number) bc1VarParaAbs.f1293b).intValue()) && SsproTouchNative.nativeTouchUp(0)) {
                    Objects.toString(rotacao);
                    return true;
                }
                Log.w(TAG, "probe uinput falhou — fechando");
                SsproTouchNative.nativeTouchClose();
                aberto = false;
                screenW = 0;
                screenH = 0;
                larguraAberta = 0;
                alturaAberta = 0;
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: up */
    public final boolean m1585up(int i) {
        boolean zNativeTouchUp;
        Integer num;
        synchronized (lock) {
            zNativeTouchUp = false;
            if (aberto && activeIds.contains(Integer.valueOf(i)) && (num = pointerIdPorPapel.get(i)) != null) {
                zNativeTouchUp = SsproTouchNative.nativeTouchUp(num.intValue());
                INSTANCE.soltarSlotLocked(i);
            }
        }
        return zNativeTouchUp;
    }
}
