package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0617ev {

    /* JADX INFO: renamed from: a */
    public static final EnumC0617ev f3442a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0617ev[] f3443b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0617ev EF0;

    static {
        EnumC0617ev enumC0617ev = new EnumC0617ev("AGREEMENT", 0);
        EnumC0617ev enumC0617ev2 = new EnumC0617ev("ENCRYPTION", 1);
        EnumC0617ev enumC0617ev3 = new EnumC0617ev("DECRYPTION", 2);
        EnumC0617ev enumC0617ev4 = new EnumC0617ev("KEYGEN", 3);
        EnumC0617ev enumC0617ev5 = new EnumC0617ev("SIGNING", 4);
        EnumC0617ev enumC0617ev6 = new EnumC0617ev("VERIFYING", 5);
        EnumC0617ev enumC0617ev7 = new EnumC0617ev("AUTHENTICATION", 6);
        EnumC0617ev enumC0617ev8 = new EnumC0617ev("VERIFICATION", 7);
        EnumC0617ev enumC0617ev9 = new EnumC0617ev("PRF", 8);
        EnumC0617ev enumC0617ev10 = new EnumC0617ev("ANY", 9);
        f3442a = enumC0617ev10;
        f3443b = new EnumC0617ev[]{enumC0617ev, enumC0617ev2, enumC0617ev3, enumC0617ev4, enumC0617ev5, enumC0617ev6, enumC0617ev7, enumC0617ev8, enumC0617ev9, enumC0617ev10};
    }

    public static EnumC0617ev valueOf(String str) {
        return (EnumC0617ev) Enum.valueOf(EnumC0617ev.class, str);
    }

    public static EnumC0617ev[] values() {
        return (EnumC0617ev[]) f3443b.clone();
    }
}
