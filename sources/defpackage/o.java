package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: Runner626_s40v3a.jar:o.class */
public abstract class o {
    public boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Exception {
        /*
            r3 = this;
            r0 = r3
            defpackage.r.a(r0)
            r0 = r3
            r1 = 0
            r0.f = r1     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L12
            r0 = r3
            r0.a()     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L12
            defpackage.r.b()     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L12
            return
        L11:
            throw r0     // Catch: java.lang.Throwable -> L12
        L12:
            r5 = move-exception
            defpackage.r.b()     // Catch: java.lang.Throwable -> L12
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.d():void");
    }

    public static void e() {
        r.c();
    }

    public abstract void a() throws Exception;

    public abstract void a(Graphics graphics, boolean z) throws Exception;

    /* renamed from: a */
    public abstract void mo36a(int i) throws Exception;

    public void b(int i) throws Exception {
    }
}
