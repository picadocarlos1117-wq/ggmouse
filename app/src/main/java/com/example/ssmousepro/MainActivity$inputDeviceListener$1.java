package com.example.ssmousepro;

import android.hardware.input.InputManager;
import p000.vw0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity$inputDeviceListener$1 implements InputManager.InputDeviceListener {
    final /* synthetic */ MainActivity this$0;

    public MainActivity$inputDeviceListener$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceAdded(int i) {
        MainActivity mainActivity = this.this$0;
        mainActivity.runOnUiThread(new vw0(mainActivity, 3));
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceChanged(int i) {
        MainActivity mainActivity = this.this$0;
        mainActivity.runOnUiThread(new vw0(mainActivity, 2));
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public void onInputDeviceRemoved(int i) {
        MainActivity mainActivity = this.this$0;
        mainActivity.runOnUiThread(new vw0(mainActivity, 1));
    }
}
