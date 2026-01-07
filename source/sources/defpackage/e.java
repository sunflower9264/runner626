package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:e.class */
public final class e {
    private static String[][] a;

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f101a = {"Invalid STG format.", "Invalid STR format.", "Invalid font file: Wrong number of images for the given charset.", "Font is not loaded: ", "Character not found in the active font charset.", "A .stg or .str file was spected."};

    /* renamed from: a, reason: collision with other field name */
    private static int f102a = 0;
    private static String[] b = new String[10];

    /* renamed from: a, reason: collision with other field name */
    private static f[] f103a = new f[10];

    /* renamed from: a, reason: collision with other field name */
    private static char[][] f104a = new char[10];

    /* renamed from: a, reason: collision with other field name */
    private static byte[][] f105a = new byte[10];

    /* renamed from: a, reason: collision with other field name */
    private static int[] f106a = new int[10];

    /* renamed from: a, reason: collision with other field name */
    private static short[][] f107a = new short[10];

    /* renamed from: b, reason: collision with other field name */
    private static int[] f108b = new int[10];
    private static int[] c = new int[10];
    private static int[] d = new int[10];

    /* renamed from: a, reason: collision with other field name */
    private static boolean[] f109a = new boolean[10];

    /* renamed from: a, reason: collision with other field name */
    private static Font[] f110a = new Font[10];

    /* renamed from: b, reason: collision with other field name */
    private static boolean[] f111b = new boolean[10];
    private static int[] e = new int[10];

    /* renamed from: b, reason: collision with other field name */
    private static int f112b;

    /* renamed from: c, reason: collision with other field name */
    private static int f113c;

    /* renamed from: d, reason: collision with other field name */
    private static int f114d;

    /* renamed from: e, reason: collision with other field name */
    private static int f115e;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f116a;

    public static final void a(String[][] strArr) {
        a = strArr;
    }

    private static String a(int i, int i2) {
        return a[i][i2];
    }

