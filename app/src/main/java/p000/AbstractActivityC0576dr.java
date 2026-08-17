package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0576dr extends Activity implements ms0, wq0 {
    private zs1 mExtraDataMap = new zs1();
    private os0 mLifecycleRegistry = new os0(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = i72.f4849a;
        }
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = i72.f4849a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated
    public <T extends AbstractC1674zq> T getExtraData(Class<T> cls) {
        if (this.mExtraDataMap.getOrDefault(cls, null) == null) {
            return null;
        }
        l41.m4035b();
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = cl1.f1855b;
        al1.m171b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        os0 os0Var = this.mLifecycleRegistry;
        os0Var.getClass();
        os0Var.m5052d("markState");
        os0Var.m5052d("setCurrentState");
        os0Var.m5054f(es0.f3435c);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(AbstractC1674zq abstractC1674zq) {
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean zM6104a = false;
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.getClass();
            switch (str) {
                case "--translation":
                    if (Build.VERSION.SDK_INT >= 31) {
                        zM6104a = true;
                        break;
                    }
                    break;
                case "--dump-dumpable":
                case "--list-dumpables":
                    zM6104a = AbstractC1408sj.m6104a();
                    break;
                case "--contentcapture":
                    if (Build.VERSION.SDK_INT >= 29) {
                        zM6104a = true;
                        break;
                    }
                    break;
                case "--autofill":
                    zM6104a = true;
                    break;
            }
        }
        return true ^ zM6104a;
    }

    @Override // p000.wq0
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
