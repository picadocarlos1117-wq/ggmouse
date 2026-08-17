package p000;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 {

    /* JADX INFO: renamed from: a */
    public final TextView f1569a;

    /* JADX INFO: renamed from: b */
    public final TextView f1570b;

    /* JADX INFO: renamed from: c */
    public final ImageView f1571c;

    /* JADX INFO: renamed from: d */
    public final ImageView f1572d;

    /* JADX INFO: renamed from: e */
    public final ImageView f1573e;

    public by1(View view) {
        this.f1569a = (TextView) view.findViewById(R.id.text1);
        this.f1570b = (TextView) view.findViewById(R.id.text2);
        this.f1571c = (ImageView) view.findViewById(R.id.icon1);
        this.f1572d = (ImageView) view.findViewById(R.id.icon2);
        this.f1573e = (ImageView) view.findViewById(com.sousasantoslogic.sspro.R.id.edit_query);
    }
}
