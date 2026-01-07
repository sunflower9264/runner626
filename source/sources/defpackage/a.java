package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:a.class */
public final class a extends o {
    private int r = 0;
    public int a = 30;
    public int b = 10;
    public static int c;
    public static int d;
    public static int e;
    public static int f;

    /* renamed from: c, reason: collision with other field name */
    private boolean f1c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f2d;

    /* renamed from: a, reason: collision with other field name */
    public static int[] f3a = {2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 3};

    /* renamed from: b, reason: collision with other field name */
    public static int[] f4b = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 0};
    public static int g;
    public static int h;
    public static int i;

    /* renamed from: a, reason: collision with other field name */
    private static f f5a;
    private int s;
    public int j;

    /* renamed from: a, reason: collision with other field name */
    public c f6a;

    /* renamed from: a, reason: collision with other field name */
    public p f7a;

    /* renamed from: a, reason: collision with other field name */
    public d f8a;

    /* renamed from: a, reason: collision with other field name */
    private q f9a;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: a, reason: collision with other field name */
    public n f10a;

    /* renamed from: a, reason: collision with other field name */
    private m[] f11a;

    /* renamed from: b, reason: collision with other field name */
    private m[] f12b;

    /* renamed from: c, reason: collision with other field name */
    private m[] f13c;

    /* renamed from: c, reason: collision with other field name */
    public static int[] f14c;

    /* renamed from: d, reason: collision with other field name */
    public static int[] f15d;

    /* renamed from: e, reason: collision with other field name */
    public static int[] f16e;

    /* renamed from: f, reason: collision with other field name */
    public static int[] f17f;

    /* renamed from: g, reason: collision with other field name */
    public static int[] f18g;

    /* renamed from: h, reason: collision with other field name */
    public static int[] f19h;

    /* renamed from: i, reason: collision with other field name */
    public static int[] f20i;

    /* renamed from: j, reason: collision with other field name */
    public static int[] f21j;

    /* renamed from: k, reason: collision with other field name */
    public static int[] f22k;

    /* renamed from: l, reason: collision with other field name */
    public static int[] f23l;

    /* renamed from: m, reason: collision with other field name */
    public static int[] f24m;

    /* renamed from: n, reason: collision with other field name */
    public static int[] f25n;

    /* renamed from: a, reason: collision with other field name */
    private short[][] f26a;

    /* renamed from: b, reason: collision with other field name */
    private short[][] f27b;

    /* renamed from: c, reason: collision with other field name */
    private short[][] f28c;
    private int t;
    private int u;

    /* renamed from: a, reason: collision with other field name */
    private t[] f29a;

    /* renamed from: b, reason: collision with other field name */
    private t[] f30b;

    /* renamed from: c, reason: collision with other field name */
    private t[] f31c;

    /* renamed from: a, reason: collision with other field name */
    private t f32a;

    /* renamed from: b, reason: collision with other field name */
    private t f33b;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;

    /* renamed from: e, reason: collision with other field name */
    private boolean f34e;

    /* renamed from: g, reason: collision with other field name */
    private boolean f35g;
    private static int B;
    private static int C;

    /* renamed from: a, reason: collision with other field name */
    public g f36a;

    /* renamed from: a, reason: collision with other field name */
    public static s f37a;

    /* renamed from: b, reason: collision with other field name */
    public static s f38b;
    private int[] o;
    private int[] p;
    private int[] q;
    private int D;

    /* renamed from: r, reason: collision with other field name */
    private int[] f39r;

    /* renamed from: s, reason: collision with other field name */
    private int[] f40s;

    /* renamed from: o, reason: collision with other field name */
    public static int f41o;

    /* renamed from: p, reason: collision with other field name */
    public static int f42p;

    /* renamed from: q, reason: collision with other field name */
    public int f43q;

    /* renamed from: a, reason: collision with other field name */
    public static boolean f44a;

    /* renamed from: b, reason: collision with other field name */
    public static boolean f45b;

    @Override // defpackage.o
    public final void a() throws Exception {
        this.f34e = false;
        this.f = true;
        n();
        this.f1c = true;
        this.f2d = true;
        do {
            f();
            do {
                l.a();
                this.j++;
                r();
                e();
                s();
                l.m42a();
                l.a(this.s);
                if (this.f35g) {
                    break;
                }
            } while (!this.f34e);
            i();
        } while (!this.f34e);
        r.e();
        e.b();
        this.f = false;
    }

    private void f() throws Exception {
        k.n = 0;
        k.m = 26;
        k.m = 26;
        r.e();
        e.b();
        this.f = false;
        if (k.f156a != 8) {
            if (k.o == 0 || k.f171e) {
                k.f162a.a(7, 31);
            }
            if (this.f2d) {
                k.f162a.a(19);
            }
        }
        l.m43b();
        this.f = true;
        this.f = false;
        if (this.f1c) {
            k.f162a.a(20);
        }
        this.f1c = false;
        if (k.f168b) {
            r.d();
            e.b();
        }
        this.f = true;
        System.gc();
        this.f35g = false;
        h = 0;
        k.f169c = true;
        g();
        h();
        h = 4;
        k.f169c = true;
    }

    public final void a(String str) {
        System.gc();
        k.n++;
        e();
        l.a(10L);
    }

    private void g() throws Exception {
        if (f5a == null) {
            f5a = new f("interface.is");
        }
        a("00");
    }

    private void h() throws Exception {
        a("0");
        this.s = 100;
        a("1");
        this.f6a = new c(this);
        a("2");
        f = ((2 * c.f53d) << 16) / 25;
        e = f << 16;
        f41o = (c.f59j - (4 * c.f53d)) - c.f53d;
        this.y = c.f53d;
        this.z = c.f54e;
        this.A = this.y / 2;
        this.A = this.y / 2;
        this.t = c.f77t;
        this.u = this.t * this.y;
        int i2 = (c.f65o / this.t) + 1;
        this.f26a = new short[i2][0];
        this.f27b = new short[i2][0];
        this.f28c = new short[i2][0];
        for (int i3 = 0; i3 < f14c.length; i3++) {
            int i4 = ((f15d[i3] * this.y) + this.y) / this.u;
            short[] sArr = new short[this.f26a[i4].length + 1];
            for (int i5 = 0; i5 < this.f26a[i4].length; i5++) {
                sArr[i5] = this.f26a[i4][i5];
            }
            this.f26a[i4] = sArr;
            this.f26a[i4][this.f26a[i4].length - 1] = (short) i3;
        }
        for (int i6 = 0; i6 < f22k.length; i6++) {
            int i7 = ((f23l[i6] * this.y) + this.A) / this.u;
            short[] sArr2 = new short[this.f27b[i7].length + 1];
            for (int i8 = 0; i8 < this.f27b[i7].length; i8++) {
                sArr2[i8] = this.f27b[i7][i8];
            }
            this.f27b[i7] = sArr2;
            this.f27b[i7][this.f27b[i7].length - 1] = (short) i6;
        }
        for (int i9 = 0; i9 < f18g.length; i9++) {
            int i10 = ((f19h[i9] * this.y) + this.A) / this.u;
            short[] sArr3 = new short[this.f28c[i10].length + 1];
            for (int i11 = 0; i11 < this.f28c[i10].length; i11++) {
                sArr3[i11] = this.f28c[i10][i11];
            }
            this.f28c[i10] = sArr3;
            this.f28c[i10][this.f28c[i10].length - 1] = (short) i9;
        }
        a("3");
        k.b();
        c = 0;
        d = 0;
        a("4");
        this.f7a = new p(this);
        this.f8a = new d(this);
        this.f9a = new q(this);
        a("5");
        if (g == 0) {
            this.r = 2;
        } else if (g == 1) {
            this.r = 3;
        } else if (g == 2) {
            this.r = 1;
        } else if (g == 3) {
            this.r = 4;
        }
        a("6");
        int i12 = c.f57h + (3 * this.y);
        if (k.f156a != 8) {
            this.f7a.a(i12, this.f6a.f73q - (1 * this.z), 1, 0, -1);
            this.f8a.a(this.f7a.c - (3 * c.f57h), this.f6a.f73q - (1 * this.z), 1, f4b[k.o], f3a[k.o]);
        } else {
            this.f7a.a(i12, this.f6a.f73q - (1 * this.z), 1, k.b, -1);
            this.f8a.a(this.f7a.c - (3 * c.f57h), this.f6a.f73q - (1 * this.z), 1, k.c, 0);
        }
        a("7");
        f37a = this.f7a;
        f38b = this.f8a;
        this.f9a.a();
        this.f36a = this.f7a;
        C = r.d - c.f54e;
        d = this.f36a.d - C;
        this.f6a.d();
        this.m = 10;
        this.l = 10;
        this.k = 10;
        this.n = 10;
        a("8");
        this.f13c = new m[this.m];
        this.f12b = new m[this.l];
        this.f11a = new m[this.k];
        this.f31c = new t[this.n];
        this.f29a = new t[2];
        this.f30b = new t[3];
        a("9");
        a("10");
        for (int i13 = 0; i13 < this.f31c.length; i13++) {
            this.f31c[i13] = new t();
        }
        for (int i14 = 0; i14 < this.f29a.length; i14++) {
            this.f29a[i14] = new t();
        }
        for (int i15 = 0; i15 < this.f30b.length; i15++) {
            this.f30b[i15] = new t();
        }
        System.gc();
        for (int i16 = 0; i16 < this.f11a.length; i16++) {
            this.f11a[i16] = new m();
        }
        a("11");
        for (int i17 = 0; i17 < this.f12b.length; i17++) {
            this.f12b[i17] = new m();
        }
        a("12");
        for (int i18 = 0; i18 < this.f13c.length; i18++) {
            this.f13c[i18] = new m();
        }
        a("13");
        this.f32a = new t();
        this.f33b = new t();
        a("14");
        this.v = 10;
        this.w = this.v;
        this.x = 40;
        this.f43q = 15;
        f42p = 0;
        f44a = false;
        f45b = false;
        this.D = 4;
        this.q = new int[10];
        this.o = new int[10];
        this.p = new int[10];
        this.f39r = new int[10];
        this.f40s = new int[10];
        i.a(this.q, -1);
        i.a(this.o, -1);
        i.a(this.p, -1);
        i.a(this.f39r, -1);
        i.a(this.f40s, -1);
        a("15");
        a(0, 0, 2, this.f7a);
        a(0, 0, 2, this.f8a);
        a("16");
        a(this.f7a.c - c.f57h, this.f7a.d - 3, 2);
        a("17");
        this.f32a.a(0, 0, 7, this.f7a);
        this.f33b.a(0, 0, 8, this.f7a);
        a("18");
        h = 1;
    }

    private void i() {
        l.m43b();
        System.gc();
        this.f6a.b();
        this.f6a = null;
        System.gc();
        this.f7a.b();
        this.f7a = null;
        System.gc();
        if (this.f8a != null) {
            this.f8a.b();
            this.f8a = null;
        }
        System.gc();
        if (this.f9a != null) {
            this.f9a.b();
            this.f9a = null;
        }
        if (g.f128a != null) {
            g.f128a = null;
        }
        if (g.f127a != null) {
            g.f127a = null;
        }
        System.gc();
        for (int i2 = 0; i2 < this.f11a.length; i2++) {
            if (this.f11a[i2] != null) {
                this.f11a[i2].b();
                this.f11a[i2] = null;
            }
        }
        for (int i3 = 0; i3 < this.f31c.length; i3++) {
            if (this.f31c[i3] != null) {
                this.f31c[i3].b();
                this.f31c[i3] = null;
            }
        }
        for (int i4 = 0; i4 < this.f29a.length; i4++) {
            if (this.f29a[i4] != null) {
                this.f29a[i4].b();
                this.f29a[i4] = null;
            }
        }
        for (int i5 = 0; i5 < this.f30b.length; i5++) {
            if (this.f30b[i5] != null) {
                this.f30b[i5].b();
                this.f30b[i5] = null;
            }
        }
        if (this.f32a != null) {
            this.f32a.b();
            this.f32a = null;
        }
        if (this.f33b != null) {
            this.f33b.b();
            this.f33b = null;
        }
        for (int i6 = 0; i6 < this.f12b.length; i6++) {
            if (this.f12b[i6] != null) {
                this.f12b[i6].b();
                this.f12b[i6] = null;
            }
        }
        for (int i7 = 0; i7 < this.f13c.length; i7++) {
            if (this.f13c[i7] != null) {
                this.f13c[i7].b();
                this.f13c[i7] = null;
            }
        }
        if (this.f10a != null) {
            this.f10a = null;
        }
        if (this.f11a != null) {
            this.f11a = null;
        }
        if (this.f12b != null) {
            this.f12b = null;
        }
        if (this.f13c != null) {
            this.f13c = null;
        }
        if (this.f8a != null) {
            this.f8a = null;
        }
        if (this.f9a != null) {
            this.f9a = null;
        }
        if (this.f31c != null) {
            this.f31c = null;
        }
        if (this.f29a != null) {
            this.f29a = null;
        }
        if (this.f30b != null) {
            this.f30b = null;
        }
        if (f5a != null) {
            f5a = null;
        }
        k.b();
        k.c();
        System.gc();
    }

    public final void b() {
        if (f5a != null) {
            f5a = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        if (this.p != null) {
            this.p = null;
        }
        if (this.f39r != null) {
            this.f39r = null;
        }
        if (this.f40s != null) {
            this.f40s = null;
        }
        if (f14c != null) {
            f14c = null;
        }
        if (f16e != null) {
            f16e = null;
        }
        if (f15d != null) {
            f15d = null;
        }
        if (f17f != null) {
            f17f = null;
        }
        if (f18g != null) {
            f18g = null;
        }
        if (f20i != null) {
            f20i = null;
        }
        if (f19h != null) {
            f19h = null;
        }
        if (f21j != null) {
            f21j = null;
        }
        if (f22k != null) {
            f22k = null;
        }
        if (f23l != null) {
            f23l = null;
        }
        if (f24m != null) {
            f24m = null;
        }
        if (f25n != null) {
            f25n = null;
        }
        g.d();
        k.b();
        k.c();
        l.m43b();
    }

    private void a(g gVar) throws Exception {
        g gVarM2a = m2a(gVar);
        g gVar2 = gVarM2a;
        if (!gVarM2a.f131a || gVar2.c >= this.f7a.c) {
            gVar2 = this.f9a;
        }
        int i2 = r.c / 7;
        int i3 = 3 * i2;
        int i4 = i3 * 3;
        int i5 = r.c / 8;
        int i6 = i2;
        if (gVar2.f131a && gVar2.d > d) {
            int i7 = gVar.c - gVar2.c;
            int i8 = i5 + i7;
            if (h == 4) {
                B = i8;
                i6 = i8;
            } else if (i7 > 0 && i7 < i4) {
                i6 = i8 < i3 ? i8 : i3;
            }
        }
        if (B < i6 - 3) {
            B += 6;
        } else if (B > i6 + 3) {
            B -= 6;
        }
        int i9 = gVar.c - B;
        int i10 = i9;
        if (i9 < 0) {
            i10 = 0;
        }
        if (i10 + r.c < c.f59j) {
            c = i10;
        }
        int i11 = c.f60k + (c.f60k / 4);
        int i12 = r.e;
        int i13 = ((r.d - this.z) * gVar.d) / (i11 - 0);
        if (i13 > i12) {
            d = gVar.d - i13;
        } else {
            d = gVar.d - i12;
        }
        if (d + r.d > c.f60k) {
            d = c.f60k - r.d;
        }
    }

    private void j() throws Exception {
        int i2;
        int i3;
        int i4 = c / this.u;
        int i5 = ((c + r.c) / this.u) + 1;
        int i6 = this.f8a.c / this.u;
        int i7 = i6 + 1;
        int i8 = this.f8a.f131a ? 2 : 1;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                this.f10a = this.f7a;
                i2 = i4;
                i3 = i5;
            } else {
                this.f10a = this.f8a;
                i2 = i6;
                i3 = i7;
            }
            if (!this.f10a.f131a) {
                return;
            }
            for (int i10 = 0; i10 < this.f12b.length; i10++) {
                if (this.f12b[i10].f131a && this.f10a.a(this.f12b[i10])) {
                    this.f12b[i10].f131a = false;
                    if (this.f12b[i10].r == 0) {
                        if (this.f10a.f184c) {
                            this.f10a.C = 0;
                        } else {
                            this.f10a.f184c = true;
                            if (this.f10a == this.f7a) {
                                this.f32a.a();
                            }
                        }
                    }
                    if (this.f12b[i10].r == 1) {
                        if (this.f10a.f185d) {
                            this.f10a.D = 0;
                        } else {
                            this.f10a.f185d = true;
                        }
                    }
                    if (this.f12b[i10].r == 2) {
                        if (!this.f10a.f) {
                            this.f10a.f = true;
                            this.f10a.f186e = false;
                            a(0, 0, 6, this.f10a);
                        }
                        this.f10a.B = 0;
                    }
                    if (this.f12b[i10].r == 3) {
                        if (!this.f10a.f186e) {
                            this.f10a.f186e = true;
                            this.f10a.f = false;
                            a(0, 0, 5, this.f10a);
                        }
                        this.f10a.B = 0;
                    }
                }
            }
            int i11 = 2 * this.y;
            for (int i12 = 0; i12 < this.f11a.length; i12++) {
                if (this.f11a[i12].f131a) {
                    int i13 = this.f11a[i12].c / this.u;
                    for (int i14 = i2; i14 <= i3; i14++) {
                        if (i14 == i13) {
                            if (this.f11a[i12].r == 9 || this.f11a[i12].r == 10 || this.f11a[i12].r == 11) {
                                if (this.f11a[i12].q == 0 && this.f10a.a(this.f11a[i12].c + this.f10a.e, this.f10a.d, this.f11a[i12].w, c.f61l)) {
                                    this.f11a[i12].d(1);
                                }
                                if (this.f11a[i12].q == 1) {
                                    if (this.f10a.a(this.f11a[i12].c, this.f11a[i12].d, this.f11a[i12].w, this.f11a[i12].x)) {
                                        if (this.f11a[i12].r == 9) {
                                            if (this.f10a.q != 14) {
                                                if (this.f10a.r) {
                                                    this.f10a.d(31);
                                                } else {
                                                    this.f10a.Z -= this.f10a.k << 16;
                                                    this.f10a.ai = -(this.f10a.X / 2);
                                                    this.f10a.X = 0;
                                                    this.f10a.d(27);
                                                }
                                            }
                                        } else if (this.f11a[i12].r == 10) {
                                            if (this.f10a.q != 14 && this.f10a.q != 15 && !this.f10a.f) {
                                                this.f10a.d(23);
                                            }
                                            this.f11a[i12].d(3);
                                        } else if (this.f11a[i12].r == 11) {
                                            if (this.f10a.q != 15 && !this.f10a.f) {
                                                this.f10a.d(23);
                                            }
                                            this.f11a[i12].d(3);
                                        }
                                    }
                                } else if (this.f11a[i12].q == 2) {
                                    if (this.f11a[i12].r != 9 || this.f10a.d()) {
                                        if (this.f10a.a(this.f11a[i12].c, this.f11a[i12].d, this.f11a[i12].w, this.f11a[i12].x)) {
                                            if (this.f10a.q != 15 && !this.f10a.f) {
                                                this.f10a.d(23);
                                            }
                                            this.f11a[i12].d(3);
                                        }
                                    } else if (this.f10a.r && this.f10a.a(this.f11a[i12].c - (2 * this.y), this.f11a[i12].d, this.f11a[i12].w, this.f11a[i12].x)) {
                                        if (this.f10a == this.f7a) {
                                            this.f9a.f188c = true;
                                            f45b = true;
                                        }
                                        this.f10a.d(18);
                                    } else if (this.f10a.a(this.f11a[i12].c, this.f11a[i12].d, this.f11a[i12].w, this.f11a[i12].x)) {
                                        this.f10a.Z -= this.f10a.k << 16;
                                        this.f10a.ai = -this.f10a.X;
                                        this.f10a.X = 0;
                                        this.f10a.d(27);
                                    }
                                }
                            } else if (this.f10a.a(this.f11a[i12])) {
                                if ((this.f11a[i12].r == 4 || this.f11a[i12].r == 7 || this.f11a[i12].r == 8) && this.f11a[i12].q == 0) {
                                    this.f11a[i12].d(3);
                                    if (this.f10a.q != 15 && !this.f10a.f) {
                                        this.f10a.d(23);
                                    }
                                } else if (this.f11a[i12].r == 4) {
                                    if (this.f10a.q != 22) {
                                        if (this.f10a.f) {
                                            a(this.f10a.c + l.a(0, this.f10a.f), this.f10a.d - l.a(0, this.f10a.g), 4, (n) null);
                                        } else {
                                            this.f10a.d(21);
                                        }
                                    }
                                } else if (this.f11a[i12].r == 0) {
                                    this.f10a.i = true;
                                } else if (this.f11a[i12].r == 3 || this.f11a[i12].r == 22) {
                                    this.f10a.k = true;
                                } else if (this.f10a == f37a && this.f11a[i12].r == 6 && this.f11a[i12].q == 0) {
                                    this.f11a[i12].d(1);
                                }
                            } else if (i9 == 1 && this.f11a[i12].r == 4 && this.f10a.a(this.f11a[i12].c - i11, this.f10a.d - this.f10a.g, i11, this.f10a.g)) {
                                if (this.f10a.h && !this.f10a.f && this.f8a.c < this.f11a[i12].c && (this.f11a[i12].q == 1 || this.f11a[i12].b() > 8)) {
                                    this.f10a.d(16);
                                }
                                if (this.f11a[i12].q == 0 && (this.f8a.q == 16 || this.f8a.q == 17)) {
                                    this.f10a.ai += 262144;
                                    this.f10a.d(33);
                                }
                            }
                        }
                    }
                }
            }
            for (int i15 = 0; i15 < this.f13c.length; i15++) {
                if (this.f13c[i15].f131a) {
                    if (i9 == 1 && this.f13c[i15].v == 0 && this.f10a.a(this.f13c[i15].c - (2 * c.f53d), this.f13c[i15].d - c.f58i, 2 * c.f53d, c.f58i)) {
                        if (l.a(0, 100) < this.f8a.U) {
                            this.f10a.f(0);
                        }
                    }
                    if (this.f10a.a(this.f13c[i15]) && ((this.f13c[i15].a == null || this.f13c[i15].a != this.f10a) && (this.f13c[i15].r == 1 || this.f13c[i15].r == 0))) {
                        this.f13c[i15].f131a = false;
                        a(this.f13c[i15].c, this.f13c[i15].d, 4, (n) null);
                        if (this.f10a.f) {
                            a(this.f10a.c, this.f10a.d, 4, (n) null);
                        } else {
                            this.f10a.d(21);
                        }
                    }
                }
            }
            if (this.f10a.f186e) {
                n nVarM2a = m2a((g) this.f10a);
                if (this.f10a.a(nVarM2a)) {
                    if (!nVarM2a.f186e && !nVarM2a.f) {
                        nVarM2a.d(21);
                    } else if (l.a(0, 3) == 0) {
                        a(nVarM2a.c + l.a(-nVarM2a.k, nVarM2a.k), nVarM2a.d + l.a(-this.f10a.l, 0), 4, (n) null);
                    }
                }
            }
            if (this.f10a.c >= f41o) {
                n nVarM2a2 = m2a((g) this.f10a);
                int i16 = 2 * c.f53d;
                if (this.f10a.Z >= nVarM2a2.Z) {
                    f45b = true;
                    if (this.f10a == this.f7a) {
                        m.t = 2;
                    } else {
                        m.t = 3;
                    }
                    if (this.f10a.r && this.f10a.q != this.f10a.s && this.f10a.q != this.f10a.t && this.f10a.q != 38 && this.f10a.q != 39) {
                        this.f10a.d(this.f10a.s);
                    }
                    if (nVarM2a2.c >= f41o) {
                        nVarM2a2.Z = (f41o << 16) - 131072;
                        nVarM2a2.aa -= 327680;
                        nVarM2a2.r = false;
                        nVarM2a2.d(27);
                    } else if (f41o - nVarM2a2.c < i16 && nVarM2a2.r && !nVarM2a2.d()) {
                        nVarM2a2.d(18);
                    }
                    if (this.f10a.r && this.f10a.q != this.f10a.s && this.f10a.q != this.f10a.t && this.f10a.q != 38 && this.f10a.q != 39) {
                        this.f9a.f188c = true;
                        this.f10a.d(this.f10a.s);
                        if (this.f10a == this.f7a) {
                            m.t = 2;
                        } else {
                            m.t = 3;
                        }
                    }
                    if (this.f10a.q == this.f10a.t || this.f10a.q == this.f10a.t || nVarM2a2.q == this.f10a.t || nVarM2a2.q == this.f10a.t) {
                        this.f9a.f188c = true;
                    }
                }
            }
            if (this.f10a.c - this.f10a.m < this.f9a.c && this.f10a.c < f41o && this.f10a.q != 22) {
                this.f10a.d(22);
                if (this.f10a == this.f7a) {
                    this.f9a.q = 2;
                } else {
                    if (this.f7a.q == this.f7a.s || this.f7a.q == this.f7a.t) {
                        this.f9a.q = 2;
                    }
                    this.f9a.t /= 2;
                }
            }
        }
    }

    private void k() throws Exception {
        int i2 = 0;
        while (i2 <= 1) {
            n nVar = i2 == 0 ? this.f7a : this.f8a;
            int iA = c.a(nVar.Z, nVar.aa);
            boolean z = false;
            for (int i3 = 0; i3 < this.o.length; i3++) {
                if (this.q[i3] > -1) {
                    int[] iArr = this.q;
                    int i4 = i3;
                    int i5 = iArr[i4] + 1;
                    iArr[i4] = i5;
                    if (i5 > this.D) {
                        c.a(this.o[i3] << 16, this.p[i3] << 16, 0);
                        a(this.o[i3], this.p[i3], 22);
                        this.q[i3] = -2;
                    }
                } else if (this.q[i3] == -2 && this.o[i3] < f38b.c && this.o[i3] < c) {
                    c.a(this.o[i3] << 16, this.p[i3] << 16, 53);
                    this.q[i3] = -1;
                    this.o[i3] = -1;
                    this.p[i3] = -1;
                }
                if ((iA == 53 || iA == 54) && nVar.r) {
                    nVar.j = true;
                    if (!z) {
                        int i6 = nVar.c / c.f53d;
                        this.f39r[i2] = i6;
                        if (this.f39r[i2] != this.f40s[i2] && this.o[i3] == -1) {
                            this.q[i3] = 0;
                            this.o[i3] = c.a(nVar.c);
                            this.p[i3] = nVar.d;
                            z = true;
                            this.f40s[i2] = i6;
                        }
                    }
                }
                if (i2 == 1 && nVar.r && ((iA == 12 && c.f46a == 0) || (iA == 18 && c.f46a == 1))) {
                    nVar.f(0);
                }
            }
            i2++;
        }
    }

    private void l() throws Exception {
        int i2;
        int i3;
        int i4 = c / this.u;
        int i5 = ((c + r.c) / this.u) + 1;
        int i6 = this.f8a.c / this.u;
        int i7 = i6 + 1;
        for (int i8 = 0; i8 <= 1; i8++) {
            if (i8 == 0) {
                i2 = i4;
                i3 = i5;
            } else {
                i2 = i6;
                i3 = i7;
            }
            for (int i9 = i2; i9 <= i3 && i9 <= this.f26a.length - 1; i9++) {
                if (i8 == 0 || (i8 == 1 && (i9 < i4 || i9 > i5))) {
                    for (int i10 = 0; i10 < this.f26a[i9].length; i10++) {
                        short s = this.f26a[i9][i10];
                        int i11 = (f15d[s] * this.y) + this.A;
                        int i12 = (f16e[s] * this.z) + this.z;
                        if (f17f[s] == 2) {
                            a(i11, i12, f14c[s], s);
                        }
                    }
                    for (int i13 = 0; i13 < this.f28c[i9].length; i13++) {
                        short s2 = this.f28c[i9][i13];
                        int i14 = (f19h[s2] * this.y) + c.f57h;
                        int i15 = (f20i[s2] * this.z) + this.z;
                        if (f21j[s2] == 2) {
                            b(i14, i15, f18g[s2], s2);
                        }
                    }
                }
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5) throws Exception {
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f11a.length) {
                break;
            }
            if (!this.f11a[i6].f131a) {
                z = true;
                this.f11a[i6].a(i2, i3, 1, i4);
                f17f[i5] = 3;
                break;
            }
            i6++;
        }
        if (z || this.f11a.length >= this.a) {
            return;
        }
        m[] mVarArr = new m[this.f11a.length + 1];
        for (int i7 = 0; i7 < this.f11a.length; i7++) {
            mVarArr[i7] = this.f11a[i7];
        }
        this.f11a = mVarArr;
        this.f11a[this.f11a.length - 1] = new m();
        this.f11a[this.f11a.length - 1].a(i2, i3, 1, i4);
        f17f[i5] = 3;
    }

    public final void a(int i2, int i3, int i4) throws Exception {
        boolean z = false;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f11a.length) {
                break;
            }
            z = true;
            if (!this.f11a[i5].f131a) {
                this.f11a[i5].a(i2, i3, 1, i4);
                break;
            }
            i5++;
        }
        if (z || this.f11a.length >= this.a) {
            return;
        }
        m[] mVarArr = new m[this.f11a.length + 1];
        for (int i6 = 0; i6 < this.f11a.length; i6++) {
            mVarArr[i6] = this.f11a[i6];
        }
        this.f11a = mVarArr;
        this.f11a[this.f11a.length - 1] = new m();
        this.f11a[this.f11a.length - 1].a(i2, i3, 1, i4);
    }

    private void b(int i2, int i3, int i4, int i5) throws Exception {
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= this.f12b.length) {
                break;
            }
            if (!this.f12b[i6].f131a) {
                z = true;
                this.f12b[i6].a(i2, i3, 2, i4);
                f21j[i5] = 3;
                break;
            }
            i6++;
        }
        if (z || this.f12b.length >= this.b) {
            return;
        }
        m[] mVarArr = new m[this.f12b.length + 1];
        for (int i7 = 0; i7 < this.f12b.length; i7++) {
            mVarArr[i7] = this.f12b[i7];
        }
        this.f12b = mVarArr;
        this.f12b[this.f12b.length - 1] = new m();
        this.f12b[this.f12b.length - 1].a(i2, i3, 2, i4);
        f21j[i5] = 3;
    }

    private void m() throws Exception {
        int i2 = this.f8a.c / this.u;
        int i3 = i2 + 1;
        if (l.a(0, 100) < this.f8a.U) {
            for (int i4 = i2; i4 <= i3 && i4 <= this.f26a.length - 1; i4++) {
                for (int i5 = 0; i5 < this.f27b[i4].length; i5++) {
                    short s = this.f27b[i4][i5];
                    int i6 = (f23l[s] * this.y) + this.A;
                    int i7 = (f24m[s] * this.z) + this.z;
                    if (f25n[s] == 2 && this.f8a.a(i6, i7, c.f53d, c.f54e)) {
                        if (f22k[s] == 0) {
                            this.f8a.f(0);
                        } else if (f22k[s] == 1) {
                            this.f8a.e(2);
                        } else if (f22k[s] == 2) {
                            this.f8a.e(0);
                        }
                        f25n[s] = 3;
                    }
                }
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, g gVar) throws Exception {
        boolean z = false;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f13c.length) {
                break;
            }
            if (!this.f13c[i7].f131a) {
                z = true;
                this.f13c[i7].a(i2, i3, i4, i5, 3, i6, gVar);
                break;
            }
            i7++;
        }
        if (z) {
            return;
        }
        m[] mVarArr = new m[this.f13c.length + 1];
        for (int i8 = 0; i8 < this.f13c.length; i8++) {
            mVarArr[i8] = this.f13c[i8];
        }
        this.f13c = mVarArr;
        this.f13c[this.f13c.length - 1] = new m();
        this.f13c[this.f13c.length - 1].a(i2, i3, 3, i6);
    }

    public final void a(int i2, int i3, int i4, n nVar) throws Exception {
        boolean z = false;
        t[] tVarArr = this.f31c;
        switch (i4) {
            case 1:
            case 3:
            case 5:
            case 6:
                tVarArr = this.f30b;
                break;
            case 2:
                tVarArr = this.f29a;
                break;
        }
        int i5 = 0;
        while (true) {
            if (i5 < tVarArr.length) {
                if (tVarArr[i5].f131a) {
                    i5++;
                } else {
                    z = true;
                    tVarArr[i5].a(i2, i3, i4, nVar);
                }
            }
        }
        if (z) {
            return;
        }
        t[] tVarArr2 = new t[tVarArr.length + 1];
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            tVarArr[i6] = tVarArr[i6];
        }
        tVarArr2[tVarArr2.length - 1] = new t();
        tVarArr2[tVarArr2.length - 1].a(i2, i3, i4, nVar);
    }

    private static void n() {
        if (k.f171e) {
            i = 1;
        } else {
            i = c.f87b.length;
        }
        if (k.f156a != 8) {
            g = f3a[k.o];
        } else {
            k.o = l.a(0, i - 1);
            g = 0;
        }
    }

    public final void c() throws Exception {
        k.f169c = true;
        if (h != 5) {
            int i2 = k.o + 1;
            k.o = i2;
            if (i2 >= i) {
                h = 6;
            } else {
                h = 5;
                n();
            }
            this.f2d = true;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final n m2a(g gVar) {
        return gVar == this.f7a ? this.f8a : this.f7a;
    }

    private static boolean a(s sVar, s sVar2) {
        return sVar.Z >= sVar2.Z;
    }

    private void o() {
        if (a(this.f7a, this.f8a)) {
            f37a = this.f7a;
            f38b = this.f8a;
        } else {
            f37a = this.f8a;
            f38b = this.f7a;
        }
        if (this.f8a.f131a) {
            return;
        }
        p pVar = this.f7a;
        f38b = pVar;
        f37a = pVar;
    }

    private void p() throws Exception {
        if (this.w == this.v) {
            k.f169c = true;
        }
        int i2 = this.w - 1;
        this.w = i2;
        if (i2 == 0) {
            k.f169c = true;
            this.f = false;
            if (k.f162a.a(21) == 16) {
                this.f34e = true;
            }
            this.f2d = false;
            this.f35g = true;
            k.f169c = true;
        }
    }

    private void q() throws Exception {
        if (h == 5) {
            int i2 = this.x - 1;
            this.x = i2;
            if (i2 == 0) {
                this.f = false;
                if (k.f156a != 8) {
                    u.a(0, Integer.toString(k.o).getBytes());
                } else {
                    this.f34e = true;
                }
                this.f35g = true;
                this.f = true;
            }
        }
    }

    private void r() throws Exception {
        if (h == 1 || h == 4) {
            a(this.f36a);
            this.f6a.c();
            if (h == 1) {
                if (!f44a) {
                    int i2 = this.f43q - 1;
                    this.f43q = i2;
                    if (i2 < 0) {
                        f44a = true;
                    }
                } else if (this.f7a.q == 0) {
                    f42p++;
                }
            }
            if (this.f7a.f131a) {
                this.f7a.i();
            }
            if (this.f8a.f131a) {
                this.f8a.i();
            }
            k();
            if (this.f7a.f131a) {
                this.f7a.t();
            }
            if (this.f8a.f131a) {
                this.f8a.t();
            }
            if (this.f7a.f131a) {
                this.f7a.j();
            }
            if (this.f8a.f131a) {
                this.f8a.j();
            }
            j();
            if (h == 1) {
                u();
                k.c();
            }
            if (this.f7a.f131a) {
                this.f7a.u();
            }
            if (this.f8a.f131a) {
                this.f8a.u();
            }
            if (this.f9a.f131a && h == 1) {
                this.f9a.c();
            }
            if (this.k > 0) {
                l();
            }
            m();
            c.m6a();
            o();
            for (int i3 = 0; i3 < this.f12b.length; i3++) {
                if (this.f12b[i3].f131a) {
                    this.f12b[i3].a();
                }
            }
            for (int i4 = 0; i4 < this.f11a.length; i4++) {
                if (this.f11a[i4].f131a) {
                    this.f11a[i4].a();
                }
            }
            for (int i5 = 0; i5 < this.f13c.length; i5++) {
                if (this.f13c[i5].f131a) {
                    this.f13c[i5].a();
                }
            }
            for (int i6 = 0; i6 < this.f31c.length; i6++) {
                if (this.f31c[i6].f131a) {
                    this.f31c[i6].g();
                }
            }
            for (int i7 = 0; i7 < this.f29a.length; i7++) {
                if (this.f29a[i7].f131a) {
                    this.f29a[i7].g();
                }
            }
            for (int i8 = 0; i8 < this.f30b.length; i8++) {
                if (this.f30b[i8].f131a) {
                    this.f30b[i8].g();
                }
            }
            if (this.f32a.f131a) {
                this.f32a.g();
            }
            if (this.f33b.f131a) {
                this.f33b.g();
            } else if (this.j % 350 == 0 && l.a(0, 1) == 0) {
                this.f33b.c();
            }
        } else if (h == 2) {
            p();
        } else if (h == 6) {
            this.f34e = true;
            this.f35g = true;
        } else if (h == 3) {
            this.f = false;
            if (k.f162a.a(5) == 15) {
                h = 1;
            } else {
                this.f34e = true;
                this.f35g = true;
            }
            k.f169c = true;
            this.f = true;
        } else if (h == 5) {
            q();
        }
        if (h != 1) {
            t();
            k.c();
        }
    }

    private void a(Graphics graphics) {
        int i2 = this.f7a.c;
        int iM28b = this.f7a.d - (2 * this.f7a.f129a.m28b(1));
        int i3 = r.c - 8;
        int i4 = (this.f7a.c * i3) / c.f59j;
        int i5 = (this.f8a.c * i3) / c.f59j;
        int i6 = (this.f9a.c * i3) / c.f59j;
        graphics.setColor(255, 0, 255);
        graphics.drawLine(4, 6, r.c - 4, 6);
        f5a.a(graphics, 5, i6, 6, -16777213, 0);
        int i7 = this.r;
        if (this.f8a.q == this.f8a.s || this.f8a.q == this.f8a.t) {
            i7 = 10;
        } else if (!this.f8a.f131a) {
            i7 = 9;
        } else if (this.f8a.d() && this.j % 2 == 0) {
            i7 = 6;
        }
        f5a.a(graphics, i7, i5, 6, -16777213, 0);
        int i8 = 0;
        if (this.f7a.q == this.f7a.s || this.f7a.q == this.f7a.t) {
            i8 = 10;
        } else if (!this.f7a.f131a) {
            i8 = 9;
        } else if (this.f7a.d() && this.j % 2 == 0) {
            i8 = 6;
        }
        f5a.a(graphics, i8, i4, 6, -16777213, 0);
        if (this.f7a.g || (this.f7a.q == 0 && f44a)) {
            if (this.j % 2 != 0) {
                f5a.a(graphics, 8, i2 - c, iM28b - d, -16777183, 0);
                return;
            }
        } else if (!this.f7a.i && !this.f7a.h && !this.f7a.l && !this.f7a.k && !this.f7a.j) {
            return;
        }
        f5a.a(graphics, 7, i2 - c, iM28b - d, -16777183, 0);
    }

    @Override // defpackage.o
    public final void a(Graphics graphics, boolean z) {
        if (z) {
            k.f169c = true;
        }
        try {
            if (h != 1 && (h != 4 || (!k.f170d && !k.f169c))) {
                if (h == 2) {
                    if (k.f170d || k.f169c) {
                        i.a(graphics, 0, 0, r.c, r.d, 5, 2, 0, 0, 1, false);
                        i.a(graphics, 0, 0, r.c, r.d, 2, 0, 0, 0, 1, false);
                        e.a(graphics, r.e, r.f - 10, -16777199, e.a(e.a(9), r.c - 10));
                        k.f169c = false;
                        return;
                    }
                    return;
                }
                if (h != 5) {
                    if (h == 0) {
                        h.a(graphics, k.n, k.m, true);
                        return;
                    }
                    return;
                } else {
                    if (k.f170d || k.f169c) {
                        i.a(graphics, 0, 0, r.c, r.d, 5, 2, 0, 0, 1, false);
                        i.a(graphics, 0, 0, r.c, r.d, 2, 0, 0, 0, 1, false);
                        e.a(graphics, r.e, r.f, -16777213, e.a(e.a(29), r.c - 10));
                        k.f169c = false;
                        return;
                    }
                    return;
                }
            }
            if (this.f7a.f184c) {
                i.b(graphics, 0, 0, r.c, r.d, r.d / 10, 0, 0, 0, 200, 0, 255);
            } else {
                this.f6a.a(graphics);
            }
            if (this.f33b.f131a) {
                this.f33b.a(graphics);
            }
            this.f6a.b(graphics);
            if (this.f32a.f131a) {
                this.f32a.a(graphics);
            }
            for (int i2 = 0; i2 < this.f12b.length; i2++) {
                if (this.f12b[i2].f131a) {
                    this.f12b[i2].a(graphics);
                }
            }
            for (int i3 = 0; i3 < this.f11a.length; i3++) {
                if (this.f11a[i3].f131a && !this.f11a[i3].c) {
                    this.f11a[i3].a(graphics);
                }
            }
            if (this.f9a.f131a) {
                this.f9a.a(graphics);
            }
            for (int i4 = 0; i4 < this.f30b.length; i4++) {
                if (this.f30b[i4].f131a && this.f30b[i4].f203c) {
                    this.f30b[i4].a(graphics);
                }
            }
            for (int i5 = 0; i5 < this.f29a.length; i5++) {
                if (this.f29a[i5].f131a) {
                    this.f29a[i5].a(graphics);
                }
            }
            if (this.f8a.f131a) {
                this.f8a.a(graphics);
            }
            if (this.f7a.f131a) {
                this.f7a.a(graphics);
            }
            for (int i6 = 0; i6 < this.f30b.length; i6++) {
                if (this.f30b[i6].f131a && !this.f30b[i6].f203c) {
                    this.f30b[i6].a(graphics);
                }
            }
            for (int i7 = 0; i7 < this.f11a.length; i7++) {
                if (this.f11a[i7].f131a && this.f11a[i7].c) {
                    this.f11a[i7].a(graphics);
                }
            }
            for (int i8 = 0; i8 < this.m; i8++) {
                if (this.f13c[i8].f131a) {
                    this.f13c[i8].a(graphics);
                }
            }
            for (int i9 = 0; i9 < this.f31c.length; i9++) {
                if (this.f31c[i9].f131a) {
                    this.f31c[i9].a(graphics);
                }
            }
            a(graphics);
            if (h != 4) {
                k.f164a.a(graphics, 0, 0 + h.f138b, r.d - h.f139c, -16777180, 0);
                return;
            }
            i.a(graphics, 0, 0, r.c, r.d, 5, 2, 0, 0, 1, false);
            i.a(graphics, 0, 0, r.c, r.d, 2, 0, 0, 0, 1, false);
            e.a(graphics, r.e, r.f, -16777213, 0, 11);
            k.f169c = false;
        } catch (Exception e2) {
            i.a(this, e2);
        }
    }

    private void s() {
        if (this.f8a.f131a) {
            this.f8a.f();
        }
        for (int i2 = 0; i2 < this.f11a.length; i2++) {
            if (this.f11a[i2].f131a && this.f11a[i2].r != 9 && this.f11a[i2].r != 10 && this.f11a[i2].r != 11) {
                this.f11a[i2].f();
            }
        }
        if (this.f7a.f131a) {
            this.f7a.f();
        }
        for (int i3 = 0; i3 < this.f13c.length; i3++) {
            if (this.f13c[i3].f131a) {
                this.f13c[i3].f();
            }
        }
        for (int i4 = 0; i4 < this.f31c.length; i4++) {
            if (this.f31c[i4].f131a) {
                this.f31c[i4].f();
            }
        }
        for (int i5 = 0; i5 < this.f12b.length; i5++) {
            if (this.f12b[i5].f131a) {
                this.f12b[i5].f();
            }
        }
        for (int i6 = 0; i6 < this.f30b.length; i6++) {
            if (this.f30b[i6].f131a) {
                this.f30b[i6].f();
            }
        }
    }

    private static void t() throws Exception {
        for (int i2 = 0; i2 < k.a.length; i2++) {
            int i3 = k.a[i2][0];
            if (k.a[i2][1] != -1002 && k.a[i2][1] == -1003 && h == 4 && (i3 == 7 || i3 == 5 || i3 == 53)) {
                h = 1;
                l.a(k.f167a[l.a(1, 2)], true);
            }
        }
    }

    private void u() throws Exception {
        for (int i2 = 0; i2 < k.a.length; i2++) {
            int i3 = k.a[i2][0];
            if (k.a[i2][1] == -1002) {
                if (i3 == 6) {
                    h = 3;
                    k.b();
                    k.c();
                    return;
                }
                if (i3 == 7 || i3 == 5 || i3 == 53 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57 || i3 == 48) {
                    this.f7a.e(k.a[i2][2]);
                }
                int[] iArr = k.a[i2];
                iArr[2] = iArr[2] + 1;
            } else if (k.a[i2][1] == -1003 && (i3 == 7 || i3 == 5 || i3 == 53 || i3 == 49 || i3 == 50 || i3 == 51 || i3 == 52 || i3 == 54 || i3 == 55 || i3 == 56 || i3 == 57 || i3 == 48)) {
                this.f7a.f(k.a[i2][2]);
            }
        }
    }

    @Override // defpackage.o
    /* renamed from: a */
    public final void mo36a(int i2) {
        for (int i3 = 0; i3 < k.a.length; i3++) {
            if (k.a[i3][1] == -1001) {
                k.a[i3][0] = i2;
                k.a[i3][1] = -1002;
                k.a[i3][2] = 0;
                return;
            } else {
                if (i3 == 0) {
                    k.a[i3][0] = i2;
                    k.a[i3][1] = -1002;
                    k.a[i3][2] = 0;
                }
            }
        }
    }

    @Override // defpackage.o
    public final void b(int i2) {
        for (int i3 = 0; i3 < k.a.length; i3++) {
            if (k.a[i3][0] == i2 && k.a[i3][1] == -1002) {
                k.a[i3][1] = -1003;
            }
        }
    }
}
