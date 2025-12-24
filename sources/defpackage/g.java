package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:g.class */
public class g {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* renamed from: a, reason: collision with other field name */
    public static f[] f127a;

    /* renamed from: a, reason: collision with other field name */
    public static String[] f128a;

    /* renamed from: a, reason: collision with other field name */
    public f f129a;

    /* renamed from: a, reason: collision with other field name */
    public static a f130a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f131a;

    /* renamed from: b, reason: collision with other field name */
    public boolean f132b;

    /* renamed from: a, reason: collision with other field name */
    public byte f133a;
    public int r;

    /* renamed from: a, reason: collision with other field name */
    public byte[][] f126a = (byte[][]) null;
    public int i = 0;

    public g() {
        this.f129a = null;
        this.f129a = null;
    }

    public final f a(String str, boolean[] zArr) throws Exception {
        return a(str, false);
    }

    public static f a(String str, boolean z) throws Exception {
        if (f127a == null) {
            f127a = new f[20];
            f128a = new String[20];
        }
        if (!z) {
            for (int i = 0; i < 20; i++) {
                if (f128a[i] != null && f128a[i].equals(str)) {
                    return f127a[i];
                }
            }
        }
        for (int i2 = 0; i2 < 20; i2++) {
            if (f127a[i2] == null) {
                f127a[i2] = new f(str);
                f128a[i2] = str;
                return f127a[i2];
            }
        }
        return null;
    }

    public static void d() {
        if (f127a != null) {
            f127a = null;
        }
        if (f128a != null) {
            f128a = null;
        }
    }

    public void b() {
        if (this.f126a != null) {
            this.f126a = (byte[][]) null;
        }
        if (this.f129a != null) {
            this.f129a = null;
        }
    }

    public final void a(int i, int i2) {
        a(i);
        b(i2);
    }

    public final void a(int i) {
        this.k = this.f129a.m27a(m33b());
        this.m = this.k / 2;
        this.e = this.k + i;
        this.f = this.e / 2;
    }

    public final void b(int i) {
        this.l = this.f129a.m28b(m33b());
        this.n = this.l / 2;
        this.g = this.l + i;
        this.h = this.g / 2;
    }

    public final boolean a(int i, int i2, int i3, int i4) {
        int i5 = this.c - this.f;
        int i6 = this.c + this.f;
        int i7 = this.d - this.g;
        int i8 = this.d;
        if ((this.b & (-16777214)) == -16777214) {
            i7 = this.d - this.h;
            i8 = this.d + this.h;
        }
        if ((this.b & (-16777208)) == -16777208) {
            i5 = this.c - this.e;
            i6 = this.c;
        }
        int i9 = i + i3;
        int i10 = i2 + i4;
        if (i5 > i9 || i6 < i || i7 > i10 || i8 < i2) {
            return false;
        }
        if ((i5 < i || i5 > i9) && ((i6 < i || i6 > i9) && (i5 > i || i6 < i9))) {
            return false;
        }
        if (i7 >= i2 && i7 <= i10) {
            return true;
        }
        if (i8 < i2 || i8 > i10) {
            return i7 <= i2 && i8 >= i10;
        }
        return true;
    }

    public final boolean a(g gVar) {
        int i = this.c - this.f;
        int i2 = this.c + this.f;
        int i3 = this.d - this.g;
        int i4 = this.d;
        if ((this.b & (-16777214)) == -16777214) {
            i3 = this.d - this.h;
            i4 = this.d + this.h;
        }
        if ((this.b & (-16777208)) == -16777208) {
            i = this.c - this.e;
            i2 = this.c;
        }
        int i5 = gVar.c - gVar.f;
        int i6 = gVar.c + gVar.f;
        int i7 = gVar.d - gVar.g;
        int i8 = gVar.d;
        if ((gVar.b & (-16777214)) == -16777214) {
            i7 = gVar.d - gVar.h;
            i8 = gVar.d + gVar.h;
        }
        if (i > i6 || i2 < i5 || i3 > i8 || i4 < i7) {
            return false;
        }
        if ((i < i5 || i > i6) && ((i2 < i5 || i2 > i6) && (i > i5 || i2 < i6))) {
            return false;
        }
        if (i3 >= i7 && i3 <= i8) {
            return true;
        }
        if (i4 < i7 || i4 > i8) {
            return i3 <= i7 && i4 >= i8;
        }
        return true;
    }

    public final void e() {
        try {
            this.i++;
            if (this.i < this.f126a[this.j].length) {
                this.f132b = false;
            } else {
                this.f132b = true;
                this.i = 0;
            }
        } catch (Exception e) {
            System.out.println(new StringBuffer().append("error nextFrame ").append(e).append(" indexSequence ").append(this.j).toString());
            e.printStackTrace();
        }
    }

    public final void c(int i) {
        this.j = i;
        this.i = 0;
        this.f132b = false;
    }

    public final boolean a() {
        int i = c.f54e;
        return b(a.c - i, a.d - i, a.c + i + r.c, a.d + i + r.d);
    }

    public final boolean b(int i, int i2, int i3, int i4) {
        int i5 = this.d;
        int i6 = this.d + this.l;
        if ((this.b & (-16777214)) == -16777214) {
            i5 = this.d - this.n;
            i6 = this.d + this.n;
        }
        return this.c + this.m > i && this.c - this.m < i3 && i6 > i2 && i5 < i4;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m32a() {
        if (this.f126a == null) {
            return this.a;
        }
        byte b = this.f126a[this.j][this.i];
        if (b < 0) {
            return 8192;
        }
        if (b > this.f133a) {
            return 16384;
        }
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* renamed from: b, reason: collision with other method in class */
    public final int m33b() {
        try {
            if (this.f126a == null) {
                return 0;
            }
            byte b = this.f126a[this.j][this.i];
            byte b2 = b;
            if (b < 0) {
                b2 = -this.f126a[this.j][this.i];
            } else if (b2 > this.f133a) {
                b2 -= this.f133a;
            }
            return b2;
        } catch (Exception e) {
            System.out.println(new StringBuffer().append("Error getCurrentFrame ").append(e).append(" indexSequence ").append(this.j).append(" indexFrame ").append(this.i).append(" type ").append(this.r).toString());
            e.printStackTrace();
            return 0;
        }
    }

    public final void a(Graphics graphics, int i, int i2, int i3) {
        this.f129a.a(graphics, m33b(), i - a.c, i2 - a.d, this.b, i3);
    }

    public final void a(Graphics graphics, int i, int i2) {
        this.f129a.a(graphics, m33b(), i - a.c, i2 - a.d, this.b, m32a());
    }

    public void a(Graphics graphics) throws Exception {
        this.f129a.a(graphics, m33b(), this.c - a.c, this.d - a.d, this.b, m32a());
    }

    public void f() {
        e();
        a(this.p, this.o);
    }
}
