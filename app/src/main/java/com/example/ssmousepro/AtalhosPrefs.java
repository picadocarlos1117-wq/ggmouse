package com.example.ssmousepro;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.AbstractC1414sp;
import p000.C0694gy;
import p000.bc1;
import p000.hp0;
import p000.jd0;
import p000.y60;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AtalhosPrefs {
    public static final AtalhosPrefs INSTANCE = new AtalhosPrefs();
    public static final String KEY_CONFIG = "atalho_config";
    public static final String KEY_DIGITAR = "atalho_digitar";
    public static final String KEY_EDITAR_HUD = "atalho_editar_hud";
    public static final String PREFS_NAME = "SSMousePrefs";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Acao {
        EDITAR_HUD,
        DIGITAR,
        CONFIG;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Snapshot {
        private final String config;
        private final String digitar;
        private final String editarHud;

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Acao.values().length];
                try {
                    iArr[Acao.EDITAR_HUD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Acao.DIGITAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Acao.CONFIG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Snapshot(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.editarHud = str;
            this.digitar = str2;
            this.config = str3;
        }

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = snapshot.editarHud;
            }
            if ((i & 2) != 0) {
                str2 = snapshot.digitar;
            }
            if ((i & 4) != 0) {
                str3 = snapshot.config;
            }
            return snapshot.copy(str, str2, str3);
        }

        public final Acao acaoParaCodigo(int i) {
            if (i <= 0) {
                return null;
            }
            Acao acao = Acao.EDITAR_HUD;
            Integer numCodigo = codigo(acao);
            if (numCodigo != null && numCodigo.intValue() == i) {
                return acao;
            }
            Acao acao2 = Acao.DIGITAR;
            Integer numCodigo2 = codigo(acao2);
            if (numCodigo2 != null && numCodigo2.intValue() == i) {
                return acao2;
            }
            Acao acao3 = Acao.CONFIG;
            Integer numCodigo3 = codigo(acao3);
            if (numCodigo3 != null && numCodigo3.intValue() == i) {
                return acao3;
            }
            return null;
        }

        public final Integer codigo(Acao acao) {
            acao.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[acao.ordinal()];
            if (i == 1) {
                return LinuxKeyCodes.INSTANCE.paraEvdev(this.editarHud);
            }
            if (i == 2) {
                return LinuxKeyCodes.INSTANCE.paraEvdev(this.digitar);
            }
            if (i == 3) {
                return LinuxKeyCodes.INSTANCE.paraEvdev(this.config);
            }
            C0694gy.m3076b();
            return null;
        }

        public final String comandoDaemon() {
            Integer numCodigo = codigo(Acao.EDITAR_HUD);
            int iIntValue = numCodigo != null ? numCodigo.intValue() : 0;
            Integer numCodigo2 = codigo(Acao.DIGITAR);
            int iIntValue2 = numCodigo2 != null ? numCodigo2.intValue() : 0;
            Integer numCodigo3 = codigo(Acao.CONFIG);
            int iIntValue3 = numCodigo3 != null ? numCodigo3.intValue() : 0;
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("ATALHOS ", iIntValue, " ", iIntValue2, " ");
            sbM5345l.append(iIntValue3);
            return sbM5345l.toString();
        }

        public final String component1() {
            return this.editarHud;
        }

        public final String component2() {
            return this.digitar;
        }

        public final String component3() {
            return this.config;
        }

        public final Snapshot copy(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new Snapshot(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) obj;
            return hp0.m3214e(this.editarHud, snapshot.editarHud) && hp0.m3214e(this.digitar, snapshot.digitar) && hp0.m3214e(this.config, snapshot.config);
        }

        public final String getConfig() {
            return this.config;
        }

        public final String getDigitar() {
            return this.digitar;
        }

        public final String getEditarHud() {
            return this.editarHud;
        }

        public int hashCode() {
            return this.config.hashCode() + AbstractC1308pu.m5336c(this.editarHud.hashCode() * 31, 31, this.digitar);
        }

        public final String textoUi(Acao acao) {
            String str;
            acao.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[acao.ordinal()];
            if (i == 1) {
                str = this.editarHud;
            } else if (i == 2) {
                str = this.digitar;
            } else {
                if (i != 3) {
                    C0694gy.m3076b();
                    return null;
                }
                str = this.config;
            }
            String string = zv1.m7383W0(str).toString();
            return zv1.m7371K0(string) ? "—" : string;
        }

        public String toString() {
            String str = this.editarHud;
            String str2 = this.digitar;
            return AbstractC1308pu.m5342i(jd0.m3618p("Snapshot(editarHud=", str, ", digitar=", str2, ", config="), this.config, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Acao.values().length];
            try {
                iArr[Acao.EDITAR_HUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Acao.DIGITAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Acao.CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AtalhosPrefs() {
    }

    public final Snapshot carregar(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        String string = sharedPreferences.getString(KEY_EDITAR_HUD, "");
        String string2 = string != null ? zv1.m7383W0(string).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = sharedPreferences.getString(KEY_DIGITAR, "");
        String string4 = string3 != null ? zv1.m7383W0(string3).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        String string5 = sharedPreferences.getString(KEY_CONFIG, "");
        String string6 = string5 != null ? zv1.m7383W0(string5).toString() : null;
        return new Snapshot(string2, string4, string6 != null ? string6 : "");
    }

    public final void limpar(Context context, Acao acao) {
        context.getClass();
        acao.getClass();
        salvar(context, acao, "");
    }

    public final String salvar(Context context, Acao acao, String str) {
        Snapshot snapshotCopy$default;
        String str2;
        Object obj;
        String str3;
        context.getClass();
        acao.getClass();
        str.getClass();
        String string = zv1.m7383W0(str).toString();
        if (string.length() > 0 && LinuxKeyCodes.INSTANCE.paraEvdev(string) == null) {
            return AbstractC1308pu.m5339f("Tecla não reconhecida: ", string);
        }
        Snapshot snapshotCarregar = carregar(context);
        int i = WhenMappings.$EnumSwitchMapping$0[acao.ordinal()];
        if (i == 1) {
            snapshotCopy$default = Snapshot.copy$default(snapshotCarregar, string, null, null, 6, null);
            str2 = string;
        } else if (i == 2) {
            str2 = string;
            snapshotCopy$default = Snapshot.copy$default(snapshotCarregar, null, str2, null, 5, null);
        } else {
            if (i != 3) {
                C0694gy.m3076b();
                return null;
            }
            snapshotCopy$default = Snapshot.copy$default(snapshotCarregar, null, null, string, 3, null);
            str2 = string;
        }
        if (str2.length() > 0) {
            Integer numParaEvdev = LinuxKeyCodes.INSTANCE.paraEvdev(str2);
            numParaEvdev.getClass();
            int iIntValue = numParaEvdev.intValue();
            List listM6124n0 = AbstractC1414sp.m6124n0(new bc1(Acao.EDITAR_HUD, snapshotCopy$default.getEditarHud()), new bc1(Acao.DIGITAR, snapshotCopy$default.getDigitar()), new bc1(Acao.CONFIG, snapshotCopy$default.getConfig()));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM6124n0) {
                bc1 bc1Var = (bc1) obj2;
                if (bc1Var.f1292a != acao && !zv1.m7371K0((CharSequence) bc1Var.f1293b)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i2);
                i2++;
                Integer numParaEvdev2 = LinuxKeyCodes.INSTANCE.paraEvdev((String) ((bc1) obj).f1293b);
                if (numParaEvdev2 != null && numParaEvdev2.intValue() == iIntValue) {
                    break;
                }
            }
            bc1 bc1Var2 = (bc1) obj;
            if (bc1Var2 != null) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[((Acao) bc1Var2.f1292a).ordinal()];
                if (i3 == 1) {
                    str3 = "Editar HUD";
                } else if (i3 == 2) {
                    str3 = "Digitar";
                } else {
                    if (i3 != 3) {
                        C0694gy.m3076b();
                        return null;
                    }
                    str3 = "Configurações";
                }
                return jd0.m3615m("Tecla já usada em “", str3, "”");
            }
        }
        context.getSharedPreferences(PREFS_NAME, 0).edit().putString(KEY_EDITAR_HUD, snapshotCopy$default.getEditarHud()).putString(KEY_DIGITAR, snapshotCopy$default.getDigitar()).putString(KEY_CONFIG, snapshotCopy$default.getConfig()).apply();
        return null;
    }
}
