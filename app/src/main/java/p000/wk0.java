package p000;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f12207a = Logger.getLogger(tk0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C0717hk f12208b;

    static {
        C0717hk c0717hk = C0717hk.f4607d;
        f12208b = AbstractC1337qm.m5552o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    /* JADX INFO: renamed from: a */
    public static int m6802a(zi1 zi1Var) {
        return (zi1Var.readByte() & 255) | ((zi1Var.readByte() & 255) << 16) | ((zi1Var.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m6803b(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        m6804c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static void m6804c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
