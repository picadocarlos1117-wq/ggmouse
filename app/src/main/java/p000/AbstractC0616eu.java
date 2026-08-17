package p000;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0616eu extends AbstractC0018ah {
    private final InterfaceC1456tu _context;
    private transient InterfaceC0579du intercepted;

    public AbstractC0616eu(InterfaceC0579du interfaceC0579du) {
        this(interfaceC0579du, interfaceC0579du != null ? interfaceC0579du.getContext() : null);
    }

    @Override // p000.InterfaceC0579du
    public InterfaceC1456tu getContext() {
        InterfaceC1456tu interfaceC1456tu = this._context;
        interfaceC1456tu.getClass();
        return interfaceC1456tu;
    }

    public final InterfaceC0579du intercepted() {
        InterfaceC0579du interfaceC0579duInterceptContinuation = this.intercepted;
        if (interfaceC0579duInterceptContinuation == null) {
            InterfaceC0653fu interfaceC0653fu = (InterfaceC0653fu) getContext().get(bz1.f1578c);
            if (interfaceC0653fu == null || (interfaceC0579duInterceptContinuation = interfaceC0653fu.interceptContinuation(this)) == null) {
                interfaceC0579duInterceptContinuation = this;
            }
            this.intercepted = interfaceC0579duInterceptContinuation;
        }
        return interfaceC0579duInterceptContinuation;
    }

    @Override // p000.AbstractC0018ah
    public void releaseIntercepted() {
        InterfaceC0579du interfaceC0579du = this.intercepted;
        if (interfaceC0579du != null && interfaceC0579du != this) {
            InterfaceC1382ru interfaceC1382ru = getContext().get(bz1.f1578c);
            interfaceC1382ru.getClass();
            ((InterfaceC0653fu) interfaceC1382ru).releaseInterceptedContinuation(interfaceC0579du);
        }
        this.intercepted = C1378rq.f10094a;
    }

    public AbstractC0616eu(InterfaceC0579du interfaceC0579du, InterfaceC1456tu interfaceC1456tu) {
        super(interfaceC0579du);
        this._context = interfaceC1456tu;
    }
}
