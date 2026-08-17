package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tx0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f11029c = Logger.getLogger(tx0.class.getName());

    /* JADX INFO: renamed from: d */
    public static tx0 f11030d;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f11031a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public List f11032b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public static List m6352a() {
        Logger logger = f11029c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(t91.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
