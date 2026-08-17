package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum jz1 implements ho0 {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f5621a;

    jz1(int i) {
        this.f5621a = i;
    }

    @Override // p000.ho0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5621a;
        }
        f40.m2713i("Can't get the number of an unknown enum value.");
        return 0;
    }
}
