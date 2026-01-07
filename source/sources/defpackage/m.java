package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:m.class */
public final class m extends g {
    public boolean c;
    public int s;
    private int y;
    private int z;

    /* renamed from: b, reason: collision with other field name */
    private static g f176b;

    /* renamed from: b, reason: collision with other field name */
    private static byte[][] f177b;
    public static int t;
    private int A;
    private int B;
    public int u;
    public int v;
    private int C;
    public int w;
    public int x;
    private static int D;
    private static int E;
    private boolean d;
    public g a;
    private static String[] b = {"sceneryObjects.is"};

    /* renamed from: c, reason: collision with other field name */
    private static final byte[][] f178c = {new byte[]{0}};

    /* renamed from: d, reason: collision with other field name */
    private static final byte[][] f179d = {new byte[]{32}};
    private static final byte[][] e = {new byte[]{22, 22, 23, 23}, new byte[]{22, 23}};
    private static final byte[][] f = {new byte[]{4, 5, 6, 7}};
    private static final byte[][] g = {new byte[]{11}, new byte[]{11}, new byte[]{33}, new byte[]{12, 13, 14, 15, 16}};
    private static final byte[][] h = {new byte[]{34}, new byte[]{34}, new byte[]{33}, new byte[]{35, 36, 37, 38}};
    private static final byte[][] i = {new byte[]{0}, new byte[]{0}, new byte[]{0}};
    private static final byte[][] j = {new byte[]{17}};
    private static final byte[][] k = {new byte[]{19}, new byte[]{20}, new byte[]{21}, new byte[]{18}};
    private static final byte[][] l = {new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{2, 2, 3, 3}, new byte[]{3, 3, 3, 3}};
    private static final byte[][] m = {new byte[]{24}};
    private static final byte[][] n = {new byte[]{25}};
    private static final byte[][] o = {new byte[]{26}};
    private static final byte[][] p = {new byte[]{27}};
    private static final byte[][] q = {new byte[]{39, 40, 41, 42, 43}};
    private static final byte[][] r = {new byte[]{28, 29, 30, 31}};

