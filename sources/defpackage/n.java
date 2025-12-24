package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:n.class */
public abstract class n extends s {
    public static String[] b = {"runner.is", "techSigma.is", "techRocket.is", "techTagma.is", "techBalrog.is"};
    public static String[] c = {"zack", "cebian", "sidkas", "riles", "sigma", "sigma alpha", "sigma beta", "sigma gamma", "rocket", "rocket alpha", "rocket beta", "rocket gamma", "tagma", "tagma alpha", "tagma beta", "tagma gamma", "balrog", "balrog alpha", "balrog beta", "balrog gamma", "caronte"};
    public static final int[] a = {14, 100, 100, 100};

    /* renamed from: b, reason: collision with other field name */
    public static final int[] f180b = {6, 0, 0, 30};

    /* renamed from: a, reason: collision with other field name */
    public static int[][] f181a = {new int[]{12, 50, 50, 100}, new int[]{6, 38, 45, 70}, new int[]{8, 80, 85, 40}, new int[]{9, 55, 35, 80}, new int[]{10, 55, 50, 60}, new int[]{9, 55, 35, 65}, new int[]{9, 65, 30, 70}, new int[]{9, 75, 30, 75}, new int[]{10, 70, 30, 75}, new int[]{8, 100, 55, 60}, new int[]{9, 95, 45, 70}, new int[]{9, 90, 70, 70}, new int[]{11, 40, 35, 80}, new int[]{9, 45, 20, 75}, new int[]{10, 35, 25, 80}, new int[]{11, 35, 20, 85}, new int[]{14, 35, 40, 70}, new int[]{11, 35, 45, 55}, new int[]{11, 55, 35, 65}, new int[]{12, 35, 35, 75}, new int[]{12, 40, 20, 80}};

    /* renamed from: b, reason: collision with other field name */
    public static int[][] f182b = {new int[]{12, 40, 40, 100}, new int[]{9, 35, 50, 80}, new int[]{9, 60, 80, 40}, new int[]{10, 50, 40, 90}, new int[]{10, 50, 50, 70}, new int[]{10, 50, 40, 75}, new int[]{10, 60, 35, 80}, new int[]{10, 70, 35, 85}, new int[]{10, 65, 30, 85}, new int[]{9, 100, 60, 70}, new int[]{10, 90, 50, 80}, new int[]{10, 85, 75, 80}, new int[]{11, 35, 35, 90}, new int[]{10, 40, 20, 85}, new int[]{11, 30, 30, 90}, new int[]{12, 30, 20, 95}, new int[]{14, 30, 40, 80}, new int[]{12, 30, 50, 65}, new int[]{12, 50, 40, 75}, new int[]{13, 30, 40, 85}, new int[]{13, 35, 20, 90}};

    /* renamed from: c, reason: collision with other field name */
    public static int[][] f183c = {new int[]{12, 35, 20, 100}, new int[]{10, 50, 50, 80}, new int[]{9, 70, 70, 50}, new int[]{11, 45, 40, 90}, new int[]{10, 50, 50, 70}, new int[]{10, 50, 45, 80}, new int[]{10, 60, 40, 80}, new int[]{10, 70, 45, 85}, new int[]{10, 65, 30, 85}, new int[]{9, 100, 70, 70}, new int[]{10, 90, 60, 80}, new int[]{10, 85, 80, 80}, new int[]{11, 35, 35, 90}, new int[]{10, 50, 20, 85}, new int[]{11, 40, 30, 90}, new int[]{12, 40, 25, 95}, new int[]{14, 30, 40, 80}, new int[]{12, 30, 60, 65}, new int[]{13, 50, 50, 75}, new int[]{14, 35, 40, 90}, new int[]{13, 35, 30, 95}};
    private static int[][] e;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* renamed from: c, reason: collision with other field name */
    public boolean f184c;

    /* renamed from: d, reason: collision with other field name */
    public boolean f185d;

    /* renamed from: e, reason: collision with other field name */
    public boolean f186e;
    public boolean f;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int U;
    public boolean m;
    public int V;
    public int W;

