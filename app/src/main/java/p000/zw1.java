package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum zw1 implements ho0 {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f13594a;

    zw1(int i) {
        this.f13594a = i;
    }

    @Override // p000.ho0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f13594a;
        }
        f40.m2713i("Can't get the number of an unknown enum value.");
        return 0;
    }
}
