package p000;

import com.example.ssmousepro.FloatingService;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f5361b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f5362c;

    public /* synthetic */ jc0(FloatingService floatingService, int i, int i2) {
        this.f5360a = i2;
        this.f5361b = floatingService;
        this.f5362c = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.f5360a;
        int i2 = this.f5362c;
        FloatingService floatingService = this.f5361b;
        switch (i) {
            case 0:
                FloatingService.aguardarResolucaoEReconfigurar$lambda$335(floatingService, i2);
                break;
            default:
                FloatingService.aguardarCanalInjecao$lambda$12(floatingService, i2);
                break;
        }
    }
}
