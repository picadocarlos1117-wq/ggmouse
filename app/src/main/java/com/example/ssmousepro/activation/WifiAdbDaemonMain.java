package com.example.ssmousepro.activation;

import android.content.res.Resources;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.example.ssmousepro.IVirtualCursorListener;
import com.example.ssmousepro.injection.DaemonSolo;
import com.example.ssmousepro.injection.FpsDesacelSincronizador;
import com.example.ssmousepro.injection.FpsLowSpeedGainConfig;
import com.example.ssmousepro.injection.InjectionProtocol;
import com.example.ssmousepro.injection.InputInjectionEngine;
import com.example.ssmousepro.injection.PrivilegedTouchInjector;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0609en;
import p000.AbstractC1064la;
import p000.AbstractC1308pu;
import p000.AbstractC1377rp;
import p000.C1284p6;
import p000.RunnableC1059l5;
import p000.bc1;
import p000.hw1;
import p000.jd0;
import p000.p32;
import p000.rc2;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class WifiAdbDaemonMain {
    private static final String BIND_HOST = "127.0.0.1";
    public static final int PORT_CMD = 37561;
    public static final int PORT_EVT = 37562;
    public static final int PROTO_REV = 6;
    private static final String TAG = "WifiAdbDaemon";
    public static final WifiAdbDaemonMain INSTANCE = new WifiAdbDaemonMain();
    private static final CopyOnWriteArrayList<OutputStreamWriter> evtWriters = new CopyOnWriteArrayList<>();
    private static final ArrayBlockingQueue<String> evtFila = new ArrayBlockingQueue<>(128);
    private static final AtomicInteger pendDx = new AtomicInteger(0);
    private static final AtomicInteger pendDy = new AtomicInteger(0);
    private static final AtomicInteger pendPosX = new AtomicInteger(0);
    private static final AtomicInteger pendPosY = new AtomicInteger(0);
    private static final AtomicBoolean pendPos = new AtomicBoolean(false);
    private static final Object deltaWake = new Object();

    private WifiAdbDaemonMain() {
    }

    private final void atenderComandos(Socket socket) {
        try {
            try {
                InputStream inputStream = socket.getInputStream();
                Charset charset = StandardCharsets.UTF_8;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), charset);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String string = zv1.m7383W0(line).toString();
                    if (string.length() != 0) {
                        String str = "OK\n";
                        if (string.equalsIgnoreCase("DAEMON_EXIT")) {
                            outputStreamWriter.write("OK\n");
                            outputStreamWriter.flush();
                            try {
                                InputInjectionEngine.INSTANCE.shutdown();
                            } catch (Throwable unused) {
                            }
                            new Thread(new RunnableC1059l5(11)).start();
                            break;
                        }
                        Locale locale = Locale.ROOT;
                        String upperCase = string.toUpperCase(locale);
                        upperCase.getClass();
                        boolean zProcessarComando = false;
                        if (hw1.m3309D0(upperCase, "QRY ", false)) {
                            String strProcessarConsulta = processarConsulta(zv1.m7383W0(string.substring(4)).toString());
                            if (strProcessarConsulta == null) {
                                outputStreamWriter.write("ERR\n");
                            } else {
                                outputStreamWriter.write("OK " + hw1.m3308C0(hw1.m3308C0(strProcessarConsulta, "\\", "\\\\"), "\n", "\\n") + "\n");
                            }
                            outputStreamWriter.flush();
                        } else {
                            String upperCase2 = string.toUpperCase(locale);
                            upperCase2.getClass();
                            if (hw1.m3309D0(upperCase2, "SHELL_OUT ", false)) {
                                String strExecutarShellComSaida = executarShellComSaida(zv1.m7383W0(string.substring(10)).toString());
                                if (strExecutarShellComSaida == null) {
                                    outputStreamWriter.write("ERR\n");
                                } else {
                                    outputStreamWriter.write("OK " + hw1.m3308C0(hw1.m3308C0(strExecutarShellComSaida, "\\", "\\\\"), "\n", "\\n") + "\n");
                                }
                                outputStreamWriter.flush();
                            } else {
                                try {
                                    zProcessarComando = InputInjectionEngine.INSTANCE.processarComando(string);
                                } catch (Exception e) {
                                    Log.w(TAG, "Erro cmd=" + string, e);
                                }
                                if (!zProcessarComando) {
                                    str = "ERR\n";
                                }
                                outputStreamWriter.write(str);
                                outputStreamWriter.flush();
                            }
                        }
                    }
                }
            } finally {
                try {
                    socket.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (Exception e2) {
            Log.w(TAG, "Cliente CMD saiu", e2);
            break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void atenderComandos$lambda$23() {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException unused) {
        }
        System.exit(0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void atenderEvt(Socket socket) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        Throwable th;
        Exception e;
        try {
            socket.setTcpNoDelay(true);
        } catch (Throwable unused) {
        }
        try {
            OutputStream outputStream = socket.getOutputStream();
            Charset charset = StandardCharsets.UTF_8;
            outputStreamWriter = new OutputStreamWriter(outputStream, charset);
            try {
                try {
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
                            evtWriters.add(outputStreamWriter);
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else if (hw1.m3307B0(zv1.m7383W0(line).toString(), InjectionProtocol.PING)) {
                                    outputStreamWriter.write("PONG\n");
                                    outputStreamWriter.flush();
                                }
                            }
                            evtWriters.remove(outputStreamWriter);
                        } catch (Throwable th2) {
                            th = th2;
                            if (outputStreamWriter != null) {
                                evtWriters.remove(outputStreamWriter);
                            }
                            if (outputStreamWriter != null) {
                                try {
                                    outputStreamWriter.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            try {
                                socket.close();
                                throw th;
                            } catch (Throwable unused3) {
                                throw th;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Log.w(TAG, "Cliente EVT saiu", e);
                        if (outputStreamWriter != null) {
                            evtWriters.remove(outputStreamWriter);
                        }
                        if (outputStreamWriter != null) {
                        }
                        socket.close();
                    }
                    outputStreamWriter.close();
                } catch (Throwable unused4) {
                }
                socket.close();
            } catch (Throwable unused5) {
            }
        } catch (Exception e3) {
            outputStreamWriter = null;
            e = e3;
        } catch (Throwable th3) {
            outputStreamWriter = null;
            th = th3;
            if (outputStreamWriter != null) {
                evtWriters.remove(outputStreamWriter);
            }
            if (outputStreamWriter != null) {
                outputStreamWriter.close();
            }
            socket.close();
            throw th;
        }
    }

    private final void bootstrapFramework() {
        try {
            Looper.prepareMainLooper();
        } catch (Throwable unused) {
        }
        try {
            Class.forName("android.app.ActivityThread").getDeclaredMethod("systemMain", null).invoke(null, null);
        } catch (Throwable th) {
            Log.w(TAG, "ActivityThread.systemMain indisponível", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enfileirarEvt(String str) {
        ArrayBlockingQueue<String> arrayBlockingQueue = evtFila;
        if (!arrayBlockingQueue.offer(str)) {
            arrayBlockingQueue.poll();
            arrayBlockingQueue.offer(str);
        }
        Object obj = deltaWake;
        synchronized (obj) {
            obj.getClass();
            obj.notify();
        }
    }

    private final void escreverEvt(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<OutputStreamWriter> it = evtWriters.iterator();
        it.getClass();
        while (it.hasNext()) {
            OutputStreamWriter next = it.next();
            try {
                next.write(str);
                next.write(10);
                next.flush();
            } catch (Exception unused) {
                next.getClass();
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        evtWriters.removeAll(AbstractC1377rp.m5869D0(arrayList));
    }

    private final String executarShellComSaida(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
            InputStream inputStream = processExec.getInputStream();
            inputStream.getClass();
            Charset charset = AbstractC0609en.f3387a;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
            try {
                String strM5163c0 = p32.m5163c0(bufferedReader);
                bufferedReader.close();
                InputStream errorStream = processExec.getErrorStream();
                errorStream.getClass();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(errorStream, charset), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                try {
                    String strM5163c1 = p32.m5163c0(bufferedReader2);
                    bufferedReader2.close();
                    int iWaitFor = processExec.waitFor();
                    if (iWaitFor == 0) {
                        String strConcat = strM5163c0.concat(strM5163c1);
                        return zv1.m7371K0(strConcat) ? "" : strConcat;
                    }
                    Log.w(TAG, "SHELL_OUT code=" + iWaitFor + " cmd='" + str + "' " + zv1.m7383W0(strM5163c0.concat(strM5163c1)).toString());
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rc2.m5797n(bufferedReader2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rc2.m5797n(bufferedReader, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "SHELL_OUT falhou: " + str, e);
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void loopComandos() {
        /*
            r5 = this;
            java.lang.String r5 = "ok "
            java.lang.String r0 = "127.0.0.1"
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)
            java.net.ServerSocket r1 = new java.net.ServerSocket
            r2 = 37561(0x92b9, float:5.2634E-41)
            r3 = 8
            r1.<init>(r2, r3, r0)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "/data/local/tmp/sspro_wifi.ready"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L46
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L46
            r4.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = " port=37561\n"
            r4.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L46
            java.nio.charset.Charset r2 = p000.AbstractC0609en.f3387a     // Catch: java.lang.Throwable -> L46
            r2.getClass()     // Catch: java.lang.Throwable -> L46
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L46
            p000.p32.m5182n0(r3, r5, r2)     // Catch: java.lang.Throwable -> L3f
            r3.close()     // Catch: java.lang.Throwable -> L46
            goto L46
        L3f:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            p000.rc2.m5797n(r3, r5)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            java.net.Socket r5 = r1.accept()     // Catch: java.lang.Throwable -> L5f
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L5f
            s92 r2 = new s92     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "sspro-wifi-cmd"
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            r0.setDaemon(r5)     // Catch: java.lang.Throwable -> L5f
            r0.start()     // Catch: java.lang.Throwable -> L5f
            goto L46
        L5f:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            p000.rc2.m5797n(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.WifiAdbDaemonMain.loopComandos():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopComandos$lambda$21$lambda$19(Socket socket) {
        WifiAdbDaemonMain wifiAdbDaemonMain = INSTANCE;
        socket.getClass();
        wifiAdbDaemonMain.atenderComandos(socket);
    }

    private final void loopEscritaEvt() {
        while (true) {
            try {
                int andSet = pendDx.getAndSet(0);
                int andSet2 = pendDy.getAndSet(0);
                boolean andSet3 = pendPos.getAndSet(false);
                int i = pendPosX.get();
                int i2 = pendPosY.get();
                if (andSet3) {
                    escreverEvt("POS " + i + " " + i2);
                } else if (andSet != 0 || andSet2 != 0) {
                    escreverEvt("DELTA " + andSet + " " + andSet2);
                }
                for (String strPoll = evtFila.poll(); strPoll != null; strPoll = evtFila.poll()) {
                    escreverEvt(strPoll);
                }
                if (!andSet3 && andSet == 0 && andSet2 == 0) {
                    Object obj = deltaWake;
                    synchronized (obj) {
                        try {
                            if (pendDx.get() == 0 && pendDy.get() == 0 && !pendPos.get() && evtFila.isEmpty()) {
                                obj.getClass();
                                obj.wait(8L);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e) {
                Log.w(TAG, "evt writer", e);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0029 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void loopEventos() {
        /*
            r4 = this;
            java.lang.String r4 = "127.0.0.1"
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r1 = 37562(0x92ba, float:5.2636E-41)
            r2 = 8
            r0.<init>(r1, r2, r4)
        L10:
            java.net.Socket r4 = r0.accept()     // Catch: java.lang.Throwable -> L29
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L29
            s92 r2 = new s92     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "sspro-wifi-evt-client"
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L29
            r4 = 1
            r1.setDaemon(r4)     // Catch: java.lang.Throwable -> L29
            r1.start()     // Catch: java.lang.Throwable -> L29
            goto L10
        L29:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L2b
        L2b:
            r1 = move-exception
            p000.rc2.m5797n(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.activation.WifiAdbDaemonMain.loopEventos():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loopEventos$lambda$13$lambda$11(Socket socket) throws Throwable {
        WifiAdbDaemonMain wifiAdbDaemonMain = INSTANCE;
        socket.getClass();
        wifiAdbDaemonMain.atenderEvt(socket);
    }

    public static final void main(String[] strArr) {
        strArr.getClass();
        Arrays.toString(strArr).getClass();
        try {
            INSTANCE.bootstrapFramework();
            DaemonSolo.INSTANCE.garantirInstanciaUnica();
            try {
                Process.setThreadPriority(-20);
            } catch (Throwable unused) {
            }
            PrivilegedTouchInjector.INSTANCE.setForcarWaitEmTodoInject(true);
            FpsDesacelSincronizador fpsDesacelSincronizador = FpsDesacelSincronizador.INSTANCE;
            fpsDesacelSincronizador.aplicarValoresDoCodigo();
            InputInjectionEngine inputInjectionEngine = InputInjectionEngine.INSTANCE;
            inputInjectionEngine.initialize();
            inputInjectionEngine.processarComando(InjectionProtocol.INPUT_STOP);
            try {
                Iterator<T> it = fpsDesacelSincronizador.comandosSincronizar(Resources.getSystem()).iterator();
                while (it.hasNext()) {
                    InputInjectionEngine.INSTANCE.processarComando((String) it.next());
                }
                InputInjectionEngine.INSTANCE.processarComando(FpsLowSpeedGainConfig.INSTANCE.comandoSincronizar());
            } catch (Throwable unused2) {
            }
            InputInjectionEngine inputInjectionEngine2 = InputInjectionEngine.INSTANCE;
            inputInjectionEngine2.setAimStateListener(new C1284p6(12));
            inputInjectionEngine2.setHandModeCallbacks(new IVirtualCursorListener.Stub() { // from class: com.example.ssmousepro.activation.WifiAdbDaemonMain.main.4
                @Override // com.example.ssmousepro.IVirtualCursorListener
                public void onMouseButton(int i, boolean z) {
                    WifiAdbDaemonMain.INSTANCE.enfileirarEvt("BTN " + i + " " + (z ? 1 : 0));
                }

                @Override // com.example.ssmousepro.IVirtualCursorListener
                public void onMouseDelta(int i, int i2) {
                    if (i == 0 && i2 == 0) {
                        return;
                    }
                    WifiAdbDaemonMain.pendDx.addAndGet(i);
                    WifiAdbDaemonMain.pendDy.addAndGet(i2);
                    bc1 bc1VarSnapshotMaoCursor = InputInjectionEngine.INSTANCE.snapshotMaoCursor();
                    int iIntValue = ((Number) bc1VarSnapshotMaoCursor.f1292a).intValue();
                    int iIntValue2 = ((Number) bc1VarSnapshotMaoCursor.f1293b).intValue();
                    WifiAdbDaemonMain.pendPosX.set(iIntValue);
                    WifiAdbDaemonMain.pendPosY.set(iIntValue2);
                    WifiAdbDaemonMain.pendPos.set(true);
                    synchronized (WifiAdbDaemonMain.deltaWake) {
                        Object obj = WifiAdbDaemonMain.deltaWake;
                        obj.getClass();
                        obj.notify();
                    }
                }

                @Override // com.example.ssmousepro.IVirtualCursorListener
                public void onPhysicalCapture(int i, boolean z, boolean z2) {
                    WifiAdbDaemonMain wifiAdbDaemonMain = WifiAdbDaemonMain.INSTANCE;
                    StringBuilder sbM5345l = AbstractC1308pu.m5345l("CAP ", i, " ", z ? 1 : 0, " ");
                    sbM5345l.append(z2 ? 1 : 0);
                    wifiAdbDaemonMain.enfileirarEvt(sbM5345l.toString());
                }
            }, null);
            Thread thread = new Thread(new RunnableC1059l5(9), "sspro-wifi-evt");
            thread.setDaemon(true);
            thread.start();
            Thread thread2 = new Thread(new RunnableC1059l5(10), "sspro-wifi-evt-w");
            thread2.setDaemon(true);
            thread2.start();
            INSTANCE.loopComandos();
        } catch (Throwable th) {
            Log.e(TAG, "Daemon Wi‑Fi fatal", th);
            try {
                File file = new File("/data/local/tmp/sspro_wifi.log");
                String name = th.getClass().getName();
                String message = th.getMessage();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                String str = "\nFATAL: " + name + ": " + message + "\n" + string + "\n";
                Charset charset = AbstractC0609en.f3387a;
                charset.getClass();
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    p32.m5182n0(fileOutputStream, str, charset);
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rc2.m5797n(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable unused3) {
            }
            try {
                InputInjectionEngine.INSTANCE.shutdown();
            } catch (Throwable unused4) {
            }
            System.exit(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 main$lambda$2(boolean z) {
        INSTANCE.enfileirarEvt(jd0.m3609g(z ? 1 : 0, "AIM "));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void main$lambda$3() {
        INSTANCE.loopEventos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void main$lambda$5() {
        INSTANCE.loopEscritaEvt();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String processarConsulta(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -1839152142:
                if (!upperCase.equals("STATUS")) {
                    return null;
                }
                InputInjectionEngine inputInjectionEngine = InputInjectionEngine.INSTANCE;
                long[] jArrSnapshotPipelineMetrics = inputInjectionEngine.snapshotPipelineMetrics();
                return "disp=" + PrivilegedTouchInjector.INSTANCE.displayIdAtual() + " fallback=" + inputInjectionEngine.isUsandoFallbackShell() + " injectOk=" + AbstractC1064la.m4156q0(jArrSnapshotPipelineMetrics, 10) + " injectFail=" + AbstractC1064la.m4156q0(jArrSnapshotPipelineMetrics, 11) + " moveOk=" + AbstractC1064la.m4156q0(jArrSnapshotPipelineMetrics, 14) + " aim=" + AbstractC1064la.m4156q0(jArrSnapshotPipelineMetrics, 24);
            case -843802819:
                if (upperCase.equals("FPS_DEBUG")) {
                    return InputInjectionEngine.INSTANCE.snapshotExteriorDebug();
                }
                return null;
            case 84867:
                if (upperCase.equals("VER")) {
                    return "6";
                }
                return null;
            case 410557090:
                if (upperCase.equals("PIPELINE")) {
                    return AbstractC1064la.m4157r0(InputInjectionEngine.INSTANCE.snapshotPipelineMetrics(), 62);
                }
                return null;
            default:
                return null;
        }
    }
}
