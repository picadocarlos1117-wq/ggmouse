package p000;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface y41 extends z41 {
    ec1 getParserForType();

    int getSerializedSize();

    x41 newBuilderForType();

    byte[] toByteArray();

    void writeTo(OutputStream outputStream);

    void writeTo(AbstractC1153np abstractC1153np);
}
