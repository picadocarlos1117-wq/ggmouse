package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 {

    /* JADX INFO: renamed from: a */
    public final int f8891a;

    /* JADX INFO: renamed from: b */
    public final int f8892b;

    /* JADX INFO: renamed from: c */
    public final long f8893c;

    /* JADX INFO: renamed from: d */
    public final long f8894d;

    public pg1(int i, int i2, long j, long j2) {
        this.f8891a = i;
        this.f8892b = i2;
        this.f8893c = j;
        this.f8894d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static pg1 m5256a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            pg1 pg1Var = new pg1(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return pg1Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5257b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f8891a);
            dataOutputStream.writeInt(this.f8892b);
            dataOutputStream.writeLong(this.f8893c);
            dataOutputStream.writeLong(this.f8894d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pg1)) {
            pg1 pg1Var = (pg1) obj;
            if (this.f8892b == pg1Var.f8892b && this.f8893c == pg1Var.f8893c && this.f8891a == pg1Var.f8891a && this.f8894d == pg1Var.f8894d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8892b), Long.valueOf(this.f8893c), Integer.valueOf(this.f8891a), Long.valueOf(this.f8894d));
    }
}
