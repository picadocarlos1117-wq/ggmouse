package p000;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1169o4 extends AbstractC1095m4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f7645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0815k4 f7646c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1356r4 f7647d;

    public /* synthetic */ C1169o4(AbstractC1356r4 abstractC1356r4, String str, AbstractC0815k4 abstractC0815k4, int i) {
        this.f7644a = i;
        this.f7647d = abstractC1356r4;
        this.f7645b = str;
        this.f7646c = abstractC0815k4;
    }

    @Override // p000.AbstractC1095m4
    /* JADX INFO: renamed from: a */
    public final void mo4381a(Object obj) {
        int i = this.f7644a;
        String str = this.f7645b;
        AbstractC1356r4 abstractC1356r4 = this.f7647d;
        AbstractC0815k4 abstractC0815k4 = this.f7646c;
        switch (i) {
            case 0:
                Integer num = (Integer) abstractC1356r4.f9710b.get(str);
                if (num == null) {
                    ca0.m1188t("Attempting to launch an unregistered ActivityResultLauncher with contract ", abstractC0815k4, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                abstractC1356r4.f9712d.add(str);
                try {
                    abstractC1356r4.mo5689b(num.intValue(), abstractC0815k4, obj);
                    return;
                } catch (Exception e) {
                    abstractC1356r4.f9712d.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) abstractC1356r4.f9710b.get(str);
                if (num2 == null) {
                    ca0.m1188t("Attempting to launch an unregistered ActivityResultLauncher with contract ", abstractC0815k4, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                abstractC1356r4.f9712d.add(str);
                try {
                    abstractC1356r4.mo5689b(num2.intValue(), abstractC0815k4, obj);
                    return;
                } catch (Exception e2) {
                    abstractC1356r4.f9712d.remove(str);
                    throw e2;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4710b() {
        this.f7647d.m5693f(this.f7645b);
    }
}
