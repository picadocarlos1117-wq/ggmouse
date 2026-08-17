package p000;

import com.example.ssmousepro.injection.InputDeviceReader;
import com.example.ssmousepro.injection.InputInjectionEngine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: renamed from: dq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0575dq implements ch0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2993a;

    public /* synthetic */ C0575dq(int i) {
        this.f2993a = i;
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        C0612eq c0612eq;
        switch (this.f2993a) {
            case 0:
                String str = (String) obj;
                InterfaceC1382ru interfaceC1382ru = (InterfaceC1382ru) obj2;
                str.getClass();
                interfaceC1382ru.getClass();
                if (str.length() == 0) {
                    return interfaceC1382ru.toString();
                }
                return str + ", " + interfaceC1382ru;
            case 1:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 2:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            case 3:
                InterfaceC1456tu interfaceC1456tu = (InterfaceC1456tu) obj;
                InterfaceC1382ru interfaceC1382ru2 = (InterfaceC1382ru) obj2;
                interfaceC1456tu.getClass();
                interfaceC1382ru2.getClass();
                InterfaceC1456tu interfaceC1456tuMinusKey = interfaceC1456tu.minusKey(interfaceC1382ru2.getKey());
                k60 k60Var = k60.f5681a;
                if (interfaceC1456tuMinusKey == k60Var) {
                    return interfaceC1382ru2;
                }
                bz1 bz1Var = bz1.f1578c;
                InterfaceC0653fu interfaceC0653fu = (InterfaceC0653fu) interfaceC1456tuMinusKey.get(bz1Var);
                if (interfaceC0653fu == null) {
                    c0612eq = new C0612eq(interfaceC1456tuMinusKey, interfaceC1382ru2);
                } else {
                    InterfaceC1456tu interfaceC1456tuMinusKey2 = interfaceC1456tuMinusKey.minusKey(bz1Var);
                    if (interfaceC1456tuMinusKey2 == k60Var) {
                        return new C0612eq(interfaceC1382ru2, interfaceC0653fu);
                    }
                    c0612eq = new C0612eq(new C0612eq(interfaceC1456tuMinusKey2, interfaceC1382ru2), interfaceC0653fu);
                }
                return c0612eq;
            case 4:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (InterfaceC1382ru) obj2));
            case 5:
                return CoroutineContextKt.foldCopies$lambda$2((InterfaceC1456tu) obj, (InterfaceC1382ru) obj2);
            case 6:
                return InputDeviceReader._init_$lambda$0(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 7:
                return InputInjectionEngine.initialize$lambda$0(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 8:
                return InputInjectionEngine.iniciarLeituraTeclado$lambda$8(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 9:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (InterfaceC1382ru) obj2));
            case 10:
                return ThreadContextKt.countAll$lambda$0(obj, (InterfaceC1382ru) obj2);
            default:
                return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (InterfaceC1382ru) obj2);
        }
    }
}
