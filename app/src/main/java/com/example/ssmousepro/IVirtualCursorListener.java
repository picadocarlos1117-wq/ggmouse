package com.example.ssmousepro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface IVirtualCursorListener extends IInterface {
    public static final String DESCRIPTOR = "com.example.ssmousepro.IVirtualCursorListener";

    void onMouseButton(int i, boolean z);

    void onMouseDelta(int i, int i2);

    void onPhysicalCapture(int i, boolean z, boolean z2);

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static abstract class Stub extends Binder implements IVirtualCursorListener {
        static final int TRANSACTION_onMouseButton = 2;
        static final int TRANSACTION_onMouseDelta = 1;
        static final int TRANSACTION_onPhysicalCapture = 3;

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class Proxy implements IVirtualCursorListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IVirtualCursorListener.DESCRIPTOR;
            }

            @Override // com.example.ssmousepro.IVirtualCursorListener
            public void onMouseButton(int i, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVirtualCursorListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IVirtualCursorListener
            public void onMouseDelta(int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVirtualCursorListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.IVirtualCursorListener
            public void onPhysicalCapture(int i, boolean z, boolean z2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVirtualCursorListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IVirtualCursorListener.DESCRIPTOR);
        }

        public static IVirtualCursorListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IVirtualCursorListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVirtualCursorListener)) ? new Proxy(iBinder) : (IVirtualCursorListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IVirtualCursorListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IVirtualCursorListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                if (i == 2) {
                    onMouseButton(parcel.readInt(), parcel.readInt() != 0);
                } else {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    onPhysicalCapture(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                }
            } else {
                onMouseDelta(parcel.readInt(), parcel.readInt());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class Default implements IVirtualCursorListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.example.ssmousepro.IVirtualCursorListener
        public void onMouseButton(int i, boolean z) {
        }

        @Override // com.example.ssmousepro.IVirtualCursorListener
        public void onMouseDelta(int i, int i2) {
        }

        @Override // com.example.ssmousepro.IVirtualCursorListener
        public void onPhysicalCapture(int i, boolean z, boolean z2) {
        }
    }
}
