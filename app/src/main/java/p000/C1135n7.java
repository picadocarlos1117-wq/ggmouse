package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1135n7 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7299b;

    public /* synthetic */ C1135n7(Object obj, int i) {
        this.f7298a = i;
        this.f7299b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f7298a;
        Object obj = this.f7299b;
        switch (i) {
            case 0:
                ((AbstractC1172o7) obj).mo4388g();
                break;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    C0130cc c0130cc = (C0130cc) obj;
                    c0130cc.m1209a(C1659zb.m7297c(context, intent, c0130cc.f1753i, c0130cc.f1752h));
                }
                break;
            default:
                l81 l81Var = (l81) obj;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i2 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (z42.f13274a >= 29) {
                                            i2 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i2 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (z42.f13274a >= 29) {
                                            i2 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i2 = type != 9 ? 8 : 7;
                            } else {
                                i2 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (z42.f13274a < 31 || i2 != 5) {
                    l81.m4140a(l81Var, i2);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        k81 k81Var = new k81(l81Var);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), k81Var);
                        telephonyManager.unregisterTelephonyCallback(k81Var);
                    } catch (RuntimeException unused2) {
                        l81.m4140a(l81Var, 5);
                        return;
                    }
                }
                break;
        }
    }
}
