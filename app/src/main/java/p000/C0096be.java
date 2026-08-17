package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0096be {

    /* JADX INFO: renamed from: a */
    public final long f1314a;

    public C0096be(long j) {
        this.f1314a = j;
    }

    /* JADX INFO: renamed from: a */
    public static C0096be m967a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C0096be c0096be = new C0096be(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c0096be;
                    }
                    C0096be c0096be2 = new C0096be(jsonReader.nextLong());
                    jsonReader.close();
                    return c0096be2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0096be) && this.f1314a == ((C0096be) obj).f1314a;
    }

    public final int hashCode() {
        long j = this.f1314a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f1314a + "}";
    }
}
