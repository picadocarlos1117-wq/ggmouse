package com.example.ssmousepro;

import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC1377rp;
import p000.AbstractC1451tp;
import p000.ey0;
import p000.gw1;
import p000.jd0;
import p000.qo0;
import p000.wy0;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class LinuxKeyCodes {
    public static final LinuxKeyCodes INSTANCE;
    private static final Map<String, Integer> mapa;

    static {
        Integer numValueOf = Integer.valueOf(LinuxInputConstants.BTN_MOUSE);
        INSTANCE = new LinuxKeyCodes();
        ey0 ey0Var = new ey0(8);
        int[] iArr = {30, 48, 46, 32, 18, 33, 34, 35, 23, 36, 37, 38, 50, 49, 24, 25, 16, 19, 31, 20, 22, 47, 17, 45, 21, 44};
        int i = 0;
        int i2 = 0;
        while (i < "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length()) {
            ey0Var.put(String.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i)), Integer.valueOf(iArr[i2]));
            i++;
            i2++;
        }
        ey0Var.put("1", 2);
        ey0Var.put("2", 3);
        ey0Var.put("3", 4);
        ey0Var.put("4", 5);
        ey0Var.put("5", 6);
        ey0Var.put("6", 7);
        ey0Var.put("7", 8);
        ey0Var.put("8", 9);
        ey0Var.put("9", 10);
        ey0Var.put("0", 11);
        int[] iArr2 = {59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 87, 88};
        for (int i3 = 1; i3 < 13; i3++) {
            ey0Var.put(jd0.m3609g(i3, "F"), Integer.valueOf(iArr2[i3 - 1]));
        }
        ey0Var.put("Espaço", 57);
        ey0Var.put("Enter", 28);
        ey0Var.put("Tab", 15);
        ey0Var.put("Shift", 42);
        ey0Var.put("Ctrl", 29);
        ey0Var.put("Alt", 56);
        ey0Var.put("Esc", 1);
        ey0Var.put("Insert", 110);
        ey0Var.put("Delete", 111);
        ey0Var.put("Home", Integer.valueOf(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY));
        ey0Var.put("End", 107);
        ey0Var.put("PgUp", Integer.valueOf(LocationRequest.PRIORITY_LOW_POWER));
        ey0Var.put("PgDn", 109);
        ey0Var.put("Mouse[272]", numValueOf);
        ey0Var.put("Mouse[273]", 273);
        ey0Var.put("Mouse[274]", 274);
        ey0Var.put("Mouse Esq", numValueOf);
        ey0Var.put("Mouse Dir", 273);
        ey0Var.put("Mouse Meio", 274);
        ey0Var.put("Mouse Lat1", 275);
        ey0Var.put("Mouse Lat2", 276);
        ey0Var.put("Mouse Frente", 277);
        ey0Var.put("Mouse Voltar", 278);
        ey0Var.put("Voltar", 158);
        ey0Var.put("Avançar", 159);
        ey0Var.m2652b();
        ey0Var.f3493r = true;
        if (ey0Var.f3489n <= 0) {
            ey0Var = ey0.f3480s;
            ey0Var.getClass();
        }
        mapa = ey0Var;
    }

    private LinuxKeyCodes() {
    }

    public static /* synthetic */ String resolverTeclaHud$default(LinuxKeyCodes linuxKeyCodes, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return linuxKeyCodes.resolverTeclaHud(str, str2);
    }

    public final boolean ehBotaoMouse(int i) {
        return 272 <= i && i < 279;
    }

    public final boolean ehRotuloMouse(String str) {
        str.getClass();
        Integer numParaEvdev = paraEvdev(zv1.m7383W0(str).toString());
        if (numParaEvdev != null) {
            return ehBotaoMouse(numParaEvdev.intValue());
        }
        return false;
    }

    public final String nomeBotaoMouse(int i) {
        switch (i) {
            case LinuxInputConstants.BTN_MOUSE /* 272 */:
                return "Esq";
            case 273:
                return "Dir";
            case 274:
                return "Meio";
            case 275:
                return "Lat1";
            case 276:
                return "Lat2";
            case 277:
                return "Frente";
            case 278:
                return "Voltar";
            default:
                return "Btn";
        }
    }

    public final Integer paraEvdev(String str) {
        Integer numM3069z0;
        String str2;
        Integer numM3069z1;
        int iIntValue;
        String str3;
        Integer numM3069z2;
        str.getClass();
        String string = zv1.m7383W0(str).toString();
        if (string.length() != 0) {
            Pattern patternCompile = Pattern.compile("Mouse\\[(\\d+)]");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(string);
            matcher.getClass();
            qo0 qo0Var = !matcher.matches() ? null : new qo0(matcher, string);
            if (qo0Var != null && (str3 = (String) ((wy0) qo0Var.m5586I()).get(1)) != null && (numM3069z2 = gw1.m3069z0(str3)) != null) {
                int iIntValue2 = numM3069z2.intValue();
                if (INSTANCE.ehBotaoMouse(iIntValue2)) {
                    return Integer.valueOf(iIntValue2);
                }
            }
            Pattern patternCompile2 = Pattern.compile("Tecla\\[(\\d+)]");
            patternCompile2.getClass();
            Matcher matcher2 = patternCompile2.matcher(string);
            matcher2.getClass();
            qo0 qo0Var2 = !matcher2.matches() ? null : new qo0(matcher2, string);
            if (qo0Var2 != null && (str2 = (String) ((wy0) qo0Var2.m5586I()).get(1)) != null && (numM3069z1 = gw1.m3069z0(str2)) != null && (iIntValue = numM3069z1.intValue()) > 0) {
                return Integer.valueOf(iIntValue);
            }
            List listM7373M0 = zv1.m7373M0(string);
            ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM7373M0));
            Iterator it = listM7373M0.iterator();
            while (it.hasNext()) {
                arrayList.add(zv1.m7383W0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!zv1.m7371K0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() >= 2 && (numM3069z0 = gw1.m3069z0((String) AbstractC1377rp.m5874u0(arrayList2))) != null) {
                int iIntValue3 = numM3069z0.intValue();
                if (INSTANCE.ehBotaoMouse(iIntValue3) || (1 <= iIntValue3 && iIntValue3 < 256)) {
                    return Integer.valueOf(iIntValue3);
                }
            }
            Integer num = mapa.get(string);
            if (num != null) {
                return Integer.valueOf(num.intValue());
            }
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("lat1")) {
                return 275;
            }
            if (lowerCase.equals("lat2")) {
                return 276;
            }
        }
        return null;
    }

    public final String paraRotulo(int i) {
        Object next;
        if (ehBotaoMouse(i)) {
            return rotuloMouse(i);
        }
        Iterator<T> it = mapa.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Number) ((Map.Entry) next).getValue()).intValue() != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    public final String resolverTeclaHud(String str, String str2) {
        Integer numM3069z0;
        String str3;
        String string;
        String strResolverTeclaHud$default;
        String string2;
        str.getClass();
        if (str2 != null && (string2 = zv1.m7383W0(str2).toString()) != null) {
            if (zv1.m7371K0(string2)) {
                string2 = null;
            }
            if (string2 != null && INSTANCE.paraEvdev(string2) != null) {
                return string2;
            }
        }
        String string3 = zv1.m7383W0(str).toString();
        if (!zv1.m7371K0(string3) && !string3.equals("?")) {
            Pattern patternCompile = Pattern.compile("FPS\\s*\\[(.+)]", 66);
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(string3);
            matcher.getClass();
            int i = 0;
            qo0 qo0Var = !matcher.find(0) ? null : new qo0(matcher, string3);
            if (qo0Var != null && (str3 = (String) ((wy0) qo0Var.m5586I()).get(1)) != null && (string = zv1.m7383W0(str3).toString()) != null) {
                if (zv1.m7371K0(string) || string.equalsIgnoreCase("Aguardando Tecla")) {
                    string = null;
                }
                if (string != null && (strResolverTeclaHud$default = resolverTeclaHud$default(INSTANCE, string, null, 2, null)) != null) {
                    return strResolverTeclaHud$default;
                }
            }
            if (paraEvdev(string3) != null) {
                return string3;
            }
            List listM7373M0 = zv1.m7373M0(string3);
            ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM7373M0));
            Iterator it = listM7373M0.iterator();
            while (it.hasNext()) {
                arrayList.add(zv1.m7383W0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!zv1.m7371K0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() >= 2 && (numM3069z0 = gw1.m3069z0((String) AbstractC1377rp.m5874u0(arrayList2))) != null && ehBotaoMouse(numM3069z0.intValue())) {
                return rotuloMouse(numM3069z0.intValue());
            }
            string3.equalsIgnoreCase("Mouse");
        }
        return null;
    }

    public final String rotuloExibicaoHud(String str) {
        str.getClass();
        Integer numParaEvdev = paraEvdev(zv1.m7383W0(str).toString());
        if (numParaEvdev == null) {
            return zv1.m7383W0(str).toString();
        }
        int iIntValue = numParaEvdev.intValue();
        if (!ehBotaoMouse(iIntValue)) {
            return zv1.m7383W0(str).toString();
        }
        return nomeBotaoMouse(iIntValue) + "\n" + iIntValue;
    }

    public final String rotuloMouse(int i) {
        return jd0.m3610h(i, "Mouse[", "]");
    }

    public final String rotuloMouseDeActionButton(int i) {
        int i2;
        if (i == 1) {
            i2 = LinuxInputConstants.BTN_MOUSE;
        } else if (i == 2) {
            i2 = 273;
        } else if (i == 4) {
            i2 = 274;
        } else if (i == 8) {
            i2 = 278;
        } else {
            if (i != 16) {
                return null;
            }
            i2 = 277;
        }
        return rotuloMouse(i2);
    }

    public final String rotuloMouseDeButtonState(int i) {
        if ((i & 16) != 0) {
            return rotuloMouse(277);
        }
        if ((i & 8) != 0) {
            return rotuloMouse(278);
        }
        if ((i & 4) != 0) {
            return rotuloMouse(274);
        }
        if ((i & 2) != 0) {
            return rotuloMouse(273);
        }
        if ((i & 1) != 0) {
            return rotuloMouse(LinuxInputConstants.BTN_MOUSE);
        }
        return null;
    }

    public final String rotuloParaCaptura(int i, boolean z) {
        if (z || ehBotaoMouse(i)) {
            return rotuloMouse(i);
        }
        String strParaRotulo = paraRotulo(i);
        return strParaRotulo == null ? jd0.m3610h(i, "Tecla[", "]") : strParaRotulo;
    }
}
