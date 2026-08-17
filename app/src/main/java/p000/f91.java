package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum f91 implements ho0 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f3726a;

    f91(int i) {
        this.f3726a = i;
    }

    @Override // p000.ho0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f3726a;
        }
        f40.m2713i("Can't get the number of an unknown enum value.");
        return 0;
    }
}
