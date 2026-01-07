package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:k.class */
public final class k extends o {
    public static int[][] a;

    /* renamed from: a, reason: collision with other field name */
    public static int f156a;
    public static int b;
    public static int c;
    private int[] e = {1, 2};
    public static int l;

    /* renamed from: a, reason: collision with other field name */
    public static h f162a;
    public static int m;
    public static int n;
    public static int o;

    /* renamed from: b, reason: collision with other field name */
    private static f f163b;

    /* renamed from: a, reason: collision with other field name */
    public static f f164a;
    private int p;

    /* renamed from: a, reason: collision with other field name */
    private a f165a;
    private int q;

    /* renamed from: a, reason: collision with other field name */
    public static boolean f166a;
    private int r;

    /* renamed from: b, reason: collision with other field name */
    public static boolean f168b;

    /* renamed from: c, reason: collision with other field name */
    public static boolean f169c;

    /* renamed from: d, reason: collision with other field name */
    public static boolean f170d;

    /* renamed from: a, reason: collision with other field name */
    public static int[] f157a = {0, 1, 2, 3, 5};
    public static int d = 3;

    /* renamed from: e, reason: collision with other field name */
    public static int f158e = 0;

    /* renamed from: b, reason: collision with other field name */
    public static int[] f159b = {7, 8};
    public static int f = 0;
    public static int g = 7;

    /* renamed from: c, reason: collision with other field name */
    public static int[] f160c = {6, 7, 8};
    public static int h = 1;
    public static int i = 6;

    /* renamed from: d, reason: collision with other field name */
    public static int[] f161d = {42, 43, 44};
    public static int j = 1;
    public static int k = 43;

    /* renamed from: a, reason: collision with other field name */
    public static String[] f167a = {"menu.mid", "carrera1.mid", "carrera2.mid"};

    /* renamed from: e, reason: collision with other field name */
    public static boolean f171e = false;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.o
    public final void a() throws Exception {
        try {
            System.gc();
            this.f = true;
            a = new int[3][3];
            f162a = new h();
            c(2000);
            this.f = false;
            if (f164a == null) {
                f164a = new f("systemSymbols.is");
            }
            h();
            this.f = true;
            g();
            this.f = false;
            this.p = 3;
            this.r = 6;
        } catch (Exception e) {
            i.a(this, e);
            return;
        }
        do {
            l.m43b();
            b();
            c();
            f166a = false;
            l.a();
            k();
            switch (f162a.a(this.r)) {
                case 5:
                    f166a = true;
                    l.a(100);
                    break;
                case 6:
                case 7:
                    l.m43b();
                    f158e = 0;
                    if (f156a == 7 || f171e) {
                        f162a.a(22);
                        if (f171e) {
                            o = 2;
                        } else {
                            o = 0;
                        }
                        this.r = 0;
                        i = 6;
                    } else if (f156a == 6) {
                        o = Integer.parseInt(new String(u.a(0)));
                        this.r = 0;
                        i = 6;
                    } else {
                        this.r = 15;
                        i = 8;
                        g = 8;
                    }
                    System.gc();
                    this.f165a = new a();
                    this.f165a.d();
                    boolean z = a.h == 6;
                    this.f165a.b();
                    this.f165a = null;
                    b();
                    c();
                    if (z && ((f156a == 7 || f156a == 6) && !f171e)) {
                        f162a.a(23);
                        f162a.a(12);
                    }
                    l.m43b();
                    System.gc();
                    l.a(100);
                    break;
                default:
                    l.a(100);
                    break;
            }
            i.a(this, e);
            return;
        } while (!f166a);
        l.m43b();
        this.f = true;
        a(1, 250);
        j();
    }

    private static void f() throws Exception {
        e.a(e.a("txtEnglish.stg"));
    }

    private void g() throws Exception {
        System.gc();
        e.m16a("fontSmall");
        e.c("fontSmall");
        e.m19a();
        e.m16a("fontBig");
        e.c("fontBig");
        f();
        this.p = 2;
        a("");
        a("");
        a("");
        a("");
    }

    private void a(String str) {
        System.gc();
        n++;
        e();
        l.a(1000L);
    }

    private void h() throws Exception {
        f170d = false;
        f169c = true;
        b();
        i();
        n = -1;
        m = 3;
    }

    private void i() throws Exception {
        u.a();
        if (u.m59a() == 0) {
            this.f = true;
            o = 0;
            u.a("".getBytes());
            u.a(0, Integer.toString(o).getBytes());
        }
    }

    private static void j() {
        e.m17b("fontSmall");
        e.m17b("fontBig");
        if (f163b != null) {
            f163b = null;
        }
        System.gc();
    }

    private void a(int i2, int i3) throws Exception {
        f163b = new f("logo.is");
        this.p = 1;
        this.q = i2;
        e();
        this.p = 3;
        l.a(i3);
        f163b = null;
    }

    private void c(int i2) throws Exception {
        f163b = new f("logo.is");
        this.p = 1;
        this.q = 0;
        while (this.q < f163b.f117a) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                if (this.q == this.e[i3]) {
                    e();
                    l.a(i2);
                }
            }
            this.q++;
        }
        this.p = 3;
        f163b = null;
    }

    @Override // defpackage.o
    public final void a(Graphics graphics, boolean z) throws Exception {
        if (z) {
            f169c = true;
        }
        if (this.p == 2) {
            h.a(graphics, n, m, false);
        } else if (this.p == 1) {
            graphics.setColor(255, 255, 255);
            graphics.fillRect(0, 0, r.c, r.d);
            f163b.a(graphics, this.q, r.e, r.f, -16777213, 0);
        }
        if (i.f153b) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, r.c, 25);
            graphics.setColor(255);
            graphics.drawString(i.f152a, r.c, r.f, 24);
        }
    }

    public static void b() {
        for (int i2 = 0; i2 < a.length; i2++) {
            a[i2][0] = -1001;
            a[i2][1] = -1001;
            a[i2][2] = 0;
        }
    }

    public static void c() {
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2][1] == -1003) {
                a[i2][0] = -1001;
                a[i2][1] = -1001;
                a[i2][2] = 0;
            }
        }
    }

    private static void k() throws Exception {
        for (int i2 = 0; i2 < a.length; i2++) {
            int i3 = a[i2][0];
            if (a[i2][1] == -1002 && i3 == 6) {
                f166a = true;
                b();
                c();
            }
        }
    }

    @Override // defpackage.o
    /* renamed from: a */
    public final void mo36a(int i2) {
        for (int i3 = 0; i3 < a.length; i3++) {
            if (a[i3][1] == -1001) {
                a[i3][0] = i2;
                a[i3][1] = -1002;
                a[i3][2] = 0;
                return;
            } else {
                if (i3 == 0) {
                    a[i3][0] = i2;
                    a[i3][1] = -1002;
                    a[i3][2] = 0;
                }
            }
        }
    }

    @Override // defpackage.o
    public final void b(int i2) {
        for (int i3 = 0; i3 < a.length; i3++) {
            if (a[i3][0] == i2 && a[i3][1] == -1002) {
                a[i3][1] = -1003;
            }
        }
    }
}
