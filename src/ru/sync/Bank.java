package ru.sync;

public class Bank {
    private int intTo;
    private int intFrom;

    public Bank() {
        intFrom = 220;
    }

    public  void calc(int intTransaction, long lngTimeout) {
        System.out.println( "Before" + "intTo = " + intTo + "intFrom = " + intFrom + " " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("After" + " intTo = " + intTo + " intFrom = " + intFrom + " " + Thread.currentThread().getName());

    }
}
