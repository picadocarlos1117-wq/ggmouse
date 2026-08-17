package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ql */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1336ql extends jj1 {

    /* JADX INFO: renamed from: a */
    public final Paint f9531a;

    /* JADX INFO: renamed from: b */
    public final List f9532b;

    public C1336ql() {
        Paint paint = new Paint();
        this.f9531a = paint;
        this.f9532b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.jj1
    /* JADX INFO: renamed from: b */
    public final void mo3655b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f9531a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f9532b.iterator();
        while (it.hasNext()) {
            ((xq0) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0539cq.f2590a;
            float f = 1.0f - TouchPipeline.SIZE;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * TouchPipeline.SIZE) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * TouchPipeline.SIZE) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * TouchPipeline.SIZE) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * TouchPipeline.SIZE) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1681A0()) {
                canvas2 = canvas;
                canvas2.drawLine(TouchPipeline.SIZE, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2040q.mo4603m(), TouchPipeline.SIZE, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2040q.mo4600j(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f2040q.mo4601k(), TouchPipeline.SIZE, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2040q.mo4602l(), TouchPipeline.SIZE, paint);
            }
            canvas = canvas2;
        }
    }
}
