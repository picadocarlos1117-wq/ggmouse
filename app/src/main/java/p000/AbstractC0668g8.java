package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0668g8 {
    /* JADX INFO: renamed from: a */
    public static boolean m2939a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0803jt ay0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                ay0Var = new ay0(clipData, 3);
            } else {
                C1046kt c1046kt = new C1046kt();
                c1046kt.f5999b = clipData;
                c1046kt.f6000c = 3;
                ay0Var = c1046kt;
            }
            i72.m3374f(textView, ay0Var.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2940b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0803jt ay0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            ay0Var = new ay0(clipData, 3);
        } else {
            C1046kt c1046kt = new C1046kt();
            c1046kt.f5999b = clipData;
            c1046kt.f6000c = 3;
            ay0Var = c1046kt;
        }
        i72.m3374f(view, ay0Var.build());
        return true;
    }
}
