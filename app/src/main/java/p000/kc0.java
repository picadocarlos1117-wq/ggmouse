package p000;

import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.hud.FpsViewHudView;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc0 implements ch0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5747b;

    public /* synthetic */ kc0(Object obj, int i) {
        this.f5746a = i;
        this.f5747b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[LOOP:0: B:36:0x009a->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0107 A[LOOP:2: B:52:0x00d7->B:63:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0061 A[SYNTHETIC] */
    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        bc1 bc1Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        Object obj3;
        int i = this.f5746a;
        Object obj4 = this.f5747b;
        switch (i) {
            case 0:
                return FloatingService.registrarCallbacksDaemon$lambda$16((FloatingService) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 1:
                return FloatingService.aplicarModoEdicao$lambda$79((FpsViewHudView) obj4, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 2:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) obj4, obj, (Throwable) obj2);
            case 3:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) obj4, ((Integer) obj).intValue(), (InterfaceC1382ru) obj2));
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iM7370J0 = zv1.m7370J0(charSequence, (char[]) obj4, iIntValue);
                if (iM7370J0 < 0) {
                    return null;
                }
                return new bc1(Integer.valueOf(iM7370J0), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                List list = (List) obj4;
                if (list.size() == 1) {
                    List list2 = list;
                    if (list2 instanceof List) {
                        List list3 = list2;
                        int size = list3.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            f40.m2713i("List has more than one element.");
                            return null;
                        }
                        obj3 = list3.get(0);
                    } else {
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next3 = it.next();
                        if (it.hasNext()) {
                            f40.m2713i("Collection has more than one element.");
                            return null;
                        }
                        obj3 = next3;
                    }
                    String str5 = (String) obj3;
                    int iM7369I0 = zv1.m7369I0(charSequence2, str5, iIntValue2, false, 4);
                    if (iM7369I0 < 0) {
                        bc1Var = null;
                    } else {
                        bc1Var = new bc1(Integer.valueOf(iM7369I0), str5);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    co0 co0Var = new co0(iIntValue2, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i2 = co0Var.f1010c;
                    int i3 = co0Var.f1009b;
                    if (z) {
                        if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                            bc1Var = null;
                        } else {
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        bc1Var = new bc1(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i3) {
                                        iIntValue2 += i2;
                                    } else {
                                        bc1Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence2, iIntValue2, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    bc1Var = new bc1(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                } else {
                                    bc1Var = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                        bc1Var = null;
                    } else {
                        while (true) {
                            Iterator it3 = list.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    bc1Var = new bc1(Integer.valueOf(iIntValue2), str);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                } else {
                                    bc1Var = null;
                                }
                            } while (!zv1.m7375O0(str2, charSequence2, iIntValue2, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                bc1Var = new bc1(Integer.valueOf(iIntValue2), str);
                            } else if (iIntValue2 != i3) {
                                iIntValue2 += i2;
                            } else {
                                bc1Var = null;
                            }
                        }
                    }
                }
                if (bc1Var != null) {
                    return new bc1(bc1Var.f1292a, Integer.valueOf(((String) bc1Var.f1293b).length()));
                }
                return null;
        }
    }
}
