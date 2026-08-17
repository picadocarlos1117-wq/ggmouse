package p000;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: um */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1485um {

    /* JADX INFO: renamed from: c */
    public static final Logger f11357c = Logger.getLogger(AbstractC1337qm.class.getName());

    /* JADX INFO: renamed from: a */
    public final Object f11358a = new Object();

    /* JADX INFO: renamed from: b */
    public final vo0 f11359b;

    public C1485um(vo0 vo0Var, long j, String str) {
        this.f11359b = vo0Var;
        m6510b(new po0(str.concat(" created"), oo0.f8409a, j, null));
    }

    /* JADX INFO: renamed from: a */
    public static void m6509a(vo0 vo0Var, Level level, String str) {
        Logger logger = f11357c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + vo0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6510b(po0 po0Var) {
        Level level;
        int iOrdinal = po0Var.f8975b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f11358a) {
        }
        m6509a(this.f11359b, level, po0Var.f8974a);
    }
}
