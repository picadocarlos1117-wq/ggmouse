package p000;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m51 {

    /* JADX INFO: renamed from: a */
    public final qo0 f6642a;

    /* JADX INFO: renamed from: b */
    public final C1174o9 f6643b;

    /* JADX INFO: renamed from: c */
    public final HashMap f6644c;

    public m51(Context context, C1174o9 c1174o9) {
        qo0 qo0Var = new qo0(context);
        this.f6644c = new HashMap();
        this.f6642a = qo0Var;
        this.f6643b = c1174o9;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized b32 m4384a(String str) {
        if (this.f6644c.containsKey(str)) {
            return (b32) this.f6644c.get(str);
        }
        CctBackendFactory cctBackendFactoryM5585H = this.f6642a.m5585H(str);
        if (cctBackendFactoryM5585H == null) {
            return null;
        }
        C1174o9 c1174o9 = this.f6643b;
        b32 b32VarCreate = cctBackendFactoryM5585H.create(new C1513vd((Context) c1174o9.f7701d, (ax0) c1174o9.f7699b, (ax0) c1174o9.f7700c, str));
        this.f6644c.put(str, b32VarCreate);
        return b32VarCreate;
    }
}
