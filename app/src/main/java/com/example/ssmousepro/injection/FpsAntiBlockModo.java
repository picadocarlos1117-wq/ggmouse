package com.example.ssmousepro.injection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC1337qm;
import p000.AbstractC1451tp;
import p000.AbstractC1571wy;
import p000.hp0;
import p000.y60;
import p000.zv1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.example.ssmousepro.injection.FpsAntiBlockModo, still in use, count: 1, list:
  (r0v0 com.example.ssmousepro.injection.FpsAntiBlockModo) from 0x0044: SPUT (r0v0 com.example.ssmousepro.injection.FpsAntiBlockModo) (LINE:69) com.example.ssmousepro.injection.FpsAntiBlockModo.DESLIGADO com.example.ssmousepro.injection.FpsAntiBlockModo
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsAntiBlockModo {
    public static final FpsAntiBlockModo SS_MOUSE = new FpsAntiBlockModo("SS_MOUSE", "SS Mouse");
    public static final FpsAntiBlockModo GG_MOUSE = new FpsAntiBlockModo("GG_MOUSE", "GG Mouse");
    public static final FpsAntiBlockModo BLUESTACKS = new FpsAntiBlockModo("BLUESTACKS", "BlueStacks");
    public static final FpsAntiBlockModo SSPRO = new FpsAntiBlockModo("SSPRO", "SSPro");

    private static final /* synthetic */ y60 $ENTRIES;
    public static final Companion Companion;
    private static final FpsAntiBlockModo DESLIGADO;
    private static final FpsAntiBlockModo OFICIAL;
    private static final FpsAntiBlockModo PADRAO;

    /* JADX INFO: renamed from: id */
    private final String f1907id;
    private final String rotuloUi;

    static {
        FpsAntiBlockModo fpsAntiBlockModo = SSPRO;
        $ENTRIES = AbstractC1337qm.m5553p(values());
        Companion = new Companion(null);
        DESLIGADO = new FpsAntiBlockModo("SS_MOUSE", "SS Mouse");
        OFICIAL = fpsAntiBlockModo;
        PADRAO = fpsAntiBlockModo;
    }

    private FpsAntiBlockModo(String str, String str2) {
        super(str, i);
        this.f1907id = str;
        this.rotuloUi = str2;
    }

    public static y60 getEntries() {
        return $ENTRIES;
    }

    public static FpsAntiBlockModo valueOf(String str) {
        return (FpsAntiBlockModo) Enum.valueOf(FpsAntiBlockModo.class, str);
    }

    public static FpsAntiBlockModo[] values() {
        return (FpsAntiBlockModo[]) $VALUES.clone();
    }

    public final boolean getFixacaoImediata() {
        return this == BLUESTACKS || this == SSPRO;
    }

    public final String getId() {
        return this.f1907id;
    }

    public final String getRotuloUi() {
        return this.rotuloUi;
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final FpsAntiBlockModo fromId(String str) {
            String upperCase;
            String string;
            Object obj = null;
            if (str == null || (string = zv1.m7383W0(str).toString()) == null) {
                upperCase = null;
            } else {
                upperCase = string.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            }
            if (upperCase == null) {
                upperCase = "";
            }
            for (Object obj2 : FpsAntiBlockModo.getEntries()) {
                if (hp0.m3214e(((FpsAntiBlockModo) obj2).getId(), upperCase)) {
                    obj = obj2;
                    break;
                }
            }
            FpsAntiBlockModo fpsAntiBlockModo = (FpsAntiBlockModo) obj;
            return fpsAntiBlockModo == null ? getPADRAO() : fpsAntiBlockModo;
        }

        public final FpsAntiBlockModo fromUiIndex(int i) {
            y60 entries = FpsAntiBlockModo.getEntries();
            return (FpsAntiBlockModo) ((i < 0 || i >= entries.size()) ? FpsAntiBlockModo.Companion.getPADRAO() : entries.get(i));
        }

        public final FpsAntiBlockModo getDESLIGADO() {
            return FpsAntiBlockModo.DESLIGADO;
        }

        public final FpsAntiBlockModo getOFICIAL() {
            return FpsAntiBlockModo.OFICIAL;
        }

        public final FpsAntiBlockModo getPADRAO() {
            return FpsAntiBlockModo.PADRAO;
        }

        public final String[] rotulosUi() {
            y60 entries = FpsAntiBlockModo.getEntries();
            ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(entries));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((FpsAntiBlockModo) it.next()).getRotuloUi());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        private Companion() {
        }
    }
}
