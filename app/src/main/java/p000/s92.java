package p000;

import com.example.ssmousepro.activation.WifiAdbDaemonMain;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s92 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Socket f10329b;

    public /* synthetic */ s92(Socket socket, int i) {
        this.f10328a = i;
        this.f10329b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f10328a;
        Socket socket = this.f10329b;
        switch (i) {
            case 0:
                WifiAdbDaemonMain.loopComandos$lambda$21$lambda$19(socket);
                break;
            default:
                WifiAdbDaemonMain.loopEventos$lambda$13$lambda$11(socket);
                break;
        }
    }
}
