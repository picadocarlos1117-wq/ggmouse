package com.example.ssmousepro;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.q60;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.MainActivity$carregarJogosSalvos$1$jogos$1", m5373f = "MainActivity.kt", m5374l = {}, m5375m = "invokeSuspend")
public final class MainActivity$carregarJogosSalvos$1$jogos$1 extends ny1 implements ch0 {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$carregarJogosSalvos$1$jogos$1(MainActivity mainActivity, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = mainActivity;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new MainActivity$carregarJogosSalvos$1$jogos$1(this.this$0, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((MainActivity$carregarJogosSalvos$1$jogos$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ua0.m6440Z(obj);
        SharedPreferences sharedPreferences = this.this$0.getSharedPreferences(AtalhosPrefs.PREFS_NAME, 0);
        Set<String> set = q60.f9397a;
        Set<String> stringSet = sharedPreferences.getStringSet("jogos_mapeados", set);
        if (stringSet != null) {
            set = stringSet;
        }
        PackageManager packageManager = this.this$0.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                applicationInfo.getClass();
                String string = applicationInfo.loadLabel(packageManager).toString();
                Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                str.getClass();
                arrayList.add(new Jogo(string, str, drawableLoadIcon));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList;
    }
}
