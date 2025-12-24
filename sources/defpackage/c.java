package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: Runner626_s40v3a.jar:c.class */
public final class c {

    /* renamed from: a, reason: collision with other field name */
    public static Graphics f48a;

    /* renamed from: a, reason: collision with other field name */
    private Image f49a;

    /* renamed from: c, reason: collision with other field name */
    public static int f52c;

    /* renamed from: d, reason: collision with other field name */
    public static int f53d;

    /* renamed from: e, reason: collision with other field name */
    public static int f54e;

    /* renamed from: f, reason: collision with other field name */
    public static int f55f;

    /* renamed from: g, reason: collision with other field name */
    public static int f56g;

    /* renamed from: h, reason: collision with other field name */
    public static int f57h;

    /* renamed from: i, reason: collision with other field name */
    public static int f58i;

    /* renamed from: j, reason: collision with other field name */
    public static int f59j;

    /* renamed from: k, reason: collision with other field name */
    public static int f60k;

    /* renamed from: l, reason: collision with other field name */
    public static int f61l;

    /* renamed from: m, reason: collision with other field name */
    public static int f62m;

    /* renamed from: a, reason: collision with other field name */
    private a f63a;

    /* renamed from: n, reason: collision with other field name */
    public int f64n;

    /* renamed from: o, reason: collision with other field name */
    public static int f65o;

    /* renamed from: p, reason: collision with other field name */
    public static int f66p;

    /* renamed from: a, reason: collision with other field name */
    private f f67a;

    /* renamed from: b, reason: collision with other field name */
    private f f68b;

    /* renamed from: c, reason: collision with other field name */
    private f f69c;

    /* renamed from: d, reason: collision with other field name */
    private f f70d;

    /* renamed from: e, reason: collision with other field name */
    private f f71e;

    /* renamed from: f, reason: collision with other field name */
    private f f72f;

    /* renamed from: q, reason: collision with other field name */
    public int f73q;

    /* renamed from: a, reason: collision with other field name */
    public static int[][] f75a;

    /* renamed from: s, reason: collision with other field name */
    public static int f76s;

    /* renamed from: t, reason: collision with other field name */
    public static int f77t;

    /* renamed from: u, reason: collision with other field name */
    public static int f78u;

    /* renamed from: v, reason: collision with other field name */
    public static int f79v;

    /* renamed from: w, reason: collision with other field name */
    public static int f80w;

    /* renamed from: x, reason: collision with other field name */
    private static int f81x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;

    /* renamed from: a, reason: collision with other field name */
    private static int[][][] f82a;

    /* renamed from: b, reason: collision with other field name */
    private static int[][][] f83b;

    /* renamed from: c, reason: collision with other field name */
    private static int[][][] f84c;
    private int E;

    /* renamed from: a, reason: collision with other field name */
    public static byte[][] f85a;

    /* renamed from: a, reason: collision with other field name */
    public static byte[][][] f86a;

    /* renamed from: a, reason: collision with other field name */
    public static int[] f88a;

    /* renamed from: c, reason: collision with other field name */
    public static byte[][] f89c;

    /* renamed from: b, reason: collision with other field name */
    public static int[] f92b;

    /* renamed from: d, reason: collision with other field name */
    public static byte[][] f93d;

    /* renamed from: c, reason: collision with other field name */
    public static int[] f96c;

    /* renamed from: e, reason: collision with other field name */
    public static byte[][] f97e;

    /* renamed from: d, reason: collision with other field name */
    public static int[] f100d;
    private static byte o = 0;
    private static byte p = 1;
    private static byte q = 2;
    private static byte r = 3;
    private static byte s = 4;
    private static byte t = 5;
    private static byte u = 6;
    private static byte v = 7;
    private static byte w = 8;
    private static byte x = 9;
    public static byte a = 0;
    public static byte b = 1;
    public static byte c = 2;
    public static byte d = 3;
    public static byte e = 4;
    public static byte f = 5;
    public static byte g = 6;
    public static byte h = 7;
    public static byte i = 8;
    public static byte j = 0;
    public static byte k = 1;
    public static byte l = 2;
    public static byte m = 0;
    public static byte n = 1;

    /* renamed from: a, reason: collision with other field name */
    public static int f46a = 0;

    /* renamed from: b, reason: collision with other field name */
    public static int f47b = 10;

    /* renamed from: a, reason: collision with other field name */
    public static String[] f50a = {"plano1.is", "plano2.is", "plano3.is", "plano4.is"};

    /* renamed from: b, reason: collision with other field name */
    public static String[] f51b = {"stage0.bin", "stage0.bin", "stage0.bin", "stage1.bin", "stage1.bin", "stage1.bin", "stage2.bin", "stage2.bin", "stage2.bin", "stage3.bin", "stage3.bin", "stage3.bin", "stage4.bin", "stage4.bin", "stage4.bin", "stage4.bin"};

    /* renamed from: r, reason: collision with other field name */
    public static int f74r = 5;

