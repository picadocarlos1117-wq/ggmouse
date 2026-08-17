package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.media3.p003ui.PlayerView;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.PlansBottomSheet;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.InputDeviceReader;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.local.SQLiteOverlayMigrationManager;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.installations.FirebaseInstallations;
import io.github.muntashirakon.adb.AdbConnection;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1430t4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10737b;

    public /* synthetic */ RunnableC1430t4(l80 l80Var, af1 af1Var) {
        this.f10736a = 14;
        this.f10737b = af1Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m6226a() {
        nd0 nd0Var = (nd0) this.f10737b;
        synchronized (nd0Var.f7376d) {
            try {
                if (nd0Var.f7380h == null) {
                    return;
                }
                try {
                    yd0 yd0VarM4530c = nd0Var.m4530c();
                    int i = yd0VarM4530c.f12964e;
                    if (i == 2) {
                        synchronized (nd0Var.f7376d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = u12.f11090a;
                        t12.m6181a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        bz1 bz1Var = nd0Var.f7375c;
                        Context context = nd0Var.f7373a;
                        bz1Var.getClass();
                        Typeface typefaceMo3231i = q32.f9322a.mo3231i(context, new yd0[]{yd0VarM4530c}, 0);
                        MappedByteBuffer mappedByteBufferM4653X = o21.m4653X(nd0Var.f7373a, yd0VarM4530c.f12960a);
                        if (mappedByteBufferM4653X == null || typefaceMo3231i == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            t12.m6181a("EmojiCompat.MetadataRepo.create");
                            C0599ed c0599ed = new C0599ed(typefaceMo3231i, o21.m4672n0(mappedByteBufferM4653X));
                            t12.m6182b();
                            t12.m6182b();
                            synchronized (nd0Var.f7376d) {
                                try {
                                    p32 p32Var = nd0Var.f7380h;
                                    if (p32Var != null) {
                                        p32Var.mo4712Y(c0599ed);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            nd0Var.m4529b();
                        } catch (Throwable th2) {
                            int i3 = u12.f11090a;
                            t12.m6182b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        int i4 = u12.f11090a;
                        t12.m6182b();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (nd0Var.f7376d) {
                        try {
                            p32 p32Var2 = nd0Var.f7380h;
                            if (p32Var2 != null) {
                                p32Var2.mo4711X(th4);
                            }
                            nd0Var.m4529b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10736a) {
            case 0:
                ((ListenerRegistration) this.f10737b).remove();
                return;
            case 1:
                ((AdbConnection) this.f10737b).lambda$createConnectionThread$0();
                return;
            case 2:
                AsyncQueue.lambda$panic$3((Throwable) this.f10737b);
                return;
            case 3:
                ((AsyncQueue.DelayedTask) this.f10737b).handleDelayElapsed();
                return;
            case 4:
                C1176ob c1176ob = (C1176ob) this.f10737b;
                synchronized (c1176ob.f7723a) {
                    try {
                        if (c1176ob.f7735m) {
                            return;
                        }
                        long j = c1176ob.f7734l - 1;
                        c1176ob.f7734l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            c1176ob.m4790a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (c1176ob.f7723a) {
                            c1176ob.f7736n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 5:
                C1442tg c1442tg = (C1442tg) this.f10737b;
                qo0 qo0Var = c1442tg.f10867d;
                if (qo0Var != null) {
                    qy1 qy1Var = (qy1) qo0Var.f9548b;
                    if (!qy1Var.f9608c && !qy1Var.f9607b) {
                        qo0Var.m5579B();
                    }
                }
                c1442tg.f10866c = null;
                return;
            case 6:
                ((C0106bo) this.f10737b).m1017s(true);
                return;
            case 7:
                ((AbstractActivityC0613er) this.f10737b).invalidateMenu();
                return;
            case 8:
                ViewTreeObserverOnDrawListenerC0540cr viewTreeObserverOnDrawListenerC0540cr = (ViewTreeObserverOnDrawListenerC0540cr) this.f10737b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0540cr.f2602b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0540cr.f2602b = null;
                    return;
                }
                return;
            case 9:
                DialogC0650fr.m2847a((DialogC0650fr) this.f10737b);
                return;
            case 10:
                C0808jy c0808jy = (C0808jy) this.f10737b;
                c0808jy.m3724k(c0808jy.m3719f(), 1028, new C0583dy(28));
                c0808jy.f5593f.m713d();
                return;
            case 11:
                C1423sy c1423sy = (C1423sy) this.f10737b;
                if (c1423sy.f10626h0 >= 300000) {
                    ((a11) c1423sy.f10637r.f8968a).f22T0 = true;
                    c1423sy.f10626h0 = 0L;
                    return;
                }
                return;
            case 12:
                ((q00) this.f10737b).m5383d(false);
                return;
            case 13:
                p40 p40Var = (p40) this.f10737b;
                boolean zIsPopupShowing = p40Var.f8703h.isPopupShowing();
                p40Var.m5200s(zIsPopupShowing);
                p40Var.f8708m = zIsPopupShowing;
                return;
            case 14:
                af1 af1Var = (af1) this.f10737b;
                try {
                    synchronized (af1Var) {
                    }
                    try {
                        af1Var.f216a.mo29d(af1Var.f219d, af1Var.f220e);
                        return;
                    } finally {
                        af1Var.m146b(true);
                    }
                } catch (t70 e) {
                    AbstractC1337qm.m5551n("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    ca0.m1184p(e);
                    return;
                }
            case 15:
                ((FirebaseInstallations) this.f10737b).lambda$getId$1();
                return;
            case 16:
                FloatingService.ativarCursorVirtualEdicao$lambda$32((bc1) this.f10737b);
                return;
            case 17:
                m6226a();
                return;
            case 18:
                ((IndexBackfiller.Scheduler) this.f10737b).lambda$scheduleBackfill$0();
                return;
            case 19:
                InputDeviceReader.start$lambda$3((InputDeviceReader) this.f10737b);
                return;
            case 20:
                ((LruGarbageCollector.GCScheduler) this.f10737b).lambda$scheduleGC$0();
                return;
            case 21:
                ((tc1) this.f10737b).mo4604p();
                return;
            case 22:
                ((PlansBottomSheet) this.f10737b).montarPlanos();
                return;
            case 23:
                ((zd1) this.f10737b).f13375m--;
                return;
            case 24:
                ((re1) this.f10737b).m5831o();
                return;
            case 25:
                ((PlayerView) this.f10737b).invalidate();
                return;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                kg1 kg1Var = (kg1) this.f10737b;
                os0 os0Var = kg1Var.f5803f;
                if (kg1Var.f5799b == 0) {
                    kg1Var.f5800c = true;
                    os0Var.m5053e(ds0.ON_PAUSE);
                }
                if (kg1Var.f5798a == 0 && kg1Var.f5800c) {
                    os0Var.m5053e(ds0.ON_STOP);
                    kg1Var.f5801d = true;
                    return;
                }
                return;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                ((li1) this.f10737b).mo1730m();
                return;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                sm1 sm1Var = ((rm1) this.f10737b).f10078i;
                sm1Var.f10439r.m6270a(new RunnableC1621ya(sm1Var, 25));
                return;
            default:
                ((SQLiteOverlayMigrationManager) this.f10737b).lambda$buildOverlays$0();
                return;
        }
    }

    public /* synthetic */ RunnableC1430t4(Object obj, int i) {
        this.f10736a = i;
        this.f10737b = obj;
    }
}
