package android.sun.security.util;

import android.sun.security.action.GetPropertyAction;
import java.math.BigInteger;
import java.security.AccessController;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class Debug {
    private static String args;
    private static final char[] hexDigits;
    private String prefix;

    static {
        args = (String) AccessController.doPrivileged(new GetPropertyAction("java.security.debug"));
        String str = (String) AccessController.doPrivileged(new GetPropertyAction("java.security.auth.debug"));
        if (args == null) {
            args = str;
        } else if (str != null) {
            args += "," + str;
        }
        String str2 = args;
        if (str2 != null) {
            String strMarshal = marshal(str2);
            args = strMarshal;
            if (strMarshal.equals("help")) {
                Help();
            }
        }
        hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static void Help() {
        System.err.println();
        System.err.println("all           turn on all debugging");
        System.err.println("access        print all checkPermission results");
        System.err.println("combiner      SubjectDomainCombiner debugging");
        System.err.println("gssloginconfig");
        System.err.println("configfile    JAAS ConfigFile loading");
        System.err.println("configparser  JAAS ConfigFile parsing");
        System.err.println("              GSS LoginConfigImpl debugging");
        System.err.println("jar           jar verification");
        System.err.println("logincontext  login context results");
        System.err.println("policy        loading and granting");
        System.err.println("provider      security provider debugging");
        System.err.println("scl           permissions SecureClassLoader assigns");
        System.err.println();
        System.err.println("The following can be used with access:");
        System.err.println();
        System.err.println("stack         include stack trace");
        System.err.println("domain        dump all domains in context");
        System.err.println("failure       before throwing exception, dump stack");
        System.err.println("              and domain that didn't have permission");
        System.err.println();
        System.err.println("The following can be used with stack and domain:");
        System.err.println();
        System.err.println("permission=<classname>");
        System.err.println("              only dump output if specified permission");
        System.err.println("              is being checked");
        System.err.println("codebase=<URL>");
        System.err.println("              only dump output if specified codebase");
        System.err.println("              is being checked");
        System.err.println();
        System.err.println("Note: Separate multiple options with a comma");
        System.exit(0);
    }

    public static Debug getInstance(String str, String str2) {
        if (!isOn(str)) {
            return null;
        }
        Debug debug = new Debug();
        debug.prefix = str2;
        return debug;
    }

    public static boolean isOn(String str) {
        String str2 = args;
        if (str2 == null) {
            return false;
        }
        return (str2.indexOf("all") == -1 && args.indexOf(str) == -1) ? false : true;
    }

    private static String marshal(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]=[a-zA-Z_$][a-zA-Z0-9_$]*([.][a-zA-Z_$][a-zA-Z0-9_$]*)*").matcher(new StringBuffer(str));
        StringBuffer stringBuffer2 = new StringBuffer();
        while (matcher.find()) {
            stringBuffer.append(matcher.group().replaceFirst("[Pp][Ee][Rr][Mm][Ii][Ss][Ss][Ii][Oo][Nn]=", "permission="));
            stringBuffer.append("  ");
            matcher.appendReplacement(stringBuffer2, "");
        }
        matcher.appendTail(stringBuffer2);
        Matcher matcher2 = Pattern.compile("[Cc][Oo][Dd][Ee][Bb][Aa][Ss][Ee]=[^, ;]*").matcher(stringBuffer2);
        StringBuffer stringBuffer3 = new StringBuffer();
        while (matcher2.find()) {
            stringBuffer.append(matcher2.group().replaceFirst("[Cc][Oo][Dd][Ee][Bb][Aa][Ss][Ee]=", "codebase="));
            stringBuffer.append("  ");
            matcher2.appendReplacement(stringBuffer3, "");
        }
        matcher2.appendTail(stringBuffer3);
        stringBuffer.append(stringBuffer3.toString().toLowerCase(Locale.ENGLISH));
        return stringBuffer.toString();
    }

    public static String toHexString(BigInteger bigInteger) {
        String string = bigInteger.toString(16);
        StringBuffer stringBuffer = new StringBuffer(string.length() * 2);
        if (string.startsWith("-")) {
            stringBuffer.append("   -");
            string = string.substring(1);
        } else {
            stringBuffer.append("    ");
        }
        if (string.length() % 2 != 0) {
            string = "0".concat(string);
        }
        int i = 0;
        while (i < string.length()) {
            int i2 = i + 2;
            stringBuffer.append(string.substring(i, i2));
            if (i2 != string.length()) {
                if (i2 % 64 == 0) {
                    stringBuffer.append("\n    ");
                } else if (i2 % 8 == 0) {
                    stringBuffer.append(" ");
                }
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    public static String toString(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 3);
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = b & 255;
            if (i != 0) {
                sb.append(':');
            }
            char[] cArr = hexDigits;
            sb.append(cArr[i2 >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public void println(String str) {
        System.err.println(this.prefix + ": " + str);
    }

    public static Debug getInstance(String str) {
        return getInstance(str, str);
    }

    public void println() {
        System.err.println(this.prefix + ":");
    }

    public static void println(String str, String str2) {
        System.err.println(str + ": " + str2);
    }
}
