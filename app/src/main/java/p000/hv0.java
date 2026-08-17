package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.example.ssmousepro.injection.TouchPipeline;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 implements qx1 {

    /* JADX INFO: renamed from: g */
    public static final Object f4718g = new Object();

    /* JADX INFO: renamed from: m */
    public static hv0 f4719m;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4720a;

    /* JADX INFO: renamed from: b */
    public final Object f4721b;

    /* JADX INFO: renamed from: c */
    public final Serializable f4722c;

    /* JADX INFO: renamed from: d */
    public final Serializable f4723d;

    /* JADX INFO: renamed from: e */
    public final Object f4724e;

    /* JADX INFO: renamed from: f */
    public final Object f4725f;

    public hv0(j32 j32Var, HashMap map, HashMap map2, HashMap map3) {
        this.f4720a = 2;
        this.f4721b = j32Var;
        this.f4722c = map2;
        this.f4723d = map3;
        this.f4725f = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        j32Var.m3545d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f4724e = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static hv0 m3297a(Context context) {
        hv0 hv0Var;
        synchronized (f4718g) {
            try {
                if (f4719m == null) {
                    f4719m = new hv0(context.getApplicationContext());
                }
                hv0Var = f4719m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hv0Var;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3298b(Intent intent) {
        int iMatch;
        synchronized (((HashMap) this.f4722c)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.f4721b).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.f4723d).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        gv0 gv0Var = (gv0) arrayList.get(i);
                        if (z) {
                            Objects.toString(gv0Var.f4332a);
                        }
                        if (!gv0Var.f4334c && (iMatch = gv0Var.f4332a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(gv0Var);
                            gv0Var.f4334c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((gv0) arrayList2.get(i2)).f4334c = false;
                        }
                        ((ArrayList) this.f4724e).add(new qo0(intent, arrayList2, 3, false));
                        if (!((HandlerC1170o5) this.f4725f).hasMessages(1)) {
                            ((HandlerC1170o5) this.f4725f).sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: c */
    public int mo2822c(long j) {
        long[] jArr = (long[]) this.f4724e;
        int iM7227a = z42.m7227a(jArr, j, false);
        if (iM7227a < jArr.length) {
            return iM7227a;
        }
        return -1;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: d */
    public long mo2823d(int i) {
        return ((long[]) this.f4724e)[i];
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: e */
    public List mo2824e(long j) {
        j32 j32Var = (j32) this.f4721b;
        Map map = (Map) this.f4725f;
        HashMap map2 = (HashMap) this.f4722c;
        HashMap map3 = (HashMap) this.f4723d;
        ArrayList arrayList = new ArrayList();
        j32Var.m3547g(j, j32Var.f5261h, arrayList);
        TreeMap treeMap = new TreeMap();
        j32Var.m3549i(j, false, j32Var.f5261h, treeMap);
        j32Var.m3548h(j, map, map2, j32Var.f5261h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                m32 m32Var = (m32) map2.get(pair.first);
                m32Var.getClass();
                arrayList2.add(new C0805jv(null, null, null, bitmapDecodeByteArray, m32Var.f6616c, 0, m32Var.f6618e, m32Var.f6615b, 0, Integer.MIN_VALUE, -3.4028235E38f, m32Var.f6619f, m32Var.f6620g, false, -16777216, m32Var.f6623j, TouchPipeline.SIZE));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            m32 m32Var2 = (m32) map2.get(entry.getKey());
            m32Var2.getClass();
            C0767iv c0767iv = (C0767iv) entry.getValue();
            CharSequence charSequence = c0767iv.f5164a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (u10 u10Var : (u10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u10.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(u10Var), spannableStringBuilder.getSpanEnd(u10Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = m32Var2.f6616c;
            int i10 = m32Var2.f6617d;
            c0767iv.f5168e = f;
            c0767iv.f5169f = i10;
            c0767iv.f5170g = m32Var2.f6618e;
            c0767iv.f5171h = m32Var2.f6615b;
            c0767iv.f5175l = m32Var2.f6619f;
            float f2 = m32Var2.f6622i;
            int i11 = m32Var2.f6621h;
            c0767iv.f5174k = f2;
            c0767iv.f5173j = i11;
            c0767iv.f5179p = m32Var2.f6623j;
            arrayList2.add(c0767iv.m3495a());
        }
        return arrayList2;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: g */
    public int mo2825g() {
        return ((long[]) this.f4724e).length;
    }

    public String toString() {
        switch (this.f4720a) {
            case 1:
                List list = (List) this.f4724e;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f4721b) + ", mProviderPackage: " + ((String) this.f4722c) + ", mQuery: " + ((String) this.f4723d) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public hv0(String str, String str2, String str3, List list) {
        this.f4720a = 1;
        str.getClass();
        this.f4721b = str;
        str2.getClass();
        this.f4722c = str2;
        this.f4723d = str3;
        list.getClass();
        this.f4724e = list;
        this.f4725f = jd0.m3617o(str, "-", str2, "-", str3);
    }

    public hv0(Context context) {
        this.f4720a = 0;
        this.f4722c = new HashMap();
        this.f4723d = new HashMap();
        this.f4724e = new ArrayList();
        this.f4721b = context;
        this.f4725f = new HandlerC1170o5(this, context.getMainLooper(), 2);
    }
}
