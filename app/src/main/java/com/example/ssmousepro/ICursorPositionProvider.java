package com.example.ssmousepro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface ICursorPositionProvider extends IInterface {
    public static final String DESCRIPTOR = "com.example.ssmousepro.ICursorPositionProvider";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class Default implements ICursorPositionProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.example.ssmousepro.ICursorPositionProvider
        public int getCursorX() {
            return 0;
        }

        @Override // com.example.ssmousepro.ICursorPositionProvider
        public int getCursorY() {
            return 0;
        }
    }

    int getCursorX();

    int getCursorY();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static abstract class Stub extends Binder implements ICursorPositionProvider {
        static final int TRANSACTION_getCursorX = 1;
        static final int TRANSACTION_getCursorY = 2;

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class Proxy implements ICursorPositionProvider {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.example.ssmousepro.ICursorPositionProvider
            public int getCursorX() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICursorPositionProvider.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.example.ssmousepro.ICursorPositionProvider
            public int getCursorY() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICursorPositionProvider.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICursorPositionProvider.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ICursorPositionProvider.DESCRIPTOR);
        }

        public static ICursorPositionProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICursorPositionProvider.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICursorPositionProvider)) ? new Proxy(iBinder) : (ICursorPositionProvider) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICursorPositionProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICursorPositionProvider.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int cursorX = getCursorX();
                parcel2.writeNoException();
                parcel2.writeInt(cursorX);
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int cursorY = getCursorY();
                parcel2.writeNoException();
                parcel2.writeInt(cursorY);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
