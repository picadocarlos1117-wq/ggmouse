package com.example.ssmousepro.activation;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.example.ssmousepro.IAimStateListener;
import com.example.ssmousepro.ICursorPositionProvider;
import com.example.ssmousepro.IVirtualCursorListener;
import com.example.ssmousepro.activation.WifiDaemonClient;
import com.example.ssmousepro.injection.InjectionProtocol;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p000.AbstractC0616eu;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1451tp;
import p000.C1348qx;
import p000.C1452tq;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.RunnableC1059l5;
import p000.RunnableC1177oc;
import p000.ch0;
import p000.dc0;
import p000.f40;
import p000.gw1;
import p000.hp0;
import p000.hw1;
import p000.is1;
import p000.mg0;
import p000.ny1;
import p000.ua0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class WifiDaemonClient {
    private static final int CONNECT_TIMEOUT_MS = 400;
    private static final String TAG = "WifiDaemonClient";
    private static volatile IAimStateListener aimListener;
    private static BufferedReader cmdReader;
    private static Socket cmdSocket;
    private static OutputStreamWriter cmdWriter;
    private static volatile IVirtualCursorListener cursorListener;
    private static volatile ICursorPositionProvider cursorProvider;
    private static BufferedReader evtReader;
    private static Socket evtSocket;
    private static Thread evtThread;
    private static OutputStreamWriter evtWriter;
    private static volatile ch0 onPosAbsoluta;
    public static final WifiDaemonClient INSTANCE = new WifiDaemonClient();
    private static final AtomicBoolean evtRodando = new AtomicBoolean(false);
    private static final Object evtWriteLock = new Object();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiDaemonClient$emIo$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiDaemonClient$emIo$2", m5373f = "WifiDaemonClient.kt", m5374l = {}, m5375m = "invokeSuspend")
    public static final class C02202 extends ny1 implements ch0 {
        final /* synthetic */ mg0 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02202(mg0 mg0Var, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$block = mg0Var;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02202(this.$block, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02202) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ua0.m6440Z(obj);
                return this.$block.invoke();
            }
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiDaemonClient$obterDebugExteriorFps$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiDaemonClient", m5373f = "WifiDaemonClient.kt", m5374l = {128}, m5375m = "obterDebugExteriorFps")
    public static final class C02211 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C02211(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiDaemonClient.this.obterDebugExteriorFps(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WifiDaemonClient$obterPipelineMetrics$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiDaemonClient", m5373f = "WifiDaemonClient.kt", m5374l = {131}, m5375m = "obterPipelineMetrics")
    public static final class C02221 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C02221(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WifiDaemonClient.this.obterPipelineMetrics(this);
        }
    }

    private WifiDaemonClient() {
    }

    private final Socket abrirSocket(int i) throws IOException {
        Socket socket = new Socket();
        socket.setTcpNoDelay(true);
        socket.connect(new InetSocketAddress("127.0.0.1", i), CONNECT_TIMEOUT_MS);
        return socket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String consultar$lambda$1(String str, String str2) {
        return INSTANCE.consultarSync(str, str2);
    }

    private final synchronized String consultarSync(String str, String str2) {
        String strUnescape = null;
        try {
            try {
                garantirCmd();
                OutputStreamWriter outputStreamWriter = cmdWriter;
                if (outputStreamWriter == null) {
                    return null;
                }
                BufferedReader bufferedReader = cmdReader;
                if (bufferedReader == null) {
                    return null;
                }
                outputStreamWriter.write(str + " " + str2);
                outputStreamWriter.write(10);
                outputStreamWriter.flush();
                String line = bufferedReader.readLine();
                if (line == null) {
                    return null;
                }
                if (line.equalsIgnoreCase("ERR")) {
                    return null;
                }
                if (hw1.m3309D0(line, "OK ", true)) {
                    strUnescape = unescape(line.substring(3));
                } else if (line.equalsIgnoreCase("OK")) {
                    strUnescape = "";
                }
            } catch (Exception e) {
                logFalha("Falha consulta " + str + " " + str2, e);
                fecharCmd();
            }
            return strUnescape;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object emIo(mg0 mg0Var, InterfaceC0579du interfaceC0579du) {
        return naMain() ? BuildersKt.withContext(Dispatchers.getIO(), new C02202(mg0Var, null), interfaceC0579du) : mg0Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enviar$lambda$0(String str) {
        return INSTANCE.enviarSync(str);
    }

    private final synchronized boolean enviarSync(String str) {
        boolean z = false;
        try {
            garantirCmd();
            OutputStreamWriter outputStreamWriter = cmdWriter;
            if (outputStreamWriter == null) {
                return false;
            }
            BufferedReader bufferedReader = cmdReader;
            if (bufferedReader == null) {
                return false;
            }
            outputStreamWriter.write(zv1.m7383W0(str).toString());
            outputStreamWriter.write(10);
            outputStreamWriter.flush();
            String line = bufferedReader.readLine();
            if (line == null) {
                return false;
            }
            if (line.equalsIgnoreCase("OK") || hw1.m3309D0(line, "OK", true)) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            logFalha("Falha comando Wi‑Fi: " + str, e);
            fecharCmd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 fechar$lambda$5() {
        evtRodando.set(false);
        WifiDaemonClient wifiDaemonClient = INSTANCE;
        wifiDaemonClient.fecharEvt();
        wifiDaemonClient.fecharCmd();
        return z32.f13265a;
    }

    private final void fecharCmd() {
        try {
            OutputStreamWriter outputStreamWriter = cmdWriter;
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
        } catch (Throwable unused) {
        }
        try {
            BufferedReader bufferedReader = cmdReader;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Throwable unused2) {
        }
        try {
            Socket socket = cmdSocket;
            if (socket != null) {
                socket.close();
            }
        } catch (Throwable unused3) {
        }
        cmdWriter = null;
        cmdReader = null;
        cmdSocket = null;
    }

    private final void fecharEvt() {
        evtRodando.set(false);
        try {
            OutputStreamWriter outputStreamWriter = evtWriter;
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
        } catch (Throwable unused) {
        }
        try {
            BufferedReader bufferedReader = evtReader;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Throwable unused2) {
        }
        try {
            Socket socket = evtSocket;
            if (socket != null) {
                socket.close();
            }
        } catch (Throwable unused3) {
        }
        evtWriter = null;
        evtReader = null;
        evtSocket = null;
        evtThread = null;
    }

    private final void forcarReabrirEvt() {
        fecharEvt();
        garantirEvt();
    }

    private final void garantirCmd() throws IOException {
        Socket socket = cmdSocket;
        if (socket != null && socket.isConnected()) {
            Socket socket2 = cmdSocket;
            socket2.getClass();
            if (!socket2.isClosed() && cmdWriter != null && cmdReader != null) {
                return;
            }
        }
        fecharCmd();
        Socket socketAbrirSocket = abrirSocket(WifiAdbDaemonMain.PORT_CMD);
        cmdSocket = socketAbrirSocket;
        OutputStream outputStream = socketAbrirSocket.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        cmdWriter = new OutputStreamWriter(outputStream, charset);
        cmdReader = new BufferedReader(new InputStreamReader(socketAbrirSocket.getInputStream(), charset));
    }

    private final void garantirEvt() {
        Socket socket;
        Socket socket2;
        Thread thread;
        AtomicBoolean atomicBoolean = evtRodando;
        if (!atomicBoolean.get() || (socket = evtSocket) == null || !socket.isConnected() || (socket2 = evtSocket) == null || socket2.isClosed() || (thread = evtThread) == null || !thread.isAlive()) {
            fecharEvt();
            try {
                Socket socketAbrirSocket = abrirSocket(WifiAdbDaemonMain.PORT_EVT);
                evtSocket = socketAbrirSocket;
                OutputStream outputStream = socketAbrirSocket.getOutputStream();
                Charset charset = StandardCharsets.UTF_8;
                evtWriter = new OutputStreamWriter(outputStream, charset);
                evtReader = new BufferedReader(new InputStreamReader(socketAbrirSocket.getInputStream(), charset));
                atomicBoolean.set(true);
                Thread thread2 = new Thread(new RunnableC1059l5(13), "sspro-wifi-evt-app");
                thread2.setDaemon(true);
                thread2.start();
                evtThread = thread2;
            } catch (Exception e) {
                Log.w(TAG, "Falha ao abrir socket EVT", e);
                fecharEvt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void garantirEvt$lambda$7() {
        INSTANCE.loopEvt();
    }

    private final void logFalha(String str, Exception exc) {
        if (!(exc instanceof ConnectException) && !(exc instanceof SocketTimeoutException)) {
            Log.w(TAG, str, exc);
            return;
        }
        Log.w(TAG, str + " — daemon indisponível (" + exc.getClass().getSimpleName() + ")");
    }

    private final void loopEvt() {
        Socket socket;
        AtomicBoolean atomicBoolean;
        String line;
        List listM5511F;
        int cursorX;
        int cursorY;
        String str;
        Integer numM3069z0;
        String str2;
        Integer numM3069z1;
        String str3;
        Integer numM3069z2;
        Integer numM3069z3;
        Integer numM3069z4;
        Integer numM3069z5;
        BufferedReader bufferedReader = evtReader;
        if (bufferedReader == null) {
            return;
        }
        while (true) {
            try {
                try {
                    try {
                        atomicBoolean = evtRodando;
                        if (atomicBoolean.get() && (line = bufferedReader.readLine()) != null) {
                            String string = zv1.m7383W0(line).toString();
                            Pattern patternCompile = Pattern.compile("\\s+");
                            patternCompile.getClass();
                            string.getClass();
                            Matcher matcher = patternCompile.matcher(string);
                            if (matcher.find()) {
                                ArrayList arrayList = new ArrayList(10);
                                int iEnd = 0;
                                do {
                                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                                    iEnd = matcher.end();
                                } while (matcher.find());
                                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                                listM5511F = arrayList;
                            } else {
                                listM5511F = AbstractC1337qm.m5511F(string.toString());
                            }
                            if (!listM5511F.isEmpty()) {
                                String upperCase = ((String) listM5511F.get(0)).toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                int i = 3;
                                int i2 = 1;
                                switch (upperCase.hashCode()) {
                                    case -448001921:
                                        if (upperCase.equals("GET_CURSOR")) {
                                            ICursorPositionProvider iCursorPositionProvider = cursorProvider;
                                            if (iCursorPositionProvider != null) {
                                                try {
                                                    cursorX = iCursorPositionProvider.getCursorX();
                                                } catch (Exception unused) {
                                                    cursorX = 0;
                                                }
                                            } else {
                                                cursorX = 0;
                                            }
                                            if (iCursorPositionProvider != null) {
                                                try {
                                                    cursorY = iCursorPositionProvider.getCursorY();
                                                } catch (Exception unused2) {
                                                    cursorY = 0;
                                                }
                                            } else {
                                                cursorY = 0;
                                            }
                                            synchronized (evtWriteLock) {
                                                try {
                                                    try {
                                                        OutputStreamWriter outputStreamWriter = evtWriter;
                                                        if (outputStreamWriter != null) {
                                                            outputStreamWriter.write("CURSOR " + cursorX + " " + cursorY + "\n");
                                                            outputStreamWriter.flush();
                                                            break;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                } catch (Exception e) {
                                                    Log.w(TAG, "CURSOR reply", e);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    case 64805:
                                        if (upperCase.equals(InjectionProtocol.AIM)) {
                                            mainHandler.post(new RunnableC1177oc(hp0.m3214e(AbstractC1377rp.m5871r0(1, listM5511F), "1"), i, aimListener));
                                        }
                                        break;
                                    case 66108:
                                        if (upperCase.equals("BTN") && (str = (String) AbstractC1377rp.m5871r0(1, listM5511F)) != null && (numM3069z0 = gw1.m3069z0(str)) != null) {
                                            final int iIntValue = numM3069z0.intValue();
                                            final boolean zM3214e = hp0.m3214e(AbstractC1377rp.m5871r0(2, listM5511F), "1");
                                            mainHandler.post(new Runnable() { // from class: t92
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    WifiDaemonClient.loopEvt$lambda$11(iIntValue, zM3214e);
                                                }
                                            });
                                        }
                                        break;
                                    case 66482:
                                        if (upperCase.equals("CAP") && (str2 = (String) AbstractC1377rp.m5871r0(1, listM5511F)) != null && (numM3069z1 = gw1.m3069z0(str2)) != null) {
                                            final int iIntValue2 = numM3069z1.intValue();
                                            final boolean zM3214e2 = hp0.m3214e(AbstractC1377rp.m5871r0(2, listM5511F), "1");
                                            final boolean zM3214e3 = hp0.m3214e(AbstractC1377rp.m5871r0(3, listM5511F), "1");
                                            mainHandler.post(new Runnable() { // from class: u92
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    WifiDaemonClient.loopEvt$lambda$12(iIntValue2, zM3214e2, zM3214e3);
                                                }
                                            });
                                        }
                                        break;
                                    case 79412:
                                        if (upperCase.equals("POS") && (str3 = (String) AbstractC1377rp.m5871r0(1, listM5511F)) != null && (numM3069z2 = gw1.m3069z0(str3)) != null) {
                                            int iIntValue3 = numM3069z2.intValue();
                                            String str4 = (String) AbstractC1377rp.m5871r0(2, listM5511F);
                                            if (str4 != null && (numM3069z3 = gw1.m3069z0(str4)) != null) {
                                                int iIntValue4 = numM3069z3.intValue();
                                                ch0 ch0Var = onPosAbsoluta;
                                                if (ch0Var != null) {
                                                    mainHandler.post(new is1(iIntValue3, iIntValue4, i2, ch0Var));
                                                }
                                            }
                                        }
                                        break;
                                    case 2461688:
                                        upperCase.equals("PONG");
                                        break;
                                    case 64930712:
                                        if (upperCase.equals("DELTA")) {
                                            String str5 = (String) AbstractC1377rp.m5871r0(1, listM5511F);
                                            int iIntValue5 = (str5 == null || (numM3069z5 = gw1.m3069z0(str5)) == null) ? 0 : numM3069z5.intValue();
                                            String str6 = (String) AbstractC1377rp.m5871r0(2, listM5511F);
                                            int iIntValue6 = (str6 == null || (numM3069z4 = gw1.m3069z0(str6)) == null) ? 0 : numM3069z4.intValue();
                                            try {
                                                IVirtualCursorListener iVirtualCursorListener = cursorListener;
                                                if (iVirtualCursorListener != null) {
                                                    iVirtualCursorListener.onMouseDelta(iIntValue5, iIntValue6);
                                                }
                                            } catch (Exception e2) {
                                                Log.w(TAG, "delta", e2);
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        AtomicBoolean atomicBoolean2 = evtRodando;
                        if (atomicBoolean2.get()) {
                            Log.w(TAG, "EVT loop", e3);
                        }
                        atomicBoolean2.set(false);
                        try {
                            OutputStreamWriter outputStreamWriter2 = evtWriter;
                            if (outputStreamWriter2 != null) {
                                outputStreamWriter2.close();
                            }
                        } catch (Throwable unused3) {
                        }
                        try {
                            BufferedReader bufferedReader2 = evtReader;
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                        } catch (Throwable unused4) {
                        }
                        socket = evtSocket;
                        if (socket != null) {
                        }
                    }
                } catch (Throwable th2) {
                    evtRodando.set(false);
                    try {
                        OutputStreamWriter outputStreamWriter3 = evtWriter;
                        if (outputStreamWriter3 != null) {
                            outputStreamWriter3.close();
                        }
                    } catch (Throwable unused5) {
                    }
                    try {
                        BufferedReader bufferedReader3 = evtReader;
                        if (bufferedReader3 != null) {
                            bufferedReader3.close();
                        }
                    } catch (Throwable unused6) {
                    }
                    try {
                        Socket socket2 = evtSocket;
                        if (socket2 != null) {
                            socket2.close();
                        }
                    } catch (Throwable unused7) {
                    }
                    evtWriter = null;
                    evtReader = null;
                    evtSocket = null;
                    evtThread = null;
                    throw th2;
                }
            } catch (Throwable unused8) {
            }
        }
        atomicBoolean.set(false);
        try {
            OutputStreamWriter outputStreamWriter4 = evtWriter;
            if (outputStreamWriter4 != null) {
                outputStreamWriter4.close();
            }
        } catch (Throwable unused9) {
        }
        try {
            BufferedReader bufferedReader4 = evtReader;
            if (bufferedReader4 != null) {
                bufferedReader4.close();
            }
        } catch (Throwable unused10) {
        }
        socket = evtSocket;
        if (socket != null) {
            socket.close();
        }
        evtWriter = null;
        evtReader = null;
        evtSocket = null;
        evtThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopEvt$lambda$10(ch0 ch0Var, int i, int i2) {
        try {
            ch0Var.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            Log.w(TAG, "pos abs", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopEvt$lambda$11(int i, boolean z) {
        try {
            IVirtualCursorListener iVirtualCursorListener = cursorListener;
            if (iVirtualCursorListener != null) {
                iVirtualCursorListener.onMouseButton(i, z);
            }
        } catch (Exception e) {
            Log.w(TAG, "btn", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopEvt$lambda$12(int i, boolean z, boolean z2) {
        try {
            IVirtualCursorListener iVirtualCursorListener = cursorListener;
            if (iVirtualCursorListener != null) {
                iVirtualCursorListener.onPhysicalCapture(i, z, z2);
            }
        } catch (Exception e) {
            Log.w(TAG, "cap", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopEvt$lambda$9(IAimStateListener iAimStateListener, boolean z) {
        if (iAimStateListener != null) {
            try {
                iAimStateListener.onAimStateChanged(z);
            } catch (Exception e) {
                Log.w(TAG, "aim listener", e);
            }
        }
    }

    private final boolean naMain() {
        return hp0.m3214e(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registrarListeners$lambda$4() {
        try {
            INSTANCE.garantirEvt();
        } catch (Exception e) {
            Log.w(TAG, "Falha ao abrir EVT", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 religarEventos$lambda$6() {
        if (aimListener != null || cursorListener != null || cursorProvider != null) {
            INSTANCE.forcarReabrirEvt();
        }
        return z32.f13265a;
    }

    private final String unescape(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\' && (i = i2 + 1) < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '\\') {
                    sb.append('\\');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                }
                i2 += 2;
            }
            sb.append(cCharAt);
            i2++;
        }
        return sb.toString();
    }

    public final Object consultar(String str, String str2, InterfaceC0579du interfaceC0579du) {
        return emIo(new dc0(1, str, str2), interfaceC0579du);
    }

    public final Object enviar(String str, InterfaceC0579du interfaceC0579du) {
        return emIo(new C1452tq(str, 3), interfaceC0579du);
    }

    public final Object fechar(InterfaceC0579du interfaceC0579du) {
        limparListeners();
        Object objEmIo = emIo(new C1348qx(16), interfaceC0579du);
        return objEmIo == EnumC1530vu.f11768a ? objEmIo : z32.f13265a;
    }

    public final ch0 getOnPosAbsoluta() {
        return onPosAbsoluta;
    }

    public final void limparListeners() {
        aimListener = null;
        cursorListener = null;
        cursorProvider = null;
        onPosAbsoluta = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object obterDebugExteriorFps(InterfaceC0579du interfaceC0579du) {
        C02211 c02211;
        if (interfaceC0579du instanceof C02211) {
            c02211 = (C02211) interfaceC0579du;
            int i = c02211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02211.label = i - Integer.MIN_VALUE;
            } else {
                c02211 = new C02211(interfaceC0579du);
            }
        } else {
            c02211 = new C02211(interfaceC0579du);
        }
        Object objConsultar = c02211.result;
        int i2 = c02211.label;
        if (i2 == 0) {
            ua0.m6440Z(objConsultar);
            c02211.label = 1;
            objConsultar = consultar("QRY", "FPS_DEBUG", c02211);
            Object obj = EnumC1530vu.f11768a;
            if (objConsultar == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objConsultar);
        }
        String str = (String) objConsultar;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object obterPipelineMetrics(InterfaceC0579du interfaceC0579du) {
        C02221 c02221;
        if (interfaceC0579du instanceof C02221) {
            c02221 = (C02221) interfaceC0579du;
            int i = c02221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02221.label = i - Integer.MIN_VALUE;
            } else {
                c02221 = new C02221(interfaceC0579du);
            }
        } else {
            c02221 = new C02221(interfaceC0579du);
        }
        Object objConsultar = c02221.result;
        int i2 = c02221.label;
        if (i2 == 0) {
            ua0.m6440Z(objConsultar);
            c02221.label = 1;
            objConsultar = consultar("QRY", "PIPELINE", c02221);
            Object obj = EnumC1530vu.f11768a;
            if (objConsultar == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objConsultar);
        }
        String str = (String) objConsultar;
        if (str != null && !zv1.m7371K0(str)) {
            try {
                List listM7378R0 = zv1.m7378R0(str, new char[]{','});
                ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM7378R0));
                Iterator it = listM7378R0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(Long.parseLong(zv1.m7383W0((String) it.next()).toString())));
                }
                return AbstractC1377rp.m5866A0(arrayList);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Object ping(InterfaceC0579du interfaceC0579du) {
        return enviar(InjectionProtocol.PING, interfaceC0579du);
    }

    public final void registrarListeners(IAimStateListener iAimStateListener, IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
        aimListener = iAimStateListener;
        cursorListener = iVirtualCursorListener;
        cursorProvider = iCursorPositionProvider;
        if (iAimStateListener == null && iVirtualCursorListener == null && iCursorPositionProvider == null) {
            return;
        }
        new Thread(new RunnableC1059l5(12), "wifi-evt-open").start();
    }

    public final Object religarEventos(InterfaceC0579du interfaceC0579du) {
        Object objEmIo = emIo(new C1348qx(15), interfaceC0579du);
        return objEmIo == EnumC1530vu.f11768a ? objEmIo : z32.f13265a;
    }

    public final void setOnPosAbsoluta(ch0 ch0Var) {
        onPosAbsoluta = ch0Var;
    }

    public final Object shellComSaida(String str, InterfaceC0579du interfaceC0579du) {
        return consultar("SHELL_OUT", str, interfaceC0579du);
    }

    public final String shellComSaidaOffMain(String str) {
        str.getClass();
        if (!naMain()) {
            return consultarSync("SHELL_OUT", str);
        }
        f40.m2719o("WifiDaemonClient.shellComSaidaOffMain na main");
        return null;
    }
}
