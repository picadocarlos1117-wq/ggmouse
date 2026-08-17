package p000;

/* JADX INFO: renamed from: rz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1387rz {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10161a;

    static {
        int[] iArr = new int[ds0.values().length];
        try {
            iArr[ds0.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ds0.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ds0.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ds0.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ds0.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ds0.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ds0.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f10161a = iArr;
    }
}
