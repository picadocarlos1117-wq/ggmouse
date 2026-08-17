package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou0 {
    /* JADX INFO: renamed from: a */
    public abstract String mo2844a();

    /* JADX INFO: renamed from: b */
    public abstract nu0 mo2845b(hp0 hp0Var);

    /* JADX INFO: renamed from: c */
    public abstract v71 mo2846c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(mo2844a(), "policy");
        c1679zvM5176k0.m7362d("priority", String.valueOf(5));
        c1679zvM5176k0.m7361c("available", true);
        return c1679zvM5176k0.toString();
    }
}
