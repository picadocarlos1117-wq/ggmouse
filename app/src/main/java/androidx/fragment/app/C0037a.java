package androidx.fragment.app;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
import p000.ca0;
import p000.f40;
import p000.ff0;
import p000.nf0;
import p000.of0;
import p000.pf0;
import p000.wv0;
import p000.xe0;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0037a extends pf0 implements ff0 {

    /* JADX INFO: renamed from: p */
    public final AbstractC0056t f657p;

    /* JADX INFO: renamed from: q */
    public boolean f658q;

    /* JADX INFO: renamed from: r */
    public int f659r;

    public C0037a(AbstractC0056t abstractC0056t) {
        abstractC0056t.m370E();
        xe0 xe0Var = abstractC0056t.f731t;
        if (xe0Var != null) {
            xe0Var.f12589b.getClassLoader();
        }
        this.f8873a = new ArrayList();
        this.f8887o = false;
        this.f659r = -1;
        this.f657p = abstractC0056t;
    }

    @Override // p000.ff0
    /* JADX INFO: renamed from: a */
    public final boolean mo330a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0056t.m363G(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8879g) {
            return true;
        }
        AbstractC0056t abstractC0056t = this.f657p;
        if (abstractC0056t.f715d == null) {
            abstractC0056t.f715d = new ArrayList();
        }
        abstractC0056t.f715d.add(this);
        return true;
    }

    @Override // p000.pf0
    /* JADX INFO: renamed from: c */
    public final void mo331c(int i, AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, String str, int i2) {
        String str2 = abstractComponentCallbacksC0048l.mPreviousWho;
        if (str2 != null) {
            nf0.m4541c(abstractComponentCallbacksC0048l, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0048l.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            ca0.m1187s("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0048l.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0048l);
                String str4 = abstractComponentCallbacksC0048l.mTag;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC0048l.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                ca0.m1182n("Can't add fragment ", abstractComponentCallbacksC0048l, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = abstractComponentCallbacksC0048l.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC0048l);
                int i4 = abstractComponentCallbacksC0048l.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC0048l.mFragmentId = i;
            abstractComponentCallbacksC0048l.mContainerId = i;
        }
        m5255b(new of0(abstractComponentCallbacksC0048l, i2));
        abstractComponentCallbacksC0048l.mFragmentManager = this.f657p;
    }

    /* JADX INFO: renamed from: d */
    public final void m332d(int i) {
        ArrayList arrayList = this.f8873a;
        if (this.f8879g) {
            if (AbstractC0056t.m363G(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                of0 of0Var = (of0) arrayList.get(i2);
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = of0Var.f7773b;
                if (abstractComponentCallbacksC0048l != null) {
                    abstractComponentCallbacksC0048l.mBackStackNesting += i;
                    if (AbstractC0056t.m363G(2)) {
                        Objects.toString(of0Var.f7773b);
                        int i3 = of0Var.f7773b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m333e(boolean z) {
        if (this.f658q) {
            f40.m2719o("commit already called");
            return 0;
        }
        if (AbstractC0056t.m363G(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new wv0());
            m334f("  ", printWriter, true);
            printWriter.close();
        }
        this.f658q = true;
        boolean z2 = this.f8879g;
        AbstractC0056t abstractC0056t = this.f657p;
        if (z2) {
            this.f659r = abstractC0056t.f720i.getAndIncrement();
        } else {
            this.f659r = -1;
        }
        abstractC0056t.m410v(this, z);
        return this.f659r;
    }

    /* JADX INFO: renamed from: f */
    public final void m334f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.f8873a;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8880h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f659r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f658q);
            if (this.f8878f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8878f));
            }
            if (this.f8874b != 0 || this.f8875c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8874b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8875c));
            }
            if (this.f8876d != 0 || this.f8877e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8876d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8877e));
            }
            if (this.f8881i != 0 || this.f8882j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8881i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8882j);
            }
            if (this.f8883k != 0 || this.f8884l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8883k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8884l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            of0 of0Var = (of0) arrayList.get(i);
            switch (of0Var.f7772a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + of0Var.f7772a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(of0Var.f7773b);
            if (z) {
                if (of0Var.f7775d != 0 || of0Var.f7776e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(of0Var.f7775d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(of0Var.f7776e));
                }
                if (of0Var.f7777f != 0 || of0Var.f7778g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(of0Var.f7777f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(of0Var.f7778g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f659r >= 0) {
            sb.append(" #");
            sb.append(this.f659r);
        }
        if (this.f8880h != null) {
            sb.append(" ");
            sb.append(this.f8880h);
        }
        sb.append("}");
        return sb.toString();
    }
}
