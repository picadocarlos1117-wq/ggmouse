package com.example.ssmousepro.account;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountConstants {
    public static final String COL_USERS = "users";
    public static final String FIELD_ACCESS_EXPIRES_AT = "accessExpiresAt";
    public static final String FIELD_BALANCE_MS = "balanceMs";
    public static final String FIELD_CREATED_AT = "createdAt";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_TRIAL_GRANTED = "trialGranted";
    public static final String FIRESTORE_DATABASE_ID = "ssbr";
    public static final AccountConstants INSTANCE = new AccountConstants();
    public static final long TRIAL_DURATION_MS = 43200000;

    private AccountConstants() {
    }
}
