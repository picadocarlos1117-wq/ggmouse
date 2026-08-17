package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.r52;
import p000.s52;
import p000.t52;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(r52 r52Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        t52 t52VarM5711h = remoteActionCompat.f603a;
        boolean z = true;
        if (r52Var.mo5708e(1)) {
            t52VarM5711h = r52Var.m5711h();
        }
        remoteActionCompat.f603a = (IconCompat) t52VarM5711h;
        CharSequence charSequence = remoteActionCompat.f604b;
        if (r52Var.mo5708e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s52) r52Var).f10239e);
        }
        remoteActionCompat.f604b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f605c;
        if (r52Var.mo5708e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((s52) r52Var).f10239e);
        }
        remoteActionCompat.f605c = charSequence2;
        remoteActionCompat.f606d = (PendingIntent) r52Var.m5710g(remoteActionCompat.f606d, 4);
        boolean z2 = remoteActionCompat.f607e;
        if (r52Var.mo5708e(5)) {
            z2 = ((s52) r52Var).f10239e.readInt() != 0;
        }
        remoteActionCompat.f607e = z2;
        boolean z3 = remoteActionCompat.f608f;
        if (!r52Var.mo5708e(6)) {
            z = z3;
        } else if (((s52) r52Var).f10239e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f608f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, r52 r52Var) {
        r52Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f603a;
        r52Var.mo5712i(1);
        r52Var.m5715l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f604b;
        r52Var.mo5712i(2);
        Parcel parcel = ((s52) r52Var).f10239e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f605c;
        r52Var.mo5712i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        r52Var.m5714k(remoteActionCompat.f606d, 4);
        boolean z = remoteActionCompat.f607e;
        r52Var.mo5712i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f608f;
        r52Var.mo5712i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
