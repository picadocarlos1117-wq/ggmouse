package androidx.media;

import java.util.Arrays;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f779a;

    /* JADX INFO: renamed from: b */
    public int f780b;

    /* JADX INFO: renamed from: c */
    public int f781c;

    /* JADX INFO: renamed from: d */
    public int f782d;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f780b == audioAttributesImplBase.f780b) {
            int i2 = this.f781c;
            int i3 = audioAttributesImplBase.f781c;
            int i4 = audioAttributesImplBase.f782d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f779a;
                int i6 = AudioAttributesCompat.f775b;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f779a == audioAttributesImplBase.f779a && this.f782d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f780b), Integer.valueOf(this.f781c), Integer.valueOf(this.f779a), Integer.valueOf(this.f782d)});
    }

    public final String toString() {
        String strM3609g;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f782d != -1) {
            sb.append(" stream=");
            sb.append(this.f782d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f779a;
        int i2 = AudioAttributesCompat.f775b;
        switch (i) {
            case 0:
                strM3609g = "USAGE_UNKNOWN";
                break;
            case 1:
                strM3609g = "USAGE_MEDIA";
                break;
            case 2:
                strM3609g = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM3609g = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM3609g = "USAGE_ALARM";
                break;
            case 5:
                strM3609g = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM3609g = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM3609g = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM3609g = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM3609g = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM3609g = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM3609g = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM3609g = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM3609g = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM3609g = "USAGE_GAME";
                break;
            case 15:
            default:
                strM3609g = jd0.m3609g(i, "unknown usage ");
                break;
            case 16:
                strM3609g = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM3609g);
        sb.append(" content=");
        sb.append(this.f780b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f781c).toUpperCase());
        return sb.toString();
    }
}
