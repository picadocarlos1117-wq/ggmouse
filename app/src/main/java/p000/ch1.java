package p000;

import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 {

    /* JADX INFO: renamed from: i */
    public static final float[] f1803i = {1.0f, TouchPipeline.SIZE, TouchPipeline.SIZE, TouchPipeline.SIZE, -1.0f, TouchPipeline.SIZE, TouchPipeline.SIZE, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f1804j = {1.0f, TouchPipeline.SIZE, TouchPipeline.SIZE, TouchPipeline.SIZE, -0.5f, TouchPipeline.SIZE, TouchPipeline.SIZE, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f1805k = {0.5f, TouchPipeline.SIZE, TouchPipeline.SIZE, TouchPipeline.SIZE, -1.0f, TouchPipeline.SIZE, TouchPipeline.SIZE, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f1806a;

    /* JADX INFO: renamed from: b */
    public int f1807b;

    /* JADX INFO: renamed from: c */
    public int f1808c;

    /* JADX INFO: renamed from: d */
    public int f1809d;

    /* JADX INFO: renamed from: e */
    public int f1810e;

    /* JADX INFO: renamed from: f */
    public int f1811f;

    /* JADX INFO: renamed from: g */
    public Object f1812g;

    /* JADX INFO: renamed from: h */
    public Object f1813h;

    public ch1(int i, int i2) {
        int i3;
        switch (i2) {
            case 3:
                this.f1806a = i;
                if (i == 2) {
                    this.f1808c = 3;
                } else {
                    if (i != 3 && i != 4) {
                        f40.m2713i(jd0.m3610h(i, "K: ", " is not supported for Crystals Kyber"));
                        throw null;
                    }
                    this.f1808c = 2;
                }
                int i4 = i * 384;
                this.f1807b = i4;
                int i5 = i4 + 32;
                this.f1809d = i5;
                this.f1810e = i4;
                this.f1811f = i5;
                this.f1813h = new C0599ed(11);
                this.f1812g = new lw0(this);
                return;
            default:
                this.f1812g = new rn1(256);
                if (i != 2) {
                    if (i == 3) {
                        this.f1807b = 6;
                        this.f1808c = 5;
                        this.f1809d = 4;
                        this.f1810e = 524288;
                        this.f1806a = 128;
                    } else {
                        if (i != 5) {
                            f40.m2713i(jd0.m3610h(i, "The mode ", "is not supported by Crystals Dilithium!"));
                            throw null;
                        }
                        this.f1807b = 8;
                        this.f1808c = 7;
                        this.f1809d = 2;
                        this.f1810e = 524288;
                    }
                    this.f1813h = new qo0(20);
                    this.f1811f = (this.f1807b * 320) + 32;
                    i3 = this.f1810e;
                    if (i3 == 131072 && i3 != 524288) {
                        l41.m4048q("Wrong Dilithium Gamma1!");
                        throw null;
                    }
                    return;
                }
                this.f1807b = 4;
                this.f1808c = 4;
                this.f1809d = 2;
                this.f1810e = OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING;
                this.f1806a = 96;
                this.f1813h = new qo0(20);
                this.f1811f = (this.f1807b * 320) + 32;
                i3 = this.f1810e;
                if (i3 == 131072) {
                    return;
                }
                l41.m4048q("Wrong Dilithium Gamma1!");
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1217b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1218c(bh1 bh1Var) {
        ah1 ah1Var = bh1Var.f1369a;
        ah1 ah1Var2 = bh1Var.f1370b;
        C0716hj[] c0716hjArr = ah1Var.f233a;
        if (c0716hjArr.length == 1 && c0716hjArr[0].f4584a == 0) {
            C0716hj[] c0716hjArr2 = ah1Var2.f233a;
            if (c0716hjArr2.length == 1 && c0716hjArr2[0].f4584a == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m1219a() {
        try {
            j22 j22Var = new j22("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f1813h = j22Var;
            this.f1807b = GLES20.glGetUniformLocation(j22Var.f5241a, "uMvpMatrix");
            this.f1808c = GLES20.glGetUniformLocation(((j22) this.f1813h).f5241a, "uTexMatrix");
            this.f1809d = ((j22) this.f1813h).m3538d("aPosition");
            this.f1810e = ((j22) this.f1813h).m3538d("aTexCoords");
            this.f1811f = GLES20.glGetUniformLocation(((j22) this.f1813h).f5241a, "uTexture");
        } catch (ji0 e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x019d  */
    /* JADX WARN: Code duplicated, block: B:114:0x019f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0200  */
    /* JADX WARN: Code duplicated, block: B:159:0x021a  */
    /* JADX WARN: Code duplicated, block: B:160:0x021f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0224  */
    /* JADX WARN: Code duplicated, block: B:166:0x022c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0233  */
    /* JADX WARN: Code duplicated, block: B:171:0x0239  */
    /* JADX WARN: Code duplicated, block: B:174:0x0246  */
    /* JADX WARN: Code duplicated, block: B:176:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0268  */
    /* JADX WARN: Code duplicated, block: B:188:0x026c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0272  */
    /* JADX WARN: Code duplicated, block: B:191:0x0277  */
    /* JADX WARN: Code duplicated, block: B:194:0x0294  */
    /* JADX WARN: Code duplicated, block: B:195:0x0296  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX INFO: renamed from: d */
    public void m1220d(C1639ys c1639ys, C1332qh c1332qh) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iM5359z;
        int iMakeMeasureSpec3;
        C1676zs c1676zs;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1306ps c1306ps;
        int i;
        int measuredWidth;
        int measuredHeight;
        int i2;
        int iMin;
        int i3;
        int i4;
        int iMin2;
        int i5;
        int i6;
        int iMakeMeasureSpec4;
        boolean z7;
        int baseline;
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i8;
        boolean z11;
        int i9;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f1813h;
        if (c1639ys == null) {
            return;
        }
        C1082ls c1082ls = c1639ys.f13068K;
        C1082ls c1082ls2 = c1639ys.f13066I;
        if (c1639ys.f13097g0 == 8) {
            c1332qh.f9504e = 0;
            c1332qh.f9505f = 0;
            c1332qh.f9506g = 0;
            return;
        }
        if (c1639ys.f13077T == null) {
            return;
        }
        int i10 = c1332qh.f9500a;
        int i11 = c1332qh.f9501b;
        int i12 = c1332qh.f9502c;
        int i13 = c1332qh.f9503d;
        int i14 = this.f1806a + this.f1807b;
        int i15 = this.f1808c;
        View view = c1639ys.f13095f0;
        int iM5359z2 = AbstractC1308pu.m5359z(i10);
        if (iM5359z2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            if (iM5359z2 != 1) {
                if (iM5359z2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1810e, i15, -2);
                    boolean z12 = c1639ys.f13117r == 1;
                    int i16 = c1332qh.f9509j;
                    if (i16 == 1 || i16 == 2) {
                        boolean z13 = view.getMeasuredHeight() == c1639ys.m7131k();
                        if (c1332qh.f9509j == 2 || !z12 || ((z12 && z13) || c1639ys.mo6773A())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1639ys.m7135q(), 1073741824);
                        }
                    }
                } else if (iM5359z2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i17 = this.f1810e;
                    int i18 = c1082ls2 != null ? c1082ls2.f6504g : 0;
                    if (c1082ls != null) {
                        i18 += c1082ls.f6504g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
                }
                iM5359z = AbstractC1308pu.m5359z(i11);
                if (iM5359z != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (iM5359z != 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1811f, i14, -2);
                } else if (iM5359z != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1811f, i14, -2);
                    if (c1639ys.f13118s == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i8 = c1332qh.f9509j;
                    if (i8 != 1 || i8 == 2) {
                        if (view.getMeasuredWidth() == c1639ys.m7135q()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c1332qh.f9509j != 2 || !z10 || ((z10 && z11) || c1639ys.mo6774B())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1639ys.m7131k(), 1073741824);
                        }
                    }
                } else if (iM5359z != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i19 = this.f1811f;
                    if (c1082ls2 != null) {
                        i9 = c1639ys.f13067J.f6504g;
                    } else {
                        i9 = 0;
                    }
                    if (c1082ls != null) {
                        i9 += c1639ys.f13069L.f6504g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i19, i14 + i9, -1);
                }
                c1676zs = (C1676zs) c1639ys.f13077T;
                if (c1676zs == null && rc2.m5763D(constraintLayout.f570n, 256) && view.getMeasuredWidth() == c1639ys.m7135q() && view.getMeasuredWidth() < c1676zs.m7135q() && view.getMeasuredHeight() == c1639ys.m7131k() && view.getMeasuredHeight() < c1676zs.m7131k() && view.getBaseline() == c1639ys.f13085a0 && !c1639ys.m7144z() && m1217b(c1639ys.f13064G, iMakeMeasureSpec2, c1639ys.m7135q()) && m1217b(c1639ys.f13065H, iMakeMeasureSpec3, c1639ys.m7131k())) {
                    c1332qh.f9504e = c1639ys.m7135q();
                    c1332qh.f9505f = c1639ys.m7131k();
                    c1332qh.f9506g = c1639ys.f13085a0;
                    return;
                }
                if (i10 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i11 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i11 != 4 || i11 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 != 4 || i10 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || c1639ys.f13080W <= TouchPipeline.SIZE) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || c1639ys.f13080W <= TouchPipeline.SIZE) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                c1306ps = (C1306ps) view.getLayoutParams();
                i = c1332qh.f9509j;
                if (i == 1 && i != 2 && z && c1639ys.f13117r == 0 && z2 && c1639ys.f13118s == 0) {
                    z7 = false;
                    baseline = 0;
                    i7 = -1;
                    iMin = 0;
                    iMin2 = 0;
                } else {
                    if ((view instanceof m82) || !(c1639ys instanceof id0)) {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        ((m82) view).mo282j((id0) c1639ys, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    c1639ys.f13064G = iMakeMeasureSpec2;
                    c1639ys.f13065H = iMakeMeasureSpec3;
                    c1639ys.f13096g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i2 = c1639ys.f13120u;
                    if (i2 > 0) {
                        iMin = Math.max(i2, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i3 = c1639ys.f13121v;
                    if (i3 > 0) {
                        iMin = Math.min(i3, iMin);
                    }
                    i4 = c1639ys.f13123x;
                    if (i4 > 0) {
                        iMin2 = Math.max(i4, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i5 = iMakeMeasureSpec3;
                    i6 = c1639ys.f13124y;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!rc2.m5763D(constraintLayout.f570n, 1)) {
                        if (!z5 && z3) {
                            iMin = (int) ((iMin2 * c1639ys.f13080W) + 0.5f);
                        } else if (z6 && z4) {
                            iMin2 = (int) ((iMin / c1639ys.f13080W) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i5;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c1639ys.f13064G = iMakeMeasureSpec2;
                        c1639ys.f13065H = iMakeMeasureSpec4;
                        z7 = false;
                        c1639ys.f13096g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMin = measuredWidth2;
                        iMin2 = measuredHeight2;
                    } else {
                        baseline = baseline2;
                        z7 = false;
                    }
                    i7 = -1;
                }
                if (baseline != i7) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (iMin == c1332qh.f9502c || iMin2 != c1332qh.f9503d) {
                    z9 = true;
                } else {
                    z9 = z7;
                }
                c1332qh.f9508i = z9;
                if (c1306ps.f9089c0) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && c1639ys.f13085a0 != baseline) {
                    c1332qh.f9508i = true;
                }
                c1332qh.f9504e = iMin;
                c1332qh.f9505f = iMin2;
                c1332qh.f9507h = z8;
                c1332qh.f9506g = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1810e, i15, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iM5359z = AbstractC1308pu.m5359z(i11);
        if (iM5359z != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (iM5359z != 1) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1811f, i14, -2);
        } else if (iM5359z != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f1811f, i14, -2);
            if (c1639ys.f13118s == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i8 = c1332qh.f9509j;
            if (i8 != 1) {
                if (view.getMeasuredWidth() == c1639ys.m7135q()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1332qh.f9509j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1639ys.m7131k(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1639ys.m7131k(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == c1639ys.m7135q()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1332qh.f9509j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1639ys.m7131k(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1639ys.m7131k(), 1073741824);
                }
            }
        } else if (iM5359z != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            int i110 = this.f1811f;
            if (c1082ls2 != null) {
                i9 = c1639ys.f13067J.f6504g;
            } else {
                i9 = 0;
            }
            if (c1082ls != null) {
                i9 += c1639ys.f13069L.f6504g;
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i110, i14 + i9, -1);
        }
        c1676zs = (C1676zs) c1639ys.f13077T;
        if (c1676zs == null) {
        }
        if (i10 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i11 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i11 != 4) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (i10 != 4) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        c1306ps = (C1306ps) view.getLayoutParams();
        i = c1332qh.f9509j;
        if (i == 1) {
            if (view instanceof m82) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            c1639ys.f13064G = iMakeMeasureSpec2;
            c1639ys.f13065H = iMakeMeasureSpec3;
            c1639ys.f13096g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline3 = view.getBaseline();
            i2 = c1639ys.f13120u;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c1639ys.f13121v;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c1639ys.f13123x;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c1639ys.f13124y;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!rc2.m5763D(constraintLayout.f570n, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / c1639ys.f13080W) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c1639ys.f13080W) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c1639ys.f13064G = iMakeMeasureSpec2;
                c1639ys.f13065H = iMakeMeasureSpec4;
                z7 = false;
                c1639ys.f13096g = false;
                int measuredWidth3 = view.getMeasuredWidth();
                int measuredHeight3 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth3;
                iMin2 = measuredHeight3;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c1639ys.f13064G = iMakeMeasureSpec2;
                c1639ys.f13065H = iMakeMeasureSpec4;
                z7 = false;
                c1639ys.f13096g = false;
                int measuredWidth4 = view.getMeasuredWidth();
                int measuredHeight4 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth4;
                iMin2 = measuredHeight4;
            }
            i7 = -1;
        } else {
            if (view instanceof m82) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            c1639ys.f13064G = iMakeMeasureSpec2;
            c1639ys.f13065H = iMakeMeasureSpec3;
            c1639ys.f13096g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline4 = view.getBaseline();
            i2 = c1639ys.f13120u;
            if (i2 > 0) {
                iMin = Math.max(i2, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i3 = c1639ys.f13121v;
            if (i3 > 0) {
                iMin = Math.min(i3, iMin);
            }
            i4 = c1639ys.f13123x;
            if (i4 > 0) {
                iMin2 = Math.max(i4, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i5 = iMakeMeasureSpec3;
            i6 = c1639ys.f13124y;
            if (i6 > 0) {
                iMin2 = Math.min(i6, iMin2);
            }
            if (!rc2.m5763D(constraintLayout.f570n, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / c1639ys.f13080W) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / c1639ys.f13080W) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c1639ys.f13064G = iMakeMeasureSpec2;
                c1639ys.f13065H = iMakeMeasureSpec4;
                z7 = false;
                c1639ys.f13096g = false;
                int measuredWidth5 = view.getMeasuredWidth();
                int measuredHeight5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth5;
                iMin2 = measuredHeight5;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i5;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c1639ys.f13064G = iMakeMeasureSpec2;
                c1639ys.f13065H = iMakeMeasureSpec4;
                z7 = false;
                c1639ys.f13096g = false;
                int measuredWidth6 = view.getMeasuredWidth();
                int measuredHeight6 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth6;
                iMin2 = measuredHeight6;
            }
            i7 = -1;
        }
        if (baseline != i7) {
            z8 = true;
        } else {
            z8 = z7;
        }
        if (iMin == c1332qh.f9502c) {
            z9 = true;
        } else {
            z9 = true;
        }
        c1332qh.f9508i = z9;
        if (c1306ps.f9089c0) {
            z8 = true;
        }
        if (z8) {
            c1332qh.f9508i = true;
        }
        c1332qh.f9504e = iMin;
        c1332qh.f9505f = iMin2;
        c1332qh.f9507h = z8;
        c1332qh.f9506g = baseline;
    }

    public ch1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1813h = constraintLayout;
        this.f1812g = constraintLayout2;
    }
}
