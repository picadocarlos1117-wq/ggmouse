package p000;

import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* JADX INFO: renamed from: ly */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1088ly {

    /* JADX INFO: renamed from: a */
    public boolean f6546a;

    /* JADX INFO: renamed from: b */
    public final Object f6547b;

    /* JADX INFO: renamed from: c */
    public Object f6548c;

    /* JADX INFO: renamed from: d */
    public final Object f6549d;

    /* JADX INFO: renamed from: e */
    public Object f6550e;

    /* JADX INFO: renamed from: f */
    public Object f6551f;

    public C1088ly(C0621ez c0621ez, k50 k50Var) {
        this.f6547b = c0621ez;
        this.f6551f = k50Var;
        this.f6548c = new HashMap();
        this.f6549d = new HashMap();
        this.f6546a = true;
    }

    /* JADX INFO: renamed from: a */
    public ey1 m4326a(int i) {
        ey1 c1646yz;
        HashMap map = (HashMap) this.f6548c;
        ey1 ey1Var = (ey1) map.get(Integer.valueOf(i));
        if (ey1Var != null) {
            return ey1Var;
        }
        final C0558d8 c0558d8 = (C0558d8) this.f6550e;
        c0558d8.getClass();
        final int i2 = 0;
        if (i != 0) {
            final int i3 = 1;
            if (i != 1) {
                final int i4 = 2;
                if (i != 2) {
                    final int i5 = 3;
                    if (i == 3) {
                        c1646yz = new C1646yz(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(p21.class), i2);
                    } else {
                        if (i != 4) {
                            f40.m2713i(jd0.m3609g(i, "Unrecognized contentType: "));
                            return null;
                        }
                        c1646yz = new ey1() { // from class: xz
                            @Override // p000.ey1
                            public final Object get() {
                                int i6 = i5;
                                InterfaceC0769ix interfaceC0769ix = c0558d8;
                                Object obj = this;
                                switch (i6) {
                                    case 0:
                                        return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                    case 1:
                                        return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                    case 2:
                                        return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                    default:
                                        return new yg1(interfaceC0769ix, (C0621ez) ((C1088ly) obj).f6547b);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(p21.class);
                    c1646yz = new ey1() { // from class: xz
                        @Override // p000.ey1
                        public final Object get() {
                            int i6 = i4;
                            InterfaceC0769ix interfaceC0769ix = c0558d8;
                            Object obj = genericDeclarationAsSubclass;
                            switch (i6) {
                                case 0:
                                    return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                case 1:
                                    return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                case 2:
                                    return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                                default:
                                    return new yg1(interfaceC0769ix, (C0621ez) ((C1088ly) obj).f6547b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(p21.class);
                c1646yz = new ey1() { // from class: xz
                    @Override // p000.ey1
                    public final Object get() {
                        int i6 = i3;
                        InterfaceC0769ix interfaceC0769ix = c0558d8;
                        Object obj = genericDeclarationAsSubclass2;
                        switch (i6) {
                            case 0:
                                return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                            case 1:
                                return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                            case 2:
                                return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                            default:
                                return new yg1(interfaceC0769ix, (C0621ez) ((C1088ly) obj).f6547b);
                        }
                    }
                };
            }
        } else {
            final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(p21.class);
            c1646yz = new ey1() { // from class: xz
                @Override // p000.ey1
                public final Object get() {
                    int i6 = i2;
                    InterfaceC0769ix interfaceC0769ix = c0558d8;
                    Object obj = genericDeclarationAsSubclass3;
                    switch (i6) {
                        case 0:
                            return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                        case 1:
                            return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                        case 2:
                            return C1683zz.m7390d((Class) obj, interfaceC0769ix);
                        default:
                            return new yg1(interfaceC0769ix, (C0621ez) ((C1088ly) obj).f6547b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i), c1646yz);
        return c1646yz;
    }

    public C1088ly(RewardedVideoActivity rewardedVideoActivity) {
        this.f6547b = rewardedVideoActivity;
        C1659zb c1659zb = C1659zb.f13327c;
        this.f6549d = k50.f5672d;
        this.f6550e = bz1.f1579d;
    }
}
