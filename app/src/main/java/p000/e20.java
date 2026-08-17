package p000;

import android.content.res.AssetManager;
import android.os.Build;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class e20 {

    /* JADX INFO: renamed from: a */
    public final Executor f3172a;

    /* JADX INFO: renamed from: b */
    public final lg1 f3173b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3174c;

    /* JADX INFO: renamed from: d */
    public final File f3175d;

    /* JADX INFO: renamed from: e */
    public final String f3176e;

    /* JADX INFO: renamed from: f */
    public boolean f3177f = false;

    /* JADX INFO: renamed from: g */
    public f20[] f3178g;

    /* JADX INFO: renamed from: h */
    public byte[] f3179h;

    public e20(AssetManager assetManager, Executor executor, lg1 lg1Var, String str, File file) {
        this.f3172a = executor;
        this.f3173b = lg1Var;
        this.f3176e = str;
        this.f3175d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                case 29:
                case 30:
                    bArr = ua0.f11238j;
                    break;
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                case 32:
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    bArr = ua0.f11237i;
                    break;
            }
        }
        this.f3174c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m2450a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2451b(int i, Serializable serializable) {
        this.f3172a.execute(new d20(this, i, 0, serializable));
    }
}
