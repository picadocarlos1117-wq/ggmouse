package p000;

import java.util.Locale;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1422sx {

    /* JADX INFO: renamed from: a */
    public int f10570a;

    /* JADX INFO: renamed from: b */
    public int f10571b;

    /* JADX INFO: renamed from: c */
    public int f10572c;

    /* JADX INFO: renamed from: d */
    public int f10573d;

    /* JADX INFO: renamed from: e */
    public int f10574e;

    /* JADX INFO: renamed from: f */
    public int f10575f;

    /* JADX INFO: renamed from: g */
    public int f10576g;

    /* JADX INFO: renamed from: h */
    public int f10577h;

    /* JADX INFO: renamed from: i */
    public int f10578i;

    /* JADX INFO: renamed from: j */
    public int f10579j;

    /* JADX INFO: renamed from: k */
    public long f10580k;

    /* JADX INFO: renamed from: l */
    public int f10581l;

    public final String toString() {
        int i = this.f10570a;
        int i2 = this.f10571b;
        int i3 = this.f10572c;
        int i4 = this.f10573d;
        int i5 = this.f10574e;
        int i6 = this.f10575f;
        int i7 = this.f10576g;
        int i8 = this.f10577h;
        int i9 = this.f10578i;
        int i10 = this.f10579j;
        long j = this.f10580k;
        int i11 = this.f10581l;
        int i12 = z42.f13274a;
        Locale locale = Locale.US;
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        AbstractC1308pu.m5356w(sbM5345l, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC1308pu.m5356w(sbM5345l, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC1308pu.m5356w(sbM5345l, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC1308pu.m5356w(sbM5345l, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbM5345l.append(j);
        sbM5345l.append("\n videoFrameProcessingOffsetCount=");
        sbM5345l.append(i11);
        sbM5345l.append("\n}");
        return sbM5345l.toString();
    }
}
