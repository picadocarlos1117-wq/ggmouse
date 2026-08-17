package p000;

import com.example.ssmousepro.injection.LinuxInputConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.security.auth.x500.X500Principal;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class it1 {

    /* JADX INFO: renamed from: h */
    public static final C1473ua f5150h = new C1473ua(15);

    /* JADX INFO: renamed from: i */
    public static final C1473ua f5151i = new C1473ua(16);

    /* JADX INFO: renamed from: a */
    public final int f5152a;

    /* JADX INFO: renamed from: b */
    public int f5153b;

    /* JADX INFO: renamed from: c */
    public int f5154c;

    /* JADX INFO: renamed from: d */
    public int f5155d;

    /* JADX INFO: renamed from: e */
    public int f5156e;

    /* JADX INFO: renamed from: f */
    public final Serializable f5157f;

    /* JADX INFO: renamed from: g */
    public Object f5158g;

    public it1(int i) {
        this.f5152a = i;
        this.f5158g = new ht1[5];
        this.f5157f = new ArrayList();
        this.f5153b = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m3485a(int i, float f) {
        ht1 ht1Var;
        ht1[] ht1VarArr = (ht1[]) this.f5158g;
        ArrayList arrayList = (ArrayList) this.f5157f;
        if (this.f5153b != 1) {
            Collections.sort(arrayList, f5150h);
            this.f5153b = 1;
        }
        int i2 = this.f5156e;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.f5156e = i3;
            ht1Var = ht1VarArr[i3];
        } else {
            ht1Var = new ht1();
        }
        int i4 = this.f5154c;
        this.f5154c = i4 + 1;
        ht1Var.f4701a = i4;
        ht1Var.f4702b = i;
        ht1Var.f4703c = f;
        arrayList.add(ht1Var);
        this.f5155d += i;
        while (true) {
            int i5 = this.f5155d;
            int i6 = this.f5152a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            ht1 ht1Var2 = (ht1) arrayList.get(0);
            int i8 = ht1Var2.f4702b;
            if (i8 <= i7) {
                this.f5155d -= i8;
                arrayList.remove(0);
                int i9 = this.f5156e;
                if (i9 < 5) {
                    this.f5156e = i9 + 1;
                    ht1VarArr[i9] = ht1Var2;
                }
            } else {
                ht1Var2.f4702b = i8 - i7;
                this.f5155d -= i7;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m3486b(int i) {
        int i2;
        int i3;
        String str = (String) this.f5157f;
        int i4 = i + 1;
        if (i4 >= this.f5152a) {
            C0694gy.m3081g(str, "Malformed DN: ");
            return 0;
        }
        char[] cArr = (char[]) this.f5158g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                C0694gy.m3081g(str, "Malformed DN: ");
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                C0694gy.m3081g(str, "Malformed DN: ");
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX INFO: renamed from: c */
    public char m3487c() {
        int i;
        int i2;
        int i3 = this.f5153b + 1;
        this.f5153b = i3;
        int i4 = this.f5152a;
        if (i3 == i4) {
            l41.m4050s((String) this.f5157f, "Unexpected end of DN: ");
            return (char) 0;
        }
        char c = ((char[]) this.f5158g)[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case LinuxInputConstants.KEY_F1 /* 59 */:
                        case '<':
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        case '>':
                            break;
                        default:
                            int iM3486b = m3486b(i3);
                            this.f5153b++;
                            if (iM3486b < 128) {
                                return (char) iM3486b;
                            }
                            if (iM3486b < 192 || iM3486b > 247) {
                                return '?';
                            }
                            if (iM3486b <= 223) {
                                i = iM3486b & 31;
                                i2 = 1;
                            } else if (iM3486b <= 239) {
                                i = iM3486b & 15;
                                i2 = 2;
                            } else {
                                i = iM3486b & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.f5153b;
                                int i7 = i6 + 1;
                                this.f5153b = i7;
                                if (i7 == i4 || ((char[]) this.f5158g)[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.f5153b = i8;
                                int iM3486b2 = m3486b(i8);
                                this.f5153b++;
                                if ((iM3486b2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iM3486b2 & 63);
                            }
                            return (char) i;
                    }
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    /* JADX INFO: renamed from: d */
    public float m3488d() {
        ArrayList arrayList = (ArrayList) this.f5157f;
        if (this.f5153b != 0) {
            Collections.sort(arrayList, f5151i);
            this.f5153b = 0;
        }
        float f = 0.5f * this.f5155d;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ht1 ht1Var = (ht1) arrayList.get(i2);
            i += ht1Var.f4702b;
            if (i >= f) {
                return ht1Var.f4703c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((ht1) arrayList.get(arrayList.size() - 1)).f4703c;
    }

    /* JADX INFO: renamed from: e */
    public String m3489e() {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        char c2;
        char c3;
        String str = (String) this.f5157f;
        while (true) {
            i = this.f5153b;
            i2 = this.f5152a;
            if (i >= i2 || ((char[]) this.f5158g)[i] != ' ') {
                break;
            }
            this.f5153b = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f5154c = i;
        this.f5153b = i + 1;
        while (true) {
            i3 = this.f5153b;
            if (i3 >= i2 || (c3 = ((char[]) this.f5158g)[i3]) == '=' || c3 == ' ') {
                break;
            }
            this.f5153b = i3 + 1;
        }
        if (i3 >= i2) {
            C0694gy.m3081g(str, "Unexpected end of DN: ");
            return null;
        }
        this.f5155d = i3;
        if (((char[]) this.f5158g)[i3] == ' ') {
            while (true) {
                i4 = this.f5153b;
                if (i4 >= i2 || (c2 = ((char[]) this.f5158g)[i4]) == '=' || c2 != ' ') {
                    break;
                }
                this.f5153b = i4 + 1;
            }
            if (((char[]) this.f5158g)[i4] != '=' || i4 == i2) {
                C0694gy.m3081g(str, "Unexpected end of DN: ");
                return null;
            }
        }
        this.f5153b++;
        while (true) {
            int i5 = this.f5153b;
            if (i5 >= i2 || ((char[]) this.f5158g)[i5] != ' ') {
                break;
            }
            this.f5153b = i5 + 1;
        }
        int i6 = this.f5155d;
        int i7 = this.f5154c;
        if (i6 - i7 > 4) {
            char[] cArr = (char[]) this.f5158g;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && ((cArr[i7 + 1] == 'I' || cArr[i7 + 1] == 'i') && (cArr[i7 + 2] == 'D' || cArr[i7 + 2] == 'd')))) {
                this.f5154c = i7 + 4;
            }
        }
        char[] cArr2 = (char[]) this.f5158g;
        int i8 = this.f5154c;
        return new String(cArr2, i8, i6 - i8);
    }

    public it1(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f5157f = name;
        this.f5152a = name.length();
    }
}
