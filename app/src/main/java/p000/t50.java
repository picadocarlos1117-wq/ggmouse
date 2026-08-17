package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t50 {

    /* JADX INFO: renamed from: i */
    public static final Object f10752i = new Object();

    /* JADX INFO: renamed from: j */
    public static volatile t50 f10753j;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f10754a;

    /* JADX INFO: renamed from: b */
    public final C0707ha f10755b;

    /* JADX INFO: renamed from: c */
    public volatile int f10756c;

    /* JADX INFO: renamed from: d */
    public final Handler f10757d;

    /* JADX INFO: renamed from: e */
    public final p50 f10758e;

    /* JADX INFO: renamed from: f */
    public final s50 f10759f;

    /* JADX INFO: renamed from: g */
    public final int f10760g;

    /* JADX INFO: renamed from: h */
    public final C0658fz f10761h;

    public t50(od0 od0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10754a = reentrantReadWriteLock;
        this.f10756c = 3;
        s50 s50Var = (s50) od0Var.f9391b;
        this.f10759f = s50Var;
        int i = od0Var.f9390a;
        this.f10760g = i;
        this.f10761h = (C0658fz) od0Var.f9392c;
        this.f10757d = new Handler(Looper.getMainLooper());
        this.f10755b = new C0707ha(0);
        p50 p50Var = new p50(this);
        this.f10758e = p50Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f10756c = 0;
            } catch (Throwable th) {
                this.f10754a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m6232b() == 0) {
            try {
                s50Var.mo2391a(new o50(p50Var));
            } catch (Throwable th2) {
                m6234d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static t50 m6231a() {
        t50 t50Var;
        synchronized (f10752i) {
            try {
                t50Var = f10753j;
                if (!(t50Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t50Var;
    }

    /* JADX INFO: renamed from: b */
    public final int m6232b() {
        this.f10754a.readLock().lock();
        try {
            return this.f10756c;
        } finally {
            this.f10754a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6233c() {
        if (!(this.f10760g == 1)) {
            f40.m2719o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m6232b() == 1) {
            return;
        }
        this.f10754a.writeLock().lock();
        try {
            if (this.f10756c == 0) {
                this.f10754a.writeLock().unlock();
                return;
            }
            this.f10756c = 0;
            this.f10754a.writeLock().unlock();
            p50 p50Var = this.f10758e;
            t50 t50Var = p50Var.f8725a;
            try {
                t50Var.f10759f.mo2391a(new o50(p50Var));
            } catch (Throwable th) {
                t50Var.m6234d(th);
            }
        } catch (Throwable th2) {
            this.f10754a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6234d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f10754a.writeLock().lock();
        try {
            this.f10756c = 2;
            arrayList.addAll(this.f10755b);
            this.f10755b.clear();
            this.f10754a.writeLock().unlock();
            this.f10757d.post(new RunnableC0120c2(arrayList, this.f10756c, th));
        } catch (Throwable th2) {
            this.f10754a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:45:0x0083, B:47:0x008d, B:49:0x0090, B:51:0x0094, B:53:0x00a4, B:54:0x00a7, B:56:0x00b4, B:59:0x00bc, B:64:0x00db, B:70:0x00e7, B:73:0x00f3, B:74:0x00fd, B:75:0x010c, B:77:0x0113, B:78:0x0118, B:80:0x0123, B:82:0x012a, B:84:0x012e, B:86:0x0134, B:88:0x0138, B:91:0x0140, B:94:0x014c, B:95:0x0152, B:97:0x0160, B:43:0x0079), top: B:116:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:45:0x0083, B:47:0x008d, B:49:0x0090, B:51:0x0094, B:53:0x00a4, B:54:0x00a7, B:56:0x00b4, B:59:0x00bc, B:64:0x00db, B:70:0x00e7, B:73:0x00f3, B:74:0x00fd, B:75:0x010c, B:77:0x0113, B:78:0x0118, B:80:0x0123, B:82:0x012a, B:84:0x012e, B:86:0x0134, B:88:0x0138, B:91:0x0140, B:94:0x014c, B:95:0x0152, B:97:0x0160, B:43:0x0079), top: B:116:0x005a }] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:340)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:592)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:62:0x00d7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.CharSequence m6235e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t50.m6235e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: f */
    public final void m6236f(r50 r50Var) {
        rc2.m5789j(r50Var, "initCallback cannot be null");
        this.f10754a.writeLock().lock();
        try {
            if (this.f10756c == 1 || this.f10756c == 2) {
                this.f10757d.post(new RunnableC0120c2(Arrays.asList(r50Var), this.f10756c, (Throwable) null));
            } else {
                this.f10755b.add(r50Var);
            }
        } finally {
            this.f10754a.writeLock().unlock();
        }
    }
}
