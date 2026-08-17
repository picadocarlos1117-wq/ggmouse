package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1325qa extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public final AssetManager f9454e;

    /* JADX INFO: renamed from: f */
    public Uri f9455f;

    /* JADX INFO: renamed from: g */
    public InputStream f9456g;

    /* JADX INFO: renamed from: m */
    public long f9457m;

    /* JADX INFO: renamed from: n */
    public boolean f9458n;

    public C1325qa(Context context) {
        super(false);
        this.f9454e = context.getAssets();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws C1288pa {
        try {
            Uri uri = c1087lx.f6535a;
            long j = c1087lx.f6539e;
            this.f9455f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m992q();
            InputStream inputStreamOpen = this.f9454e.open(path, 1);
            this.f9456g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C1288pa(null, 2008);
            }
            long j2 = c1087lx.f6540f;
            if (j2 != -1) {
                this.f9457m = j2;
            } else {
                long jAvailable = this.f9456g.available();
                this.f9457m = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9457m = -1L;
                }
            }
            this.f9458n = true;
            m993r(c1087lx);
            return this.f9457m;
        } catch (C1288pa e) {
            throw e;
        } catch (IOException e2) {
            throw new C1288pa(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        this.f9455f = null;
        try {
            try {
                InputStream inputStream = this.f9456g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9456g = null;
                if (this.f9458n) {
                    this.f9458n = false;
                    m990n();
                }
            } catch (IOException e) {
                throw new C1288pa(e, 2000);
            }
        } catch (Throwable th) {
            this.f9456g = null;
            if (this.f9458n) {
                this.f9458n = false;
                m990n();
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f9455f;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws C1288pa {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9457m;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C1288pa(e, 2000);
                }
            }
            InputStream inputStream = this.f9456g;
            int i3 = z42.f13274a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f9457m;
                if (j2 != -1) {
                    this.f9457m = j2 - ((long) i4);
                }
                m989k(i4);
                return i4;
            }
        }
        return -1;
    }
}
