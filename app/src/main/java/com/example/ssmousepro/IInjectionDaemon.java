package com.example.ssmousepro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface IInjectionDaemon extends IInterface {
    public static final String DESCRIPTOR = "com.example.ssmousepro.IInjectionDaemon";

    void destroy();

    boolean executarComando(String str);

    String getFpsExteriorDebug();

    long[] getPipelineMetrics();

    String getSocketName();

    boolean isSocketRunning();

    void registerAimListener(IAimStateListener iAimStateListener);

    void registerHandModeCallbacks(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider);

    void unregisterAimListener();

    void unregisterHandModeCallbacks();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class Default implements IInjectionDaemon {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public boolean executarComando(String str) {
            return false;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public String getFpsExteriorDebug() {
            return null;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public long[] getPipelineMetrics() {
            return null;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public String getSocketName() {
            return null;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public boolean isSocketRunning() {
            return false;
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public void destroy() {
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public void unregisterAimListener() {
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public void unregisterHandModeCallbacks() {
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public void registerAimListener(IAimStateListener iAimStateListener) {
        }

        @Override // com.example.ssmousepro.IInjectionDaemon
        public void registerHandModeCallbacks(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static abstract class Stub extends Binder implements IInjectionDaemon {
        static final int TRANSACTION_destroy = 16777115;
        static final int TRANSACTION_executarComando = 4;
        static final int TRANSACTION_getFpsExteriorDebug = 9;
        static final int TRANSACTION_getPipelineMetrics = 10;
        static final int TRANSACTION_getSocketName = 3;
        static final int TRANSACTION_isSocketRunning = 2;
        static final int TRANSACTION_registerAimListener = 5;
        static final int TRANSACTION_registerHandModeCallbacks = 7;
        static final int TRANSACTION_unregisterAimListener = 6;
        static final int TRANSACTION_unregisterHandModeCallbacks = 8;

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class Proxy implements IInjectionDaemon {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public void destroy() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_destroy, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public boolean executarComando(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public String getFpsExteriorDebug() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IInjectionDaemon.DESCRIPTOR;
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public long[] getPipelineMetrics() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createLongArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public String getSocketName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public boolean isSocketRunning() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public void registerAimListener(IAimStateListener iAimStateListener) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iAimStateListener);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public void registerHandModeCallbacks(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iVirtualCursorListener);
                    parcelObtain.writeStrongInterface(iCursorPositionProvider);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public void unregisterAimListener() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IInjectionDaemon
            public void unregisterHandModeCallbacks() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInjectionDaemon.DESCRIPTOR);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IInjectionDaemon.DESCRIPTOR);
        }

        public static IInjectionDaemon asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInjectionDaemon.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IInjectionDaemon)) ? new Proxy(iBinder) : (IInjectionDaemon) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IInjectionDaemon.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IInjectionDaemon.DESCRIPTOR);
                return true;
            }
            if (i != TRANSACTION_destroy) {
                switch (i) {
                    case 2:
                        boolean zIsSocketRunning = isSocketRunning();
                        parcel2.writeNoException();
                        parcel2.writeInt(zIsSocketRunning ? 1 : 0);
                        break;
                    case 3:
                        String socketName = getSocketName();
                        parcel2.writeNoException();
                        parcel2.writeString(socketName);
                        break;
                    case 4:
                        boolean zExecutarComando = executarComando(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(zExecutarComando ? 1 : 0);
                        break;
                    case 5:
                        registerAimListener(IAimStateListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 6:
                        unregisterAimListener();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        registerHandModeCallbacks(IVirtualCursorListener.Stub.asInterface(parcel.readStrongBinder()), ICursorPositionProvider.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 8:
                        unregisterHandModeCallbacks();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        String fpsExteriorDebug = getFpsExteriorDebug();
                        parcel2.writeNoException();
                        parcel2.writeString(fpsExteriorDebug);
                        break;
                    case 10:
                        long[] pipelineMetrics = getPipelineMetrics();
                        parcel2.writeNoException();
                        parcel2.writeLongArray(pipelineMetrics);
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                destroy();
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
