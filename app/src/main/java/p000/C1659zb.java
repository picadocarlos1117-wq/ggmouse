package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1659zb {

    /* JADX INFO: renamed from: c */
    public static final C1659zb f13327c = new C1659zb(qm0.m5570t(C1622yb.f12922d));

    /* JADX INFO: renamed from: d */
    public static final kk1 f13328d;

    /* JADX INFO: renamed from: e */
    public static final pk1 f13329e;

    /* JADX INFO: renamed from: a */
    public final SparseArray f13330a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f13331b;

    static {
        Object[] objArr = {2, 5, 6};
        o21.m4665k(3, objArr);
        f13328d = qm0.m5565k(3, objArr);
        C0082b0 c0082b0 = new C0082b0(4);
        c0082b0.m811n(5, 6);
        c0082b0.m811n(17, 6);
        c0082b0.m811n(7, 6);
        c0082b0.m811n(30, 10);
        c0082b0.m811n(18, 6);
        c0082b0.m811n(6, 8);
        c0082b0.m811n(8, 8);
        c0082b0.m811n(14, 8);
        f13329e = c0082b0.m803d();
    }

    public C1659zb(kk1 kk1Var) {
        for (int i = 0; i < kk1Var.f5898d; i++) {
            C1622yb c1622yb = (C1622yb) kk1Var.get(i);
            this.f13330a.put(c1622yb.f12923a, c1622yb);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f13330a.size(); i2++) {
            iMax = Math.max(iMax, ((C1622yb) this.f13330a.valueAt(i2)).f12924b);
        }
        this.f13331b = iMax;
    }

    /* JADX INFO: renamed from: a */
    public static kk1 m7295a(int[] iArr, int i) {
        nm0 nm0VarM5566m = qm0.m5566m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            nm0VarM5566m.m3901a(new C1622yb(i2, i));
        }
        return nm0VarM5566m.m4561g();
    }

    /* JADX INFO: renamed from: b */
    public static C1659zb m7296b(Context context, C1474ub c1474ub, ay0 ay0Var) {
        return m7297c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c1474ub, ay0Var);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0253  */
    /* JADX INFO: renamed from: c */
    public static C1659zb m7297c(Context context, Intent intent, C1474ub c1474ub, ay0 ay0Var) {
        ay0 ay0Var2;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (ay0Var != null) {
            ay0Var2 = ay0Var;
        } else {
            ay0Var2 = null;
            if (z42.f13274a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c1474ub.m6482a().f1096b);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        ay0Var2 = new ay0((AudioDeviceInfo) audioDevicesForAttributes.get(0), 7);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
        int i = z42.f13274a;
        pk1 pk1Var = f13329e;
        if (i >= 33 && (z42.m7215C(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c1474ub.m6482a().f1096b);
            HashMap map = new HashMap();
            map.put(2, new HashSet(rc2.m5779c(12)));
            for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
                AudioProfile audioProfileM6887f = AbstractC1585xb.m6887f(directProfilesForAttributes.get(i2));
                if (audioProfileM6887f.getEncapsulationType() != 1) {
                    int format = audioProfileM6887f.getFormat();
                    if (z42.m7213A(format) || pk1Var.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(rc2.m5779c(audioProfileM6887f.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(rc2.m5779c(audioProfileM6887f.getChannelMasks())));
                        }
                    }
                }
            }
            nm0 nm0VarM5566m = qm0.m5566m();
            for (Map.Entry entry : map.entrySet()) {
                nm0VarM5566m.m3901a(new C1622yb(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new C1659zb(nm0VarM5566m.m4561g());
        }
        if (i >= 23) {
            AudioDeviceInfo[] devices = ay0Var2 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) ay0Var2.f1096b};
            sm0 sm0Var = new sm0(4);
            sm0Var.m3902b(8, 7);
            if (i >= 31) {
                sm0Var.m3902b(26, 27);
            }
            if (i >= 33) {
                sm0Var.m3901a(30);
            }
            tm0 tm0VarM6116g = sm0Var.m6116g();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (tm0VarM6116g.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f13327c;
                }
            }
        }
        sm0 sm0Var2 = new sm0(4);
        sm0Var2.m3901a(2);
        int i3 = z42.f13274a;
        if (i3 >= 29 && (z42.m7215C(context) || (i3 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            nm0 nm0VarM5566m2 = qm0.m5566m();
            nk1 nk1Var = pk1Var.f8926b;
            if (nk1Var == null) {
                nk1 nk1Var2 = new nk1(pk1Var, new ok1(pk1Var.f8929e, 0, pk1Var.f8930f));
                pk1Var.f8926b = nk1Var2;
                nk1Var = nk1Var2;
            }
            AbstractC0570dk it = nk1Var.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (z42.f13274a >= z42.m7238l(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c1474ub.m6482a().f1096b)) {
                    nm0VarM5566m2.m3901a(num);
                }
            }
            nm0VarM5566m2.m3901a(2);
            kk1 kk1VarM4561g = nm0VarM5566m2.m4561g();
            kk1VarM4561g.getClass();
            sm0Var2.m3904d(kk1VarM4561g);
            return new C1659zb(m7295a(rc2.m5803s0(sm0Var2.m6116g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = z42.f13276c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    kk1 kk1Var = f13328d;
                    kk1Var.getClass();
                    sm0Var2.m3904d(kk1Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            kk1 kk1Var2 = f13328d;
            kk1Var2.getClass();
            sm0Var2.m3904d(kk1Var2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1659zb(m7295a(rc2.m5803s0(sm0Var2.m6116g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listM5779c = rc2.m5779c(intArrayExtra);
            listM5779c.getClass();
            sm0Var2.m3904d(listM5779c);
        }
        return new C1659zb(m7295a(rc2.m5803s0(sm0Var2.m6116g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX INFO: renamed from: d */
    public final Pair m7298d(C1474ub c1474ub, be0 be0Var) {
        String str = be0Var.f1341n;
        str.getClass();
        int iM6572b = v51.m6572b(str, be0Var.f1338k);
        Integer numValueOf = Integer.valueOf(iM6572b);
        pk1 pk1Var = f13329e;
        if (!pk1Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        if (iM6572b == 18 && !m7299e(18)) {
            iM6572b = 6;
        } else if ((iM6572b == 8 && !m7299e(8)) || (iM6572b == 30 && !m7299e(30))) {
            iM6572b = 7;
        }
        if (!m7299e(iM6572b)) {
            return null;
        }
        C1622yb c1622yb = (C1622yb) this.f13330a.get(iM6572b);
        c1622yb.getClass();
        int iIntValue = c1622yb.f12924b;
        tm0 tm0Var = c1622yb.f12925c;
        int i2 = be0Var.f1317C;
        boolean zContains = false;
        if (i2 == -1 || iM6572b == 18) {
            int i3 = be0Var.f1318D;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = c1622yb.f12923a;
            if (tm0Var == null) {
                if (z42.f13274a >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iM7240n = z42.m7240n(iIntValue);
                        if (iM7240n != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i3).setChannelMask(iM7240n).build(), (AudioAttributes) c1474ub.m6482a().f1096b)) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = pk1Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!be0Var.f1341n.equals("audio/vnd.dts.uhd;profile=p2") || z42.f13274a >= 33) {
            if (tm0Var != null) {
                int iM7240n2 = z42.m7240n(i2);
                if (iM7240n2 != 0) {
                    zContains = tm0Var.contains(Integer.valueOf(iM7240n2));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = z42.f13274a;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(z42.f13275b) && i == 1) {
            i = 2;
        }
        int iM7240n3 = z42.m7240n(i);
        if (iM7240n3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM6572b), Integer.valueOf(iM7240n3));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7299e(int i) {
        int i2 = z42.f13274a;
        return this.f13330a.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C1659zb) {
                C1659zb c1659zb = (C1659zb) obj;
                SparseArray sparseArray = c1659zb.f13330a;
                int i = z42.f13274a;
                SparseArray sparseArray2 = this.f13330a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (z42.f13274a >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                                    i2++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f13331b != c1659zb.f13331b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = z42.f13274a;
        SparseArray sparseArray = this.f13330a;
        if (i >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.f13331b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f13331b + ", audioProfiles=" + this.f13330a + "]";
    }
}
