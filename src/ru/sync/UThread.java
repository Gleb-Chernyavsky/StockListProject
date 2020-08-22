package ru.sync;

public class UThread extends Thread {
    private Bank bankWork;
    private int intTrans;
    private long lngSleep;

    public UThread(Bank bankWork, int intTrans, long lngSleep) {
        this.bankWork = bankWork;
        this.intTrans = intTrans;
        this.lngSleep = lngSleep;
    }

    @Override
    public void run() {
        bankWork.calc(intTrans, lngSleep);
    }
}
