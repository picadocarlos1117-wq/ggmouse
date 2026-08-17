package p000;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f5439a;

    public jk1(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f5439a = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public static qo0 m3658a(jk1 jk1Var, String str) {
        jk1Var.getClass();
        str.getClass();
        Matcher matcher = jk1Var.f5439a.matcher(str);
        matcher.getClass();
        if (matcher.find(0)) {
            return new qo0(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.f5439a.toString();
        string.getClass();
        return string;
    }
}
