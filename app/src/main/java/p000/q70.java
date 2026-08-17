package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q70 {
    /* JADX INFO: renamed from: a */
    public static void m5449a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m5450b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m5451c(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }
}
