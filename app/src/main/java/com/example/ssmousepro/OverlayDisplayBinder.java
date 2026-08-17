package com.example.ssmousepro;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import p000.bc1;
import p000.f40;
import p000.hp0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class OverlayDisplayBinder {
    public static final int FLAG_EXTERNAL_DEX_HOSTING = 131072;
    public static final OverlayDisplayBinder INSTANCE = new OverlayDisplayBinder();
    private static final String TAG = "OverlayDisplayBinder";
    private static volatile Alvo cache;
    private static volatile boolean listenerRegistrado;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Alvo {
        private final Context context;
        private final Display display;
        private final WindowManager windowManager;

        public Alvo(Display display, Context context, WindowManager windowManager) {
            display.getClass();
            context.getClass();
            windowManager.getClass();
            this.display = display;
            this.context = context;
            this.windowManager = windowManager;
        }

        public static /* synthetic */ Alvo copy$default(Alvo alvo, Display display, Context context, WindowManager windowManager, int i, Object obj) {
            if ((i & 1) != 0) {
                display = alvo.display;
            }
            if ((i & 2) != 0) {
                context = alvo.context;
            }
            if ((i & 4) != 0) {
                windowManager = alvo.windowManager;
            }
            return alvo.copy(display, context, windowManager);
        }

        public final Display component1() {
            return this.display;
        }

        public final Context component2() {
            return this.context;
        }

        public final WindowManager component3() {
            return this.windowManager;
        }

        public final Alvo copy(Display display, Context context, WindowManager windowManager) {
            display.getClass();
            context.getClass();
            windowManager.getClass();
            return new Alvo(display, context, windowManager);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alvo)) {
                return false;
            }
            Alvo alvo = (Alvo) obj;
            return hp0.m3214e(this.display, alvo.display) && hp0.m3214e(this.context, alvo.context) && hp0.m3214e(this.windowManager, alvo.windowManager);
        }

        public final Context getContext() {
            return this.context;
        }

        public final Display getDisplay() {
            return this.display;
        }

        public final int getDisplayId() {
            return this.display.getDisplayId();
        }

        public final WindowManager getWindowManager() {
            return this.windowManager;
        }

        public int hashCode() {
            return this.windowManager.hashCode() + ((this.context.hashCode() + (this.display.hashCode() * 31)) * 31);
        }

        public final DisplayMetrics metrics() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.display.getRealMetrics(displayMetrics);
            return displayMetrics;
        }

        public String toString() {
            return "Alvo(display=" + this.display + ", context=" + this.context + ", windowManager=" + this.windowManager + ")";
        }
    }

    private OverlayDisplayBinder() {
    }

    private final boolean configSemDesktopEnabled(Context context) {
        try {
            Configuration configuration = context.getApplicationContext().getResources().getConfiguration();
            Class<?> cls = configuration.getClass();
            return cls.getField("SEM_DESKTOP_MODE_ENABLED").getInt(cls) == cls.getField("semDesktopModeEnabled").getInt(configuration);
        } catch (Exception unused) {
            return false;
        }
    }

    private final Alvo criarAlvo(Context context) {
        Display display;
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        if (emModoDexComoGg(context, displayManager)) {
            display = displayDexHosting(displayManager);
            if (display == null && (display = displayManager.getDisplay(0)) == null) {
                f40.m2719o("Sem display");
                return null;
            }
        } else {
            display = displayManager.getDisplay(0);
            if (display == null) {
                f40.m2719o("Sem display padrão");
                return null;
            }
        }
        Context contextCreateDisplayContext = context.createDisplayContext(display);
        contextCreateDisplayContext.getClass();
        bc1 bc1VarWindowManagerNoDisplay = windowManagerNoDisplay(contextCreateDisplayContext, display);
        Context context2 = (Context) bc1VarWindowManagerNoDisplay.f1292a;
        WindowManager windowManager = (WindowManager) bc1VarWindowManagerNoDisplay.f1293b;
        display.getDisplayId();
        display.getName();
        Integer.toHexString(display.getFlags());
        return new Alvo(display, context2, windowManager);
    }

    public static /* synthetic */ boolean emModoDexComoGg$default(OverlayDisplayBinder overlayDisplayBinder, Context context, DisplayManager displayManager, int i, Object obj) {
        if ((i & 2) != 0) {
            displayManager = null;
        }
        return overlayDisplayBinder.emModoDexComoGg(context, displayManager);
    }

    private final void garantirListenerDisplay(Context context) {
        if (listenerRegistrado) {
            return;
        }
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager == null) {
            return;
        }
        try {
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: com.example.ssmousepro.OverlayDisplayBinder.garantirListenerDisplay.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i) {
                    OverlayDisplayBinder.INSTANCE.invalidar();
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i) {
                    OverlayDisplayBinder.INSTANCE.invalidar();
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i) {
                }
            }, new Handler(Looper.getMainLooper()));
            listenerRegistrado = true;
        } catch (Exception e) {
            Log.w(TAG, "registerDisplayListener falhou", e);
        }
    }

    private final boolean semDesktopEnabled(Context context) {
        Object objInvoke;
        try {
            Object systemService = context.getApplicationContext().getSystemService("desktopmode");
            if (systemService == null || (objInvoke = systemService.getClass().getDeclaredMethod("getDesktopModeState", null).invoke(systemService, null)) == null) {
                return false;
            }
            Class<?> cls = objInvoke.getClass();
            Object objInvoke2 = cls.getDeclaredMethod("getEnabled", null).invoke(objInvoke, null);
            objInvoke2.getClass();
            return ((Integer) objInvoke2).intValue() == cls.getDeclaredField("ENABLED").getInt(cls);
        } catch (Exception unused) {
            return false;
        }
    }

    private final bc1 windowManagerNoDisplay(Context context, Display display) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            try {
                Context contextCreateWindowContext = context.createWindowContext(display, 2038, null);
                contextCreateWindowContext.getClass();
                return new bc1(contextCreateWindowContext, contextCreateWindowContext.getSystemService(WindowManager.class));
            } catch (Exception e) {
                Log.w(TAG, "createWindowContext(Display) falhou; fallback", e);
                Object systemService = context.getSystemService("window");
                systemService.getClass();
                return new bc1(context, (WindowManager) systemService);
            }
        }
        if (i < 30) {
            Object systemService2 = context.getSystemService("window");
            systemService2.getClass();
            return new bc1(context, (WindowManager) systemService2);
        }
        try {
            Context contextCreateWindowContext2 = context.createWindowContext(2038, null);
            contextCreateWindowContext2.getClass();
            return new bc1(contextCreateWindowContext2, contextCreateWindowContext2.getSystemService(WindowManager.class));
        } catch (Exception e2) {
            Log.w(TAG, "createWindowContext(type) falhou; fallback", e2);
            Object systemService3 = context.getSystemService("window");
            systemService3.getClass();
            return new bc1(context, (WindowManager) systemService3);
        }
    }

    public final Display displayDexHosting(DisplayManager displayManager) {
        displayManager.getClass();
        Display[] displays = displayManager.getDisplays();
        displays.getClass();
        for (Display display : displays) {
            if (display.getState() != 1 && display.getDisplayId() != 0 && (display.getFlags() & FLAG_EXTERNAL_DEX_HOSTING) != 0) {
                return display;
            }
        }
        return null;
    }

    public final boolean emModoDexComoGg(Context context, DisplayManager displayManager) {
        context.getClass();
        if (displayManager == null) {
            Object systemService = context.getSystemService("display");
            systemService.getClass();
            displayManager = (DisplayManager) systemService;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return semDesktopEnabled(context) || configSemDesktopEnabled(context);
        }
        Display[] displays = displayManager.getDisplays();
        displays.getClass();
        for (Display display : displays) {
            if (display.getDisplayId() != 0 && (display.getFlags() & FLAG_EXTERNAL_DEX_HOSTING) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void invalidar() {
        cache = null;
    }

    public final Alvo resolver(Context context) {
        context.getClass();
        Alvo alvo = cache;
        if (alvo != null && alvo.getDisplay().isValid()) {
            return alvo;
        }
        synchronized (this) {
            Alvo alvo2 = cache;
            if (alvo2 != null && alvo2.getDisplay().isValid()) {
                return alvo2;
            }
            OverlayDisplayBinder overlayDisplayBinder = INSTANCE;
            Alvo alvoCriarAlvo = overlayDisplayBinder.criarAlvo(context);
            cache = alvoCriarAlvo;
            overlayDisplayBinder.garantirListenerDisplay(context);
            return alvoCriarAlvo;
        }
    }
}
