package p000;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import io.github.muntashirakon.adb.PairingConnectionCtx;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends ki0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f1742q = 0;

    /* JADX INFO: renamed from: r */
    public Window f1743r;

    /* JADX INFO: renamed from: s */
    public final Object f1744s;

    public cb2(Window window, View view) {
        this.f1743r = window;
        this.f1744s = view;
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: F */
    public final void mo1202F() {
        switch (this.f1742q) {
            case 0:
                for (int i = 1; i <= 256; i <<= 1) {
                    if ((7 & i) != 0) {
                        Window window = this.f1743r;
                        if (i == 1) {
                            m1207f0(4);
                        } else if (i == 2) {
                            m1207f0(2);
                        } else if (i == 8) {
                            ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f1744s).hide(7);
                break;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: G */
    public final boolean mo1203G() {
        switch (this.f1742q) {
            case 0:
                return (this.f1743r.getDecorView().getSystemUiVisibility() & PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE) != 0;
            default:
                return (((WindowInsetsController) this.f1744s).getSystemBarsAppearance() & 8) != 0;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: W */
    public final void mo1204W(boolean z) {
        switch (this.f1742q) {
            case 0:
                Window window = this.f1743r;
                if (!z) {
                    m1208g0(16);
                } else {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    m1207f0(16);
                }
                break;
            default:
                Window window2 = this.f1743r;
                Object obj = this.f1744s;
                if (!z) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                    }
                    ((WindowInsetsController) obj).setSystemBarsAppearance(0, 16);
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
                    }
                    ((WindowInsetsController) obj).setSystemBarsAppearance(16, 16);
                }
                break;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: X */
    public final void mo1205X(boolean z) {
        switch (this.f1742q) {
            case 0:
                Window window = this.f1743r;
                if (!z) {
                    m1208g0(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                } else {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    m1207f0(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                }
                break;
            default:
                Window window2 = this.f1743r;
                Object obj = this.f1744s;
                if (!z) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    ((WindowInsetsController) obj).setSystemBarsAppearance(0, 8);
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                    }
                    ((WindowInsetsController) obj).setSystemBarsAppearance(8, 8);
                }
                break;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: a0 */
    public final void mo1206a0() {
        switch (this.f1742q) {
            case 0:
                m1208g0(2048);
                m1207f0(4096);
                break;
            default:
                ((WindowInsetsController) this.f1744s).setSystemBarsBehavior(2);
                break;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m1207f0(int i) {
        View decorView = this.f1743r.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: g0 */
    public void m1208g0(int i) {
        View decorView = this.f1743r.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public cb2(WindowInsetsController windowInsetsController) {
        this.f1744s = windowInsetsController;
    }
}
