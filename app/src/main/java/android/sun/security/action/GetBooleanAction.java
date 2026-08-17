package android.sun.security.action;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class GetBooleanAction implements PrivilegedAction<Boolean> {
    private String theProp;

    public GetBooleanAction(String str) {
        this.theProp = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.security.PrivilegedAction
    public Boolean run() {
        return Boolean.valueOf(Boolean.getBoolean(this.theProp));
    }
}
