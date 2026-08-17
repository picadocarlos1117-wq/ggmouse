package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: xs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1602xs {

    /* JADX INFO: renamed from: d */
    public static final int[] f12698d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f12699e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f12700f;

    /* JADX INFO: renamed from: a */
    public final HashMap f12701a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f12702b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f12703c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12699e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f12700f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(LocationRequest.PRIORITY_LOW_POWER, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(LocationRequest.PRIORITY_NO_POWER, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(LocationRequest.PRIORITY_NO_POWER, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(LocationRequest.PRIORITY_LOW_POWER, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m6947c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = bi1.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f574r;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f574r.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: d */
    public static C1417ss m6948d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C1417ss c1417ss = new C1417ss();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? di1.f2940c : di1.f2938a);
        String[] strArr = hp0.f4643g;
        C1528vs c1528vs = c1417ss.f10518b;
        C1565ws c1565ws = c1417ss.f10521e;
        C1491us c1491us = c1417ss.f10519c;
        C1454ts c1454ts = c1417ss.f10520d;
        int[] iArr = f12698d;
        SparseIntArray sparseIntArray = f12699e;
        if (z) {
            C1380rs c1380rs = new C1380rs();
            c1380rs.f10114a = new int[10];
            c1380rs.f10115b = new int[10];
            c1380rs.f10116c = 0;
            c1380rs.f10117d = new int[10];
            c1380rs.f10118e = new float[10];
            c1380rs.f10119f = 0;
            c1380rs.f10120g = new int[5];
            c1380rs.f10121h = new String[5];
            c1380rs.f10122i = 0;
            c1380rs.f10123j = new int[4];
            c1380rs.f10124k = new boolean[4];
            c1380rs.f10125l = 0;
            c1491us.getClass();
            c1454ts.getClass();
            c1565ws.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f12700f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c1380rs.m5904b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10951I));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    case 29:
                    case 30:
                    case 32:
                    case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    case 36:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        c1380rs.m5905c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c1380rs.m5904b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1454ts.f10945C));
                        break;
                    case 7:
                        i2 = indexCount;
                        c1380rs.m5904b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1454ts.f10946D));
                        break;
                    case 8:
                        i2 = indexCount;
                        c1380rs.m5904b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10952J));
                        break;
                    case 11:
                        i2 = indexCount;
                        c1380rs.m5904b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10958P));
                        break;
                    case 12:
                        i2 = indexCount;
                        c1380rs.m5904b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10959Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        c1380rs.m5904b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10955M));
                        break;
                    case 14:
                        i2 = indexCount;
                        c1380rs.m5904b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10957O));
                        break;
                    case 15:
                        i2 = indexCount;
                        c1380rs.m5904b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10960R));
                        break;
                    case 16:
                        i2 = indexCount;
                        c1380rs.m5904b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10956N));
                        break;
                    case 17:
                        i2 = indexCount;
                        c1380rs.m5904b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1454ts.f10975d));
                        break;
                    case 18:
                        i2 = indexCount;
                        c1380rs.m5904b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1454ts.f10977e));
                        break;
                    case 19:
                        i2 = indexCount;
                        c1380rs.m5903a(19, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f10979f));
                        break;
                    case 20:
                        i2 = indexCount;
                        c1380rs.m5903a(20, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f11006w));
                        break;
                    case 21:
                        i2 = indexCount;
                        c1380rs.m5904b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1454ts.f10973c));
                        break;
                    case 22:
                        i2 = indexCount;
                        c1380rs.m5904b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1528vs.f11757a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c1380rs.m5904b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1454ts.f10971b));
                        break;
                    case 24:
                        i2 = indexCount;
                        c1380rs.m5904b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10948F));
                        break;
                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                        i2 = indexCount;
                        c1380rs.m5904b(27, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10947E));
                        break;
                    case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                        i2 = indexCount;
                        c1380rs.m5904b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10949G));
                        break;
                    case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                        i2 = indexCount;
                        c1380rs.m5904b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10953K));
                        break;
                    case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                        i2 = indexCount;
                        c1380rs.m5904b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10950H));
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                        i2 = indexCount;
                        c1380rs.m5903a(37, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f11007x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1417ss.f10517a);
                        c1417ss.f10517a = resourceId;
                        c1380rs.m5904b(38, resourceId);
                        break;
                    case BuildConfig.VERSION_CODE /* 39 */:
                        i2 = indexCount;
                        c1380rs.m5903a(39, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f10963U));
                        break;
                    case 40:
                        i2 = indexCount;
                        c1380rs.m5903a(40, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f10962T));
                        break;
                    case 41:
                        i2 = indexCount;
                        c1380rs.m5904b(41, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10964V));
                        break;
                    case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                        i2 = indexCount;
                        c1380rs.m5904b(42, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10965W));
                        break;
                    case 43:
                        i2 = indexCount;
                        c1380rs.m5903a(43, typedArrayObtainStyledAttributes.getFloat(index, c1528vs.f11759c));
                        break;
                    case 44:
                        i2 = indexCount;
                        c1380rs.m5906d(44, true);
                        c1380rs.m5903a(44, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12270m));
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        i2 = indexCount;
                        c1380rs.m5903a(45, typedArrayObtainStyledAttributes.getFloat(index, c1565ws.f12259b));
                        break;
                    case 46:
                        i2 = indexCount;
                        c1380rs.m5903a(46, typedArrayObtainStyledAttributes.getFloat(index, c1565ws.f12260c));
                        break;
                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                        i2 = indexCount;
                        c1380rs.m5903a(47, typedArrayObtainStyledAttributes.getFloat(index, c1565ws.f12261d));
                        break;
                    case 48:
                        i2 = indexCount;
                        c1380rs.m5903a(48, typedArrayObtainStyledAttributes.getFloat(index, c1565ws.f12262e));
                        break;
                    case 49:
                        i2 = indexCount;
                        c1380rs.m5903a(49, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12263f));
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        i2 = indexCount;
                        c1380rs.m5903a(50, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12264g));
                        break;
                    case 51:
                        i2 = indexCount;
                        c1380rs.m5903a(51, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12266i));
                        break;
                    case 52:
                        i2 = indexCount;
                        c1380rs.m5903a(52, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12267j));
                        break;
                    case 53:
                        i2 = indexCount;
                        c1380rs.m5903a(53, typedArrayObtainStyledAttributes.getDimension(index, c1565ws.f12268k));
                        break;
                    case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                        i2 = indexCount;
                        c1380rs.m5904b(54, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10966X));
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                        i2 = indexCount;
                        c1380rs.m5904b(55, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10967Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        c1380rs.m5904b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10968Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        c1380rs.m5904b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10970a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        c1380rs.m5904b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10972b0));
                        break;
                    case LinuxInputConstants.KEY_F1 /* 59 */:
                        i2 = indexCount;
                        c1380rs.m5904b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10974c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        c1380rs.m5903a(60, typedArrayObtainStyledAttributes.getFloat(index, c1565ws.f12258a));
                        break;
                    case 62:
                        i2 = indexCount;
                        c1380rs.m5904b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10943A));
                        break;
                    case 63:
                        i2 = indexCount;
                        c1380rs.m5903a(63, typedArrayObtainStyledAttributes.getFloat(index, c1454ts.f10944B));
                        break;
                    case 64:
                        i2 = indexCount;
                        c1380rs.m5904b(64, m6949f(typedArrayObtainStyledAttributes, index, c1491us.f11399a));
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1380rs.m5905c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c1380rs.m5905c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c1380rs.m5904b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c1380rs.m5903a(67, typedArrayObtainStyledAttributes.getFloat(index, c1491us.f11403e));
                        break;
                    case 68:
                        i2 = indexCount;
                        c1380rs.m5903a(68, typedArrayObtainStyledAttributes.getFloat(index, c1528vs.f11760d));
                        break;
                    case 69:
                        i2 = indexCount;
                        c1380rs.m5903a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case LinuxInputConstants.KEY_F12 /* 70 */:
                        i2 = indexCount;
                        c1380rs.m5903a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c1380rs.m5904b(72, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10980f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        c1380rs.m5904b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10982g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        c1380rs.m5905c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        c1380rs.m5906d(75, typedArrayObtainStyledAttributes.getBoolean(index, c1454ts.f10996n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        c1380rs.m5904b(76, typedArrayObtainStyledAttributes.getInt(index, c1491us.f11401c));
                        break;
                    case 77:
                        i2 = indexCount;
                        c1380rs.m5905c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        c1380rs.m5904b(78, typedArrayObtainStyledAttributes.getInt(index, c1528vs.f11758b));
                        break;
                    case 79:
                        i2 = indexCount;
                        c1380rs.m5903a(79, typedArrayObtainStyledAttributes.getFloat(index, c1491us.f11402d));
                        break;
                    case 80:
                        i2 = indexCount;
                        c1380rs.m5906d(80, typedArrayObtainStyledAttributes.getBoolean(index, c1454ts.f10992l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        c1380rs.m5906d(81, typedArrayObtainStyledAttributes.getBoolean(index, c1454ts.f10994m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        c1380rs.m5904b(82, typedArrayObtainStyledAttributes.getInteger(index, c1491us.f11400b));
                        break;
                    case 83:
                        i2 = indexCount;
                        c1380rs.m5904b(83, m6949f(typedArrayObtainStyledAttributes, index, c1565ws.f12265h));
                        break;
                    case 84:
                        i2 = indexCount;
                        c1380rs.m5904b(84, typedArrayObtainStyledAttributes.getInteger(index, c1491us.f11405g));
                        break;
                    case 85:
                        i2 = indexCount;
                        c1380rs.m5903a(85, typedArrayObtainStyledAttributes.getFloat(index, c1491us.f11404f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1491us.f11407i = resourceId2;
                            c1380rs.m5904b(89, resourceId2);
                            if (c1491us.f11407i != -1) {
                                c1380rs.m5904b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1491us.f11406h = string;
                            c1380rs.m5905c(90, string);
                            if (c1491us.f11406h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1491us.f11407i = resourceId3;
                                c1380rs.m5904b(89, resourceId3);
                                c1380rs.m5904b(88, -2);
                            } else {
                                c1380rs.m5904b(88, -1);
                            }
                        } else {
                            c1380rs.m5904b(88, typedArrayObtainStyledAttributes.getInteger(index, c1491us.f11407i));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c1380rs.m5904b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10954L));
                        break;
                    case 94:
                        i2 = indexCount;
                        c1380rs.m5904b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1454ts.f10961S));
                        break;
                    case 95:
                        i2 = indexCount;
                        m6950g(c1380rs, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m6950g(c1380rs, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c1380rs.m5904b(97, typedArrayObtainStyledAttributes.getInt(index, c1454ts.f10998o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = e61.f3219x;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1417ss.f10517a = typedArrayObtainStyledAttributes.getResourceId(index, c1417ss.f10517a);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c1380rs.m5906d(99, typedArrayObtainStyledAttributes.getBoolean(index, c1454ts.f10981g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c1491us.getClass();
                        c1454ts.getClass();
                        c1565ws.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c1454ts.f10999p = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10999p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c1454ts.f10951I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10951I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c1454ts.f10997o = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10997o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c1454ts.f10995n = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10995n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c1454ts.f11008y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c1454ts.f10945C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1454ts.f10945C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c1454ts.f10946D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1454ts.f10946D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c1454ts.f10952J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10952J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c1454ts.f11005v = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11005v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c1454ts.f11004u = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11004u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c1454ts.f10958P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10958P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c1454ts.f10959Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10959Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c1454ts.f10955M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10955M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c1454ts.f10957O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10957O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c1454ts.f10960R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10960R);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c1454ts.f10956N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10956N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c1454ts.f10975d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1454ts.f10975d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c1454ts.f10977e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1454ts.f10977e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c1454ts.f10979f = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f10979f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c1454ts.f11006w = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f11006w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c1454ts.f10973c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1454ts.f10973c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c1528vs.f11757a);
                        c1528vs.f11757a = i8;
                        c1528vs.f11757a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c1454ts.f10971b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1454ts.f10971b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c1454ts.f10948F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10948F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c1454ts.f10983h = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10983h);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                        i = indexCount2;
                        c1454ts.f10985i = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10985i);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                        i = indexCount2;
                        c1454ts.f10947E = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10947E);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                        i = indexCount2;
                        c1454ts.f10949G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10949G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c1454ts.f10987j = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10987j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c1454ts.f10989k = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10989k);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                        i = indexCount2;
                        c1454ts.f10953K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10953K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c1454ts.f11002s = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11002s);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                        i = indexCount2;
                        c1454ts.f11003t = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11003t);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                        i = indexCount2;
                        c1454ts.f10950H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10950H);
                        continue;
                        i7++;
                        break;
                    case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                        i = indexCount2;
                        c1454ts.f10993m = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10993m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c1454ts.f10991l = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f10991l);
                        continue;
                        i7++;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                        i = indexCount2;
                        c1454ts.f11007x = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f11007x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c1417ss.f10517a = typedArrayObtainStyledAttributes.getResourceId(index2, c1417ss.f10517a);
                        continue;
                        i7++;
                        break;
                    case BuildConfig.VERSION_CODE /* 39 */:
                        i = indexCount2;
                        c1454ts.f10963U = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f10963U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c1454ts.f10962T = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f10962T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c1454ts.f10964V = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10964V);
                        continue;
                        i7++;
                        break;
                    case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                        i = indexCount2;
                        c1454ts.f10965W = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10965W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c1528vs.f11759c = typedArrayObtainStyledAttributes.getFloat(index2, c1528vs.f11759c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c1565ws.f12269l = true;
                        c1565ws.f12270m = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12270m);
                        continue;
                        i7++;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        i = indexCount2;
                        c1565ws.f12259b = typedArrayObtainStyledAttributes.getFloat(index2, c1565ws.f12259b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c1565ws.f12260c = typedArrayObtainStyledAttributes.getFloat(index2, c1565ws.f12260c);
                        continue;
                        i7++;
                        break;
                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                        i = indexCount2;
                        c1565ws.f12261d = typedArrayObtainStyledAttributes.getFloat(index2, c1565ws.f12261d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c1565ws.f12262e = typedArrayObtainStyledAttributes.getFloat(index2, c1565ws.f12262e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c1565ws.f12263f = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12263f);
                        continue;
                        i7++;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                        i = indexCount2;
                        c1565ws.f12264g = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12264g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c1565ws.f12266i = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12266i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c1565ws.f12267j = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12267j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c1565ws.f12268k = typedArrayObtainStyledAttributes.getDimension(index2, c1565ws.f12268k);
                        continue;
                        i7++;
                        break;
                    case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                        i = indexCount2;
                        c1454ts.f10966X = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10966X);
                        continue;
                        i7++;
                        break;
                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                        i = indexCount2;
                        c1454ts.f10967Y = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10967Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c1454ts.f10968Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10968Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c1454ts.f10970a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10970a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c1454ts.f10972b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10972b0);
                        continue;
                        i7++;
                        break;
                    case LinuxInputConstants.KEY_F1 /* 59 */:
                        i = indexCount2;
                        c1454ts.f10974c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10974c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c1565ws.f12258a = typedArrayObtainStyledAttributes.getFloat(index2, c1565ws.f12258a);
                        continue;
                        i7++;
                        break;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        i = indexCount2;
                        c1454ts.f11009z = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11009z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c1454ts.f10943A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10943A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c1454ts.f10944B = typedArrayObtainStyledAttributes.getFloat(index2, c1454ts.f10944B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c1491us.f11399a = m6949f(typedArrayObtainStyledAttributes, index2, c1491us.f11399a);
                        continue;
                        i7++;
                        break;
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c1491us.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c1491us.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c1491us.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c1491us.f11403e = typedArrayObtainStyledAttributes.getFloat(index2, c1491us.f11403e);
                        break;
                    case 68:
                        i = indexCount2;
                        c1528vs.f11760d = typedArrayObtainStyledAttributes.getFloat(index2, c1528vs.f11760d);
                        break;
                    case 69:
                        i = indexCount2;
                        c1454ts.f10976d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case LinuxInputConstants.KEY_F12 /* 70 */:
                        i = indexCount2;
                        c1454ts.f10978e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c1454ts.f10980f0 = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10980f0);
                        break;
                    case 73:
                        i = indexCount2;
                        c1454ts.f10982g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10982g0);
                        break;
                    case 74:
                        i = indexCount2;
                        c1454ts.f10988j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c1454ts.f10996n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1454ts.f10996n0);
                        break;
                    case 76:
                        i = indexCount2;
                        c1491us.f11401c = typedArrayObtainStyledAttributes.getInt(index2, c1491us.f11401c);
                        break;
                    case 77:
                        i = indexCount2;
                        c1454ts.f10990k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c1528vs.f11758b = typedArrayObtainStyledAttributes.getInt(index2, c1528vs.f11758b);
                        break;
                    case 79:
                        i = indexCount2;
                        c1491us.f11402d = typedArrayObtainStyledAttributes.getFloat(index2, c1491us.f11402d);
                        break;
                    case 80:
                        i = indexCount2;
                        c1454ts.f10992l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1454ts.f10992l0);
                        break;
                    case 81:
                        i = indexCount2;
                        c1454ts.f10994m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1454ts.f10994m0);
                        break;
                    case 82:
                        i = indexCount2;
                        c1491us.f11400b = typedArrayObtainStyledAttributes.getInteger(index2, c1491us.f11400b);
                        break;
                    case 83:
                        i = indexCount2;
                        c1565ws.f12265h = m6949f(typedArrayObtainStyledAttributes, index2, c1565ws.f12265h);
                        break;
                    case 84:
                        i = indexCount2;
                        c1491us.f11405g = typedArrayObtainStyledAttributes.getInteger(index2, c1491us.f11405g);
                        break;
                    case 85:
                        i = indexCount2;
                        c1491us.f11404f = typedArrayObtainStyledAttributes.getFloat(index2, c1491us.f11404f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c1491us.f11407i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1491us.f11406h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1491us.f11407i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1491us.f11407i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c1454ts.f11000q = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11000q);
                        break;
                    case 92:
                        i = indexCount2;
                        c1454ts.f11001r = m6949f(typedArrayObtainStyledAttributes, index2, c1454ts.f11001r);
                        break;
                    case 93:
                        i = indexCount2;
                        c1454ts.f10954L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10954L);
                        break;
                    case 94:
                        i = indexCount2;
                        c1454ts.f10961S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1454ts.f10961S);
                        break;
                    case 95:
                        i = indexCount2;
                        m6950g(c1454ts, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m6950g(c1454ts, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c1454ts.f10998o0 = typedArrayObtainStyledAttributes.getInt(index2, c1454ts.f10998o0);
                        break;
                }
                i7++;
            }
            if (c1454ts.f10988j0 != null) {
                c1454ts.f10986i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1417ss;
    }

    /* JADX INFO: renamed from: f */
    public static int m6949f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX INFO: renamed from: g */
    public static void m6950g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C1380rs c1380rs;
        C1454ts c1454ts;
        C1306ps c1306ps;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof C1306ps) {
                    c1306ps = (C1306ps) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1306ps).width = i4;
                        c1306ps.f9080W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1306ps).height = i4;
                        c1306ps.f9081X = z;
                        return;
                    }
                }
                if (obj instanceof C1454ts) {
                    c1454ts = (C1454ts) obj;
                    if (i2 == 0) {
                        c1454ts.f10971b = i4;
                        c1454ts.f10992l0 = z;
                        return;
                    } else {
                        c1454ts.f10973c = i4;
                        c1454ts.f10994m0 = z;
                        return;
                    }
                }
                if (obj instanceof C1380rs) {
                    c1380rs = (C1380rs) obj;
                    if (i2 == 0) {
                        c1380rs.m5904b(23, i4);
                        c1380rs.m5906d(80, z);
                        return;
                    } else {
                        c1380rs.m5904b(21, i4);
                        c1380rs.m5906d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof C1306ps) {
                c1306ps = (C1306ps) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c1306ps).width = i4;
                    c1306ps.f9080W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c1306ps).height = i4;
                    c1306ps.f9081X = z;
                    return;
                }
            }
            if (obj instanceof C1454ts) {
                c1454ts = (C1454ts) obj;
                if (i2 == 0) {
                    c1454ts.f10971b = i4;
                    c1454ts.f10992l0 = z;
                    return;
                } else {
                    c1454ts.f10973c = i4;
                    c1454ts.f10994m0 = z;
                    return;
                }
            }
            if (obj instanceof C1380rs) {
                c1380rs = (C1380rs) obj;
                if (i2 == 0) {
                    c1380rs.m5904b(23, i4);
                    c1380rs.m5906d(80, z);
                    return;
                } else {
                    c1380rs.m5904b(21, i4);
                    c1380rs.m5906d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C1306ps) {
                    C1306ps c1306ps2 = (C1306ps) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c1306ps2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1306ps2).height = 0;
                    }
                    m6951h(c1306ps2, strTrim2);
                    return;
                }
                if (obj instanceof C1454ts) {
                    ((C1454ts) obj).f11008y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C1380rs) {
                        ((C1380rs) obj).m5905c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof C1306ps) {
                        C1306ps c1306ps3 = (C1306ps) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1306ps3).width = 0;
                            c1306ps3.f9065H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1306ps3).height = 0;
                            c1306ps3.f9066I = f;
                            return;
                        }
                    }
                    if (obj instanceof C1454ts) {
                        C1454ts c1454ts2 = (C1454ts) obj;
                        if (i2 == 0) {
                            c1454ts2.f10971b = 0;
                            c1454ts2.f10963U = f;
                            return;
                        } else {
                            c1454ts2.f10973c = 0;
                            c1454ts2.f10962T = f;
                            return;
                        }
                    }
                    if (obj instanceof C1380rs) {
                        C1380rs c1380rs2 = (C1380rs) obj;
                        if (i2 == 0) {
                            c1380rs2.m5904b(23, 0);
                            c1380rs2.m5903a(39, f);
                            return;
                        } else {
                            c1380rs2.m5904b(21, 0);
                            c1380rs2.m5903a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(TouchPipeline.SIZE, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C1306ps) {
                        C1306ps c1306ps4 = (C1306ps) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1306ps4).width = 0;
                            c1306ps4.f9075R = fMax;
                            c1306ps4.f9069L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1306ps4).height = 0;
                            c1306ps4.f9076S = fMax;
                            c1306ps4.f9070M = 2;
                            return;
                        }
                    }
                    if (obj instanceof C1454ts) {
                        C1454ts c1454ts3 = (C1454ts) obj;
                        if (i2 == 0) {
                            c1454ts3.f10971b = 0;
                            c1454ts3.f10976d0 = fMax;
                            c1454ts3.f10966X = 2;
                            return;
                        } else {
                            c1454ts3.f10973c = 0;
                            c1454ts3.f10978e0 = fMax;
                            c1454ts3.f10967Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof C1380rs) {
                        C1380rs c1380rs3 = (C1380rs) obj;
                        if (i2 == 0) {
                            c1380rs3.m5904b(23, 0);
                            c1380rs3.m5904b(54, 2);
                        } else {
                            c1380rs3.m5904b(21, 0);
                            c1380rs3.m5904b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6951h(C1306ps c1306ps, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > TouchPipeline.SIZE && f2 > TouchPipeline.SIZE) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1306ps.f9064G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final void m6952a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        C1602xs c1602xs = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = c1602xs.f12703c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1602xs.f12702b && id == -1) {
                    l41.m4048q("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && map2.containsKey(Integer.valueOf(id))) {
                    hashSet2.remove(Integer.valueOf(id));
                    C1417ss c1417ss = (C1417ss) map2.get(Integer.valueOf(id));
                    if (c1417ss != null) {
                        C1528vs c1528vs = c1417ss.f10518b;
                        C1454ts c1454ts = c1417ss.f10520d;
                        C1565ws c1565ws = c1417ss.f10521e;
                        if (childAt instanceof Barrier) {
                            c1454ts.f10984h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c1454ts.f10980f0);
                            barrier.setMargin(c1454ts.f10982g0);
                            barrier.setAllowsGoneWidget(c1454ts.f10996n0);
                            int[] iArr = c1454ts.f10986i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c1454ts.f10988j0;
                                if (str != null) {
                                    int[] iArrM6947c = m6947c(barrier, str);
                                    c1454ts.f10986i0 = iArrM6947c;
                                    barrier.setReferencedIds(iArrM6947c);
                                }
                            }
                        }
                        C1306ps c1306ps = (C1306ps) childAt.getLayoutParams();
                        c1306ps.m5314a();
                        c1417ss.m6134a(c1306ps);
                        HashMap map3 = c1417ss.f10522f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            C1119ms c1119ms = (C1119ms) map3.get(str2);
                            HashSet hashSet3 = hashSet2;
                            String strM5339f = !c1119ms.f7086a ? AbstractC1308pu.m5339f("set", str2) : str2;
                            int i3 = i2;
                            try {
                                int iM5359z = AbstractC1308pu.m5359z(c1119ms.f7087b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iM5359z) {
                                    case 0:
                                        map = map3;
                                        cls.getMethod(strM5339f, cls3).invoke(childAt, Integer.valueOf(c1119ms.f7088c));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(strM5339f, cls2).invoke(childAt, Float.valueOf(c1119ms.f7089d));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(strM5339f, cls3).invoke(childAt, Integer.valueOf(c1119ms.f7092g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM5339f, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c1119ms.f7092g);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            StringBuilder sbM5347n = AbstractC1308pu.m5347n(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM5347n.append(cls.getName());
                                            Log.e("TransitionLayout", sbM5347n.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM5339f);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            StringBuilder sbM5347n2 = AbstractC1308pu.m5347n(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM5347n2.append(cls.getName());
                                            Log.e("TransitionLayout", sbM5347n2.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM5339f, CharSequence.class).invoke(childAt, c1119ms.f7090e);
                                        map = map3;
                                        break;
                                    case 5:
                                        cls.getMethod(strM5339f, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1119ms.f7091f));
                                        map = map3;
                                        break;
                                    case 6:
                                        cls.getMethod(strM5339f, cls2).invoke(childAt, Float.valueOf(c1119ms.f7089d));
                                        map = map3;
                                        break;
                                    case 7:
                                        cls.getMethod(strM5339f, cls3).invoke(childAt, Integer.valueOf(c1119ms.f7088c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                map = map3;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                map = map3;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                map = map3;
                            }
                            hashSet2 = hashSet3;
                            i2 = i3;
                            map3 = map;
                        }
                        hashSet = hashSet2;
                        i = i2;
                        childAt.setLayoutParams(c1306ps);
                        if (c1528vs.f11758b == 0) {
                            childAt.setVisibility(c1528vs.f11757a);
                        }
                        childAt.setAlpha(c1528vs.f11759c);
                        childAt.setRotation(c1565ws.f12258a);
                        childAt.setRotationX(c1565ws.f12259b);
                        childAt.setRotationY(c1565ws.f12260c);
                        childAt.setScaleX(c1565ws.f12261d);
                        childAt.setScaleY(c1565ws.f12262e);
                        if (c1565ws.f12265h != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(c1565ws.f12265h);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(c1565ws.f12263f)) {
                                childAt.setPivotX(c1565ws.f12263f);
                            }
                            if (!Float.isNaN(c1565ws.f12264g)) {
                                childAt.setPivotY(c1565ws.f12264g);
                            }
                        }
                        childAt.setTranslationX(c1565ws.f12266i);
                        childAt.setTranslationY(c1565ws.f12267j);
                        childAt.setTranslationZ(c1565ws.f12268k);
                        if (c1565ws.f12269l) {
                            childAt.setElevation(c1565ws.f12270m);
                        }
                    }
                }
                i2 = i + 1;
                c1602xs = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            c1602xs = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C1417ss c1417ss2 = (C1417ss) map2.get(num);
            if (c1417ss2 != null) {
                C1454ts c1454ts2 = c1417ss2.f10520d;
                if (c1454ts2.f10984h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c1454ts2.f10986i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c1454ts2.f10988j0;
                        if (str3 != null) {
                            int[] iArrM6947c2 = m6947c(barrier2, str3);
                            c1454ts2.f10986i0 = iArrM6947c2;
                            barrier2.setReferencedIds(iArrM6947c2);
                        }
                    }
                    barrier2.setType(c1454ts2.f10980f0);
                    barrier2.setMargin(c1454ts2.f10982g0);
                    C1306ps c1306psM283g = ConstraintLayout.m283g();
                    barrier2.m4594i();
                    c1417ss2.m6134a(c1306psM283g);
                    constraintLayout.addView(barrier2, c1306psM283g);
                }
                if (c1454ts2.f10969a) {
                    View wi0Var = new wi0(constraintLayout.getContext());
                    wi0Var.setId(num.intValue());
                    C1306ps c1306psM283g2 = ConstraintLayout.m283g();
                    c1417ss2.m6134a(c1306psM283g2);
                    constraintLayout.addView(wi0Var, c1306psM283g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof AbstractC1156ns) {
                ((AbstractC1156ns) childAt2).mo4410e(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6953b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        C1602xs c1602xs = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c1602xs.f12703c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C1306ps c1306ps = (C1306ps) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1602xs.f12702b && id == -1) {
                l41.m4048q("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new C1417ss());
            }
            C1417ss c1417ss = (C1417ss) map3.get(Integer.valueOf(id));
            if (c1417ss == null) {
                i = childCount;
                map = map3;
            } else {
                C1528vs c1528vs = c1417ss.f10518b;
                C1454ts c1454ts = c1417ss.f10520d;
                C1565ws c1565ws = c1417ss.f10521e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = c1602xs.f12701a;
                for (String str : map5.keySet()) {
                    C1119ms c1119ms = (C1119ms) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new C1119ms(c1119ms, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new C1119ms(c1119ms, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                c1417ss.f10522f = map4;
                c1417ss.f10517a = id;
                c1454ts.f10983h = c1306ps.f9092e;
                c1454ts.f10985i = c1306ps.f9094f;
                c1454ts.f10987j = c1306ps.f9096g;
                c1454ts.f10989k = c1306ps.f9098h;
                c1454ts.f10991l = c1306ps.f9100i;
                c1454ts.f10993m = c1306ps.f9102j;
                c1454ts.f10995n = c1306ps.f9104k;
                c1454ts.f10997o = c1306ps.f9106l;
                c1454ts.f10999p = c1306ps.f9108m;
                c1454ts.f11000q = c1306ps.f9110n;
                c1454ts.f11001r = c1306ps.f9112o;
                c1454ts.f11002s = c1306ps.f9118s;
                c1454ts.f11003t = c1306ps.f9119t;
                c1454ts.f11004u = c1306ps.f9120u;
                c1454ts.f11005v = c1306ps.f9121v;
                c1454ts.f11006w = c1306ps.f9062E;
                c1454ts.f11007x = c1306ps.f9063F;
                c1454ts.f11008y = c1306ps.f9064G;
                c1454ts.f11009z = c1306ps.f9114p;
                c1454ts.f10943A = c1306ps.f9116q;
                c1454ts.f10944B = c1306ps.f9117r;
                c1454ts.f10945C = c1306ps.f9077T;
                c1454ts.f10946D = c1306ps.f9078U;
                c1454ts.f10947E = c1306ps.f9079V;
                c1454ts.f10979f = c1306ps.f9088c;
                c1454ts.f10975d = c1306ps.f9084a;
                c1454ts.f10977e = c1306ps.f9086b;
                c1454ts.f10971b = ((ViewGroup.MarginLayoutParams) c1306ps).width;
                c1454ts.f10973c = ((ViewGroup.MarginLayoutParams) c1306ps).height;
                c1454ts.f10948F = ((ViewGroup.MarginLayoutParams) c1306ps).leftMargin;
                c1454ts.f10949G = ((ViewGroup.MarginLayoutParams) c1306ps).rightMargin;
                c1454ts.f10950H = ((ViewGroup.MarginLayoutParams) c1306ps).topMargin;
                c1454ts.f10951I = ((ViewGroup.MarginLayoutParams) c1306ps).bottomMargin;
                c1454ts.f10954L = c1306ps.f9061D;
                c1454ts.f10962T = c1306ps.f9066I;
                c1454ts.f10963U = c1306ps.f9065H;
                c1454ts.f10965W = c1306ps.f9068K;
                c1454ts.f10964V = c1306ps.f9067J;
                c1454ts.f10992l0 = c1306ps.f9080W;
                c1454ts.f10994m0 = c1306ps.f9081X;
                c1454ts.f10966X = c1306ps.f9069L;
                c1454ts.f10967Y = c1306ps.f9070M;
                c1454ts.f10968Z = c1306ps.f9073P;
                c1454ts.f10970a0 = c1306ps.f9074Q;
                c1454ts.f10972b0 = c1306ps.f9071N;
                c1454ts.f10974c0 = c1306ps.f9072O;
                c1454ts.f10976d0 = c1306ps.f9075R;
                c1454ts.f10978e0 = c1306ps.f9076S;
                c1454ts.f10990k0 = c1306ps.f9082Y;
                c1454ts.f10956N = c1306ps.f9123x;
                c1454ts.f10958P = c1306ps.f9125z;
                c1454ts.f10955M = c1306ps.f9122w;
                c1454ts.f10957O = c1306ps.f9124y;
                c1454ts.f10960R = c1306ps.f9058A;
                c1454ts.f10959Q = c1306ps.f9059B;
                c1454ts.f10961S = c1306ps.f9060C;
                c1454ts.f10998o0 = c1306ps.f9083Z;
                c1454ts.f10952J = c1306ps.getMarginEnd();
                c1454ts.f10953K = c1306ps.getMarginStart();
                c1528vs.f11757a = childAt.getVisibility();
                c1528vs.f11759c = childAt.getAlpha();
                c1565ws.f12258a = childAt.getRotation();
                c1565ws.f12259b = childAt.getRotationX();
                c1565ws.f12260c = childAt.getRotationY();
                c1565ws.f12261d = childAt.getScaleX();
                c1565ws.f12262e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1565ws.f12263f = pivotX;
                    c1565ws.f12264g = pivotY;
                }
                c1565ws.f12266i = childAt.getTranslationX();
                c1565ws.f12267j = childAt.getTranslationY();
                c1565ws.f12268k = childAt.getTranslationZ();
                if (c1565ws.f12269l) {
                    c1565ws.f12270m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c1454ts.f10996n0 = barrier.getAllowsGoneWidget();
                    c1454ts.f10986i0 = barrier.getReferencedIds();
                    c1454ts.f10980f0 = barrier.getType();
                    c1454ts.f10982g0 = barrier.getMargin();
                }
            }
            i2++;
            c1602xs = this;
            childCount = i;
            map3 = map;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6954e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1417ss c1417ssM6948d = m6948d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1417ssM6948d.f10520d.f10969a = true;
                    }
                    this.f12703c.put(Integer.valueOf(c1417ssM6948d.f10517a), c1417ssM6948d);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
