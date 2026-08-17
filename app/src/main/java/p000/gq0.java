package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final StringReader f4285a;

    /* JADX INFO: renamed from: m */
    public long f4292m;

    /* JADX INFO: renamed from: n */
    public int f4293n;

    /* JADX INFO: renamed from: o */
    public String f4294o;

    /* JADX INFO: renamed from: p */
    public int[] f4295p;

    /* JADX INFO: renamed from: r */
    public String[] f4297r;

    /* JADX INFO: renamed from: s */
    public int[] f4298s;

    /* JADX INFO: renamed from: b */
    public final char[] f4286b = new char[1024];

    /* JADX INFO: renamed from: c */
    public int f4287c = 0;

    /* JADX INFO: renamed from: d */
    public int f4288d = 0;

    /* JADX INFO: renamed from: e */
    public int f4289e = 0;

    /* JADX INFO: renamed from: f */
    public int f4290f = 0;

    /* JADX INFO: renamed from: g */
    public int f4291g = 0;

    /* JADX INFO: renamed from: q */
    public int f4296q = 1;

    public gq0(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f4295p = iArr;
        iArr[0] = 6;
        this.f4297r = new String[32];
        this.f4298s = new int[32];
        this.f4285a = stringReader;
    }

    /* JADX INFO: renamed from: c */
    public final void m3037c() throws C1079lp {
        m3049z("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4291g = 0;
        this.f4295p[0] = 8;
        this.f4296q = 1;
        this.f4285a.close();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142 A[PHI: r1 r4
  0x0142: PHI (r1v30 int) = (r1v29 int), (r1v44 int) binds: [B:95:0x012b, B:102:0x013e] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:95:0x012b, B:102:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:171:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:179:0x01fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x0207  */
    /* JADX WARN: Code duplicated, block: B:184:0x020d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX INFO: renamed from: d */
    public final int m3038d() throws IOException {
        int iM3044p;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        int[] iArr = this.f4295p;
        int i8 = this.f4296q - 1;
        int i9 = iArr[i8];
        int i10 = 0;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM3044p2 = m3044p(true);
            if (iM3044p2 != 44) {
                if (iM3044p2 == 59) {
                    m3037c();
                    throw null;
                }
                if (iM3044p2 == 93) {
                    this.f4291g = 4;
                    return 4;
                }
                m3049z("Unterminated array");
                throw null;
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM3044p = m3044p(true)) != 44) {
                    if (iM3044p == 59) {
                        m3037c();
                        throw null;
                    }
                    if (iM3044p == 125) {
                        this.f4291g = 2;
                        return 2;
                    }
                    m3049z("Unterminated object");
                    throw null;
                }
                int iM3044p3 = m3044p(true);
                if (iM3044p3 == 34) {
                    this.f4291g = 13;
                    return 13;
                }
                if (iM3044p3 == 39) {
                    m3037c();
                    throw null;
                }
                if (iM3044p3 != 125) {
                    m3037c();
                    throw null;
                }
                if (i9 != 5) {
                    this.f4291g = 2;
                    return 2;
                }
                m3049z("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM3044p4 = m3044p(true);
                if (iM3044p4 != 58) {
                    if (iM3044p4 != 61) {
                        m3049z("Expected ':'");
                        throw null;
                    }
                    m3037c();
                    throw null;
                }
            } else if (i9 == 6) {
                iArr[i8] = 7;
            } else {
                if (i9 == 7) {
                    if (m3044p(false) == -1) {
                        this.f4291g = 17;
                        return 17;
                    }
                    m3037c();
                    throw null;
                }
                if (i9 == 8) {
                    f40.m2719o("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iM3044p5 = m3044p(true);
        if (iM3044p5 == 34) {
            this.f4291g = 9;
            return 9;
        }
        if (iM3044p5 == 39) {
            m3037c();
            throw null;
        }
        if (iM3044p5 != 44 && iM3044p5 != 59) {
            if (iM3044p5 == 91) {
                this.f4291g = 3;
                return 3;
            }
            if (iM3044p5 != 93) {
                if (iM3044p5 == 123) {
                    this.f4291g = 1;
                    return 1;
                }
                int i11 = this.f4287c - 1;
                this.f4287c = i11;
                char[] cArr = this.f4286b;
                char c3 = cArr[i11];
                if (c3 == 't' || c3 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c3 != 'f' && c3 != 'F') {
                        if (c3 == 'n' || c3 == 'N') {
                            str = "null";
                            str2 = "NULL";
                            i = 7;
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        i3 = this.f4287c;
                        i4 = this.f4288d;
                        int i12 = 1;
                        i5 = i2;
                        i6 = i5;
                        int i13 = i6;
                        long j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c2 = cArr[i3 + i5];
                                if (c2 != '+') {
                                    if (c2 != 'E' || c2 == 'e') {
                                        if (i6 != 2 || i6 == 4) {
                                            i6 = 5;
                                            i5++;
                                        }
                                    } else if (c2 == '-') {
                                        if (i6 == 0) {
                                            i6 = 1;
                                            i13 = 1;
                                        } else {
                                            if (i6 != 5) {
                                            }
                                            i6 = 6;
                                        }
                                        i5++;
                                    } else if (c2 != '.') {
                                        if (c2 >= '0' && c2 <= '9') {
                                            if (i6 == 1 || i6 == 0) {
                                                j = -(c2 - '0');
                                                i6 = 2;
                                            } else if (i6 == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (c2 - '0'));
                                                    i12 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i2;
                                                    j = j2;
                                                }
                                            } else if (i6 == 3) {
                                                i6 = 4;
                                            } else if (i6 == 5 || i6 == 6) {
                                                i6 = 7;
                                            }
                                            i5++;
                                        } else if (!m3042l(c2)) {
                                            if (i6 != 2 && i12 != 0 && ((j != Long.MIN_VALUE || i13 != 0) && (j != 0 || i13 == 0))) {
                                                if (i13 == 0) {
                                                    j = -j;
                                                }
                                                this.f4292m = j;
                                                this.f4287c += i5;
                                                i7 = 15;
                                                this.f4291g = 15;
                                            } else if (i6 != 2 || i6 == 4 || i6 == 7) {
                                                this.f4293n = i5;
                                                i7 = 16;
                                                this.f4291g = 16;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        i6 = 3;
                                        i5++;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m3042l(cArr[this.f4287c])) {
                                        m3037c();
                                        throw null;
                                    }
                                    m3049z("Expected value");
                                    throw null;
                                }
                                if (i6 != 5) {
                                }
                                i6 = 6;
                                i5++;
                            } else if (i5 != cArr.length) {
                                if (!m3039e(i5 + 1)) {
                                    i3 = this.f4287c;
                                    i4 = this.f4288d;
                                    c2 = cArr[i3 + i5];
                                    if (c2 != '+') {
                                        if (c2 != 'E') {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i5++;
                                        } else {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i5++;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m3042l(cArr[this.f4287c])) {
                                            m3049z("Expected value");
                                            throw null;
                                        }
                                        m3037c();
                                        throw null;
                                    }
                                    if (i6 != 5) {
                                    }
                                    i6 = 6;
                                    i5++;
                                }
                                if (i6 != 2) {
                                    if (i6 != 2) {
                                    }
                                    this.f4293n = i5;
                                    i7 = 16;
                                    this.f4291g = 16;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    this.f4293n = i5;
                                    i7 = 16;
                                    this.f4291g = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m3042l(cArr[this.f4287c])) {
                                    m3049z("Expected value");
                                    throw null;
                                }
                                m3037c();
                                throw null;
                            }
                            i7 = i2;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m3042l(cArr[this.f4287c])) {
                                m3049z("Expected value");
                                throw null;
                            }
                            m3037c();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i14 = 1;
                while (true) {
                    int i15 = this.f4287c;
                    i2 = i10;
                    int i16 = this.f4288d;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !m3039e(length + 1)) || !m3042l(cArr[this.f4287c + length])) {
                            this.f4287c += length;
                            this.f4291g = i;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || m3039e(i14 + 1)) && ((c = cArr[this.f4287c + i14]) == str.charAt(i14) || c == str2.charAt(i14))) {
                        i14++;
                        i10 = i2;
                    }
                    i = i2;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                i3 = this.f4287c;
                i4 = this.f4288d;
                int i17 = 1;
                i5 = i2;
                i6 = i5;
                int i18 = i6;
                long j3 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c2 = cArr[i3 + i5];
                        if (c2 != '+') {
                            if (c2 != 'E') {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i5++;
                            } else {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i5++;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m3042l(cArr[this.f4287c])) {
                                m3049z("Expected value");
                                throw null;
                            }
                            m3037c();
                            throw null;
                        }
                        if (i6 != 5) {
                        }
                        i6 = 6;
                        i5++;
                    } else if (i5 != cArr.length) {
                        if (!m3039e(i5 + 1)) {
                            i3 = this.f4287c;
                            i4 = this.f4288d;
                            c2 = cArr[i3 + i5];
                            if (c2 != '+') {
                                if (c2 != 'E') {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i5++;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i5++;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m3042l(cArr[this.f4287c])) {
                                    m3049z("Expected value");
                                    throw null;
                                }
                                m3037c();
                                throw null;
                            }
                            if (i6 != 5) {
                            }
                            i6 = 6;
                            i5++;
                        }
                        if (i6 != 2) {
                            if (i6 != 2) {
                            }
                            this.f4293n = i5;
                            i7 = 16;
                            this.f4291g = 16;
                        } else {
                            if (i6 != 2) {
                            }
                            this.f4293n = i5;
                            i7 = 16;
                            this.f4291g = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m3042l(cArr[this.f4287c])) {
                            m3049z("Expected value");
                            throw null;
                        }
                        m3037c();
                        throw null;
                    }
                    i7 = i2;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m3042l(cArr[this.f4287c])) {
                        m3049z("Expected value");
                        throw null;
                    }
                    m3037c();
                    throw null;
                }
            }
            if (i9 == 1) {
                this.f4291g = 4;
                return 4;
            }
        }
        if (i9 == 1 || i9 == 2) {
            m3037c();
            throw null;
        }
        m3049z("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3039e(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f4290f;
        int i5 = this.f4287c;
        this.f4290f = i4 - i5;
        int i6 = this.f4288d;
        char[] cArr = this.f4286b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4288d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4288d = 0;
        }
        this.f4287c = 0;
        do {
            int i8 = this.f4288d;
            int i9 = this.f4285a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f4288d + i9;
            this.f4288d = i2;
            if (this.f4289e == 0 && (i3 = this.f4290f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f4287c++;
                this.f4290f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m3040g() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.f4296q; i++) {
            int i2 = this.f4295p[i];
            if (i2 == 1 || i2 == 2) {
                int i3 = this.f4298s[i];
                sb.append('[');
                sb.append(i3);
                sb.append(']');
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                sb.append('.');
                String str = this.f4297r[i];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3041j() throws IOException {
        int iM3038d = this.f4291g;
        if (iM3038d == 0) {
            iM3038d = m3038d();
        }
        return (iM3038d == 2 || iM3038d == 4 || iM3038d == 17) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3042l(char c) throws C1079lp {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m3037c();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final String m3043o() {
        StringBuilder sbM5345l = AbstractC1308pu.m5345l(" at line ", this.f4289e + 1, " column ", (this.f4287c - this.f4290f) + 1, " path ");
        sbM5345l.append(m3040g());
        return sbM5345l.toString();
    }

    /* JADX INFO: renamed from: p */
    public final int m3044p(boolean z) throws IOException {
        int i = this.f4287c;
        int i2 = this.f4288d;
        while (true) {
            if (i == i2) {
                this.f4287c = i;
                if (!m3039e(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m3043o()));
                    }
                    return -1;
                }
                i = this.f4287c;
                i2 = this.f4288d;
            }
            int i3 = i + 1;
            char c = this.f4286b[i];
            if (c == '\n') {
                this.f4289e++;
                this.f4290f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.f4287c = i3;
                        return c;
                    }
                    this.f4287c = i3;
                    m3037c();
                    throw null;
                }
                this.f4287c = i3;
                if (i3 == i2) {
                    this.f4287c = i;
                    boolean zM3039e = m3039e(2);
                    this.f4287c++;
                    if (!zM3039e) {
                        return c;
                    }
                }
                m3037c();
                throw null;
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m3045r(char c) throws C1079lp {
        int i;
        char[] cArr;
        int i2;
        StringBuilder sb = null;
        do {
            int i3 = this.f4287c;
            int i4 = this.f4288d;
            while (true) {
                int i5 = i4;
                i = i3;
                while (true) {
                    cArr = this.f4286b;
                    if (i3 < i5) {
                        int i6 = i3 + 1;
                        char c2 = cArr[i3];
                        if (c2 == c) {
                            this.f4287c = i6;
                            int i7 = (i6 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i7);
                            }
                            sb.append(cArr, i, i7);
                            return sb.toString();
                        }
                        char c3 = '\n';
                        if (c2 == '\\') {
                            this.f4287c = i6;
                            int i8 = i6 - i;
                            int i9 = i8 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i8 * 2, 16));
                            }
                            sb.append(cArr, i, i9);
                            if (this.f4287c == this.f4288d && !m3039e(1)) {
                                m3049z("Unterminated escape sequence");
                                throw null;
                            }
                            int i10 = this.f4287c;
                            int i11 = i10 + 1;
                            this.f4287c = i11;
                            char c4 = cArr[i10];
                            if (c4 != '\n') {
                                if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                    } else if (c4 == 'f') {
                                        c3 = '\f';
                                    } else if (c4 == 'n') {
                                        continue;
                                    } else if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            m3049z("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i10 + 5 > this.f4288d && !m3039e(4)) {
                                            m3049z("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i12 = this.f4287c;
                                        int i13 = i12 + 4;
                                        c3 = 0;
                                        while (i12 < i13) {
                                            char c5 = cArr[i12];
                                            char c6 = (char) (c3 << 4);
                                            if (c5 >= '0' && c5 <= '9') {
                                                i2 = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i2 = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f4287c, 4)));
                                                }
                                                i2 = c5 - '7';
                                            }
                                            c3 = (char) (i2 + c6);
                                            i12++;
                                        }
                                        this.f4287c += 4;
                                    }
                                }
                                sb.append(c3);
                                i3 = this.f4287c;
                                i4 = this.f4288d;
                            } else {
                                this.f4289e++;
                                this.f4290f = i11;
                            }
                            c3 = c4;
                            sb.append(c3);
                            i3 = this.f4287c;
                            i4 = this.f4288d;
                        } else {
                            if (c2 == '\n') {
                                this.f4289e++;
                                this.f4290f = i6;
                            }
                            i3 = i6;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
            }
            sb.append(cArr, i, i3 - i);
            this.f4287c = i3;
        } while (m3039e(1));
        m3049z("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX INFO: renamed from: s */
    public final String m3046s() throws C1079lp {
        char[] cArr;
        int i;
        String string;
        int i2 = 0;
        StringBuilder sb = null;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f4287c + i3;
                int i5 = this.f4288d;
                cArr = this.f4286b;
                if (i4 < i5) {
                    char c = cArr[i4];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m3037c();
                        throw null;
                    }
                    i2 = i3;
                } else if (i3 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(cArr, this.f4287c, i3);
                    this.f4287c += i3;
                } else if (!m3039e(i3 + 1)) {
                    i2 = i3;
                }
                i = this.f4287c;
                if (sb == null) {
                    string = new String(cArr, i, i2);
                } else {
                    sb.append(cArr, i, i2);
                    string = sb.toString();
                }
                this.f4287c += i2;
                return string;
            }
        } while (m3039e(1));
        i = this.f4287c;
        if (sb == null) {
            string = new String(cArr, i, i2);
        } else {
            sb.append(cArr, i, i2);
            string = sb.toString();
        }
        this.f4287c += i2;
        return string;
    }

    public final String toString() {
        return gq0.class.getSimpleName().concat(m3043o());
    }

    /* JADX INFO: renamed from: x */
    public final int m3047x() throws IOException {
        int iM3038d = this.f4291g;
        if (iM3038d == 0) {
            iM3038d = m3038d();
        }
        switch (iM3038d) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3048y(int i) {
        int i2 = this.f4296q;
        int[] iArr = this.f4295p;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f4295p = Arrays.copyOf(iArr, i3);
            this.f4298s = Arrays.copyOf(this.f4298s, i3);
            this.f4297r = (String[]) Arrays.copyOf(this.f4297r, i3);
        }
        int[] iArr2 = this.f4295p;
        int i4 = this.f4296q;
        this.f4296q = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: z */
    public final void m3049z(String str) throws C1079lp {
        throw new C1079lp(str.concat(m3043o()));
    }
}
