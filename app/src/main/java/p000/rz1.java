package p000;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f10164d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final tm0 f10165e = tm0.m6291m(2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, DevicePublicKeyStringDef.NONE);

    /* JADX INFO: renamed from: f */
    public static final tm0 f10166f = tm0.m6291m(3, "dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final tm0 f10167g = tm0.m6291m(2, "filled", "open");

    /* JADX INFO: renamed from: h */
    public static final tm0 f10168h = tm0.m6291m(3, "after", "before", "outside");

    /* JADX INFO: renamed from: a */
    public final int f10169a;

    /* JADX INFO: renamed from: b */
    public final int f10170b;

    /* JADX INFO: renamed from: c */
    public final int f10171c;

    public rz1(int i, int i2, int i3) {
        this.f10169a = i;
        this.f10170b = i2;
        this.f10171c = i3;
    }
}
