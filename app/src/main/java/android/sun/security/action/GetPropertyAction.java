package android.sun.security.action;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class GetPropertyAction implements PrivilegedAction<String> {
    private String defaultVal;
    private String theProp;

    public GetPropertyAction(String str, String str2) {
        this.theProp = str;
        this.defaultVal = str2;
    }

    @Override // java.security.PrivilegedAction
    public String run() {
        String property = System.getProperty(this.theProp);
        return property == null ? this.defaultVal : property;
    }

    public GetPropertyAction(String str) {
        this.theProp = str;
    }
}
