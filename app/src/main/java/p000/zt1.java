package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class zt1 extends C0708hb {

    /* JADX INFO: renamed from: m */
    public final Socket f13562m;

    public zt1(Socket socket) {
        socket.getClass();
        this.f13562m = socket;
    }

    @Override // p000.C0708hb
    /* JADX INFO: renamed from: j */
    public final void mo3124j() {
        Socket socket = this.f13562m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!p32.m5149P(e)) {
                throw e;
            }
            ga1.f4121a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            ga1.f4121a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final IOException m7354k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
