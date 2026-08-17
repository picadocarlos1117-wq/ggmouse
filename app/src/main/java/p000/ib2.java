package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum ib2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(TouchPipeline.SIZE)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC0753ik.f5042b),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a */
    public final Object f4928a;

    ib2(Serializable serializable) {
        this.f4928a = serializable;
    }
}