    /* renamed from: b, reason: collision with other field name */
    public static byte[][] f87b = {new byte[]{0, 1, 3, 2, 4, 5}, new byte[]{4, 3, 2, 0, 1, 5}, new byte[]{3, 0, 4, 1, 3, 2, 5}, new byte[]{0, 1, 2, 3, 4, 5}, new byte[]{2, 4, 1, 0, 3, 5}, new byte[]{1, 4, 1, 2, 0, 3, 5}, new byte[]{0, 1, 2, 3, 4, 5}, new byte[]{4, 2, 0, 3, 1, 4, 5}, new byte[]{3, 0, 2, 1, 4, 0, 5}, new byte[]{0, 1, 2, 3, 4, 5}, new byte[]{4, 2, 0, 3, 1, 4, 5}, new byte[]{3, 0, 2, 1, 4, 0, 5}, new byte[]{0, 1, 2, 3, 4, 5}, new byte[]{2, 0, 4, 4, 3, 1, 5}, new byte[]{4, 0, 3, 1, 4, 2, 0, 5}, new byte[]{0, 4, 2, 1, 3, 4, 3, 5}};

    /* renamed from: b, reason: collision with other field name */
    public static byte[][][] f90b = {new byte[]{new byte[]{0, 0, 0}, new byte[]{1, 1, 1}, new byte[]{15, 15, 15}}, new byte[]{new byte[]{0, 5, 6}, new byte[]{2, 3, 4}, new byte[]{15, 15, 15}}, new byte[]{new byte[]{13, 12, 0}, new byte[]{11, 10, 9}, new byte[]{15, 15, 15}}};

    /* renamed from: a, reason: collision with other field name */
    public static byte[] f91a = {0, 0, 0, 2, 0, 1, 2, 0, 0, 0};

    /* renamed from: c, reason: collision with other field name */
    public static byte[][][] f94c = {new byte[]{new byte[]{0, 0}, new byte[]{1, 1}}, new byte[]{new byte[]{0, 4}, new byte[]{2, 3}}, new byte[]{new byte[]{9, 0}, new byte[]{8, 7}}};

    /* renamed from: b, reason: collision with other field name */
    public static byte[] f95b = {0, 2, 0, 0, 1, 0, 2, 0, 0};

    /* renamed from: d, reason: collision with other field name */
    public static byte[][][] f98d = {new byte[]{new byte[]{0, 0, 0}, new byte[]{1, 1, 1}}, new byte[]{new byte[]{4, 5, 6}, new byte[]{2, 1, 1}}, new byte[]{new byte[]{14, 13, 12}, new byte[]{1, 1, 10}}, new byte[]{new byte[]{0, 7, 0}, new byte[]{1, 1, 1}}, new byte[]{new byte[]{0, 3, 0}, new byte[]{1, 1, 1}}, new byte[]{new byte[]{0, 15, 0}, new byte[]{1, 1, 1}}, new byte[]{new byte[]{0, 11, 0}, new byte[]{1, 1, 1}}};

    /* renamed from: c, reason: collision with other field name */
    public static byte[] f99c = {1, 0, 1, 2, 0, 3, 0, 4, 2, 1, 0, 3, 0, 6, 0, 1, 2, 5, 0, 4, 0, 3, 1};

    public c(a aVar) throws Exception {
        this.f63a = aVar;
        e();
        f();
    }

    private void e() throws Exception {
        if (this.f67a == null) {
            this.f67a = new f(f50a[0]);
        }
        this.f67a.a(a());
        this.f63a.a("scr1");
        this.f67a.a();
        this.f63a.a("scr2");
        if (this.f68b == null) {
            this.f68b = new f(f50a[1]);
        }
        this.f68b.a();
        this.f63a.a("scr3");
        if (this.f69c == null) {
            this.f69c = new f(f50a[2]);
        }
        this.f69c.a();
        this.f63a.a("scr4");
        if (this.f70d == null) {
            this.f70d = new f(f50a[3]);
        }
        this.f70d.a();
        this.f63a.a("planet");
        if (this.f71e == null) {
            this.f71e = new f("planet.si");
        }
        this.f63a.a("sky");
        if (this.f72f == null) {
            this.f72f = new f("skyline.si");
        }
    }

