package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: jz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809jz extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public final int f5601e;

    /* JADX INFO: renamed from: f */
    public final int f5602f;

    /* JADX INFO: renamed from: g */
    public final C0558d8 f5603g;

    /* JADX INFO: renamed from: m */
    public final C0558d8 f5604m;

    /* JADX INFO: renamed from: n */
    public C1087lx f5605n;

    /* JADX INFO: renamed from: o */
    public HttpURLConnection f5606o;

    /* JADX INFO: renamed from: p */
    public InputStream f5607p;

    /* JADX INFO: renamed from: q */
    public boolean f5608q;

    /* JADX INFO: renamed from: r */
    public int f5609r;

    /* JADX INFO: renamed from: s */
    public long f5610s;

    /* JADX INFO: renamed from: t */
    public long f5611t;

    public C0809jz(int i, int i2, C0558d8 c0558d8) {
        super(true);
        this.f5601e = i;
        this.f5602f = i2;
        this.f5603g = c0558d8;
        this.f5604m = new C0558d8((byte) 0, 29);
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws bl0 {
        boolean z;
        long j;
        long jMax;
        String str;
        this.f5605n = c1087lx;
        this.f5611t = 0L;
        this.f5610s = 0L;
        m992q();
        try {
            HttpURLConnection httpURLConnectionM3728t = m3728t(new URL(c1087lx.f6535a.toString()), c1087lx.f6536b, c1087lx.f6537c, c1087lx.f6539e, c1087lx.f6540f, (c1087lx.f6541g & 1) == 1, true, c1087lx.f6538d);
            long j2 = c1087lx.f6540f;
            long j3 = c1087lx.f6539e;
            this.f5606o = httpURLConnectionM3728t;
            this.f5609r = httpURLConnectionM3728t.getResponseCode();
            httpURLConnectionM3728t.getResponseMessage();
            int i = this.f5609r;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM3728t.getHeaderFields();
                if (this.f5609r == 416) {
                    String headerField = httpURLConnectionM3728t.getHeaderField("Content-Range");
                    Pattern pattern = fl0.f3846a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = fl0.f3847b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j3 == j) {
                        this.f5608q = z;
                        m993r(c1087lx);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM3728t.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC0102bk.m999b(errorStream);
                    } else {
                        int i2 = z42.f13274a;
                    }
                } catch (IOException unused) {
                    int i3 = z42.f13274a;
                }
                m3727s();
                throw new dl0(this.f5609r, this.f5609r == 416 ? new C1050kx(2008) : null, headerFields);
            }
            httpURLConnectionM3728t.getContentType();
            if (this.f5609r != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM3728t.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.f5610s = j2;
            } else {
                String headerField2 = httpURLConnectionM3728t.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM3728t.getHeaderField("Content-Range");
                Pattern pattern2 = fl0.f3846a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC1337qm.m5549m("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = fl0.f3846a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                try {
                                    AbstractC1337qm.m5542i0("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j5);
                                } catch (NumberFormatException unused3) {
                                    AbstractC1337qm.m5549m("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.f5610s = jMax != -1 ? jMax - j3 : -1L;
            }
            try {
                this.f5607p = httpURLConnectionM3728t.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f5607p = new GZIPInputStream(this.f5607p);
                }
                this.f5608q = true;
                m993r(c1087lx);
                try {
                    m3729u(j3);
                    return this.f5610s;
                } catch (IOException e) {
                    m3727s();
                    if (e instanceof bl0) {
                        throw ((bl0) e);
                    }
                    throw new bl0(e, 2000, 1);
                }
            } catch (IOException e2) {
                m3727s();
                throw new bl0(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m3727s();
            throw bl0.m1000a(e3, 1);
        }
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        try {
            InputStream inputStream = this.f5607p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = z42.f13274a;
                    throw new bl0(e, 2000, 3);
                }
            }
            this.f5607p = null;
            m3727s();
            if (this.f5608q) {
                this.f5608q = false;
                m990n();
            }
            this.f5606o = null;
            this.f5605n = null;
        } catch (Throwable th) {
            this.f5607p = null;
            m3727s();
            if (this.f5608q) {
                this.f5608q = false;
                m990n();
            }
            this.f5606o = null;
            this.f5605n = null;
            throw th;
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: j */
    public final Map mo3714j() {
        HttpURLConnection httpURLConnection = this.f5606o;
        return httpURLConnection == null ? pk1.f8924g : new C0771iz(httpURLConnection.getHeaderFields());
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        HttpURLConnection httpURLConnection = this.f5606o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C1087lx c1087lx = this.f5605n;
        if (c1087lx != null) {
            return c1087lx.f6535a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws bl0 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f5610s;
            if (j != -1) {
                long j2 = j - this.f5611t;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f5607p;
                    int i4 = z42.f13274a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f5611t += (long) i3;
                        m989k(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f5607p;
                int i5 = z42.f13274a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f5611t += (long) i3;
                    m989k(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            int i6 = z42.f13274a;
            throw bl0.m1000a(e, 2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3727s() {
        HttpURLConnection httpURLConnection = this.f5606o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC1337qm.m5551n("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final HttpURLConnection m3728t(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f5601e);
        httpURLConnection.setReadTimeout(this.f5602f);
        HashMap map2 = new HashMap();
        C0558d8 c0558d8 = this.f5603g;
        if (c0558d8 != null) {
            map2.putAll(c0558d8.m2254B());
        }
        map2.putAll(this.f5604m.m2254B());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = fl0.f3846a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = C1087lx.f6534h;
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
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: u */
    public final void m3729u(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.f5607p;
            int i = z42.f13274a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new bl0(new InterruptedIOException(), 2000, 1);
            }
            if (i2 == -1) {
                throw new bl0();
            }
            j -= (long) i2;
            m989k(i2);
        }
    }
}
