package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1173o8 implements InterfaceC1471u8, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogInterfaceC1394s5 f7681a;

    /* JADX INFO: renamed from: b */
    public C1286p8 f7682b;

    /* JADX INFO: renamed from: c */
    public CharSequence f7683c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1508v8 f7684d;

    public DialogInterfaceOnClickListenerC1173o8(C1508v8 c1508v8) {
        this.f7684d = c1508v8;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: b */
    public final boolean mo4719b() {
        DialogInterfaceC1394s5 dialogInterfaceC1394s5 = this.f7681a;
        if (dialogInterfaceC1394s5 != null) {
            return dialogInterfaceC1394s5.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: c */
    public final int mo4720c() {
        return 0;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: d */
    public final void mo4721d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1471u8
    public final void dismiss() {
        DialogInterfaceC1394s5 dialogInterfaceC1394s5 = this.f7681a;
        if (dialogInterfaceC1394s5 != null) {
            dialogInterfaceC1394s5.dismiss();
            this.f7681a = null;
        }
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: f */
    public final CharSequence mo4722f() {
        return this.f7683c;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: h */
    public final Drawable mo4723h() {
        return null;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: i */
    public final void mo4724i(CharSequence charSequence) {
        this.f7683c = charSequence;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: k */
    public final void mo4725k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: m */
    public final void mo4726m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: n */
    public final void mo4727n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: o */
    public final void mo4728o(int i, int i2) {
        if (this.f7682b == null) {
            return;
        }
        C1508v8 c1508v8 = this.f7684d;
        C1357r5 c1357r5 = new C1357r5(c1508v8.getPopupContext());
        CharSequence charSequence = this.f7683c;
        if (charSequence != null) {
            c1357r5.setTitle(charSequence);
        }
        C1286p8 c1286p8 = this.f7682b;
        int selectedItemPosition = c1508v8.getSelectedItemPosition();
        C1133n5 c1133n5 = c1357r5.f9726a;
        c1133n5.f7230o = c1286p8;
        c1133n5.f7231p = this;
        c1133n5.f7234s = selectedItemPosition;
        c1133n5.f7233r = true;
        DialogInterfaceC1394s5 dialogInterfaceC1394s5Create = c1357r5.create();
        this.f7681a = dialogInterfaceC1394s5Create;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1394s5Create.f10235a.f9369f;
        AbstractC1099m8.m4409d(alertController$RecycleListView, i);
        AbstractC1099m8.m4408c(alertController$RecycleListView, i2);
        this.f7681a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1508v8 c1508v8 = this.f7684d;
        c1508v8.setSelection(i);
        if (c1508v8.getOnItemClickListener() != null) {
            c1508v8.performItemClick(null, i, this.f7682b.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: p */
    public final int mo4729p() {
        return 0;
    }

    @Override // p000.InterfaceC1471u8
    /* JADX INFO: renamed from: q */
    public final void mo4730q(ListAdapter listAdapter) {
        this.f7682b = (C1286p8) listAdapter;
    }
}
