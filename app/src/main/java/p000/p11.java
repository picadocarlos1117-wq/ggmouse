package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.sun.security.util.DerValue;
import android.util.Pair;
import android.view.Surface;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.LoginActivity;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p11 extends g11 {

    /* JADX INFO: renamed from: r1 */
    public static final int[] f8624r1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: s1 */
    public static boolean f8625s1;

    /* JADX INFO: renamed from: t1 */
    public static boolean f8626t1;

    /* JADX INFO: renamed from: H0 */
    public final Context f8627H0;

    /* JADX INFO: renamed from: I0 */
    public final boolean f8628I0;

    /* JADX INFO: renamed from: J0 */
    public final C1290pc f8629J0;

    /* JADX INFO: renamed from: K0 */
    public final int f8630K0;

    /* JADX INFO: renamed from: L0 */
    public final boolean f8631L0;

    /* JADX INFO: renamed from: M0 */
    public final c62 f8632M0;

    /* JADX INFO: renamed from: N0 */
    public final b62 f8633N0;

    /* JADX INFO: renamed from: O0 */
    public C0699h2 f8634O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f8635P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f8636Q0;

    /* JADX INFO: renamed from: R0 */
    public wd1 f8637R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f8638S0;

    /* JADX INFO: renamed from: T0 */
    public List f8639T0;

    /* JADX INFO: renamed from: U0 */
    public Surface f8640U0;

    /* JADX INFO: renamed from: V0 */
    public gd1 f8641V0;

    /* JADX INFO: renamed from: W0 */
    public gt1 f8642W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f8643X0;

    /* JADX INFO: renamed from: Y0 */
    public int f8644Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f8645Z0;

    /* JADX INFO: renamed from: a1 */
    public long f8646a1;

    /* JADX INFO: renamed from: b1 */
    public int f8647b1;

    /* JADX INFO: renamed from: c1 */
    public int f8648c1;

    /* JADX INFO: renamed from: d1 */
    public int f8649d1;

    /* JADX INFO: renamed from: e1 */
    public long f8650e1;

    /* JADX INFO: renamed from: f1 */
    public int f8651f1;

    /* JADX INFO: renamed from: g1 */
    public long f8652g1;

    /* JADX INFO: renamed from: h1 */
    public m62 f8653h1;

    /* JADX INFO: renamed from: i1 */
    public m62 f8654i1;

    /* JADX INFO: renamed from: j1 */
    public int f8655j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f8656k1;

    /* JADX INFO: renamed from: l1 */
    public int f8657l1;

    /* JADX INFO: renamed from: m1 */
    public o11 f8658m1;

    /* JADX INFO: renamed from: n1 */
    public z52 f8659n1;

    /* JADX INFO: renamed from: o1 */
    public long f8660o1;

    /* JADX INFO: renamed from: p1 */
    public long f8661p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f8662q1;

    public p11(RewardedVideoActivity rewardedVideoActivity, y01 y01Var, Handler handler, c80 c80Var) {
        super(2, y01Var, 30.0f);
        Context applicationContext = rewardedVideoActivity.getApplicationContext();
        this.f8627H0 = applicationContext;
        this.f8630K0 = 50;
        this.f8637R0 = null;
        this.f8629J0 = new C1290pc(handler, c80Var);
        this.f8628I0 = true;
        this.f8632M0 = new c62(applicationContext, this);
        this.f8633N0 = new b62();
        this.f8631L0 = "NVIDIA".equals(z42.f13276c);
        this.f8642W0 = gt1.f4318c;
        this.f8644Y0 = 1;
        this.f8645Z0 = 0;
        this.f8653h1 = m62.f6671d;
        this.f8657l1 = 0;
        this.f8654i1 = null;
        this.f8655j1 = -1000;
        this.f8660o1 = -9223372036854775807L;
        this.f8661p1 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m5104A0(c11 c11Var, be0 be0Var) {
        int i = be0Var.f1342o;
        List list = be0Var.f1344q;
        if (i == -1) {
            return m5106y0(c11Var, be0Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return be0Var.f1342o + length;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: x0 */
    public static boolean m5105x0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (p11.class) {
            try {
                if (!f8625s1) {
                    int i = z42.f13274a;
                    byte b3 = DerValue.tag_UniversalString;
                    if (i <= 28) {
                        String str4 = z42.f13275b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(z42.f13275b)) {
                                    str2 = z42.f13277d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = z42.f13275b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = DerValue.tag_UTF8String;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = DerValue.tag_PrintableString;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = DerValue.tag_T61String;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = DerValue.tag_IA5String;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = DerValue.tag_UtcTime;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = DerValue.tag_GeneralizedTime;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = DerValue.tag_BMPString;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = DerValue.TAG_APPLICATION;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = DerValue.TAG_CONTEXT;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                                    case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                                    case 29:
                                                    case 30:
                                                    case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                                    case 32:
                                                    case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                                    case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                                    case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                                                    case 36:
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                    case 38:
                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                    case 40:
                                                    case 41:
                                                    case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                                    case 43:
                                                    case 44:
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                    case 46:
                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                    case 48:
                                                    case 49:
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case LinuxInputConstants.KEY_F1 /* 59 */:
                                                    case 60:
                                                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case LinuxInputConstants.KEY_F12 /* 70 */:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
                                                    case 103:
                                                    case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                                                    case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = z42.f13277d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = z42.f13275b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = DerValue.tag_UTF8String;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = DerValue.tag_PrintableString;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = DerValue.tag_T61String;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = DerValue.tag_IA5String;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = DerValue.tag_UtcTime;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = DerValue.tag_GeneralizedTime;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = DerValue.tag_BMPString;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = DerValue.TAG_APPLICATION;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = DerValue.TAG_CONTEXT;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                        case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                        case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                        case 29:
                                        case 30:
                                        case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                        case 32:
                                        case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                        case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                        case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                                        case 36:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                        case 38:
                                        case BuildConfig.VERSION_CODE /* 39 */:
                                        case 40:
                                        case 41:
                                        case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                        case 43:
                                        case 44:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        case 46:
                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                        case 48:
                                        case 49:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case LinuxInputConstants.KEY_F1 /* 59 */:
                                        case 60:
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case LinuxInputConstants.KEY_F12 /* 70 */:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
                                        case 103:
                                        case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                                        case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = z42.f13277d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = z42.f13275b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_UTF8String;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_PrintableString;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_T61String;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_IA5String;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_UtcTime;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_GeneralizedTime;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.tag_BMPString;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.TAG_APPLICATION;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = DerValue.TAG_CONTEXT;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                        case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                        case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                                        case 29:
                                        case 30:
                                        case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                        case 32:
                                        case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                        case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                        case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                                        case 36:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                        case 38:
                                        case BuildConfig.VERSION_CODE /* 39 */:
                                        case 40:
                                        case 41:
                                        case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                        case 43:
                                        case 44:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        case 46:
                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                        case 48:
                                        case 49:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case LinuxInputConstants.KEY_F1 /* 59 */:
                                        case 60:
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case LinuxInputConstants.KEY_F12 /* 70 */:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
                                        case 103:
                                        case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                                        case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    f8626t1 = z;
                    f8625s1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8626t1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: y0 */
    public static int m5106y0(c11 c11Var, be0 be0Var) {
        int iIntValue;
        int i = be0Var.f1348u;
        int i2 = be0Var.f1349v;
        if (i != -1 && i2 != -1) {
            String str = be0Var.f1341n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM4351d = m11.m4351d(be0Var);
                str = (pairM4351d == null || !((iIntValue = ((Integer) pairM4351d.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = z42.f13277d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(z42.f13276c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !c11Var.f1619f)))) {
                        return ((z42.m7231e(i2, 16) * z42.m7231e(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z0 */
    public static List m5107z0(Context context, f40 f40Var, be0 be0Var, boolean z, boolean z2) {
        List listM4352e;
        String str = be0Var.f1341n;
        if (str == null) {
            return kk1.f5896e;
        }
        if (z42.f13274a >= 26 && "video/dolby-vision".equals(str) && !ua0.m6459o(context)) {
            String strM4349b = m11.m4349b(be0Var);
            if (strM4349b == null) {
                listM4352e = kk1.f5896e;
            } else {
                f40Var.getClass();
                listM4352e = m11.m4352e(strM4349b, z, z2);
            }
            if (!listM4352e.isEmpty()) {
                return listM4352e;
            }
        }
        return m11.m4354g(f40Var, be0Var, z, z2);
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: A */
    public final void mo2885A(float f, float f2) {
        super.mo2885A(f, f2);
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            wd1Var.m6758i(f);
        } else {
            this.f8632M0.m1147h(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    public final Surface m5108B0(c11 c11Var) {
        boolean z;
        fd1 fd1Var;
        int i;
        RuntimeException runtimeException;
        Error error;
        boolean z2 = false;
        if (this.f8637R0 != null) {
            ki0.m3864h(false);
            ki0.m3866j(null);
            throw null;
        }
        Surface surface = this.f8640U0;
        if (surface != null) {
            return surface;
        }
        if (z42.f13274a >= 35 && c11Var.f1621h) {
            return null;
        }
        ki0.m3864h(m5112F0(c11Var));
        gd1 gd1Var = this.f8641V0;
        if (gd1Var != null && gd1Var.f4152a != c11Var.f1619f && gd1Var != null) {
            gd1Var.release();
            this.f8641V0 = null;
        }
        if (this.f8641V0 == null) {
            Context context = this.f8627H0;
            boolean z3 = c11Var.f1619f;
            if (z3) {
                if (!gd1.m2959a(context)) {
                    z = false;
                }
                ki0.m3864h(z);
                fd1Var = new fd1("ExoPlayer:PlaceholderSurface");
                if (z3) {
                    i = gd1.f4150d;
                } else {
                    i = 0;
                }
                fd1Var.start();
                Handler handler = new Handler(fd1Var.getLooper(), fd1Var);
                fd1Var.f3761b = handler;
                fd1Var.f3760a = new d50(handler);
                synchronized (fd1Var) {
                    fd1Var.f3761b.obtainMessage(1, i, 0).sendToTarget();
                    while (fd1Var.f3764e == null && fd1Var.f3763d == null && fd1Var.f3762c == null) {
                        try {
                            fd1Var.wait();
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = fd1Var.f3763d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = fd1Var.f3762c;
                if (error == null) {
                    throw error;
                }
                gd1 gd1Var2 = fd1Var.f3764e;
                gd1Var2.getClass();
                this.f8641V0 = gd1Var2;
            } else {
                int i2 = gd1.f4150d;
            }
            z = true;
            ki0.m3864h(z);
            fd1Var = new fd1("ExoPlayer:PlaceholderSurface");
            if (z3) {
                i = gd1.f4150d;
            } else {
                i = 0;
            }
            fd1Var.start();
            Handler handler2 = new Handler(fd1Var.getLooper(), fd1Var);
            fd1Var.f3761b = handler2;
            fd1Var.f3760a = new d50(handler2);
            synchronized (fd1Var) {
                fd1Var.f3761b.obtainMessage(1, i, 0).sendToTarget();
                while (fd1Var.f3764e == null) {
                    fd1Var.wait();
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = fd1Var.f3763d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = fd1Var.f3762c;
                if (error == null) {
                    throw error;
                }
                gd1 gd1Var3 = fd1Var.f3764e;
                gd1Var3.getClass();
                this.f8641V0 = gd1Var3;
            }
        }
        return this.f8641V0;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m5109C0() {
        if (this.f8647b1 > 0) {
            this.f5812g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f8646a1;
            int i = this.f8647b1;
            C1290pc c1290pc = this.f8629J0;
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new h62(c1290pc, i, j));
            }
            this.f8647b1 = 0;
            this.f8646a1 = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m5110D0() {
        int i;
        z01 z01Var;
        if (!this.f8656k1 || (i = z42.f13274a) < 23 || (z01Var = this.f3970P) == null) {
            return;
        }
        this.f8658m1 = new o11(this, z01Var);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            z01Var.mo4172i(bundle);
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: E */
    public final C1607xx mo15E(c11 c11Var, be0 be0Var, be0 be0Var2) {
        C1607xx c1607xxM1107b = c11Var.m1107b(be0Var, be0Var2);
        int i = c1607xxM1107b.f12762e;
        C0699h2 c0699h2 = this.f8634O0;
        c0699h2.getClass();
        if (be0Var2.f1348u > c0699h2.f4392a || be0Var2.f1349v > c0699h2.f4393b) {
            i |= 256;
        }
        if (m5104A0(c11Var, be0Var2) > c0699h2.f4394c) {
            i |= 64;
        }
        int i2 = i;
        return new C1607xx(c11Var.f1614a, be0Var, be0Var2, i2 != 0 ? 0 : c1607xxM1107b.f12761d, i2);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m5111E0(z01 z01Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        z01Var.mo4173j(i, j);
        Trace.endSection();
        this.f3954C0.f10574e++;
        this.f8648c1 = 0;
        if (this.f8637R0 == null) {
            m62 m62Var = this.f8653h1;
            boolean zEquals = m62Var.equals(m62.f6671d);
            C1290pc c1290pc = this.f8629J0;
            if (!zEquals && !m62Var.equals(this.f8654i1)) {
                this.f8654i1 = m62Var;
                c1290pc.m5250b(m62Var);
            }
            c62 c62Var = this.f8632M0;
            boolean z = c62Var.f1690d != 3;
            c62Var.f1690d = 3;
            c62Var.f1697k.getClass();
            c62Var.f1692f = z42.m7216D(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f8640U0) == null) {
                return;
            }
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new j62(c1290pc, surface, SystemClock.elapsedRealtime()));
            }
            this.f8643X0 = true;
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: F */
    public final b11 mo2889F(IllegalStateException illegalStateException, c11 c11Var) {
        Surface surface = this.f8640U0;
        n11 n11Var = new n11(illegalStateException, c11Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return n11Var;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m5112F0(c11 c11Var) {
        if (z42.f13274a < 23 || this.f8656k1 || m5105x0(c11Var.f1614a)) {
            return false;
        }
        return !c11Var.f1619f || gd1.m2959a(this.f8627H0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m5113G0(z01 z01Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        z01Var.mo4168d(i);
        Trace.endSection();
        this.f3954C0.f10575f++;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m5114H0(int i, int i2) {
        C1422sx c1422sx = this.f3954C0;
        c1422sx.f10577h += i;
        int i3 = i + i2;
        c1422sx.f10576g += i3;
        this.f8647b1 += i3;
        int i4 = this.f8648c1 + i3;
        this.f8648c1 = i4;
        c1422sx.f10578i = Math.max(i4, c1422sx.f10578i);
        int i5 = this.f8630K0;
        if (i5 <= 0 || this.f8647b1 < i5) {
            return;
        }
        m5109C0();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m5115I0(long j) {
        C1422sx c1422sx = this.f3954C0;
        c1422sx.f10580k += j;
        c1422sx.f10581l++;
        this.f8650e1 += j;
        this.f8651f1++;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: N */
    public final int mo2897N(C1533vx c1533vx) {
        return (z42.f13274a < 34 || !this.f8656k1 || c1533vx.f11797p >= this.f5817q) ? 0 : 32;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: O */
    public final boolean mo2898O() {
        return this.f8656k1 && z42.f13274a < 23;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: P */
    public final float mo16P(float f, be0[] be0VarArr) {
        float fMax = -1.0f;
        for (be0 be0Var : be0VarArr) {
            float f2 = be0Var.f1350w;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: Q */
    public final ArrayList mo17Q(f40 f40Var, be0 be0Var, boolean z) {
        List listM5107z0 = m5107z0(this.f8627H0, f40Var, be0Var, z, this.f8656k1);
        HashMap map = m11.f6590a;
        ArrayList arrayList = new ArrayList(listM5107z0);
        Collections.sort(arrayList, new h11(new C1521vl(be0Var, 27), 0));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // p000.g11
    /* JADX INFO: renamed from: R */
    public final C1470u7 mo18R(c11 c11Var, be0 be0Var, MediaCrypto mediaCrypto, float f) {
        C1673zp c1673zp;
        int i;
        C0699h2 c0699h2;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z;
        Pair pairM4351d;
        int iM5106y0;
        String str = c11Var.f1616c;
        be0[] be0VarArr = this.f5815o;
        be0VarArr.getClass();
        int i2 = be0Var.f1348u;
        float f2 = be0Var.f1350w;
        C1673zp c1673zp2 = be0Var.f1316B;
        int i3 = be0Var.f1349v;
        int iM5104A0 = m5104A0(c11Var, be0Var);
        if (be0VarArr.length == 1) {
            if (iM5104A0 != -1 && (iM5106y0 = m5106y0(c11Var, be0Var)) != -1) {
                iM5104A0 = Math.min((int) (iM5104A0 * 1.5f), iM5106y0);
            }
            c0699h2 = new C0699h2(i2, i3, iM5104A0);
            c1673zp = c1673zp2;
            i = i3;
        } else {
            int length = be0VarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                be0 be0Var2 = be0VarArr[i4];
                be0[] be0VarArr2 = be0VarArr;
                if (c1673zp2 != null && be0Var2.f1316B == null) {
                    ae0 ae0VarM969a = be0Var2.m969a();
                    ae0VarM969a.f174A = c1673zp2;
                    be0Var2 = new be0(ae0VarM969a);
                }
                C1607xx c1607xxM1107b = c11Var.m1107b(be0Var, be0Var2);
                int i5 = length;
                int i6 = be0Var2.f1349v;
                if (c1607xxM1107b.f12761d != 0) {
                    int i7 = be0Var2.f1348u;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iM5104A0 = Math.max(iM5104A0, m5104A0(c11Var, be0Var2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                be0VarArr = be0VarArr2;
            }
            if (z2) {
                AbstractC1337qm.m5542i0("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    c1673zp = c1673zp2;
                    if (i10 < 9) {
                        int i11 = f8624r1[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = c11Var.f1617d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(z42.m7231e(i13, widthAlignment) * widthAlignment, z42.m7231e(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (c11Var.m1111f(point.x, point.y, f2)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            c1673zp2 = c1673zp;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            ae0 ae0VarM969a2 = be0Var.m969a();
                            ae0VarM969a2.f204t = iMax;
                            ae0VarM969a2.f205u = iMax2;
                            iM5104A0 = Math.max(iM5104A0, m5106y0(c11Var, new be0(ae0VarM969a2)));
                            AbstractC1337qm.m5542i0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        ae0 ae0VarM969a3 = be0Var.m969a();
                        ae0VarM969a3.f204t = iMax;
                        ae0VarM969a3.f205u = iMax2;
                        iM5104A0 = Math.max(iM5104A0, m5106y0(c11Var, new be0(ae0VarM969a3)));
                        AbstractC1337qm.m5542i0("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                c1673zp = c1673zp2;
                i = i3;
            }
            c0699h2 = new C0699h2(iMax, iMax2, iM5104A0);
        }
        this.f8634O0 = c0699h2;
        int i15 = this.f8656k1 ? this.f8657l1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        ki0.m3852Y(mediaFormat, be0Var.f1344q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        ki0.m3842I(mediaFormat, "rotation-degrees", be0Var.f1351x);
        if (c1673zp != null) {
            C1673zp c1673zp3 = c1673zp;
            ki0.m3842I(mediaFormat, "color-transfer", c1673zp3.f13515c);
            ki0.m3842I(mediaFormat, "color-standard", c1673zp3.f13513a);
            ki0.m3842I(mediaFormat, "color-range", c1673zp3.f13514b);
            byte[] bArr = c1673zp3.f13516d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(be0Var.f1341n) && (pairM4351d = m11.m4351d(be0Var)) != null) {
            ki0.m3842I(mediaFormat, Scopes.PROFILE, ((Integer) pairM4351d.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0699h2.f4392a);
        mediaFormat.setInteger("max-height", c0699h2.f4393b);
        ki0.m3842I(mediaFormat, "max-input-size", c0699h2.f4394c);
        int i16 = z42.f13274a;
        if (i16 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f8631L0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (i16 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f8655j1));
        }
        Surface surfaceM5108B0 = m5108B0(c11Var);
        if (this.f8637R0 != null && !z42.m7214B(this.f8627H0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C1470u7(c11Var, mediaFormat, be0Var, surfaceM5108B0, mediaCrypto, null);
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: S */
    public final void mo19S(C1533vx c1533vx) {
        if (this.f8636Q0) {
            ByteBuffer byteBuffer = c1533vx.f11798q;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        z01 z01Var = this.f3970P;
                        z01Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        z01Var.mo4172i(bundle);
                    }
                }
            }
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: X */
    public final void mo20X(Exception exc) {
        AbstractC1337qm.m5551n("MediaCodecVideoRenderer", "Video codec error", exc);
        C1290pc c1290pc = this.f8629J0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new h62(c1290pc, exc, 3));
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: Y */
    public final void mo21Y(String str, long j, long j2) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C1290pc c1290pc = this.f8629J0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            str2 = str;
            handler.post(new h62(c1290pc, str2, j, j2));
        } else {
            str2 = str;
        }
        this.f8635P0 = m5105x0(str2);
        c11 c11Var = this.f3977W;
        c11Var.getClass();
        boolean z = false;
        if (z42.f13274a >= 29 && "video/x-vnd.on2.vp9".equals(c11Var.f1615b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = c11Var.f1617d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f8636Q0 = z;
        m5110D0();
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: Z */
    public final void mo22Z(String str) {
        C1290pc c1290pc = this.f8629J0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new h62(c1290pc, str, 6));
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: a0 */
    public final C1607xx mo24a0(C0558d8 c0558d8) throws t70 {
        C1607xx c1607xxMo24a0 = super.mo24a0(c0558d8);
        be0 be0Var = (be0) c0558d8.f2822c;
        be0Var.getClass();
        C1290pc c1290pc = this.f8629J0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new h62(c1290pc, be0Var, c1607xxMo24a0));
        }
        return c1607xxMo24a0;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: b0 */
    public final void mo26b0(be0 be0Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        z01 z01Var = this.f3970P;
        if (z01Var != null) {
            z01Var.mo4178q(this.f8644Y0);
        }
        if (this.f8656k1) {
            i = be0Var.f1348u;
            integer = be0Var.f1349v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = be0Var.f1352y;
        int i2 = be0Var.f1351x;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f8653h1 = new m62(f, i, integer);
        wd1 wd1Var = this.f8637R0;
        if (wd1Var == null || !this.f8662q1) {
            this.f8632M0.m1146g(be0Var.f1350w);
        } else {
            ae0 ae0VarM969a = be0Var.m969a();
            ae0VarM969a.f204t = i;
            ae0VarM969a.f205u = integer;
            ae0VarM969a.f208x = f;
            be0 be0Var2 = new be0(ae0VarM969a);
            ki0.m3864h(false);
            wd1Var.f12086n.f13364b.m1146g(be0Var2.f1350w);
            wd1Var.f12075c = be0Var2;
            if (wd1Var.f12081i) {
                ki0.m3864h(wd1Var.f12080h != -9223372036854775807L);
                wd1Var.f12082j = true;
                wd1Var.f12083k = wd1Var.f12080h;
            } else {
                wd1Var.m6754e();
                wd1Var.f12081i = true;
                wd1Var.f12082j = false;
                wd1Var.f12083k = -9223372036854775807L;
            }
        }
        this.f8662q1 = false;
    }

    @Override // p000.AbstractC0828kh, p000.ze1
    /* JADX INFO: renamed from: d */
    public final void mo29d(int i, Object obj) {
        Handler handler;
        c62 c62Var = this.f8632M0;
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f8640U0;
            C1290pc c1290pc = this.f8629J0;
            if (surface2 == surface) {
                if (surface != null) {
                    m62 m62Var = this.f8654i1;
                    if (m62Var != null) {
                        c1290pc.m5250b(m62Var);
                    }
                    Surface surface3 = this.f8640U0;
                    if (surface3 == null || !this.f8643X0 || (handler = c1290pc.f8839a) == null) {
                        return;
                    }
                    handler.post(new j62(c1290pc, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f8640U0 = surface;
            if (this.f8637R0 == null) {
                f62 f62Var = c62Var.f1688b;
                if (f62Var.f3631e != surface) {
                    f62Var.m2728b();
                    f62Var.f3631e = surface;
                    f62Var.m2730d(true);
                }
                c62Var.m1143d(1);
            }
            this.f8643X0 = false;
            int i2 = this.f5813m;
            z01 z01Var = this.f3970P;
            if (z01Var != null && this.f8637R0 == null) {
                c11 c11Var = this.f3977W;
                c11Var.getClass();
                Surface surface4 = this.f8640U0;
                boolean z = (surface4 != null && surface4.isValid()) || (z42.f13274a >= 35 && c11Var.f1621h) || m5112F0(c11Var);
                int i3 = z42.f13274a;
                if (i3 < 23 || !z || this.f8635P0) {
                    m2908k0();
                    m2901V();
                } else {
                    Surface surfaceM5108B0 = m5108B0(c11Var);
                    if (i3 >= 23 && surfaceM5108B0 != null) {
                        z01Var.mo4180u(surfaceM5108B0);
                    } else {
                        if (i3 < 35) {
                            l41.m4046o();
                            return;
                        }
                        z01Var.mo4171h();
                    }
                }
            }
            if (surface != null) {
                m62 m62Var2 = this.f8654i1;
                if (m62Var2 != null) {
                    c1290pc.m5250b(m62Var2);
                }
                if (i2 == 2) {
                    wd1 wd1Var = this.f8637R0;
                    if (wd1Var != null) {
                        wd1Var.m6753d(true);
                    } else {
                        c62Var.m1142c(true);
                    }
                }
            } else {
                this.f8654i1 = null;
                wd1 wd1Var2 = this.f8637R0;
                if (wd1Var2 != null) {
                    zd1 zd1Var = wd1Var2.f12086n;
                    int i4 = gt1.f4318c.f4319a;
                    zd1Var.f13374l = null;
                }
            }
            m5110D0();
            return;
        }
        if (i == 7) {
            obj.getClass();
            z52 z52Var = (z52) obj;
            this.f8659n1 = z52Var;
            wd1 wd1Var3 = this.f8637R0;
            if (wd1Var3 != null) {
                wd1Var3.f12086n.f13372j = z52Var;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f8657l1 != iIntValue) {
                this.f8657l1 = iIntValue;
                if (this.f8656k1) {
                    m2908k0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f8655j1 = ((Integer) obj).intValue();
            z01 z01Var2 = this.f3970P;
            if (z01Var2 != null && z42.f13274a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f8655j1));
                z01Var2.mo4172i(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f8644Y0 = iIntValue2;
            z01 z01Var3 = this.f3970P;
            if (z01Var3 != null) {
                z01Var3.mo4178q(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f8645Z0 = iIntValue3;
            wd1 wd1Var4 = this.f8637R0;
            if (wd1Var4 != null) {
                wd1Var4.m6756g(iIntValue3);
                return;
            }
            f62 f62Var2 = c62Var.f1688b;
            if (f62Var2.f3636j == iIntValue3) {
                return;
            }
            f62Var2.f3636j = iIntValue3;
            f62Var2.m2730d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f8639T0 = list;
            wd1 wd1Var5 = this.f8637R0;
            if (wd1Var5 != null) {
                wd1Var5.m6760k(list);
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f3965K = (g80) obj;
                return;
            }
            return;
        }
        obj.getClass();
        gt1 gt1Var = (gt1) obj;
        if (gt1Var.f4319a == 0 || gt1Var.f4320b == 0) {
            return;
        }
        this.f8642W0 = gt1Var;
        wd1 wd1Var6 = this.f8637R0;
        if (wd1Var6 != null) {
            Surface surface5 = this.f8640U0;
            ki0.m3866j(surface5);
            wd1Var6.m6757h(surface5, gt1Var);
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: d0 */
    public final void mo2903d0(long j) {
        super.mo2903d0(j);
        if (this.f8656k1) {
            return;
        }
        this.f8649d1--;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: e0 */
    public final void mo31e0() {
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            f11 f11Var = this.f3956D0;
            wd1Var.m6759j(f11Var.f3580b, f11Var.f3581c, -this.f8660o1, this.f5817q);
        } else {
            this.f8632M0.m1143d(2);
        }
        this.f8662q1 = true;
        m5110D0();
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: f0 */
    public final void mo2904f0(C1533vx c1533vx) {
        Surface surface;
        boolean z = this.f8656k1;
        if (!z) {
            this.f8649d1++;
        }
        if (z42.f13274a >= 23 || !z) {
            return;
        }
        long j = c1533vx.f11797p;
        m2918w0(j);
        m62 m62Var = this.f8653h1;
        boolean zEquals = m62Var.equals(m62.f6671d);
        C1290pc c1290pc = this.f8629J0;
        if (!zEquals && !m62Var.equals(this.f8654i1)) {
            this.f8654i1 = m62Var;
            c1290pc.m5250b(m62Var);
        }
        this.f3954C0.f10574e++;
        c62 c62Var = this.f8632M0;
        boolean z2 = c62Var.f1690d != 3;
        c62Var.f1690d = 3;
        c62Var.f1697k.getClass();
        c62Var.f1692f = z42.m7216D(SystemClock.elapsedRealtime());
        if (z2 && (surface = this.f8640U0) != null) {
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new j62(c1290pc, surface, SystemClock.elapsedRealtime()));
            }
            this.f8643X0 = true;
        }
        mo2903d0(j);
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: g0 */
    public final void mo2905g0(be0 be0Var) throws t70 {
        wd1 wd1Var = this.f8637R0;
        if (wd1Var == null) {
            return;
        }
        try {
            wd1Var.m6752c(be0Var);
            throw null;
        } catch (l62 e) {
            throw m3830g(e, be0Var, false, 7000);
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: h */
    public final void mo3831h() {
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            c62 c62Var = (c62) wd1Var.f12086n.f13368f.f2821b;
            if (c62Var.f1690d == 0) {
                c62Var.f1690d = 1;
                return;
            }
            return;
        }
        c62 c62Var2 = this.f8632M0;
        if (c62Var2.f1690d == 0) {
            c62Var2.f1690d = 1;
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: i0 */
    public final boolean mo33i0(long j, long j2, z01 z01Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, be0 be0Var) throws t70 {
        z01Var.getClass();
        f11 f11Var = this.f3956D0;
        long j4 = j3 - f11Var.f3581c;
        wd1 wd1Var = this.f8637R0;
        if (wd1Var == null) {
            int iM1140a = this.f8632M0.m1140a(j3, j, j2, f11Var.f3580b, z2, this.f8633N0);
            if (iM1140a != 4) {
                if (z && !z2) {
                    m5113G0(z01Var, i);
                    return true;
                }
                Surface surface = this.f8640U0;
                b62 b62Var = this.f8633N0;
                if (surface == null) {
                    if (b62Var.f1229a < LoginActivity.AUTH_TIMEOUT_MS) {
                        m5113G0(z01Var, i);
                        m5115I0(b62Var.f1229a);
                        return true;
                    }
                } else {
                    if (iM1140a == 0) {
                        this.f5812g.getClass();
                        long jNanoTime = System.nanoTime();
                        z52 z52Var = this.f8659n1;
                        if (z52Var != null) {
                            z52Var.mo2287c(j4, jNanoTime, be0Var, this.f3972R);
                        }
                        m5111E0(z01Var, i, jNanoTime);
                        m5115I0(b62Var.f1229a);
                        return true;
                    }
                    if (iM1140a == 1) {
                        long j5 = b62Var.f1230b;
                        long j6 = b62Var.f1229a;
                        if (j5 == this.f8652g1) {
                            m5113G0(z01Var, i);
                        } else {
                            z52 z52Var2 = this.f8659n1;
                            if (z52Var2 != null) {
                                z52Var2.mo2287c(j4, j5, be0Var, this.f3972R);
                            }
                            m5111E0(z01Var, i, j5);
                        }
                        m5115I0(j6);
                        this.f8652g1 = j5;
                        return true;
                    }
                    if (iM1140a == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        z01Var.mo4168d(i);
                        Trace.endSection();
                        m5114H0(0, 1);
                        m5115I0(b62Var.f1229a);
                        return true;
                    }
                    if (iM1140a == 3) {
                        m5113G0(z01Var, i);
                        m5115I0(b62Var.f1229a);
                        return true;
                    }
                    if (iM1140a != 5) {
                        f40.m2719o(String.valueOf(iM1140a));
                        return false;
                    }
                }
            }
            return false;
        }
        try {
            try {
                return wd1Var.m6751b(j3 + (-this.f8660o1), z2, j, j2, new C0082b0(this, z01Var, i, j4));
            } catch (l62 e) {
                e = e;
                throw m3830g(e, e.f6195a, false, 7001);
            }
        } catch (l62 e2) {
            e = e2;
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: j */
    public final String mo34j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: l */
    public final boolean mo35l() {
        return this.f4008y0 && this.f8637R0 == null;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: m0 */
    public final void mo2909m0() {
        super.mo2909m0();
        this.f8649d1 = 0;
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: n */
    public final boolean mo37n() {
        boolean zMo37n = super.mo37n();
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            return ((c62) wd1Var.f12086n.f13368f.f2821b).m1141b(false);
        }
        if (zMo37n && (this.f3970P == null || this.f8640U0 == null || this.f8656k1)) {
            return true;
        }
        return this.f8632M0.m1141b(zMo37n);
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: o */
    public final void mo38o() {
        C1422sx c1422sx;
        C1290pc c1290pc = this.f8629J0;
        this.f8654i1 = null;
        this.f8661p1 = -9223372036854775807L;
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            ((c62) wd1Var.f12086n.f13368f.f2821b).m1143d(0);
        } else {
            this.f8632M0.m1143d(0);
        }
        m5110D0();
        this.f8643X0 = false;
        this.f8658m1 = null;
        int i = 1;
        try {
            super.mo38o();
            c1422sx = this.f3954C0;
            c1290pc.getClass();
            synchronized (c1422sx) {
            }
        } finally {
            c1422sx = this.f3954C0;
            c1290pc.getClass();
            synchronized (c1422sx) {
                Handler handler = c1290pc.f8839a;
                if (handler != null) {
                    handler.post(new i62(c1290pc, c1422sx, i));
                }
                c1290pc.m5250b(m62.f6671d);
            }
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: p */
    public final void mo39p(boolean z, boolean z2) {
        this.f3954C0 = new C1422sx();
        xk1 xk1Var = this.f5809d;
        xk1Var.getClass();
        boolean z3 = xk1Var.f12634b;
        ki0.m3864h((z3 && this.f8657l1 == 0) ? false : true);
        if (this.f8656k1 != z3) {
            this.f8656k1 = z3;
            m2908k0();
        }
        C1422sx c1422sx = this.f3954C0;
        C1290pc c1290pc = this.f8629J0;
        Handler handler = c1290pc.f8839a;
        if (handler != null) {
            handler.post(new h62(c1290pc, c1422sx, 4));
        }
        boolean z4 = this.f8638S0;
        c62 c62Var = this.f8632M0;
        if (!z4) {
            if (this.f8639T0 != null && this.f8637R0 == null) {
                ud1 ud1Var = new ud1(this.f8627H0, c62Var);
                xy1 xy1Var = this.f5812g;
                xy1Var.getClass();
                ud1Var.f11268f = xy1Var;
                ki0.m3864h(!ud1Var.f11269g);
                if (ud1Var.f11266d == null) {
                    if (ud1Var.f11265c == null) {
                        ud1Var.f11265c = new xd1();
                    }
                    ud1Var.f11266d = new yd1(ud1Var.f11265c);
                }
                zd1 zd1Var = new zd1(ud1Var);
                ud1Var.f11269g = true;
                this.f8637R0 = zd1Var.f13363a;
            }
            this.f8638S0 = true;
        }
        wd1 wd1Var = this.f8637R0;
        if (wd1Var == null) {
            xy1 xy1Var2 = this.f5812g;
            xy1Var2.getClass();
            c62Var.f1697k = xy1Var2;
            c62Var.f1690d = z2 ? 1 : 0;
            return;
        }
        wd1Var.f12084l = new pn0(this);
        wd1Var.f12085m = r20.f9658a;
        z52 z52Var = this.f8659n1;
        if (z52Var != null) {
            wd1Var.f12086n.f13372j = z52Var;
        }
        if (this.f8640U0 != null && !this.f8642W0.equals(gt1.f4318c)) {
            this.f8637R0.m6757h(this.f8640U0, this.f8642W0);
        }
        this.f8637R0.m6756g(this.f8645Z0);
        this.f8637R0.m6758i(this.f3968N);
        List list = this.f8639T0;
        if (list != null) {
            this.f8637R0.m6760k(list);
        }
        ((c62) this.f8637R0.f12086n.f13368f.f2821b).f1690d = z2 ? 1 : 0;
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: q */
    public final void mo40q(long j, boolean z) {
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            wd1Var.m6750a(true);
            wd1 wd1Var2 = this.f8637R0;
            f11 f11Var = this.f3956D0;
            wd1Var2.m6759j(f11Var.f3580b, f11Var.f3581c, -this.f8660o1, this.f5817q);
            this.f8662q1 = true;
        }
        super.mo40q(j, z);
        wd1 wd1Var3 = this.f8637R0;
        c62 c62Var = this.f8632M0;
        if (wd1Var3 == null) {
            f62 f62Var = c62Var.f1688b;
            f62Var.f3639m = 0L;
            f62Var.f3642p = -1L;
            f62Var.f3640n = -1L;
            c62Var.f1693g = -9223372036854775807L;
            c62Var.f1691e = -9223372036854775807L;
            c62Var.m1143d(1);
            c62Var.f1694h = -9223372036854775807L;
        }
        if (z) {
            wd1 wd1Var4 = this.f8637R0;
            if (wd1Var4 != null) {
                wd1Var4.m6753d(false);
            } else {
                c62Var.m1142c(false);
            }
        }
        m5110D0();
        this.f8648c1 = 0;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: q0 */
    public final boolean mo2913q0(c11 c11Var) {
        Surface surface = this.f8640U0;
        if (surface == null || !surface.isValid()) {
            return (z42.f13274a >= 35 && c11Var.f1621h) || m5112F0(c11Var);
        }
        return true;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: r */
    public final void mo41r() {
        wd1 wd1Var = this.f8637R0;
        if (wd1Var == null || !this.f8628I0) {
            return;
        }
        zd1 zd1Var = wd1Var.f12086n;
        if (zd1Var.f13376n == 2) {
            return;
        }
        zy1 zy1Var = zd1Var.f13373k;
        if (zy1Var != null) {
            zy1Var.f13615a.removeCallbacksAndMessages(null);
        }
        zd1Var.f13374l = null;
        zd1Var.f13376n = 2;
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: r0 */
    public final boolean mo2914r0(C1533vx c1533vx) {
        if (c1533vx.m4599i(67108864) && !m3832k() && !c1533vx.m4599i(536870912)) {
            long j = this.f8661p1;
            if (j != -9223372036854775807L && j - (c1533vx.f11797p - this.f3956D0.f3581c) > 100000 && !c1533vx.m4599i(1073741824) && c1533vx.f11797p < this.f5817q) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: s */
    public final void mo42s() {
        try {
            try {
                m2890G();
                m2908k0();
                ay0 ay0Var = this.f3964J;
                if (ay0Var != null) {
                    ay0Var.m763B(null);
                }
                this.f3964J = null;
                this.f8638S0 = false;
                this.f8660o1 = -9223372036854775807L;
                gd1 gd1Var = this.f8641V0;
                if (gd1Var != null) {
                    gd1Var.release();
                    this.f8641V0 = null;
                }
            } catch (Throwable th) {
                ay0 ay0Var2 = this.f3964J;
                if (ay0Var2 != null) {
                    ay0Var2.m763B(null);
                }
                this.f3964J = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.f8638S0 = false;
            this.f8660o1 = -9223372036854775807L;
            gd1 gd1Var2 = this.f8641V0;
            if (gd1Var2 != null) {
                gd1Var2.release();
                this.f8641V0 = null;
            }
            throw th2;
        }
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: t */
    public final void mo44t() {
        this.f8647b1 = 0;
        this.f5812g.getClass();
        this.f8646a1 = SystemClock.elapsedRealtime();
        this.f8650e1 = 0L;
        this.f8651f1 = 0;
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            ((c62) wd1Var.f12086n.f13368f.f2821b).m1144e();
        } else {
            this.f8632M0.m1144e();
        }
    }

    @Override // p000.g11
    /* JADX INFO: renamed from: t0 */
    public final int mo45t0(f40 f40Var, be0 be0Var) {
        boolean z;
        int i = 0;
        if (!v51.m6581k(be0Var.f1341n)) {
            return AbstractC0828kh.m3828f(0, 0, 0, 0);
        }
        boolean z2 = be0Var.f1345r != null;
        Context context = this.f8627H0;
        List listM5107z0 = m5107z0(context, f40Var, be0Var, z2, false);
        if (z2 && listM5107z0.isEmpty()) {
            listM5107z0 = m5107z0(context, f40Var, be0Var, false, false);
        }
        if (listM5107z0.isEmpty()) {
            return AbstractC0828kh.m3828f(1, 0, 0, 0);
        }
        int i2 = be0Var.f1326L;
        if (i2 != 0 && i2 != 2) {
            return AbstractC0828kh.m3828f(2, 0, 0, 0);
        }
        c11 c11Var = (c11) listM5107z0.get(0);
        boolean zM1109d = c11Var.m1109d(be0Var);
        if (!zM1109d) {
            int i3 = 1;
            while (true) {
                if (i3 >= listM5107z0.size()) {
                    z = true;
                    break;
                }
                c11 c11Var2 = (c11) listM5107z0.get(i3);
                if (c11Var2.m1109d(be0Var)) {
                    z = false;
                    zM1109d = true;
                    c11Var = c11Var2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = zM1109d ? 4 : 3;
        int i5 = c11Var.m1110e(be0Var) ? 16 : 8;
        int i6 = c11Var.f1620g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (z42.f13274a >= 26 && "video/dolby-vision".equals(be0Var.f1341n) && !ua0.m6459o(context)) {
            i7 = 256;
        }
        if (zM1109d) {
            List listM5107z1 = m5107z0(context, f40Var, be0Var, z2, true);
            if (!listM5107z1.isEmpty()) {
                HashMap map = m11.f6590a;
                ArrayList arrayList = new ArrayList(listM5107z1);
                Collections.sort(arrayList, new h11(new C1521vl(be0Var, 27), 0));
                c11 c11Var3 = (c11) arrayList.get(0);
                if (c11Var3.m1109d(be0Var) && c11Var3.m1110e(be0Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // p000.AbstractC0828kh
    /* JADX INFO: renamed from: u */
    public final void mo46u() {
        m5109C0();
        int i = this.f8651f1;
        if (i != 0) {
            long j = this.f8650e1;
            C1290pc c1290pc = this.f8629J0;
            Handler handler = c1290pc.f8839a;
            if (handler != null) {
                handler.post(new h62(c1290pc, j, i));
            }
            this.f8650e1 = 0L;
            this.f8651f1 = 0;
        }
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            ((c62) wd1Var.f12086n.f13368f.f2821b).m1145f();
        } else {
            this.f8632M0.m1145f();
        }
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: v */
    public final void mo2916v(be0[] be0VarArr, long j, long j2, q21 q21Var) {
        super.mo2916v(be0VarArr, j, j2, q21Var);
        if (this.f8660o1 == -9223372036854775807L) {
            this.f8660o1 = j;
        }
        t02 t02Var = this.f5821u;
        if (t02Var.m6176p()) {
            this.f8661p1 = -9223372036854775807L;
        } else {
            q21Var.getClass();
            this.f8661p1 = t02Var.mo2973g(q21Var.f9309a, new r02()).f9652d;
        }
    }

    @Override // p000.g11, p000.AbstractC0828kh
    /* JADX INFO: renamed from: x */
    public final void mo2919x(long j, long j2) throws t70 {
        super.mo2919x(j, j2);
        wd1 wd1Var = this.f8637R0;
        if (wd1Var != null) {
            try {
                wd1Var.m6755f(j, j2);
            } catch (l62 e) {
                throw m3830g(e, e.f6195a, false, 7001);
            }
        }
    }
}
