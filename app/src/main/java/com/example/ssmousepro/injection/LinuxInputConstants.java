package com.example.ssmousepro.injection;

import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class LinuxInputConstants {
    public static final int ABS_CNT = 64;
    public static final int ABS_MT_POSITION_X = 53;
    public static final int ABS_MT_POSITION_Y = 54;
    public static final int ABS_MT_SLOT = 47;
    public static final int ABS_MT_TRACKING_ID = 57;
    public static final int ABS_X = 0;
    public static final int ABS_Y = 1;
    public static final int BTN_MOUSE = 272;
    public static final int BTN_TOUCH = 330;
    public static final int BUS_USB = 3;
    public static final int EV_ABS = 3;
    public static final int EV_KEY = 1;
    public static final int EV_REL = 2;
    public static final int EV_SYN = 0;
    public static final String INPUT_DIR = "/dev/input";
    public static final int INPUT_EVENT_SIZE = 24;
    public static final LinuxInputConstants INSTANCE;
    public static final int KEY_A = 30;
    public static final int KEY_F1 = 59;
    public static final int KEY_F12 = 70;
    public static final int KEY_LEFTCTRL = 29;
    public static final int KEY_LEFTSHIFT = 42;
    public static final int KEY_SPACE = 57;
    public static final int REL_X = 0;
    public static final int REL_Y = 1;
    public static final int SYN_REPORT = 0;
    public static final String UINPUT_DEVICE_NAME = "ssmousepro-virtual-input";
    public static final int UINPUT_MAX_NAME_SIZE = 80;
    public static final String UINPUT_PATH = "/dev/uinput";
    private static final int UI_DEV_CREATE;
    private static final int UI_DEV_DESTROY;
    private static final int UI_SET_ABSBIT;
    private static final int UI_SET_EVBIT;
    private static final int UI_SET_KEYBIT;
    private static final int UI_SET_RELBIT;

    static {
        LinuxInputConstants linuxInputConstants = new LinuxInputConstants();
        INSTANCE = linuxInputConstants;
        UI_SET_EVBIT = linuxInputConstants.iow('U', 100, 4);
        UI_SET_KEYBIT = linuxInputConstants.iow('U', 101, 4);
        UI_SET_RELBIT = linuxInputConstants.iow('U', LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 4);
        UI_SET_ABSBIT = linuxInputConstants.iow('U', 107, 4);
        UI_DEV_CREATE = linuxInputConstants.m1582io('U', 1);
        UI_DEV_DESTROY = linuxInputConstants.m1582io('U', 2);
    }

    private LinuxInputConstants() {
    }

    /* JADX INFO: renamed from: io */
    private final int m1582io(char c, int i) {
        return (c << 8) | i;
    }

    private final int iow(char c, int i, int i2) {
        return (i2 << 16) | 1073741824 | (c << 8) | i;
    }

    public final int getUI_DEV_CREATE() {
        return UI_DEV_CREATE;
    }

    public final int getUI_DEV_DESTROY() {
        return UI_DEV_DESTROY;
    }

    public final int getUI_SET_ABSBIT() {
        return UI_SET_ABSBIT;
    }

    public final int getUI_SET_EVBIT() {
        return UI_SET_EVBIT;
    }

    public final int getUI_SET_KEYBIT() {
        return UI_SET_KEYBIT;
    }

    public final int getUI_SET_RELBIT() {
        return UI_SET_RELBIT;
    }
}
