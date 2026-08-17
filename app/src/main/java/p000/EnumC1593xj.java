package p000;

/* JADX INFO: renamed from: xj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1593xj implements ho0 {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f12620a;

    EnumC1593xj(int i) {
        this.f12620a = i;
    }

    @Override // p000.ho0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f12620a;
        }
        f40.m2713i("Can't get the number of an unknown enum value.");
        return 0;
    }
}