    /* renamed from: t, reason: collision with other field name */
    private boolean f187t;
    public int s = 19;
    public int t = 20;
    private int[] d = {0, -11927481, -8060800, -7368817, -3684409, -1, -4783951};
    public int J = 589824;
    public int K = 720896;
    public int L = 851968;
    public int M = 917504;
    public int N = 1310720;
    public int O = 65536;
    public int P = 1048576;
    public int Q = 65536;
    public int R = 1179648;
    public int S = 65536;
    public int T = 1310720;

    @Override // defpackage.s
    public void a() throws Exception {
        super.a();
        this.f186e = false;
        this.f = false;
        this.f185d = false;
        this.f184c = false;
        this.l = false;
        this.k = false;
        this.j = false;
        this.i = false;
        this.h = false;
        this.g = false;
        this.E = 0;
        this.D = 0;
        this.B = 0;
        this.C = 0;
        this.F = 0;
        this.q = true;
        this.f187t = true;
        this.af = 2;
        this.ah = 0;
        this.w = 11;
        this.v = 18;
        this.x = 31;
        this.ab = 8;
        this.y = 3;
        this.z = 7;
        this.ak = 6553;
        this.w = ((this.w * c.f53d) / 25) << 16;
        this.v = ((this.v * c.f53d) / 25) << 16;
        this.x = ((this.x * c.f53d) / 25) << 16;
        this.ab = ((this.ab * c.f53d) / 25) << 16;
        this.y = ((this.y * c.f53d) / 25) << 16;
        this.z = ((this.z * c.f53d) / 25) << 16;
        this.W = 33;
        if (k.l == 0) {
            e = f181a;
        } else if (k.l == 1) {
            e = f182b;
        } else {
            e = f183c;
        }
        this.N = e[this.r][0] << 16;
        this.I = (e[this.r][1] << 16) / 100;
        this.H = ((a[2] - e[this.r][2]) * 20) / a[2];
        this.U = e[this.r][3];
        this.ag = this.N;
        A();
        if (this.r != 20) {
            this.f129a.a(m50a());
        } else {
            this.f129a.a(this.d);
        }
        this.ap = f130a.f7a.f129a.m28b(this.W) << 16;
        if (this.ap > c.f56g - 65536) {
            this.ap = c.f56g - 65536;
        }
        this.aq = this.ap;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [byte[], byte[][]] */
    private void A() throws Exception {
        DataInputStream dataInputStreamA = l.a("sequences.bin");
        int i = dataInputStreamA.readShort();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInputStreamA.readShort();
            if (i2 == this.V) {
                this.f126a = new byte[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = dataInputStreamA.readShort();
                if (i2 == this.V) {
                    this.f126a[i4] = new byte[i5];
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    byte b2 = dataInputStreamA.readByte();
                    if (i2 == this.V) {
                        this.f126a[i4][i6] = b2;
                    }
                }
            }
        }
        dataInputStreamA.close();
    }

    /* renamed from: a, reason: collision with other method in class */
    private int[] m50a() throws Exception {
        DataInputStream dataInputStreamA = l.a("palettesRunner.bin");
        int i = this.u + 1;
        int[] iArr = null;
        int i2 = dataInputStreamA.readShort();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = dataInputStreamA.readShort();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = dataInputStreamA.readShort();
                if (i3 == this.V && i5 == i) {
                    iArr = new int[i6];
                }
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = dataInputStreamA.readInt();
                    if (i3 == this.V && i5 == i) {
                        iArr[i7] = i8;
                    }
                }
            }
        }
        dataInputStreamA.close();
        return iArr;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
            case 7:
                return 1;
            case 8:
            case 9:
            case 10:
            case 11:
                return 2;
            case 12:
            case 13:
            case 14:
            case 15:
                return 3;
            case 16:
            case 17:
            case 18:
            case 19:
                return 4;
            default:
                return 0;
        }
    }

    public static int a(int i, int i2) {
        switch (i) {
            case 0:
                switch (i2) {
                    case 0:
                        return 3;
                    case 1:
                        return 2;
                    case 2:
                        return 1;
                    case 3:
                        return 20;
                    default:
                        return 0;
                }
            case 1:
                switch (i2) {
                    case 0:
                        return 7;
                    case 1:
                        return 6;
                    case 2:
                        return 5;
                    default:
                        return 4;
                }
            case 2:
                switch (i2) {
                    case 0:
                        return 11;
                    case 1:
                        return 10;
                    case 2:
                        return 9;
                    default:
                        return 8;
                }
            case 3:
                switch (i2) {
                    case 0:
                        return 15;
                    case 1:
                        return 14;
                    case 2:
                        return 13;
                    default:
                        return 12;
                }
            case 4:
                switch (i2) {
                    case 0:
                        return 19;
                    case 1:
                        return 18;
                    case 2:
                        return 17;
                    default:
                        return 16;
                }
            default:
                return -1;
        }
    }

    public final void g() {
        this.Z = this.c << 16;
        this.aa = this.d << 16;
    }

    public final void h() {
        this.c = this.Z >> 16;
        this.d = this.aa >> 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r8) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.d(int):void");
    }

    public final void i() {
        this.l = false;
        this.j = false;
        this.h = false;
        this.g = false;
    }

    public final void j() {
        this.k = false;
        this.i = false;
    }

    @Override // defpackage.s
    public final void k() throws Exception {
        if (this.q == 27 || this.q == 28) {
            d(29);
            return;
        }
        if (this.q == 23 || this.q == 24) {
            d(25);
        } else if (this.Y < 1966080) {
            d(12);
        } else {
            d(37);
        }
    }

    @Override // defpackage.s
    public final void l() throws Exception {
        d(31);
    }

    @Override // defpackage.s
    public final void m() throws Exception {
        d(18);
    }

    @Override // defpackage.s
    public final void n() throws Exception {
        d(27);
    }

    @Override // defpackage.s
    public final void o() throws Exception {
        d(27);
    }

    public final boolean b() {
        if (d()) {
            return false;
        }
        if ((this.q == 32 && this.i <= this.f126a[this.j].length / 3) || this.q == 16 || this.q == 0) {
            return false;
        }
        return this.q != 14 || this.i >= 4;
    }

    public final boolean c() {
        return this.q == 32 || this.q == 26 || this.q == 33 || this.q == 1 || this.q == 35 || this.q == 36 || this.q == 29 || this.q == 34 || this.q == 2 || this.q == 36 || this.q == 35 || this.q == 1 || this.q == 14 || this.q == 12 || this.q == 37 || this.q == 25 || this.q == 29;
    }

    public final boolean d() {
        return this.q == this.s || this.q == this.t || this.q == 18 || this.q == 22 || this.q == 21 || this.q == 24 || this.q == 23 || this.q == 24 || this.q == 31 || this.q == 27 || this.q == 29 || this.q == 28 || this.q == 30;
    }

    public final void p() {
        for (int i = 0; i < this.d.length; i++) {
            if (this.d[i][0] != -1) {
                int iM12b = c.m12b(this.d[i][0]);
                if (iM12b == 15) {
                    this.h = true;
                }
                if (iM12b == 16) {
                    this.g = true;
                }
                if (iM12b == 14) {
                    this.j = true;
                }
                if (iM12b == 18) {
                    this.k = true;
                }
                if (iM12b == 17) {
                    this.l = true;
                }
            }
        }
    }

    public final void e(int i) throws Exception {
        if (this.q == 0) {
            if (d()) {
                return;
            }
            if (a.f44a) {
                d(32);
                return;
            } else {
                this.f187t = false;
                return;
            }
        }
        if (this.l && i == 0 && (!d() || (this.q == 31 && b() <= 1))) {
            d(14);
            return;
        }
        if (d()) {
            return;
        }
        if (this.h && this.q != 17 && this.q != 16) {
            d(16);
            return;
        }
        if (this.i && i == 0) {
            d(15);
            return;
        }
        if (this.k && i == 0) {
            d(6);
            return;
        }
        if (this.j && i == 0) {
            d(9);
            return;
        }
        if (this.g && i == 0) {
            this.ai += 262144;
            return;
        }
        if (!this.r || this.j || this.g || this.h || this.i || this.k || !b() || i != 2) {
            return;
        }
        d(6);
    }

    public final void f(int i) throws Exception {
        if (this.q == 16) {
            this.ah = this.I;
            this.ai += 262144;
            if (this.X > this.M) {
                d(2);
                return;
            }
            if (this.X > this.L) {
                d(36);
                return;
            }
            if (this.X > this.K) {
                d(35);
                return;
            } else if (this.X > this.J) {
                d(1);
                return;
            } else {
                d(33);
                return;
            }
        }
        if (this.q == 17) {
            this.ah = this.I;
            this.ai += 262144;
            d(33);
            return;
        }
        if (i <= 2) {
            if (this.r && !this.j && !this.g && !this.h && !this.i && !this.k && b()) {
                if (d()) {
                    return;
                }
                d(3);
            } else {
                if (this.q == 33 || this.q == 26 || this.h) {
                    return;
                }
                e(i);
            }
        }
    }

    public final void q() throws Exception {
        if (this.f186e) {
            int i = this.B + 1;
            this.B = i;
            if (i > 200) {
                this.B = 0;
                this.f186e = false;
            }
        }
        if (this.f) {
            int i2 = this.B + 1;
            this.B = i2;
            if (i2 > 200) {
                this.B = 0;
                this.f = false;
            }
        }
        if (this.f184c) {
            int i3 = this.C + 1;
            this.C = i3;
            if (i3 > 100) {
                this.f184c = false;
                this.C = 0;
            }
        }
        if (this.f185d) {
            int i4 = this.m;
            int iAbs = this.n + Math.abs(this.Y >> 16);
            if (this.X < 0) {
                i4 = -i4;
            }
            if (this.Y >= 0) {
                iAbs = -iAbs;
            }
            if (f130a.j % 20 == 0 && this.X > 2 * this.I) {
                f130a.a((this.Z >> 16) - i4, (this.aa >> 16) + iAbs, 0, 0, 0, this);
            }
            int i5 = this.D + 1;
            this.D = i5;
            if (i5 > 200) {
                this.f185d = false;
                this.D = 0;
            }
        }
    }

    public final void r() throws Exception {
        if (!this.r) {
            if (c()) {
                d(13);
                return;
            }
            if ((this.q == 7 || this.q == 10) && this.Y >= -458752) {
                d(8);
                return;
            }
            if (this.f132b) {
                if (this.q == 3) {
                    d(4);
                    return;
                }
                if (this.q == 4 && this.Y >= -983040) {
                    d(5);
                    return;
                }
                if (this.q == 5) {
                    d(13);
                    return;
                }
                if (this.q == 6) {
                    d(7);
                    return;
                }
                if (this.q == 7 && this.Y >= -983040) {
                    d(8);
                    return;
                }
                if (this.q == 8) {
                    d(13);
                    return;
                }
                if (this.q == 9) {
                    d(10);
                    return;
                }
                if (this.q == 10 && this.Y >= -983040) {
                    d(11);
                    return;
                }
                if (this.q == 11) {
                    d(13);
                    return;
                }
                if (this.q == 27) {
                    d(28);
                    return;
                }
                if (this.q == 15) {
                    d(13);
                    return;
                }
                if (this.q == 23) {
                    d(24);
                    return;
                }
                if (this.q == 22) {
                    if (this == f130a.f7a) {
                        a.h = 2;
                        this.f131a = false;
                        return;
                    } else {
                        this.f131a = false;
                        if (f130a.f7a.q == f130a.f7a.t) {
                            f130a.c();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!this.f132b || this.q == 0 || this.q == 17 || this.q == 30) {
            return;
        }
        if (this.q == 26) {
            d(33);
            return;
        }
        if (this.q == 31) {
            d(29);
            return;
        }
        if (this.q == 29) {
            d(30);
            return;
        }
        if (this.q == this.s) {
            d(this.t);
            return;
        }
        if (this.q == this.t) {
            if (this == f130a.f7a) {
                if (!f130a.f8a.f131a) {
                    f130a.c();
                    return;
                } else {
                    f130a.f36a = f130a.f8a;
                    return;
                }
            }
            return;
        }
        if (this.q == 22 && this.f131a) {
            if (this == f130a.f7a) {
                a.h = 2;
                this.f131a = false;
                return;
            } else {
                this.f131a = false;
                if (f130a.f7a.q == f130a.f7a.t) {
                    f130a.c();
                    return;
                }
                return;
            }
        }
        if (this.q == 18) {
            return;
        }
        if (this.q == 33 && this.X > this.J) {
            d(34);
            return;
        }
        if (this.q == 23) {
            d(25);
            return;
        }
        if (this.q == 24) {
            d(25);
            return;
        }
        if (this.q == 28) {
            d(29);
            return;
        }
        if (this.q == 16) {
            d(17);
            return;
        }
        if (this.q == 32) {
            d(33);
            return;
        }
        if (this.X > this.M) {
            d(2);
            return;
        }
        if (this.X > this.L) {
            d(36);
            return;
        }
        if (this.X > this.K) {
            d(35);
        } else if (this.X > this.J) {
            d(1);
        } else {
            d(33);
        }
    }

    public final void s() throws Exception {
        if (this.q == 30) {
            if (this.q == 30) {
                int i = this.F + 1;
                this.F = i;
                if (i > this.G) {
                    this.F = 0;
                    d(26);
                    return;
                }
                return;
            }
            return;
        }
        if (this.q == 21) {
            int i2 = this.E + 1;
            this.E = i2;
            if (i2 > 8) {
                this.E = 0;
                d(28);
            }
        }
    }

    private void B() throws Exception {
        if (this.q == 21) {
            if (this.Y < 327680) {
                this.ai = this.y;
                return;
            }
            this.X = 0;
            this.Y -= a.f;
            this.aj = 0;
            this.ah = 0;
            return;
        }
        if (this.r) {
            this.ah = this.I;
            this.ag = this.N;
            if (this.q == 0 || this.q == 17 || this.q == 30 || this.q == this.t || this.q == 18 || this.q == 22) {
                this.ah = 0;
                this.ag = 0;
                return;
            }
            if (this.q == 16) {
                this.ah = 0;
                if (this.X > 655360) {
                    this.ai -= 655360;
                    return;
                } else {
                    this.X = 0;
                    return;
                }
            }
            if (this.q == 29) {
                this.ah = 0;
                return;
            }
            if (this.q == 31) {
                this.ah = 0;
                return;
            }
            if (this.q == this.s) {
                this.ah = 0;
                if (this.Z > ((a.f41o + (2 * c.f53d)) << 16)) {
                    this.X = 0;
                    this.ah = 0;
                    this.Z = (a.f41o + (2 * c.f53d)) << 16;
                }
                if (this.X > 65536) {
                    this.ai -= 65536;
                    return;
                } else {
                    this.X = 0;
                    return;
                }
            }
            if (this.q == 18) {
                this.ah = 0;
                if (this.Z > ((a.f41o - c.f53d) << 16)) {
                    this.Z = (a.f41o - c.f53d) << 16;
                }
                if (this.X > 196608) {
                    this.ai -= 196608;
                    return;
                } else {
                    this.X = 0;
                    return;
                }
            }
            if (d()) {
                return;
            }
            int iA = c.a(this.Z, this.aa);
            if (c.f(iA)) {
                this.ah = this.O;
                this.ag = this.P;
                if (f130a.f7a != this) {
                    this.X = (int) ((this.X * this.a) >> 16);
                }
            } else if (c.g(iA)) {
                this.ah = this.O;
                this.ag = this.P;
                if (f130a.f7a == this) {
                    this.X = (int) ((this.X * this.a) >> 16);
                }
            }
            if (this.g) {
                this.ah = this.Q;
                this.ag = this.R;
            } else if (this.f184c) {
                this.ai = 131072;
                this.ah = this.S;
                this.ag = this.T;
            }
        }
    }

    public final void t() throws Exception {
        a(0, 0);
        q();
        if ((this == a.f38b && f130a.m2a((g) this).f131a) || this.f184c) {
            this.G = 3;
        } else {
            this.G = this.H;
        }
        if (this.q != 22) {
            y();
            B();
            c();
        }
        this.ao = b();
        s();
        r();
        h();
        p();
    }

    @Override // defpackage.g
    public final void a(Graphics graphics) throws Exception {
        a(graphics, this.c, this.d);
        if (this.s) {
            this.f129a.a(graphics, this.ao, (this.am >> 16) - a.c, (this.an >> 16) - a.d, -16777183, this.a);
        }
    }

    @Override // defpackage.g
    public final void f() {
        super.f();
        if (this.q == 14) {
            this.aq = this.ap / 10;
        } else {
            this.aq = this.ap;
        }
    }
}
