package defpackage;

/* loaded from: Runner626_s40v3a.jar:p.class */
public final class p extends n {
    public p(a aVar) throws Exception {
        f130a = aVar;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) throws Exception {
        this.c = i;
        this.d = i2 + 3;
        this.u = i5;
        this.V = i4;
        this.r = a(this.V, this.u);
        this.f129a = a(b[a(this.r)], (boolean[]) null);
        this.f133a = (byte) this.f129a.f117a;
        g();
        if (this.r == 0) {
            this.s = 38;
            this.t = 39;
        }
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
    }
}
