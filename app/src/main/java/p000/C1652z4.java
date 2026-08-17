package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C0063b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1652z4 {

    /* JADX INFO: renamed from: a */
    public int f13266a;

    /* JADX INFO: renamed from: b */
    public final Object f13267b;

    /* JADX INFO: renamed from: c */
    public final Object f13268c;

    /* JADX INFO: renamed from: d */
    public Object f13269d;

    /* JADX INFO: renamed from: e */
    public Object f13270e;

    /* JADX INFO: renamed from: f */
    public Object f13271f;

    public C1652z4(C0063b c0063b) {
        this.f13267b = new kf1(30);
        this.f13268c = new ArrayList();
        this.f13269d = new ArrayList();
        this.f13266a = 0;
        this.f13270e = c0063b;
        this.f13271f = new pn0(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f13008b) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7190a(long r9, p000.dc1 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13269d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.f13270e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.f13266a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.f13266a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            yk1 r2 = (p000.yk1) r2
            int r4 = p000.z42.f13274a
            long r4 = r2.f13008b
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.f13268c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            dc1 r2 = new dc1
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            dc1 r2 = (p000.dc1) r2
        L3d:
            int r4 = r11.m2318a()
            r2.m2313C(r4)
            byte[] r4 = r11.f2882a
            int r11 = r11.f2883b
            byte[] r5 = r2.f2882a
            int r6 = r2.m2318a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f13271f
            yk1 r11 = (p000.yk1) r11
            if (r11 == 0) goto L64
            long r4 = r11.f13008b
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L64
            java.util.ArrayList r8 = r11.f13007a
            r8.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            yk1 r11 = new yk1
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            yk1 r11 = (p000.yk1) r11
        L76:
            java.util.ArrayList r0 = r11.f13007a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            r7 = 1
        L82:
            p000.ki0.m3857c(r7)
            boolean r4 = r0.isEmpty()
            p000.ki0.m3864h(r4)
            r11.f13008b = r9
            r0.add(r2)
            r1.add(r11)
            r8.f13271f = r11
            int r9 = r8.f13266a
            if (r9 == r3) goto L9d
            r8.m7198i(r9)
        L9d:
            return
        L9e:
            java.lang.Object r8 = r8.f13267b
            zk1 r8 = (p000.zk1) r8
            r8.mo6522a(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1652z4.m7190a(long, dc1):void");
    }

    /* JADX INFO: renamed from: b */
    public void m7191b() {
        View view = (View) this.f13267b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0577ds) this.f13269d) != null) {
                if (((C0577ds) this.f13271f) == null) {
                    this.f13271f = new C0577ds();
                }
                C0577ds c0577ds = (C0577ds) this.f13271f;
                c0577ds.f3005c = null;
                c0577ds.f3004b = false;
                c0577ds.f3006d = null;
                c0577ds.f3003a = false;
                WeakHashMap weakHashMap = i72.f4849a;
                ColorStateList colorStateListM7006g = y62.m7006g(view);
                if (colorStateListM7006g != null) {
                    c0577ds.f3004b = true;
                    c0577ds.f3005c = colorStateListM7006g;
                }
                PorterDuff.Mode modeM7007h = y62.m7007h(view);
                if (modeM7007h != null) {
                    c0577ds.f3003a = true;
                    c0577ds.f3006d = modeM7007h;
                }
                if (c0577ds.f3004b || c0577ds.f3003a) {
                    C1507v7.m6595e(background, c0577ds, view.getDrawableState());
                    return;
                }
            }
            C0577ds c0577ds2 = (C0577ds) this.f13270e;
            if (c0577ds2 != null) {
                C1507v7.m6595e(background, c0577ds2, view.getDrawableState());
                return;
            }
            C0577ds c0577ds3 = (C0577ds) this.f13269d;
            if (c0577ds3 != null) {
                C1507v7.m6595e(background, c0577ds3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m7192c(int i) {
        ArrayList arrayList = (ArrayList) this.f13269d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1615y4 c1615y4 = (C1615y4) arrayList.get(i2);
            int i3 = c1615y4.f12828a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c1615y4.f12829b;
                    int i5 = c1615y4.f12831d + i4;
                    while (i4 < i5) {
                        if (m7197h(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m7197h(c1615y4.f12831d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m7193d() {
        ArrayList arrayList = (ArrayList) this.f13269d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0063b) this.f13270e).m640a((C1615y4) arrayList.get(i));
        }
        m7208s(arrayList);
        this.f13266a = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m7194e() {
        C0063b c0063b = (C0063b) this.f13270e;
        m7193d();
        ArrayList arrayList = (ArrayList) this.f13268c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1615y4 c1615y4 = (C1615y4) arrayList.get(i);
            int i2 = c1615y4.f12828a;
            if (i2 == 1) {
                c0063b.m640a(c1615y4);
                c0063b.m643d(c1615y4.f12829b, c1615y4.f12831d);
            } else if (i2 == 2) {
                c0063b.m640a(c1615y4);
                int i3 = c1615y4.f12829b;
                int i4 = c1615y4.f12831d;
                RecyclerView recyclerView = c0063b.f975a;
                recyclerView.m567P(i3, i4, true);
                recyclerView.f924o0 = true;
                recyclerView.f918l0.f12195c += i4;
            } else if (i2 == 4) {
                c0063b.m640a(c1615y4);
                c0063b.m642c(c1615y4.f12829b, c1615y4.f12831d, c1615y4.f12830c);
            } else if (i2 == 8) {
                c0063b.m640a(c1615y4);
                c0063b.m644e(c1615y4.f12829b, c1615y4.f12831d);
            }
        }
        m7208s(arrayList);
        this.f13266a = 0;
    }

    /* JADX INFO: renamed from: f */
    public void m7195f(C1615y4 c1615y4) {
        int i;
        kf1 kf1Var = (kf1) this.f13267b;
        int i2 = c1615y4.f12828a;
        if (i2 == 1 || i2 == 8) {
            f40.m2713i("should not dispatch add or move for pre layout");
            return;
        }
        int iM7212w = m7212w(c1615y4.f12829b, i2);
        int i3 = c1615y4.f12829b;
        int i4 = c1615y4.f12828a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                l41.m4038g(c1615y4, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c1615y4.f12831d; i6++) {
            int iM7212w2 = m7212w((i * i6) + c1615y4.f12829b, c1615y4.f12828a);
            int i7 = c1615y4.f12828a;
            if (i7 == 2 ? iM7212w2 != iM7212w : !(i7 == 4 && iM7212w2 == iM7212w + 1)) {
                C1615y4 c1615y4M7203n = m7203n(i7, iM7212w, i5, c1615y4.f12830c);
                m7196g(c1615y4M7203n, i3);
                c1615y4M7203n.f12830c = null;
                kf1Var.mo3824c(c1615y4M7203n);
                if (c1615y4.f12828a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM7212w = iM7212w2;
            } else {
                i5++;
            }
        }
        Object obj = c1615y4.f12830c;
        c1615y4.f12830c = null;
        kf1Var.mo3824c(c1615y4);
        if (i5 > 0) {
            C1615y4 c1615y4M7203n2 = m7203n(c1615y4.f12828a, iM7212w, i5, obj);
            m7196g(c1615y4M7203n2, i3);
            c1615y4M7203n2.f12830c = null;
            kf1Var.mo3824c(c1615y4M7203n2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7196g(C1615y4 c1615y4, int i) {
        C0063b c0063b = (C0063b) this.f13270e;
        c0063b.m640a(c1615y4);
        int i2 = c1615y4.f12828a;
        if (i2 != 2) {
            if (i2 == 4) {
                c0063b.m642c(i, c1615y4.f12831d, c1615y4.f12830c);
                return;
            } else {
                f40.m2713i("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = c1615y4.f12831d;
        RecyclerView recyclerView = c0063b.f975a;
        recyclerView.m567P(i, i3, true);
        recyclerView.f924o0 = true;
        recyclerView.f918l0.f12195c += i3;
    }

    /* JADX INFO: renamed from: h */
    public int m7197h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f13269d;
        int size = arrayList.size();
        while (i2 < size) {
            C1615y4 c1615y4 = (C1615y4) arrayList.get(i2);
            int i3 = c1615y4.f12828a;
            int i4 = c1615y4.f12829b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c1615y4.f12831d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1615y4.f12831d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c1615y4.f12831d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c1615y4.f12831d;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public void m7198i(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f13270e;
        while (priorityQueue.size() > i) {
            yk1 yk1Var = (yk1) priorityQueue.poll();
            int i2 = z42.f13274a;
            int i3 = 0;
            while (true) {
                arrayList = yk1Var.f13007a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                ((zk1) this.f13267b).mo6522a(yk1Var.f13008b, (dc1) arrayList.get(i3));
                ((ArrayDeque) this.f13268c).push((dc1) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            yk1 yk1Var2 = (yk1) this.f13271f;
            if (yk1Var2 != null && yk1Var2.f13008b == yk1Var.f13008b) {
                this.f13271f = null;
            }
            ((ArrayDeque) this.f13269d).push(yk1Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public ColorStateList m7199j() {
        C0577ds c0577ds = (C0577ds) this.f13270e;
        if (c0577ds != null) {
            return (ColorStateList) c0577ds.f3005c;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode m7200k() {
        C0577ds c0577ds = (C0577ds) this.f13270e;
        if (c0577ds != null) {
            return (PorterDuff.Mode) c0577ds.f3006d;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7201l() {
        return ((ArrayList) this.f13268c).size() > 0;
    }

    /* JADX INFO: renamed from: m */
    public void m7202m(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM3664f;
        View view = (View) this.f13267b;
        Context context = view.getContext();
        int[] iArr = ki1.f5871z;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        View view2 = (View) this.f13267b;
        i72.m3377i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f13266a = typedArray.getResourceId(0, -1);
                C1507v7 c1507v7 = (C1507v7) this.f13268c;
                Context context2 = view.getContext();
                int i2 = this.f13266a;
                synchronized (c1507v7) {
                    colorStateListM3664f = c1507v7.f11571a.m3664f(context2, i2);
                }
                if (colorStateListM3664f != null) {
                    m7209t(colorStateListM3664f);
                }
            }
            if (typedArray.hasValue(1)) {
                y62.m7016q(view, c1174o9M4734Q.m4774w(1));
            }
            if (typedArray.hasValue(2)) {
                y62.m7017r(view, x30.m6865b(typedArray.getInt(2, -1), null));
            }
            c1174o9M4734Q.m4753T();
        } catch (Throwable th) {
            c1174o9M4734Q.m4753T();
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public C1615y4 m7203n(int i, int i2, int i3, Object obj) {
        C1615y4 c1615y4 = (C1615y4) ((kf1) this.f13267b).mo3822a();
        if (c1615y4 != null) {
            c1615y4.f12828a = i;
            c1615y4.f12829b = i2;
            c1615y4.f12831d = i3;
            c1615y4.f12830c = obj;
            return c1615y4;
        }
        C1615y4 c1615y5 = new C1615y4();
        c1615y5.f12828a = i;
        c1615y5.f12829b = i2;
        c1615y5.f12831d = i3;
        c1615y5.f12830c = obj;
        return c1615y5;
    }

    /* JADX INFO: renamed from: o */
    public void m7204o() {
        this.f13266a = -1;
        m7209t(null);
        m7191b();
    }

    /* JADX INFO: renamed from: p */
    public void m7205p(int i) {
        ColorStateList colorStateListM3664f;
        this.f13266a = i;
        C1507v7 c1507v7 = (C1507v7) this.f13268c;
        if (c1507v7 != null) {
            Context context = ((View) this.f13267b).getContext();
            synchronized (c1507v7) {
                colorStateListM3664f = c1507v7.f11571a.m3664f(context, i);
            }
        } else {
            colorStateListM3664f = null;
        }
        m7209t(colorStateListM3664f);
        m7191b();
    }

    /* JADX INFO: renamed from: q */
    public void m7206q(C1615y4 c1615y4) {
        C0063b c0063b = (C0063b) this.f13270e;
        ((ArrayList) this.f13269d).add(c1615y4);
        int i = c1615y4.f12828a;
        if (i == 1) {
            c0063b.m643d(c1615y4.f12829b, c1615y4.f12831d);
            return;
        }
        if (i == 2) {
            int i2 = c1615y4.f12829b;
            int i3 = c1615y4.f12831d;
            RecyclerView recyclerView = c0063b.f975a;
            recyclerView.m567P(i2, i3, false);
            recyclerView.f924o0 = true;
            return;
        }
        if (i == 4) {
            c0063b.m642c(c1615y4.f12829b, c1615y4.f12831d, c1615y4.f12830c);
        } else if (i == 8) {
            c0063b.m644e(c1615y4.f12829b, c1615y4.f12831d);
        } else {
            l41.m4038g(c1615y4, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    /* JADX INFO: renamed from: r */
    public void m7207r() {
        boolean z;
        byte b;
        C1615y4 c1615y4M7203n;
        int i;
        int i2;
        int i3;
        C1615y4 c1615y4M7203n2;
        boolean z2;
        boolean z3;
        Object obj;
        C1615y4 c1615y4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        kf1 kf1Var = (kf1) this.f13267b;
        C0063b c0063b = (C0063b) this.f13270e;
        pn0 pn0Var = (pn0) this.f13271f;
        ArrayList arrayList = (ArrayList) this.f13268c;
        pn0Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1615y4) arrayList.get(size)).f12828a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            C1652z4 c1652z4 = (C1652z4) pn0Var.f8968a;
            kf1 kf1Var2 = (kf1) c1652z4.f13267b;
            C1615y4 c1615y5 = (C1615y4) arrayList.get(size);
            C1615y4 c1615y6 = (C1615y4) arrayList.get(i12);
            int i13 = c1615y6.f12828a;
            if (i13 == 1) {
                int i14 = c1615y5.f12831d;
                int i15 = c1615y6.f12829b;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = c1615y5.f12829b;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    c1615y5.f12829b = i17 + c1615y6.f12831d;
                }
                int i18 = c1615y6.f12829b;
                if (i18 <= i14) {
                    c1615y5.f12831d = i14 + c1615y6.f12831d;
                }
                c1615y6.f12829b = i18 + i16;
                arrayList.set(size, c1615y6);
                arrayList.set(i12, c1615y5);
            } else if (i13 == 2) {
                int i19 = c1615y5.f12829b;
                int i20 = c1615y5.f12831d;
                int i21 = c1615y6.f12829b;
                if (i19 < i20) {
                    if (i21 == i19 && c1615y6.f12831d == i20 - i19) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i21 == i20 + 1 && c1615y6.f12831d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i20 < i21) {
                    c1615y6.f12829b = i21 - 1;
                } else {
                    int i22 = c1615y6.f12831d;
                    if (i20 < i21 + i22) {
                        c1615y6.f12831d = i22 - 1;
                        c1615y5.f12828a = 2;
                        c1615y5.f12831d = 1;
                        if (c1615y6.f12831d == 0) {
                            arrayList.remove(i12);
                            c1615y6.f12830c = null;
                            kf1Var2.mo3824c(c1615y6);
                        }
                    }
                }
                int i23 = c1615y5.f12829b;
                int i24 = c1615y6.f12829b;
                if (i23 <= i24) {
                    c1615y6.f12829b = i24 + 1;
                } else {
                    int i25 = i24 + c1615y6.f12831d;
                    if (i23 < i25) {
                        obj = null;
                        C1615y4 c1615y4M7203n3 = c1652z4.m7203n(2, i23 + 1, i25 - i23, null);
                        c1615y6.f12831d = c1615y5.f12829b - c1615y6.f12829b;
                        c1615y4 = c1615y4M7203n3;
                    }
                    if (z3) {
                        arrayList.set(size, c1615y6);
                        arrayList.remove(i12);
                        c1615y5.f12830c = obj;
                        kf1Var2.mo3824c(c1615y5);
                    } else {
                        if (z2) {
                            if (c1615y4 != null) {
                                i10 = c1615y5.f12829b;
                                if (i10 > c1615y4.f12829b) {
                                    c1615y5.f12829b = i10 - c1615y4.f12831d;
                                }
                                i11 = c1615y5.f12831d;
                                if (i11 > c1615y4.f12829b) {
                                    c1615y5.f12831d = i11 - c1615y4.f12831d;
                                }
                            }
                            i8 = c1615y5.f12829b;
                            if (i8 > c1615y6.f12829b) {
                                c1615y5.f12829b = i8 - c1615y6.f12831d;
                            }
                            i9 = c1615y5.f12831d;
                            if (i9 > c1615y6.f12829b) {
                                c1615y5.f12831d = i9 - c1615y6.f12831d;
                            }
                        } else {
                            if (c1615y4 != null) {
                                i6 = c1615y5.f12829b;
                                if (i6 >= c1615y4.f12829b) {
                                    c1615y5.f12829b = i6 - c1615y4.f12831d;
                                }
                                i7 = c1615y5.f12831d;
                                if (i7 >= c1615y4.f12829b) {
                                    c1615y5.f12831d = i7 - c1615y4.f12831d;
                                }
                            }
                            i4 = c1615y5.f12829b;
                            if (i4 >= c1615y6.f12829b) {
                                c1615y5.f12829b = i4 - c1615y6.f12831d;
                            }
                            i5 = c1615y5.f12831d;
                            if (i5 >= c1615y6.f12829b) {
                                c1615y5.f12831d = i5 - c1615y6.f12831d;
                            }
                        }
                        arrayList.set(size, c1615y6);
                        if (c1615y5.f12829b != c1615y5.f12831d) {
                            arrayList.set(i12, c1615y5);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c1615y4 != null) {
                            arrayList.add(size, c1615y4);
                        }
                    }
                }
                obj = null;
                c1615y4 = null;
                if (z3) {
                    arrayList.set(size, c1615y6);
                    arrayList.remove(i12);
                    c1615y5.f12830c = obj;
                    kf1Var2.mo3824c(c1615y5);
                } else {
                    if (z2) {
                        if (c1615y4 != null) {
                            i10 = c1615y5.f12829b;
                            if (i10 > c1615y4.f12829b) {
                                c1615y5.f12829b = i10 - c1615y4.f12831d;
                            }
                            i11 = c1615y5.f12831d;
                            if (i11 > c1615y4.f12829b) {
                                c1615y5.f12831d = i11 - c1615y4.f12831d;
                            }
                        }
                        i8 = c1615y5.f12829b;
                        if (i8 > c1615y6.f12829b) {
                            c1615y5.f12829b = i8 - c1615y6.f12831d;
                        }
                        i9 = c1615y5.f12831d;
                        if (i9 > c1615y6.f12829b) {
                            c1615y5.f12831d = i9 - c1615y6.f12831d;
                        }
                    } else {
                        if (c1615y4 != null) {
                            i6 = c1615y5.f12829b;
                            if (i6 >= c1615y4.f12829b) {
                                c1615y5.f12829b = i6 - c1615y4.f12831d;
                            }
                            i7 = c1615y5.f12831d;
                            if (i7 >= c1615y4.f12829b) {
                                c1615y5.f12831d = i7 - c1615y4.f12831d;
                            }
                        }
                        i4 = c1615y5.f12829b;
                        if (i4 >= c1615y6.f12829b) {
                            c1615y5.f12829b = i4 - c1615y6.f12831d;
                        }
                        i5 = c1615y5.f12831d;
                        if (i5 >= c1615y6.f12829b) {
                            c1615y5.f12831d = i5 - c1615y6.f12831d;
                        }
                    }
                    arrayList.set(size, c1615y6);
                    if (c1615y5.f12829b != c1615y5.f12831d) {
                        arrayList.set(i12, c1615y5);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (c1615y4 != null) {
                        arrayList.add(size, c1615y4);
                    }
                }
            } else if (i13 == 4) {
                int i26 = c1615y5.f12831d;
                int i27 = c1615y6.f12829b;
                if (i26 < i27) {
                    c1615y6.f12829b = i27 - 1;
                } else {
                    int i28 = c1615y6.f12831d;
                    if (i26 < i27 + i28) {
                        c1615y6.f12831d = i28 - 1;
                        c1615y4M7203n = c1652z4.m7203n(4, c1615y5.f12829b, 1, c1615y6.f12830c);
                    }
                    i = c1615y5.f12829b;
                    i2 = c1615y6.f12829b;
                    if (i <= i2) {
                        c1615y6.f12829b = i2 + 1;
                    } else {
                        i3 = i2 + c1615y6.f12831d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            c1615y4M7203n2 = c1652z4.m7203n(4, i + 1, i29, c1615y6.f12830c);
                            c1615y6.f12831d -= i29;
                        }
                        arrayList.set(i12, c1615y5);
                        if (c1615y6.f12831d > 0) {
                            arrayList.set(size, c1615y6);
                        } else {
                            arrayList.remove(size);
                            c1615y6.f12830c = null;
                            kf1Var2.mo3824c(c1615y6);
                        }
                        if (c1615y4M7203n != null) {
                            arrayList.add(size, c1615y4M7203n);
                        }
                        if (c1615y4M7203n2 != null) {
                            arrayList.add(size, c1615y4M7203n2);
                        }
                    }
                    c1615y4M7203n2 = null;
                    arrayList.set(i12, c1615y5);
                    if (c1615y6.f12831d > 0) {
                        arrayList.set(size, c1615y6);
                    } else {
                        arrayList.remove(size);
                        c1615y6.f12830c = null;
                        kf1Var2.mo3824c(c1615y6);
                    }
                    if (c1615y4M7203n != null) {
                        arrayList.add(size, c1615y4M7203n);
                    }
                    if (c1615y4M7203n2 != null) {
                        arrayList.add(size, c1615y4M7203n2);
                    }
                }
                c1615y4M7203n = null;
                i = c1615y5.f12829b;
                i2 = c1615y6.f12829b;
                if (i <= i2) {
                    c1615y6.f12829b = i2 + 1;
                } else {
                    i3 = i2 + c1615y6.f12831d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        c1615y4M7203n2 = c1652z4.m7203n(4, i + 1, i210, c1615y6.f12830c);
                        c1615y6.f12831d -= i210;
                    }
                    arrayList.set(i12, c1615y5);
                    if (c1615y6.f12831d > 0) {
                        arrayList.set(size, c1615y6);
                    } else {
                        arrayList.remove(size);
                        c1615y6.f12830c = null;
                        kf1Var2.mo3824c(c1615y6);
                    }
                    if (c1615y4M7203n != null) {
                        arrayList.add(size, c1615y4M7203n);
                    }
                    if (c1615y4M7203n2 != null) {
                        arrayList.add(size, c1615y4M7203n2);
                    }
                }
                c1615y4M7203n2 = null;
                arrayList.set(i12, c1615y5);
                if (c1615y6.f12831d > 0) {
                    arrayList.set(size, c1615y6);
                } else {
                    arrayList.remove(size);
                    c1615y6.f12830c = null;
                    kf1Var2.mo3824c(c1615y6);
                }
                if (c1615y4M7203n != null) {
                    arrayList.add(size, c1615y4M7203n);
                }
                if (c1615y4M7203n2 != null) {
                    arrayList.add(size, c1615y4M7203n2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            C1615y4 c1615y4M7203n4 = (C1615y4) arrayList.get(i30);
            int i31 = c1615y4M7203n4.f12828a;
            if (i31 == 1) {
                m7206q(c1615y4M7203n4);
            } else if (i31 == 2) {
                int i32 = c1615y4M7203n4.f12829b;
                int i33 = c1615y4M7203n4.f12831d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (c0063b.m641b(i34) != null || m7192c(i34)) {
                        if (b2 == 0) {
                            m7195f(m7203n(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m7206q(m7203n(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != c1615y4M7203n4.f12831d) {
                    c1615y4M7203n4.f12830c = null;
                    kf1Var.mo3824c(c1615y4M7203n4);
                    c1615y4M7203n4 = m7203n(2, i32, i35, null);
                }
                if (b2 == 0) {
                    m7195f(c1615y4M7203n4);
                } else {
                    m7206q(c1615y4M7203n4);
                }
            } else if (i31 == 4) {
                int i36 = c1615y4M7203n4.f12829b;
                int i37 = c1615y4M7203n4.f12831d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (c0063b.m641b(i36) != null || m7192c(i36)) {
                        if (b3 == 0) {
                            m7195f(m7203n(4, i38, i39, c1615y4M7203n4.f12830c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m7206q(m7203n(4, i38, i39, c1615y4M7203n4.f12830c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != c1615y4M7203n4.f12831d) {
                    Object obj2 = c1615y4M7203n4.f12830c;
                    c1615y4M7203n4.f12830c = null;
                    kf1Var.mo3824c(c1615y4M7203n4);
                    c1615y4M7203n4 = m7203n(4, i38, i39, obj2);
                }
                if (b3 == 0) {
                    m7195f(c1615y4M7203n4);
                } else {
                    m7206q(c1615y4M7203n4);
                }
            } else if (i31 == 8) {
                m7206q(c1615y4M7203n4);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m7208s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1615y4 c1615y4 = (C1615y4) arrayList.get(i);
            c1615y4.f12830c = null;
            ((kf1) this.f13267b).mo3824c(c1615y4);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: t */
    public void m7209t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0577ds) this.f13269d) == null) {
                this.f13269d = new C0577ds();
            }
            C0577ds c0577ds = (C0577ds) this.f13269d;
            c0577ds.f3005c = colorStateList;
            c0577ds.f3004b = true;
        } else {
            this.f13269d = null;
        }
        m7191b();
    }

    /* JADX INFO: renamed from: u */
    public void m7210u(ColorStateList colorStateList) {
        if (((C0577ds) this.f13270e) == null) {
            this.f13270e = new C0577ds();
        }
        C0577ds c0577ds = (C0577ds) this.f13270e;
        c0577ds.f3005c = colorStateList;
        c0577ds.f3004b = true;
        m7191b();
    }

    /* JADX INFO: renamed from: v */
    public void m7211v(PorterDuff.Mode mode) {
        if (((C0577ds) this.f13270e) == null) {
            this.f13270e = new C0577ds();
        }
        C0577ds c0577ds = (C0577ds) this.f13270e;
        c0577ds.f3006d = mode;
        c0577ds.f3003a = true;
        m7191b();
    }

    /* JADX INFO: renamed from: w */
    public int m7212w(int i, int i2) {
        int i3;
        int i4;
        kf1 kf1Var = (kf1) this.f13267b;
        ArrayList arrayList = (ArrayList) this.f13269d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1615y4 c1615y4 = (C1615y4) arrayList.get(size);
            int i5 = c1615y4.f12828a;
            int i6 = c1615y4.f12829b;
            if (i5 == 8) {
                int i7 = c1615y4.f12831d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c1615y4.f12829b = i6 + 1;
                            c1615y4.f12831d = i7 + 1;
                        } else if (i2 == 2) {
                            c1615y4.f12829b = i6 - 1;
                            c1615y4.f12831d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c1615y4.f12831d = i7 + 1;
                    } else if (i2 == 2) {
                        c1615y4.f12831d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c1615y4.f12829b = i6 + 1;
                    } else if (i2 == 2) {
                        c1615y4.f12829b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c1615y4.f12831d;
                } else if (i5 == 2) {
                    i += c1615y4.f12831d;
                }
            } else if (i2 == 1) {
                c1615y4.f12829b = i6 + 1;
            } else if (i2 == 2) {
                c1615y4.f12829b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1615y4 c1615y5 = (C1615y4) arrayList.get(size2);
            int i8 = c1615y5.f12828a;
            int i9 = c1615y5.f12831d;
            if (i8 == 8) {
                if (i9 == c1615y5.f12829b || i9 < 0) {
                    arrayList.remove(size2);
                    c1615y5.f12830c = null;
                    kf1Var.mo3824c(c1615y5);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c1615y5.f12830c = null;
                kf1Var.mo3824c(c1615y5);
            }
        }
        return i;
    }

    public C1652z4(zk1 zk1Var) {
        this.f13267b = zk1Var;
        this.f13268c = new ArrayDeque();
        this.f13269d = new ArrayDeque();
        this.f13270e = new PriorityQueue();
        this.f13266a = -1;
    }

    public C1652z4(View view) {
        this.f13266a = -1;
        this.f13267b = view;
        this.f13268c = C1507v7.m6592a();
    }
}
