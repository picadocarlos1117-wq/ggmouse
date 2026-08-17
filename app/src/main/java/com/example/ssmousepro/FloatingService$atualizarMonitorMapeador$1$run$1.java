package com.example.ssmousepro;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import com.example.ssmousepro.injection.PipelineMonitorText;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$atualizarMonitorMapeador$1$run$1", m5373f = "FloatingService.kt", m5374l = {456}, m5375m = "invokeSuspend")
public final class FloatingService$atualizarMonitorMapeador$1$run$1 extends ny1 implements ch0 {
    final /* synthetic */ Set<String> $campos;
    final /* synthetic */ FloatingService$atualizarMonitorMapeador$1 $self;
    long J$0;
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$atualizarMonitorMapeador$1$run$1(FloatingService floatingService, Set<String> set, FloatingService$atualizarMonitorMapeador$1 floatingService$atualizarMonitorMapeador$1, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = floatingService;
        this.$campos = set;
        this.$self = floatingService$atualizarMonitorMapeador$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FloatingService floatingService, CharSequence charSequence, FloatingService$atualizarMonitorMapeador$1 floatingService$atualizarMonitorMapeador$1) {
        if (!floatingService.precisaMonitorMapeador()) {
            floatingService.monitorMapeadorEmCurso = false;
            return;
        }
        View view = floatingService.hudOverlayView;
        ScrollView scrollView = view != null ? (ScrollView) view.findViewById(C0203R.id.painelMonitorMapeadorScroll) : null;
        View view2 = floatingService.hudOverlayView;
        TextView textView = view2 != null ? (TextView) view2.findViewById(C0203R.id.painelMonitorMapeador) : null;
        if (textView != null) {
            textView.setText(charSequence, TextView.BufferType.SPANNABLE);
        }
        if (scrollView != null) {
            scrollView.setVisibility(0);
        }
        floatingService.monitorMapeadorEmCurso = false;
        if (floatingService.precisaMonitorMapeador()) {
            floatingService.handlerMonitor.postDelayed(floatingService$atualizarMonitorMapeador$1, floatingService.intervaloMonitorMapeadorMs);
        }
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new FloatingService$atualizarMonitorMapeador$1$run$1(this.this$0, this.$campos, this.$self, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$atualizarMonitorMapeador$1$run$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.label;
        try {
            if (i == 0) {
                ua0.m6440Z(obj);
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                this.J$0 = jElapsedRealtimeNanos;
                this.label = 1;
                obj = injectionDaemonManager.obterPipelineMetrics(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (obj == enumC1530vu) {
                    return enumC1530vu;
                }
                j = jElapsedRealtimeNanos;
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                ua0.m6440Z(obj);
            }
            long[] jArr = (long[]) obj;
            double dElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - j) / 1000000.0d;
            boolean zIsDaemonVinculado = InjectionDaemonManager.INSTANCE.isDaemonVinculado();
            PipelineMonitorText pipelineMonitorText = PipelineMonitorText.INSTANCE;
            PipelineMonitorText.Estado estado = this.this$0.estadoMonitorMapeador;
            Set<String> set = this.$campos;
            if (jArr == null) {
                dElapsedRealtimeNanos = -1.0d;
            }
            final CharSequence charSequence = pipelineMonitorText.formatarSpannable(jArr, estado, zIsDaemonVinculado, set, dElapsedRealtimeNanos);
            Handler handler = this.this$0.handlerMonitor;
            final FloatingService floatingService = this.this$0;
            final FloatingService$atualizarMonitorMapeador$1 floatingService$atualizarMonitorMapeador$1 = this.$self;
            handler.post(new Runnable() { // from class: com.example.ssmousepro.c
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingService$atualizarMonitorMapeador$1$run$1.invokeSuspend$lambda$0(floatingService, charSequence, floatingService$atualizarMonitorMapeador$1);
                }
            });
        } catch (Exception unused) {
            this.this$0.monitorMapeadorEmCurso = false;
            this.this$0.handlerMonitor.postDelayed(this.$self, this.this$0.intervaloMonitorMapeadorMs);
        }
        return z32.f13265a;
    }
}
