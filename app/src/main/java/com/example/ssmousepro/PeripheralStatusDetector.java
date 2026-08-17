package com.example.ssmousepro;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.AbstractC1414sp;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PeripheralStatusDetector {
    public static final PeripheralStatusDetector INSTANCE = new PeripheralStatusDetector();
    private static final List<String> NOMES_INTERNOS = AbstractC1414sp.m6124n0("ssmousepro", "uinput", "virtual", "touchpad", "trackpad", "touchscreen", "sec_touch", "fts", "synaptics", "goodix", "himax", "gpio", "qpnp", "fingerprint", "fpc", "hall", "sensor", "pen", "stylus", "digitizer");

    private PeripheralStatusDetector() {
    }

    private final boolean devicePossuiTeclasAlfabeticas(InputDevice inputDevice) {
        boolean[] zArrHasKeys = inputDevice.hasKeys(29, 47, 32);
        zArrHasKeys.getClass();
        if (!(zArrHasKeys.length == 0)) {
            for (boolean z : zArrHasKeys) {
                if (z) {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean deviceTemEixoMouse(InputDevice inputDevice) {
        return (inputDevice.getMotionRange(27) == null && inputDevice.getMotionRange(0, 8194) == null) ? false : true;
    }

    private final boolean ehDispositivoIgnorado(InputDevice inputDevice) {
        String name = inputDevice.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = NOMES_INTERNOS;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (zv1.m7365E0(lowerCase, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean ehDispositivoMouse(InputDevice inputDevice) {
        int sources = inputDevice.getSources();
        return !((sources & 8194) == 0 && (sources & 131076) == 0) && deviceTemEixoMouse(inputDevice);
    }

    private final boolean ehPerifericoFisicoExterno(InputDevice inputDevice) {
        if (Build.VERSION.SDK_INT >= 29 && inputDevice.isExternal()) {
            return true;
        }
        if (inputDevice.getVendorId() != 0 && inputDevice.getProductId() != 0) {
            return true;
        }
        String name = inputDevice.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return zv1.m7365E0(lowerCase, "usb", false) || zv1.m7365E0(lowerCase, "bluetooth", false) || zv1.m7365E0(lowerCase, "bt ", false) || zv1.m7365E0(lowerCase, "wireless", false);
    }

    private final boolean isDispositivoVirtual(InputDevice inputDevice) {
        if (Build.VERSION.SDK_INT >= 29) {
            return inputDevice.isVirtual();
        }
        String name = inputDevice.getName();
        name.getClass();
        return zv1.m7365E0(name, "Virtual", true);
    }

    private final List<InputDevice> listarDispositivos(Context context) {
        Object systemService = context.getSystemService("input");
        systemService.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i : ((InputManager) systemService).getInputDeviceIds()) {
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && !isDispositivoVirtual(device)) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }

    public final boolean temMouse(Context context) {
        context.getClass();
        List<InputDevice> listListarDispositivos = listarDispositivos(context);
        if ((listListarDispositivos instanceof Collection) && listListarDispositivos.isEmpty()) {
            return false;
        }
        for (InputDevice inputDevice : listListarDispositivos) {
            PeripheralStatusDetector peripheralStatusDetector = INSTANCE;
            if ((!peripheralStatusDetector.ehDispositivoIgnorado(inputDevice) && peripheralStatusDetector.ehPerifericoFisicoExterno(inputDevice)) ? peripheralStatusDetector.ehDispositivoMouse(inputDevice) : false) {
                return true;
            }
        }
        return false;
    }

    public final boolean temTeclado(Context context) {
        context.getClass();
        List<InputDevice> listListarDispositivos = listarDispositivos(context);
        if ((listListarDispositivos instanceof Collection) && listListarDispositivos.isEmpty()) {
            return false;
        }
        for (InputDevice inputDevice : listListarDispositivos) {
            PeripheralStatusDetector peripheralStatusDetector = INSTANCE;
            if (!peripheralStatusDetector.ehDispositivoIgnorado(inputDevice) && peripheralStatusDetector.ehPerifericoFisicoExterno(inputDevice) && (!peripheralStatusDetector.ehDispositivoMouse(inputDevice) || peripheralStatusDetector.devicePossuiTeclasAlfabeticas(inputDevice))) {
                if ((inputDevice.getSources() & 257) == 257 && inputDevice.getKeyboardType() == 2 && peripheralStatusDetector.devicePossuiTeclasAlfabeticas(inputDevice)) {
                    return true;
                }
            }
        }
        return false;
    }
}
