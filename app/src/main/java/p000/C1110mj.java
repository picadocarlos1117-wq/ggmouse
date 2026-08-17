package p000;

import com.example.ssmousepro.injection.IoctlHelper;
import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1110mj implements eh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6999a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7002d;

    public /* synthetic */ C1110mj(Method method, Object obj, Constructor constructor) {
        this.f7001c = method;
        this.f7000b = obj;
        this.f7002d = constructor;
    }

    @Override // p000.eh0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6999a;
        Object obj4 = this.f7002d;
        Object obj5 = this.f7001c;
        switch (i) {
            case 0:
                return BufferedChannel.m3935xc6272352(this.f7000b, (BufferedChannel) obj5, (SelectInstance) obj4, (Throwable) obj, obj2, (InterfaceC1456tu) obj3);
            default:
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                return Integer.valueOf(IoctlHelper.descobrir$lambda$7$lambda$6((Method) obj5, this.f7000b, (Constructor) obj4, (FileDescriptor) obj, iIntValue, iIntValue2));
        }
    }

    public /* synthetic */ C1110mj(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj) {
        this.f7000b = obj;
        this.f7001c = bufferedChannel;
        this.f7002d = selectInstance;
    }
}
