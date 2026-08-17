package io.github.muntashirakon.adb;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p000.AbstractC1308pu;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class LocalServices {
    public static final int BACKUP = 14;
    public static final int CONNECT_JDWP = 10;
    public static final int FILE = 3;
    public static final int FRAMEBUFFER = 9;
    public static final int LOCAL_UNIX_SOCKET = 5;
    public static final int LOCAL_UNIX_SOCKET_ABSTRACT = 7;
    public static final int LOCAL_UNIX_SOCKET_FILE_SYSTEM = 8;
    public static final int LOCAL_UNIX_SOCKET_RESERVED = 6;
    public static final int REMOUNT = 2;
    public static final int RESTORE = 15;
    public static final int REVERSE = 13;
    static final int SERVICE_FIRST = 1;
    static final int SERVICE_LAST = 15;
    public static final int SHELL = 1;
    public static final int SYNC = 12;
    public static final int TCP_CONNECT = 4;
    public static final int TRACK_JDWP = 11;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Services {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String getDestination(int i, String... strArr) {
        StringBuilder sb = new StringBuilder(getServiceName(i));
        switch (i) {
            case 1:
                for (String str : strArr) {
                    if (str.contains("\"")) {
                        f40.m2713i("Arguments for inline shell cannot contain double quotations.");
                        return null;
                    }
                    if (str.contains(" ")) {
                        sb.append("\"");
                        sb.append(str);
                        sb.append("\"");
                    } else {
                        sb.append(str);
                    }
                }
                return sb.toString();
            case 2:
                sb.append(TextUtils.join(" ", strArr));
                return sb.toString();
            case 3:
                if (strArr.length == 0) {
                    f40.m2713i("File name must be specified.");
                    return null;
                }
                if (strArr.length != 1) {
                    f40.m2713i(AbstractC1308pu.m5341h(new StringBuilder("Service expects exactly one argument, "), strArr.length, " supplied."));
                    return null;
                }
                String str2 = strArr[0];
                Objects.requireNonNull(str2);
                sb.append(str2);
                return sb.toString();
            case 4:
                if (strArr.length == 0) {
                    f40.m2713i("Port number must be specified.");
                    return null;
                }
                if (strArr.length == 1) {
                    sb.append(strArr[0]);
                } else {
                    if (strArr.length != 2) {
                        f40.m2713i("Invalid number of arguments supplied.");
                        return null;
                    }
                    String str3 = strArr[0];
                    Objects.requireNonNull(str3);
                    sb.append(str3);
                    sb.append(':');
                    String str4 = strArr[1];
                    Objects.requireNonNull(str4);
                    sb.append(str4);
                }
                return sb.toString();
            case 5:
            case 6:
            case 7:
            case 8:
                if (strArr.length == 0) {
                    f40.m2713i("Path must be specified.");
                    return null;
                }
                if (strArr.length != 1) {
                    f40.m2713i(AbstractC1308pu.m5341h(new StringBuilder("Service expects exactly one argument, "), strArr.length, " supplied."));
                    return null;
                }
                String str5 = strArr[0];
                Objects.requireNonNull(str5);
                sb.append(str5);
                return sb.toString();
            case 9:
            case 11:
            case 12:
            case 15:
                if (strArr.length != 0) {
                    f40.m2713i("Service expects no arguments.");
                    return null;
                }
                return sb.toString();
            case 10:
                if (strArr.length == 0) {
                    f40.m2713i("PID must be specified.");
                    return null;
                }
                if (strArr.length != 1) {
                    f40.m2713i(AbstractC1308pu.m5341h(new StringBuilder("Service expects exactly one argument, "), strArr.length, " supplied."));
                    return null;
                }
                String str6 = strArr[0];
                Objects.requireNonNull(str6);
                sb.append(str6);
                return sb.toString();
            case 13:
                if (strArr.length == 0) {
                    f40.m2713i("Forward command must be specified.");
                    return null;
                }
                if (strArr.length != 1) {
                    f40.m2713i(AbstractC1308pu.m5341h(new StringBuilder("Service expects exactly one argument, "), strArr.length, " supplied."));
                    return null;
                }
                String str7 = strArr[0];
                if (str7 == null) {
                    f40.m2713i("Forward command is empty");
                    return null;
                }
                if ("list-forward".equals(str7) || "killforward-all".equals(strArr[0]) || strArr[0].startsWith("forward:") || strArr[0].startsWith("killforward:")) {
                    sb.append(strArr[0]);
                    return sb.toString();
                }
                f40.m2713i("Invalid forward command.");
                return null;
            case 14:
                if (strArr.length == 0) {
                    f40.m2713i("At least one package must be specified or use -shared/-all.");
                    return null;
                }
                sb.append(TextUtils.join(" ", strArr));
                return sb.toString();
            default:
                return sb.toString();
        }
    }

    public static String getServiceName(int i) {
        switch (i) {
            case 1:
                return "shell:";
            case 2:
                return "remount:";
            case 3:
                return "dev:";
            case 4:
                return "tcp:";
            case 5:
                return "local:";
            case 6:
                return "localreserved:";
            case 7:
                return "localabstract:";
            case 8:
                return "localfilesystem:";
            case 9:
                return "framebuffer:";
            case 10:
                return "jdwp:";
            case 11:
                return "track-jdwp";
            case 12:
                return "sync:";
            case 13:
                return "reverse:";
            case 14:
                return "backup:";
            case 15:
                return "restore:";
            default:
                f40.m2713i(jd0.m3609g(i, "Invalid service: "));
                return null;
        }
    }
}
