package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ml1 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f7037a;

    /* JADX INFO: renamed from: b */
    public final Configuration f7038b;

    /* JADX INFO: renamed from: c */
    public final int f7039c;

    public ml1(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f7037a = colorStateList;
        this.f7038b = configuration;
        this.f7039c = theme == null ? 0 : theme.hashCode();
    }
}
