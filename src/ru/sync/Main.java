package ru.sync;

public class Main {
    public static void method() {
        Bank bankMain = new Bank();
        UThread threadOne = new UThread(bankMain, 100, 2000);
        threadOne.setName("treadOne");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();
        UThread threadTwo = new UThread(bankMain, 50, 300);
        threadTwo.setName("treadTwo");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        method();
    }
}
