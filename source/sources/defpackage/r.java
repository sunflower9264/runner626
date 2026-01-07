package defpackage;

import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: Runner626_s40v3a.jar:r.class */
public final class r extends FullCanvas {
    private static r a;

    /* renamed from: a, reason: collision with other field name */
    public static int f189a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f190a;

    /* renamed from: a, reason: collision with other field name */
    private static o[] f191a;
    private static int g;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f192b;

    /* renamed from: a, reason: collision with other field name */
    private static Image f193a;
    private static int h;
    private static int i;

    /* renamed from: c, reason: collision with other field name */
    private static boolean f194c;

    /* renamed from: d, reason: collision with other field name */
    private static boolean f195d;

    /* renamed from: e, reason: collision with other field name */
    private static boolean f196e;

    /* renamed from: b, reason: collision with other field name */
    private static Image f197b;

    /* renamed from: a, reason: collision with other field name */
    private static Graphics f198a;
    private static int j;
    private static int k;

    /* renamed from: a, reason: collision with other field name */
    private static String f199a;

    public static void a() {
        if (a == null) {
            a = new r();
            int width = a.getWidth();
            f189a = width;
            int height = a.getHeight();
            b = height;
            a(width, height);
            f190a = f189a >= 176;
            f191a = new o[10];
            g = 0;
            f192b = true;
            f193a = null;
            h = 0;
            i = 0;
            f194c = false;
            f195d = false;
            f196e = false;
            f197b = null;
            f198a = null;
            m53a();
        }
        Display.getDisplay(AppLink.midlet).setCurrent(a);
    }

    private static void a(int i2, int i3) {
        c = i2;
        e = i2 / 2;
        d = i3;
        f = i3 / 2;
    }

    private static void f() {
        if (f189a == a.getWidth() && b == a.getHeight()) {
            return;
        }
        int width = a.getWidth();
        f189a = width;
        int height = a.getHeight();
        b = height;
        a(width, height);
        i();
        int i2 = g;
        do {
            i2--;
        } while (i2 >= 0);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m53a() {
        if (Display.getDisplay(AppLink.midlet).numAlphaLevels() <= 4) {
            return false;
        }
        int[] iArr = new int[225];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i2 = 10;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            for (int i3 = 0; i3 < 225; i3 += 2) {
                int i4 = iCurrentTimeMillis;
                iCurrentTimeMillis++;
                iArr[i3] = i4;
            }
            Image.createRGBImage(iArr, 15, 15, true);
        }
        for (int i5 = 0; i5 < 225; i5 += 2) {
            iArr[i5] = -2139062144;
        }
        Image.createRGBImage(iArr, 15, 15, true).getRGB(iArr, 0, 15, 0, 0, 15, 15);
        int i6 = iArr[0];
        int i7 = (i6 >> 24) & 255;
        int i8 = (i6 >> 16) & 255;
        int i9 = (i6 >> 8) & 255;
        int i10 = i6 & 255;
        if (i7 == 0 || i8 == 0 || i9 == 0 || i10 == 0 || i7 == 255 || i8 == 255 || i9 == 255 || i10 == 255) {
            return false;
        }
        for (int i11 = 0; i11 < 225; i11 += 2) {
            if (iArr[i11] != i6) {
                return false;
            }
        }
        return true;
    }

    public static void a(o oVar) {
        o[] oVarArr = f191a;
        int i2 = g;
        g = i2 + 1;
        oVarArr[i2] = oVar;
    }

    public static void b() {
        o[] oVarArr = f191a;
        int i2 = g - 1;
        g = i2;
        oVarArr[i2] = null;
    }

    public static void c() {
        a.repaint();
        a.serviceRepaints();
    }

    private static void g() {
        if (f193a == null) {
            System.gc();
            l.a(250L);
            f193a = Image.createImage(c, d);
            f193a.getGraphics();
            a(true);
        }
    }

    private static void h() {
        j();
        f193a = null;
        System.gc();
    }

