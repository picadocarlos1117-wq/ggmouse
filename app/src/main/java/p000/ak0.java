package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253a = 0;

    /* JADX INFO: renamed from: b */
    public final String[] f254b;

    public ak0(zj0 zj0Var) {
        ArrayList arrayList = zj0Var.f13431b;
        this.f254b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String toString() {
        switch (this.f253a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String[] strArr = this.f254b;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String str = null;
                    sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
                    sb.append(": ");
                    int i3 = i2 + 1;
                    if (i3 >= 0 && i3 < strArr.length) {
                        str = strArr[i3];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ak0(String[] strArr) {
        this.f254b = strArr;
    }
}
