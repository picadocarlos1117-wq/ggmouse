package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;

/* JADX INFO: renamed from: mk */
/* JADX INFO: loaded from: classes3.dex */
public final class C1111mk implements InterfaceC1230on {

    /* JADX INFO: renamed from: d */
    public static final C1111mk f7014d = new C1111mk("mceliece348864", 12, 3488, 64, false);

    /* JADX INFO: renamed from: e */
    public static final C1111mk f7015e = new C1111mk("mceliece348864f", 12, 3488, 64, true);

    /* JADX INFO: renamed from: f */
    public static final C1111mk f7016f = new C1111mk("mceliece460896", 13, 4608, 96, false);

    /* JADX INFO: renamed from: g */
    public static final C1111mk f7017g = new C1111mk("mceliece460896f", 13, 4608, 96, true);

    /* JADX INFO: renamed from: m */
    public static final C1111mk f7018m = new C1111mk("mceliece6688128", 13, 6688, 128, false);

    /* JADX INFO: renamed from: n */
    public static final C1111mk f7019n = new C1111mk("mceliece6688128f", 13, 6688, 128, true);

    /* JADX INFO: renamed from: o */
    public static final C1111mk f7020o = new C1111mk("mceliece6960119", 13, 6960, 119, false);

    /* JADX INFO: renamed from: p */
    public static final C1111mk f7021p = new C1111mk("mceliece6960119f", 13, 6960, 119, true);

    /* JADX INFO: renamed from: q */
    public static final C1111mk f7022q = new C1111mk("mceliece8192128", 13, PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE, 128, false);

    /* JADX INFO: renamed from: r */
    public static final C1111mk f7023r = new C1111mk("mceliece8192128f", 13, PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE, 128, true);

    /* JADX INFO: renamed from: a */
    public final String f7024a;

    /* JADX INFO: renamed from: b */
    public final int f7025b;

    /* JADX INFO: renamed from: c */
    public final C1074lk f7026c;

    public C1111mk(String str, int i, int i2, int i3, boolean z) {
        this.f7024a = str;
        this.f7025b = i3;
        C1074lk c1074lk = new C1074lk();
        c1074lk.f6380j = z;
        c1074lk.f6371a = i2;
        c1074lk.f6372b = i3;
        c1074lk.f6373c = i;
        c1074lk.f6374d = i3 * 2;
        int i4 = i3 * i;
        c1074lk.f6375e = i4;
        c1074lk.f6376f = i2 - i4;
        boolean z2 = true;
        c1074lk.f6377g = (1 << i) - 1;
        c1074lk.f6378h = i == 12 ? new sh0(0) : new sh0(z2 ? 1 : 0);
        c1074lk.f6379i = i3 % 8 != 0;
        this.f7026c = c1074lk;
    }
}