    public static final String a(int i) {
        return a[0][i];
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[], java.lang.String[][]] */
    public static String[][] a(String str) throws Exception {
        if (str.toLowerCase().endsWith(".stg")) {
            return b(str);
        }
        if (str.toLowerCase().endsWith(".str")) {
            return new String[]{m15a(str)};
        }
        throw new Exception(f101a[5]);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String[] m15a(String str) throws Exception {
        DataInputStream dataInputStreamA = l.a(str);
        if (dataInputStreamA.readByte() != 83 || dataInputStreamA.readByte() != 84 || dataInputStreamA.readByte() != 82 || dataInputStreamA.readByte() != 0 || dataInputStreamA.readByte() != 1) {
            throw new Exception(f101a[1]);
        }
        String[] strArr = new String[dataInputStreamA.readShort()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = dataInputStreamA.readUTF();
        }
        dataInputStreamA.close();
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String[], java.lang.String[][]] */
    private static String[][] b(String str) throws Exception {
        DataInputStream dataInputStreamA = l.a(str);
        if (dataInputStreamA.readByte() != 83 || dataInputStreamA.readByte() != 84 || dataInputStreamA.readByte() != 71 || dataInputStreamA.readByte() != 0 || dataInputStreamA.readByte() != 1) {
            throw new Exception(f101a[0]);
        }
        ?? r0 = new String[dataInputStreamA.readShort()];
        int length = r0.length;
        for (int i = 0; i < length; i++) {
            r0[i] = new String[dataInputStreamA.readShort()];
            int length2 = r0[i].length;
            for (int i2 = 0; i2 < length2; i2++) {
                r0[i][i2] = dataInputStreamA.readUTF();
            }
        }
        dataInputStreamA.close();
        return r0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m16a(String str) throws Exception {
        a(str, str);
    }

    private static void a(String str, String str2) throws Exception {
        if (m18a(str2)) {
            return;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= 10) {
                break;
            }
            if (b[i2] == null) {
                i = i2;
                break;
            }
            i2++;
        }
        DataInputStream dataInputStreamA = l.a(new StringBuffer().append(str).append(".fnt").toString());
        f104a[i] = new char[dataInputStreamA.readShort()];
        f108b[i] = dataInputStreamA.readByte();
        c[i] = dataInputStreamA.readByte();
        for (int i3 = 0; i3 < f104a[i].length; i3++) {
            f104a[i][i3] = dataInputStreamA.readChar();
        }
        f103a[i] = new f(dataInputStreamA);
        dataInputStreamA.close();
        int length = f104a[i].length;
        if (length != f103a[i].f117a) {
            throw new Exception(new StringBuffer().append(f101a[2]).append("(chars:").append(length).append(" / images: ").append(f103a[i].f117a).append(")").toString());
        }
        f105a[i] = new byte[length];
        int i4 = length;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            } else {
                f105a[i][i4] = (byte) f103a[i].m27a(i4);
            }
        }
        f106a[i] = f103a[i].m28b(0);
        f109a[i] = true;
        char c2 = 0;
        int i5 = length;
        while (true) {
            i5--;
            if (i5 < 0) {
                break;
            }
            char c3 = f104a[i][i5];
            if (c3 > 255) {
                f109a[i] = false;
                break;
            } else if (c3 > c2) {
                c2 = c3;
            }
        }
        if (f109a[i]) {
            f107a[i] = new short[c2 + 1];
            int length2 = f107a.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                } else {
                    f107a[i][length2] = -1;
                }
            }
            int i6 = length;
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                } else {
                    f107a[i][f104a[i][i6]] = (short) i6;
                }
            }
        }
        d[i] = -1;
        b[i] = str2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m17b(String str) {
        for (int i = 0; i < 10; i++) {
            if (b[i] != null && b[i].equals(str)) {
                b[i] = null;
                f103a[i] = null;
                f104a[i] = null;
                f105a[i] = null;
                f107a[i] = null;
                f110a[i] = null;
                f111b[i] = false;
                return;
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m18a(String str) {
        return d(str) >= 0;
    }

    public static void c(String str) throws Exception {
        int iD = d(str);
        if (iD < 0) {
            throw new Exception(new StringBuffer().append(f101a[3]).append(str).toString());
        }
        f102a = iD;
    }

    private static int d(String str) {
        int i = 0;
        while (i < 10 && (b[i] == null || !b[i].equals(str))) {
            i++;
        }
        if (i < 10) {
            return i;
        }
        return -1;
    }

    public static int a() {
        return c[f102a];
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m19a() throws Exception {
        f103a[f102a].a();
    }

    public static void a(int i, int i2, int i3, int i4) {
        f112b = i;
        f113c = i2;
        f114d = i + i3;
        f115e = i2 + i4;
    }

    public static void b() {
        a(0, 0, r.c, r.d);
    }

    public static final void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) throws Exception {
        a(graphics, i, i2, i3, a(i4, i5));
    }

    public static void a(Graphics graphics, int i, int i2, int i3, String str) throws Exception {
        if (str.length() == 0) {
            return;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        graphics.setClip(f112b, f113c, f114d - f112b, f115e - f113c);
        if (f111b[f102a]) {
            b(graphics, i, i2, i3, str);
        } else {
            short[] sArrM20a = m20a(str);
            int length = sArrM20a.length;
            int iA = i2;
            int i4 = c[f102a];
            if ((i3 & (-16777214)) == -16777214) {
                iA -= a(sArrM20a) / 2;
            } else if ((i3 & (-16777184)) == -16777184) {
                iA -= a(sArrM20a);
            }
            if (d[f102a] >= 0) {
                graphics.setColor(d[f102a]);
            }
            int i5 = 0;
            boolean z = false;
            boolean z2 = (i3 & (-16777215)) == -16777215 || (i3 & (-16777208)) == -16777208;
            int i6 = f108b[f102a];
            int i7 = f106a[f102a];
            while (iA <= f115e) {
                int i8 = 0;
                int i9 = 0;
                do {
                    short s = sArrM20a[i5 + i8];
                    if (i5 + i8 == length - 1) {
                        z = true;
                    }
                    if (s < 0) {
                        break;
                    }
                    if (z2) {
                        i9 += f105a[f102a][s] + i6;
                    }
                    i8++;
                } while (!z);
                if (i8 > 0 && iA + i7 >= f113c) {
                    int i10 = i;
                    int i11 = i9 - i6;
                    if (z2) {
                        if ((i3 & (-16777215)) == -16777215) {
                            i10 -= i11 / 2;
                        } else if ((i3 & (-16777208)) == -16777208) {
                            i10 -= i11;
                        }
                    }
                    a(graphics, i10, iA, sArrM20a, i5, i5 + i8);
                }
                i5 += i8 + 1;
                iA += i7 + i4;
                if (z) {
                    break;
                }
            }
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private static void b(Graphics graphics, int i, int i2, int i3, String str) throws Exception {
        Font font = f110a[f102a];
        String[] strArrM25b = m25b(str);
        int length = strArrM25b.length;
        int i4 = (i3 & (-16777215)) == -16777215 ? 17 : (i3 & (-16777208)) == -16777208 ? 24 : 0;
        int iM24b = m24b();
        int i5 = i2;
        if ((i3 & (-16777214)) == -16777214) {
            i5 -= (length * iM24b) / 2;
        } else if ((i3 & (-16777184)) == -16777184) {
            i5 -= length * iM24b;
        }
        graphics.setFont(font);
        graphics.setColor(e[f102a]);
        for (String str2 : strArrM25b) {
            graphics.drawString(str2, i, i5, i4);
            i5 += iM24b;
        }
    }

    private static void a(Graphics graphics, int i, int i2, short[] sArr, int i3, int i4) {
        f fVar = f103a[f102a];
        int i5 = f108b[f102a];
        int i6 = f106a[f102a];
        int i7 = d[f102a];
        for (int i8 = i3; i8 < i4; i8++) {
            short s = sArr[i8];
            byte b2 = f105a[f102a][s];
            if (i + b2 >= f112b) {
                if (i > f114d) {
                    return;
                }
                if (s >= 0) {
                    if (i7 >= 0) {
                        graphics.fillRect(i, i2, b2, i6);
                    }
                    fVar.a(graphics, s, i, i2, -16777196, 0);
                }
            }
            i += b2 + i5;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static short[] m20a(String str) throws Exception {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        short[] sArr = new short[length];
        if (f109a[f102a]) {
            short[] sArr2 = f107a[f102a];
            for (int i = 0; i < length; i++) {
                char c2 = charArray[i];
                if (c2 == '~' || c2 == '^') {
                    sArr[i] = -1;
                } else if (c2 < sArr2.length) {
                    short s = sArr2[c2];
                    if (s != -1) {
                        sArr[i] = s;
                    } else {
                        m26a(c2);
                    }
                } else {
                    m26a(c2);
                }
            }
        } else {
            char[] cArr = f104a[f102a];
            for (int i2 = 0; i2 < length; i2++) {
                char c3 = charArray[i2];
                if (c3 == '~' || c3 == '^') {
                    sArr[i2] = -1;
                } else {
                    int length2 = cArr.length;
                    while (true) {
                        length2--;
                        if (length2 < 0) {
                            break;
                        }
                        if (c3 == cArr[length2]) {
                            sArr[i2] = (short) length2;
                            break;
                        }
                    }
                    if (length2 < 0) {
                        m26a(c3);
                    }
                }
            }
        }
        return sArr;
    }

    private static int b(char c2) throws Exception {
        if (c2 == '~' || c2 == '^') {
            return -1;
        }
        if (f109a[f102a]) {
            if (c2 >= f107a[f102a].length) {
                m26a(c2);
                return -1;
            }
            short s = f107a[f102a][c2];
            if (s != -1) {
                return s;
            }
            m26a(c2);
            return -1;
        }
        char[] cArr = f104a[f102a];
        int length = cArr.length;
        do {
            length--;
            if (length < 0) {
                m26a(c2);
                return -1;
            }
        } while (c2 != cArr[length]);
        return length;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m21a(String str) throws Exception {
        int i = 0;
        if (f111b[f102a]) {
            String[] strArrM25b = m25b(str);
            Font font = f110a[f102a];
            int length = strArrM25b.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                int iStringWidth = font.stringWidth(strArrM25b[length]);
                if (iStringWidth > i) {
                    i = iStringWidth;
                }
            }
        } else {
            short[] sArrM20a = m20a(str);
            byte[] bArr = f105a[f102a];
            int i2 = f108b[f102a];
            int i3 = 0;
            int i4 = 0;
            int length2 = sArrM20a.length;
            boolean z = false;
            boolean z2 = false;
            do {
                if (i4 < length2) {
                    int i5 = i4;
                    i4++;
                    short s = sArrM20a[i5];
                    if (s >= 0) {
                        i3 += bArr[s] + i2;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                    z = true;
                }
                if (z2) {
                    int i6 = i3 - i2;
                    if (i6 > i) {
                        i = i6;
                    }
                    i3 = 0;
                    z2 = false;
                }
            } while (!z);
        }
        return i;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static int m22b(String str) throws Exception {
        return f111b[f102a] ? m25b(str).length * f110a[f102a].getHeight() : a(m20a(str));
    }

    private static int a(short[] sArr) {
        int i = 0;
        int length = sArr.length;
        int i2 = c[f102a];
        for (int i3 = 0; i3 < length; i3++) {
            if (sArr[i3] < 0) {
                i++;
            } else if (i3 == length - 1) {
                i++;
            }
        }
        return (i * (m24b() + i2)) - i2;
    }

    public static final int a(char c2) throws Exception {
        if (f111b[f102a]) {
            return f110a[f102a].charWidth(c2);
        }
        int iB = b(c2);
        if (iB >= 0) {
            return f105a[f102a][iB];
        }
        return 0;
    }

    /* renamed from: c, reason: collision with other method in class */
    public static final int m23c(String str) throws Exception {
        int iD = d(str);
        return f111b[f102a] ? f110a[iD].getHeight() : f103a[iD].m28b(0);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static final int m24b() {
        return f111b[f102a] ? f110a[f102a].getHeight() : f103a[f102a].m28b(0);
    }

    public static String a(String str, int i) throws Exception {
        if (f116a) {
            return b(str, i);
        }
        char[] charArray = str.toCharArray();
        if (f111b[f102a]) {
            int i2 = -1;
            int iCharWidth = 0;
            Font font = f110a[f102a];
            int i3 = 0;
            while (i3 < charArray.length) {
                char c2 = charArray[i3];
                if (c2 == '~' || c2 == '^') {
                    i2 = -1;
                    iCharWidth = 0;
                } else {
                    if (c2 == ' ') {
                        i2 = i3;
                    }
                    iCharWidth += font.charWidth(c2);
                }
                if (iCharWidth > i && i2 != -1) {
                    int i4 = i2;
                    i3 = i4;
                    charArray[i4] = '^';
                    i2 = -1;
                    iCharWidth = 0;
                }
                i3++;
            }
            return new String(charArray);
        }
        short[] sArrM20a = m20a(str);
        byte[] bArr = f105a[f102a];
        int i5 = -1;
        int i6 = 0;
        int i7 = f108b[f102a];
        int i8 = 0;
        while (i8 < charArray.length) {
            short s = sArrM20a[i8];
            char c3 = charArray[i8];
            if (s < 0) {
                i5 = -1;
                i6 = 0;
            } else {
                if (c3 == ' ') {
                    i5 = i8;
                }
                i6 += bArr[s] + i7;
            }
            if (i6 > i && i5 != -1) {
                int i9 = i5;
                i8 = i9;
                charArray[i9] = '^';
                i5 = -1;
                i6 = 0;
            }
            i8++;
        }
        return new String(charArray);
    }

    private static String b(String str, int i) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        char[] charArray = str.toCharArray();
        if (f111b[f102a]) {
            int iCharWidth = 0;
            Font font = f110a[f102a];
            for (int i2 = 0; i2 < charArray.length; i2++) {
                char c2 = charArray[i2];
                iCharWidth = (c2 == '~' || c2 == '^') ? 0 : iCharWidth + font.charWidth(c2);
                if (iCharWidth > i) {
                    dataOutputStream.writeChar(94);
                    iCharWidth = 0;
                }
                dataOutputStream.writeChar(c2);
            }
            return new String(byteArrayOutputStream.toByteArray(), "UTF-16");
        }
        short[] sArrM20a = m20a(str);
        byte[] bArr = f105a[f102a];
        int i3 = 0;
        int i4 = f108b[f102a];
        for (int i5 = 0; i5 < charArray.length; i5++) {
            short s = sArrM20a[i5];
            char c3 = charArray[i5];
            i3 = s < 0 ? 0 : i3 + bArr[s] + i4;
            if (i3 > i) {
                dataOutputStream.writeChar(94);
                i3 = 0;
            }
            dataOutputStream.writeChar(c3);
        }
        return new String(byteArrayOutputStream.toByteArray(), "UTF-16");
    }

    /* renamed from: b, reason: collision with other method in class */
    private static String[] m25b(String str) throws Exception {
        return a(str, new char[]{'~', '^'});
    }

    private static String[] a(String str, char[] cArr) throws Exception {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 1;
        for (char c2 : charArray) {
            int length2 = cArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                if (c2 == cArr[length2]) {
                    i++;
                    break;
                }
            }
        }
        if (i == 1) {
            return new String[]{str};
        }
        String[] strArr = new String[i];
        char[] cArr2 = new char[length];
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        do {
            boolean z2 = false;
            int i4 = 0;
            do {
                if (i2 < length) {
                    int i5 = i2;
                    i2++;
                    char c3 = charArray[i5];
                    boolean z3 = false;
                    int length3 = cArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        if (c3 == cArr[length3]) {
                            z3 = true;
                            break;
                        }
                    }
                    if (z3) {
                        z2 = true;
                    } else {
                        int i6 = i4;
                        i4++;
                        cArr2[i6] = c3;
                    }
                } else {
                    z = true;
                }
                if (z2) {
                    break;
                }
            } while (!z);
            int i7 = i3;
            i3++;
            strArr[i7] = i4 > 0 ? new String(cArr2, 0, i4) : new String("");
        } while (!z);
        return strArr;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m26a(char c2) throws Exception {
        throw new Exception(new StringBuffer().append(f101a[4]).append(": ").append(c2).append(" (").append((int) c2).append(")").toString());
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [char[], char[][]] */
    /* JADX WARN: Type inference failed for: r0v14, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [short[], short[][]] */
    static {
        char[] cArr = {209, 241, 199, 231, 193, 201, 205, 211, 218, 225, 233, 237, 243, 250, 192, 200, 204, 210, 217, 224, 232, 236, 242, 249, 196, 203, 207, 214, 220, 228, 235, 239, 246, 252, 194, 202, 206, 212, 219, 226, 234, 238, 244, 251};
        char[] cArr2 = {'N', 'n', 'C', 'c', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        b();
    }
}
