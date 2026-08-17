package p000;

import com.example.ssmousepro.injection.InputDeviceReader;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn0 implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9546a;

    public /* synthetic */ qn0(int i) {
        this.f9546a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f9546a) {
            case 0:
                return InputDeviceReader.escanearNovosDispositivos$lambda$29(file);
            default:
                return InputDeviceReader.abrirDispositivos$lambda$25(file);
        }
    }
}
