package p000;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 extends AbstractC0099bh {

    /* JADX INFO: renamed from: e */
    public final int f12439e;

    /* JADX INFO: renamed from: f */
    public final byte[] f12440f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f12441g;

    /* JADX INFO: renamed from: m */
    public Uri f12442m;

    /* JADX INFO: renamed from: n */
    public DatagramSocket f12443n;

    /* JADX INFO: renamed from: o */
    public MulticastSocket f12444o;

    /* JADX INFO: renamed from: p */
    public InetAddress f12445p;

    /* JADX INFO: renamed from: q */
    public boolean f12446q;

    /* JADX INFO: renamed from: r */
    public int f12447r;

    public x32() {
        super(true);
        this.f12439e = 8000;
        byte[] bArr = new byte[2000];
        this.f12440f = bArr;
        this.f12441g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: c */
    public final long mo3053c(C1087lx c1087lx) throws w32 {
        Uri uri = c1087lx.f6535a;
        this.f12442m = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f12442m.getPort();
        m992q();
        try {
            this.f12445p = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f12445p, port);
            if (this.f12445p.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f12444o = multicastSocket;
                multicastSocket.joinGroup(this.f12445p);
                this.f12443n = this.f12444o;
            } else {
                this.f12443n = new DatagramSocket(inetSocketAddress);
            }
            this.f12443n.setSoTimeout(this.f12439e);
            this.f12446q = true;
            m993r(c1087lx);
            return -1L;
        } catch (IOException e) {
            throw new w32(e, 2001);
        } catch (SecurityException e2) {
            throw new w32(e2, 2006);
        }
    }

    @Override // p000.InterfaceC0807jx
    public final void close() {
        this.f12442m = null;
        MulticastSocket multicastSocket = this.f12444o;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f12445p;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f12444o = null;
        }
        DatagramSocket datagramSocket = this.f12443n;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12443n = null;
        }
        this.f12445p = null;
        this.f12447r = 0;
        if (this.f12446q) {
            this.f12446q = false;
            m990n();
        }
    }

    @Override // p000.InterfaceC0807jx
    /* JADX INFO: renamed from: o */
    public final Uri mo3054o() {
        return this.f12442m;
    }

    @Override // p000.InterfaceC0693gx
    public final int read(byte[] bArr, int i, int i2) throws w32 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12447r;
        DatagramPacket datagramPacket = this.f12441g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f12443n;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f12447r = length;
                m989k(length);
            } catch (SocketTimeoutException e) {
                throw new w32(e, 2002);
            } catch (IOException e2) {
                throw new w32(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f12447r;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f12440f, length2 - i4, bArr, i, iMin);
        this.f12447r -= iMin;
        return iMin;
    }
}
