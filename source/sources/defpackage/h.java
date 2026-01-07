package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:h.class */
public final class h extends o {
    private static int d;
    public static int a;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* renamed from: a, reason: collision with other field name */
    private static f f134a;
    private static f b;
    private static f c;

    /* renamed from: d, reason: collision with other field name */
    private static f f135d;

    /* renamed from: e, reason: collision with other field name */
    private static f f136e;

    /* renamed from: f, reason: collision with other field name */
    private static f f137f;
    private static int j;
    private static int k;
    private static int l;

    /* renamed from: b, reason: collision with other field name */
    public static int f138b;

    /* renamed from: c, reason: collision with other field name */
    public static int f139c;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private static int t;
    private static int u;

    /* renamed from: a, reason: collision with other field name */
    private int[] f140a;

    /* renamed from: b, reason: collision with other field name */
    private int[] f141b;
    private int v;
    private int w;
    private int x;
    private int y;

    /* renamed from: a, reason: collision with other field name */
    private String f142a;

    /* renamed from: b, reason: collision with other field name */
    private String f143b;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;

    /* renamed from: a, reason: collision with other field name */
    private boolean f144a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f145b;

    /* renamed from: c, reason: collision with other field name */
    private boolean f146c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f147d;

    /* renamed from: e, reason: collision with other field name */
    private boolean f148e;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;

    /* renamed from: c, reason: collision with other field name */
    private static int[] f149c = {32, 33, 0, 34, 1, 35};

    /* renamed from: d, reason: collision with other field name */
    private static int[] f150d = {36, 0, 37, 1, 38, 2, 39, 3, 40};
    private int Y;
    private int Z;

    public final int a(int i) throws Exception {
        this.i = i;
        d();
        return this.w;
    }

    public final int a(int i, int i2) throws Exception {
        d = i2;
        this.i = i;
        d();
        return this.w;
    }

    @Override // defpackage.o
    public final void a() throws Exception {
        this.f = false;
        d(this.i);
        this.f144a = false;
        this.f = true;
        do {
            int i = a + 1;
            a = i;
            if (i > 50000) {
                a = 0;
            }
            l.a();
            if (this.f == 1) {
                g();
            }
            k.c();
            e();
            l.a(100);
        } while (!this.f144a);
        k.b();
        k.c();
        this.f = false;
        c();
    }

    private void b() throws Exception {
        c();
        e.c("fontBig");
        if (this.i == 8 && f137f == null) {
            f137f = new f("moony.si");
        }
        if ((this.i == 0 || this.i == 15 || this.i == 24 || this.i == 6) && f134a == null) {
            f134a = new f("cover.si");
        }
        if (this.i == 19 || this.i == 18) {
            if (b == null) {
                b = new f("characters.is");
            }
            if (c == null) {
                c = new f("ficha.si");
            }
        }
        if (this.i == 22 && f135d == null) {
            f135d = new f("opening.is");
        }
        if (this.i == 23 && f136e == null) {
            f136e = new f("ending.is");
        }
    }

    private void a(int[] iArr) {
        this.f141b = new int[iArr.length + 2];
        for (int i = 1; i < this.f141b.length - 1; i++) {
            this.f141b[i] = iArr[i - 1];
        }
        this.f141b[0] = iArr[iArr.length - 1];
        this.f141b[this.f141b.length - 1] = iArr[0];
    }

