package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface z01 {
    /* JADX INFO: renamed from: d */
    void mo4168d(int i);

    /* JADX INFO: renamed from: e */
    default boolean mo4169e(pn0 pn0Var) {
        return false;
    }

    void flush();

    /* JADX INFO: renamed from: g */
    MediaFormat mo4170g();

    /* JADX INFO: renamed from: h */
    void mo4171h();

    /* JADX INFO: renamed from: i */
    void mo4172i(Bundle bundle);

    /* JADX INFO: renamed from: j */
    void mo4173j(int i, long j);

    /* JADX INFO: renamed from: k */
    int mo4174k();

    /* JADX INFO: renamed from: l */
    void mo4175l(o11 o11Var, Handler handler);

    /* JADX INFO: renamed from: n */
    void mo4176n(int i, C0580dv c0580dv, long j, int i2);

    /* JADX INFO: renamed from: o */
    int mo4177o(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: q */
    void mo4178q(int i);

    void release();

    /* JADX INFO: renamed from: t */
    ByteBuffer mo4179t(int i);

    /* JADX INFO: renamed from: u */
    void mo4180u(Surface surface);

    /* JADX INFO: renamed from: w */
    ByteBuffer mo4181w(int i);

    /* JADX INFO: renamed from: z */
    void mo4182z(int i, int i2, long j, int i3);
}
