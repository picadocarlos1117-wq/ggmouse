package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class a20 implements y10 {

    /* JADX INFO: renamed from: d */
    public final r92 f30d;

    /* JADX INFO: renamed from: f */
    public int f32f;

    /* JADX INFO: renamed from: g */
    public int f33g;

    /* JADX INFO: renamed from: a */
    public r92 f27a = null;

    /* JADX INFO: renamed from: b */
    public boolean f28b = false;

    /* JADX INFO: renamed from: c */
    public boolean f29c = false;

    /* JADX INFO: renamed from: e */
    public int f31e = 1;

    /* JADX INFO: renamed from: h */
    public int f34h = 1;

    /* JADX INFO: renamed from: i */
    public q20 f35i = null;

    /* JADX INFO: renamed from: j */
    public boolean f36j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f37k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f38l = new ArrayList();

    public a20(r92 r92Var) {
        this.f30d = r92Var;
    }

    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        ArrayList arrayList = this.f38l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((a20) obj).f36j) {
                return;
            }
        }
        this.f29c = true;
        r92 r92Var = this.f27a;
        if (r92Var != null) {
            r92Var.mo50a(this);
        }
        if (this.f28b) {
            this.f30d.mo50a(this);
            return;
        }
        int size2 = arrayList.size();
        a20 a20Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            a20 a20Var2 = (a20) obj2;
            if (!(a20Var2 instanceof q20)) {
                i++;
                a20Var = a20Var2;
            }
        }
        if (a20Var != null && i == 1 && a20Var.f36j) {
            q20 q20Var = this.f35i;
            if (q20Var != null) {
                if (!q20Var.f36j) {
                    return;
                } else {
                    this.f32f = this.f34h * q20Var.f33g;
                }
            }
            mo53d(a20Var.f33g + this.f32f);
        }
        r92 r92Var2 = this.f27a;
        if (r92Var2 != null) {
            r92Var2.mo50a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m51b(r92 r92Var) {
        this.f37k.add(r92Var);
        if (this.f36j) {
            r92Var.mo50a(r92Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52c() {
        this.f38l.clear();
        this.f37k.clear();
        this.f36j = false;
        this.f33g = 0;
        this.f29c = false;
        this.f28b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo53d(int i) {
        if (this.f36j) {
            return;
        }
        this.f36j = true;
        this.f33g = i;
        ArrayList arrayList = this.f37k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            y10 y10Var = (y10) obj;
            y10Var.mo50a(y10Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30d.f9846b.f13099h0);
        sb.append(":");
        switch (this.f31e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f36j ? Integer.valueOf(this.f33g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f38l.size());
        sb.append(":d=");
        sb.append(this.f37k.size());
        sb.append(">");
        return sb.toString();
    }
}
