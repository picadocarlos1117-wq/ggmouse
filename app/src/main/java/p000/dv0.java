package p000;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dv0 extends av0 {

    /* JADX INFO: renamed from: a */
    public final ms0 f3024a;

    /* JADX INFO: renamed from: b */
    public final cv0 f3025b;

    public dv0(ms0 ms0Var, v72 v72Var) {
        this.f3024a = ms0Var;
        this.f3025b = (cv0) new pn0(v72Var, cv0.f2642d).m5287h(cv0.class);
    }

    /* JADX INFO: renamed from: b */
    public final void m2390b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cv0 cv0Var = this.f3025b;
        if (cv0Var.f2643b.f5534c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            ju1 ju1Var = cv0Var.f2643b;
            if (i >= ju1Var.f5534c) {
                return;
            }
            bv0 bv0Var = (bv0) ju1Var.f5533b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cv0Var.f2643b.f5532a[i]);
            printWriter.print(": ");
            printWriter.println(bv0Var.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bv0Var.f1557l);
            bv0Var.f1557l.dump(str2.concat("  "), fileDescriptor, printWriter, strArr);
            if (bv0Var.f1559n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bv0Var.f1559n);
                C1548wb c1548wb = bv0Var.f1559n;
                String strConcat = str2.concat("  ");
                c1548wb.getClass();
                printWriter.print(strConcat);
                printWriter.print("mDeliveredData=");
                printWriter.println(c1548wb.f12046b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            yu0 yu0Var = bv0Var.f1557l;
            Object obj = bv0Var.f4709e;
            printWriter.println(yu0Var.dataToString(obj != hu0.f4704k ? obj : null));
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bv0Var.f4707c > 0);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f3024a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
