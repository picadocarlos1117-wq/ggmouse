package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public final Context f11308e;

    /* JADX INFO: renamed from: f */
    public C1087lx f11309f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f11310g;

    /* JADX INFO: renamed from: m */
    public FileInputStream f11311m;

    /* JADX INFO: renamed from: n */
    public long f11312n;

    /* JADX INFO: renamed from: o */
    public boolean f11313o;

    public ui1(Context context) {
        super(false);
        this.f11308e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws ti1 {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f11309f = c1087lx;
        m992q();
        Uri uri = c1087lx.f6535a;
        long j = c1087lx.f6540f;
        long j2 = c1087lx.f6539e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f11308e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new ti1("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new ti1("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new ti1("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new ti1("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new ti1("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC1308pu.m5340g(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new ti1("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new ti1("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f11310g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f11310g.getFileDescriptor());
            this.f11311m = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new ti1(null, null, 2008);
                }
                long startOffset = this.f11310g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ti1(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f11312n = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f11312n = size;
                        if (size < 0) {
                            throw new ti1(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f11312n = j3;
                    if (j3 < 0) {
                        throw new C1050kx(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f11312n;
                    this.f11312n = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f11313o = true;
                m993r(c1087lx);
                return j != -1 ? j : this.f11312n;
            } catch (ti1 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new ti1(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new ti1(null, e4, 2005);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p000.InterfaceC0807jx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f11309f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f11311m     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f11311m = r0
            android.content.res.AssetFileDescriptor r3 = r5.f11310g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f11310g = r0
            boolean r0 = r5.f11313o
            if (r0 == 0) goto L2b
            r5.f11313o = r2
            r5.m990n()
        L2b:
            return
        L2c:
            ti1 r4 = new ti1     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f11310g = r0
            boolean r0 = r5.f11313o
            if (r0 == 0) goto L3d
            r5.f11313o = r2
            r5.m990n()
        L3d:
            throw r1
        L3e:
            ti1 r4 = new ti1     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f11311m = r0
            android.content.res.AssetFileDescriptor r4 = r5.f11310g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f11310g = r0
            boolean r0 = r5.f11313o
            if (r0 == 0) goto L5d
            r5.f11313o = r2
            r5.m990n()
        L5d:
            throw r3
        L5e:
            ti1 r4 = new ti1     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f11310g = r0
            boolean r0 = r5.f11313o
            if (r0 == 0) goto L6f
            r5.f11313o = r2
            r5.m990n()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ui1.close():void");
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        C1087lx c1087lx = this.f11309f;
        if (c1087lx != null) {
            return c1087lx.f6535a;
        }
        return null;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws ti1 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11312n;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ti1(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f11311m;
            int i3 = z42.f13274a;
            int i4 = fileInputStream.read(bArr, i, i2);
            long j2 = this.f11312n;
            if (i4 != -1) {
                if (j2 != -1) {
                    this.f11312n = j2 - ((long) i4);
                }
                m989k(i4);
                return i4;
            }
            if (j2 != -1) {
                throw new ti1("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
