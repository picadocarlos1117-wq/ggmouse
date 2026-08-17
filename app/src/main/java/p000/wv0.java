package p000;

import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f12344a = new StringBuilder(128);

    /* JADX INFO: renamed from: c */
    public final void m6837c() {
        StringBuilder sb = this.f12344a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m6837c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m6837c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m6837c();
            } else {
                this.f12344a.append(c);
            }
        }
    }
}
