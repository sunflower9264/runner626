package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:i.class */
public final class i {
    public static boolean a;

    /* renamed from: a, reason: collision with other field name */
    public static int f151a;
    private static int b = 3;

    /* renamed from: a, reason: collision with other field name */
    public static String f152a;

    /* renamed from: b, reason: collision with other field name */
    public static boolean f153b;
    private static int c;
    private static int d;
    private static int e;

    /* renamed from: a, reason: collision with other field name */
    public static short[][] f154a;

    public static void a(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i;
        }
    }

    public static void b(int[] iArr, int i) {
        if (i == 3) {
            int i2 = iArr[iArr.length - 1];
            for (int length = iArr.length - 1; length > 0; length--) {
                iArr[length] = iArr[length - 1];
            }
            iArr[0] = i2;
            return;
        }
        int i3 = iArr[0];
        for (int i4 = 0; i4 < iArr.length - 1; i4++) {
            iArr[i4] = iArr[i4 + 1];
        }
        iArr[iArr.length - 1] = i3;
    }

    public static int a(int i, int i2) {
        if (i + i2 > 255) {
            return 255;
        }
        if (i + i2 < 0) {
            return 0;
        }
        return i + i2;
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i2 + i4 > r.d) {
            i4 = r.d - i2;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = i4 / i5;
        for (int i17 = 0; i17 <= i5 + 1; i17++) {
            graphics.setColor(a(i9, i12), a(i10, i13), a(i11, i14));
            graphics.fillRect(i, i2 + i15, i3, i16);
            i15 += i16;
            i12 += i6;
            i13 += i7;
            i14 += i8;
        }
    }

    public static void b(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i2 + i4 > r.d) {
            i4 = r.d - i2;
        }
        d(graphics, i, i2, i3, i4 / 2, i5 / 2, i9, i10, i11, i6, i7, i8);
        d(graphics, i, i2 + (i4 / 2), i3, i4 / 2, i5 / 2, i6, i7, i8, i9, i10, i11);
    }

    private static void d(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i2 + i4 > r.d) {
            i4 = r.d - i2;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = (i9 - i6) / i5;
        int i16 = (i10 - i7) / i5;
        int i17 = (i11 - i8) / i5;
        int i18 = 0;
        int i19 = i4 / i5;
        for (int i20 = 0; i20 <= i5 + 1; i20++) {
            c = a(i6, i12);
            d = a(i7, i13);
            e = a(i8, i14);
            graphics.setColor(c, d, e);
            graphics.fillRect(i, i2 + i18, i3, i19);
            i18 += i19;
            i12 += i15;
            i13 += i16;
            i14 += i17;
        }
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        graphics.setColor(i7);
        if (i6 == 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= i4) {
                    break;
                }
                graphics.fillRect(i, i2 + i11, i + i3, i9);
                i10 = i11 + i5;
            }
        } else if (i6 == 1) {
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= i4) {
                    break;
                }
                graphics.fillRect(i, i2 + i13, i + i3, i9);
                i12 = i13 + i5;
            }
            int i14 = 0;
            while (true) {
                int i15 = i14;
                if (i15 >= i3) {
                    break;
                }
                graphics.fillRect(i + i15, i2, i9, i2 + i4);
                i14 = i15 + i5;
            }
        } else if (i6 == 2) {
            graphics.setClip(i, i2, i3, i4);
            int i16 = 0;
            while (true) {
                int i17 = i16;
                if (i17 >= i3 + i4) {
                    break;
                }
                graphics.drawLine(i, i2 + i17, i + i17, i2);
                i16 = i17 + i5;
            }
            graphics.setClip(0, 0, r.c, r.d);
        } else if (i6 == 3) {
            graphics.fillRect(i, i2, i3, i4);
        }
        if (z) {
            graphics.setColor(i8);
            graphics.drawRect(i - 1, i2 - 1, i3, i4);
        }
        graphics.setStrokeStyle(0);
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        a(graphics, i, i2, i3, i4, b, 1, i5, 0, f151a, false);
        if (h.a % 1 == 0) {
            if (f151a <= 0) {
                a = true;
            } else {
                a = false;
                f151a--;
            }
        }
    }

    public static void b(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        a(graphics, i, i2, i3, i4, b, 1, i5, 0, f151a, false);
        if (h.a % 1 == 0) {
            if (f151a >= b) {
                a = true;
            } else {
                a = false;
                f151a++;
            }
        }
    }

    public static void c(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i2 + i4 > r.d) {
            i4 = r.d - i2;
        }
        if (f151a == 0) {
            c = a(i6, 0);
            d = a(i7, 0);
            e = a(i8, 0);
        } else {
            c = a(c, (i9 - i6) / i5);
            d = a(d, (i10 - i7) / i5);
            e = a(e, (i11 - i8) / i5);
        }
        graphics.setColor(c, d, e);
        graphics.fillRect(i, i2, i3, i4);
        if (f151a >= i5) {
            a = true;
        } else {
            a = false;
            f151a++;
        }
    }

    public static void a() {
        a = false;
        f151a = 0;
    }

    public static void a(int i, int i2, int i3, int i4, int i5) {
        f154a = new short[i][5];
        for (int i6 = 0; i6 < i / 3; i6++) {
            f154a[i6][0] = (short) l.a(i2, i4);
            f154a[i6][1] = (short) l.a(i3, i5);
            f154a[i6][2] = (short) l.a(200, 255);
            f154a[i6][3] = (short) l.a(200, 255);
            f154a[i6][4] = (short) l.a(200, 255);
        }
        int i7 = i / 3;
        for (int i8 = 0; i8 < i / 3; i8++) {
            f154a[i7 + i8][0] = (short) l.a(i2, i4);
            f154a[i7 + i8][1] = (short) l.a(i3, i5);
            f154a[i7 + i8][2] = (short) (f154a[i8][2] - 40);
            f154a[i7 + i8][3] = (short) (f154a[i8][3] - 40);
            f154a[i7 + i8][4] = f154a[i8][4];
        }
        int i9 = 2 * (i / 3);
        for (int i10 = 0; i10 < i / 3; i10++) {
            f154a[i9 + i10][0] = (short) l.a(i2, i4);
            f154a[i9 + i10][1] = (short) l.a(i3, i5);
            f154a[i9 + i10][2] = (short) (f154a[i10][2] - 80);
            f154a[i9 + i10][3] = (short) (f154a[i10][3] - 80);
            f154a[i9 + i10][4] = f154a[i10][4];
        }
    }

    public static void a(Graphics graphics) {
        for (int i = 0; i < f154a.length; i++) {
            graphics.setColor(f154a[i][2], f154a[i][3], f154a[i][4]);
            graphics.fillRect(f154a[i][0], f154a[i][1], 1, 1);
        }
    }

    public static void a(o oVar, Exception exc) {
        f153b = true;
        f152a = exc.toString();
        oVar.f = true;
        exc.printStackTrace();
        while (true) {
            o.e();
            l.a(100L);
        }
    }
}
