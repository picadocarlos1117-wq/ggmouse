package com.example.ssmousepro.injection;

import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC1308pu;
import p000.AbstractC1377rp;
import p000.AbstractC1451tp;
import p000.AbstractC1571wy;
import p000.C0575dq;
import p000.C1348qx;
import p000.RunnableC1430t4;
import p000.bo0;
import p000.ch0;
import p000.co0;
import p000.fh0;
import p000.hp0;
import p000.hw1;
import p000.jd0;
import p000.ki0;
import p000.mg0;
import p000.p32;
import p000.qn0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InputDeviceReader implements PhysicalInputSource {
    private static final int BTN_BACK = 278;
    private static final int BTN_EXTRA = 276;
    private static final int BTN_FORWARD = 277;
    private static final int BTN_LEFT = 272;
    private static final int BTN_MIDDLE = 274;
    private static final int BTN_MISC = 256;
    private static final int BTN_RIGHT = 273;
    private static final int BTN_SIDE = 275;
    private static final int CREATE = 256;
    private static final int DELETE = 512;
    private static final int EVIOCGRAB = 1074021776;
    private static final int EV_ABS = 3;
    private static final int EV_KEY = 1;
    private static final int EV_REL = 2;
    private static final int EV_SYN = 0;
    private static final boolean GRAB_MOUSE_HABILITADO = true;
    private static final int HOTPLUG_MASK = 768;
    private static final String INPUT_DIR = "/dev/input";
    private static final int INPUT_EVENT_SIZE = 24;
    private static final int MAX_EVENTOS_POR_DRAIN = 32;
    private static final int MOVED_FROM = 64;
    private static final int POLL_TIMEOUT_MS = 50;
    private static final int REL_X = 0;
    private static final int REL_Y = 1;
    private static final int SYN_REPORT = 0;
    private static final String TAG = "InputDeviceReader";
    private static final long WAKE_TOKEN = -1;
    private final List<DispositivoEntrada> dispositivos;
    private FileDescriptor epollFd;
    private volatile boolean executando;
    private volatile String fonteMovimentoMouse;
    private volatile boolean grabMouseDesejado;
    private FileObserver hotplugObserver;
    private final Set<String> nodosDuplicadosLogados;
    private final fh0 onKeyEvent;
    private final ch0 onMouseMove;
    private final mg0 onSyncReport;
    private volatile boolean reconstruirWait;
    private int relAccX;
    private int relAccY;
    private volatile boolean soltarGrabMousePendente;
    private Thread thread;
    private long ultimoMovimentoFonteMs;
    private boolean usarEpoll;
    private EpollHelper.WakeFd wake;
    public static final Companion Companion = new Companion(null);
    private static final Set<String> mousesConhecidosGlobal = new LinkedHashSet();
    private static final Set<String> tecladosConhecidosGlobal = new LinkedHashSet();
    private static final Set<String> avisouFalhaGrab = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class DispositivoEntrada {
        private boolean ehMouse;
        private boolean ehTeclado;

        /* JADX INFO: renamed from: fd */
        private FileDescriptor f1908fd;
        private boolean grabbed;
        private final String nome;
        private boolean temAbs;

        public DispositivoEntrada(FileDescriptor fileDescriptor, String str) {
            fileDescriptor.getClass();
            str.getClass();
            this.f1908fd = fileDescriptor;
            this.nome = str;
        }

        public final boolean getEhMouse() {
            return this.ehMouse;
        }

        public final boolean getEhTeclado() {
            return this.ehTeclado;
        }

        public final FileDescriptor getFd() {
            return this.f1908fd;
        }

        public final boolean getGrabbed() {
            return this.grabbed;
        }

        public final String getNome() {
            return this.nome;
        }

        public final boolean getTemAbs() {
            return this.temAbs;
        }

        public final void setEhMouse(boolean z) {
            this.ehMouse = z;
        }

        public final void setEhTeclado(boolean z) {
            this.ehTeclado = z;
        }

        public final void setFd(FileDescriptor fileDescriptor) {
            fileDescriptor.getClass();
            this.f1908fd = fileDescriptor;
        }

        public final void setGrabbed(boolean z) {
            this.grabbed = z;
        }

        public final void setTemAbs(boolean z) {
            this.temAbs = z;
        }
    }

    public InputDeviceReader(fh0 fh0Var, ch0 ch0Var, mg0 mg0Var) {
        fh0Var.getClass();
        ch0Var.getClass();
        mg0Var.getClass();
        this.onKeyEvent = fh0Var;
        this.onMouseMove = ch0Var;
        this.onSyncReport = mg0Var;
        this.dispositivos = new ArrayList();
        this.nodosDuplicadosLogados = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 _init_$lambda$0(int i, int i2) {
        return z32.f13265a;
    }

    private final List<DispositivoEntrada> abrirDispositivos() {
        List<DispositivoEntrada> listM5879z0;
        File[] fileArrListFiles = new File("/dev/input").listFiles(new qn0(1));
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        synchronized (this.dispositivos) {
            try {
                for (File file : fileArrListFiles) {
                    List<DispositivoEntrada> list = this.dispositivos;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (hp0.m3214e(((DispositivoEntrada) it.next()).getNome(), file.getName())) {
                                }
                            }
                        }
                    }
                    String name = file.getName();
                    name.getClass();
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    DispositivoEntrada dispositivoEntradaAbrirNo = abrirNo(name, absolutePath);
                    if (dispositivoEntradaAbrirNo != null) {
                        this.dispositivos.add(dispositivoEntradaAbrirNo);
                    }
                }
                listM5879z0 = AbstractC1377rp.m5879z0(this.dispositivos);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listM5879z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean abrirDispositivos$lambda$25(File file) {
        String name = file.getName();
        name.getClass();
        return hw1.m3309D0(name, "event", false);
    }

    private final DispositivoEntrada abrirNo(String str, String str2) {
        try {
            FileDescriptor fileDescriptorOpen = Os.open(str2, OsConstants.O_RDONLY | OsConstants.O_NONBLOCK, 0);
            fileDescriptorOpen.getClass();
            return new DispositivoEntrada(fileDescriptorOpen, str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private final void acordarLoop() {
        EpollHelper.WakeFd wakeFd = this.wake;
        if (wakeFd == null) {
            return;
        }
        try {
            if (!wakeFd.getEventfd()) {
                Os.write(wakeFd.getWriteFd(), new byte[]{1}, 0, 1);
                return;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
            byteBufferOrder.putLong(1L);
            Os.write(wakeFd.getWriteFd(), byteBufferOrder.array(), 0, 8);
        } catch (Exception unused) {
        }
    }

    private final void aplicarGrabMouseImediato() {
        synchronized (this.dispositivos) {
            try {
                for (DispositivoEntrada dispositivoEntrada : this.dispositivos) {
                    if (!dispositivoEntrada.getGrabbed() && !dispositivoEntrada.getTemAbs() && !dispositivoEntrada.getEhTeclado() && !tecladosConhecidosGlobal.contains(dispositivoEntrada.getNome()) && (dispositivoEntrada.getEhMouse() || mousesConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                        grabbear(dispositivoEntrada, "mouse");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final StructPollfd[] construirPollfds(List<DispositivoEntrada> list) {
        EpollHelper.WakeFd wakeFd = this.wake;
        if (wakeFd == null) {
            return new StructPollfd[0];
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        StructPollfd structPollfd = new StructPollfd();
        structPollfd.fd = wakeFd.getReadFd();
        structPollfd.events = (short) OsConstants.POLLIN;
        arrayList.add(structPollfd);
        for (DispositivoEntrada dispositivoEntrada : list) {
            StructPollfd structPollfd2 = new StructPollfd();
            structPollfd2.fd = dispositivoEntrada.getFd();
            structPollfd2.events = (short) OsConstants.POLLIN;
            arrayList.add(structPollfd2);
        }
        return (StructPollfd[]) arrayList.toArray(new StructPollfd[0]);
    }

    private final void drenarEventos(DispositivoEntrada dispositivoEntrada, byte[] bArr, ByteBuffer byteBuffer) {
        int i = 0;
        while (this.executando && i < 32) {
            try {
                if (Os.read(dispositivoEntrada.getFd(), bArr, 0, 24) < 24) {
                    return;
                }
                i++;
                int i2 = byteBuffer.getShort(16) & 65535;
                int i3 = 65535 & byteBuffer.getShort(18);
                int i4 = byteBuffer.getInt(20);
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            tecladosConhecidosGlobal.remove(dispositivoEntrada.getNome());
                            marcarComoMouse(dispositivoEntrada);
                            if (fonteMovimentoAceita(dispositivoEntrada.getNome())) {
                                if (i3 == 0) {
                                    this.relAccX += i4;
                                } else if (i3 == 1) {
                                    this.relAccY += i4;
                                }
                            }
                        } else if (i2 == 3) {
                            dispositivoEntrada.setTemAbs(true);
                        }
                    } else if (272 > i3 || i3 >= 279) {
                        if (!dispositivoEntrada.getTemAbs() && 1 <= i3 && i3 < 256) {
                            dispositivoEntrada.setEhTeclado(true);
                            tecladosConhecidosGlobal.add(dispositivoEntrada.getNome());
                            this.onKeyEvent.invoke(Integer.valueOf(i3), Integer.valueOf(i4), Boolean.FALSE, Boolean.TRUE);
                        }
                    } else if (i3 > BTN_MIDDLE || dispositivoEntrada.getEhMouse() || (!dispositivoEntrada.getEhTeclado() && !tecladosConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                        marcarComoMouse(dispositivoEntrada);
                        this.onKeyEvent.invoke(Integer.valueOf(i3), Integer.valueOf(i4), Boolean.TRUE, Boolean.FALSE);
                    }
                } else if (i3 == 0) {
                    int i5 = this.relAccX;
                    if (i5 != 0 || this.relAccY != 0) {
                        this.onMouseMove.invoke(Integer.valueOf(i5), Integer.valueOf(this.relAccY));
                        this.relAccX = 0;
                        this.relAccY = 0;
                    }
                    this.onSyncReport.invoke();
                }
            } catch (ErrnoException e) {
                int i6 = e.errno;
                if (i6 == OsConstants.EAGAIN) {
                    return;
                }
                removerDispositivo(dispositivoEntrada, jd0.m3609g(i6, "read errno="));
                return;
            } catch (Exception e2) {
                removerDispositivo(dispositivoEntrada, AbstractC1308pu.m5339f("read: ", e2.getMessage()));
                return;
            }
        }
    }

    private final void drenarOrdenados(final List<DispositivoEntrada> list, List<Integer> list2, byte[] bArr, ByteBuffer byteBuffer) {
        List listM5867B0;
        List<Integer> list3 = list2;
        Comparator comparator = new Comparator() { // from class: com.example.ssmousepro.injection.InputDeviceReader$drenarOrdenados$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i;
                int iIntValue = ((Number) t).intValue();
                int i2 = 0;
                if (((InputDeviceReader.DispositivoEntrada) list.get(iIntValue)).getEhTeclado() || InputDeviceReader.tecladosConhecidosGlobal.contains(((InputDeviceReader.DispositivoEntrada) list.get(iIntValue)).getNome())) {
                    i = 0;
                } else {
                    i = (((InputDeviceReader.DispositivoEntrada) list.get(iIntValue)).getEhMouse() || InputDeviceReader.mousesConhecidosGlobal.contains(((InputDeviceReader.DispositivoEntrada) list.get(iIntValue)).getNome())) ? 2 : 1;
                }
                Integer numValueOf = Integer.valueOf(i);
                int iIntValue2 = ((Number) t2).intValue();
                if (!((InputDeviceReader.DispositivoEntrada) list.get(iIntValue2)).getEhTeclado() && !InputDeviceReader.tecladosConhecidosGlobal.contains(((InputDeviceReader.DispositivoEntrada) list.get(iIntValue2)).getNome())) {
                    i2 = (((InputDeviceReader.DispositivoEntrada) list.get(iIntValue2)).getEhMouse() || InputDeviceReader.mousesConhecidosGlobal.contains(((InputDeviceReader.DispositivoEntrada) list.get(iIntValue2)).getNome())) ? 2 : 1;
                }
                return ki0.m3868n(numValueOf, Integer.valueOf(i2));
            }
        };
        list3.getClass();
        if (list3 instanceof Collection) {
            List<Integer> list4 = list3;
            if (list4.size() <= 1) {
                listM5867B0 = AbstractC1377rp.m5879z0(list3);
            } else {
                Object[] array = list4.toArray(new Object[0]);
                array.getClass();
                if (array.length > 1) {
                    Arrays.sort(array, comparator);
                }
                listM5867B0 = Arrays.asList(array);
                listM5867B0.getClass();
            }
        } else {
            listM5867B0 = AbstractC1377rp.m5867B0(list3);
            if (((ArrayList) listM5867B0).size() > 1) {
                Collections.sort(listM5867B0, comparator);
            }
        }
        Iterator it = listM5867B0.iterator();
        while (it.hasNext()) {
            drenarEventos(list.get(((Number) it.next()).intValue()), bArr, byteBuffer);
        }
    }

    private final void drenarWake() {
        FileDescriptor readFd;
        EpollHelper.WakeFd wakeFd = this.wake;
        if (wakeFd == null || (readFd = wakeFd.getReadFd()) == null) {
            return;
        }
        do {
            try {
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EAGAIN) {
                    e.getMessage();
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } while (Os.read(readFd, new byte[64], 0, 64) > 0);
    }

    private final boolean escanearNovosDispositivos() {
        boolean z;
        int i = 0;
        File[] fileArrListFiles = new File("/dev/input").listFiles(new qn0(i));
        if (fileArrListFiles == null) {
            return false;
        }
        synchronized (this.dispositivos) {
            try {
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                for (File file : fileArrListFiles) {
                    arrayList.add(file.getName());
                }
                Set setM5869D0 = AbstractC1377rp.m5869D0(arrayList);
                List<DispositivoEntrada> list = this.dispositivos;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!setM5869D0.contains(((DispositivoEntrada) obj).getNome())) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                z = false;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    DispositivoEntrada dispositivoEntrada = (DispositivoEntrada) obj2;
                    try {
                        Os.close(dispositivoEntrada.getFd());
                    } catch (Exception unused) {
                    }
                    this.dispositivos.remove(dispositivoEntrada);
                    if (hp0.m3214e(this.fonteMovimentoMouse, dispositivoEntrada.getNome())) {
                        this.fonteMovimentoMouse = null;
                    }
                    limparCacheClassificacao(dispositivoEntrada.getNome());
                    dispositivoEntrada.getNome();
                    z = true;
                }
                List<DispositivoEntrada> list2 = this.dispositivos;
                ArrayList arrayList3 = new ArrayList(AbstractC1451tp.m6307o0(list2));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((DispositivoEntrada) it.next()).getNome());
                }
                Set setM5869D1 = AbstractC1377rp.m5869D0(arrayList3);
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file2 = fileArrListFiles[i];
                    if (!setM5869D1.contains(file2.getName())) {
                        String name = file2.getName();
                        name.getClass();
                        limparCacheClassificacao(name);
                        String name2 = file2.getName();
                        name2.getClass();
                        String absolutePath = file2.getAbsolutePath();
                        absolutePath.getClass();
                        DispositivoEntrada dispositivoEntradaAbrirNo = abrirNo(name2, absolutePath);
                        if (dispositivoEntradaAbrirNo != null) {
                            this.dispositivos.add(dispositivoEntradaAbrirNo);
                            file2.getName();
                            z = true;
                        }
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.fonteMovimentoMouse = null;
            this.nodosDuplicadosLogados.clear();
            if (this.grabMouseDesejado) {
                aplicarGrabMouseImediato();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean escanearNovosDispositivos$lambda$29(File file) {
        String name = file.getName();
        name.getClass();
        return hw1.m3309D0(name, "event", false);
    }

    private final void fecharEpollFd() {
        FileDescriptor fileDescriptor = this.epollFd;
        this.epollFd = null;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (Exception unused) {
            }
        }
    }

    private final void fecharInfraWait() {
        fecharEpollFd();
        EpollHelper.WakeFd wakeFd = this.wake;
        if (wakeFd != null) {
            wakeFd.close();
        }
        this.wake = null;
    }

    private final boolean fonteMovimentoAceita(String str) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str2 = this.fonteMovimentoMouse;
        if (str2 == null) {
            this.fonteMovimentoMouse = str;
            this.ultimoMovimentoFonteMs = jUptimeMillis;
            return true;
        }
        if (hp0.m3214e(str, str2)) {
            this.ultimoMovimentoFonteMs = jUptimeMillis;
            return true;
        }
        if (jUptimeMillis - this.ultimoMovimentoFonteMs > 150) {
            this.fonteMovimentoMouse = str;
            this.ultimoMovimentoFonteMs = jUptimeMillis;
            this.nodosDuplicadosLogados.clear();
            return true;
        }
        if (!this.nodosDuplicadosLogados.add(str)) {
            return false;
        }
        Log.w(TAG, jd0.m3617o("Nó de mouse DUPLICADO ignorado (", str, ", fonte=", str2, ") — evita sensi dobrada"));
        return false;
    }

    private final boolean grabbear(DispositivoEntrada dispositivoEntrada, String str) {
        if (dispositivoEntrada.getGrabbed()) {
            return true;
        }
        if (!dispositivoEntrada.getEhTeclado() && !tecladosConhecidosGlobal.contains(dispositivoEntrada.getNome())) {
            IoctlHelper ioctlHelper = IoctlHelper.INSTANCE;
            if (!ioctlHelper.getSuportado()) {
                return false;
            }
            try {
                ioctlHelper.ioctl(dispositivoEntrada.getFd(), EVIOCGRAB, 1);
                dispositivoEntrada.setGrabbed(true);
                dispositivoEntrada.getNome();
                return true;
            } catch (Exception e) {
                if (avisouFalhaGrab.add(dispositivoEntrada.getNome())) {
                    Log.w(TAG, "Falha ao grabbear " + dispositivoEntrada.getNome() + ": " + e.getMessage());
                }
            }
        }
        return false;
    }

    private final void iniciarHotplugObserver() {
        pararHotplugObserver();
        try {
            FileObserver fileObserver = new FileObserver() { // from class: com.example.ssmousepro.injection.InputDeviceReader.iniciarHotplugObserver.1
                {
                    super("/dev/input", InputDeviceReader.HOTPLUG_MASK);
                }

                @Override // android.os.FileObserver
                public void onEvent(int i, String str) {
                    Object next;
                    if (InputDeviceReader.this.executando && str != null && hw1.m3309D0(str, "event", false)) {
                        if (i != 64) {
                            if (i == 256) {
                                InputDeviceReader.this.pedirReconstruir();
                                return;
                            } else if (i != 512) {
                                return;
                            }
                        }
                        List list = InputDeviceReader.this.dispositivos;
                        InputDeviceReader inputDeviceReader = InputDeviceReader.this;
                        synchronized (list) {
                            try {
                                Iterator it = inputDeviceReader.dispositivos.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!hp0.m3214e(((DispositivoEntrada) next).getNome(), str));
                                DispositivoEntrada dispositivoEntrada = (DispositivoEntrada) next;
                                if (dispositivoEntrada != null) {
                                    try {
                                        Os.close(dispositivoEntrada.getFd());
                                    } catch (Exception unused) {
                                    }
                                    inputDeviceReader.dispositivos.remove(dispositivoEntrada);
                                    if (hp0.m3214e(inputDeviceReader.fonteMovimentoMouse, str)) {
                                        inputDeviceReader.fonteMovimentoMouse = null;
                                    }
                                    inputDeviceReader.limparCacheClassificacao(str);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        InputDeviceReader.this.pedirReconstruir();
                    }
                }
            };
            fileObserver.startWatching();
            this.hotplugObserver = fileObserver;
        } catch (Exception e) {
            Log.w(TAG, "FileObserver indisponível — fallback scan", e);
            this.hotplugObserver = null;
        }
    }

    private final void liberarTodosGrabs() {
        synchronized (this.dispositivos) {
            for (DispositivoEntrada dispositivoEntrada : this.dispositivos) {
                if (dispositivoEntrada.getGrabbed()) {
                    reabrirDispositivo(dispositivoEntrada);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void limparCacheClassificacao(String str) {
        mousesConhecidosGlobal.remove(str);
        tecladosConhecidosGlobal.remove(str);
        avisouFalhaGrab.remove(str);
    }

    private final void limparClassificacaoIncorreta() {
        mousesConhecidosGlobal.removeAll(tecladosConhecidosGlobal);
    }

    private final void loop() {
        try {
            loopInterno();
        } finally {
            fecharInfraWait();
        }
    }

    private final void loopInterno() {
        List<DispositivoEntrada> listM5879z0;
        List<DispositivoEntrada> listM5879z1;
        EpollHelper epollHelper = EpollHelper.INSTANCE;
        EpollHelper.WakeFd wakeFdCriarWake = epollHelper.criarWake();
        this.wake = wakeFdCriarWake;
        if (wakeFdCriarWake == null) {
            Log.e(TAG, "Falha ao criar wake fd — abortando reader");
            return;
        }
        this.usarEpoll = false;
        epollHelper.getSuportado();
        abrirDispositivos();
        synchronized (this.dispositivos) {
            listM5879z0 = AbstractC1377rp.m5879z0(this.dispositivos);
        }
        if (!montarWaitSet(listM5879z0)) {
            Log.e(TAG, "Falha ao montar wait set — abortando reader");
            return;
        }
        String str = this.usarEpoll ? "epoll" : "poll+wake";
        if (listM5879z0.isEmpty()) {
            Log.w(TAG, "Nenhum /dev/input/event* no início — aguardando hotplug (" + str + ")");
        } else {
            listM5879z0.size();
        }
        if (this.grabMouseDesejado) {
            aplicarGrabMouseImediato();
        }
        soltarGrabTecladoPreso();
        byte[] bArr = new byte[24];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        StructPollfd[] structPollfdArrConstruirPollfds = new StructPollfd[0];
        while (this.executando) {
            if (this.soltarGrabMousePendente) {
                this.soltarGrabMousePendente = false;
                soltarGrabMousePorReabertura();
            }
            try {
                if (this.reconstruirWait) {
                    this.reconstruirWait = false;
                    synchronized (this.dispositivos) {
                        listM5879z1 = AbstractC1377rp.m5879z0(this.dispositivos);
                    }
                    if (montarWaitSet(listM5879z1)) {
                        if (!this.usarEpoll) {
                            structPollfdArrConstruirPollfds = construirPollfds(listM5879z1);
                        }
                        listM5879z0 = listM5879z1;
                    } else {
                        try {
                            Thread.sleep(50L);
                        } catch (InterruptedException unused) {
                        }
                        this.reconstruirWait = true;
                    }
                    listM5879z0 = listM5879z1;
                } else if (!this.usarEpoll && structPollfdArrConstruirPollfds.length == 0) {
                    structPollfdArrConstruirPollfds = construirPollfds(listM5879z0);
                }
                if (this.usarEpoll) {
                    byteBufferOrder.getClass();
                    processarEpoll(listM5879z0, bArr, byteBufferOrder);
                } else {
                    byteBufferOrder.getClass();
                    processarPoll(listM5879z0, structPollfdArrConstruirPollfds, bArr, byteBufferOrder);
                    if (this.reconstruirWait) {
                        synchronized (this.dispositivos) {
                            try {
                                listM5879z0 = AbstractC1377rp.m5879z0(this.dispositivos);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        structPollfdArrConstruirPollfds = construirPollfds(listM5879z0);
                        this.reconstruirWait = false;
                    } else {
                        continue;
                    }
                }
            } catch (ErrnoException e) {
                if (e.errno == OsConstants.EINTR) {
                    continue;
                } else {
                    if (!this.executando) {
                        return;
                    }
                    Log.w(TAG, "Erro no wait — reconstruindo fds (GG: loop nunca morre)", e);
                    reconstruirAposErroPoll();
                    synchronized (this.dispositivos) {
                        listM5879z1 = AbstractC1377rp.m5879z0(this.dispositivos);
                        List<DispositivoEntrada> list = listM5879z1;
                        montarWaitSet(list);
                        if (!this.usarEpoll) {
                            structPollfdArrConstruirPollfds = construirPollfds(list);
                        }
                        listM5879z0 = listM5879z1;
                    }
                }
            } catch (Exception e2) {
                if (!this.executando) {
                    return;
                }
                Log.w(TAG, "Erro inesperado — reconstruindo fds", e2);
                reconstruirAposErroPoll();
                synchronized (this.dispositivos) {
                    listM5879z1 = AbstractC1377rp.m5879z0(this.dispositivos);
                    List<DispositivoEntrada> list2 = listM5879z1;
                    montarWaitSet(list2);
                    if (!this.usarEpoll) {
                        structPollfdArrConstruirPollfds = construirPollfds(list2);
                    }
                    listM5879z0 = listM5879z1;
                }
            }
        }
    }

    private final void marcarComoMouse(DispositivoEntrada dispositivoEntrada) {
        boolean ehMouse = dispositivoEntrada.getEhMouse();
        dispositivoEntrada.setEhMouse(true);
        mousesConhecidosGlobal.add(dispositivoEntrada.getNome());
        if (this.grabMouseDesejado) {
            if (!dispositivoEntrada.getGrabbed()) {
                grabbear(dispositivoEntrada, "mouse");
            }
            if (ehMouse) {
                return;
            }
            tentarGrabIrmaosMouse(dispositivoEntrada);
        }
    }

    private final boolean montarWaitSet(List<DispositivoEntrada> list) {
        fecharEpollFd();
        EpollHelper.WakeFd wakeFd = this.wake;
        if (wakeFd == null) {
            return false;
        }
        if (!this.usarEpoll) {
            return true;
        }
        EpollHelper epollHelper = EpollHelper.INSTANCE;
        FileDescriptor fileDescriptorCreate = epollHelper.create();
        if (fileDescriptorCreate == null) {
            Log.w(TAG, "epollCreate falhou — caindo para poll+wake");
            this.usarEpoll = false;
            return true;
        }
        if (!epollHelper.ctlAdd(fileDescriptorCreate, wakeFd.getReadFd(), 1, -1L)) {
            try {
                Os.close(fileDescriptorCreate);
            } catch (Exception unused) {
            }
            this.usarEpoll = false;
            return true;
        }
        int i = 0;
        for (DispositivoEntrada dispositivoEntrada : list) {
            int i2 = i + 1;
            FileDescriptor fileDescriptor = fileDescriptorCreate;
            fileDescriptorCreate = fileDescriptor;
            if (!EpollHelper.INSTANCE.ctlAdd(fileDescriptor, dispositivoEntrada.getFd(), 1, i)) {
                Log.w(TAG, "epoll ADD " + dispositivoEntrada.getNome() + " falhou — poll+wake");
                try {
                    Os.close(fileDescriptorCreate);
                } catch (Exception unused2) {
                }
                this.usarEpoll = false;
                return true;
            }
            i = i2;
        }
        this.epollFd = fileDescriptorCreate;
        return true;
    }

    private final void pararHotplugObserver() {
        try {
            FileObserver fileObserver = this.hotplugObserver;
            if (fileObserver != null) {
                fileObserver.stopWatching();
            }
        } catch (Exception unused) {
        }
        this.hotplugObserver = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pedirReconstruir() {
        this.reconstruirWait = true;
        acordarLoop();
    }

    private final void processarEpoll(List<DispositivoEntrada> list, byte[] bArr, ByteBuffer byteBuffer) {
        FileDescriptor fileDescriptor = this.epollFd;
        if (fileDescriptor == null) {
            pedirReconstruir();
            return;
        }
        List<EpollHelper.EpollReady> listWait = EpollHelper.INSTANCE.wait(fileDescriptor, list.size() + 4, 50);
        if (listWait.isEmpty()) {
            if (escanearNovosDispositivos()) {
                pedirReconstruir();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(listWait.size());
        boolean z = false;
        for (EpollHelper.EpollReady epollReady : listWait) {
            if (epollReady.getData() == -1) {
                drenarWake();
            } else {
                int data = (int) epollReady.getData();
                if (data >= 0 && data < list.size()) {
                    if ((epollReady.getEvents() & 24) != 0) {
                        if (recuperarFdInvalido(list.get(data))) {
                            z = true;
                        }
                    } else if ((epollReady.getEvents() & 1) != 0) {
                        arrayList.add(Integer.valueOf(data));
                    }
                }
            }
        }
        if (z) {
            pedirReconstruir();
        } else {
            drenarOrdenados(list, arrayList, bArr, byteBuffer);
        }
    }

    private final void processarPoll(List<DispositivoEntrada> list, StructPollfd[] structPollfdArr, byte[] bArr, ByteBuffer byteBuffer) throws InterruptedException {
        if (structPollfdArr.length == 0) {
            if (escanearNovosDispositivos()) {
                pedirReconstruir();
            }
            Thread.sleep(50L);
            return;
        }
        if (Os.poll(structPollfdArr, 50) <= 0) {
            if (escanearNovosDispositivos()) {
                pedirReconstruir();
                return;
            }
            return;
        }
        int i = 0;
        if ((structPollfdArr[0].revents & OsConstants.POLLIN) != 0) {
            drenarWake();
        }
        if (removerDispositivosComPollInvalido(structPollfdArr, list)) {
            pedirReconstruir();
            return;
        }
        co0 co0VarM5178l0 = p32.m5178l0(1, structPollfdArr.length);
        ArrayList arrayList = new ArrayList();
        Iterator it = co0VarM5178l0.iterator();
        while (true) {
            bo0 bo0Var = (bo0) it;
            if (!bo0Var.f1456c) {
                break;
            }
            Object next = bo0Var.next();
            if ((structPollfdArr[((Number) next).intValue()].revents & OsConstants.POLLIN) != 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1451tp.m6307o0(arrayList));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(Integer.valueOf(((Number) obj).intValue() - 1));
        }
        drenarOrdenados(list, arrayList2, bArr, byteBuffer);
    }

    private final boolean reabrirDispositivo(DispositivoEntrada dispositivoEntrada) {
        if (dispositivoEntrada.getGrabbed()) {
            try {
                IoctlHelper.INSTANCE.ioctl(dispositivoEntrada.getFd(), EVIOCGRAB, 0);
            } catch (Exception unused) {
            }
        }
        try {
            Os.close(dispositivoEntrada.getFd());
        } catch (Exception unused2) {
        }
        try {
            FileDescriptor fileDescriptorOpen = Os.open("/dev/input/" + dispositivoEntrada.getNome(), OsConstants.O_RDONLY | OsConstants.O_NONBLOCK, 0);
            fileDescriptorOpen.getClass();
            dispositivoEntrada.setFd(fileDescriptorOpen);
            dispositivoEntrada.setGrabbed(false);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "Falha ao reabrir " + dispositivoEntrada.getNome() + ": " + e.getMessage());
            return false;
        }
    }

    private final void reconstruirAposErroPoll() {
        synchronized (this.dispositivos) {
            Iterator<DispositivoEntrada> it = this.dispositivos.iterator();
            while (it.hasNext()) {
                try {
                    Os.close(it.next().getFd());
                } catch (Exception unused) {
                }
            }
            this.dispositivos.clear();
            this.fonteMovimentoMouse = null;
        }
        try {
            Thread.sleep(80L);
        } catch (InterruptedException unused2) {
        }
        abrirDispositivos();
        if (this.grabMouseDesejado) {
            aplicarGrabMouseImediato();
        }
        soltarGrabTecladoPreso();
        escanearNovosDispositivos();
    }

    private final boolean recuperarFdInvalido(DispositivoEntrada dispositivoEntrada) {
        synchronized (this.dispositivos) {
            try {
                if (reabrirDispositivo(dispositivoEntrada)) {
                    dispositivoEntrada.getNome();
                    if (this.grabMouseDesejado && (dispositivoEntrada.getEhMouse() || mousesConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                        grabbear(dispositivoEntrada, "mouse-recover");
                    }
                    return true;
                }
                try {
                    Os.close(dispositivoEntrada.getFd());
                } catch (Exception unused) {
                }
                this.dispositivos.remove(dispositivoEntrada);
                if (hp0.m3214e(this.fonteMovimentoMouse, dispositivoEntrada.getNome())) {
                    this.fonteMovimentoMouse = null;
                }
                limparCacheClassificacao(dispositivoEntrada.getNome());
                dispositivoEntrada.getNome();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void removerDispositivo(DispositivoEntrada dispositivoEntrada, String str) {
        synchronized (this.dispositivos) {
            if (this.dispositivos.remove(dispositivoEntrada)) {
                try {
                    Os.close(dispositivoEntrada.getFd());
                } catch (Exception unused) {
                }
                if (hp0.m3214e(this.fonteMovimentoMouse, dispositivoEntrada.getNome())) {
                    this.fonteMovimentoMouse = null;
                }
                limparCacheClassificacao(dispositivoEntrada.getNome());
                Log.w(TAG, "Dispositivo " + dispositivoEntrada.getNome() + " removido (" + str + ")");
                pedirReconstruir();
            }
        }
    }

    private final boolean removerDispositivosComPollInvalido(StructPollfd[] structPollfdArr, List<DispositivoEntrada> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int length = structPollfdArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if ((structPollfdArr[i2].revents & (OsConstants.POLLERR | OsConstants.POLLHUP | OsConstants.POLLNVAL)) != 0 && (i = i2 - 1) >= 0 && i < list.size()) {
                arrayList.add(list.get(i));
            }
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        synchronized (this.dispositivos) {
            try {
                Iterator it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    DispositivoEntrada dispositivoEntrada = (DispositivoEntrada) it.next();
                    if (reabrirDispositivo(dispositivoEntrada)) {
                        dispositivoEntrada.getNome();
                        if (this.grabMouseDesejado && (dispositivoEntrada.getEhMouse() || mousesConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                            grabbear(dispositivoEntrada, "mouse-recover");
                        }
                    } else {
                        try {
                            Os.close(dispositivoEntrada.getFd());
                        } catch (Exception unused) {
                        }
                        this.dispositivos.remove(dispositivoEntrada);
                        if (hp0.m3214e(this.fonteMovimentoMouse, dispositivoEntrada.getNome())) {
                            this.fonteMovimentoMouse = null;
                        }
                        limparCacheClassificacao(dispositivoEntrada.getNome());
                        dispositivoEntrada.getNome();
                    }
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private final void soltarGrabMousePorReabertura() {
        boolean z;
        synchronized (this.dispositivos) {
            try {
                z = false;
                for (DispositivoEntrada dispositivoEntrada : this.dispositivos) {
                    if (dispositivoEntrada.getGrabbed() && (dispositivoEntrada.getEhMouse() || mousesConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                        if (reabrirDispositivo(dispositivoEntrada)) {
                            dispositivoEntrada.getNome();
                            z = true;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            pedirReconstruir();
        }
    }

    private final void soltarGrabTecladoPreso() {
        boolean z;
        synchronized (this.dispositivos) {
            try {
                z = false;
                for (DispositivoEntrada dispositivoEntrada : this.dispositivos) {
                    if (dispositivoEntrada.getGrabbed() && (dispositivoEntrada.getEhTeclado() || tecladosConhecidosGlobal.contains(dispositivoEntrada.getNome()))) {
                        if (!dispositivoEntrada.getEhMouse() && !mousesConhecidosGlobal.contains(dispositivoEntrada.getNome()) && reabrirDispositivo(dispositivoEntrada)) {
                            dispositivoEntrada.getNome();
                            z = true;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            pedirReconstruir();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$3(InputDeviceReader inputDeviceReader) {
        try {
            Process.setThreadPriority(-20);
        } catch (Exception unused) {
            try {
                Process.setThreadPriority(-8);
            } catch (Exception unused2) {
            }
        }
        inputDeviceReader.loop();
    }

    private final void tentarGrabIrmaosMouse(DispositivoEntrada dispositivoEntrada) {
        synchronized (this.dispositivos) {
            try {
                for (DispositivoEntrada dispositivoEntrada2 : this.dispositivos) {
                    if (dispositivoEntrada2 != dispositivoEntrada && !dispositivoEntrada2.getGrabbed() && !dispositivoEntrada2.getTemAbs() && (!dispositivoEntrada2.getEhTeclado() || dispositivoEntrada2.getEhMouse())) {
                        if (!tecladosConhecidosGlobal.contains(dispositivoEntrada2.getNome()) || dispositivoEntrada2.getEhMouse()) {
                            if (dispositivoEntrada2.getEhMouse() && !dispositivoEntrada2.getGrabbed()) {
                                grabbear(dispositivoEntrada2, "mouse-irmao");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void definirGrabMouse(boolean z) {
        this.grabMouseDesejado = z;
        if (z) {
            aplicarGrabMouseImediato();
        } else {
            this.soltarGrabMousePendente = false;
            soltarGrabMousePorReabertura();
        }
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void definirGrabTeclado(boolean z) {
        soltarGrabTecladoPreso();
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public boolean escanearDispositivosHotplug() {
        return escanearNovosDispositivos();
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public boolean isRunning() {
        Thread thread;
        return this.executando && (thread = this.thread) != null && thread.isAlive();
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void start() {
        Thread thread;
        if (this.executando && (thread = this.thread) != null && thread.isAlive()) {
            return;
        }
        Thread thread2 = this.thread;
        if (thread2 != null && thread2.isAlive()) {
            stop();
        }
        this.executando = true;
        this.fonteMovimentoMouse = null;
        this.ultimoMovimentoFonteMs = 0L;
        this.nodosDuplicadosLogados.clear();
        iniciarHotplugObserver();
        Thread thread3 = new Thread(new RunnableC1430t4(this, 19), TAG);
        thread3.setPriority(10);
        thread3.start();
        this.thread = thread3;
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void stop() {
        this.executando = false;
        pararHotplugObserver();
        this.grabMouseDesejado = false;
        this.soltarGrabMousePendente = true;
        acordarLoop();
        try {
            Thread thread = this.thread;
            if (thread != null) {
                thread.join(1500L);
            }
        } catch (InterruptedException unused) {
        }
        this.thread = null;
        liberarTodosGrabs();
        limparClassificacaoIncorreta();
        fecharInfraWait();
        synchronized (this.dispositivos) {
            Iterator<DispositivoEntrada> it = this.dispositivos.iterator();
            while (it.hasNext()) {
                try {
                    Os.close(it.next().getFd());
                } catch (Exception unused2) {
                }
            }
            this.dispositivos.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InputDeviceReader(fh0 fh0Var, ch0 ch0Var, mg0 mg0Var, int i, AbstractC1571wy abstractC1571wy) {
        this(fh0Var, (i & 2) != 0 ? new C0575dq(6) : ch0Var, (i & 4) != 0 ? new C1348qx(3) : mg0Var);
    }
}
