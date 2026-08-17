package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 {

    /* JADX INFO: renamed from: f */
    public static final Class[] f13506f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f13507a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f13508b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f13509c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f13510d;

    /* JADX INFO: renamed from: e */
    public final gp1 f13511e;

    public zo1(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13507a = linkedHashMap;
        this.f13508b = new LinkedHashMap();
        this.f13509c = new LinkedHashMap();
        this.f13510d = new LinkedHashMap();
        this.f13511e = new C1489uq(this, 2);
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m7324a(zo1 zo1Var) {
        Map mapSingletonMap;
        LinkedHashMap linkedHashMap = zo1Var.f13507a;
        LinkedHashMap linkedHashMap2 = zo1Var.f13508b;
        linkedHashMap2.getClass();
        int size = linkedHashMap2.size();
        if (size == 0) {
            mapSingletonMap = o60.f7669a;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap2);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                bc1[] bc1VarArr = {new bc1("keys", arrayList), new bc1("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    bc1 bc1Var = bc1VarArr[i];
                    String str2 = (String) bc1Var.f1292a;
                    Object obj = bc1Var.f1293b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        AbstractC1445tj.m6283a(bundle, str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        AbstractC1482uj.m6494a(bundle, str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        AbstractC1482uj.m6495b(bundle, str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Bundle bundleMo359a = ((gp1) entry2.getValue()).mo359a();
            str3.getClass();
            if (bundleMo359a != null) {
                while (true) {
                    if (i >= 29) {
                        ca0.m1180l("Can't put value with type ", bundleMo359a.getClass(), " into saved state");
                        return null;
                    }
                    Class cls = f13506f[i];
                    cls.getClass();
                    if (cls.isInstance(bundleMo359a)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj2 = zo1Var.f13509c.get(str3);
            b71 b71Var = obj2 instanceof b71 ? (b71) obj2 : null;
            if (b71Var != null) {
                b71Var.mo939h(bundleMo359a);
            } else {
                linkedHashMap.put(str3, bundleMo359a);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) zo1Var.f13510d.get(str3);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(bundleMo359a);
            }
        }
    }

    public zo1() {
        this.f13507a = new LinkedHashMap();
        this.f13508b = new LinkedHashMap();
        this.f13509c = new LinkedHashMap();
        this.f13510d = new LinkedHashMap();
        this.f13511e = new C1489uq(this, 2);
    }
}
