package com.example.ssmousepro;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.example.ssmousepro.hud.FpsFfGraficoView;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import kotlinx.coroutines.CoroutineScope;
import p000.AbstractC1308pu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.p32;
import p000.ua0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$atualizarDebugExteriorFps$1$run$1", m5373f = "FloatingService.kt", m5374l = {332}, m5375m = "invokeSuspend")
public final class FloatingService$atualizarDebugExteriorFps$1$run$1 extends ny1 implements ch0 {
    final /* synthetic */ boolean $debugBoxAtivo;
    final /* synthetic */ FloatingService$atualizarDebugExteriorFps$1 $self;
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$atualizarDebugExteriorFps$1$run$1(FloatingService floatingService, FloatingService$atualizarDebugExteriorFps$1 floatingService$atualizarDebugExteriorFps$1, boolean z, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = floatingService;
        this.$self = floatingService$atualizarDebugExteriorFps$1;
        this.$debugBoxAtivo = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FloatingService floatingService, String str, boolean z, FloatingService$atualizarDebugExteriorFps$1 floatingService$atualizarDebugExteriorFps$1) {
        TextView textView;
        if (!floatingService.precisaDebugExteriorCurva()) {
            floatingService.debugExteriorEmCurso = false;
            return;
        }
        FloatingService.DebugFfLive debugFfAnti = floatingService.parseDebugFfAnti(str);
        View viewRootExteriorCurva = floatingService.rootExteriorCurva();
        FpsFfGraficoView fpsFfGraficoView = viewRootExteriorCurva != null ? (FpsFfGraficoView) viewRootExteriorCurva.findViewById(C0203R.id.fpsExteriorCurva) : null;
        TextView textView2 = viewRootExteriorCurva != null ? (TextView) viewRootExteriorCurva.findViewById(C0203R.id.txtExteriorLive) : null;
        if (debugFfAnti != null && fpsFfGraficoView != null) {
            float tela = debugFfAnti.getTela();
            if (tela < 200.0f) {
                tela = 200.0f;
            }
            fpsFfGraficoView.setLarguraTela(tela);
            fpsFfGraficoView.setOrigemX(debugFfAnti.getOrigem());
            fpsFfGraficoView.setMouseX(Float.valueOf(debugFfAnti.getX()));
            fpsFfGraficoView.setFatorEfetivoLive(Float.valueOf(debugFfAnti.getEfetivo()));
            int efetivo = (int) (debugFfAnti.getEfetivo() * 100.0f);
            int iM5140F = p32.m5140F(100 - efetivo, 0, 99);
            if (textView2 != null) {
                int x = (int) debugFfAnti.getX();
                int origem = (int) debugFfAnti.getOrigem();
                float sens = debugFfAnti.getSens();
                StringBuilder sbM5345l = AbstractC1308pu.m5345l("x:", x, " origem:", origem, " | passa ");
                AbstractC1308pu.m5356w(sbM5345l, efetivo, "% (freia ", iM5140F, "%) | sens ");
                sbM5345l.append(sens);
                textView2.setText(sbM5345l.toString());
            }
        } else if (zv1.m7371K0(str) && textView2 != null) {
            textView2.setText("dedo: aguardando F1 / daemon?");
        }
        if (z) {
            View view = floatingService.hudOverlayView;
            TextView textView3 = view != null ? (TextView) view.findViewById(C0203R.id.fpsExteriorDebugBox) : null;
            if (!zv1.m7371K0(str)) {
                if (textView3 != null) {
                    textView3.setText(str);
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
        } else {
            View view2 = floatingService.hudOverlayView;
            if (view2 != null && (textView = (TextView) view2.findViewById(C0203R.id.fpsExteriorDebugBox)) != null) {
                textView.setVisibility(8);
            }
        }
        floatingService.debugExteriorEmCurso = false;
        if (floatingService.precisaDebugExteriorCurva()) {
            floatingService.handlerMonitor.postDelayed(floatingService$atualizarDebugExteriorFps$1, floatingService.intervaloDebugExteriorMs);
        }
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new FloatingService$atualizarDebugExteriorFps$1$run$1(this.this$0, this.$self, this.$debugBoxAtivo, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$atualizarDebugExteriorFps$1$run$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                ua0.m6440Z(obj);
                InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                this.label = 1;
                obj = injectionDaemonManager.obterDebugExteriorFps(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (obj == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
            }
            final String str = (String) obj;
            Handler handler = this.this$0.handlerMonitor;
            final FloatingService floatingService = this.this$0;
            final boolean z = this.$debugBoxAtivo;
            final FloatingService$atualizarDebugExteriorFps$1 floatingService$atualizarDebugExteriorFps$1 = this.$self;
            handler.post(new Runnable() { // from class: com.example.ssmousepro.b
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingService$atualizarDebugExteriorFps$1$run$1.invokeSuspend$lambda$0(floatingService, str, z, floatingService$atualizarDebugExteriorFps$1);
                }
            });
        } catch (Exception unused) {
            this.this$0.debugExteriorEmCurso = false;
            this.this$0.handlerMonitor.postDelayed(this.$self, this.this$0.intervaloDebugExteriorMs);
        }
        return z32.f13265a;
    }
}
