package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class i90 implements InterfaceC1230on {

    /* JADX INFO: renamed from: c */
    public static final i90 f4881c = new i90("falcon-512", 9);

    /* JADX INFO: renamed from: d */
    public static final i90 f4882d = new i90("falcon-1024", 10);

    /* JADX INFO: renamed from: a */
    public final String f4883a;

    /* JADX INFO: renamed from: b */
    public final int f4884b;

    public i90(String str, int i) {
        if (i < 1 || i > 10) {
            f40.m2713i("Log N degree should be between 1 and 10");
            throw null;
        }
        this.f4883a = str;
        this.f4884b = i;
    }
}
