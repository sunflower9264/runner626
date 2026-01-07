package defpackage;

/* loaded from: Runner626_s40v3a.jar:s.class */
public abstract class s extends g {
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int[] c;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public static int al = 65536;
    public boolean s;
    public int am;
    public int an;
    public int ao;
    public int[][] d;

    /* renamed from: s, reason: collision with other field name */
    private int f200s;
    private int t;
    public int ap;
    public int aq;
    public long a = 45875;

    public void a() throws Exception {
        this.f131a = true;
        this.r = false;
        this.n = false;
        this.o = false;
        this.s = false;
        this.p = false;
        this.c = new int[5];
        this.f200s = c.f74r;
        this.d = new int[this.f200s][3];
        this.ai = 0;
        this.aj = 0;
        this.b = -16777183;
        this.k = this.f129a.m27a(1);
        this.l = this.f129a.m28b(1);
    }

    @Override // defpackage.g
    public void b() {
        super.b();
    }

    public final void u() {
        for (int i = 0; i < this.d.length; i++) {
            for (int i2 = 0; i2 < this.d[i].length; i2++) {
                this.d[i][i2] = -1;
            }
        }
    }

    public static int[] a(int i, int i2, int i3, int i4) {
        long j = i3 - i;
        long j2 = i4 - i2;
        int iA = j.a((j * j) + (j2 * j2));
        return new int[]{(int) ((j << 16) / iA), (int) ((j2 << 16) / iA)};
    }

    public static int[] b(int i, int i2, int i3, int i4) {
        long j = i3 - i;
        long j2 = i4 - i2;
        int iA = j.a((j * j) + (j2 * j2));
        return new int[]{(int) ((j2 << 16) / iA), (int) (((-j) << 16) / iA)};
    }

    public final int[] a(int i, int i2, long j, long j2, int i3, int i4, long j3, long j4) {
        int[] iArrB = b(i, i2, j, j2, i3, i4, j3, j4);
        return new int[]{(int) ((((iArrB[0] + (iArrB[0] - i)) - i3) * this.ak) >> 16), (int) ((((iArrB[1] + (iArrB[1] - i2)) - i4) * this.ak) >> 16)};
    }

    public static int[] b(int i, int i2, long j, long j2, int i3, int i4, long j3, long j4) {
        long j5 = -j3;
        long j6 = ((-i3) * j4) - (i4 * j5);
        long j7 = ((j4 * j) + (j5 * j2)) >> 16;
        if (j7 == 0) {
            return null;
        }
        long j8 = -((((j4 * i) + (j5 * i2)) + j6) / j7);
        return new int[]{i + ((int) ((j * j8) >> 16)), i2 + ((int) ((j2 * j8) >> 16))};
    }

    public final int[] a(int i, int i2, int i3, int i4, int i5) {
        int[] iArrA = a(i2, i3, i4, i5);
        return new int[]{(int) ((iArrA[0] * i) >> 16), (int) ((iArrA[1] * i) >> 16)};
    }

    public final void v() {
        this.c = c.m13a(c.a(this.Z, this.aa - 65536));
        int[] iArrA = a(this.ah, this.c[c.b], this.c[c.c], this.c[c.d], this.c[c.e]);
        if (this.af == 1) {
            this.X -= iArrA[0];
            this.Y -= iArrA[1];
        } else if (this.af == 2) {
            this.X += iArrA[0];
            this.Y += iArrA[1];
        }
        this.ac = this.c[c.g];
        if (this.X < 0) {
            this.ac = this.c[c.h];
        }
        this.X += this.c[c.i];
        int iA = (int) ((((int) ((j.a((this.X * this.X) + (this.Y * this.Y)) * this.ac) >> 16)) * this.c[c.f]) >> 16);
        int i = iA;
        if (iA > this.ag) {
            i = this.ag;
        } else if (i < (-this.ag)) {
            i = -this.ag;
        }
        int[] iArrA2 = a(i, this.c[c.b], this.c[c.c], this.c[c.d], this.c[c.e]);
        if (this.X < 0) {
            this.X = -iArrA2[0];
            this.Y = -iArrA2[1];
        } else {
            this.X = iArrA2[0];
            this.Y = iArrA2[1];
        }
    }

