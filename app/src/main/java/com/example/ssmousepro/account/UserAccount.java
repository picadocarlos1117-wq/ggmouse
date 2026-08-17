package com.example.ssmousepro.account;

import p000.AbstractC1308pu;
import p000.hp0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class UserAccount {
    private final long accessExpiresAt;
    private final String email;
    private final boolean trialGranted;
    private final String uid;

    public UserAccount(String str, String str2, long j, boolean z) {
        str.getClass();
        str2.getClass();
        this.uid = str;
        this.email = str2;
        this.accessExpiresAt = j;
        this.trialGranted = z;
    }

    public static /* synthetic */ UserAccount copy$default(UserAccount userAccount, String str, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAccount.uid;
        }
        if ((i & 2) != 0) {
            str2 = userAccount.email;
        }
        if ((i & 4) != 0) {
            j = userAccount.accessExpiresAt;
        }
        if ((i & 8) != 0) {
            z = userAccount.trialGranted;
        }
        boolean z2 = z;
        return userAccount.copy(str, str2, j, z2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.email;
    }

    public final long component3() {
        return this.accessExpiresAt;
    }

    public final boolean component4() {
        return this.trialGranted;
    }

    public final UserAccount copy(String str, String str2, long j, boolean z) {
        str.getClass();
        str2.getClass();
        return new UserAccount(str, str2, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccount)) {
            return false;
        }
        UserAccount userAccount = (UserAccount) obj;
        return hp0.m3214e(this.uid, userAccount.uid) && hp0.m3214e(this.email, userAccount.email) && this.accessExpiresAt == userAccount.accessExpiresAt && this.trialGranted == userAccount.trialGranted;
    }

    public final long getAccessExpiresAt() {
        return this.accessExpiresAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getTrialGranted() {
        return this.trialGranted;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.trialGranted) + ((Long.hashCode(this.accessExpiresAt) + AbstractC1308pu.m5336c(this.uid.hashCode() * 31, 31, this.email)) * 31);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.email;
        long j = this.accessExpiresAt;
        boolean z = this.trialGranted;
        StringBuilder sbM3618p = jd0.m3618p("UserAccount(uid=", str, ", email=", str2, ", accessExpiresAt=");
        sbM3618p.append(j);
        sbM3618p.append(", trialGranted=");
        sbM3618p.append(z);
        sbM3618p.append(")");
        return sbM3618p.toString();
    }
}