    private static void i() {
        if (m54b()) {
            h();
            g();
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static boolean m54b() {
        return f193a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    private static boolean m55c() {
        if (!m54b() || f194c) {
            return false;
        }
        f194c = true;
        return true;
    }

    private static void j() {
        f194c = false;
    }

    private static void a(boolean z) {
        f195d = z;
    }

    public static void d() throws Exception {
        if (f196e) {
            return;
        }
        j = b;
        k = f189a;
        a(j, k);
        i();
        f197b = Image.createImage(j, k);
        f198a = f197b.getGraphics();
        f196e = true;
    }

    public static void e() throws Exception {
        if (f196e) {
            a(f189a, b);
            f197b = null;
            f198a = null;
            j = 0;
            k = 0;
            if (m54b()) {
                h();
                g();
            }
            f196e = false;
        }
    }

    private r() {
    }

    public final void hideNotify() {
        f192b = true;
    }

    public final void showNotify() {
    }

    public final synchronized void paint(Graphics graphics) {
        Exception exc;
        try {
            if (f190a) {
                f();
            }
            graphics.setClip(0, 0, f189a, b);
            if (f196e && j == b && k == f189a) {
                f198a.setClip(0, 0, j, k);
                graphics = f198a;
            }
            if (f193a != null && f195d && m55c()) {
                graphics.drawImage(f193a, h, i, 20);
                h = 0;
                i = 0;
                j();
            }
            for (int i2 = 0; i2 < g; i2++) {
                if (f191a[i2].f) {
                    f191a[i2].a(graphics, f192b);
                }
            }
            if (f196e) {
                DirectUtils.getDirectGraphics(graphics).drawImage(f197b, 0, 0, 20, 270);
            }
            exc = null;
            f192b = false;
        } catch (Exception unused) {
            exc.printStackTrace();
        }
        if (f199a != null) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, f189a, 25);
            graphics.setColor(255);
            graphics.drawString(f199a, 5, 5, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception, o] */
    public final synchronized void keyPressed(int i2) {
        ?? r0;
        try {
            if (g <= 0 || !f191a[g - 1].f) {
                return;
            }
            r0 = f191a[g - 1];
            r0.mo36a(a(i2));
        } catch (Exception unused) {
            r0.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception, o] */
    public final synchronized void keyReleased(int i2) {
        ?? r0;
        try {
            if (g <= 0 || !f191a[g - 1].f) {
                return;
            }
            r0 = f191a[g - 1];
            r0.b(a(i2));
        } catch (Exception unused) {
            r0.printStackTrace();
        }
    }

    private int a(int i2) {
        int i3 = i2 < 0 ? -i2 : i2;
        int i4 = i3;
        switch (i3) {
            case 5:
            case 8:
            case 35:
            case 42:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 99:
                break;
            case 6:
            case 7:
                break;
            default:
                switch (i2) {
                    case 8:
                        break;
                    case 9:
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
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 67:
                    case 68:
                    case 69:
                    case 73:
                    case 75:
                    case 76:
                    case 79:
                    case 80:
                    case 81:
                    case 83:
                    case 87:
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 99:
                    case 100:
                    case 101:
                    case 105:
                    case 107:
                    case 108:
                    case 111:
                    case 112:
                    case 113:
                    case 115:
                    case 119:
                    case 120:
                    default:
                        switch (getGameAction(i2)) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                            case 4:
                            default:
                                if (i2 != -5) {
                                    if (i2 != -6) {
                                        if (i2 == -7) {
                                        }
                                    }
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    case 10:
                        break;
                    case 66:
                    case 98:
                        break;
                    case 70:
                    case 102:
                        break;
                    case 71:
                    case 103:
                        break;
                    case 72:
                    case 104:
                        break;
                    case 74:
                    case 106:
                        break;
                    case 77:
                    case 109:
                        break;
                    case 78:
                    case 110:
                        break;
                    case 82:
                    case 114:
                        break;
                    case 84:
                    case 116:
                        break;
                    case 85:
                    case 117:
                        break;
                    case 86:
                    case 118:
                        break;
                    case 89:
                    case 121:
                        break;
                }
        }
        return i4;
    }

    public final void pointerPressed(int i2, int i3) {
    }

    public final void pointerReleased(int i2, int i3) {
    }

    public final void pointerDragged(int i2, int i3) {
    }

    static {
        new Object();
    }
}