    public final void w() {
        this.Y += a.f;
    }

    public final boolean e() {
        if (this.p) {
            return false;
        }
        int[] iArrB = b(this.c[c.b], this.c[c.c], this.c[c.d], this.c[c.e]);
        long j = iArrB[0];
        long j2 = iArrB[1];
        int i = (int) ((j * al) >> 16);
        int i2 = (int) ((j2 * al) >> 16);
        int[] iArrA = f130a.f6a.a(this.Z - i, this.aa - i2, this.Z + i, this.aa + i2, 0, false);
        if (iArrA == null) {
            return false;
        }
        this.Z = iArrA[0];
        this.aa = iArrA[1];
        return true;
    }

    public final void x() {
        this.n = false;
        if (this.ad != this.ae) {
            if (this.X >= 0) {
                if (this.ad == 25 && (this.ae == 0 || this.ae == 334 || this.ae == 270)) {
                    this.n = true;
                }
                if (this.ad == 0 && (this.ae == 334 || this.ae == 315)) {
                    this.n = true;
                }
                if (this.ad == 45 && (this.ad == 25 || this.ae == 0 || this.ae == 334 || this.ae == 270 || this.ae == 315)) {
                    this.n = true;
                }
            }
            if (this.X <= 0) {
                if (this.ad == 315 && (this.ad == 334 || this.ae == 0 || this.ae == 25 || this.ae == 270)) {
                    this.n = true;
                }
                if (this.ad == 334 && (this.ae == 0 || this.ae == 25 || this.ae == 270)) {
                    this.n = true;
                }
                if (this.ad == 0 && this.ae == 25) {
                    this.n = true;
                }
            }
        }
    }

    private static boolean a(int[] iArr, int[] iArr2, int i, int i2) {
        if (i > 0) {
            if (iArr[c.j] < iArr2[c.j]) {
                return true;
            }
            if (iArr[c.j] > iArr2[c.j]) {
                return false;
            }
            if (i2 > 0) {
                return iArr[c.k] < iArr2[c.k] || iArr[c.k] <= iArr2[c.k];
            }
            if (i2 < 0) {
                if (iArr[c.k] < iArr2[c.k]) {
                    return false;
                }
                return iArr[c.k] > iArr2[c.k] ? true : true;
            }
        }
        if (i < 0) {
            if (iArr[c.j] < iArr2[c.j]) {
                return false;
            }
            if (iArr[c.j] > iArr2[c.j]) {
                return true;
            }
            if (i2 > 0) {
                return iArr[c.k] < iArr2[c.k] || iArr[c.k] <= iArr2[c.k];
            }
            if (i2 < 0) {
                if (iArr[c.k] < iArr2[c.k]) {
                    return false;
                }
                return iArr[c.k] > iArr2[c.k] ? true : true;
            }
        }
        if (i2 > 0) {
            return iArr[c.k] < iArr2[c.k] || iArr[c.k] <= iArr2[c.k];
        }
        if (i2 >= 0) {
            return true;
        }
        if (iArr[c.k] < iArr2[c.k]) {
            return false;
        }
        return iArr[c.k] > iArr2[c.k] ? true : true;
    }

