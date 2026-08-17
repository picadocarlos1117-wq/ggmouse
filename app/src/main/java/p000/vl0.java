package p000;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 extends ki0 {

    /* JADX INFO: renamed from: s */
    public static final Pattern f11702s = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: q */
    public final CharsetDecoder f11703q = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: r */
    public final CharsetDecoder f11704r = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p000.ki0
    /* JADX INFO: renamed from: t */
    public final k51 mo194t(o51 o51Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f11704r;
        CharsetDecoder charsetDecoder2 = this.f11703q;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new k51(new xl0(bArr, null, null));
        }
        Matcher matcher = f11702s.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM6444b0 = ua0.m6444b0(strGroup);
                strM6444b0.getClass();
                if (strM6444b0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM6444b0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new k51(new xl0(bArr, str, str2));
    }
}
