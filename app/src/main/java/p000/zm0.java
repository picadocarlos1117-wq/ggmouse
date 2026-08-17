package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum zm0 implements ho0 {
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f13490a;

    zm0(int i) {
        this.f13490a = i;
    }

    @Override // p000.ho0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f13490a;
        }
        f40.m2713i("Can't get the number of an unknown enum value.");
        return 0;
    }
}
