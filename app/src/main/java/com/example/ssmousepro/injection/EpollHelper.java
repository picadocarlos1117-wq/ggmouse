package com.example.ssmousepro.injection;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000.n60;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EpollHelper {
    public static final int EPOLLERR = 8;
    public static final int EPOLLHUP = 16;
    public static final int EPOLLIN = 1;
    public static final int EPOLL_CTL_ADD = 1;
    public static final int EPOLL_CTL_DEL = 2;
    public static final EpollHelper INSTANCE;
    private static final String TAG = "EpollHelper";
    private static Constructor<?> ctorEvent;
    private static boolean epollWaitTemMaxEvents;
    private static Field fData;
    private static Field fEvents;
    private static Method mEpollCreate1;
    private static Method mEpollCtl;
    private static Method mEpollWait;
    private static final boolean suportado;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EpollReady {
        private final long data;
        private final int events;

        public EpollReady(int i, long j) {
            this.events = i;
            this.data = j;
        }

        public static /* synthetic */ EpollReady copy$default(EpollReady epollReady, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = epollReady.events;
            }
            if ((i2 & 2) != 0) {
                j = epollReady.data;
            }
            return epollReady.copy(i, j);
        }

        public final int component1() {
            return this.events;
        }

        public final long component2() {
            return this.data;
        }

        public final EpollReady copy(int i, long j) {
            return new EpollReady(i, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EpollReady)) {
                return false;
            }
            EpollReady epollReady = (EpollReady) obj;
            return this.events == epollReady.events && this.data == epollReady.data;
        }

        public final long getData() {
            return this.data;
        }

        public final int getEvents() {
            return this.events;
        }

        public int hashCode() {
            return Long.hashCode(this.data) + (Integer.hashCode(this.events) * 31);
        }

        public String toString() {
            return "EpollReady(events=" + this.events + ", data=" + this.data + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class WakeFd {
        private final boolean eventfd;
        private final FileDescriptor readFd;
        private final FileDescriptor writeFd;

        public WakeFd(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, boolean z) {
            fileDescriptor.getClass();
            fileDescriptor2.getClass();
            this.readFd = fileDescriptor;
            this.writeFd = fileDescriptor2;
            this.eventfd = z;
        }

        public final void close() {
            FileDescriptor fileDescriptor;
            try {
                Os.close(this.readFd);
            } catch (Exception unused) {
            }
            if (this.eventfd || (fileDescriptor = this.writeFd) == this.readFd) {
                return;
            }
            try {
                Os.close(fileDescriptor);
            } catch (Exception unused2) {
            }
        }

        public final boolean getEventfd() {
            return this.eventfd;
        }

        public final FileDescriptor getReadFd() {
            return this.readFd;
        }

        public final FileDescriptor getWriteFd() {
            return this.writeFd;
        }
    }

    static {
        Method method;
        Class cls = Integer.TYPE;
        INSTANCE = new EpollHelper();
        boolean z = true;
        epollWaitTemMaxEvents = true;
        try {
            Class<?> cls2 = Class.forName("android.system.StructEpollEvent");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            ctorEvent = declaredConstructor;
            fEvents = cls2.getField("events");
            fData = cls2.getField("data");
            mEpollCreate1 = Os.class.getMethod("epollCreate1", cls);
            mEpollCtl = Os.class.getMethod("epollCtl", FileDescriptor.class, cls, FileDescriptor.class, cls2);
            try {
                method = Os.class.getMethod("epollWait", FileDescriptor.class, Array.newInstance(cls2, 0).getClass(), cls, cls);
                epollWaitTemMaxEvents = true;
            } catch (NoSuchMethodException unused) {
                method = Os.class.getMethod("epollWait", FileDescriptor.class, Array.newInstance(cls2, 0).getClass(), cls);
                epollWaitTemMaxEvents = false;
            }
            mEpollWait = method;
        } catch (Exception e) {
            Log.w(TAG, "epoll indisponível no stub/runtime — fallback poll", e);
            z = false;
        }
        suportado = z;
    }

    private EpollHelper() {
    }

    private final Object newEvent(int i, long j) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<?> constructor = ctorEvent;
        constructor.getClass();
        Object objNewInstance = constructor.newInstance(null);
        Field field = fEvents;
        field.getClass();
        field.setInt(objNewInstance, i);
        Field field2 = fData;
        field2.getClass();
        field2.setLong(objNewInstance, j);
        objNewInstance.getClass();
        return objNewInstance;
    }

    private final void tornarNonBlock(FileDescriptor fileDescriptor) {
        try {
            int i = OsConstants.F_GETFL;
            int iFcntlInt = Os.fcntlInt(fileDescriptor, OsConstants.F_GETFL, 0);
            int i2 = OsConstants.F_SETFL;
            Os.fcntlInt(fileDescriptor, OsConstants.F_SETFL, iFcntlInt | OsConstants.O_NONBLOCK);
        } catch (Exception unused) {
        }
    }

    public final FileDescriptor create() {
        if (!suportado) {
            return null;
        }
        try {
            Method method = mEpollCreate1;
            method.getClass();
            Object objInvoke = method.invoke(null, 0);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e) {
            Log.w(TAG, "epollCreate1 falhou", e);
            return null;
        }
    }

    public final WakeFd criarWake() {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Class cls = Integer.TYPE;
                Method method = Os.class.getMethod("eventfd", cls, cls);
                try {
                    i = OsConstants.class.getField("EFD_NONBLOCK").getInt(null);
                } catch (Exception unused) {
                    i = 2048;
                }
                Object objInvoke = method.invoke(null, 0, Integer.valueOf(i));
                objInvoke.getClass();
                FileDescriptor fileDescriptor = (FileDescriptor) objInvoke;
                tornarNonBlock(fileDescriptor);
                return new WakeFd(fileDescriptor, fileDescriptor, true);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        try {
            FileDescriptor[] fileDescriptorArrPipe = Os.pipe();
            FileDescriptor fileDescriptor2 = fileDescriptorArrPipe[0];
            fileDescriptor2.getClass();
            tornarNonBlock(fileDescriptor2);
            FileDescriptor fileDescriptor3 = fileDescriptorArrPipe[1];
            fileDescriptor3.getClass();
            tornarNonBlock(fileDescriptor3);
            FileDescriptor fileDescriptor4 = fileDescriptorArrPipe[0];
            fileDescriptor4.getClass();
            FileDescriptor fileDescriptor5 = fileDescriptorArrPipe[1];
            fileDescriptor5.getClass();
            return new WakeFd(fileDescriptor4, fileDescriptor5, false);
        } catch (Exception e2) {
            Log.e(TAG, "pipe wake falhou", e2);
            return null;
        }
    }

    public final boolean ctlAdd(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, long j) {
        fileDescriptor.getClass();
        fileDescriptor2.getClass();
        if (!suportado) {
            return false;
        }
        try {
            Object objNewEvent = newEvent(i, j);
            Method method = mEpollCtl;
            method.getClass();
            method.invoke(null, fileDescriptor, 1, fileDescriptor2, objNewEvent);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "epollCtl ADD falhou", e);
            return false;
        }
    }

    public final boolean getSuportado() {
        return suportado;
    }

    public final List<EpollReady> wait(FileDescriptor fileDescriptor, int i, int i2) {
        int iIntValue;
        fileDescriptor.getClass();
        boolean z = suportado;
        n60 n60Var = n60.f7259a;
        if (!z) {
            return n60Var;
        }
        try {
            Constructor<?> constructor = ctorEvent;
            constructor.getClass();
            Object objNewInstance = Array.newInstance(constructor.getDeclaringClass(), i);
            for (int i3 = 0; i3 < i; i3++) {
                Constructor<?> constructor2 = ctorEvent;
                constructor2.getClass();
                Array.set(objNewInstance, i3, constructor2.newInstance(null));
            }
            if (epollWaitTemMaxEvents) {
                Method method = mEpollWait;
                method.getClass();
                Object objInvoke = method.invoke(null, fileDescriptor, objNewInstance, Integer.valueOf(i), Integer.valueOf(i2));
                objInvoke.getClass();
                iIntValue = ((Integer) objInvoke).intValue();
            } else {
                Method method2 = mEpollWait;
                method2.getClass();
                Object objInvoke2 = method2.invoke(null, fileDescriptor, objNewInstance, Integer.valueOf(i2));
                objInvoke2.getClass();
                iIntValue = ((Integer) objInvoke2).intValue();
            }
            if (iIntValue <= 0) {
                return n60Var;
            }
            ArrayList arrayList = new ArrayList(iIntValue);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                Object obj = Array.get(objNewInstance, i4);
                Field field = fEvents;
                field.getClass();
                int i5 = field.getInt(obj);
                Field field2 = fData;
                field2.getClass();
                arrayList.add(new EpollReady(i5, field2.getLong(obj)));
            }
            return arrayList;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof ErrnoException) || (cause instanceof Exception)) {
                throw cause;
            }
            throw e;
        }
    }
}
