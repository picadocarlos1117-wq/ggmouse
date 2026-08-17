package p000;

import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.example.ssmousepro.LoginActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.iid.ServiceStarter;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: vl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1521vl implements Continuation, xt0, a10, InterfaceC1167o2, Deferred.DeferredHandler, InterfaceC0136ci, zk1, OnSuccessListener, Supplier, InterfaceC0777j4, l11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11701b;

    public /* synthetic */ C1521vl(C1542w5 c1542w5, Object obj, long j) {
        this.f11700a = 5;
        this.f11701b = obj;
    }

    @Override // p000.zk1
    /* JADX INFO: renamed from: a */
    public void mo6522a(long j, dc1 dc1Var) {
        ki0.m3869o(j, dc1Var, ((fg0) this.f11701b).f3789H);
    }

    @Override // p000.l11
    /* JADX INFO: renamed from: b */
    public int mo1189b(Object obj) {
        be0 be0Var = (be0) this.f11701b;
        c11 c11Var = (c11) obj;
        String str = c11Var.f1615b;
        return ((str.equals(be0Var.f1341n) || str.equals(m11.m4349b(be0Var))) && c11Var.m1108c(be0Var, false)) ? 1 : 0;
    }

    @Override // p000.a10
    /* JADX INFO: renamed from: c */
    public kk1 mo14c(int i, y12 y12Var, int[] iArr) {
        x00 x00Var = (x00) this.f11701b;
        nm0 nm0VarM5566m = qm0.m5566m();
        for (int i2 = 0; i2 < y12Var.f12802a; i2++) {
            nm0VarM5566m.m3901a(new u00(i, y12Var, i2, x00Var, iArr[i2]));
        }
        return nm0VarM5566m.m4561g();
    }

    /* JADX INFO: renamed from: d */
    public C1583x9 m6642d(C1174o9 c1174o9) throws IOException {
        C1558wl c1558wl = (C1558wl) this.f11701b;
        URL url = (URL) c1174o9.f7699b;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c1558wl.f12217g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c1174o9.f7701d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c1558wl.f12211a.encode((C1439td) c1174o9.f7700c, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    hr1.m3272h("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    hr1.m3272h("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C1583x9(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C1583x9(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C1583x9 c1583x9 = new C1583x9(responseCode, null, C0096be.m967a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1314a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c1583x9;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e) {
            e = e;
            hr1.m3274j(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new C1583x9(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            hr1.m3274j(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new C1583x9(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            hr1.m3274j(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new C1583x9(ServiceStarter.ERROR_UNKNOWN, null, 0L);
        } catch (IOException e4) {
            e = e4;
            hr1.m3274j(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new C1583x9(400, null, 0L);
        }
    }

    @Override // p000.InterfaceC0136ci
    /* JADX INFO: renamed from: f */
    public long mo1221f(long j) {
        db0 db0Var = (db0) this.f11701b;
        return z42.m7234h((j * ((long) db0Var.f2863e)) / 1000000, 0L, db0Var.f2868j - 1);
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        int i = this.f11700a;
        Object obj = this.f11701b;
        switch (i) {
            case 23:
                return ((IndexBackfiller) obj).lambda$backfill$0();
            default:
                return ((LocalStore) obj).lambda$getFieldIndexes$14();
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((FirebaseAuthCredentialsProvider) this.f11701b).lambda$new$1(provider);
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        int i = this.f11700a;
        Object obj2 = this.f11701b;
        switch (i) {
            case 3:
                ((h21) obj).f4410n = (rd1) obj2;
                break;
            case 4:
                C1422sx c1422sx = (C1422sx) obj2;
                h21 h21Var = (h21) obj;
                h21Var.f4420x += c1422sx.f10576g;
                h21Var.f4421y += c1422sx.f10574e;
                break;
            case 5:
                ((h21) obj).getClass();
                break;
            case 6:
            case 7:
            case 8:
            default:
                ((ce1) obj).onMetadata((k51) obj2);
                break;
            case 9:
                ((ce1) obj).onMediaMetadataChanged((d21) obj2);
                break;
            case 10:
                ((ce1) obj).onTrackSelectionParametersChanged((h22) obj2);
                break;
            case 11:
                ((ce1) obj).onCues((C1048kv) obj2);
                break;
            case 12:
                ((ce1) obj).onMediaMetadataChanged(((c80) obj2).f1699a.f3672O);
                break;
        }
    }

    @Override // p000.InterfaceC0777j4
    public void onActivityResult(Object obj) {
        LoginActivity.googleLauncher$lambda$0((LoginActivity) this.f11701b, (C0738i4) obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.f11700a;
        mk0 mk0Var = (mk0) this.f11701b;
        switch (i) {
            case 19:
                int i2 = HiddenActivity.f650c;
                mk0Var.invoke(obj);
                break;
            case 20:
                int i3 = HiddenActivity.f650c;
                mk0Var.invoke(obj);
                break;
            case 21:
                int i4 = HiddenActivity.f650c;
                mk0Var.invoke(obj);
                break;
            default:
                int i5 = HiddenActivity.f650c;
                mk0Var.invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.f11700a;
        Object obj = this.f11701b;
        switch (i) {
            case 2:
                return ((Datastore) obj).lambda$commit$0(task);
            case 16:
                return ((FirebaseFirestore) obj).lambda$getNamedQuery$8(task);
            default:
                return ((Query) obj).lambda$get$1(task);
        }
    }

    public /* synthetic */ C1521vl(C1542w5 c1542w5, Object obj, int i) {
        this.f11700a = i;
        this.f11701b = obj;
    }

    public /* synthetic */ C1521vl(Object obj, int i) {
        this.f11700a = i;
        this.f11701b = obj;
    }
}
