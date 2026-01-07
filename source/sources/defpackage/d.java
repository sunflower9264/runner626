package defpackage;

/* loaded from: Runner626_s40v3a.jar:d.class */
public final class d extends n {
    public d(a aVar) throws Exception {
        f130a = aVar;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) throws Exception {
        this.c = i;
        this.d = i2 + 3;
        this.u = i5;
        this.V = i4;
        this.r = a(this.V, this.u);
        this.f129a = a(b[a(this.r)], true);
        this.f133a = (byte) this.f129a.f117a;
        g();
        a();
        this.f129a.a();
        d(0);
    }

    @Override // defpackage.n, defpackage.s
    public final void a() throws Exception {
        super.a();
    }

    @Override // defpackage.s, defpackage.g
    public final void b() {
        super.b();
        if (this.f129a != null) {
            this.f129a = null;
        }
        if (f130a != null) {
            f130a = null;
        }
    }

    @Override // defpackage.s
    public final void c() throws Exception {
        this.m = l.a(0, 100) < this.U;
        p();
        if (!this.m || this.h) {
            return;
        }
        if (this.g || this.k || this.i || this.l || (this.q == 0 && this.r && a.f44a)) {
            e(0);
        }
    }
}
