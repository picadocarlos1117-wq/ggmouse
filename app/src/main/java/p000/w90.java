package p000;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f12028e;

    /* JADX INFO: renamed from: f */
    public Uri f12029f;

    /* JADX INFO: renamed from: g */
    public long f12030g;

    /* JADX INFO: renamed from: m */
    public boolean f12031m;

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws v90 {
        Uri uri = c1087lx.f6535a;
        long j = c1087lx.f6539e;
        this.f12029f = uri;
        m992q();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f12028e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c1087lx.f6540f;
                if (length == -1) {
                    length = this.f12028e.length() - j;
                }
                this.f12030g = length;
                if (length < 0) {
                    throw new v90(null, null, 2008);
                }
                this.f12031m = true;
                m993r(c1087lx);
                return this.f12030g;
            } catch (IOException e) {
                throw new v90(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new v90(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM3618p = jd0.m3618p("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM3618p.append(fragment);
            throw new v90(sbM3618p.toString(), e2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e3) {
            throw new v90(e3, 2006);
        } catch (RuntimeException e4) {
            throw new v90(e4, 2000);
        }
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        this.f12029f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f12028e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f12028e = null;
                if (this.f12031m) {
                    this.f12031m = false;
                    m990n();
                }
            } catch (IOException e) {
                throw new v90(e, 2000);
            }
        } catch (Throwable th) {
            this.f12028e = null;
            if (this.f12031m) {
                this.f12031m = false;
                m990n();
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f12029f;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws v90 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12030g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f12028e;
            int i3 = z42.f13274a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f12030g -= (long) i4;
                m989k(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new v90(e, 2000);
        }
    }
}