    private void a(int[] iArr, int i, int i2) {
        int[] iArr2 = new int[iArr.length];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = this.f140a[i4];
            if (iArr[i4] == i2) {
                i3 = i4;
            }
        }
        int i5 = 0;
        int i6 = i;
        int i7 = i3;
        while (i5 < iArr.length) {
            if (i6 > iArr.length - 1) {
                i6 = 0;
            }
            if (i7 > iArr.length - 1) {
                i7 = 0;
            }
            iArr[i6] = iArr2[i7];
            i5++;
            i6++;
            i7++;
        }
    }

    private void c(int i) throws Exception {
        l.m43b();
        this.f147d = false;
        k.b();
        if (i == 0) {
            this.f140a = k.f157a;
            this.v = k.d;
            this.w = k.f158e;
        } else if (i == 15) {
            if (Integer.parseInt(new String(u.a(0))) == 0) {
                this.f140a = k.f159b;
                this.v = k.f;
                this.w = k.g;
            } else {
                this.f140a = k.f160c;
                this.v = k.h;
                this.w = k.i;
            }
        } else if (i == 24) {
            this.f140a = k.f161d;
            this.v = k.j;
            this.w = k.k;
        }
        a(this.f140a, this.v, this.w);
        a(this.f140a);
        this.y = (this.m + ((r.d - k) / 2)) - (t / 2);
        this.h = 0;
    }

    private void d(int i) throws Exception {
        this.f = 1;
        this.i = i;
        b();
        k.f169c = true;
        this.f147d = false;
        k.b();
        this.J = 0;
        this.K = 3;
        this.Y = 0;
        if (f134a != null) {
            j = f134a.m27a(0);
            k = f134a.m28b(0);
        }
        l = j / 2;
        e.c("fontBig");
        e.a('w');
        t = e.m24b();
        e.c("fontSmall");
        e.a('w');
        u = e.m24b();
        this.p = 2;
        this.q = t * 3;
        f138b = 1;
        f139c = 1;
        Math.min(r.e - l, r.c);
        this.n = Math.min(j - (this.p * 2), r.c - (this.p * 2));
        if (this.i == 0 || this.i == 15 || this.i == 24 || this.i == 6 || this.i == 20 || this.i == 8 || this.i == 25 || this.i == 26) {
            this.m = k;
        } else {
            this.m = this.q;
        }
        int iA = u + e.a();
        this.o = iA * (((r.d - (this.q * 2)) / iA) - 1);
        this.f145b = false;
        this.f146c = false;
        this.r = r.d - 1;
        this.s = this.r;
        this.z = -1;
        this.A = -1;
        this.e = 1;
        switch (this.i) {
            case 0:
            case 15:
            case 24:
                c(this.i);
                break;
            case 1:
                this.A = 2;
                this.z = 13;
                break;
            case 2:
                this.A = 1;
                this.z = 12;
                break;
            case 5:
            case 6:
            case 8:
            case 9:
            case 20:
            case 21:
            case 25:
            case 26:
                if (this.i == 21) {
                    this.z = 30;
                }
                if (this.i == 5) {
                    this.z = 18;
                } else if (this.i == 9) {
                    this.z = 19;
                } else if (this.i == 6) {
                    this.z = 17;
                } else if (this.i == 20) {
                    this.z = 26;
                } else if (this.i == 8) {
                    this.A = 14;
                    this.z = 46;
                    if (!k.f171e) {
                        b.a("WAP-0-URL");
                    }
                } else if (this.i == 25) {
                    this.A = 49;
                    this.z = 46;
                } else if (this.i == 26) {
                    this.A = 48;
                    this.z = 46;
                }
                this.g = 15;
                break;
            case 7:
                this.A = 1;
                this.z = d;
                break;
            case 11:
                this.z = d;
                break;
            case 12:
                this.z = 41;
                this.e = 0;
                this.h = 2;
                break;
            case 18:
            case 19:
                if (this.i == 18) {
                    l.a(k.f167a[0], true);
                }
                e.c("fontSmall");
                this.H = 0;
                this.I = 0;
                this.L = 0;
                if (this.i == 19) {
                    this.H = 0;
                    this.I = a.f4b[k.o];
                    this.L = 1;
                }
                this.Q = 1;
                this.R = 1;
                this.O = r.e - (r.e / 3);
                this.P = u / 2;
                this.S = u + this.R;
                this.T = this.P + this.R;
                int length = (this.S + this.T) * n.a.length;
                this.M = (r.e - this.O) / 2;
                this.N = ((c.m28b(0) + this.R) + (((r.d - (c.m28b(0) + this.R)) - k.f164a.m28b(0)) / 2)) - (length / 2);
                this.U = 1;
                this.V = 0;
                this.W = 2;
                break;
            case 22:
                l.a(k.f167a[0], true);
                e.c("fontBig");
                this.Z = f149c.length - 1;
                break;
            case 23:
                l.a(k.f167a[0], true);
                e.c("fontBig");
                this.Z = f150d.length - 1;
                break;
        }
        if (this.i == 9 || this.i == 5 || this.i == 21 || this.i == 20) {
            e.c("fontBig");
        } else {
            e.c("fontSmall");
        }
        if (this.A != -1) {
            this.f142a = e.a(e.a(this.A), this.n);
            e.m21a(this.f142a);
            this.C = e.m22b(this.f142a);
        }
        if (this.z != -1) {
            if (this.i == 1) {
                this.f143b = e.a(new StringBuffer().append(!k.f171e ? new StringBuffer().append("v ").append(AppLink.midlet.getAppProperty("MIDlet-Version")).append(" ").toString() : new StringBuffer().append("v ").append(AppLink.midlet.getAppProperty("MIDlet-Version")).append(" demo ").toString()).append(e.a(this.z)).toString(), this.n);
            } else {
                this.f143b = e.a(e.a(this.z), this.n);
            }
            e.m21a(this.f143b);
            this.B = e.m22b(this.f143b);
            this.D = 0;
            this.x = 2;
        }
        if (this.i == 2 || this.i == 1 || this.i == 7 || this.i == 11 || this.i == 12 || this.i == 8 || this.i == 25 || this.i == 26) {
            e.c("fontSmall");
            int iA2 = u + e.a();
            this.F = this.o / iA2;
            this.f148e = this.B / iA2 > this.F;
            if (this.i == 12) {
                this.f148e = false;
            }
            this.E = 0;
            this.G = this.B / this.o;
            if (this.B % this.o <= 0) {
                this.G--;
            }
        }
    }

    private void c() {
        if (this.f141b != null) {
            this.f141b = null;
        }
        if (f134a != null) {
            f134a = null;
        }
        if (b != null) {
            b = null;
        }
        if (c != null) {
            c = null;
        }
        if (this.f140a != null) {
            this.f140a = null;
        }
        if (f135d != null) {
            f135d = null;
        }
        if (f136e != null) {
            f136e = null;
        }
        if (f137f != null) {
            f137f = null;
        }
        System.gc();
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m35a() {
        return this.i == 22 ? this.X == 2 || this.X == 4 : this.X == 1 || this.X == 3 || this.X == 5 || this.X == 7;
    }

    private void e(int i) {
        if (this.B <= i) {
            this.f146c = false;
            this.f145b = false;
            return;
        }
        this.f145b = true;
        this.f146c = true;
        if (this.e == 0) {
            if (this.h == 2) {
                this.D += this.x;
                if (this.D > this.B + this.o) {
                    this.D = this.B + this.o;
                }
                k.f169c = true;
            } else if (this.h == 1) {
                this.D -= this.x;
                if (this.D < 0) {
                    this.D = 0;
                }
                k.f169c = true;
            }
        }
        if (this.J == 0 && this.e == 1) {
            if (this.h == 3) {
                this.E = this.E > 0 ? this.E - 1 : 0;
                k.f169c = true;
            } else if (this.h == 4) {
                this.E = this.E < this.G ? this.E + 1 : this.G;
                k.f169c = true;
            }
        }
        if (this.h == 0) {
            this.J = 0;
        } else {
            int i2 = this.J + 1;
            this.J = i2;
            if (i2 >= this.K) {
                this.J = 0;
            }
        }
        if (this.i != 12) {
            this.h = 0;
        }
        if (this.D >= this.B - i) {
            this.f146c = false;
        }
        if (this.D == 0) {
            this.f145b = false;
        }
        if (this.i != 12 || this.D < this.B + this.o) {
            return;
        }
        this.f144a = true;
    }

    private void f() {
        if (this.J == 0) {
            if (this.h == 3) {
                i.b(this.f140a, 3);
                a(this.f140a);
                this.w = this.f140a[this.v];
                k.f169c = true;
            } else if (this.h == 4) {
                i.b(this.f140a, 2);
                a(this.f140a);
                this.w = this.f140a[this.v];
                k.f169c = true;
            }
        }
        if (this.h == 0) {
            this.J = 0;
        } else {
            int i = this.J + 1;
            this.J = i;
            if (i >= this.K) {
                this.J = 0;
            }
        }
        this.h = 0;
    }

    private void g() throws Exception {
        i();
        switch (this.i) {
            case 0:
            case 15:
            case 24:
                f();
                break;
            case 1:
            case 2:
            case 7:
            case 8:
            case 11:
            case 12:
            case 25:
            case 26:
                e(this.o);
                break;
            case 18:
                if (this.J == 0) {
                    if (this.h == 3) {
                        if (this.L == 0) {
                            this.H--;
                        }
                        if (this.L == 1) {
                            this.I--;
                        }
                    } else if (this.h == 4) {
                        if (this.L == 0) {
                            this.H++;
                        }
                        if (this.L == 1) {
                            this.I++;
                        }
                    }
                }
                if (this.h == 0) {
                    this.J = 0;
                } else {
                    int i = this.J + 1;
                    this.J = i;
                    if (i >= this.K) {
                        this.J = 0;
                    }
                }
                if (this.H >= 5) {
                    this.H = 0;
                } else if (this.H < 0) {
                    this.H = 4;
                }
                if (this.I >= 5) {
                    this.I = 0;
                } else if (this.I < 0) {
                    this.I = 4;
                }
                this.h = 0;
                k.b = this.H;
                k.c = this.I;
                break;
            case 22:
            case 23:
                if ((this.Y == 2 || this.Y == 4) && i.a) {
                    k.f169c = true;
                    this.X++;
                    if (this.X > this.Z) {
                        this.X = 0;
                        if (i.a) {
                            this.f144a = true;
                        }
                    } else {
                        this.Y = 1;
                        i.a = false;
                    }
                }
                if (this.Y == 1 && i.a) {
                    k.f169c = true;
                    this.Y = 0;
                    i.a();
                }
                if (this.Y == 3 && i.a) {
                    this.Y = 4;
                    i.a();
                    break;
                }
                break;
        }
        h();
    }

    public static void a(Graphics graphics, int i, int i2, boolean z) throws Exception {
        e.c("fontBig");
        if (k.f170d || k.f169c) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, r.c, r.d);
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        int i3 = (r.c - (r.c / 5)) / i2;
        int i4 = i2 * i3;
        int i5 = i3 * i;
        int i6 = r.f;
        int i7 = r.e - (i4 / 2);
        int iM23c = i6 + 4;
        graphics.setColor(16759552);
        if (z) {
            iM23c = i6 + (e.m23c("fontBig") / 2) + 4;
            if (k.f170d || k.f169c) {
                if (k.f171e) {
                    e.a(graphics, r.e, (i6 - (e.m23c("fontBig") / 2)) - 4, -16777183, e.a(new StringBuffer().append(e.a(21)).append(1).toString(), r.c - 10));
                } else {
                    e.a(graphics, r.e, (i6 - (e.m23c("fontBig") / 2)) - 4, -16777183, e.a(new StringBuffer().append(e.a(21)).append(k.o + 1).toString(), r.c - 10));
                }
                e.a(graphics, r.e, i6, -16777213, e.a(e.a(10), r.c - 10));
            }
            graphics.drawLine(0, ((i6 - (e.m23c("fontBig") / 2)) - 8) - e.m23c("fontBig"), r.c, ((i6 - (e.m23c("fontBig") / 2)) - 8) - e.m23c("fontBig"));
        } else {
            if (k.f170d || k.f169c) {
                e.a(graphics, r.e, i6 - 4, -16777183, e.a(e.a(10), r.c - 10));
            }
            graphics.drawLine(0, (i6 - 8) - e.m23c("fontBig"), r.c, (i6 - 8) - e.m23c("fontBig"));
        }
        graphics.drawLine(0, iM23c + 4 + 3, r.c, iM23c + 4 + 3);
        graphics.setColor(3346688);
        graphics.drawRect(i7 - 1, iM23c - 1, i4 + 1, 4);
        graphics.setColor(16759552);
        graphics.fillRect(i7, iM23c, i5, 3);
        graphics.setColor(16777215);
        graphics.fillRect(i7, iM23c + 1, i5, 1);
        graphics.setColor(12810496);
        graphics.fillRect(i7, iM23c + 2, i5, 1);
    }

    private void a(Graphics graphics) throws Exception {
        graphics.setColor(0);
        graphics.fillRect(0, 0, r.c, r.d);
        int iM21a = e.m21a(e.a(this.f140a[this.v])) / 2;
        if (f134a != null) {
            f134a.a(graphics, 0, r.e, 0, -16777199, 0);
        }
        if (k.f171e) {
            e.a(graphics, r.e, k - 1, -16777183, "demo");
        }
        e.a(graphics, r.e, this.y + (t / 2), -16777213, e.a(this.f140a[this.v]));
        k.f164a.a(graphics, 2, (r.e - iM21a) - f138b, this.y + (t / 2), -16777206, 8192);
        k.f164a.a(graphics, 2, r.e + iM21a + f138b, this.y + (t / 2), -16777210, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021a  */
    @Override // defpackage.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(javax.microedition.lcdui.Graphics r14, boolean r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 3956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.a(javax.microedition.lcdui.Graphics, boolean):void");
    }

    private void h() throws Exception {
        if (this.f147d) {
            this.f147d = false;
            if (this.i == 0) {
                switch (this.w) {
                    case 0:
                        if (!k.f171e) {
                            d(24);
                            break;
                        } else {
                            k.l = 1;
                            k.f156a = 7;
                            this.w = 7;
                            this.f144a = true;
                            break;
                        }
                    case 1:
                        d(2);
                        break;
                    case 2:
                        d(1);
                        break;
                    case 3:
                        d(6);
                        break;
                    case 4:
                        d(8);
                        break;
                    case 5:
                        this.w = 5;
                        this.f144a = true;
                        break;
                }
            } else if (this.i == 15) {
                switch (this.w) {
                    case -1000:
                        d(0);
                        break;
                    case 6:
                        k.f156a = 6;
                        this.f144a = true;
                        break;
                    case 7:
                        k.f156a = 7;
                        this.f144a = true;
                        break;
                    case 8:
                        k.f156a = 8;
                        d(18);
                        break;
                }
            } else if (this.i == 24) {
                switch (this.w) {
                    case -1000:
                        d(0);
                        break;
                    case 42:
                        k.l = 0;
                        d(15);
                        break;
                    case 43:
                        k.l = 1;
                        d(15);
                        break;
                    case 44:
                        k.l = 2;
                        d(15);
                        break;
                }
            } else if (this.i == 2 || this.i == 1) {
                d(0);
            } else if (this.i == 6) {
                if (this.g == 15) {
                    l.a(true);
                    l.b(true);
                } else {
                    l.m43b();
                    l.a(false);
                    l.b(false);
                }
                this.w = this.g;
                d(0);
            } else if (this.i == 20) {
                if (this.g == 15) {
                    k.f168b = true;
                } else {
                    k.f168b = false;
                }
                k.f169c = true;
                this.f144a = true;
            } else if (this.i == 8 || this.i == 25 || this.i == 26) {
                d(0);
            } else if (this.i == 18) {
                if (this.w == -1000) {
                    d(15);
                } else {
                    k.f156a = 8;
                    this.w = 6;
                    k.f169c = true;
                    this.f144a = true;
                }
            } else if (this.i == 19) {
                k.f169c = true;
                this.f144a = true;
            }
        }
        this.f147d = false;
    }

    private void i() throws Exception {
        for (int i = 0; i < k.a.length; i++) {
            int i2 = k.a[i][0];
            if (k.a[i][1] == -1002 || (k.a[i][1] == -1003 && k.a[i][2] == 0)) {
                if (i2 == 6) {
                    if (this.i == 0) {
                        this.w = 5;
                        this.f144a = true;
                    } else if ((this.i == 1 || this.i == 2) && this.e == 1) {
                        this.h = 3;
                    } else if (this.i == 2 || this.i == 1) {
                        this.f147d = true;
                    } else if (this.i == 5 || this.i == 21) {
                        this.w = 16;
                        this.f144a = true;
                    } else if (this.i == 6 || this.i == 20 || this.i == 8 || this.i == 25 || this.i == 26) {
                        this.f147d = true;
                        this.g = 16;
                    } else if (this.i == 15 || this.i == 24 || this.i == 18) {
                        this.f147d = true;
                        this.w = -1000;
                    }
                }
                if (i2 == 7) {
                    if (this.i == 0 || this.i == 15 || this.i == 24) {
                        this.f147d = true;
                    } else if (this.i == 6 || this.i == 20 || this.i == 8 || this.i == 25 || this.i == 26) {
                        this.f147d = true;
                        this.g = 15;
                    } else if (this.i == 7 || this.i == 11 || this.i == 12 || this.i == 19) {
                        k.f169c = true;
                        this.f144a = true;
                    } else if (this.i == 5 || this.i == 21) {
                        this.f147d = true;
                        this.w = 15;
                        this.f144a = true;
                    } else if (this.i == 22) {
                        if (this.Y == 0) {
                            k.f169c = true;
                            i.a();
                            if (this.X < this.Z) {
                                this.Y = 2;
                            } else {
                                this.Y = 3;
                            }
                        }
                    } else if (this.i == 23) {
                        if (this.Y == 0) {
                            i.a();
                            if (this.X < this.Z) {
                                this.Y = 2;
                            } else {
                                this.Y = 3;
                            }
                        }
                    } else if ((this.i == 1 || this.i == 2) && this.e == 1) {
                        this.h = 4;
                    } else if (this.i == 2 || this.i == 1) {
                        this.f147d = true;
                    }
                    k.b();
                    k.c();
                } else if (i2 == 53 || i2 == 5) {
                    if (this.i == 0 || this.i == 15 || this.i == 24 || this.i == 1 || this.i == 8 || this.i == 25 || this.i == 26 || this.i == 2) {
                        this.f147d = true;
                    } else if (this.i == 6 || this.i == 20 || this.i == 8 || this.i == 25 || this.i == 26) {
                        this.f147d = true;
                        this.g = 15;
                    } else if (this.i == 7 || this.i == 11 || this.i == 12 || this.i == 19) {
                        k.f169c = true;
                        this.f144a = true;
                    } else if (this.i == 5 || this.i == 21) {
                        this.f147d = true;
                        this.w = 15;
                        this.f144a = true;
                    } else if (this.i == 18) {
                        if (this.L == 0) {
                            this.L = 1;
                        } else {
                            this.f147d = true;
                        }
                    } else if (this.i == 22) {
                        if (this.Y == 0) {
                            k.f169c = true;
                            i.a();
                            if (this.X < this.Z) {
                                this.Y = 2;
                            } else {
                                this.Y = 3;
                            }
                        }
                    } else if (this.i == 23 && this.Y == 0) {
                        i.a();
                        if (this.X < this.Z) {
                            this.Y = 2;
                        } else {
                            this.Y = 3;
                        }
                    }
                    k.b();
                    k.c();
                } else if (i2 == 54 || i2 == 8192) {
                    this.h = 4;
                } else if (i2 == 52 || i2 == 4096) {
                    this.h = 3;
                } else if (i2 == 50 || i2 == 12288) {
                    this.h = 1;
                } else if (i2 == 56 || i2 == 16384) {
                    this.h = 2;
                }
                int[] iArr = k.a[i];
                iArr[2] = iArr[2] + 1;
            } else if (k.a[i][1] == -1003) {
                if ((i2 == 52 || i2 == 4096) && k.a[i][2] == 0) {
                    this.J = 0;
                    this.h = 3;
                }
                if ((i2 == 54 || i2 == 8192) && k.a[i][2] == 0) {
                    this.J = 0;
                    this.h = 4;
                }
            }
        }
    }

    @Override // defpackage.o
    /* renamed from: a, reason: collision with other method in class */
    public final void mo36a(int i) {
        for (int i2 = 0; i2 < k.a.length; i2++) {
            if (k.a[i2][1] == -1001) {
                k.a[i2][0] = i;
                k.a[i2][1] = -1002;
                k.a[i2][2] = 0;
                return;
            } else {
                if (i2 == 0) {
                    k.a[i2][0] = i;
                    k.a[i2][1] = -1002;
                    k.a[i2][2] = 0;
                }
            }
        }
    }

    @Override // defpackage.o
    public final void b(int i) {
        for (int i2 = 0; i2 < k.a.length; i2++) {
            if (k.a[i2][0] == i && k.a[i2][1] == -1002) {
                k.a[i2][1] = -1003;
            }
        }
    }
}
