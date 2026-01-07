package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:t.class */
public final class t extends g {
    private n a;
    private int s;

    /* renamed from: a, reason: collision with other field name */
    private int[] f201a;
    private int[] b;
    private int[] c;
    private int[] d;
    private int[] e;
    private int[] f;
    private int t;

    /* renamed from: a, reason: collision with other field name */
    private g[] f202a;

    /* renamed from: c, reason: collision with other field name */
    public boolean f203c;

    /* renamed from: b, reason: collision with other field name */
    private static String[] f204b = {"effects.is"};

    /* renamed from: b, reason: collision with other field name */
    private static final byte[][] f205b = {new byte[]{0, 1, 2, 3}};

    /* renamed from: c, reason: collision with other field name */
    private static final byte[][] f206c = {new byte[]{4, 5, 6, 7, 8, 9, 10}, new byte[]{5, 7, 9, 10}, new byte[]{6, 8, 10}};

    /* renamed from: d, reason: collision with other field name */
    private static final byte[][] f207d = {new byte[]{11, 12, 13}};

    /* renamed from: e, reason: collision with other field name */
    private static final byte[][] f208e = {new byte[]{14, 15, 16, 17, 18}};

    /* renamed from: f, reason: collision with other field name */
    private static final byte[][] f209f = {new byte[]{-23, -24, -25, -26, -27, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -23, -25, -27, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, 23, 25, 27}};

    public t() throws Exception {
        h();
    }

    private void h() throws Exception {
        for (int i = 0; i < f204b.length; i++) {
            this.f129a = a(f204b[i], (boolean[]) null);
            this.f129a.a();
        }
    }

