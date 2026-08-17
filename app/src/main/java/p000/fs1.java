package p000;

import android.content.ServiceConnection;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.example.ssmousepro.PreferencesActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.firestore.core.TransactionRunner;
import com.google.firebase.firestore.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3893b;

    public /* synthetic */ fs1(Object obj, int i) {
        this.f3892a = i;
        this.f3893b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3892a;
        Object obj = this.f3893b;
        switch (i) {
            case 0:
                PreferencesActivity.shizukuBinderListener$lambda$1(((wf1) ((ms1) obj)).f12127a);
                break;
            case 1:
                PreferencesActivity.shizukuBinderDeadListener$lambda$3(((xf1) ((ls1) obj)).f12597a);
                break;
            case 2:
                ss1 ss1Var = (ss1) obj;
                HashSet hashSet = ss1Var.f10539a;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(ss1Var.f10540b);
                }
                hashSet.clear();
                ts1.m6335a(ss1Var);
                break;
            case 3:
                C0117c c0117c = (C0117c) obj;
                c0117c.f1592c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0117c.f1594e;
                m72 m72Var = sideSheetBehavior.f2096i;
                if (m72Var != null && m72Var.m4394f()) {
                    c0117c.m1091a(c0117c.f1591b);
                } else if (sideSheetBehavior.f2095h == 2) {
                    sideSheetBehavior.m1695w(c0117c.f1591b);
                }
                break;
            case 4:
                lu1 lu1Var = (lu1) obj;
                Surface surface = lu1Var.f6519m;
                if (surface != null) {
                    Iterator it2 = lu1Var.f6512a.iterator();
                    while (it2.hasNext()) {
                        ((c80) it2.next()).f1699a.m2748I(null);
                    }
                }
                SurfaceTexture surfaceTexture = lu1Var.f6518g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                lu1Var.f6518g = null;
                lu1Var.f6519m = null;
                break;
            case 5:
                ((TransactionRunner) obj).lambda$runWithBackoff$2();
                break;
            case 6:
                Util.lambda$crashMainThread$1((RuntimeException) obj);
                break;
            case 7:
                View view = (View) obj;
                ((InputMethodManager) AbstractC0075au.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                C0599ed c0599ed = (C0599ed) obj;
                ((no1) c0599ed.f3316d).m4581l(new uq1(c0599ed, 7));
                break;
        }
    }
}