    public m() throws Exception {
        this.f131a = false;
        for (int i2 = 0; i2 < b.length; i2++) {
            this.f129a = a(b[i2], (boolean[]) null);
            this.f129a.a();
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7, g gVar) throws Exception {
        this.u = i4;
        this.v = i5;
        a(i2, i3, i6, i7);
        this.a = gVar;
    }

    public final void a(int i2, int i3, int i4, int i5) throws Exception {
        if (this.f131a) {
            return;
        }
        this.s = i4;
        this.r = i5;
        this.c = i2;
        this.d = i3;
        c();
    }

    /* JADX WARN: Type inference failed for: r1v113, types: [byte[], byte[][]] */
    private void c() throws Exception {
        this.a = null;
        this.b = -16777183;
        this.f131a = true;
        this.c = false;
        this.f132b = false;
        this.q = 0;
        this.i = 0;
        this.j = 0;
        this.B = 0;
        int i2 = 0;
        this.y = 3;
        this.z = 0;
        this.f133a = (byte) this.f129a.f117a;
        switch (this.s) {
            case 1:
                switch (this.r) {
                    case 0:
                        this.f126a = f179d;
                        break;
                    case 1:
                        this.f126a = f;
                        break;
                    case 2:
                        this.f126a = j;
                        f177b = k;
                        f176b = new g();
                        f176b.f129a = this.f129a;
                        f176b.f126a = f177b;
                        f176b.b = -16777213;
                        f176b.f133a = (byte) f176b.f129a.f117a;
                        c(0);
                        f176b.c(0);
                        f176b.a(0, 0);
                        if (this.f129a.m28b(b()) > 90) {
                            D = 13;
                            E = 34;
                        } else {
                            D = 10;
                            E = 27;
                        }
                        f130a.a((this.c - this.f129a.m27a(b())) + 2, (this.d - E) + 2, 23);
                        f130a.a(((this.c + this.f129a.m27a(b())) - D) - 2, (this.d - E) + 2, 24);
                        this.d = true;
                        break;
                    case 3:
                        this.f126a = e;
                        break;
                    case 4:
                        this.f126a = new byte[]{new byte[]{6, -5, -6, 7, 6, 5, 6, -5, -6, 5, 6, -5, -6, 7, 6, -7, -6, 7, (byte) (7 + this.f133a)}, new byte[]{8, 9, -8, -9, (byte) (8 + this.f133a), 10, 9, -10, (byte) (9 + this.f133a), 10, (byte) (10 + this.f133a)}};
                        i2 = -1;
                        break;
                    case 6:
                        this.f126a = l;
                        break;
                    case 7:
                        this.b = -16777213;
                        this.f126a = g;
                        c(this.q);
                        this.l = this.f129a.m28b(b());
                        i2 = (-this.l) / 2;
                        break;
                    case 8:
                        this.b = -16777213;
                        this.f126a = h;
                        c(this.q);
                        this.l = this.f129a.m28b(b());
                        i2 = (-this.l) / 2;
                        break;
                    case 9:
                        this.f126a = i;
                        this.c -= c.f58i;
                        this.C = 5 * c.f54e;
                        this.w = c.f53d;
                        this.x = c.f54e / 5;
                        break;
                    case 10:
                        this.f126a = i;
                        this.C = 3 * c.f54e;
                        this.w = c.f53d / 5;
                        this.x = 2;
                        this.c -= this.w / 2;
                        break;
                    case 11:
                        this.d -= c.f54e;
                        this.f126a = i;
                        this.C = 3 * c.f54e;
                        this.w = c.f53d / 5;
                        this.x = 2;
                        this.c -= this.w / 2;
                        break;
                    case 22:
                        this.f126a = f178c;
                        this.A = 5;
                        this.b = -16777199;
                        break;
                    case 23:
                        this.f126a = i;
                        this.w = D;
                        if (this.c >= a.f41o - (4 * c.f53d)) {
                            this.C = E;
                            this.x = 0;
                            break;
                        } else {
                            this.C = E;
                            this.x = E;
                            break;
                        }
                    case 24:
                        this.f126a = i;
                        this.w = D;
                        if (this.c >= a.f41o - (4 * c.f53d)) {
                            this.C = E;
                            this.x = E;
                            break;
                        } else {
                            this.C = 0;
                            this.x = E - 2;
                            break;
                        }
                }
                c(this.q);
                break;
            case 2:
                i2 = (-c.f54e) / 4;
                switch (this.r) {
                    case 0:
                        this.f126a = m;
                        break;
                    case 1:
                        this.f126a = n;
                        break;
                    case 2:
                        this.f126a = o;
                        break;
                    case 3:
                        this.f126a = p;
                        break;
                }
                c(0);
                break;
            case 3:
                switch (this.r) {
                    case 0:
                        this.f126a = r;
                        this.A = 100;
                        break;
                    case 1:
                        this.f126a = q;
                        this.A = 50;
                        break;
                }
                c(0);
                break;
        }
        this.k = this.f129a.m27a(b());
        this.l = this.f129a.m28b(b());
        this.d += i2;
        a(0, 0);
    }

    public final void d(int i2) {
        if (i2 != this.q) {
            this.q = i2;
            c(i2);
        }
    }

    @Override // defpackage.g
    public final void b() {
        super.b();
        if (f130a != null) {
            f130a = null;
        }
        if (f176b != null) {
            f177b = (byte[][]) null;
            f176b.b();
            f176b = null;
        }
        if (this.a != null) {
            this.a = null;
        }
    }

    private void b(int i2, int i3) {
        if (this.y == 3) {
            this.d -= i2;
        } else {
            this.d += i2;
        }
        if (i3 == 0 || f130a.j % i3 != 0) {
            return;
        }
        if (this.y == 3) {
            this.y = 4;
        } else {
            this.y = 3;
        }
    }

    private void g() {
        if (!a.f45b) {
            if (a.f44a) {
                t = 1;
            } else {
                t = 0;
            }
        }
        if (t != 1) {
            this.d = true;
        } else if (f130a.j % 5 == 0) {
            this.d = !this.d;
        }
        if (t == 0) {
            f176b.c(0);
            return;
        }
        if (t == 1) {
            f176b.c(1);
        } else if (t == 2) {
            f176b.c(2);
        } else if (t == 3) {
            f176b.c(3);
        }
    }

    public final void a() throws Exception {
        this.a = 0;
        switch (this.s) {
            case 1:
                switch (this.r) {
                    case 1:
                        if (f130a.j % 25 == 0) {
                            f130a.a(this.c, this.d, 0, -10, 1, null);
                            break;
                        }
                        break;
                    case 2:
                        this.b = -16777176;
                        g();
                        if (this.c + (2 * this.f129a.m27a(b())) < a.c) {
                            this.f131a = false;
                            break;
                        }
                        break;
                    case 4:
                        if (this.q != 0 || !this.f132b) {
                            if (this.q == 1 && this.f132b) {
                                d(0);
                                break;
                            }
                        } else {
                            d(1);
                            break;
                        }
                        break;
                    case 6:
                        if (this.q == 1 && this.f132b) {
                            d(2);
                            f130a.a(this.c, this.d, -1, 5, 1, a.f37a);
                            f130a.a(this.c, this.d, -3, 0, 1, a.f37a);
                            f130a.a(this.c, this.d, -1, -5, 1, a.f37a);
                            break;
                        }
                        break;
                    case 7:
                    case 8:
                        b(1, 3);
                        if (this.q == 3 && this.f132b) {
                            this.f131a = false;
                            break;
                        }
                        break;
                    case 9:
                        if (this.q == 1) {
                            this.x += 5;
                        }
                        int iM12b = c.m12b(c.a(this.c << 16, (this.d + this.x) << 16));
                        if (iM12b == 2 || iM12b == 1 || iM12b == 24 || iM12b == 14 || iM12b == 17 || iM12b == 15 || iM12b == 13) {
                            d(2);
                            break;
                        }
                        break;
                    case 10:
                        if (this.q != 1) {
                            if (this.q == 3) {
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3;
                                    if (i2 > this.x / c.f54e) {
                                        this.f131a = false;
                                        break;
                                    } else {
                                        f130a.a(this.c, this.d + i4, 4, (n) null);
                                        i2++;
                                        i3 = i4 + c.f54e;
                                    }
                                }
                            }
                        } else {
                            this.x += 2;
                            if (this.x > this.C) {
                                d(2);
                            }
                            int iM12b2 = c.m12b(c.a(this.c << 16, (this.d + this.x) << 16));
                            if (iM12b2 == 2 || iM12b2 == 1 || iM12b2 == 24 || iM12b2 == 14 || iM12b2 == 17 || iM12b2 == 15 || iM12b2 == 13) {
                                d(2);
                                break;
                            }
                        }
                        break;
                    case 11:
                        if (this.q != 1) {
                            if (this.q == 3) {
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6;
                                    if (i5 > this.x / c.f54e) {
                                        this.f131a = false;
                                        break;
                                    } else {
                                        f130a.a(this.c, this.d + i7, 4, (n) null);
                                        i5++;
                                        i6 = i7 + c.f54e;
                                    }
                                }
                            }
                        } else {
                            this.x += 2;
                            this.d -= 2;
                            if (this.x > this.C) {
                                d(2);
                            }
                            if (c.m12b(c.a(this.c << 16, (this.d - this.x) << 16)) == 28) {
                                d(2);
                                break;
                            }
                        }
                        break;
                    case 22:
                        this.z += a.e;
                        this.d += this.z;
                        int i8 = this.B + 1;
                        this.B = i8;
                        if (i8 > this.A) {
                            this.f131a = false;
                            break;
                        }
                        break;
                    case 23:
                        if (a.f45b) {
                            if (this.x >= this.C) {
                                this.x = this.C;
                                break;
                            } else {
                                this.x += (this.C / 2) + 2;
                                break;
                            }
                        }
                        break;
                    case 24:
                        if (a.f44a && this.c < a.f41o) {
                            this.x -= 5;
                            if (this.x < this.C) {
                                this.f131a = false;
                                break;
                            }
                        }
                        break;
                }
            case 2:
                b(1, 3);
                break;
            case 3:
                switch (this.r) {
                    case 1:
                        this.c += this.u;
                        this.d += this.v;
                        break;
                }
                int i9 = this.B + 1;
                this.B = i9;
                if (i9 > this.A) {
                    f130a.a(this.c, this.d, 4, (n) null);
                    this.f131a = false;
                    break;
                }
                break;
        }
        if (this.c < a.f38b.c - r.e || this.d > c.f60k || this.d < 0) {
            this.f131a = false;
        }
    }

    @Override // defpackage.g
    public final void a(Graphics graphics) {
        if ((this.s == 1 && (this.r == 2 || this.r == 9)) || a()) {
            if (this.s != 1 || (this.r != 9 && this.r != 10 && this.r != 11 && this.r != 23 && this.r != 24)) {
                if (b() != 33) {
                    if (this.s != 1 || (this.s == 1 && this.r != 2)) {
                        a(graphics, this.c, this.d);
                    }
                    switch (this.s) {
                        case 1:
                            switch (this.r) {
                                case 2:
                                    this.b = -16777176;
                                    a(graphics, this.c, this.d, 0);
                                    this.b = -16777180;
                                    a(graphics, this.c, this.d, 8192);
                                    if (f176b != null && this.d) {
                                        f176b.a(graphics, this.c, (this.d - this.l) + (this.l / 6));
                                        break;
                                    }
                                    break;
                                case 4:
                                    if (this.q == 0) {
                                        a(graphics, this.c, (this.d - (3 * c.f54e)) - 5);
                                        break;
                                    }
                                    break;
                            }
                    }
                }
                return;
            }
            switch (this.r) {
                case 9:
                    graphics.setColor(10083805);
                    graphics.fillRect((this.c + 1) - a.c, this.d - a.d, this.w, this.x);
                    graphics.setColor(9029318);
                    graphics.fillRect((this.c + (this.w / 2)) - a.c, this.d - a.d, this.w - (this.w / 2), this.x);
                    graphics.setColor(16777215);
                    graphics.fillRect((this.c + (this.w / 5)) - a.c, this.d - a.d, this.w / 7, this.x);
                    graphics.setColor(4890527);
                    graphics.fillRect((((this.c + (this.w / 5)) + (this.w / 7)) + 1) - a.c, this.d - a.d, 1, this.x);
                    graphics.setColor(4890527);
                    graphics.drawRoundRect(this.c - a.c, this.d - a.d, this.w, this.x, 5, 5);
                    break;
                case 10:
                    graphics.setColor(10092666);
                    graphics.fillRect((this.c + (this.w / 3)) - a.c, this.d - a.d, this.w / 5, this.x);
                    graphics.setColor(16728549);
                    graphics.fillRect((this.c + (this.w / 2)) - a.c, this.d - a.d, this.w - (this.w / 3), this.x);
                    graphics.setColor(16749544);
                    graphics.fillRect((this.c + (this.w / 2)) - a.c, this.d - a.d, this.w / 7, this.x);
                    graphics.setColor(0);
                    graphics.drawRoundRect(this.c - a.c, this.d - a.d, this.w, this.x, 5, 5);
                    break;
                case 11:
                    graphics.setColor(10092666);
                    graphics.fillRect((this.c + (this.w / 3)) - a.c, this.d - a.d, this.w / 5, this.x);
                    graphics.setColor(16728549);
                    graphics.fillRect((this.c + (this.w / 2)) - a.c, this.d - a.d, this.w - (this.w / 3), this.x);
                    graphics.setColor(16749544);
                    graphics.fillRect((this.c + (this.w / 2)) - a.c, this.d - a.d, this.w / 7, this.x);
                    graphics.setColor(0);
                    graphics.drawRoundRect(this.c - a.c, this.d - a.d, this.w, this.x, 5, 5);
                    break;
                case 23:
                case 24:
                    graphics.setColor(9754596);
                    graphics.fillRect(this.c - a.c, this.d - a.d, this.w - 2, this.x);
                    graphics.setColor(16974);
                    graphics.fillRect((this.c + 1) - a.c, (this.d - a.d) + 1, this.w - 1, this.x);
                    graphics.setColor(4890527);
                    graphics.fillRect((this.c - a.c) + 1, this.d - a.d, this.w - 2, this.x);
                    break;
            }
        }
    }
}
