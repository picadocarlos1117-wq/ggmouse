package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import p000.C1082ls;
import p000.C1332qh;
import p000.C1639ys;
import p000.C1676zs;
import p000.ch1;
import p000.di1;
import p000.hd0;
import p000.id0;
import p000.m82;
import p000.xi0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends m82 {

    /* JADX INFO: renamed from: o */
    public id0 f557o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000.m82, p000.AbstractC1156ns
    /* JADX INFO: renamed from: g */
    public final void mo280g(AttributeSet attributeSet) {
        super.mo280g(attributeSet);
        id0 id0Var = new id0();
        id0Var.f4978s0 = 0;
        id0Var.f4979t0 = 0;
        id0Var.f4980u0 = 0;
        id0Var.f4981v0 = 0;
        id0Var.f4982w0 = 0;
        id0Var.f4983x0 = 0;
        id0Var.f4984y0 = false;
        id0Var.f4985z0 = 0;
        id0Var.f4950A0 = 0;
        id0Var.f4951B0 = new C1332qh();
        id0Var.f4952C0 = null;
        id0Var.f4953D0 = -1;
        id0Var.f4954E0 = -1;
        id0Var.f4955F0 = -1;
        id0Var.f4956G0 = -1;
        id0Var.f4957H0 = -1;
        id0Var.f4958I0 = -1;
        id0Var.f4959J0 = 0.5f;
        id0Var.f4960K0 = 0.5f;
        id0Var.f4961L0 = 0.5f;
        id0Var.f4962M0 = 0.5f;
        id0Var.f4963N0 = 0.5f;
        id0Var.f4964O0 = 0.5f;
        id0Var.f4965P0 = 0;
        id0Var.f4966Q0 = 0;
        id0Var.f4967R0 = 2;
        id0Var.f4968S0 = 2;
        id0Var.f4969T0 = 0;
        id0Var.f4970U0 = -1;
        id0Var.f4971V0 = 0;
        id0Var.f4972W0 = new ArrayList();
        id0Var.f4973X0 = null;
        id0Var.f4974Y0 = null;
        id0Var.f4975Z0 = null;
        id0Var.f4977b1 = 0;
        this.f557o = id0Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, di1.f2939b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f557o.f4971V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    id0 id0Var2 = this.f557o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    id0Var2.f4978s0 = dimensionPixelSize;
                    id0Var2.f4979t0 = dimensionPixelSize;
                    id0Var2.f4980u0 = dimensionPixelSize;
                    id0Var2.f4981v0 = dimensionPixelSize;
                } else if (index == 18) {
                    id0 id0Var3 = this.f557o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    id0Var3.f4980u0 = dimensionPixelSize2;
                    id0Var3.f4982w0 = dimensionPixelSize2;
                    id0Var3.f4983x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f557o.f4981v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f557o.f4982w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f557o.f4978s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f557o.f4983x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f557o.f4979t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f557o.f4969T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f557o.f4953D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f557o.f4954E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f557o.f4955F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f557o.f4957H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f557o.f4956G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f557o.f4958I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f557o.f4959J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f557o.f4961L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f557o.f4963N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f557o.f4962M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f557o.f4964O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f557o.f4960K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f557o.f4967R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f557o.f4968S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f557o.f4965P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f557o.f4966Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f557o.f4970U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7527d = this.f557o;
        m4594i();
    }

    @Override // p000.AbstractC1156ns
    /* JADX INFO: renamed from: h */
    public final void mo281h(C1639ys c1639ys, boolean z) {
        id0 id0Var = this.f557o;
        int i = id0Var.f4980u0;
        if (i > 0 || id0Var.f4981v0 > 0) {
            if (z) {
                id0Var.f4982w0 = id0Var.f4981v0;
                id0Var.f4983x0 = i;
            } else {
                id0Var.f4982w0 = i;
                id0Var.f4983x0 = id0Var.f4981v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:112:0x020f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0220  */
    /* JADX WARN: Code duplicated, block: B:117:0x0227  */
    /* JADX WARN: Code duplicated, block: B:119:0x0234  */
    /* JADX WARN: Code duplicated, block: B:135:0x0257  */
    /* JADX WARN: Code duplicated, block: B:137:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x026e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0297  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02db  */
    /* JADX WARN: Code duplicated, block: B:163:0x02df  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x0312  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b  */
    /* JADX WARN: Code duplicated, block: B:171:0x031f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0330  */
    /* JADX WARN: Code duplicated, block: B:175:0x0352  */
    /* JADX WARN: Code duplicated, block: B:180:0x0369  */
    /* JADX WARN: Code duplicated, block: B:182:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0381  */
    /* JADX WARN: Code duplicated, block: B:185:0x0386 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0388  */
    /* JADX WARN: Code duplicated, block: B:190:0x0390  */
    /* JADX WARN: Code duplicated, block: B:193:0x0398  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:223:0x03db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:239:0x040e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0415  */
    /* JADX WARN: Code duplicated, block: B:244:0x0418  */
    /* JADX WARN: Code duplicated, block: B:246:0x041e  */
    /* JADX WARN: Code duplicated, block: B:257:0x043a  */
    /* JADX WARN: Code duplicated, block: B:262:0x044e  */
    /* JADX WARN: Code duplicated, block: B:267:0x045c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0462 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x0464  */
    /* JADX WARN: Code duplicated, block: B:275:0x0474  */
    /* JADX WARN: Code duplicated, block: B:277:0x047a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x047c  */
    /* JADX WARN: Code duplicated, block: B:291:0x04af  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:296:0x04de  */
    /* JADX WARN: Code duplicated, block: B:298:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:300:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:317:0x0515  */
    /* JADX WARN: Code duplicated, block: B:319:0x052a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x052c  */
    /* JADX WARN: Code duplicated, block: B:322:0x053a  */
    /* JADX WARN: Code duplicated, block: B:324:0x053f  */
    /* JADX WARN: Code duplicated, block: B:326:0x054d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0570  */
    /* JADX WARN: Code duplicated, block: B:345:0x0587  */
    /* JADX WARN: Code duplicated, block: B:347:0x058b  */
    /* JADX WARN: Code duplicated, block: B:355:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:360:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:362:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:363:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:369:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:371:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:372:0x060c  */
    /* JADX WARN: Code duplicated, block: B:375:0x062e  */
    /* JADX WARN: Code duplicated, block: B:377:0x0637  */
    /* JADX WARN: Code duplicated, block: B:379:0x063b  */
    /* JADX WARN: Code duplicated, block: B:380:0x064c  */
    /* JADX WARN: Code duplicated, block: B:383:0x066e  */
    /* JADX WARN: Code duplicated, block: B:387:0x0684  */
    /* JADX WARN: Code duplicated, block: B:390:0x069a  */
    /* JADX WARN: Code duplicated, block: B:392:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:393:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:396:0x06f5 A[LOOP:18: B:395:0x06f3->B:396:0x06f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:401:0x071f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0721  */
    /* JADX WARN: Code duplicated, block: B:403:0x0726 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x0728  */
    /* JADX WARN: Code duplicated, block: B:405:0x072a  */
    /* JADX WARN: Code duplicated, block: B:407:0x072d  */
    /* JADX WARN: Code duplicated, block: B:408:0x0730 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x0732  */
    /* JADX WARN: Code duplicated, block: B:410:0x0739 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:411:0x073b  */
    /* JADX WARN: Code duplicated, block: B:412:0x073d  */
    /* JADX WARN: Code duplicated, block: B:415:0x074c  */
    /* JADX WARN: Code duplicated, block: B:416:0x074e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0108 A[EDGE_INSN: B:426:0x0108->B:61:0x0108 BREAK  A[LOOP:1: B:55:0x00f1->B:60:0x0103], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:431:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x039e A[EDGE_INSN: B:445:0x039e->B:195:0x039e BREAK  A[LOOP:7: B:184:0x0384->B:194:0x039b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:454:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x046d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x03c1 A[EDGE_INSN: B:475:0x03c1->B:210:0x03c1 BREAK  A[LOOP:13: B:199:0x03a7->B:209:0x03be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0158  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.m82
    /* JADX INFO: renamed from: j */
    public final void mo282j(id0 id0Var, int i, int i2) {
        C1082ls c1082ls;
        C1082ls c1082ls2;
        C1082ls c1082ls3;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1639ys[] c1639ysArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C1639ys[] c1639ysArr2;
        int i16;
        C1639ys[] c1639ysArr3;
        int i17;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        hd0 hd0Var;
        int i21;
        char c;
        char c2;
        int i22;
        int i23;
        int iMin;
        boolean z;
        int i24;
        C1639ys[] c1639ysArr4;
        int i25;
        hd0 hd0Var2;
        int i26;
        int i27;
        int i28;
        C1639ys c1639ys;
        int iM3421T;
        boolean z2;
        int i29;
        int size;
        boolean z3;
        int i30;
        int i31;
        int i32;
        int i33;
        C1082ls c1082ls4;
        C1082ls c1082ls5;
        C1082ls c1082ls6;
        C1082ls c1082ls7;
        int i34;
        int iMax;
        int i35;
        hd0 hd0Var3;
        int iM3132d;
        int iM3131c;
        int i36;
        hd0 hd0Var4;
        int i37;
        int i38;
        C1639ys c1639ys2;
        int iM3422U;
        boolean z4;
        int i39;
        C1639ys[] c1639ysArr5;
        int i40;
        int i41;
        int iCeil;
        int iCeil2;
        int i42;
        int i43;
        int i44;
        C1639ys c1639ys3;
        int iM3421T2;
        boolean z5;
        C1639ys[] c1639ysArr6;
        Object obj;
        C1639ys[] c1639ysArr7;
        int i45;
        int i46;
        int iM3422U2;
        int i47;
        int iM3421T3;
        C1639ys c1639ys4;
        C1639ys c1639ys5;
        int i48;
        int i49;
        C1639ys c1639ys6;
        C1639ys c1639ys7;
        C1639ys c1639ys8;
        int i50;
        int i51;
        C1639ys c1639ys9;
        int iM3422U3;
        int i52;
        int i53;
        C1639ys[] c1639ysArr8;
        hd0 hd0Var5;
        char c3;
        int i54;
        int i55;
        int i56;
        int i57;
        C1639ys c1639ys10;
        int iM3421T4;
        boolean z6;
        int i58;
        int size2;
        boolean z7;
        int i59;
        int i60;
        int i61;
        int i62;
        C1082ls c1082ls8;
        C1082ls c1082ls9;
        C1082ls c1082ls10;
        C1082ls c1082ls11;
        int i63;
        int iMax2;
        int i64;
        hd0 hd0Var6;
        int iM3132d2;
        int iM3131c2;
        int i65;
        hd0 hd0Var7;
        int i66;
        int i67;
        int i68;
        int i69;
        C1639ys c1639ys11;
        int iM3422U4;
        int i70;
        int i71;
        boolean z8;
        int i72;
        int i73;
        int i74;
        int i75;
        C1639ys c1639ys12;
        C1639ys[] c1639ysArr9;
        C1082ls c1082ls12;
        C1082ls c1082ls13;
        C1082ls c1082ls14;
        ArrayList arrayList2;
        int i76;
        int mode = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        if (id0Var == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr3 = id0Var.f13115p0;
        C1082ls c1082ls15 = id0Var.f13067J;
        C1082ls c1082ls16 = id0Var.f13066I;
        C1082ls c1082ls17 = id0Var.f13068K;
        C1082ls c1082ls18 = id0Var.f13069L;
        ArrayList arrayList3 = id0Var.f4972W0;
        if (id0Var.f4612r0 > 0) {
            C1332qh c1332qh = id0Var.f4951B0;
            C1639ys c1639ys13 = id0Var.f13077T;
            ch1 ch1Var = c1639ys13 != null ? ((C1676zs) c1639ys13).f13540u0 : null;
            if (ch1Var == null) {
                id0Var.f4985z0 = 0;
                id0Var.f4950A0 = 0;
                id0Var.f4984y0 = false;
            } else {
                int i77 = 0;
                while (i77 < id0Var.f4612r0) {
                    C1639ys c1639ys14 = id0Var.f4611q0[i77];
                    if (c1639ys14 == null) {
                        c1082ls12 = c1082ls16;
                    } else {
                        c1082ls12 = c1082ls16;
                        if (!(c1639ys14 instanceof xi0)) {
                            c1082ls13 = c1082ls17;
                            int iM7130j = c1639ys14.m7130j(0);
                            c1082ls14 = c1082ls18;
                            int iM7130j2 = c1639ys14.m7130j(1);
                            arrayList2 = arrayList3;
                            if (iM7130j == 3) {
                                i76 = i77;
                                if (c1639ys14.f13117r == 1 || iM7130j2 != 3 || c1639ys14.f13118s == 1) {
                                }
                            } else {
                                i76 = i77;
                            }
                            if (iM7130j == 3) {
                                iM7130j = 2;
                            }
                            if (iM7130j2 == 3) {
                                iM7130j2 = 2;
                            }
                            c1332qh.f9500a = iM7130j;
                            c1332qh.f9501b = iM7130j2;
                            c1332qh.f9502c = c1639ys14.m7135q();
                            c1332qh.f9503d = c1639ys14.m7131k();
                            ch1Var.m1220d(c1639ys14, c1332qh);
                            c1639ys14.m7122O(c1332qh.f9504e);
                            c1639ys14.m7119L(c1332qh.f9505f);
                            c1639ys14.m7116I(c1332qh.f9506g);
                        }
                        i77 = i76 + 1;
                        c1082ls16 = c1082ls12;
                        c1082ls17 = c1082ls13;
                        c1082ls18 = c1082ls14;
                        arrayList3 = arrayList2;
                    }
                    c1082ls13 = c1082ls17;
                    c1082ls14 = c1082ls18;
                    arrayList2 = arrayList3;
                    i76 = i77;
                    i77 = i76 + 1;
                    c1082ls16 = c1082ls12;
                    c1082ls17 = c1082ls13;
                    c1082ls18 = c1082ls14;
                    arrayList3 = arrayList2;
                }
                c1082ls = c1082ls16;
                c1082ls2 = c1082ls17;
                c1082ls3 = c1082ls18;
                arrayList = arrayList3;
                i3 = id0Var.f4982w0;
                int i78 = id0Var.f4983x0;
                i4 = id0Var.f4978s0;
                i5 = id0Var.f4979t0;
                iArr = new int[2];
                i6 = (size3 - i3) - i78;
                i7 = id0Var.f4971V0;
                if (i7 == 1) {
                    i6 = (size4 - i4) - i5;
                }
                i8 = i6;
                i9 = id0Var.f4953D0;
                i10 = i78;
                if (i7 == 0) {
                    if (i9 == -1) {
                        id0Var.f4953D0 = 0;
                    }
                    if (id0Var.f4954E0 == -1) {
                        id0Var.f4954E0 = 0;
                    }
                } else {
                    if (i9 == -1) {
                        id0Var.f4953D0 = 0;
                    }
                    if (id0Var.f4954E0 == -1) {
                        id0Var.f4954E0 = 0;
                    }
                }
                c1639ysArr = id0Var.f4611q0;
                i11 = 0;
                i12 = 0;
                while (true) {
                    i13 = id0Var.f4612r0;
                    i14 = i4;
                    if (i11 < i13) {
                        break;
                    }
                    if (id0Var.f4611q0[i11].f13097g0 == 8) {
                        i12++;
                    }
                    i11++;
                    i4 = i14;
                }
                if (i12 > 0) {
                    c1639ysArr2 = new C1639ys[i13 - i12];
                    i74 = 0;
                    i75 = 0;
                    while (i74 < id0Var.f4612r0) {
                        c1639ys12 = id0Var.f4611q0[i74];
                        c1639ysArr9 = c1639ysArr2;
                        if (c1639ys12.f13097g0 != 8) {
                            c1639ysArr9[i75] = c1639ys12;
                            i75++;
                        }
                        i74++;
                        c1639ysArr2 = c1639ysArr9;
                    }
                    i15 = i75;
                } else {
                    i15 = i13;
                    c1639ysArr2 = c1639ysArr;
                }
                id0Var.f4976a1 = c1639ysArr2;
                id0Var.f4977b1 = i15;
                i16 = id0Var.f4969T0;
                if (i16 != 0) {
                    c1639ysArr3 = c1639ysArr2;
                    i17 = i15;
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i20 = id0Var.f4971V0;
                    if (i17 == 0) {
                        if (arrayList.size() == 0) {
                            hd0Var = new hd0(id0Var, i20, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                            arrayList.add(hd0Var);
                        } else {
                            hd0 hd0Var8 = (hd0) arrayList.get(0);
                            hd0Var8.f4535c = 0;
                            hd0Var8.f4534b = null;
                            hd0Var8.f4544l = 0;
                            hd0Var8.f4545m = 0;
                            hd0Var8.f4546n = 0;
                            hd0Var8.f4547o = 0;
                            hd0Var8.f4548p = 0;
                            hd0Var8.m3134f(i20, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, id0Var.f4982w0, id0Var.f4978s0, id0Var.f4983x0, id0Var.f4979t0, i8);
                            hd0Var = hd0Var8;
                        }
                        for (i21 = 0; i21 < i17; i21++) {
                            hd0Var.m3129a(c1639ysArr3[i21]);
                        }
                        c = 0;
                        iArr2[0] = hd0Var.m3132d();
                        c2 = 1;
                        iArr2[1] = hd0Var.m3131c();
                    }
                    i22 = iArr2[c] + i3 + i10;
                    i23 = iArr2[c2] + i14 + i18;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i22, size3);
                        } else if (mode == 0) {
                            size3 = i22;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i19;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i23, i19);
                    } else if (mode2 == 0) {
                        iMin = i23;
                    } else {
                        iMin = 0;
                    }
                    id0Var.f4985z0 = size3;
                    id0Var.f4950A0 = iMin;
                    id0Var.m7122O(size3);
                    id0Var.m7119L(iMin);
                    if (id0Var.f4612r0 > 0) {
                        z = c2;
                    } else {
                        z = 0;
                    }
                    id0Var.f4984y0 = z;
                } else if (i16 != 1) {
                    if (i16 != 2) {
                        c1639ysArr5 = c1639ysArr2;
                        i40 = i15;
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        i3 = i3;
                        i10 = i10;
                        i14 = i14;
                        i41 = id0Var.f4971V0;
                        iCeil = id0Var.f4970U0;
                        if (i41 == 0) {
                            if (iCeil <= 0) {
                                i51 = 0;
                                iCeil2 = 0;
                                for (i50 = 0; i50 < i40; i50++) {
                                    if (i50 > 0) {
                                        i51 += id0Var.f4965P0;
                                    }
                                    c1639ys9 = c1639ysArr5[i50];
                                    if (c1639ys9 != null) {
                                        iM3422U3 = id0Var.m3422U(c1639ys9, i8) + i51;
                                        if (iM3422U3 > i8) {
                                            break;
                                        }
                                        iCeil2++;
                                        i51 = iM3422U3;
                                    }
                                }
                            } else {
                                iCeil2 = iCeil;
                            }
                            iCeil = 0;
                        } else {
                            if (iCeil <= 0) {
                                i43 = 0;
                                i44 = 0;
                                for (i42 = 0; i42 < i40; i42++) {
                                    if (i42 > 0) {
                                        i43 += id0Var.f4966Q0;
                                    }
                                    c1639ys3 = c1639ysArr5[i42];
                                    if (c1639ys3 != null) {
                                        iM3421T2 = id0Var.m3421T(c1639ys3, i8) + i43;
                                        if (iM3421T2 > i8) {
                                            break;
                                        }
                                        i44++;
                                        i43 = iM3421T2;
                                    }
                                }
                                iCeil = i44;
                            }
                            iCeil2 = 0;
                        }
                        if (id0Var.f4975Z0 == null) {
                            id0Var.f4975Z0 = new int[2];
                        }
                        z5 = (iCeil != 0 && i41 == 1) || (iCeil2 == 0 && i41 == 0);
                        while (!z5) {
                            if (i41 == 0) {
                                iCeil = (int) Math.ceil(i40 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i40 / iCeil);
                            }
                            c1639ysArr6 = id0Var.f4974Y0;
                            if (c1639ysArr6 != null || c1639ysArr6.length < iCeil2) {
                                obj = null;
                                id0Var.f4974Y0 = new C1639ys[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(c1639ysArr6, (Object) null);
                            }
                            c1639ysArr7 = id0Var.f4973X0;
                            if (c1639ysArr7 != null || c1639ysArr7.length < iCeil) {
                                id0Var.f4973X0 = new C1639ys[iCeil];
                            } else {
                                Arrays.fill(c1639ysArr7, obj);
                            }
                            for (i45 = 0; i45 < iCeil2; i45++) {
                                for (i48 = 0; i48 < iCeil; i48++) {
                                    i49 = (i48 * iCeil2) + i45;
                                    if (i41 == 1) {
                                        i49 = (i45 * iCeil) + i48;
                                    }
                                    if (i49 < c1639ysArr5.length && (c1639ys6 = c1639ysArr5[i49]) != null) {
                                        int iM3422U5 = id0Var.m3422U(c1639ys6, i8);
                                        c1639ys7 = id0Var.f4974Y0[i45];
                                        if (c1639ys7 != null || c1639ys7.m7135q() < iM3422U5) {
                                            id0Var.f4974Y0[i45] = c1639ys6;
                                        }
                                        int iM3421T5 = id0Var.m3421T(c1639ys6, i8);
                                        c1639ys8 = id0Var.f4973X0[i48];
                                        if (c1639ys8 != null || c1639ys8.m7131k() < iM3421T5) {
                                            id0Var.f4973X0[i48] = c1639ys6;
                                        }
                                    }
                                }
                            }
                            iM3422U2 = 0;
                            for (i46 = 0; i46 < iCeil2; i46++) {
                                c1639ys5 = id0Var.f4974Y0[i46];
                                if (c1639ys5 == null) {
                                    if (i46 > 0) {
                                        iM3422U2 += id0Var.f4965P0;
                                    }
                                    iM3422U2 = id0Var.m3422U(c1639ys5, i8) + iM3422U2;
                                }
                            }
                            iM3421T3 = 0;
                            for (i47 = 0; i47 < iCeil; i47++) {
                                c1639ys4 = id0Var.f4973X0[i47];
                                if (c1639ys4 == null) {
                                    if (i47 > 0) {
                                        iM3421T3 += id0Var.f4966Q0;
                                    }
                                    iM3421T3 = id0Var.m3421T(c1639ys4, i8) + iM3421T3;
                                }
                            }
                            iArr2[0] = iM3422U2;
                            iArr2[1] = iM3421T3;
                            if (i41 == 0) {
                                if (iM3422U2 > i8 || iCeil2 <= 1) {
                                    z5 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iM3421T3 > i8 || iCeil <= 1) {
                                z5 = true;
                            } else {
                                iCeil--;
                            }
                        }
                        c2 = 1;
                        int[] iArr4 = id0Var.f4975Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                    } else if (i16 != 3) {
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        i3 = i3;
                        i10 = i10;
                        i14 = i14;
                    } else {
                        i52 = i15;
                        i53 = id0Var.f4971V0;
                        if (i52 == 0) {
                            i18 = i5;
                            iArr2 = iArr;
                            i19 = size4;
                            c3 = 1;
                        } else {
                            arrayList.clear();
                            c1639ysArr8 = c1639ysArr2;
                            i18 = i5;
                            iArr2 = iArr;
                            c3 = 1;
                            hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                            arrayList.add(hd0Var5);
                            if (i53 == 0) {
                                i66 = 0;
                                i67 = 0;
                                i57 = 0;
                                i68 = 0;
                                while (i66 < i52) {
                                    i69 = i67 + 1;
                                    c1639ys11 = c1639ysArr8[i66];
                                    iM3422U4 = id0Var.m3422U(c1639ys11, i8);
                                    i70 = i53;
                                    i71 = i66;
                                    if (c1639ys11.f13115p0[0] == 3) {
                                        i57++;
                                    }
                                    int i79 = i57;
                                    z8 = (i68 != i8 || (id0Var.f4965P0 + i68) + iM3422U4 > i8) && hd0Var5.f4534b != null;
                                    if (!z8 && i71 > 0 && (i73 = id0Var.f4970U0) > 0 && i69 > i73) {
                                        z8 = true;
                                    }
                                    if (z8) {
                                        i53 = i70;
                                        i72 = i71;
                                        hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                        hd0Var5.f4546n = i72;
                                        arrayList.add(hd0Var5);
                                        i68 = iM3422U4;
                                        i67 = i69;
                                    } else {
                                        i53 = i70;
                                        i72 = i71;
                                        if (i72 > 0) {
                                            i68 = id0Var.f4965P0 + iM3422U4 + i68;
                                        } else {
                                            i68 = iM3422U4;
                                        }
                                        i67 = 0;
                                    }
                                    hd0Var5.m3129a(c1639ys11);
                                    i66 = i72 + 1;
                                    i57 = i79;
                                    size4 = size4;
                                }
                                i19 = size4;
                            } else {
                                i19 = size4;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i54 < i52) {
                                    c1639ys10 = c1639ysArr8[i54];
                                    iM3421T4 = id0Var.m3421T(c1639ys10, i8);
                                    if (c1639ys10.f13115p0[1] == 3) {
                                        i55++;
                                    }
                                    int i80 = i55;
                                    z6 = (i56 != i8 || (id0Var.f4966Q0 + i56) + iM3421T4 > i8) && hd0Var5.f4534b != null;
                                    if (!z6 && i54 > 0 && (i58 = id0Var.f4970U0) > 0 && i58 < 0) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                        hd0Var5.f4546n = i54;
                                        arrayList.add(hd0Var5);
                                    } else {
                                        if (i54 > 0) {
                                            i56 = id0Var.f4966Q0 + iM3421T4 + i56;
                                        }
                                        hd0Var5.m3129a(c1639ys10);
                                        i54++;
                                        i55 = i80;
                                    }
                                    i56 = iM3421T4;
                                    hd0Var5.m3129a(c1639ys10);
                                    i54++;
                                    i55 = i80;
                                }
                                i57 = i55;
                            }
                            size2 = arrayList.size();
                            int i81 = id0Var.f4982w0;
                            int i82 = id0Var.f4978s0;
                            int i83 = id0Var.f4983x0;
                            int i84 = id0Var.f4979t0;
                            if (iArr3[0] != 2 || iArr3[1] == 2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i57 > 0 && z7) {
                                for (i65 = 0; i65 < size2; i65++) {
                                    hd0Var7 = (hd0) arrayList.get(i65);
                                    if (i53 == 0) {
                                        hd0Var7.m3133e(i8 - hd0Var7.m3132d());
                                    } else {
                                        hd0Var7.m3133e(i8 - hd0Var7.m3131c());
                                    }
                                }
                            }
                            i59 = i81;
                            i60 = i82;
                            i61 = i83;
                            i62 = i84;
                            c1082ls8 = c1082ls;
                            c1082ls9 = c1082ls2;
                            c1082ls10 = c1082ls3;
                            c1082ls11 = c1082ls15;
                            iMax2 = 0;
                            i64 = 0;
                            for (i63 = 0; i63 < size2; i63++) {
                                hd0Var6 = (hd0) arrayList.get(i63);
                                if (i53 == 0) {
                                    if (i63 < size2 - 1) {
                                        c1082ls10 = ((hd0) arrayList.get(i63 + 1)).f4534b.f13067J;
                                        i62 = 0;
                                    } else {
                                        i62 = id0Var.f4979t0;
                                        c1082ls10 = c1082ls3;
                                    }
                                    C1082ls c1082ls19 = hd0Var6.f4534b.f13069L;
                                    hd0Var6.m3134f(i53, c1082ls8, c1082ls11, c1082ls9, c1082ls10, i59, i60, i61, i62, i8);
                                    iMax2 = Math.max(iMax2, hd0Var6.m3132d());
                                    iM3131c2 = hd0Var6.m3131c() + i64;
                                    if (i63 > 0) {
                                        iM3131c2 += id0Var.f4966Q0;
                                    }
                                    i64 = iM3131c2;
                                    c1082ls11 = c1082ls19;
                                    i60 = 0;
                                } else {
                                    if (i63 < size2 - 1) {
                                        c1082ls9 = ((hd0) arrayList.get(i63 + 1)).f4534b.f13066I;
                                        i61 = 0;
                                    } else {
                                        i61 = id0Var.f4983x0;
                                        c1082ls9 = c1082ls2;
                                    }
                                    C1082ls c1082ls20 = hd0Var6.f4534b.f13068K;
                                    hd0Var6.m3134f(i53, c1082ls8, c1082ls11, c1082ls9, c1082ls10, i59, i60, i61, i62, i8);
                                    iM3132d2 = hd0Var6.m3132d() + iMax2;
                                    int iMax3 = Math.max(i64, hd0Var6.m3131c());
                                    if (i63 > 0) {
                                        iM3132d2 += id0Var.f4965P0;
                                    }
                                    i64 = iMax3;
                                    iMax2 = iM3132d2;
                                    c1082ls8 = c1082ls20;
                                    i59 = 0;
                                }
                            }
                            iArr2[0] = iMax2;
                            iArr2[1] = i64;
                        }
                        c2 = c3;
                    }
                    c = 0;
                    i22 = iArr2[c] + i3 + i10;
                    i23 = iArr2[c2] + i14 + i18;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i22, size3);
                        } else if (mode == 0) {
                            size3 = i22;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i19;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i23, i19);
                    } else if (mode2 == 0) {
                        iMin = i23;
                    } else {
                        iMin = 0;
                    }
                    id0Var.f4985z0 = size3;
                    id0Var.f4950A0 = iMin;
                    id0Var.m7122O(size3);
                    id0Var.m7119L(iMin);
                    if (id0Var.f4612r0 > 0) {
                        z = c2;
                    } else {
                        z = 0;
                    }
                    id0Var.f4984y0 = z;
                } else {
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i24 = i15;
                    c1639ysArr4 = c1639ysArr2;
                    i25 = id0Var.f4971V0;
                    if (i24 != 0) {
                        arrayList.clear();
                        hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                        arrayList.add(hd0Var2);
                        if (i25 == 0) {
                            i37 = 0;
                            i27 = 0;
                            i38 = 0;
                            while (i37 < i24) {
                                c1639ys2 = c1639ysArr4[i37];
                                iM3422U = id0Var.m3422U(c1639ys2, i8);
                                if (c1639ys2.f13115p0[0] == 3) {
                                    i27++;
                                }
                                int i85 = i27;
                                z4 = (i38 != i8 || (id0Var.f4965P0 + i38) + iM3422U > i8) && hd0Var2.f4534b != null;
                                if (!z4 && i37 > 0 && (i39 = id0Var.f4970U0) > 0 && i37 % i39 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                    hd0Var2.f4546n = i37;
                                    arrayList.add(hd0Var2);
                                } else {
                                    if (i37 > 0) {
                                        i38 = id0Var.f4965P0 + iM3422U + i38;
                                    }
                                    hd0Var2.m3129a(c1639ys2);
                                    i37++;
                                    i27 = i85;
                                }
                                i38 = iM3422U;
                                hd0Var2.m3129a(c1639ys2);
                                i37++;
                                i27 = i85;
                            }
                        } else {
                            i26 = 0;
                            i27 = 0;
                            i28 = 0;
                            while (i26 < i24) {
                                c1639ys = c1639ysArr4[i26];
                                iM3421T = id0Var.m3421T(c1639ys, i8);
                                if (c1639ys.f13115p0[1] == 3) {
                                    i27++;
                                }
                                int i86 = i27;
                                z2 = (i28 != i8 || (id0Var.f4966Q0 + i28) + iM3421T > i8) && hd0Var2.f4534b != null;
                                if (!z2 && i26 > 0 && (i29 = id0Var.f4970U0) > 0 && i26 % i29 == 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                    hd0Var2.f4546n = i26;
                                    arrayList.add(hd0Var2);
                                } else {
                                    if (i26 > 0) {
                                        i28 = id0Var.f4966Q0 + iM3421T + i28;
                                    }
                                    hd0Var2.m3129a(c1639ys);
                                    i26++;
                                    i27 = i86;
                                }
                                i28 = iM3421T;
                                hd0Var2.m3129a(c1639ys);
                                i26++;
                                i27 = i86;
                            }
                        }
                        size = arrayList.size();
                        int i87 = id0Var.f4982w0;
                        int i88 = id0Var.f4978s0;
                        int i89 = id0Var.f4983x0;
                        int i90 = id0Var.f4979t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i27 > 0 && z3) {
                            for (i36 = 0; i36 < size; i36++) {
                                hd0Var4 = (hd0) arrayList.get(i36);
                                if (i25 == 0) {
                                    hd0Var4.m3133e(i8 - hd0Var4.m3132d());
                                } else {
                                    hd0Var4.m3133e(i8 - hd0Var4.m3131c());
                                }
                            }
                        }
                        i30 = i87;
                        i31 = i88;
                        i32 = i89;
                        i33 = i90;
                        c1082ls4 = c1082ls;
                        c1082ls5 = c1082ls2;
                        c1082ls6 = c1082ls3;
                        c1082ls7 = c1082ls15;
                        iMax = 0;
                        i35 = 0;
                        for (i34 = 0; i34 < size; i34++) {
                            hd0Var3 = (hd0) arrayList.get(i34);
                            if (i25 == 0) {
                                if (i34 < size - 1) {
                                    c1082ls6 = ((hd0) arrayList.get(i34 + 1)).f4534b.f13067J;
                                    i33 = 0;
                                } else {
                                    i33 = id0Var.f4979t0;
                                    c1082ls6 = c1082ls3;
                                }
                                C1082ls c1082ls21 = hd0Var3.f4534b.f13069L;
                                hd0Var3.m3134f(i25, c1082ls4, c1082ls7, c1082ls5, c1082ls6, i30, i31, i32, i33, i8);
                                iMax = Math.max(iMax, hd0Var3.m3132d());
                                iM3131c = hd0Var3.m3131c() + i35;
                                if (i34 > 0) {
                                    iM3131c += id0Var.f4966Q0;
                                }
                                i35 = iM3131c;
                                c1082ls7 = c1082ls21;
                                i31 = 0;
                            } else {
                                if (i34 < size - 1) {
                                    c1082ls5 = ((hd0) arrayList.get(i34 + 1)).f4534b.f13066I;
                                    i32 = 0;
                                } else {
                                    i32 = id0Var.f4983x0;
                                    c1082ls5 = c1082ls2;
                                }
                                C1082ls c1082ls22 = hd0Var3.f4534b.f13068K;
                                hd0Var3.m3134f(i25, c1082ls4, c1082ls7, c1082ls5, c1082ls6, i30, i31, i32, i33, i8);
                                iM3132d = hd0Var3.m3132d() + iMax;
                                int iMax4 = Math.max(i35, hd0Var3.m3131c());
                                if (i34 > 0) {
                                    iM3132d += id0Var.f4965P0;
                                }
                                i35 = iMax4;
                                iMax = iM3132d;
                                c1082ls4 = c1082ls22;
                                i30 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i35;
                    }
                }
                c2 = 1;
                c = 0;
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                id0Var.f4985z0 = size3;
                id0Var.f4950A0 = iMin;
                id0Var.m7122O(size3);
                id0Var.m7119L(iMin);
                if (id0Var.f4612r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                id0Var.f4984y0 = z;
            }
        } else {
            c1082ls = c1082ls16;
            c1082ls2 = c1082ls17;
            c1082ls3 = c1082ls18;
            arrayList = arrayList3;
            i3 = id0Var.f4982w0;
            int i710 = id0Var.f4983x0;
            i4 = id0Var.f4978s0;
            i5 = id0Var.f4979t0;
            iArr = new int[2];
            i6 = (size3 - i3) - i710;
            i7 = id0Var.f4971V0;
            if (i7 == 1) {
                i6 = (size4 - i4) - i5;
            }
            i8 = i6;
            i9 = id0Var.f4953D0;
            i10 = i710;
            if (i7 == 0) {
                if (i9 == -1) {
                    id0Var.f4953D0 = 0;
                }
                if (id0Var.f4954E0 == -1) {
                    id0Var.f4954E0 = 0;
                }
            } else {
                if (i9 == -1) {
                    id0Var.f4953D0 = 0;
                }
                if (id0Var.f4954E0 == -1) {
                    id0Var.f4954E0 = 0;
                }
            }
            c1639ysArr = id0Var.f4611q0;
            i11 = 0;
            i12 = 0;
            while (true) {
                i13 = id0Var.f4612r0;
                i14 = i4;
                if (i11 < i13) {
                    break;
                    break;
                }
                if (id0Var.f4611q0[i11].f13097g0 == 8) {
                    i12++;
                }
                i11++;
                i4 = i14;
            }
            if (i12 > 0) {
                c1639ysArr2 = new C1639ys[i13 - i12];
                i74 = 0;
                i75 = 0;
                while (i74 < id0Var.f4612r0) {
                    c1639ys12 = id0Var.f4611q0[i74];
                    c1639ysArr9 = c1639ysArr2;
                    if (c1639ys12.f13097g0 != 8) {
                        c1639ysArr9[i75] = c1639ys12;
                        i75++;
                    }
                    i74++;
                    c1639ysArr2 = c1639ysArr9;
                }
                i15 = i75;
            } else {
                i15 = i13;
                c1639ysArr2 = c1639ysArr;
            }
            id0Var.f4976a1 = c1639ysArr2;
            id0Var.f4977b1 = i15;
            i16 = id0Var.f4969T0;
            if (i16 != 0) {
                c1639ysArr3 = c1639ysArr2;
                i17 = i15;
                i18 = i5;
                iArr2 = iArr;
                i19 = size4;
                i3 = i3;
                i10 = i10;
                i14 = i14;
                i20 = id0Var.f4971V0;
                if (i17 == 0) {
                    if (arrayList.size() == 0) {
                        hd0Var = new hd0(id0Var, i20, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                        arrayList.add(hd0Var);
                    } else {
                        hd0 hd0Var9 = (hd0) arrayList.get(0);
                        hd0Var9.f4535c = 0;
                        hd0Var9.f4534b = null;
                        hd0Var9.f4544l = 0;
                        hd0Var9.f4545m = 0;
                        hd0Var9.f4546n = 0;
                        hd0Var9.f4547o = 0;
                        hd0Var9.f4548p = 0;
                        hd0Var9.m3134f(i20, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, id0Var.f4982w0, id0Var.f4978s0, id0Var.f4983x0, id0Var.f4979t0, i8);
                        hd0Var = hd0Var9;
                    }
                    while (i21 < i17) {
                        hd0Var.m3129a(c1639ysArr3[i21]);
                    }
                    c = 0;
                    iArr2[0] = hd0Var.m3132d();
                    c2 = 1;
                    iArr2[1] = hd0Var.m3131c();
                }
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                id0Var.f4985z0 = size3;
                id0Var.f4950A0 = iMin;
                id0Var.m7122O(size3);
                id0Var.m7119L(iMin);
                if (id0Var.f4612r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                id0Var.f4984y0 = z;
            } else if (i16 != 1) {
                if (i16 != 2) {
                    c1639ysArr5 = c1639ysArr2;
                    i40 = i15;
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i41 = id0Var.f4971V0;
                    iCeil = id0Var.f4970U0;
                    if (i41 == 0) {
                        if (iCeil <= 0) {
                            i51 = 0;
                            iCeil2 = 0;
                            while (i50 < i40) {
                                if (i50 > 0) {
                                    i51 += id0Var.f4965P0;
                                }
                                c1639ys9 = c1639ysArr5[i50];
                                if (c1639ys9 != null) {
                                    iM3422U3 = id0Var.m3422U(c1639ys9, i8) + i51;
                                    if (iM3422U3 > i8) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i51 = iM3422U3;
                                    }
                                }
                            }
                        } else {
                            iCeil2 = iCeil;
                        }
                        iCeil = 0;
                    } else {
                        if (iCeil <= 0) {
                            i43 = 0;
                            i44 = 0;
                            while (i42 < i40) {
                                if (i42 > 0) {
                                    i43 += id0Var.f4966Q0;
                                }
                                c1639ys3 = c1639ysArr5[i42];
                                if (c1639ys3 != null) {
                                    iM3421T2 = id0Var.m3421T(c1639ys3, i8) + i43;
                                    if (iM3421T2 > i8) {
                                        break;
                                        break;
                                    } else {
                                        i44++;
                                        i43 = iM3421T2;
                                    }
                                }
                            }
                            iCeil = i44;
                        }
                        iCeil2 = 0;
                    }
                    if (id0Var.f4975Z0 == null) {
                        id0Var.f4975Z0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z5) {
                        if (i41 == 0) {
                            iCeil = (int) Math.ceil(i40 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i40 / iCeil);
                        }
                        c1639ysArr6 = id0Var.f4974Y0;
                        if (c1639ysArr6 != null) {
                            obj = null;
                            id0Var.f4974Y0 = new C1639ys[iCeil2];
                        } else {
                            obj = null;
                            id0Var.f4974Y0 = new C1639ys[iCeil2];
                        }
                        c1639ysArr7 = id0Var.f4973X0;
                        if (c1639ysArr7 != null) {
                            id0Var.f4973X0 = new C1639ys[iCeil];
                        } else {
                            id0Var.f4973X0 = new C1639ys[iCeil];
                        }
                        while (i45 < iCeil2) {
                            while (i48 < iCeil) {
                                i49 = (i48 * iCeil2) + i45;
                                if (i41 == 1) {
                                    i49 = (i45 * iCeil) + i48;
                                }
                                if (i49 < c1639ysArr5.length) {
                                    int iM3422U6 = id0Var.m3422U(c1639ys6, i8);
                                    c1639ys7 = id0Var.f4974Y0[i45];
                                    if (c1639ys7 != null) {
                                        id0Var.f4974Y0[i45] = c1639ys6;
                                    } else {
                                        id0Var.f4974Y0[i45] = c1639ys6;
                                    }
                                    int iM3421T6 = id0Var.m3421T(c1639ys6, i8);
                                    c1639ys8 = id0Var.f4973X0[i48];
                                    if (c1639ys8 != null) {
                                        id0Var.f4973X0[i48] = c1639ys6;
                                    } else {
                                        id0Var.f4973X0[i48] = c1639ys6;
                                    }
                                }
                            }
                        }
                        iM3422U2 = 0;
                        while (i46 < iCeil2) {
                            c1639ys5 = id0Var.f4974Y0[i46];
                            if (c1639ys5 == null) {
                                if (i46 > 0) {
                                    iM3422U2 += id0Var.f4965P0;
                                }
                                iM3422U2 = id0Var.m3422U(c1639ys5, i8) + iM3422U2;
                            }
                        }
                        iM3421T3 = 0;
                        while (i47 < iCeil) {
                            c1639ys4 = id0Var.f4973X0[i47];
                            if (c1639ys4 == null) {
                                if (i47 > 0) {
                                    iM3421T3 += id0Var.f4966Q0;
                                }
                                iM3421T3 = id0Var.m3421T(c1639ys4, i8) + iM3421T3;
                            }
                        }
                        iArr2[0] = iM3422U2;
                        iArr2[1] = iM3421T3;
                        if (i41 == 0) {
                            if (iM3422U2 > i8) {
                            }
                            z5 = true;
                        } else {
                            if (iM3421T3 > i8) {
                            }
                            z5 = true;
                        }
                    }
                    c2 = 1;
                    int[] iArr5 = id0Var.f4975Z0;
                    iArr5[0] = iCeil2;
                    iArr5[1] = iCeil;
                } else if (i16 != 3) {
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                } else {
                    i52 = i15;
                    i53 = id0Var.f4971V0;
                    if (i52 == 0) {
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        c3 = 1;
                    } else {
                        arrayList.clear();
                        c1639ysArr8 = c1639ysArr2;
                        i18 = i5;
                        iArr2 = iArr;
                        c3 = 1;
                        hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                        arrayList.add(hd0Var5);
                        if (i53 == 0) {
                            i66 = 0;
                            i67 = 0;
                            i57 = 0;
                            i68 = 0;
                            while (i66 < i52) {
                                i69 = i67 + 1;
                                c1639ys11 = c1639ysArr8[i66];
                                iM3422U4 = id0Var.m3422U(c1639ys11, i8);
                                i70 = i53;
                                i71 = i66;
                                if (c1639ys11.f13115p0[0] == 3) {
                                    i57++;
                                }
                                int i711 = i57;
                                if (i68 != i8) {
                                }
                                if (!z8) {
                                    z8 = true;
                                }
                                if (z8) {
                                    i53 = i70;
                                    i72 = i71;
                                    hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                    hd0Var5.f4546n = i72;
                                    arrayList.add(hd0Var5);
                                    i68 = iM3422U4;
                                    i67 = i69;
                                } else {
                                    i53 = i70;
                                    i72 = i71;
                                    if (i72 > 0) {
                                        i68 = id0Var.f4965P0 + iM3422U4 + i68;
                                    } else {
                                        i68 = iM3422U4;
                                    }
                                    i67 = 0;
                                }
                                hd0Var5.m3129a(c1639ys11);
                                i66 = i72 + 1;
                                i57 = i711;
                                size4 = size4;
                            }
                            i19 = size4;
                        } else {
                            i19 = size4;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            while (i54 < i52) {
                                c1639ys10 = c1639ysArr8[i54];
                                iM3421T4 = id0Var.m3421T(c1639ys10, i8);
                                if (c1639ys10.f13115p0[1] == 3) {
                                    i55++;
                                }
                                int i810 = i55;
                                if (i56 != i8) {
                                }
                                if (!z6) {
                                    z6 = true;
                                }
                                if (z6) {
                                    hd0Var5 = new hd0(id0Var, i53, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                    hd0Var5.f4546n = i54;
                                    arrayList.add(hd0Var5);
                                } else {
                                    if (i54 > 0) {
                                        i56 = id0Var.f4966Q0 + iM3421T4 + i56;
                                    }
                                    hd0Var5.m3129a(c1639ys10);
                                    i54++;
                                    i55 = i810;
                                }
                                i56 = iM3421T4;
                                hd0Var5.m3129a(c1639ys10);
                                i54++;
                                i55 = i810;
                            }
                            i57 = i55;
                        }
                        size2 = arrayList.size();
                        int i811 = id0Var.f4982w0;
                        int i812 = id0Var.f4978s0;
                        int i813 = id0Var.f4983x0;
                        int i814 = id0Var.f4979t0;
                        if (iArr3[0] != 2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (i57 > 0) {
                            while (i65 < size2) {
                                hd0Var7 = (hd0) arrayList.get(i65);
                                if (i53 == 0) {
                                    hd0Var7.m3133e(i8 - hd0Var7.m3132d());
                                } else {
                                    hd0Var7.m3133e(i8 - hd0Var7.m3131c());
                                }
                            }
                        }
                        i59 = i811;
                        i60 = i812;
                        i61 = i813;
                        i62 = i814;
                        c1082ls8 = c1082ls;
                        c1082ls9 = c1082ls2;
                        c1082ls10 = c1082ls3;
                        c1082ls11 = c1082ls15;
                        iMax2 = 0;
                        i64 = 0;
                        while (i63 < size2) {
                            hd0Var6 = (hd0) arrayList.get(i63);
                            if (i53 == 0) {
                                if (i63 < size2 - 1) {
                                    c1082ls10 = ((hd0) arrayList.get(i63 + 1)).f4534b.f13067J;
                                    i62 = 0;
                                } else {
                                    i62 = id0Var.f4979t0;
                                    c1082ls10 = c1082ls3;
                                }
                                C1082ls c1082ls110 = hd0Var6.f4534b.f13069L;
                                hd0Var6.m3134f(i53, c1082ls8, c1082ls11, c1082ls9, c1082ls10, i59, i60, i61, i62, i8);
                                iMax2 = Math.max(iMax2, hd0Var6.m3132d());
                                iM3131c2 = hd0Var6.m3131c() + i64;
                                if (i63 > 0) {
                                    iM3131c2 += id0Var.f4966Q0;
                                }
                                i64 = iM3131c2;
                                c1082ls11 = c1082ls110;
                                i60 = 0;
                            } else {
                                if (i63 < size2 - 1) {
                                    c1082ls9 = ((hd0) arrayList.get(i63 + 1)).f4534b.f13066I;
                                    i61 = 0;
                                } else {
                                    i61 = id0Var.f4983x0;
                                    c1082ls9 = c1082ls2;
                                }
                                C1082ls c1082ls23 = hd0Var6.f4534b.f13068K;
                                hd0Var6.m3134f(i53, c1082ls8, c1082ls11, c1082ls9, c1082ls10, i59, i60, i61, i62, i8);
                                iM3132d2 = hd0Var6.m3132d() + iMax2;
                                int iMax5 = Math.max(i64, hd0Var6.m3131c());
                                if (i63 > 0) {
                                    iM3132d2 += id0Var.f4965P0;
                                }
                                i64 = iMax5;
                                iMax2 = iM3132d2;
                                c1082ls8 = c1082ls23;
                                i59 = 0;
                            }
                        }
                        iArr2[0] = iMax2;
                        iArr2[1] = i64;
                    }
                    c2 = c3;
                }
                c = 0;
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                id0Var.f4985z0 = size3;
                id0Var.f4950A0 = iMin;
                id0Var.m7122O(size3);
                id0Var.m7119L(iMin);
                if (id0Var.f4612r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                id0Var.f4984y0 = z;
            } else {
                i18 = i5;
                iArr2 = iArr;
                i19 = size4;
                i3 = i3;
                i10 = i10;
                i14 = i14;
                i24 = i15;
                c1639ysArr4 = c1639ysArr2;
                i25 = id0Var.f4971V0;
                if (i24 != 0) {
                    arrayList.clear();
                    hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                    arrayList.add(hd0Var2);
                    if (i25 == 0) {
                        i37 = 0;
                        i27 = 0;
                        i38 = 0;
                        while (i37 < i24) {
                            c1639ys2 = c1639ysArr4[i37];
                            iM3422U = id0Var.m3422U(c1639ys2, i8);
                            if (c1639ys2.f13115p0[0] == 3) {
                                i27++;
                            }
                            int i815 = i27;
                            if (i38 != i8) {
                            }
                            if (!z4) {
                                z4 = true;
                            }
                            if (z4) {
                                hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                hd0Var2.f4546n = i37;
                                arrayList.add(hd0Var2);
                            } else {
                                if (i37 > 0) {
                                    i38 = id0Var.f4965P0 + iM3422U + i38;
                                }
                                hd0Var2.m3129a(c1639ys2);
                                i37++;
                                i27 = i815;
                            }
                            i38 = iM3422U;
                            hd0Var2.m3129a(c1639ys2);
                            i37++;
                            i27 = i815;
                        }
                    } else {
                        i26 = 0;
                        i27 = 0;
                        i28 = 0;
                        while (i26 < i24) {
                            c1639ys = c1639ysArr4[i26];
                            iM3421T = id0Var.m3421T(c1639ys, i8);
                            if (c1639ys.f13115p0[1] == 3) {
                                i27++;
                            }
                            int i816 = i27;
                            if (i28 != i8) {
                            }
                            if (!z2) {
                                z2 = true;
                            }
                            if (z2) {
                                hd0Var2 = new hd0(id0Var, i25, id0Var.f13066I, id0Var.f13067J, id0Var.f13068K, id0Var.f13069L, i8);
                                hd0Var2.f4546n = i26;
                                arrayList.add(hd0Var2);
                            } else {
                                if (i26 > 0) {
                                    i28 = id0Var.f4966Q0 + iM3421T + i28;
                                }
                                hd0Var2.m3129a(c1639ys);
                                i26++;
                                i27 = i816;
                            }
                            i28 = iM3421T;
                            hd0Var2.m3129a(c1639ys);
                            i26++;
                            i27 = i816;
                        }
                    }
                    size = arrayList.size();
                    int i817 = id0Var.f4982w0;
                    int i818 = id0Var.f4978s0;
                    int i819 = id0Var.f4983x0;
                    int i91 = id0Var.f4979t0;
                    if (iArr3[0] != 2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i27 > 0) {
                        while (i36 < size) {
                            hd0Var4 = (hd0) arrayList.get(i36);
                            if (i25 == 0) {
                                hd0Var4.m3133e(i8 - hd0Var4.m3132d());
                            } else {
                                hd0Var4.m3133e(i8 - hd0Var4.m3131c());
                            }
                        }
                    }
                    i30 = i817;
                    i31 = i818;
                    i32 = i819;
                    i33 = i91;
                    c1082ls4 = c1082ls;
                    c1082ls5 = c1082ls2;
                    c1082ls6 = c1082ls3;
                    c1082ls7 = c1082ls15;
                    iMax = 0;
                    i35 = 0;
                    while (i34 < size) {
                        hd0Var3 = (hd0) arrayList.get(i34);
                        if (i25 == 0) {
                            if (i34 < size - 1) {
                                c1082ls6 = ((hd0) arrayList.get(i34 + 1)).f4534b.f13067J;
                                i33 = 0;
                            } else {
                                i33 = id0Var.f4979t0;
                                c1082ls6 = c1082ls3;
                            }
                            C1082ls c1082ls24 = hd0Var3.f4534b.f13069L;
                            hd0Var3.m3134f(i25, c1082ls4, c1082ls7, c1082ls5, c1082ls6, i30, i31, i32, i33, i8);
                            iMax = Math.max(iMax, hd0Var3.m3132d());
                            iM3131c = hd0Var3.m3131c() + i35;
                            if (i34 > 0) {
                                iM3131c += id0Var.f4966Q0;
                            }
                            i35 = iM3131c;
                            c1082ls7 = c1082ls24;
                            i31 = 0;
                        } else {
                            if (i34 < size - 1) {
                                c1082ls5 = ((hd0) arrayList.get(i34 + 1)).f4534b.f13066I;
                                i32 = 0;
                            } else {
                                i32 = id0Var.f4983x0;
                                c1082ls5 = c1082ls2;
                            }
                            C1082ls c1082ls25 = hd0Var3.f4534b.f13068K;
                            hd0Var3.m3134f(i25, c1082ls4, c1082ls7, c1082ls5, c1082ls6, i30, i31, i32, i33, i8);
                            iM3132d = hd0Var3.m3132d() + iMax;
                            int iMax6 = Math.max(i35, hd0Var3.m3131c());
                            if (i34 > 0) {
                                iM3132d += id0Var.f4965P0;
                            }
                            i35 = iMax6;
                            iMax = iM3132d;
                            c1082ls4 = c1082ls25;
                            i30 = 0;
                        }
                    }
                    iArr2[0] = iMax;
                    iArr2[1] = i35;
                }
            }
            c2 = 1;
            c = 0;
            i22 = iArr2[c] + i3 + i10;
            i23 = iArr2[c2] + i14 + i18;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size3 = Math.min(i22, size3);
                } else if (mode == 0) {
                    size3 = i22;
                } else {
                    size3 = 0;
                }
            }
            if (mode2 == 1073741824) {
                iMin = i19;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMin = Math.min(i23, i19);
            } else if (mode2 == 0) {
                iMin = i23;
            } else {
                iMin = 0;
            }
            id0Var.f4985z0 = size3;
            id0Var.f4950A0 = iMin;
            id0Var.m7122O(size3);
            id0Var.m7119L(iMin);
            if (id0Var.f4612r0 > 0) {
                z = c2;
            } else {
                z = 0;
            }
            id0Var.f4984y0 = z;
        }
        setMeasuredDimension(id0Var.f4985z0, id0Var.f4950A0);
    }

    @Override // p000.AbstractC1156ns, android.view.View
    public final void onMeasure(int i, int i2) {
        mo282j(this.f557o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f557o.f4961L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f557o.f4955F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f557o.f4962M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f557o.f4956G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f557o.f4967R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f557o.f4959J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f557o.f4965P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f557o.f4953D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f557o.f4963N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f557o.f4957H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f557o.f4964O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f557o.f4958I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f557o.f4970U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f557o.f4971V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        id0 id0Var = this.f557o;
        id0Var.f4978s0 = i;
        id0Var.f4979t0 = i;
        id0Var.f4980u0 = i;
        id0Var.f4981v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f557o.f4979t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f557o.f4982w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f557o.f4983x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f557o.f4978s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f557o.f4968S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f557o.f4960K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f557o.f4966Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f557o.f4954E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f557o.f4969T0 = i;
        requestLayout();
    }
}
