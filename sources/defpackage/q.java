package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:q.class */
public final class q extends g {
    private static final byte[][] b = {new byte[]{0}, new byte[]{0}};
    private int u;
    private int v;
    private int w;
    public int s;
    public int t;
    private int x;
    private int y;
    private int z;
    private g[] a;
    private byte[][] c;

    /* renamed from: c, reason: collision with other field name */
    public boolean f188c;

    public q(a aVar) throws Exception {
        this.f131a = false;
        f130a = aVar;
        this.f129a = a("roboTron.is", (boolean[]) null);
        this.f129a.a();
        this.a = new g[2];
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = new g();
            this.a[i].f129a = this.a[i].a("sceneryObjects.is", (boolean[]) null);
            this.a[i].f133a = (byte) this.a[i].f129a.f117a;
            this.a[i].b = -16777183;
        }
    }

    public final void a() throws Exception {
        g();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    private void g() throws Exception {
        this.f131a = true;
        this.f132b = false;
        this.f188c = false;
        this.b = -16777183;
        this.z = 3;
        this.c = f130a.f7a.c - (c.f53d * 100);
        this.c = new byte[]{new byte[]{8, 9, -8, -9, (byte) (8 + this.f133a), 10, 9, -10, (byte) (9 + this.f133a), 10, (byte) (10 + this.f133a)}};
        this.a[0].f126a = this.c;
        this.a[1].f126a = this.c;
        this.a[0].c(0);
        this.a[1].c(0);
        this.a[0].i = 0;
        this.a[1].i = 3;
        this.x = this.a[0].f129a.m28b(8);
        this.y = c.f54e * 3;
        this.u = 6;
        this.v = 1;
        this.w = c.f53d;
        this.q = 1;
        this.i = 0;
        this.f126a = b;
        this.t = c.f53d * 50;
        this.k = this.f129a.m27a(b());
        this.l = this.f129a.m28b(b());
        a(0, 0);
    }

    @Override // defpackage.g
    public final void b() {
        super.b();
    }

    private void b(int i, int i2) {
        if (this.z == 3) {
            this.d -= i;
        } else {
            this.d += i;
        }
        if (i2 == 0 || f130a.j % i2 != 0) {
            return;
        }
        if (this.z == 3) {
            this.z = 4;
        } else {
            this.z = 3;
        }
    }

    public final void c() throws Exception {
        b(1, 3);
        if (this.q == 1) {
            this.d = a.f38b.d - this.y;
            if (a.f37a.c - this.c > this.t || this.f188c) {
                this.s += this.v;
            } else {
                this.s = this.u;
            }
            if (this.s > this.w) {
                this.s = this.w;
            }
            this.c += this.s;
            if (this.c > a.f41o - (c.f53d * 2) && (f130a.f7a.q == f130a.f7a.s || f130a.f7a.q == f130a.f7a.t)) {
                this.q = 2;
            }
        } else if (this.q == 2) {
            if (this.c < a.f41o - (c.f53d / 2)) {
                if (this.s - this.v > 0) {
                    this.s -= this.v;
                } else {
                    this.s = 0;
                }
                this.c += this.s;
            }
            if (this.c > a.f41o - (c.f53d / 2)) {
                this.c = a.f41o - (c.f53d / 2);
            }
        }
        int iA = l.a(1, 3);
        this.a[0].c = this.c + iA;
        this.a[1].c = this.c - iA;
        this.a[0].d = this.d + this.x;
        this.a[1].d = this.d + this.x;
    }

    @Override // defpackage.g
    public final void a(Graphics graphics) throws Exception {
        if (a()) {
            if (this.s > 0) {
                for (int i = 0; i < this.a.length; i++) {
                    this.a[i].a(graphics);
                    this.a[i].e();
                }
            }
            a(graphics, this.c, this.d);
            this.f129a.a(graphics, 1, this.c - a.c, (this.d + this.x) - a.d, -16777199, 0);
        }
    }
}
