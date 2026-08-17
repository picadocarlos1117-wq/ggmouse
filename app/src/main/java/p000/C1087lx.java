package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1087lx {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f6534h = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f6535a;

    /* JADX INFO: renamed from: b */
    public final int f6536b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6537c;

    /* JADX INFO: renamed from: d */
    public final Map f6538d;

    /* JADX INFO: renamed from: e */
    public final long f6539e;

    /* JADX INFO: renamed from: f */
    public final long f6540f;

    /* JADX INFO: renamed from: g */
    public final int f6541g;

    static {
        a21.m54a("media3.datasource");
    }

    public C1087lx(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        ki0.m3857c(j >= 0);
        ki0.m3857c(j >= 0);
        ki0.m3857c(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f6535a = uri;
        this.f6536b = i;
        this.f6537c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f6538d = Collections.unmodifiableMap(new HashMap(map));
        this.f6539e = j;
        this.f6540f = j2;
        this.f6541g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.f6536b;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                l41.m4046o();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f6535a);
        sb.append(", ");
        sb.append(this.f6539e);
        sb.append(", ");
        sb.append(this.f6540f);
        sb.append(", null, ");
        return AbstractC1308pu.m5341h(sb, this.f6541g, "]");
    }
}
