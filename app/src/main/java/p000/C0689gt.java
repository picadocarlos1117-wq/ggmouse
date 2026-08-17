package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0689gt extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f4310e;

    /* JADX INFO: renamed from: f */
    public Uri f4311f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f4312g;

    /* JADX INFO: renamed from: m */
    public FileInputStream f4313m;

    /* JADX INFO: renamed from: n */
    public long f4314n;

    /* JADX INFO: renamed from: o */
    public boolean f4315o;

    public C0689gt(Context context) {
        super(false);
        this.f4310e = context.getContentResolver();
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws C0652ft {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c1087lx.f6535a;
                long j = c1087lx.f6540f;
                long j2 = c1087lx.f6539e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f4311f = uriNormalizeScheme;
                m992q();
                boolean zEquals = FirebaseAnalytics.Param.CONTENT.equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f4310e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f4312g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C0652ft(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new C0652ft(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f4313m = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C0652ft(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new C0652ft(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f4314n = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f4314n = jPosition;
                        if (jPosition < 0) {
                            throw new C0652ft(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f4314n = j3;
                    if (j3 < 0) {
                        throw new C0652ft(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f4314n;
                    this.f4314n = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f4315o = true;
                m993r(c1087lx);
                return j != -1 ? j : this.f4314n;
            } catch (C0652ft e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
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
            r5.f4311f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f4313m     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f4313m = r0
            android.content.res.AssetFileDescriptor r3 = r5.f4312g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f4312g = r0
            boolean r0 = r5.f4315o
            if (r0 == 0) goto L2b
            r5.f4315o = r2
            r5.m990n()
        L2b:
            return
        L2c:
            ft r4 = new ft     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f4312g = r0
            boolean r0 = r5.f4315o
            if (r0 == 0) goto L3d
            r5.f4315o = r2
            r5.m990n()
        L3d:
            throw r1
        L3e:
            ft r4 = new ft     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f4313m = r0
            android.content.res.AssetFileDescriptor r4 = r5.f4312g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f4312g = r0
            boolean r0 = r5.f4315o
            if (r0 == 0) goto L5d
            r5.f4315o = r2
            r5.m990n()
        L5d:
            throw r3
        L5e:
            ft r4 = new ft     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f4312g = r0
            boolean r0 = r5.f4315o
            if (r0 == 0) goto L6f
            r5.f4315o = r2
            r5.m990n()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0689gt.close():void");
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f4311f;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws C0652ft {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f4314n;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C0652ft(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f4313m;
            int i3 = z42.f13274a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f4314n;
                if (j2 != -1) {
                    this.f4314n = j2 - ((long) i4);
                }
                m989k(i4);
                return i4;
            }
        }
        return -1;
    }
}
