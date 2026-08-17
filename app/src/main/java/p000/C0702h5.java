package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.AggregateQuery;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.core.TransactionRunner;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.GrpcCallProvider;
import com.google.firebase.firestore.util.Supplier;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0702h5 implements Continuation, yt0, xt0, a10, Supplier, InterfaceC0578dt, lo1, OnCompleteListener, ty1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4452c;

    public /* synthetic */ C0702h5(int i, Object obj, Object obj2) {
        this.f4450a = i;
        this.f4451b = obj;
        this.f4452c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:344:0x05d6 A[PHI: r11
  0x05d6: PHI (r11v22 int) = (r11v21 int), (r11v20 int), (r11v20 int), (r11v20 int) binds: [B:351:0x05ea, B:333:0x05b9, B:334:0x05bb, B:335:0x05bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:361:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:364:0x0625  */
    /* JADX WARN: Code duplicated, block: B:368:0x0635 A[Catch: all -> 0x0644, TryCatch #0 {all -> 0x0644, blocks: (B:366:0x0631, B:368:0x0635, B:371:0x0646, B:372:0x0650, B:374:0x0656, B:376:0x0663, B:378:0x0667), top: B:385:0x0631 }] */
    /* JADX WARN: Code duplicated, block: B:374:0x0656 A[Catch: all -> 0x0644, TryCatch #0 {all -> 0x0644, blocks: (B:366:0x0631, B:368:0x0635, B:371:0x0646, B:372:0x0650, B:374:0x0656, B:376:0x0663, B:378:0x0667), top: B:385:0x0631 }] */
    /* JADX WARN: Code duplicated, block: B:384:0x0671 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:385:0x0631 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.yt0
    /* JADX INFO: renamed from: a */
    public void mo2405a(Object obj, eb0 eb0Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        g21 g21Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        e00 e00Var;
        String str;
        Iterator it;
        d00 d00Var;
        h21 h21Var;
        be0 be0Var;
        z30 z30Var;
        int i14;
        C0808jy c0808jy = (C0808jy) this.f4451b;
        ee1 ee1Var = (ee1) this.f4452c;
        h21 h21Var2 = (h21) obj;
        SparseArray sparseArray = c0808jy.f5592e;
        SparseArray sparseArray2 = new SparseArray(eb0Var.f3306a.size());
        for (int i15 = 0; i15 < eb0Var.f3306a.size(); i15++) {
            int iM2564a = eb0Var.m2564a(i15);
            C1542w5 c1542w5 = (C1542w5) sparseArray.get(iM2564a);
            c1542w5.getClass();
            sparseArray2.append(iM2564a, c1542w5);
        }
        h21Var2.getClass();
        if (eb0Var.f3306a.size() == 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            boolean z3 = true;
            if (i16 >= eb0Var.f3306a.size()) {
                break;
            }
            int iM2564a2 = eb0Var.m2564a(i16);
            C1542w5 c1542w6 = (C1542w5) sparseArray2.get(iM2564a2);
            c1542w6.getClass();
            e00 e00Var2 = h21Var2.f4398b;
            if (iM2564a2 == 0) {
                synchronized (e00Var2) {
                    try {
                        e00Var2.f3095d.getClass();
                        t02 t02Var = e00Var2.f3096e;
                        e00Var2.f3096e = c1542w6.f11971b;
                        Iterator it2 = e00Var2.f3094c.values().iterator();
                        while (it2.hasNext()) {
                            d00 d00Var2 = (d00) it2.next();
                            if (!d00Var2.m2157b(t02Var, e00Var2.f3096e) || d00Var2.m2156a(c1542w6)) {
                                it2.remove();
                                if (d00Var2.f2697e) {
                                    if (d00Var2.f2693a.equals(e00Var2.f3097f)) {
                                        e00Var2.m2437a(d00Var2);
                                    }
                                    e00Var2.f3095d.m3093d(c1542w6, d00Var2.f2693a);
                                }
                            }
                        }
                        e00Var2.m2440d(c1542w6);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iM2564a2 == 11) {
                int i17 = h21Var2.f4407k;
                synchronized (e00Var2) {
                    try {
                        e00Var2.f3095d.getClass();
                        if (i17 != 0) {
                            z3 = false;
                        }
                        Iterator it3 = e00Var2.f3094c.values().iterator();
                        while (it3.hasNext()) {
                            d00 d00Var3 = (d00) it3.next();
                            if (d00Var3.m2156a(c1542w6)) {
                                it3.remove();
                                if (d00Var3.f2697e) {
                                    boolean zEquals = d00Var3.f2693a.equals(e00Var2.f3097f);
                                    if (z3 && zEquals) {
                                        boolean z4 = d00Var3.f2698f;
                                    }
                                    if (zEquals) {
                                        e00Var2.m2437a(d00Var3);
                                    }
                                    e00Var2.f3095d.m3093d(c1542w6, d00Var3.f2693a);
                                }
                            }
                        }
                        e00Var2.m2440d(c1542w6);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                e00Var2.m2441e(c1542w6);
            }
            i16++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (eb0Var.f3306a.get(0)) {
            C1542w5 c1542w7 = (C1542w5) sparseArray2.get(0);
            c1542w7.getClass();
            if (h21Var2.f4406j != null) {
                h21Var2.m3092c(c1542w7.f11971b, c1542w7.f11973d);
            }
        }
        if (eb0Var.f3306a.get(2) && h21Var2.f4406j != null) {
            om0 om0VarListIterator = ((f80) ee1Var).m2764k().f6157a.listIterator(0);
            loop4: while (true) {
                if (!om0VarListIterator.hasNext()) {
                    z30Var = null;
                    break;
                }
                k22 k22Var = (k22) om0VarListIterator.next();
                for (int i18 = 0; i18 < k22Var.f5651a; i18++) {
                    if (k22Var.f5655e[i18] && (z30Var = k22Var.f5652b.f12805d[i18].f1345r) != null) {
                        break loop4;
                    }
                }
            }
            if (z30Var != null) {
                PlaybackMetrics.Builder builderM2464i = e21.m2464i(h21Var2.f4406j);
                int i19 = 0;
                while (true) {
                    if (i19 >= z30Var.f13253d) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = z30Var.f13250a[i19].f12824b;
                    if (uuid.equals(AbstractC0794jk.f5436d)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(AbstractC0794jk.f5437e)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC0794jk.f5435c)) {
                            i14 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                builderM2464i.setDrmType(i14);
            }
        }
        if (eb0Var.f3306a.get(1011)) {
            h21Var2.f4422z++;
        }
        rd1 rd1Var = h21Var2.f4410n;
        if (rd1Var == null) {
            i11 = 1;
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
        } else {
            int i20 = rd1Var.f9910a;
            Context context = h21Var2.f4397a;
            boolean z5 = h21Var2.f4418v == 4;
            if (i20 == 1001) {
                g21Var = new g21(20, 0);
            } else {
                if (rd1Var instanceof t70) {
                    t70 t70Var = (t70) rd1Var;
                    z = t70Var.f10771c == 1;
                    i = t70Var.f10775g;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = rd1Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i21 = 28;
                    i2 = 6;
                    i3 = 8;
                    i4 = 7;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        g21Var = new g21(35, 0);
                    } else if (z && i == 3) {
                        g21Var = new g21(15, 0);
                    } else if (z && i == 2) {
                        g21Var = new g21(23, 0);
                    } else if (cause instanceof e11) {
                        i6 = 13;
                        g21Var = new g21(13, z42.m7242p(((e11) cause).f3156d));
                    } else {
                        i6 = 13;
                        if (cause instanceof b11) {
                            g21Var = new g21(14, ((b11) cause).f1126a);
                        } else if (cause instanceof OutOfMemoryError) {
                            g21Var = new g21(14, 0);
                        } else if (cause instanceof C1364rc) {
                            g21Var = new g21(17, ((C1364rc) cause).f9880a);
                        } else if (cause instanceof C1438tc) {
                            g21Var = new g21(18, ((C1438tc) cause).f10823a);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (z42.m7241o(errorCode)) {
                                case 6002:
                                    i21 = 24;
                                    break;
                                case 6003:
                                    break;
                                case 6004:
                                    i21 = 25;
                                    break;
                                case 6005:
                                    i21 = 26;
                                    break;
                                default:
                                    i21 = 27;
                                    break;
                            }
                            g21Var = new g21(i21, errorCode);
                        } else {
                            g21Var = new g21(22, 0);
                        }
                    }
                    i6 = 13;
                } else if (cause instanceof dl0) {
                    g21Var = new g21(5, ((dl0) cause).f2963c);
                } else {
                    if ((cause instanceof cl0) || (cause instanceof fc1)) {
                        i7 = 9;
                        i8 = 8;
                        i9 = 7;
                        i2 = 6;
                        g21Var = new g21(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof bl0;
                        if (z6 || (cause instanceof w32)) {
                            i7 = 9;
                            if (l81.m4141c(context).m4143d() == 1) {
                                g21Var = new g21(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i2 = 6;
                                    g21Var = new g21(6, 0);
                                    i5 = 9;
                                    i6 = 13;
                                    i3 = 8;
                                    i4 = 7;
                                } else {
                                    i2 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i9 = 7;
                                        g21Var = new g21(7, 0);
                                    } else {
                                        i9 = 7;
                                        if (z6 && ((bl0) cause).f1400b == 1) {
                                            g21Var = new g21(4, 0);
                                        } else {
                                            i8 = 8;
                                            g21Var = new g21(8, 0);
                                        }
                                    }
                                    i5 = 9;
                                    i4 = i9;
                                    i6 = 13;
                                    i3 = 8;
                                }
                            }
                        } else if (i20 == 1002) {
                            g21Var = new g21(21, 0);
                        } else if (cause instanceof a40) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iM7242p = z42.m7242p(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (z42.m7241o(iM7242p)) {
                                    case 6002:
                                        i10 = 24;
                                        break;
                                    case 6003:
                                        i10 = 28;
                                        break;
                                    case 6004:
                                        i10 = 25;
                                        break;
                                    case 6005:
                                        i10 = 26;
                                        break;
                                    default:
                                        i10 = 27;
                                        break;
                                }
                                g21Var = new g21(i10, iM7242p);
                            } else if (z42.f13274a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                g21Var = new g21(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                g21Var = new g21(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                g21Var = new g21(29, 0);
                            } else if (cause3 instanceof l42) {
                                g21Var = new g21(23, 0);
                            } else {
                                g21Var = cause3 instanceof AbstractC1645yy ? new g21(28, 0) : new g21(30, 0);
                            }
                        } else if ((cause instanceof v90) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            g21Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new g21(32, 0) : new g21(31, 0);
                        } else {
                            i7 = 9;
                            g21Var = new g21(9, 0);
                        }
                        i5 = i7;
                        i6 = 13;
                        i2 = 6;
                        i3 = 8;
                        i4 = 7;
                    }
                    i5 = i7;
                    i3 = i8;
                    i4 = i9;
                    i6 = 13;
                }
                h21Var2.f4399c.reportPlaybackErrorEvent(f21.m2680f().setTimeSinceCreatedMillis(jElapsedRealtime - h21Var2.f4400d).setErrorCode(g21Var.f4020a).setSubErrorCode(g21Var.f4021b).setException(rd1Var).build());
                i11 = 1;
                h21Var2.f4396A = true;
                h21Var2.f4410n = null;
            }
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
            h21Var2.f4399c.reportPlaybackErrorEvent(f21.m2680f().setTimeSinceCreatedMillis(jElapsedRealtime - h21Var2.f4400d).setErrorCode(g21Var.f4020a).setSubErrorCode(g21Var.f4021b).setException(rd1Var).build());
            i11 = 1;
            h21Var2.f4396A = true;
            h21Var2.f4410n = null;
        }
        if (eb0Var.f3306a.get(2)) {
            l22 l22VarM2764k = ((f80) ee1Var).m2764k();
            boolean zM4023a = l22VarM2764k.m4023a(2);
            boolean zM4023a2 = l22VarM2764k.m4023a(i11);
            boolean zM4023a3 = l22VarM2764k.m4023a(3);
            if (zM4023a || zM4023a2 || zM4023a3) {
                if (zM4023a) {
                    be0Var = null;
                } else {
                    be0 be0Var2 = h21Var2.f4414r;
                    int i22 = z42.f13274a;
                    be0Var = null;
                    if (!Objects.equals(be0Var2, null)) {
                        h21Var2.f4414r = null;
                        h21Var2.m3094e(1, jElapsedRealtime, null);
                    }
                }
                if (!zM4023a2) {
                    be0 be0Var3 = h21Var2.f4415s;
                    int i23 = z42.f13274a;
                    if (!Objects.equals(be0Var3, be0Var)) {
                        h21Var2.f4415s = be0Var;
                        h21Var2.m3094e(0, jElapsedRealtime, be0Var);
                    }
                }
                if (!zM4023a3) {
                    be0 be0Var4 = h21Var2.f4416t;
                    int i24 = z42.f13274a;
                    if (!Objects.equals(be0Var4, be0Var)) {
                        h21Var2.f4416t = be0Var;
                        h21Var2.m3094e(2, jElapsedRealtime, be0Var);
                    }
                }
            }
        }
        if (h21Var2.m3090a(h21Var2.f4411o)) {
            be0 be0Var5 = (be0) h21Var2.f4411o.f9548b;
            if (be0Var5.f1349v != -1) {
                be0 be0Var6 = h21Var2.f4414r;
                int i25 = z42.f13274a;
                if (!Objects.equals(be0Var6, be0Var5)) {
                    h21Var2.f4414r = be0Var5;
                    h21Var2.m3094e(1, jElapsedRealtime, be0Var5);
                }
                h21Var2.f4411o = null;
            }
        }
        if (h21Var2.m3090a(h21Var2.f4412p)) {
            be0 be0Var7 = (be0) h21Var2.f4412p.f9548b;
            be0 be0Var8 = h21Var2.f4415s;
            int i26 = z42.f13274a;
            if (!Objects.equals(be0Var8, be0Var7)) {
                h21Var2.f4415s = be0Var7;
                h21Var2.m3094e(0, jElapsedRealtime, be0Var7);
            }
            h21Var2.f4412p = null;
        }
        if (h21Var2.m3090a(h21Var2.f4413q)) {
            be0 be0Var9 = (be0) h21Var2.f4413q.f9548b;
            be0 be0Var10 = h21Var2.f4416t;
            int i27 = z42.f13274a;
            if (!Objects.equals(be0Var10, be0Var9)) {
                h21Var2.f4416t = be0Var9;
                h21Var2.m3094e(2, jElapsedRealtime, be0Var9);
            }
            h21Var2.f4413q = null;
        }
        switch (l81.m4141c(h21Var2.f4397a).m4143d()) {
            case 0:
                i12 = 0;
                break;
            case 1:
                i12 = i5;
                break;
            case 2:
                i12 = 2;
                break;
            case 3:
                i12 = 4;
                break;
            case 4:
                i12 = 5;
                break;
            case 5:
                i12 = i2;
                break;
            case 6:
            case 8:
            default:
                i12 = 1;
                break;
            case 7:
                i12 = 3;
                break;
            case 9:
                i12 = i3;
                break;
            case 10:
                i12 = i4;
                break;
        }
        if (i12 != h21Var2.f4409m) {
            h21Var2.f4409m = i12;
            h21Var2.f4399c.reportNetworkEvent(f21.m2679e().setNetworkType(i12).setTimeSinceCreatedMillis(jElapsedRealtime - h21Var2.f4400d).build());
        }
        f80 f80Var = (f80) ee1Var;
        if (f80Var.m2768o() != 2) {
            h21Var2.f4417u = false;
        }
        f80Var.m2753N();
        if (f80Var.f3697g0.f10376f == null) {
            h21Var2.f4419w = false;
            i13 = 10;
        } else {
            i13 = 10;
            if (eb0Var.f3306a.get(10)) {
                h21Var2.f4419w = true;
            }
        }
        int iM2768o = f80Var.m2768o();
        if (!h21Var2.f4417u) {
            if (!h21Var2.f4419w) {
                if (iM2768o == 4) {
                    i6 = 11;
                } else {
                    i6 = 12;
                    int i28 = 2;
                    if (iM2768o == 2) {
                        int i29 = h21Var2.f4408l;
                        if (i29 == 0 || i29 == 2 || i29 == 12) {
                            i6 = i28;
                        } else if (f80Var.m2767n()) {
                            f80Var.m2753N();
                            i6 = f80Var.f3697g0.f10384n != 0 ? i13 : i2;
                        } else {
                            i6 = i4;
                        }
                    } else {
                        i28 = 3;
                        if (iM2768o != 3) {
                            z2 = true;
                            if (iM2768o != 1 || h21Var2.f4408l == 0) {
                                i6 = h21Var2.f4408l;
                            }
                        } else if (f80Var.m2767n()) {
                            f80Var.m2753N();
                            if (f80Var.f3697g0.f10384n != 0) {
                                i6 = i5;
                            } else {
                                i6 = i28;
                            }
                        } else {
                            i6 = 4;
                        }
                    }
                }
            }
            if (h21Var2.f4408l != i6) {
                h21Var2.f4408l = i6;
                h21Var2.f4396A = z2;
                h21Var2.f4399c.reportPlaybackStateEvent(f21.m2682h().setState(h21Var2.f4408l).setTimeSinceCreatedMillis(jElapsedRealtime - h21Var2.f4400d).build());
            }
            if (eb0Var.f3306a.get(1028)) {
                e00Var = h21Var2.f4398b;
                C1542w5 c1542w8 = (C1542w5) sparseArray2.get(1028);
                c1542w8.getClass();
                synchronized (e00Var) {
                    try {
                        str = e00Var.f3097f;
                        if (str != null) {
                            d00 d00Var4 = (d00) e00Var.f3094c.get(str);
                            d00Var4.getClass();
                            e00Var.m2437a(d00Var4);
                        }
                        it = e00Var.f3094c.values().iterator();
                        while (it.hasNext()) {
                            d00Var = (d00) it.next();
                            it.remove();
                            if (!d00Var.f2697e && (h21Var = e00Var.f3095d) != null) {
                                h21Var.m3093d(c1542w8, d00Var.f2693a);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        i6 = 5;
        z2 = true;
        if (h21Var2.f4408l != i6) {
            h21Var2.f4408l = i6;
            h21Var2.f4396A = z2;
            h21Var2.f4399c.reportPlaybackStateEvent(f21.m2682h().setState(h21Var2.f4408l).setTimeSinceCreatedMillis(jElapsedRealtime - h21Var2.f4400d).build());
        }
        if (eb0Var.f3306a.get(1028)) {
            e00Var = h21Var2.f4398b;
            C1542w5 c1542w9 = (C1542w5) sparseArray2.get(1028);
            c1542w9.getClass();
            synchronized (e00Var) {
                str = e00Var.f3097f;
                if (str != null) {
                    d00 d00Var5 = (d00) e00Var.f3094c.get(str);
                    d00Var5.getClass();
                    e00Var.m2437a(d00Var5);
                }
                it = e00Var.f3094c.values().iterator();
                while (it.hasNext()) {
                    d00Var = (d00) it.next();
                    it.remove();
                    if (!d00Var.f2697e) {
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC0578dt
    public void accept(Object obj) {
        c40 c40Var = (c40) this.f4451b;
        ((v21) obj).mo63a(c40Var.f1662a, c40Var.f1663b, (b21) this.f4452c);
    }

    @Override // p000.lo1
    public Object apply(Object obj) {
        no1 no1Var = (no1) this.f4451b;
        C0674ge c0674ge = (C0674ge) this.f4452c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C1624yd c1624yd = no1Var.f7488d;
        ArrayList arrayListM4579g = no1Var.m4579g(sQLiteDatabase, c0674ge, c1624yd.f12956b);
        for (cg1 cg1Var : cg1.values()) {
            if (cg1Var != c0674ge.f4157c) {
                int size = c1624yd.f12956b - arrayListM4579g.size();
                if (size <= 0) {
                    break;
                }
                C1174o9 c1174o9M2960a = C0674ge.m2960a();
                c1174o9M2960a.m4756Y(c0674ge.f4155a);
                if (cg1Var == null) {
                    l41.m4051t("Null priority");
                    return null;
                }
                c1174o9M2960a.f7701d = cg1Var;
                c1174o9M2960a.f7700c = c0674ge.f4156b;
                arrayListM4579g.addAll(no1Var.m4579g(sQLiteDatabase, c1174o9M2960a.m4764j(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListM4579g.size(); i++) {
            sb.append(((C0564de) arrayListM4579g.get(i)).f2904a);
            if (i < arrayListM4579g.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new mo1(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM4579g.listIterator();
        while (listIterator.hasNext()) {
            C0564de c0564de = (C0564de) listIterator.next();
            long j2 = c0564de.f2904a;
            if (map.containsKey(Long.valueOf(j2))) {
                C1470u7 c1470u7M6919c = c0564de.f2906c.m6919c();
                for (mo1 mo1Var : (Set) map.get(Long.valueOf(j2))) {
                    c1470u7M6919c.m6399a(mo1Var.f7057a, mo1Var.f7058b);
                }
                listIterator.set(new C0564de(j2, c0564de.f2905b, c1470u7M6919c.m6401d()));
            }
        }
        return arrayListM4579g;
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public Object mo940b() {
        int i = this.f4450a;
        Object obj = this.f4452c;
        p42 p42Var = (p42) this.f4451b;
        switch (i) {
            case 15:
                Iterable iterable = (Iterable) obj;
                no1 no1Var = p42Var.f8718c;
                no1Var.getClass();
                if (iterable.iterator().hasNext()) {
                    no1Var.m4577c().compileStatement("DELETE FROM events WHERE _id in ".concat(no1.m4575o(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    p42Var.f8724i.m4580j(((Integer) entry.getValue()).intValue(), rv0.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // p000.a10
    /* JADX INFO: renamed from: c */
    public kk1 mo14c(int i, y12 y12Var, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        y12 y12Var2 = y12Var;
        int i6 = this.f4450a;
        Object obj = this.f4452c;
        x00 x00Var = (x00) this.f4451b;
        switch (i6) {
            case 4:
                int i7 = ((int[]) obj)[i];
                int i8 = x00Var.f4427e;
                int i9 = x00Var.f4428f;
                boolean z = x00Var.f4429g;
                if (i8 == Integer.MAX_VALUE || i9 == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < y12Var2.f12802a; i11++) {
                        be0 be0Var = y12Var2.f12805d[i11];
                        int i12 = be0Var.f1348u;
                        int i13 = be0Var.f1349v;
                        if (i12 > 0 && i13 > 0) {
                            if (!z) {
                                i4 = i8;
                                i5 = i9;
                            } else if ((i12 > i13) != (i8 > i9)) {
                                i5 = i8;
                                i4 = i9;
                            } else {
                                i4 = i8;
                                i5 = i9;
                            }
                            int i14 = i12 * i5;
                            int i15 = i13 * i4;
                            Point point = i14 >= i15 ? new Point(i4, z42.m7231e(i15, i12)) : new Point(z42.m7231e(i14, i13), i5);
                            int i16 = be0Var.f1348u;
                            int i17 = i16 * i13;
                            if (i16 >= ((int) (point.x * 0.98f)) && i13 >= ((int) (point.y * 0.98f)) && i17 < i10) {
                                i10 = i17;
                            }
                        }
                    }
                    i2 = i10;
                }
                nm0 nm0VarM5566m = qm0.m5566m();
                int i18 = 0;
                while (i18 < y12Var2.f12802a) {
                    be0 be0Var2 = y12Var2.f12805d[i18];
                    int i19 = be0Var2.f1348u;
                    int i20 = (i19 == -1 || (i3 = be0Var2.f1349v) == -1) ? -1 : i19 * i3;
                    nm0VarM5566m.m3901a(new c10(i, y12Var2, i18, x00Var, iArr[i18], i7, i2 == Integer.MAX_VALUE || (i20 != -1 && i20 <= i2)));
                    i18++;
                    y12Var2 = y12Var;
                }
                return nm0VarM5566m.m4561g();
            default:
                String str = (String) obj;
                nm0 nm0VarM5566m2 = qm0.m5566m();
                for (int i21 = 0; i21 < y12Var2.f12802a; i21++) {
                    nm0VarM5566m2.m3901a(new z00(i, y12Var2, i21, x00Var, iArr[i21], str));
                }
                return nm0VarM5566m2.m4561g();
        }
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        int i = this.f4450a;
        Object obj = this.f4452c;
        LocalStore localStore = (LocalStore) this.f4451b;
        switch (i) {
            case 7:
                return localStore.lambda$getNamedQuery$13((String) obj);
            case 8:
                return localStore.lambda$acknowledgeBatch$3((MutationBatchResult) obj);
            case 9:
                return localStore.lambda$collectGarbage$18((LruGarbageCollector) obj);
            default:
                return localStore.lambda$hasNewerBundle$9((BundleMetadata) obj);
        }
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        C1542w5 c1542w5 = (C1542w5) this.f4451b;
        b21 b21Var = (b21) this.f4452c;
        h21 h21Var = (h21) obj;
        h21Var.getClass();
        q21 q21Var = c1542w5.f11973d;
        if (q21Var == null) {
            return;
        }
        be0 be0Var = b21Var.f1130b;
        be0Var.getClass();
        e00 e00Var = h21Var.f4398b;
        t02 t02Var = c1542w5.f11971b;
        q21Var.getClass();
        qo0 qo0Var = new qo0(be0Var, e00Var.m2439c(t02Var, q21Var), 6, false);
        int i = b21Var.f1129a;
        if (i != 0) {
            if (i == 1) {
                h21Var.f4412p = qo0Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                h21Var.f4413q = qo0Var;
                return;
            }
        }
        h21Var.f4411o = qo0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f4450a;
        Object obj = this.f4452c;
        TransactionRunner transactionRunner = (TransactionRunner) this.f4451b;
        switch (i) {
            case 13:
                transactionRunner.lambda$runWithBackoff$0((Task) obj, task);
                break;
            default:
                transactionRunner.lambda$runWithBackoff$1((Transaction) obj, task);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.f4450a;
        Object obj = this.f4452c;
        Object obj2 = this.f4451b;
        switch (i) {
            case 0:
                return ((AggregateQuery) obj2).lambda$get$1((TaskCompletionSource) obj, task);
            case 1:
                return ((Datastore) obj2).lambda$runAggregateQuery$1((HashMap) obj, task);
            default:
                return ((GrpcCallProvider) obj2).lambda$createClientCall$0((u51) obj, task);
        }
    }
}
