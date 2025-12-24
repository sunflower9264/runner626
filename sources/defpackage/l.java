package defpackage;

import com.nokia.mid.sound.Sound;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/* loaded from: Runner626_s40v3a.jar:l.class */
public final class l {
    private static long a;

    /* renamed from: a, reason: collision with other field name */
    private static int f172a = (int) System.currentTimeMillis();

    /* renamed from: a, reason: collision with other field name */
    private static boolean f173a = true;
    private static boolean b = true;

    /* renamed from: a, reason: collision with other field name */
    private static Player f174a = null;

    /* renamed from: a, reason: collision with other field name */
    private static Sound f175a = null;

    public static DataInputStream a(String str) throws Exception {
        return new DataInputStream(m41a(str));
    }

    /* renamed from: a, reason: collision with other method in class */
    private static InputStream m41a(String str) throws Exception {
        InputStream resourceAsStream = AppLink.midlet.getClass().getResourceAsStream(new StringBuffer().append("/").append(str).toString());
        if (resourceAsStream == null) {
            throw new Exception(new StringBuffer().append("Resource file not found: ").append(str).toString());
        }
        return resourceAsStream;
    }

    public static void a() {
        a = System.currentTimeMillis();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int m42a() {
        return (int) (System.currentTimeMillis() - a);
    }

    public static void a(int i) {
        a(i - m42a());
    }

    public static void a(long j) {
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (Exception unused) {
            }
        }
    }

    private static int b() {
        int i = ((f172a * 1664525) + 1013904223) % 701239857;
        f172a = i;
        return i;
    }

    public static int a(int i, int i2) {
        int iB = b() % ((i2 - i) + 1);
        return iB < 0 ? i - iB : i + iB;
    }

    public static final void a(boolean z) {
        if (!z) {
            m43b();
        }
        f173a = z;
    }

    public static final void b(boolean z) {
        if (!z) {
            b(0);
        }
        b = z;
    }

    public static void a(String str, boolean z) {
        if (f173a) {
            m43b();
            try {
                if (!m47a() || !m44a(m45a(str))) {
                    c(str, z);
                } else {
                    System.out.println("here");
                    b(str, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m43b() {
        try {
            if (f173a) {
                if (f174a != null) {
                    c();
                } else if (f175a != null) {
                    d();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void b(String str, boolean z) throws Exception {
        f174a = Manager.createPlayer(m41a(str), m46a(str));
        if (z) {
            f174a.setLoopCount(-1);
        }
        f174a.start();
    }

    private static void c() throws Exception {
        if (f174a != null) {
            f174a.stop();
            f174a.deallocate();
            f174a.close();
            f174a = null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m44a(int i) {
        String[] supportedContentTypes = Manager.getSupportedContentTypes((String) null);
        for (int i2 = 0; i2 < supportedContentTypes.length; i2++) {
            switch (i) {
                case 0:
                    if (!supportedContentTypes[i2].equals("audio/mid") && !supportedContentTypes[i2].equals("audio/midi") && !supportedContentTypes[i2].equals("audio/x-mid") && !supportedContentTypes[i2].equals("audio/x-midi")) {
                        break;
                    } else {
                        return true;
                    }
                    break;
                case 1:
                    if (!supportedContentTypes[i2].equals("audio/wav") && !supportedContentTypes[i2].equals("audio/x-wav")) {
                        break;
                    } else {
                        return true;
                    }
                    break;
                case 2:
                    if (!supportedContentTypes[i2].equals("audio/mpeg3") && !supportedContentTypes[i2].equals("audio/x-mpeg-3")) {
                        break;
                    } else {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m45a(String str) {
        String strTrim = str.toLowerCase().trim();
        if (strTrim.endsWith(".mid")) {
            return 0;
        }
        if (strTrim.endsWith(".wav")) {
            return 1;
        }
        return strTrim.endsWith(".mp3") ? 2 : -1;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m46a(String str) {
        String strTrim = str.toLowerCase().trim();
        if (strTrim.endsWith(".mid")) {
            return "audio/midi";
        }
        if (strTrim.endsWith(".wav")) {
            return "audio/x-wav";
        }
        if (strTrim.endsWith(".mp3")) {
            return "audio/mpeg3";
        }
        return null;
    }

    private static void c(String str, boolean z) throws Exception {
        if (str.toLowerCase().endsWith(".mid")) {
            str = new StringBuffer().append(str.substring(0, str.length() - 4)).append(".ott").toString();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataInputStream dataInputStreamA = a(str);
        while (true) {
            int i = dataInputStreamA.read();
            if (i == -1) {
                break;
            } else {
                byteArrayOutputStream.write(i);
            }
        }
        dataInputStreamA.close();
        if (byteArrayOutputStream.size() > 0) {
            f175a = new Sound(byteArrayOutputStream.toByteArray(), str.toLowerCase().endsWith(".wav") ? 5 : 1);
            f175a.play(z ? 64 : 1);
        }
    }

    private static void d() {
        if (f175a != null) {
            try {
                f175a.stop();
                f175a.release();
                f175a = null;
            } catch (Exception unused) {
            }
        }
    }

    private static void b(int i) {
        if (b) {
            try {
                Display.getDisplay(AppLink.midlet).vibrate(i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m47a() throws ClassNotFoundException {
        try {
            Class.forName("javax.microedition.media.Manager");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