    private void f() throws Exception {
        f75a = new int[f74r][3];
        f76s = -1;
        for (int i2 = 0; i2 < f75a.length; i2++) {
            f75a[i2][0] = -1;
        }
        f53d = this.f67a.m27a(1);
        f54e = this.f67a.m28b(1);
        f55f = f53d << 16;
        f56g = f54e << 16;
        f57h = f53d / 2;
        f58i = f54e / 2;
        f88a = new int[10];
        f92b = new int[10];
        f96c = new int[10];
        f100d = new int[10];
        int i3 = r.c % this.f67a.m27a(1) > 0 ? 2 : 1;
        int i4 = r.d % this.f67a.m28b(1) > 0 ? 2 : 1;
        this.E = (r.d - (((this.f67a.m28b(1) + this.f68b.m28b(1)) + (this.f69c.m28b(1) / 2)) + (this.f70d.m28b(1) / 2))) - 2;
        a(f51b[k.o]);
        f77t = (r.c / this.f67a.m27a(1)) + i3;
        f78u = (r.d / this.f67a.m28b(1)) + i4;
        f85a = new byte[f77t][f78u];
        f88a[q] = f86a[0].length;
        f88a[r] = f86a[0][0].length;
        f88a[s] = this.f67a.m27a(1);
        f88a[t] = this.f67a.m28b(1);
        f88a[u] = this.f67a.f117a;
        f88a[u] = this.f67a.f117a;
        f88a[v] = 0;
        f88a[w] = 0;
        f88a[x] = 0;
        f92b[o] = (r.c / this.f68b.m27a(1)) + (r.c % this.f68b.m27a(1) > 0 ? 2 : 1);
        f92b[p] = f90b[0].length;
        f92b[q] = f90b[0][0].length;
        f92b[r] = f90b[0].length;
        f92b[s] = this.f68b.m27a(1);
        f92b[t] = this.f68b.m28b(1);
        f92b[u] = this.f68b.f117a;
        f89c = new byte[f92b[o]][f92b[p]];
        f96c[o] = (r.c / this.f69c.m27a(1)) + (r.c % this.f69c.m27a(1) > 0 ? 2 : 1);
        f96c[p] = f94c[0].length;
        f96c[q] = f94c[0][0].length;
        f96c[r] = f94c[0].length;
        f96c[s] = this.f69c.m27a(1);
        f96c[t] = this.f69c.m28b(1);
        f96c[u] = this.f69c.f117a;
        f93d = new byte[f96c[o]][f96c[p]];
        f100d[o] = (r.c / this.f70d.m27a(1)) + (r.c % this.f70d.m27a(1) > 0 ? 2 : 1);
        f100d[p] = f98d[0].length;
        f100d[q] = f98d[0][0].length;
        f100d[r] = f98d[0].length;
        f100d[s] = this.f70d.m27a(1);
        f100d[t] = this.f70d.m28b(1);
        f100d[u] = this.f70d.f117a;
        f100d[v] = (this.E + this.f70d.m28b(1)) - ((f100d[r] - 1) * this.f70d.m28b(1));
        f100d[w] = f100d[v];
        f96c[v] = (((this.E + this.f70d.m28b(1)) - (this.f70d.m28b(1) / 2)) + this.f69c.m28b(1)) - ((f96c[r] - 1) * this.f69c.m28b(1));
        f96c[w] = f96c[v] + (this.f70d.m28b(1) / 2);
        f92b[v] = (((((this.E + this.f70d.m28b(1)) - (this.f70d.m28b(1) / 2)) + this.f69c.m28b(1)) - (this.f69c.m28b(1) / 2)) + this.f68b.m28b(1)) - this.f68b.m28b(1);
        f92b[w] = f92b[v] + (this.f69c.m28b(1) / 2);
        f97e = new byte[f100d[o]][f100d[p]];
        f52c = f87b[k.o].length;
        f65o = f52c * f79v;
        f66p = f80w;
        f59j = f65o * f53d;
        f60k = f66p * f54e;
        f62m = f59j << 16;
        f61l = f60k << 16;
        this.f73q = f80w * f54e;
        y = 6225920;
        z = 5898240;
        A = 1310;
        B = 3932;
        C = 6225920;
        D = 13107200;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [int[][], int[][][]] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int[][], int[][][]] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int[][], int[][][]] */
    private static void a(String str) throws Exception {
        DataInputStream dataInputStreamA = l.a(str);
        int length = 0;
        int length2 = 0;
        int length3 = 0;
        int i2 = dataInputStreamA.readInt();
        f79v = dataInputStreamA.readInt();
        f80w = dataInputStreamA.readInt();
        f86a = new byte[i2][f79v][f80w];
        for (int i3 = 0; i3 < f86a.length; i3++) {
            for (int i4 = 0; i4 < f80w; i4++) {
                for (int i5 = 0; i5 < f79v; i5++) {
                    f86a[i3][i5][i4] = dataInputStreamA.readByte();
                }
            }
        }
        f82a = new int[i2][];
        for (int i6 = 0; i6 < f86a.length; i6++) {
            f82a[i6] = new int[dataInputStreamA.readInt()][3];
        }
        for (int i7 = 0; i7 < f86a.length; i7++) {
            for (int i8 = 0; i8 < f82a[i7].length; i8++) {
                byte b2 = dataInputStreamA.readByte();
                byte b3 = dataInputStreamA.readByte();
                byte b4 = dataInputStreamA.readByte();
                f82a[i7][i8][0] = b2;
                f82a[i7][i8][1] = b3;
                f82a[i7][i8][2] = b4;
            }
        }
        f83b = new int[i2][];
        for (int i9 = 0; i9 < f86a.length; i9++) {
            f83b[i9] = new int[dataInputStreamA.readInt()][3];
        }
        for (int i10 = 0; i10 < f86a.length; i10++) {
            for (int i11 = 0; i11 < f83b[i10].length; i11++) {
                byte b5 = dataInputStreamA.readByte();
                byte b6 = dataInputStreamA.readByte();
                byte b7 = dataInputStreamA.readByte();
                f83b[i10][i11][0] = b5;
                f83b[i10][i11][1] = b6;
                f83b[i10][i11][2] = b7;
            }
        }
        f84c = new int[i2][];
        for (int i12 = 0; i12 < f86a.length; i12++) {
            f84c[i12] = new int[dataInputStreamA.readInt()][3];
        }
        for (int i13 = 0; i13 < f86a.length; i13++) {
            for (int i14 = 0; i14 < f84c[i13].length; i14++) {
                byte b8 = dataInputStreamA.readByte();
                byte b9 = dataInputStreamA.readByte();
                byte b10 = dataInputStreamA.readByte();
                f84c[i13][i14][0] = b8;
                f84c[i13][i14][1] = b9;
                f84c[i13][i14][2] = b10;
            }
        }
        for (int i15 = 0; i15 < f87b[k.o].length; i15++) {
            length3 += f82a[f87b[k.o][i15]].length;
            length2 += f83b[f87b[k.o][i15]].length;
            length += f84c[f87b[k.o][i15]].length;
        }
        a.f14c = new int[length3];
        a.f15d = new int[length3];
        a.f16e = new int[length3];
        a.f17f = new int[length3];
        a.f18g = new int[length2];
        a.f19h = new int[length2];
        a.f20i = new int[length2];
        a.f21j = new int[length2];
        a.f22k = new int[length];
        a.f23l = new int[length];
        a.f24m = new int[length];
        a.f25n = new int[length];
        int i16 = 0;
        for (int i17 = 0; i17 < f87b[k.o].length; i17++) {
            for (int i18 = 0; i18 < f82a[f87b[k.o][i17]].length; i18++) {
                int i19 = i17 * f79v;
                a.f14c[i16] = f82a[f87b[k.o][i17]][i18][0];
                a.f15d[i16] = f82a[f87b[k.o][i17]][i18][1] + i19;
                a.f16e[i16] = f82a[f87b[k.o][i17]][i18][2];
                a.f17f[i16] = 2;
                i16++;
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < f87b[k.o].length; i21++) {
            for (int i22 = 0; i22 < f83b[f87b[k.o][i21]].length; i22++) {
                int i23 = i21 * f79v;
                a.f18g[i20] = f83b[f87b[k.o][i21]][i22][0];
                a.f19h[i20] = f83b[f87b[k.o][i21]][i22][1] + i23;
                a.f20i[i20] = f83b[f87b[k.o][i21]][i22][2];
                a.f21j[i20] = 2;
                i20++;
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < f87b[k.o].length; i25++) {
            for (int i26 = 0; i26 < f84c[f87b[k.o][i25]].length; i26++) {
                int i27 = i25 * f79v;
                a.f22k[i24] = f84c[f87b[k.o][i25]][i26][0];
                a.f23l[i24] = f84c[f87b[k.o][i25]][i26][1] + i27;
                a.f24m[i24] = f84c[f87b[k.o][i25]][i26][2];
                a.f25n[i24] = 2;
                i24++;
            }
        }
        dataInputStreamA.close();
        f82a = (int[][][]) null;
        f83b = (int[][][]) null;
        f84c = (int[][][]) null;
        System.gc();
    }

    private static int[] a() throws Exception {
        DataInputStream dataInputStreamA = l.a("palettesScroll.bin");
        int i2 = a.g;
        int[] iArr = null;
        int i3 = dataInputStreamA.readShort();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = dataInputStreamA.readShort();
            if (i4 == i2) {
                iArr = new int[i5];
            }
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = dataInputStreamA.readInt();
                if (i4 == i2) {
                    iArr[i6] = i7;
                }
            }
        }
        dataInputStreamA.close();
        return iArr;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6a() {
        f76s = -1;
        for (int i2 = 0; i2 < f75a.length; i2++) {
            f75a[i2][0] = -1;
        }
    }

    public final void b() {
        if (this.f67a != null) {
            this.f67a = null;
        }
        if (this.f68b != null) {
            this.f68b = null;
        }
        if (this.f69c != null) {
            this.f69c = null;
        }
        if (this.f70d != null) {
            this.f70d = null;
        }
        if (f86a != null) {
            f86a = (byte[][][]) null;
        }
        if (f85a != null) {
            f85a = (byte[][]) null;
        }
        if (f88a != null) {
            f88a = null;
        }
        if (f86a != null) {
            f90b = (byte[][][]) null;
        }
        if (f85a != null) {
            f89c = (byte[][]) null;
        }
        if (f88a != null) {
            f92b = null;
        }
        if (f86a != null) {
            f94c = (byte[][][]) null;
        }
        if (f85a != null) {
            f93d = (byte[][]) null;
        }
        if (f88a != null) {
            f96c = null;
        }
        if (f86a != null) {
            f98d = (byte[][][]) null;
        }
        if (f85a != null) {
            f97e = (byte[][]) null;
        }
        if (f88a != null) {
            f100d = null;
        }
        System.gc();
    }

    private static int c(int i2) {
        return i2 % f53d;
    }

    public static int a(int i2) {
        return i2 + (f57h - c(i2));
    }

    private static int d(int i2) {
        return (int) (((i2 << 16) / f55f) >> 16);
    }

    private static int e(int i2) {
        return (i2 >> 16) / f54e;
    }

    public static int a(int i2, int i3) {
        return b(d(i2), e(i3));
    }

    public static void a(int i2, int i3, int i4) {
        int iD = d(i2);
        int iE = e(i3);
        int i5 = iD % f79v;
        int i6 = iD / f79v;
        int i7 = f81x * (i6 / f52c);
        if (iE < 0 || iE >= f80w || iD < 0 || iD >= f52c * f79v) {
            return;
        }
        f86a[f87b[k.o][i6 - i7]][i5][iE] = (byte) i4;
    }

    private static int b(int i2, int i3) {
        int i4 = i2 % f79v;
        int i5 = i2 / f79v;
        int i6 = f81x * (i5 / f52c);
        if (i3 < 0) {
            return 0;
        }
        if (i3 >= f80w) {
            return -123;
        }
        if (i2 < 0) {
            return -124;
        }
        if (i2 > f52c * f79v) {
            return -125;
        }
        byte b2 = f86a[f87b[k.o][i5 - i6]][i4][i3];
        int i7 = b2;
        if (b2 < 0) {
            i7 += 256;
        }
        return i7;
    }

    private static boolean h(int i2) {
        return m12b(i2) == 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m7a(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return i2 == 41 || i2 == 23;
    }

    public static boolean b(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return i2 == 48 || i2 == 35 || i2 == 131 || i2 == 39 || i2 == 50;
    }

    /* renamed from: c, reason: collision with other method in class */
    public static boolean m8c(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return i2 == 102 || i2 == 89 || i2 == 132;
    }

    /* renamed from: d, reason: collision with other method in class */
    public static boolean m9d(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return m12b(i2) == 28;
    }

    /* renamed from: e, reason: collision with other method in class */
    public static boolean m10e(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return m9d(i2) || m8c(i2) || b(i2);
    }

    public static boolean f(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        if (i2 == 62 || i2 == 63 || i2 == 64 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10 || i2 == 11) {
            return true;
        }
        if (i2 == 12 && f46a == 0) {
            return true;
        }
        return i2 == 18 && f46a == 1;
    }

    public static boolean g(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        if (i2 == 68 || i2 == 69 || i2 == 70 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 16 || i2 == 17) {
            return true;
        }
        if (i2 == 18 && f46a == 0) {
            return true;
        }
        return i2 == 12 && f46a == 1;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m11a(int i2, int i3) {
        if (i2 < 0) {
            i2 += 256;
        }
        return i3 == 2 || i3 != 3 || i2 == 41 || i2 == 23 || i2 == 95 || i2 == 24 || m10e(i2);
    }

    private static boolean i(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        return i2 == 28 || i2 == 29 || i2 == 82 || i2 == 21 || i2 == 22 || i2 == 30 || i2 == 31 || i2 == 32 || i2 == 23 || i2 == 54;
    }

    private byte a(byte b2) {
        switch (b2) {
            case 53:
                if (this.f64n % 4 != 0) {
                    break;
                }
                break;
            case 54:
                if (this.f64n % 4 != 0) {
                    break;
                }
                break;
        }
        return b2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static int m12b(int i2) {
        if (i2 < 0) {
            i2 += 256;
        }
        switch (i2) {
            case -125:
                break;
            case -124:
                break;
            case -123:
                break;
            case -122:
                break;
            default:
                switch (i2) {
                }
        }
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int[] m13a(int i2) {
        int iM12b = m12b(i2);
        int i3 = f54e;
        int i4 = f54e;
        int i5 = 0;
        int i6 = f53d;
        int i7 = 270;
        int i8 = 64880;
        int i9 = 65536;
        int i10 = 0;
        if (g(i2) || f(i2)) {
            i8 = 65536;
        }
        switch (iM12b) {
            case 1:
                i7 = 0;
                i3 = 2;
                i4 = 2;
                break;
            case 2:
                i7 = 0;
                i3 = f58i + 2;
                i4 = f58i + 2;
                break;
            case 3:
                i7 = 25;
                i5 = 4;
                i3 = f54e;
                i4 = f58i + 2;
                i9 = y / 100;
                i10 = -A;
                break;
            case 4:
                i7 = 25;
                i3 = f58i + 2;
                i4 = 2;
                i9 = y / 100;
                i10 = -A;
                break;
            case 5:
                i7 = 45;
                i5 = 2;
                i6 = f53d;
                i3 = f54e;
                i4 = 2;
                i9 = z / 100;
                i10 = -B;
                break;
            case 6:
                i7 = 334;
                i6 = f53d - 4;
                i3 = f58i + 2;
                i4 = f54e;
                i9 = (D - y) / 100;
                i10 = A;
                break;
            case 7:
                i7 = 334;
                i3 = 2;
                i4 = f58i + 2;
                i9 = (D - y) / 100;
                i10 = A;
                break;
            case 8:
                i7 = 315;
                i5 = 0;
                i6 = f53d - 2;
                i3 = 2;
                i4 = f54e;
                i9 = (D - z) / 100;
                i10 = B;
                break;
            case 11:
                i7 = 25;
                i5 = 0;
                i6 = 4;
                i3 = 2;
                i4 = 0;
                i9 = y / 100;
                i10 = -A;
                break;
            case 12:
                i7 = 334;
                i5 = f53d - 4;
                i6 = f53d;
                i3 = 0;
                i4 = 2;
                i9 = (D - y) / 100;
                i10 = A;
                break;
            case 13:
            case 14:
            case 15:
            case 17:
            case 24:
                i5 = 0;
                i6 = f53d;
                i7 = 0;
                i3 = 2;
                i4 = 2;
                break;
            case 16:
                i5 = 0;
                i6 = f53d;
                i7 = 0;
                i3 = 2;
                i4 = 2;
                break;
            case 20:
                i5 = 2;
                i3 = 0;
                i6 = f53d;
                i4 = f54e - 2;
                i7 = -2;
                break;
            case 21:
                i5 = f53d - 2;
                i3 = 0;
                i4 = f54e - 2;
                i6 = 0;
                i7 = -3;
                break;
            case 22:
                i5 = 2;
                i6 = 2;
                i3 = 0;
                i4 = f54e;
                i8 = 0;
                i7 = 90;
                break;
            case 23:
                int i11 = f53d - 2;
                i5 = i11;
                i6 = i11;
                i3 = 0;
                i4 = f54e;
                i7 = 90;
                break;
            case 25:
                i7 = 25;
                i5 = 0;
                i6 = 2;
                i3 = 2;
                i4 = 0;
                i9 = y / 100;
                i10 = -A;
                break;
            case 26:
                i7 = 334;
                i5 = f53d - 2;
                i6 = f53d;
                i3 = 0;
                i4 = 2;
                i9 = (D - y) / 100;
                i10 = A;
                break;
            case 28:
                i5 = 0;
                i6 = f53d;
                int i12 = f54e - 2;
                i3 = i12;
                i4 = i12;
                i7 = -1;
                break;
            case 29:
                i5 = 0;
                i3 = f54e - 2;
                i6 = 2;
                i4 = f54e;
                i7 = -2;
                break;
            case 30:
                i5 = f53d;
                i3 = f54e - 2;
                i6 = f53d - 2;
                i4 = f54e;
                i7 = -3;
                break;
            case 31:
                i5 = 2;
                i6 = 2;
                i3 = 0;
                i4 = f58i + (f58i / 2);
                i8 = 0;
                i7 = 90;
                break;
            case 34:
                i7 = 0;
                i3 = 2;
                i4 = 2;
                i5 = f53d - (f53d / 6);
                break;
            case 35:
                i7 = 0;
                i3 = f58i + 2;
                i4 = f58i + 2;
                i5 = f53d - (f53d / 6);
                break;
            case 36:
                i7 = 0;
                i3 = 2;
                i4 = 2;
                i6 = f53d / 6;
                break;
            case 37:
                i7 = 0;
                i3 = f58i + 2;
                i4 = f58i + 2;
                i6 = f53d / 6;
                break;
        }
        int i13 = 65536;
        if (i9 != 65536) {
            i13 = (D / 100) - i9;
        }
        return new int[]{i7, i5 << 16, i3 << 16, i6 << 16, i4 << 16, i8, i9, i13, i10};
    }

    private static int[] a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 0;
        int i11 = 0;
        int i12 = (i6 * f53d) << 16;
        int i13 = (i7 * f54e) << 16;
        if (i6 < i8) {
            if (i7 < i9) {
                if (a(i2, i3, i4, i5, i12 + f55f, i13, i12 + f55f, i13 + f56g, false) != null) {
                    i10 = 0 + 1;
                } else {
                    if (a(i2, i3, i4, i5, i12, i13 + f56g, i12 + f55f, i13 + f56g, false) == null) {
                        return null;
                    }
                    i11 = 0 + 1;
                }
            } else if (i7 > i9) {
                if (a(i2, i3, i4, i5, i12 + f55f, i13, i12 + f55f, i13 + f56g, false) != null) {
                    i10 = 0 + 1;
                } else {
                    if (a(i2, i3, i4, i5, i12, i13, i12 + f55f, i13, false) == null) {
                        return null;
                    }
                    i11 = 0 - 1;
                }
            } else {
                if (a(i2, i3, i4, i5, i12 + f55f, i13, i12 + f55f, i13 + f56g, false) == null) {
                    return null;
                }
                i10 = 0 + 1;
            }
        } else if (i6 > i8) {
            if (i7 < i9) {
                if (a(i2, i3, i4, i5, i12, i13, i12, i13 + f56g, false) != null) {
                    i10 = 0 - 1;
                } else {
                    if (a(i2, i3, i4, i5, i12, i13 + f56g, i12 + f55f, i13 + f56g, false) == null) {
                        return null;
                    }
                    i11 = 0 + 1;
                }
            } else if (i7 > i9) {
                if (a(i2, i3, i4, i5, i12, i13, i12, i13 + f56g, false) != null) {
                    i10 = 0 - 1;
                } else {
                    if (a(i2, i3, i4, i5, i12, i13, i12 + f55f, i13, false) == null) {
                        return null;
                    }
                    i11 = 0 - 1;
                }
            } else {
                if (a(i2, i3, i4, i5, i12, i13, i12, i13 + f56g, false) == null) {
                    return null;
                }
                i10 = 0 - 1;
            }
        } else if (i7 < i9) {
            if (a(i2, i3, i4, i5, i12, i13 + f56g, i12 + f55f, i13 + f56g, false) == null) {
                return null;
            }
            i11 = 0 + 1;
        } else if (i7 > i9) {
            if (a(i2, i3, i4, i5, i12, i13, i12 + f55f, i13, false) == null) {
                return null;
            }
            i11 = 0 - 1;
        }
        return new int[]{i6 + i10, i7 + i11};
    }

    private static int[] a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        long j2 = i4 - i2;
        long j3 = i5 - i3;
        long j4 = i9 - i7;
        long j5 = -(i8 - i6);
        long j6 = (j4 * i2) + (j5 * i3) + (((-i6) * j4) - (i7 * j5));
        if (z2 && j6 < 0) {
            return null;
        }
        long j7 = ((j4 * j2) + (j5 * j3)) >> 16;
        if (j7 == 0) {
            return null;
        }
        long j8 = -(j6 / j7);
        int i10 = i2 + ((int) ((j2 * j8) >> 16));
        int i11 = i3 + ((int) ((j3 * j8) >> 16));
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(i2, i4);
        int iMin2 = Math.min(i3, i5);
        int iMax2 = Math.max(i3, i5);
        int iMin3 = Math.min(i6, i8);
        int iMax3 = Math.max(i6, i8);
        int iMin4 = Math.min(i7, i9);
        int iMax4 = Math.max(i7, i9);
        if (i10 < iMin - 13107 || i10 < iMin3 - 13107 || i10 > iMax + 13107 || i10 > iMax3 + 13107 || i11 < iMin2 - 13107 || i11 < iMin4 - 13107 || i11 > iMax2 + 13107 || i11 > iMax4 + 13107) {
            return null;
        }
        return new int[]{i10, i11};
    }

    public final int[] a(int i2, int i3, int i4, int i5, int i6, boolean z2) {
        int[] iArrA;
        try {
            int i7 = (i2 >> 16) / f53d;
            int i8 = (i3 >> 16) / f54e;
            int i9 = (i4 >> 16) / f53d;
            int i10 = (i5 >> 16) / f54e;
            int i11 = i7;
            int i12 = i8;
            int[] iArr = new int[3];
            while (true) {
                boolean z3 = true;
                int iB = b(i11, i12);
                int[] iArrM13a = m13a(iB);
                iArr[l] = iArrM13a[a];
                if (i6 == 0 || i6 == 3 || (i6 == 2 && m10e(iB))) {
                    z3 = false;
                }
                int i13 = (i11 * f53d) << 16;
                int i14 = (i12 * f54e) << 16;
                if (z2 && i(iB)) {
                    int i15 = f76s + 1;
                    f76s = i15;
                    if (i15 > f75a.length - 1) {
                        f76s = -1;
                    }
                    f75a[f76s][0] = iB;
                    f75a[f76s][1] = i13;
                    f75a[f76s][2] = i14;
                }
                if (i11 == i9 && i12 == i10) {
                    if (h(iB) || (iArrA = a(i2, i3, i4, i5, i13 + iArrM13a[b], i14 + iArrM13a[c], i13 + iArrM13a[d], i14 + iArrM13a[e], z3)) == null || !m11a(iB, i6)) {
                        return null;
                    }
                    iArr[j] = iArrA[j];
                    iArr[k] = iArrA[k];
                    return iArr;
                }
                if (h(iB)) {
                    int[] iArrA2 = a(i2, i3, i4, i5, i11, i12, i9, i10);
                    if (iArrA2 == null) {
                        return null;
                    }
                    i11 = iArrA2[m];
                    i12 = iArrA2[n];
                } else {
                    int[] iArrA3 = a(i2, i3, i4, i5, i13 + iArrM13a[b], i14 + iArrM13a[c], i13 + iArrM13a[d], i14 + iArrM13a[e], z3);
                    if (iArrA3 == null) {
                        int[] iArrA4 = a(i2, i3, i4, i5, i11, i12, i9, i10);
                        if (iArrA4 == null) {
                            return null;
                        }
                        i11 = iArrA4[m];
                        i12 = iArrA4[n];
                    } else {
                        if (m11a(iB, i6)) {
                            iArr[j] = iArrA3[j];
                            iArr[k] = iArrA3[k];
                            return iArr;
                        }
                        int[] iArrA5 = a(i2, i3, i4, i5, i11, i12, i9, i10);
                        if (iArrA5 == null) {
                            return null;
                        }
                        i11 = iArrA5[m];
                        i12 = iArrA5[n];
                    }
                }
            }
        } catch (Exception e2) {
            System.out.println(new StringBuffer().append("Error cutPoint ").append(e2).toString());
            e2.printStackTrace();
            return null;
        }
    }

    private static void a(int[] iArr) {
        iArr[x] = iArr[v] + ((iArr[w] - iArr[v]) - (((iArr[w] - iArr[v]) * a.d) / (f60k - r.d)));
        if (iArr[x] < iArr[v]) {
            iArr[x] = iArr[v];
        } else if (iArr[x] > iArr[w]) {
            iArr[x] = iArr[w];
        }
    }

    private static void a(int i2, int i3, byte[][] bArr, byte[][][] bArr2, byte[] bArr3, int i4, int i5, int i6, int i7) {
        int length = bArr.length;
        int length2 = bArr[0].length;
        int length3 = bArr3.length;
        int i8 = i2 / i6;
        int i9 = i8 % i4;
        int length4 = (i8 / i4) % bArr3.length;
        int i10 = (i3 / i7) % i5;
        for (int i11 = 0; i11 < length; i11++) {
            if (i9 >= i4) {
                i9 = 0;
                length4++;
                if (length4 >= length3) {
                    length4 = 0;
                }
            } else if (i9 < 0) {
                length4--;
                if (length4 < 0) {
                    length4 = bArr2.length - 1;
                }
            }
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i12 + i10;
                if (i13 >= i5 || i13 < 0) {
                    bArr[i11][i12] = 0;
                } else {
                    bArr[i11][i12] = bArr2[bArr3[length4]][i9][i10 + i12];
                    if (bArr[i11][i12] == 12) {
                        if (f46a == 1) {
                            bArr[i11][i12] = 18;
                        }
                    } else if (bArr[i11][i12] == 18 && f46a == 1) {
                        bArr[i11][i12] = 12;
                    }
                }
            }
            i9++;
        }
    }

    private static void a(int i2, byte[][] bArr, byte[][][] bArr2, byte[] bArr3, int i3, int i4) {
        int length = bArr[0].length;
        int length2 = bArr3.length;
        int i5 = i2 / i4;
        int i6 = i5 % i3;
        int length3 = (i5 / i3) % bArr3.length;
        for (byte[] bArr4 : bArr) {
            if (i6 >= i3) {
                i6 = 0;
                length3++;
                if (length3 >= length2) {
                    length3 = 0;
                }
            } else if (i6 < 0) {
                length3--;
                if (length3 < 0) {
                    length3 = bArr2.length - 1;
                }
            }
            for (int i7 = 0; i7 < length; i7++) {
                bArr4[i7] = bArr2[bArr3[length3]][i7][i6];
            }
            i6++;
        }
    }

    public final void c() {
        this.f64n++;
        if (this.f64n > 20000) {
            this.f64n = 1;
        }
        if (this.f64n % f47b == 0) {
            if (f46a == 0) {
                f46a = 1;
            } else if (f46a == 1) {
                f46a = 0;
            }
        }
        a(f92b);
        a(a.c / 2, f89c, f90b, f91a, f92b[q], f92b[s]);
        a(f96c);
        a(a.c / 10, f97e, f98d, f99c, f100d[q], f100d[s]);
        a(f100d);
        a(a.c / 4, f93d, f94c, f95b, f96c[q], f96c[s]);
        a(a.c, a.d, f85a, f86a, f87b[k.o], f79v, f80w, f88a[s], f88a[t]);
    }

    private void a(Graphics graphics, int i2, int i3, f fVar, byte[][] bArr, int i4, int i5, int i6, boolean z2) {
        int i7;
        int i8;
        int iM27a = fVar.m27a(1);
        int iM28b = fVar.m28b(1);
        int i9 = i5 - 1;
        if (!z2) {
            i9 = i5;
        }
        int i10 = i9 * 2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= bArr.length || (i7 = i13 - (i2 % iM27a)) > r.c) {
                return;
            }
            int i14 = 0;
            int i15 = i4;
            while (true) {
                int i16 = i15;
                if (i14 < bArr[0].length) {
                    byte bA = a(bArr[i11][i14]);
                    int i17 = bA;
                    if (bA < 0) {
                        i17 += 256;
                    }
                    if (i17 != 0) {
                        int i18 = 0;
                        if (i17 >= i10) {
                            i8 = i10;
                            i18 = 16384;
                        } else if (i17 >= i5) {
                            i8 = i9;
                            i18 = 8192;
                        } else {
                            i8 = 0;
                        }
                        int i19 = i17 - i8;
                        int i20 = i16;
                        if (z2) {
                            i20 = i16 - (i3 % iM28b);
                        }
                        fVar.a(graphics, i19, i7, i20, i6, i18);
                    }
                    i14++;
                    i15 = i16 + iM28b;
                }
            }
            i11++;
            i12 = i13 + iM27a;
        }
    }

    public final void d() {
        int i2 = this.E + 3;
        i.a(250, 0, 0, r.c, i2);
        this.f49a = Image.createImage(r.c, i2);
        f48a = this.f49a.getGraphics();
        f48a.setColor(0, 0, 0);
        f48a.fillRect(0, 0, r.c, r.d);
        i.a(f48a, 0, 0, r.c, i2, 100, -5, -5, -5, 200, 0, 255);
        i.a(f48a);
        this.f71e.a(f48a, 0, r.c, i2, -16777176, 0);
        for (int i3 = 0; i3 < (r.c / this.f72f.m27a(0)) + 1; i3++) {
            this.f72f.a(f48a, 0, r.e, i2, -16777183, 0);
        }
        i.f154a = (short[][]) null;
        this.f71e = null;
        this.f72f = null;
        System.gc();
    }

    public final void a(Graphics graphics) {
        graphics.drawImage(this.f49a, 0, 0, 20);
        a(graphics, a.c / 10, a.d, this.f70d, f97e, f100d[x], f100d[u], -16777180, false);
        a(graphics, a.c / 4, a.d, this.f69c, f93d, f96c[x], f96c[u], -16777180, false);
        a(graphics, a.c / 2, a.d, this.f68b, f89c, f92b[x], f92b[u], -16777180, false);
    }

    public final void b(Graphics graphics) {
        a(graphics, a.c, a.d, this.f67a, f85a, f88a[v], f88a[u], -16777196, true);
    }
}