    public final void a(int i, int i2, int i3, n nVar) throws Exception {
        this.c = i;
        this.d = i2;
        this.r = i3;
        this.a = nVar;
        this.f131a = true;
        i();
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v84, types: [byte[], byte[][]] */
    private void i() throws Exception {
        this.b = -16777213;
        this.q = 0;
        this.i = 0;
        this.f132b = false;
        this.f203c = false;
        switch (this.r) {
            case 1:
                this.f126a = f205b;
                c(0);
                this.f133a = (byte) this.f129a.f117a;
                this.b = -16777213;
                this.f203c = true;
                break;
            case 2:
                this.f126a = f206c;
                this.t = 6;
                this.f202a = new g[this.t];
                for (int i = 0; i < this.f202a.length; i++) {
                    this.f202a[i] = new g();
                    this.f202a[i].f126a = this.f126a;
                    this.f202a[i].c(l.a(0, this.f126a.length - 1));
                    this.f202a[i].f129a = this.f129a;
                    this.f202a[i].f133a = (byte) this.f129a.f117a;
                    this.f202a[i].f131a = false;
                    this.f202a[i].b = -16777183;
                }
                break;
            case 3:
                this.f126a = f207d;
                c(0);
                break;
            case 4:
                this.f126a = f208e;
                c(0);
                break;
            case 5:
                this.f133a = (byte) this.f129a.f117a;
                this.f126a = new byte[]{new byte[]{19, 20, 21, 22, (byte) (22 + this.f133a), (byte) (21 + this.f133a), (byte) (20 + this.f133a)}};
                c(0);
                break;
            case 6:
                this.f133a = (byte) this.f129a.f117a;
                this.f126a = f209f;
                c(0);
                break;
            case 7:
                this.f131a = false;
                this.f126a = new byte[]{new byte[]{30, 31, 32, 29, 29, 29}, new byte[]{14, 15, 16, 17, 18}};
                this.t = r.c / 20;
                this.f202a = new g[this.t];
                for (int i2 = 0; i2 < this.f202a.length; i2++) {
                    this.f202a[i2] = new g();
                    this.f202a[i2].f126a = this.f126a;
                    this.f202a[i2].c(0);
                    this.f202a[i2].f129a = this.f129a;
                    this.f202a[i2].f133a = (byte) this.f129a.f117a;
                    this.f202a[i2].p = l.a(r.c / 10, r.c / 20);
                    this.f202a[i2].i = l.a(0, this.f126a[this.j].length - 0);
                    this.f202a[i2].b = -16777213;
                }
                this.s = r.c / 10;
                this.f201a = new int[this.s];
                this.b = new int[this.s];
                this.c = new int[this.s];
                this.e = new int[this.s];
                for (int i3 = 0; i3 < this.f201a.length; i3++) {
                    d(i3);
                }
                break;
            case 8:
                this.f131a = false;
                this.f201a = new int[1];
                this.b = new int[1];
                this.d = new int[1];
                this.c = new int[1];
                this.e = new int[1];
                this.f = new int[1];
                break;
        }
        if (this.r != 8) {
            c(0);
        }
        this.i = 0;
    }

    private void d(int i) {
        this.f201a[i] = a.c + r.c + l.a(0, r.c);
        this.b[i] = l.a(0, r.d);
        this.c[i] = this.f201a[i] + l.a(r.e / 7, r.e / 5);
        this.e[i] = l.a(r.c / 25, r.c / 50);
    }

    public final void a() {
        this.f131a = true;
        this.q = 0;
        for (int i = 0; i < this.f202a.length; i++) {
            this.f202a[i].c += r.c + l.a(0, r.c);
            this.f202a[i].d = a.d + l.a(0, r.d);
            this.f202a[i].i = 0;
            this.f202a[i].c(0);
        }
    }

    public final void c() {
        this.f131a = true;
        this.e[0] = l.a(10, 30);
        this.f[0] = l.a(2, 5);
        this.f201a[0] = r.c + l.a(0, r.c);
        this.b[0] = l.a(0, r.f / 2) + a.d;
        this.c[0] = this.f201a[0] - this.e[0];
        this.d[0] = this.b[0] + this.f[0];
    }

    @Override // defpackage.g
    public final void b() {
    }

    public final void g() throws Exception {
        switch (this.r) {
            case 1:
                if (this.f132b) {
                    this.f131a = false;
                    break;
                }
                break;
            case 2:
                if (!this.a.f131a || this.a.q == 22) {
                    this.f131a = false;
                }
                int i = this.a.X < 0 ? -3 : 3;
                for (int i2 = 0; i2 < this.f202a.length; i2++) {
                    if (this.f202a[i2].f131a && this.f202a[i2].f132b) {
                        this.f202a[i2].f131a = false;
                    }
                }
                for (int i3 = 0; i3 < this.f202a.length; i3++) {
                    if (this.a.r && this.a.X != 0 && !this.f202a[i3].f131a) {
                        this.f202a[i3].f131a = true;
                        this.f202a[i3].c = this.a.c - i;
                        this.f202a[i3].d = this.a.d;
                        this.f202a[i3].c(l.a(0, this.f126a.length - 1));
                        this.f202a[i3].i = 0;
                        break;
                    }
                }
                break;
            case 3:
                this.c = this.a.c;
                this.d = this.a.d - this.a.n;
                if (this.a.q != 21 || !this.a.f131a) {
                    this.f131a = false;
                    break;
                }
                break;
            case 4:
                if (this.f132b) {
                    this.f131a = false;
                    break;
                }
                break;
            case 5:
                this.c = this.a.c;
                this.d = this.a.d - this.a.n;
                if (!this.a.f186e || !this.a.f131a) {
                    this.f131a = false;
                    break;
                }
                break;
            case 6:
                this.c = this.a.c;
                this.d = this.a.d - this.a.n;
                if (!this.a.f || !this.a.f131a) {
                    this.f131a = false;
                    break;
                }
                break;
            case 7:
                for (int i4 = 0; i4 < this.f202a.length; i4++) {
                    this.f202a[i4].c -= this.f202a[i4].p;
                    if (this.f202a[i4].c - a.c < 0) {
                        this.f202a[i4].c += r.c + this.f202a[i4].p;
                        this.f202a[i4].d = a.d + l.a(0, r.d);
                    }
                    this.f202a[i4].e();
                }
                for (int i5 = 0; i5 < this.f201a.length; i5++) {
                    int[] iArr = this.f201a;
                    int i6 = i5;
                    iArr[i6] = iArr[i6] - this.e[i5];
                    int[] iArr2 = this.c;
                    int i7 = i5;
                    iArr2[i7] = iArr2[i7] - this.e[i5];
                    if (this.c[i5] < a.c) {
                        d(i5);
                    }
                }
                if ((!this.a.f184c || !this.a.f131a) && this.q == 0) {
                    for (int i8 = 0; i8 < this.f202a.length; i8++) {
                        this.q = 1;
                        this.f202a[i8].c(1);
                        this.f202a[i8].i = 0;
                    }
                }
                if (this.q == 1 && this.f202a[0].f132b) {
                    this.f131a = false;
                    break;
                }
                break;
            case 8:
                this.f201a[0] = this.c[0];
                this.b[0] = this.d[0];
                int[] iArr3 = this.c;
                iArr3[0] = iArr3[0] - this.e[0];
                int[] iArr4 = this.d;
                iArr4[0] = iArr4[0] + this.f[0];
                if (this.f201a[0] < 0 || this.b[0] > a.d + r.d) {
                    this.f131a = false;
                    break;
                }
                break;
            default:
                this.c = this.a.c;
                this.d = this.a.d - this.a.n;
                if (this.a.A != this.r) {
                    this.f131a = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.g
    public final void a(Graphics graphics) throws Exception {
        switch (this.r) {
            case 2:
                if (this.a.X > 327680) {
                    for (int i = 0; i < this.f202a.length; i++) {
                        if (this.f202a[i].f131a) {
                            this.f202a[i].a(graphics);
                            this.f202a[i].e();
                        }
                    }
                    break;
                }
                break;
            case 7:
                for (int i2 = 0; i2 < this.f202a.length; i2++) {
                    this.f202a[i2].a(graphics);
                }
                graphics.setColor(100, 255, 255);
                for (int i3 = 0; i3 < this.f201a.length; i3++) {
                    graphics.drawLine(this.f201a[i3] - a.c, this.b[i3], this.c[i3] - a.c, this.b[i3]);
                }
                break;
            case 8:
                graphics.setColor(i.a(20, -((this.b[0] - a.d) / (r.f / 5))), i.a(230, -((this.b[0] - a.d) / (r.f / 5))), i.a(230, -(this.b[0] / (r.f / 5))));
                graphics.drawLine(this.f201a[0], this.b[0] - a.d, this.c[0], this.d[0] - a.d);
                break;
            default:
                super.a(graphics);
                break;
        }
    }
}
