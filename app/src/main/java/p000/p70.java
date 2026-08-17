package p000;

import android.media.MediaMetadataRetriever;
import android.util.Log;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import com.example.ssmousepro.injection.LinuxInputConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p70 {

    /* JADX INFO: renamed from: C */
    public static final String[] f8746C;

    /* JADX INFO: renamed from: D */
    public static final int[] f8747D;

    /* JADX INFO: renamed from: E */
    public static final byte[] f8748E;

    /* JADX INFO: renamed from: F */
    public static final m70 f8749F;

    /* JADX INFO: renamed from: G */
    public static final m70[][] f8750G;

    /* JADX INFO: renamed from: H */
    public static final m70[] f8751H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f8752I;

    /* JADX INFO: renamed from: J */
    public static final HashMap[] f8753J;

    /* JADX INFO: renamed from: K */
    public static final HashSet f8754K;

    /* JADX INFO: renamed from: L */
    public static final HashMap f8755L;

    /* JADX INFO: renamed from: M */
    public static final Charset f8756M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f8757N;

    /* JADX INFO: renamed from: O */
    public static final byte[] f8758O;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f8775a;

    /* JADX INFO: renamed from: b */
    public int f8776b;

    /* JADX INFO: renamed from: c */
    public final HashMap[] f8777c;

    /* JADX INFO: renamed from: d */
    public final HashSet f8778d;

    /* JADX INFO: renamed from: e */
    public ByteOrder f8779e;

    /* JADX INFO: renamed from: f */
    public boolean f8780f;

    /* JADX INFO: renamed from: g */
    public int f8781g;

    /* JADX INFO: renamed from: h */
    public int f8782h;

    /* JADX INFO: renamed from: i */
    public int f8783i;

    /* JADX INFO: renamed from: j */
    public int f8784j;

    /* JADX INFO: renamed from: k */
    public static final boolean f8759k = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: l */
    public static final List f8760l = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: m */
    public static final List f8761m = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: n */
    public static final int[] f8762n = {8, 8, 8};

    /* JADX INFO: renamed from: o */
    public static final int[] f8763o = {8};

    /* JADX INFO: renamed from: p */
    public static final byte[] f8764p = {-1, -40, -1};

    /* JADX INFO: renamed from: q */
    public static final byte[] f8765q = {102, 116, 121, 112};

    /* JADX INFO: renamed from: r */
    public static final byte[] f8766r = {109, 105, 102, 49};

    /* JADX INFO: renamed from: s */
    public static final byte[] f8767s = {104, 101, 105, 99};

    /* JADX INFO: renamed from: t */
    public static final byte[] f8768t = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: u */
    public static final byte[] f8769u = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: v */
    public static final byte[] f8770v = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: w */
    public static final byte[] f8771w = {101, 88, 73, 102};

    /* JADX INFO: renamed from: x */
    public static final byte[] f8772x = {73, 72, 68, 82};

    /* JADX INFO: renamed from: y */
    public static final byte[] f8773y = {73, 69, 78, 68};

    /* JADX INFO: renamed from: z */
    public static final byte[] f8774z = {82, 73, 70, 70};

    /* JADX INFO: renamed from: A */
    public static final byte[] f8744A = {87, 69, 66, 80};

    /* JADX INFO: renamed from: B */
    public static final byte[] f8745B = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f8746C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f8747D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f8748E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        m70[] m70VarArr = {new m70("NewSubfileType", 254, 4), new m70("SubfileType", 255, 4), new m70("ImageWidth", 256, 3, 4), new m70("ImageLength", 257, 3, 4), new m70("BitsPerSample", 258, 3), new m70("Compression", 259, 3), new m70("PhotometricInterpretation", 262, 3), new m70("ImageDescription", 270, 2), new m70("Make", 271, 2), new m70("Model", LinuxInputConstants.BTN_MOUSE, 2), new m70("StripOffsets", 273, 3, 4), new m70("Orientation", 274, 3), new m70("SamplesPerPixel", 277, 3), new m70("RowsPerStrip", 278, 3, 4), new m70("StripByteCounts", 279, 3, 4), new m70("XResolution", 282, 5), new m70("YResolution", 283, 5), new m70("PlanarConfiguration", 284, 3), new m70("ResolutionUnit", 296, 3), new m70("TransferFunction", 301, 3), new m70("Software", 305, 2), new m70("DateTime", 306, 2), new m70("Artist", 315, 2), new m70("WhitePoint", InjectionDaemonManager.DAEMON_VERSION, 5), new m70("PrimaryChromaticities", 319, 5), new m70("SubIFDPointer", LinuxInputConstants.BTN_TOUCH, 4), new m70("JPEGInterchangeFormat", 513, 4), new m70("JPEGInterchangeFormatLength", 514, 4), new m70("YCbCrCoefficients", 529, 5), new m70("YCbCrSubSampling", 530, 3), new m70("YCbCrPositioning", 531, 3), new m70("ReferenceBlackWhite", 532, 5), new m70("Copyright", 33432, 2), new m70("ExifIFDPointer", 34665, 4), new m70("GPSInfoIFDPointer", 34853, 4), new m70("SensorTopBorder", 4, 4), new m70("SensorLeftBorder", 5, 4), new m70("SensorBottomBorder", 6, 4), new m70("SensorRightBorder", 7, 4), new m70("ISO", 23, 3), new m70("JpgFromRaw", 46, 7), new m70("Xmp", 700, 1)};
        m70[] m70VarArr2 = {new m70("ExposureTime", 33434, 5), new m70("FNumber", 33437, 5), new m70("ExposureProgram", 34850, 3), new m70("SpectralSensitivity", 34852, 2), new m70("PhotographicSensitivity", 34855, 3), new m70("OECF", 34856, 7), new m70("SensitivityType", 34864, 3), new m70("StandardOutputSensitivity", 34865, 4), new m70("RecommendedExposureIndex", 34866, 4), new m70("ISOSpeed", 34867, 4), new m70("ISOSpeedLatitudeyyy", 34868, 4), new m70("ISOSpeedLatitudezzz", 34869, 4), new m70("ExifVersion", 36864, 2), new m70("DateTimeOriginal", 36867, 2), new m70("DateTimeDigitized", 36868, 2), new m70("OffsetTime", 36880, 2), new m70("OffsetTimeOriginal", 36881, 2), new m70("OffsetTimeDigitized", 36882, 2), new m70("ComponentsConfiguration", 37121, 7), new m70("CompressedBitsPerPixel", 37122, 5), new m70("ShutterSpeedValue", 37377, 10), new m70("ApertureValue", 37378, 5), new m70("BrightnessValue", 37379, 10), new m70("ExposureBiasValue", 37380, 10), new m70("MaxApertureValue", 37381, 5), new m70("SubjectDistance", 37382, 5), new m70("MeteringMode", 37383, 3), new m70("LightSource", 37384, 3), new m70("Flash", 37385, 3), new m70("FocalLength", 37386, 5), new m70("SubjectArea", 37396, 3), new m70("MakerNote", 37500, 7), new m70("UserComment", 37510, 7), new m70("SubSecTime", 37520, 2), new m70("SubSecTimeOriginal", 37521, 2), new m70("SubSecTimeDigitized", 37522, 2), new m70("FlashpixVersion", 40960, 7), new m70("ColorSpace", 40961, 3), new m70("PixelXDimension", 40962, 3, 4), new m70("PixelYDimension", 40963, 3, 4), new m70("RelatedSoundFile", 40964, 2), new m70("InteroperabilityIFDPointer", 40965, 4), new m70("FlashEnergy", 41483, 5), new m70("SpatialFrequencyResponse", 41484, 7), new m70("FocalPlaneXResolution", 41486, 5), new m70("FocalPlaneYResolution", 41487, 5), new m70("FocalPlaneResolutionUnit", 41488, 3), new m70("SubjectLocation", 41492, 3), new m70("ExposureIndex", 41493, 5), new m70("SensingMethod", 41495, 3), new m70("FileSource", 41728, 7), new m70("SceneType", 41729, 7), new m70("CFAPattern", 41730, 7), new m70("CustomRendered", 41985, 3), new m70("ExposureMode", 41986, 3), new m70("WhiteBalance", 41987, 3), new m70("DigitalZoomRatio", 41988, 5), new m70("FocalLengthIn35mmFilm", 41989, 3), new m70("SceneCaptureType", 41990, 3), new m70("GainControl", 41991, 3), new m70("Contrast", 41992, 3), new m70("Saturation", 41993, 3), new m70("Sharpness", 41994, 3), new m70("DeviceSettingDescription", 41995, 7), new m70("SubjectDistanceRange", 41996, 3), new m70("ImageUniqueID", 42016, 2), new m70("CameraOwnerName", 42032, 2), new m70("BodySerialNumber", 42033, 2), new m70("LensSpecification", 42034, 5), new m70("LensMake", 42035, 2), new m70("LensModel", 42036, 2), new m70("Gamma", 42240, 5), new m70("DNGVersion", 50706, 1), new m70("DefaultCropSize", 50720, 3, 4)};
        m70[] m70VarArr3 = {new m70("GPSVersionID", 0, 1), new m70("GPSLatitudeRef", 1, 2), new m70("GPSLatitude", 2, 5, 10), new m70("GPSLongitudeRef", 3, 2), new m70("GPSLongitude", 4, 5, 10), new m70("GPSAltitudeRef", 5, 1), new m70("GPSAltitude", 6, 5), new m70("GPSTimeStamp", 7, 5), new m70("GPSSatellites", 8, 2), new m70("GPSStatus", 9, 2), new m70("GPSMeasureMode", 10, 2), new m70("GPSDOP", 11, 5), new m70("GPSSpeedRef", 12, 2), new m70("GPSSpeed", 13, 5), new m70("GPSTrackRef", 14, 2), new m70("GPSTrack", 15, 5), new m70("GPSImgDirectionRef", 16, 2), new m70("GPSImgDirection", 17, 5), new m70("GPSMapDatum", 18, 2), new m70("GPSDestLatitudeRef", 19, 2), new m70("GPSDestLatitude", 20, 5), new m70("GPSDestLongitudeRef", 21, 2), new m70("GPSDestLongitude", 22, 5), new m70("GPSDestBearingRef", 23, 2), new m70("GPSDestBearing", 24, 5), new m70("GPSDestDistanceRef", 25, 2), new m70("GPSDestDistance", 26, 5), new m70("GPSProcessingMethod", 27, 7), new m70("GPSAreaInformation", 28, 7), new m70("GPSDateStamp", 29, 2), new m70("GPSDifferential", 30, 3), new m70("GPSHPositioningError", 31, 5)};
        m70[] m70VarArr4 = {new m70("InteroperabilityIndex", 1, 2)};
        m70[] m70VarArr5 = {new m70("NewSubfileType", 254, 4), new m70("SubfileType", 255, 4), new m70("ThumbnailImageWidth", 256, 3, 4), new m70("ThumbnailImageLength", 257, 3, 4), new m70("BitsPerSample", 258, 3), new m70("Compression", 259, 3), new m70("PhotometricInterpretation", 262, 3), new m70("ImageDescription", 270, 2), new m70("Make", 271, 2), new m70("Model", LinuxInputConstants.BTN_MOUSE, 2), new m70("StripOffsets", 273, 3, 4), new m70("ThumbnailOrientation", 274, 3), new m70("SamplesPerPixel", 277, 3), new m70("RowsPerStrip", 278, 3, 4), new m70("StripByteCounts", 279, 3, 4), new m70("XResolution", 282, 5), new m70("YResolution", 283, 5), new m70("PlanarConfiguration", 284, 3), new m70("ResolutionUnit", 296, 3), new m70("TransferFunction", 301, 3), new m70("Software", 305, 2), new m70("DateTime", 306, 2), new m70("Artist", 315, 2), new m70("WhitePoint", InjectionDaemonManager.DAEMON_VERSION, 5), new m70("PrimaryChromaticities", 319, 5), new m70("SubIFDPointer", LinuxInputConstants.BTN_TOUCH, 4), new m70("JPEGInterchangeFormat", 513, 4), new m70("JPEGInterchangeFormatLength", 514, 4), new m70("YCbCrCoefficients", 529, 5), new m70("YCbCrSubSampling", 530, 3), new m70("YCbCrPositioning", 531, 3), new m70("ReferenceBlackWhite", 532, 5), new m70("Copyright", 33432, 2), new m70("ExifIFDPointer", 34665, 4), new m70("GPSInfoIFDPointer", 34853, 4), new m70("DNGVersion", 50706, 1), new m70("DefaultCropSize", 50720, 3, 4)};
        f8749F = new m70("StripOffsets", 273, 3);
        f8750G = new m70[][]{m70VarArr, m70VarArr2, m70VarArr3, m70VarArr4, m70VarArr5, m70VarArr, new m70[]{new m70("ThumbnailImage", 256, 7), new m70("CameraSettingsIFDPointer", 8224, 4), new m70("ImageProcessingIFDPointer", 8256, 4)}, new m70[]{new m70("PreviewImageStart", 257, 4), new m70("PreviewImageLength", 258, 4)}, new m70[]{new m70("AspectFrame", 4371, 3)}, new m70[]{new m70("ColorSpace", 55, 3)}};
        f8751H = new m70[]{new m70("SubIFDPointer", LinuxInputConstants.BTN_TOUCH, 4), new m70("ExifIFDPointer", 34665, 4), new m70("GPSInfoIFDPointer", 34853, 4), new m70("InteroperabilityIFDPointer", 40965, 4), new m70("CameraSettingsIFDPointer", 8224, 1), new m70("ImageProcessingIFDPointer", 8256, 1)};
        f8752I = new HashMap[10];
        f8753J = new HashMap[10];
        f8754K = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f8755L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f8756M = charsetForName;
        f8757N = "Exif\u0000\u0000".getBytes(charsetForName);
        f8758O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            m70[][] m70VarArr6 = f8750G;
            if (i >= m70VarArr6.length) {
                HashMap map = f8755L;
                m70[] m70VarArr7 = f8751H;
                map.put(Integer.valueOf(m70VarArr7[0].f6678a), 5);
                map.put(Integer.valueOf(m70VarArr7[1].f6678a), 1);
                map.put(Integer.valueOf(m70VarArr7[2].f6678a), 2);
                map.put(Integer.valueOf(m70VarArr7[3].f6678a), 3);
                map.put(Integer.valueOf(m70VarArr7[4].f6678a), 7);
                map.put(Integer.valueOf(m70VarArr7[5].f6678a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f8752I[i] = new HashMap();
            f8753J[i] = new HashMap();
            for (m70 m70Var : m70VarArr6[i]) {
                f8752I[i].put(Integer.valueOf(m70Var.f6678a), m70Var);
                f8753J[i].put(m70Var.f6679b, m70Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:12:0x0037, B:18:0x0054, B:20:0x005f, B:28:0x0075, B:23:0x0066, B:26:0x006e, B:27:0x0072, B:29:0x007f, B:31:0x0088, B:33:0x008e, B:35:0x0094, B:37:0x009a, B:42:0x00a8), top: B:52:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public p70(ByteArrayInputStream byteArrayInputStream) throws Throwable {
        m70[][] m70VarArr = f8750G;
        this.f8777c = new HashMap[m70VarArr.length];
        this.f8778d = new HashSet(m70VarArr.length);
        this.f8779e = ByteOrder.BIG_ENDIAN;
        this.f8775a = null;
        boolean z = f8759k;
        for (int i = 0; i < m70VarArr.length; i++) {
            try {
                try {
                    this.f8777c[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m5205a();
                    if (!z) {
                        return;
                    }
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m5205a();
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m5205a();
                if (z) {
                    m5220p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int iM5210f = m5210f(bufferedInputStream);
        this.f8776b = iM5210f;
        if (iM5210f == 4 || iM5210f == 9 || iM5210f == 13 || iM5210f == 14) {
            k70 k70Var = new k70(bufferedInputStream);
            int i2 = this.f8776b;
            if (i2 == 4) {
                m5209e(k70Var, 0, 0);
            } else if (i2 == 13) {
                m5212h(k70Var);
            } else if (i2 == 9) {
                m5213i(k70Var);
            } else if (i2 == 14) {
                m5216l(k70Var);
            }
        } else {
            o70 o70Var = new o70(bufferedInputStream);
            int i3 = this.f8776b;
            if (i3 == 12) {
                m5208d(o70Var);
            } else if (i3 == 7) {
                m5211g(o70Var);
            } else if (i3 == 10) {
                m5215k(o70Var);
            } else {
                m5214j(o70Var);
            }
            o70Var.m4717d(this.f8781g);
            m5224u(o70Var);
        }
        m5205a();
        if (!z) {
            return;
        }
        m5220p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m5204q(k70 k70Var) throws IOException {
        short s = k70Var.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        lv1.m4305q(Integer.toHexString(s), "Invalid byte order: ");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5205a() {
        String strM5206b = m5206b("DateTimeOriginal");
        HashMap[] mapArr = this.f8777c;
        if (strM5206b != null && m5206b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM5206b.concat("\u0000").getBytes(f8756M);
            map.put("DateTime", new l70(2, bytes.length, bytes));
        }
        if (m5206b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", l70.m4068a(0L, this.f8779e));
        }
        if (m5206b("ImageLength") == null) {
            mapArr[0].put("ImageLength", l70.m4068a(0L, this.f8779e));
        }
        if (m5206b("Orientation") == null) {
            mapArr[0].put("Orientation", l70.m4068a(0L, this.f8779e));
        }
        if (m5206b("LightSource") == null) {
            mapArr[1].put("LightSource", l70.m4068a(0L, this.f8779e));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m5206b(String str) {
        l70 l70VarM5207c = m5207c(str);
        if (l70VarM5207c != null) {
            int i = l70VarM5207c.f6202a;
            if (!f8754K.contains(str)) {
                return l70VarM5207c.m4073f(this.f8779e);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                n70[] n70VarArr = (n70[]) l70VarM5207c.m4074g(this.f8779e);
                if (n70VarArr == null || n70VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(n70VarArr));
                    return null;
                }
                n70 n70Var = n70VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (n70Var.f7300a / n70Var.f7301b));
                n70 n70Var2 = n70VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (n70Var2.f7300a / n70Var2.f7301b));
                n70 n70Var3 = n70VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (n70Var3.f7300a / n70Var3.f7301b)));
            }
            try {
                return Double.toString(l70VarM5207c.m4071d(this.f8779e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final l70 m5207c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f8750G.length; i++) {
            l70 l70Var = (l70) this.f8777c[i].get(str);
            if (l70Var != null) {
                return l70Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5208d(o70 o70Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                r70.m5740a(mediaMetadataRetriever, new j70(o70Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f8777c;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", l70.m4070c(Integer.parseInt(strExtractMetadata), this.f8779e));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", l70.m4070c(Integer.parseInt(strExtractMetadata2), this.f8779e));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", l70.m4070c(i, this.f8779e));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    o70Var.m4717d(i3);
                    byte[] bArr = new byte[6];
                    if (o70Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f8757N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (o70Var.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f8781g = i5;
                    m5221r(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0103 A[LOOP:2: B:69:0x00f9->B:74:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a A[LOOP:0: B:10:0x0024->B:82:0x014a, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m5209e(p000.k70 r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p70.m5209e(k70, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155 A[LOOP:3: B:113:0x0149->B:118:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x015f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169 A[LOOP:4: B:120:0x015a->B:125:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x016f A[LOOP:2: B:108:0x013c->B:128:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0168 A[EDGE_INSN: B:160:0x0168->B:124:0x0168 BREAK  A[LOOP:3: B:113:0x0149->B:118:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0168 A[EDGE_INSN: B:162:0x0168->B:124:0x0168 BREAK  A[LOOP:3: B:113:0x0149->B:118:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX INFO: renamed from: f */
    public final int m5210f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        k70 k70Var;
        k70 k70Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        k70 k70Var3;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f8764p;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    if (bArr4[i8] != bytes[i8]) {
                        k70 k70Var4 = null;
                        try {
                            k70Var = new k70(bArr4);
                            try {
                                try {
                                    try {
                                        try {
                                            long j2 = k70Var.readInt();
                                            byte[] bArr6 = new byte[4];
                                            k70Var.read(bArr6);
                                            if (Arrays.equals(bArr6, f8765q)) {
                                                if (j2 == 1) {
                                                    j2 = k70Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z = false;
                                                    boolean z2 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (k70Var.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, f8766r)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr7, f8767s)) {
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    k70Var.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception unused) {
                                                            if (k70Var != null) {
                                                                break;
                                                            }
                                                            k70Var2 = new k70(bArr4);
                                                            ByteOrder byteOrderM5204q = m5204q(k70Var2);
                                                            this.f8779e = byteOrderM5204q;
                                                            k70Var2.f5689b = byteOrderM5204q;
                                                            s = k70Var2.readShort();
                                                            if (s != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            k70Var2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                k70Var3 = new k70(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM5204q2 = m5204q(k70Var3);
                                                                    this.f8779e = byteOrderM5204q2;
                                                                    k70Var3.f5689b = byteOrderM5204q2;
                                                                    i3 = k70Var3.readShort() != 85 ? i : 1;
                                                                    k70Var3.close();
                                                                } catch (Exception unused2) {
                                                                    k70Var4 = k70Var3;
                                                                    if (k70Var4 != null) {
                                                                        k70Var4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    k70Var4 = k70Var3;
                                                                    if (k70Var4 != null) {
                                                                        k70Var4.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused3) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = f8770v;
                                                                if (i4 >= bArr.length) {
                                                                    return 13;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    while (true) {
                                                                        bArr2 = f8774z;
                                                                        if (i5 >= bArr2.length) {
                                                                            i6 = i;
                                                                            while (true) {
                                                                                bArr3 = f8744A;
                                                                                if (i6 >= bArr3.length) {
                                                                                    return 14;
                                                                                }
                                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                                    break;
                                                                                }
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    return i;
                                                                }
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                    k70Var.close();
                                                    k70Var2 = new k70(bArr4);
                                                    ByteOrder byteOrderM5204q3 = m5204q(k70Var2);
                                                    this.f8779e = byteOrderM5204q3;
                                                    k70Var2.f5689b = byteOrderM5204q3;
                                                    s = k70Var2.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    k70Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    k70Var3 = new k70(bArr4);
                                                    ByteOrder byteOrderM5204q4 = m5204q(k70Var3);
                                                    this.f8779e = byteOrderM5204q4;
                                                    k70Var3.f5689b = byteOrderM5204q4;
                                                    if (k70Var3.readShort() != 85) {
                                                    }
                                                    k70Var3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f8770v;
                                                        if (i4 >= bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = f8774z;
                                                                if (i5 >= bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = f8744A;
                                                                        if (i6 >= bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                            }
                                            k70Var.close();
                                            i = 0;
                                        } catch (Exception unused4) {
                                            i = 0;
                                        }
                                        ByteOrder byteOrderM5204q5 = m5204q(k70Var2);
                                        this.f8779e = byteOrderM5204q5;
                                        k70Var2.f5689b = byteOrderM5204q5;
                                        s = k70Var2.readShort();
                                        if (s != 20306) {
                                            i2 = 1;
                                        } else {
                                            i2 = 1;
                                        }
                                        k70Var2.close();
                                    } catch (Exception unused5) {
                                        if (k70Var2 != null) {
                                            k70Var2.close();
                                        }
                                        i2 = i;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        k70Var4 = k70Var2;
                                        if (k70Var4 != null) {
                                            k70Var4.close();
                                        }
                                        throw th;
                                    }
                                    k70Var2 = new k70(bArr4);
                                } catch (Exception unused6) {
                                    k70Var2 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (i2 != 0) {
                                    return 7;
                                }
                                k70Var3 = new k70(bArr4);
                                ByteOrder byteOrderM5204q6 = m5204q(k70Var3);
                                this.f8779e = byteOrderM5204q6;
                                k70Var3.f5689b = byteOrderM5204q6;
                                if (k70Var3.readShort() != 85) {
                                }
                                k70Var3.close();
                                if (i3 != 0) {
                                    return 10;
                                }
                                i4 = i;
                                while (true) {
                                    bArr = f8770v;
                                    if (i4 >= bArr.length) {
                                        return 13;
                                    }
                                    if (bArr4[i4] != bArr[i4]) {
                                        i5 = i;
                                        while (true) {
                                            bArr2 = f8774z;
                                            if (i5 >= bArr2.length) {
                                                i6 = i;
                                                while (true) {
                                                    bArr3 = f8744A;
                                                    if (i6 >= bArr3.length) {
                                                        return 14;
                                                    }
                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                        break;
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                            } else {
                                                if (bArr4[i5] != bArr2[i5]) {
                                                    break;
                                                    break;
                                                }
                                                i5++;
                                            }
                                        }
                                        return i;
                                    }
                                    i4++;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                k70Var4 = k70Var;
                                if (k70Var4 != null) {
                                    k70Var4.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            i = 0;
                            k70Var = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5211g(o70 o70Var) throws IOException {
        int i;
        int i2;
        m5214j(o70Var);
        HashMap[] mapArr = this.f8777c;
        l70 l70Var = (l70) mapArr[1].get("MakerNote");
        if (l70Var != null) {
            o70 o70Var2 = new o70(l70Var.f6205d);
            o70Var2.f5689b = this.f8779e;
            byte[] bArr = f8768t;
            byte[] bArr2 = new byte[bArr.length];
            o70Var2.readFully(bArr2);
            o70Var2.m4717d(0L);
            byte[] bArr3 = f8769u;
            byte[] bArr4 = new byte[bArr3.length];
            o70Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                o70Var2.m4717d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                o70Var2.m4717d(12L);
            }
            m5222s(o70Var2, 6);
            l70 l70Var2 = (l70) mapArr[7].get("PreviewImageStart");
            l70 l70Var3 = (l70) mapArr[7].get("PreviewImageLength");
            if (l70Var2 != null && l70Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", l70Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", l70Var3);
            }
            l70 l70Var4 = (l70) mapArr[8].get("AspectFrame");
            if (l70Var4 != null) {
                int[] iArr = (int[]) l70Var4.m4074g(this.f8779e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                l70 l70VarM4070c = l70.m4070c(i5, this.f8779e);
                l70 l70VarM4070c2 = l70.m4070c(i6, this.f8779e);
                mapArr[0].put("ImageWidth", l70VarM4070c);
                mapArr[0].put("ImageLength", l70VarM4070c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5212h(k70 k70Var) throws IOException {
        if (f8759k) {
            Objects.toString(k70Var);
        }
        k70Var.f5689b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f8770v;
        k70Var.m3809c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = k70Var.readInt();
                byte[] bArr2 = new byte[4];
                if (k70Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f8772x)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f8773y)) {
                    return;
                }
                if (Arrays.equals(bArr2, f8771w)) {
                    byte[] bArr3 = new byte[i];
                    if (k70Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ki0.m3855b(bArr2));
                    }
                    int i3 = k70Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f8781g = i2;
                        m5221r(0, bArr3);
                        m5227x();
                        m5224u(new k70(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                k70Var.m3809c(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                ca0.m1178j("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5213i(k70 k70Var) throws IOException {
        if (f8759k) {
            Objects.toString(k70Var);
        }
        k70Var.m3809c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        k70Var.read(bArr);
        k70Var.read(bArr2);
        k70Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        k70Var.m3809c(i - k70Var.f5690c);
        k70Var.read(bArr4);
        m5209e(new k70(bArr4), i, 5);
        k70Var.m3809c(i3 - k70Var.f5690c);
        k70Var.f5689b = ByteOrder.BIG_ENDIAN;
        int i4 = k70Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = k70Var.readUnsignedShort();
            int unsignedShort2 = k70Var.readUnsignedShort();
            if (unsignedShort == f8749F.f6678a) {
                short s = k70Var.readShort();
                short s2 = k70Var.readShort();
                l70 l70VarM4070c = l70.m4070c(s, this.f8779e);
                l70 l70VarM4070c2 = l70.m4070c(s2, this.f8779e);
                HashMap[] mapArr = this.f8777c;
                mapArr[0].put("ImageLength", l70VarM4070c);
                mapArr[0].put("ImageWidth", l70VarM4070c2);
                return;
            }
            k70Var.m3809c(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5214j(o70 o70Var) throws IOException {
        m5219o(o70Var);
        m5222s(o70Var, 0);
        m5226w(o70Var, 0);
        m5226w(o70Var, 5);
        m5226w(o70Var, 4);
        m5227x();
        if (this.f8776b == 8) {
            HashMap[] mapArr = this.f8777c;
            l70 l70Var = (l70) mapArr[1].get("MakerNote");
            if (l70Var != null) {
                o70 o70Var2 = new o70(l70Var.f6205d);
                o70Var2.f5689b = this.f8779e;
                o70Var2.m3809c(6);
                m5222s(o70Var2, 9);
                l70 l70Var2 = (l70) mapArr[9].get("ColorSpace");
                if (l70Var2 != null) {
                    mapArr[1].put("ColorSpace", l70Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5215k(o70 o70Var) throws IOException {
        if (f8759k) {
            Objects.toString(o70Var);
        }
        m5214j(o70Var);
        HashMap[] mapArr = this.f8777c;
        l70 l70Var = (l70) mapArr[0].get("JpgFromRaw");
        if (l70Var != null) {
            m5209e(new k70(l70Var.f6205d), (int) l70Var.f6204c, 5);
        }
        l70 l70Var2 = (l70) mapArr[0].get("ISO");
        l70 l70Var3 = (l70) mapArr[1].get("PhotographicSensitivity");
        if (l70Var2 == null || l70Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", l70Var2);
    }

    /* JADX INFO: renamed from: l */
    public final void m5216l(k70 k70Var) throws IOException {
        if (f8759k) {
            Objects.toString(k70Var);
        }
        k70Var.f5689b = ByteOrder.LITTLE_ENDIAN;
        k70Var.m3809c(f8774z.length);
        int i = k70Var.readInt() + 8;
        byte[] bArr = f8744A;
        k70Var.m3809c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (k70Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = k70Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f8745B, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (k70Var.read(bArr3) == i2) {
                        this.f8781g = i3;
                        m5221r(0, bArr3);
                        m5224u(new k70(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ki0.m3855b(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                k70Var.m3809c(i2);
            } catch (EOFException unused) {
                ca0.m1178j("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5217m(k70 k70Var, HashMap map) throws IOException {
        l70 l70Var = (l70) map.get("JPEGInterchangeFormat");
        l70 l70Var2 = (l70) map.get("JPEGInterchangeFormatLength");
        if (l70Var == null || l70Var2 == null) {
            return;
        }
        int iM4072e = l70Var.m4072e(this.f8779e);
        int iM4072e2 = l70Var2.m4072e(this.f8779e);
        if (this.f8776b == 7) {
            iM4072e += this.f8782h;
        }
        if (iM4072e <= 0 || iM4072e2 <= 0 || this.f8775a != null) {
            return;
        }
        k70Var.skip(iM4072e);
        k70Var.read(new byte[iM4072e2]);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5218n(HashMap map) {
        l70 l70Var = (l70) map.get("ImageLength");
        l70 l70Var2 = (l70) map.get("ImageWidth");
        if (l70Var == null || l70Var2 == null) {
            return false;
        }
        return l70Var.m4072e(this.f8779e) <= 512 && l70Var2.m4072e(this.f8779e) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m5219o(o70 o70Var) throws IOException {
        ByteOrder byteOrderM5204q = m5204q(o70Var);
        this.f8779e = byteOrderM5204q;
        o70Var.f5689b = byteOrderM5204q;
        int unsignedShort = o70Var.readUnsignedShort();
        int i = this.f8776b;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            lv1.m4305q(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = o70Var.readInt();
        if (i2 < 8) {
            ca0.m1178j(jd0.m3609g(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            o70Var.m3809c(i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5220p() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f8777c;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                l70 l70Var = (l70) entry.getValue();
                l70Var.toString();
                l70Var.m4073f(this.f8779e);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5221r(int i, byte[] bArr) throws IOException {
        o70 o70Var = new o70(bArr);
        m5219o(o70Var);
        m5222s(o70Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX INFO: renamed from: s */
    public final void m5222s(o70 o70Var, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        HashMap[] mapArr2;
        m70 m70Var;
        long j;
        int i2;
        boolean z2;
        HashMap[] mapArr3;
        m70 m70Var2;
        int unsignedShort;
        long j2;
        Integer numValueOf = Integer.valueOf(o70Var.f5690c);
        HashSet hashSet = this.f8778d;
        hashSet.add(numValueOf);
        short s = o70Var.readShort();
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z = f8759k;
            mapArr = this.f8777c;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = o70Var.readUnsignedShort();
            int unsignedShort3 = o70Var.readUnsignedShort();
            int i3 = o70Var.readInt();
            short s3 = s2;
            long j3 = ((long) o70Var.f5690c) + 4;
            m70 m70Var3 = (m70) f8752I[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), m70Var3 != null ? m70Var3.f6679b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (m70Var3 != null && unsignedShort3 > 0) {
                int[] iArr = f8747D;
                if (unsignedShort3 < iArr.length) {
                    int i4 = m70Var3.f6680c;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = m70Var3.f6681d) == unsignedShort3 || (((i4 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i4 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i4 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i4;
                        }
                        mapArr2 = mapArr;
                        m70Var = m70Var3;
                        j = ((long) i3) * ((long) iArr[unsignedShort3]);
                        z2 = j >= 0 && j <= 2147483647L;
                    } else {
                        if (z != 0) {
                            String str = f8746C[unsignedShort3];
                        }
                        m70Var = m70Var3;
                        mapArr2 = mapArr;
                        j = 0;
                    }
                } else {
                    m70Var = m70Var3;
                    mapArr2 = mapArr;
                    j = 0;
                }
            } else {
                m70Var = m70Var3;
                mapArr2 = mapArr;
                j = 0;
            }
            if (z2) {
                if (j > 4) {
                    int i5 = o70Var.readInt();
                    if (this.f8776b == 7) {
                        mapArr3 = mapArr2;
                        m70Var2 = m70Var;
                        if ("MakerNote".equals(m70Var2.f6679b)) {
                            this.f8782h = i5;
                        } else {
                            if (i == 6 && "ThumbnailImage".equals(m70Var2.f6679b)) {
                                this.f8783i = i5;
                                this.f8784j = i3;
                                l70 l70VarM4070c = l70.m4070c(6, this.f8779e);
                                unsignedShort2 = unsignedShort2;
                                l70 l70VarM4068a = l70.m4068a(this.f8783i, this.f8779e);
                                l70 l70VarM4068a2 = l70.m4068a(this.f8784j, this.f8779e);
                                mapArr3[4].put("Compression", l70VarM4070c);
                                mapArr3[4].put("JPEGInterchangeFormat", l70VarM4068a);
                                mapArr3[4].put("JPEGInterchangeFormatLength", l70VarM4068a2);
                            }
                            o70Var.m4717d(i5);
                        }
                    } else {
                        mapArr3 = mapArr2;
                        m70Var2 = m70Var;
                    }
                    o70Var.m4717d(i5);
                } else {
                    mapArr3 = mapArr2;
                    unsignedShort2 = unsignedShort2;
                    m70Var2 = m70Var;
                    i3 = i3;
                }
                Integer num = (Integer) f8755L.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) o70Var.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = o70Var.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = o70Var.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), m70Var2.f6679b);
                        }
                        if (j2 > 0 && !hashSet.contains(Integer.valueOf((int) j2))) {
                            o70Var.m4717d(j2);
                            m5222s(o70Var, num.intValue());
                        }
                        o70Var.m4717d(j3);
                    } else {
                        unsignedShort = o70Var.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), m70Var2.f6679b);
                    }
                    if (j2 > 0) {
                        o70Var.m4717d(j2);
                        m5222s(o70Var, num.intValue());
                    }
                    o70Var.m4717d(j3);
                } else {
                    int i6 = o70Var.f5690c + this.f8781g;
                    byte[] bArr = new byte[(int) j];
                    o70Var.readFully(bArr);
                    l70 l70Var = new l70(i6, bArr, unsignedShort3, i3);
                    HashMap map = mapArr3[i];
                    String str2 = m70Var2.f6679b;
                    map.put(str2, l70Var);
                    if ("DNGVersion".equals(str2)) {
                        this.f8776b = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && l70Var.m4073f(this.f8779e).contains("PENTAX")) || ("Compression".equals(str2) && l70Var.m4072e(this.f8779e) == 65535)) {
                        this.f8776b = 8;
                    }
                    if (o70Var.f5690c != j3) {
                        o70Var.m4717d(j3);
                    }
                }
            } else {
                o70Var.m4717d(j3);
            }
            s2 = (short) (s3 + 1);
            s = s;
        }
        int i7 = o70Var.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j4 = i7;
        if (j4 <= 0 || hashSet.contains(Integer.valueOf(i7))) {
            return;
        }
        o70Var.m4717d(j4);
        if (mapArr[4].isEmpty()) {
            m5222s(o70Var, 4);
        } else if (mapArr[5].isEmpty()) {
            m5222s(o70Var, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5223t(int i, String str, String str2) {
        HashMap[] mapArr = this.f8777c;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m5224u(k70 k70Var) throws IOException {
        l70 l70Var;
        HashMap map = this.f8777c[4];
        l70 l70Var2 = (l70) map.get("Compression");
        if (l70Var2 == null) {
            m5217m(k70Var, map);
            return;
        }
        int iM4072e = l70Var2.m4072e(this.f8779e);
        if (iM4072e != 1) {
            if (iM4072e == 6) {
                m5217m(k70Var, map);
                return;
            } else if (iM4072e != 7) {
                return;
            }
        }
        l70 l70Var3 = (l70) map.get("BitsPerSample");
        if (l70Var3 != null) {
            int[] iArr = (int[]) l70Var3.m4074g(this.f8779e);
            int[] iArr2 = f8762n;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f8776b != 3 || (l70Var = (l70) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM4072e2 = l70Var.m4072e(this.f8779e);
                if ((iM4072e2 != 1 || !Arrays.equals(iArr, f8763o)) && (iM4072e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            l70 l70Var4 = (l70) map.get("StripOffsets");
            l70 l70Var5 = (l70) map.get("StripByteCounts");
            if (l70Var4 == null || l70Var5 == null) {
                return;
            }
            long[] jArrM3872r = ki0.m3872r(l70Var4.m4074g(this.f8779e));
            long[] jArrM3872r2 = ki0.m3872r(l70Var5.m4074g(this.f8779e));
            if (jArrM3872r == null || jArrM3872r.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrM3872r2 == null || jArrM3872r2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrM3872r.length != jArrM3872r2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrM3872r2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.f8780f = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrM3872r.length; i3++) {
                int i4 = (int) jArrM3872r[i3];
                int i5 = (int) jArrM3872r2[i3];
                if (i3 < jArrM3872r.length - 1 && i4 + i5 != jArrM3872r[i3 + 1]) {
                    this.f8780f = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                long j3 = i6;
                if (k70Var.skip(j3) != j3) {
                    return;
                }
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                if (k70Var.read(bArr2) != i5) {
                    return;
                }
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
            if (this.f8780f) {
                long j4 = jArrM3872r[0];
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5225v(int i, int i2) {
        HashMap[] mapArr = this.f8777c;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        l70 l70Var = (l70) mapArr[i].get("ImageLength");
        l70 l70Var2 = (l70) mapArr[i].get("ImageWidth");
        l70 l70Var3 = (l70) mapArr[i2].get("ImageLength");
        l70 l70Var4 = (l70) mapArr[i2].get("ImageWidth");
        if (l70Var == null || l70Var2 == null || l70Var3 == null || l70Var4 == null) {
            return;
        }
        int iM4072e = l70Var.m4072e(this.f8779e);
        int iM4072e2 = l70Var2.m4072e(this.f8779e);
        int iM4072e3 = l70Var3.m4072e(this.f8779e);
        int iM4072e4 = l70Var4.m4072e(this.f8779e);
        if (iM4072e >= iM4072e3 || iM4072e2 >= iM4072e4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m5226w(o70 o70Var, int i) throws IOException {
        l70 l70VarM4070c;
        l70 l70VarM4070c2;
        HashMap[] mapArr = this.f8777c;
        l70 l70Var = (l70) mapArr[i].get("DefaultCropSize");
        l70 l70Var2 = (l70) mapArr[i].get("SensorTopBorder");
        l70 l70Var3 = (l70) mapArr[i].get("SensorLeftBorder");
        l70 l70Var4 = (l70) mapArr[i].get("SensorBottomBorder");
        l70 l70Var5 = (l70) mapArr[i].get("SensorRightBorder");
        if (l70Var != null) {
            int i2 = l70Var.f6202a;
            ByteOrder byteOrder = this.f8779e;
            if (i2 == 5) {
                n70[] n70VarArr = (n70[]) l70Var.m4074g(byteOrder);
                if (n70VarArr == null || n70VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(n70VarArr));
                    return;
                }
                l70VarM4070c = l70.m4069b(n70VarArr[0], this.f8779e);
                l70VarM4070c2 = l70.m4069b(n70VarArr[1], this.f8779e);
            } else {
                int[] iArr = (int[]) l70Var.m4074g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                l70VarM4070c = l70.m4070c(iArr[0], this.f8779e);
                l70VarM4070c2 = l70.m4070c(iArr[1], this.f8779e);
            }
            mapArr[i].put("ImageWidth", l70VarM4070c);
            mapArr[i].put("ImageLength", l70VarM4070c2);
            return;
        }
        if (l70Var2 != null && l70Var3 != null && l70Var4 != null && l70Var5 != null) {
            int iM4072e = l70Var2.m4072e(this.f8779e);
            int iM4072e2 = l70Var4.m4072e(this.f8779e);
            int iM4072e3 = l70Var5.m4072e(this.f8779e);
            int iM4072e4 = l70Var3.m4072e(this.f8779e);
            if (iM4072e2 <= iM4072e || iM4072e3 <= iM4072e4) {
                return;
            }
            l70 l70VarM4070c3 = l70.m4070c(iM4072e2 - iM4072e, this.f8779e);
            l70 l70VarM4070c4 = l70.m4070c(iM4072e3 - iM4072e4, this.f8779e);
            mapArr[i].put("ImageLength", l70VarM4070c3);
            mapArr[i].put("ImageWidth", l70VarM4070c4);
            return;
        }
        l70 l70Var6 = (l70) mapArr[i].get("ImageLength");
        l70 l70Var7 = (l70) mapArr[i].get("ImageWidth");
        if (l70Var6 == null || l70Var7 == null) {
            l70 l70Var8 = (l70) mapArr[i].get("JPEGInterchangeFormat");
            l70 l70Var9 = (l70) mapArr[i].get("JPEGInterchangeFormatLength");
            if (l70Var8 == null || l70Var9 == null) {
                return;
            }
            int iM4072e5 = l70Var8.m4072e(this.f8779e);
            int iM4072e6 = l70Var8.m4072e(this.f8779e);
            o70Var.m4717d(iM4072e5);
            byte[] bArr = new byte[iM4072e6];
            o70Var.read(bArr);
            m5209e(new k70(bArr), iM4072e5, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5227x() {
        m5225v(0, 5);
        m5225v(0, 4);
        m5225v(5, 4);
        HashMap[] mapArr = this.f8777c;
        l70 l70Var = (l70) mapArr[1].get("PixelXDimension");
        l70 l70Var2 = (l70) mapArr[1].get("PixelYDimension");
        if (l70Var != null && l70Var2 != null) {
            mapArr[0].put("ImageWidth", l70Var);
            mapArr[0].put("ImageLength", l70Var2);
        }
        if (mapArr[4].isEmpty() && m5218n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m5218n(mapArr[4]);
        m5223t(0, "ThumbnailOrientation", "Orientation");
        m5223t(0, "ThumbnailImageLength", "ImageLength");
        m5223t(0, "ThumbnailImageWidth", "ImageWidth");
        m5223t(5, "ThumbnailOrientation", "Orientation");
        m5223t(5, "ThumbnailImageLength", "ImageLength");
        m5223t(5, "ThumbnailImageWidth", "ImageWidth");
        m5223t(4, "Orientation", "ThumbnailOrientation");
        m5223t(4, "ImageLength", "ThumbnailImageLength");
        m5223t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
