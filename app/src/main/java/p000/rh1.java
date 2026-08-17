package p000;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public final class rh1 extends BasicPermission {

    /* JADX INFO: renamed from: a */
    public final String f10046a;

    /* JADX INFO: renamed from: b */
    public final int f10047b;

    public rh1(String str) {
        super("BC", str);
        this.f10046a = str;
        StringTokenizer stringTokenizer = new StringTokenizer(yv1.m7154b(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i = 63;
            }
        }
        if (i != 0) {
            this.f10047b = i;
        } else {
            f40.m2713i("unknown permissions passed to mask");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rh1) {
            rh1 rh1Var = (rh1) obj;
            if (this.f10047b == rh1Var.f10047b && getName().equals(rh1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.f10046a;
    }

    public final int hashCode() {
        return getName().hashCode() + this.f10047b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof rh1) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = ((rh1) permission).f10047b;
        return (this.f10047b & i) == i;
    }
}
