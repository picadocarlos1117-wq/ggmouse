package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a51 {

    /* JADX INFO: renamed from: a */
    public static final char[] f61a;

    static {
        char[] cArr = new char[80];
        f61a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m82a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f61a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m83b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m83b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m83b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m82a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0680gk c0680gk = AbstractC0753ik.f5042b;
            sb.append(hr1.m3277m(new C0680gk(((String) obj).getBytes(no0.f7481a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0753ik) {
            sb.append(": \"");
            sb.append(hr1.m3277m((AbstractC0753ik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof fi0) {
            sb.append(" {");
            m84c((fi0) obj, sb, i + 2);
            sb.append("\n");
            m82a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m83b(sb, i3, "key", entry.getKey());
        m83b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m82a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX INFO: renamed from: c */
    public static void m84c(fi0 fi0Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = fi0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m83b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), fi0.invokeOrDie(method2, fi0Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m83b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), fi0.invokeOrDie(method, fi0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = fi0.invokeOrDie(method4, fi0Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            if (((Integer) objInvokeOrDie).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof AbstractC0753ik) {
                            zEquals = objInvokeOrDie.equals(AbstractC0753ik.f5042b);
                        } else if (!(objInvokeOrDie instanceof y41) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((y41) objInvokeOrDie).getDefaultInstanceForType()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) fi0.invokeOrDie(method5, fi0Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m83b(sb, i, strSubstring, objInvokeOrDie);
                    }
                }
            }
            i2 = i3;
        }
        a42 a42Var = fi0Var.unknownFields;
        if (a42Var != null) {
            for (int i5 = 0; i5 < a42Var.f45a; i5++) {
                m83b(sb, i, String.valueOf(a42Var.f46b[i5] >>> 3), a42Var.f47c[i5]);
            }
        }
    }
}
