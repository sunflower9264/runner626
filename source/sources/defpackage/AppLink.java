package defpackage;

import javax.microedition.midlet.MIDlet;

/* loaded from: Runner626_s40v3a.jar:AppLink.class */
public class AppLink extends MIDlet implements Runnable {
    private static String a = "<<<< J2ME App Subsystem by Angel Rodriguez >>>>";
    public static AppLink midlet;

    /* renamed from: a, reason: collision with other field name */
    private boolean f0a;

    public AppLink() {
        midlet = this;
    }

    public void startApp() {
        try {
            r.a();
            if (this.f0a) {
                return;
            }
            new Thread(this).start();
        } catch (Exception unused) {
            destroyApp(true);
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean z) {
        notifyDestroyed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [AppLink] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k] */
    @Override // java.lang.Runnable
    public void run() {
        ?? kVar = this;
        kVar.f0a = true;
        try {
            kVar = new k();
            kVar.d();
        } catch (Exception unused) {
            kVar.printStackTrace();
        }
        destroyApp(a != null);
    }
}
