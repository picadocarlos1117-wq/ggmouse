package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 {

    /* JADX INFO: renamed from: a */
    public int f1068a;

    /* JADX INFO: renamed from: b */
    public int f1069b;

    /* JADX INFO: renamed from: c */
    public boolean f1070c;

    /* JADX INFO: renamed from: d */
    public boolean f1071d;

    /* JADX INFO: renamed from: e */
    public boolean f1072e;

    /* JADX INFO: renamed from: f */
    public int[] f1073f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f1074g;

    public av1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1074g = staggeredGridLayoutManager;
        m722a();
    }

    /* JADX INFO: renamed from: a */
    public final void m722a() {
        this.f1068a = -1;
        this.f1069b = Integer.MIN_VALUE;
        this.f1070c = false;
        this.f1071d = false;
        this.f1072e = false;
        int[] iArr = this.f1073f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
