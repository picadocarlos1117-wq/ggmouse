package p000;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 {

    /* JADX INFO: renamed from: a */
    public final Bundle f11698a;

    /* JADX INFO: renamed from: b */
    public final HashSet f11699b;

    public vk1(Bundle bundle, HashSet hashSet) {
        this.f11698a = bundle;
        this.f11699b = hashSet;
    }

    /* JADX INFO: renamed from: a */
    public static RemoteInput m6641a(vk1 vk1Var) {
        vk1Var.getClass();
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("wifi_pair_code").setLabel("Código de 6 dígitos").setChoices(null).setAllowFreeFormInput(true).addExtras(vk1Var.f11698a);
        Iterator it = vk1Var.f11699b.iterator();
        while (it.hasNext()) {
            tk1.m6288d(builderAddExtras, (String) it.next(), true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            uk1.m6505b(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