    private int[] a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i5;
        int i10 = i6;
        int iA = c.a(i5, i6);
        int[] iArrM13a = c.m13a(iA);
        a(i, i2, i3, i4);
        int[] iArrB = b(iArrM13a[c.b], iArrM13a[c.c], iArrM13a[c.d], iArrM13a[c.e]);
        int[] iArrA = a(iArrM13a[c.b], iArrM13a[c.c], iArrM13a[c.d], iArrM13a[c.e]);
        int[] iArrA2 = a(i5 - i7, i6 - i8, iArrA[0], iArrA[1], i5, i6, iArrB[0], iArrB[1]);
        int i11 = (c.f53d / 2) * 65536;
        if (c.b(iA) || c.m7a(iA)) {
            i9 = i5 - i11;
        } else if (c.m8c(iA)) {
            i9 = i5 + i11;
        }
        if (c.m9d(iA)) {
            i10 += 65536;
        }
        int i12 = (c.f53d / 5) << 16;
        if (this.Y == 0 && iArrM13a[c.b] == iArrM13a[c.d]) {
            iArrA2[0] = (-iArrA2[0]) + i12;
            i9 += i11;
        }
        return new int[]{i9, i10, iArrA2[0], iArrA2[1]};
    }

    public final void y() throws Exception {
        this.s = false;
        this.c = c.m13a(c.a(this.Z, this.aa));
        if (this.n || !e() || this.o) {
            if (this.o) {
                this.aa -= 65536;
            }
            this.r = false;
            this.ad = this.c[0];
            boolean z = false;
            int i = this.Z;
            int i2 = this.aa;
            this.X += this.ai;
            this.Y -= this.aj;
            int i3 = this.Z + this.X;
            int i4 = this.aa + this.Y;
            do {
                w();
                int[] iArrA = f130a.f6a.a(i, i2, i3, i4, 2, true);
                int[] iArrA2 = f130a.f6a.a(i, i2 - this.aq, i3, i4 - this.aq, 3, false);
                if (iArrA == null && iArrA2 == null) {
                    z = true;
                } else if (iArrA != null && (iArrA2 == null || a(iArrA, iArrA2, this.X, this.Y))) {
                    if (c.m10e(c.a(iArrA[c.j], iArrA[c.k]))) {
                        int[] iArrA3 = a(i, i2 - 0, i3, i4 - 0, iArrA[c.j], iArrA[c.k], this.X, this.Y);
                        int i5 = iArrA3[0];
                        this.am = i5;
                        i = i5;
                        int i6 = iArrA3[1] + 0;
                        this.an = i6;
                        i2 = i6;
                        this.X = iArrA3[2];
                        this.Y = iArrA3[3];
                        i3 = i + this.X;
                        i4 = i2 + this.Y;
                        this.o = false;
                        this.s = true;
                        o();
                    } else {
                        k();
                        this.r = true;
                        this.p = false;
                        i3 = iArrA[c.j];
                        i4 = iArrA[c.k];
                        this.Y = 0;
                        z = true;
                    }
                    this.o = false;
                    this.n = false;
                } else if (iArrA2 != null && (iArrA == null || !a(iArrA, iArrA2, this.X, this.Y))) {
                    int i7 = this.aq;
                    int[] iArrA4 = a(i, i2 - i7, i3, i4 - i7, iArrA2[c.j], iArrA2[c.k], this.X, this.Y);
                    i = iArrA4[0];
                    i2 = iArrA4[1] + i7 + 131072;
                    this.X = iArrA4[2];
                    this.Y = iArrA4[3];
                    this.am = iArrA2[c.j];
                    this.an = iArrA2[c.k] + i7;
                    i3 = i + this.X;
                    i4 = i2 + this.Y;
                    this.o = false;
                    this.s = true;
                    n();
                }
            } while (!z);
            this.Z = i3;
            this.aa = i4;
        } else {
            this.o = false;
            this.p = false;
            if (!this.r) {
                this.Y = 0;
            }
            this.r = true;
            this.ad = this.c[0];
            z();
        }
        if (this.Z < 3276800) {
            this.Z = 3276800;
        } else if (this.Z > c.f62m - 3276800) {
            this.Z = c.f62m - 3276800;
        }
        this.ae = c.m13a(c.a(this.Z, this.aa))[0];
        this.ai = 0;
        this.aj = 0;
    }

    public final void z() throws Exception {
        if (!this.o) {
            v();
        }
        boolean z = false;
        int i = this.Z;
        int i2 = this.aa;
        this.X += this.ai;
        this.Y -= this.aj;
        int i3 = this.Z + this.X;
        int i4 = this.aa + this.Y;
        this.ad = this.c[0];
        int iA = j.a((this.X * this.X) + (this.Y * this.Y));
        c.f76s = -1;
        do {
            int[] iArrA = f130a.f6a.a(i, i2 - 65536, i3, i4 - 65536, 0, true);
            int[] iArrA2 = f130a.f6a.a(i, i2 - this.aq, i3, i4 - this.aq, 3, false);
            if (iArrA == null && iArrA2 == null) {
                z = true;
            } else if (iArrA != null && (iArrA2 == null || a(iArrA, iArrA2, this.X, this.Y))) {
                i = iArrA[c.j];
                i2 = iArrA[c.k];
                long j = i3 - i;
                long j2 = i4 - i2;
                int iA2 = j.a((j * j) + (j2 * j2));
                char c = j < 0 ? (char) 65535 : (char) 1;
                int iA3 = c.a(i, i2);
                this.c = c.m13a(iA3);
                this.ad = this.c[c.a];
                if (c.m10e(iA3)) {
                    int[] iArrA3 = a(i, i2 - 0, i3, i4 - 0, iArrA[c.j], iArrA[c.k], this.X, this.Y);
                    int i5 = iArrA3[0];
                    this.am = i5;
                    i = i5;
                    int i6 = iArrA3[1] + 0;
                    this.an = i6;
                    i2 = i6;
                    this.X = iArrA3[2];
                    this.Y = 0;
                    i3 = i + this.X;
                    i4 = i2 + this.Y;
                    this.o = false;
                    this.s = true;
                    m();
                } else {
                    int[] iArrA4 = c > 0 ? a(iA2, this.c[c.b], this.c[c.c], this.c[c.d], this.c[c.e]) : a(iA2, this.c[c.d], this.c[c.e], this.c[c.b], this.c[c.c]);
                    i3 = i + iArrA4[0];
                    i4 = i2 + iArrA4[1];
                }
            } else if (iArrA2 != null && (iArrA == null || !a(iArrA, iArrA2, this.X, this.Y))) {
                int i7 = this.aq;
                int[] iArrA5 = a(i, i2 - i7, i3, i4 - i7, iArrA2[c.j], iArrA2[c.k], this.X, this.Y);
                int i8 = iArrA5[0];
                this.am = i8;
                i = i8;
                int i9 = iArrA5[1] + i7;
                this.an = i9;
                i2 = i9;
                this.X = iArrA5[2];
                this.Y = 0;
                i3 = i + this.X;
                i4 = i2 + this.Y;
                this.o = false;
                this.s = true;
                l();
                if (iArrA == null) {
                    z = true;
                }
            }
        } while (!z);
        this.ae = c.m13a(c.a(i3, i4))[0];
        if (!this.q) {
            x();
        }
        boolean z2 = iA <= this.ab;
        if (z2) {
            this.n = false;
        } else if (this.n) {
            int[] iArrA6 = (this.X < 0 ? (char) 65535 : (char) 1) > 0 ? a(iA, this.c[c.b], this.c[c.c], this.c[c.d], this.c[c.e]) : a(iA, this.c[c.d], this.c[c.e], this.c[c.b], this.c[c.c]);
            this.X = iArrA6[0];
            this.Y = iArrA6[1];
        }
        if (!this.o && (this.q || z2)) {
            int[] iArrA7 = f130a.f6a.a(i3, i4 - 65536, i3, i4 + (c.f58i << 16), 2, false);
            if (iArrA7 != null) {
                i3 = iArrA7[c.j];
                i4 = iArrA7[c.k];
            }
        }
        this.t = c.f76s;
        for (int i10 = 0; i10 <= this.t; i10++) {
            this.d[i10][0] = c.f75a[i10][0];
            this.d[i10][1] = c.f75a[i10][1];
            this.d[i10][2] = c.f75a[i10][2];
        }
        this.Z = i3;
        this.aa = i4;
    }

    public abstract void c() throws Exception;

    public abstract void k() throws Exception;

    public abstract void o() throws Exception;

    public abstract void n() throws Exception;

    public abstract void m() throws Exception;

    public abstract void l() throws Exception;
}
