package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: renamed from: ts */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1454ts {

    /* JADX INFO: renamed from: p0 */
    public static final SparseIntArray f10942p0;

    /* JADX INFO: renamed from: A */
    public int f10943A;

    /* JADX INFO: renamed from: B */
    public float f10944B;

    /* JADX INFO: renamed from: C */
    public int f10945C;

    /* JADX INFO: renamed from: D */
    public int f10946D;

    /* JADX INFO: renamed from: E */
    public int f10947E;

    /* JADX INFO: renamed from: F */
    public int f10948F;

    /* JADX INFO: renamed from: G */
    public int f10949G;

    /* JADX INFO: renamed from: H */
    public int f10950H;

    /* JADX INFO: renamed from: I */
    public int f10951I;

    /* JADX INFO: renamed from: J */
    public int f10952J;

    /* JADX INFO: renamed from: K */
    public int f10953K;

    /* JADX INFO: renamed from: L */
    public int f10954L;

    /* JADX INFO: renamed from: M */
    public int f10955M;

    /* JADX INFO: renamed from: N */
    public int f10956N;

    /* JADX INFO: renamed from: O */
    public int f10957O;

    /* JADX INFO: renamed from: P */
    public int f10958P;

    /* JADX INFO: renamed from: Q */
    public int f10959Q;

    /* JADX INFO: renamed from: R */
    public int f10960R;

    /* JADX INFO: renamed from: S */
    public int f10961S;

    /* JADX INFO: renamed from: T */
    public float f10962T;

    /* JADX INFO: renamed from: U */
    public float f10963U;

    /* JADX INFO: renamed from: V */
    public int f10964V;

    /* JADX INFO: renamed from: W */
    public int f10965W;

    /* JADX INFO: renamed from: X */
    public int f10966X;

    /* JADX INFO: renamed from: Y */
    public int f10967Y;

    /* JADX INFO: renamed from: Z */
    public int f10968Z;

    /* JADX INFO: renamed from: a */
    public boolean f10969a;

    /* JADX INFO: renamed from: a0 */
    public int f10970a0;

    /* JADX INFO: renamed from: b */
    public int f10971b;

    /* JADX INFO: renamed from: b0 */
    public int f10972b0;

    /* JADX INFO: renamed from: c */
    public int f10973c;

    /* JADX INFO: renamed from: c0 */
    public int f10974c0;

    /* JADX INFO: renamed from: d */
    public int f10975d;

    /* JADX INFO: renamed from: d0 */
    public float f10976d0;

    /* JADX INFO: renamed from: e */
    public int f10977e;

    /* JADX INFO: renamed from: e0 */
    public float f10978e0;

    /* JADX INFO: renamed from: f */
    public float f10979f;

    /* JADX INFO: renamed from: f0 */
    public int f10980f0;

    /* JADX INFO: renamed from: g */
    public boolean f10981g;

    /* JADX INFO: renamed from: g0 */
    public int f10982g0;

    /* JADX INFO: renamed from: h */
    public int f10983h;

    /* JADX INFO: renamed from: h0 */
    public int f10984h0;

    /* JADX INFO: renamed from: i */
    public int f10985i;

    /* JADX INFO: renamed from: i0 */
    public int[] f10986i0;

    /* JADX INFO: renamed from: j */
    public int f10987j;

    /* JADX INFO: renamed from: j0 */
    public String f10988j0;

    /* JADX INFO: renamed from: k */
    public int f10989k;

    /* JADX INFO: renamed from: k0 */
    public String f10990k0;

    /* JADX INFO: renamed from: l */
    public int f10991l;

    /* JADX INFO: renamed from: l0 */
    public boolean f10992l0;

    /* JADX INFO: renamed from: m */
    public int f10993m;

    /* JADX INFO: renamed from: m0 */
    public boolean f10994m0;

    /* JADX INFO: renamed from: n */
    public int f10995n;

    /* JADX INFO: renamed from: n0 */
    public boolean f10996n0;

    /* JADX INFO: renamed from: o */
    public int f10997o;

    /* JADX INFO: renamed from: o0 */
    public int f10998o0;

    /* JADX INFO: renamed from: p */
    public int f10999p;

    /* JADX INFO: renamed from: q */
    public int f11000q;

    /* JADX INFO: renamed from: r */
    public int f11001r;

    /* JADX INFO: renamed from: s */
    public int f11002s;

    /* JADX INFO: renamed from: t */
    public int f11003t;

    /* JADX INFO: renamed from: u */
    public int f11004u;

    /* JADX INFO: renamed from: v */
    public int f11005v;

    /* JADX INFO: renamed from: w */
    public float f11006w;

    /* JADX INFO: renamed from: x */
    public float f11007x;

    /* JADX INFO: renamed from: y */
    public String f11008y;

    /* JADX INFO: renamed from: z */
    public int f11009z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10942p0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 41);
        sparseIntArray.append(16, 42);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    /* JADX INFO: renamed from: a */
    public final void m6334a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di1.f2942e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f10942p0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.f10999p = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10999p);
                    break;
                case 2:
                    this.f10951I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10951I);
                    break;
                case 3:
                    this.f10997o = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10997o);
                    break;
                case 4:
                    this.f10995n = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10995n);
                    break;
                case 5:
                    this.f11008y = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.f10945C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f10945C);
                    break;
                case 7:
                    this.f10946D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f10946D);
                    break;
                case 8:
                    this.f10952J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10952J);
                    break;
                case 9:
                    this.f11005v = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11005v);
                    break;
                case 10:
                    this.f11004u = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11004u);
                    break;
                case 11:
                    this.f10958P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10958P);
                    break;
                case 12:
                    this.f10959Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10959Q);
                    break;
                case 13:
                    this.f10955M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10955M);
                    break;
                case 14:
                    this.f10957O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10957O);
                    break;
                case 15:
                    this.f10960R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10960R);
                    break;
                case 16:
                    this.f10956N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10956N);
                    break;
                case 17:
                    this.f10975d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f10975d);
                    break;
                case 18:
                    this.f10977e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f10977e);
                    break;
                case 19:
                    this.f10979f = typedArrayObtainStyledAttributes.getFloat(index, this.f10979f);
                    break;
                case 20:
                    this.f11006w = typedArrayObtainStyledAttributes.getFloat(index, this.f11006w);
                    break;
                case 21:
                    this.f10973c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f10973c);
                    break;
                case 22:
                    this.f10971b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f10971b);
                    break;
                case 23:
                    this.f10948F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10948F);
                    break;
                case 24:
                    this.f10983h = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10983h);
                    break;
                case 25:
                    this.f10985i = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10985i);
                    break;
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    this.f10947E = typedArrayObtainStyledAttributes.getInt(index, this.f10947E);
                    break;
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    this.f10949G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10949G);
                    break;
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    this.f10987j = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10987j);
                    break;
                case 29:
                    this.f10989k = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10989k);
                    break;
                case 30:
                    this.f10953K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10953K);
                    break;
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                    this.f11002s = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11002s);
                    break;
                case 32:
                    this.f11003t = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11003t);
                    break;
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    this.f10950H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10950H);
                    break;
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    this.f10993m = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10993m);
                    break;
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    this.f10991l = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f10991l);
                    break;
                case 36:
                    this.f11007x = typedArrayObtainStyledAttributes.getFloat(index, this.f11007x);
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    this.f10963U = typedArrayObtainStyledAttributes.getFloat(index, this.f10963U);
                    break;
                case 38:
                    this.f10962T = typedArrayObtainStyledAttributes.getFloat(index, this.f10962T);
                    break;
                case BuildConfig.VERSION_CODE /* 39 */:
                    this.f10964V = typedArrayObtainStyledAttributes.getInt(index, this.f10964V);
                    break;
                case 40:
                    this.f10965W = typedArrayObtainStyledAttributes.getInt(index, this.f10965W);
                    break;
                case 41:
                    C1602xs.m6950g(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                    C1602xs.m6950g(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            this.f11009z = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11009z);
                            break;
                        case 62:
                            this.f10943A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10943A);
                            break;
                        case 63:
                            this.f10944B = typedArrayObtainStyledAttributes.getFloat(index, this.f10944B);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.f10976d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case LinuxInputConstants.KEY_F12 /* 70 */:
                                    this.f10978e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f10980f0 = typedArrayObtainStyledAttributes.getInt(index, this.f10980f0);
                                    break;
                                case 73:
                                    this.f10982g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10982g0);
                                    break;
                                case 74:
                                    this.f10988j0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f10996n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f10996n0);
                                    break;
                                case 76:
                                    this.f10998o0 = typedArrayObtainStyledAttributes.getInt(index, this.f10998o0);
                                    break;
                                case 77:
                                    this.f11000q = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11000q);
                                    break;
                                case 78:
                                    this.f11001r = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11001r);
                                    break;
                                case 79:
                                    this.f10961S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10961S);
                                    break;
                                case 80:
                                    this.f10954L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10954L);
                                    break;
                                case 81:
                                    this.f10966X = typedArrayObtainStyledAttributes.getInt(index, this.f10966X);
                                    break;
                                case 82:
                                    this.f10967Y = typedArrayObtainStyledAttributes.getInt(index, this.f10967Y);
                                    break;
                                case 83:
                                    this.f10970a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10970a0);
                                    break;
                                case 84:
                                    this.f10968Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10968Z);
                                    break;
                                case 85:
                                    this.f10974c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10974c0);
                                    break;
                                case 86:
                                    this.f10972b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f10972b0);
                                    break;
                                case 87:
                                    this.f10992l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f10992l0);
                                    break;
                                case 88:
                                    this.f10994m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f10994m0);
                                    break;
                                case 89:
                                    this.f10990k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f10981g = typedArrayObtainStyledAttributes.getBoolean(index, this.f10981g);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
