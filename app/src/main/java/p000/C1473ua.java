package p000;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.TargetIndexMatcher;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: ua */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1473ua implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11228a;

    public /* synthetic */ C1473ua(int i) {
        this.f11228a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11228a) {
            case 0:
                return AsyncQueue.lambda$runDelayedTasksUntil$5((AsyncQueue.DelayedTask) obj, (AsyncQueue.DelayedTask) obj2);
            case 1:
                return ((be0) obj2).f1337j - ((be0) obj).f1337j;
            case 2:
                return Integer.compare(((C0023am) obj2).f268b, ((C0023am) obj).f268b);
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return Integer.compare(((u00) ((List) obj).get(0)).f11080f, ((u00) ((List) obj2).get(0)).f11080f);
            case 5:
                return ((t00) Collections.max((List) obj)).compareTo((t00) Collections.max((List) obj2));
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i = 8;
                int i2 = 9;
                return C1233oq.m5043f(c10.m1104c((c10) Collections.max(list, new C1473ua(i)), (c10) Collections.max(list2, new C1473ua(i)))).mo5044a(list.size(), list2.size()).mo5045b((c10) Collections.max(list, new C1473ua(i2)), (c10) Collections.max(list2, new C1473ua(i2)), new C1473ua(i2)).mo5048e();
            case 7:
                return ((z00) ((List) obj).get(0)).compareTo((z00) ((List) obj2).get(0));
            case 8:
                return c10.m1104c((c10) obj, (c10) obj2);
            case 9:
                c10 c10Var = (c10) obj;
                c10 c10Var2 = (c10) obj2;
                boolean z = c10Var.f1599e;
                int i3 = c10Var.f1604o;
                eb1 eb1VarMo2565a = (z && c10Var.f1602m) ? d10.f2702j : d10.f2702j.mo2565a();
                c10Var.f1600f.getClass();
                return AbstractC1341qq.f9556a.mo5045b(Integer.valueOf(c10Var.f1605p), Integer.valueOf(c10Var2.f1605p), eb1VarMo2565a).mo5045b(Integer.valueOf(i3), Integer.valueOf(c10Var2.f1604o), eb1VarMo2565a).mo5048e();
            case 10:
                return Document.lambda$static$0((Document) obj, (Document) obj2);
            case 11:
                return ((DocumentKey) obj).compareTo((DocumentKey) obj2);
            case 12:
                return FieldIndex.lambda$static$0((FieldIndex) obj, (FieldIndex) obj2);
            case 13:
                return FieldIndex.IndexOffset.lambda$static$0((MutableDocument) obj, (MutableDocument) obj2);
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 15:
                return ((ht1) obj).f4701a - ((ht1) obj2).f4701a;
            case 16:
                return Float.compare(((ht1) obj).f4703c, ((ht1) obj2).f4703c);
            case 17:
                gu1 gu1Var = (gu1) obj;
                gu1 gu1Var2 = (gu1) obj2;
                int iCompare = Integer.compare(gu1Var2.f4329b, gu1Var.f4329b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = gu1Var.f4330c.compareTo(gu1Var2.f4330c);
                return iCompareTo != 0 ? iCompareTo : gu1Var.f4331d.compareTo(gu1Var2.f4331d);
            case 18:
                gu1 gu1Var3 = (gu1) obj;
                gu1 gu1Var4 = (gu1) obj2;
                int iCompare2 = Integer.compare(gu1Var4.f4328a, gu1Var3.f4328a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = gu1Var4.f4330c.compareTo(gu1Var3.f4330c);
                return iCompareTo2 != 0 ? iCompareTo2 : gu1Var4.f4331d.compareTo(gu1Var3.f4331d);
            case 19:
                return TargetIndexMatcher.lambda$new$0((FieldFilter) obj, (FieldFilter) obj2);
            case 20:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 21:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 22:
                return Integer.compare(((k92) obj).f5722a.f6282b, ((k92) obj2).f5722a.f6282b);
            default:
                return Long.compare(((j92) obj).f5332b, ((j92) obj2).f5332b);
        }
    }
}
