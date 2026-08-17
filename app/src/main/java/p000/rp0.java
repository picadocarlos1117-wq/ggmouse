package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class rp0 extends IOException {

    /* JADX INFO: renamed from: a */
    public boolean f10092a;

    /* JADX INFO: renamed from: a */
    public static rp0 m5880a() {
        return new rp0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: b */
    public static rp0 m5881b() {
        return new rp0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: c */
    public static rp0 m5882c() {
        return new rp0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: d */
    public static qp0 m5883d() {
        return new qp0("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: e */
    public static rp0 m5884e() {
        return new rp0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: f */
    public static rp0 m5885f() {
        return new rp0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: g */
    public static rp0 m5886g() {
        return new rp0("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: h */
    public static rp0 m5887h() {
        return new rp0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
