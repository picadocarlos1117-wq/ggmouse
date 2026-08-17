package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f12845a;

    /* JADX INFO: renamed from: b */
    public final k50 f12846b;

    public y50(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        k50 k50Var = new k50((byte) 0, 21);
        super(inputConnection, false);
        this.f12845a = textView;
        this.f12846b = k50Var;
        if (t50.f10753j != null) {
            t50 t50VarM6231a = t50.m6231a();
            if (t50VarM6231a.m6232b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            p50 p50Var = t50VarM6231a.f10758e;
            p50Var.getClass();
            Bundle bundle = editorInfo.extras;
            q51 q51Var = (q51) p50Var.f8727c.f3313a;
            int iM2406a = q51Var.m2406a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM2406a != 0 ? ((ByteBuffer) q51Var.f3076d).getInt(iM2406a + q51Var.f3073a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f12845a.getEditableText();
        this.f12846b.getClass();
        return k50.m3796w(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f12845a.getEditableText();
        this.f12846b.getClass();
        return k50.m3796w(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
