package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class b11 extends AbstractC1459tx {

    /* JADX INFO: renamed from: a */
    public final int f1126a;

    public b11(IllegalStateException illegalStateException, c11 c11Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c11Var == null ? null : c11Var.f1614a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.f1126a = z42.f13274a >= 23 ? z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : z42.m7242p(z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
