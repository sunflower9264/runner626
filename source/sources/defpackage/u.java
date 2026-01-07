package defpackage;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* loaded from: Runner626_s40v3a.jar:u.class */
public final class u {
    private static RecordStore a = null;

    public static void a() throws Exception {
        RecordStore recordStoreOpenRecordStore;
        try {
            recordStoreOpenRecordStore = RecordStore.openRecordStore("data15", true);
            a = recordStoreOpenRecordStore;
        } catch (RecordStoreException e) {
            throw recordStoreOpenRecordStore;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, java.lang.Throwable] */
    /* renamed from: a, reason: collision with other method in class */
    public static int m59a() throws Exception {
        ?? numRecords;
        try {
            numRecords = a.getNumRecords();
            return numRecords;
        } catch (Exception e) {
            throw numRecords;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, java.lang.Throwable] */
    public static void a(byte[] bArr) throws Exception {
        ?? AddRecord;
        try {
            AddRecord = a.addRecord(bArr, 0, bArr.length);
        } catch (Exception e) {
            throw AddRecord;
        }
    }

    public static void a(int i, byte[] bArr) throws Exception {
        RecordStore recordStore;
        try {
            recordStore = a;
            recordStore.setRecord(i + 1, bArr, 0, bArr.length);
        } catch (Exception e) {
            throw recordStore;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.lang.Throwable] */
    public static byte[] a(int i) throws Exception {
        ?? record;
        try {
            record = a.getRecord(i + 1);
            return record;
        } catch (Exception e) {
            throw record;
        }
    }
}
