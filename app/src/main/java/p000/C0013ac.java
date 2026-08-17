package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: renamed from: ac */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0013ac extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0130cc f138a;

    public C0013ac(C0130cc c0130cc) {
        this.f138a = c0130cc;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0130cc c0130cc = this.f138a;
        c0130cc.m1209a(C1659zb.m7296b(c0130cc.f1745a, c0130cc.f1753i, c0130cc.f1752h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0130cc c0130cc = this.f138a;
        ay0 ay0Var = c0130cc.f1752h;
        int i = z42.f13274a;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo, ay0Var)) {
                c0130cc.f1752h = null;
                break;
            }
        }
        c0130cc.m1209a(C1659zb.m7296b(c0130cc.f1745a, c0130cc.f1753i, c0130cc.f1752h));
    }
}
