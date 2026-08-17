package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f1221a;

    public b60(KeyListener keyListener) {
        this.f1221a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1221a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1221a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zM2252k;
        if (i != 67) {
            zM2252k = i != 112 ? false : C0558d8.m2252k(editable, keyEvent, true);
        } else {
            zM2252k = C0558d8.m2252k(editable, keyEvent, false);
        }
        if (!zM2252k) {
            return this.f1221a.onKeyDown(view, editable, i, keyEvent);
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1221a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1221a.onKeyUp(view, editable, i, keyEvent);
    }
}
