package p000;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c00 implements ey1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1596a;

    @Override // p000.ey1
    public final Object get() {
        switch (this.f1596a) {
            case 0:
                byte[] bArr = new byte[12];
                e00.f3091i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new C1535vz();
            case 2:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (xd1) objInvoke;
                } catch (Exception e) {
                    lv1.m4302n(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
