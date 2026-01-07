package defpackage;

/* loaded from: Runner626_s40v3a.jar:b.class */
public final class b {
    private static int a;
    private static final int b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".length();

    public static String a(String str) {
        return b(AppLink.midlet.getAppProperty(str));
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            String strTrim = str.trim();
            if (strTrim.length() == 0) {
                return null;
            }
            if (strTrim.length() <= 4) {
                return strTrim;
            }
            String lowerCase = strTrim.substring(0, 4).toLowerCase();
            String strTrim2 = strTrim.substring(4).trim();
            return lowerCase.equals("str:") ? b(e.m15a("csl.str")[Integer.parseInt(b(strTrim2))]) : lowerCase.equals("obf:") ? b(c(strTrim2)) : lowerCase.equals("ref:") ? b(a(b(strTrim2))) : strTrim;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str) {
        int iIndexOf = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(str.charAt(0));
        a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(str.charAt(1)));
        if (iIndexOf < b / 2) {
            return null;
        }
        char[] cArr = new char[(str.length() - 2) / 3];
        int i = 2;
        str.length();
        int length = cArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new String(cArr);
            }
            cArr[length] = (char) (m4a(str.substring(i, i + 3)) ^ a());
            i += 3;
        }
    }

    private static void a(int i) {
        a = Math.abs(1473859260 * i);
    }

    private static long a() {
        int iAbs = Math.abs(((a * 1664525) + 1013904223) % 701239857);
        a = iAbs;
        return iAbs;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m4a(String str) {
        return ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(str.charAt(0)) * b * b) + ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(str.charAt(1)) * b) + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(str.charAt(2));
    }
}
