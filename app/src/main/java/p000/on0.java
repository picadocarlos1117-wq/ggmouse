package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1521vl f8408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(InputConnection inputConnection, C1521vl c1521vl) {
        super(inputConnection, false);
        this.f8408a = c1521vl;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0803jt ay0Var;
        pn0 pn0Var = inputContentInfo == null ? null : new pn0(new ba2(inputContentInfo));
        C1581x7 c1581x7 = (C1581x7) this.f8408a.f11701b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((ba2) pn0Var.f8968a).f1266a).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((ba2) pn0Var.f8968a).f1266a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((ba2) pn0Var.f8968a).f1266a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            ay0Var = new ay0(clipData, 2);
        } else {
            C1046kt c1046kt = new C1046kt();
            c1046kt.f5999b = clipData;
            c1046kt.f6000c = 2;
            ay0Var = c1046kt;
        }
        ay0Var.mo770f(inputContentInfo3.getLinkUri());
        ay0Var.setExtras(bundle2);
        if (i72.m3374f(c1581x7, ay0Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
