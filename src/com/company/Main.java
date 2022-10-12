package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        MyThread myThread = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("main group");
        final Thread thread1 = new Thread(mainGroup, myThread);
        thread1.start();
        final Thread thread2 = new Thread(mainGroup, myThread);
        thread2.start();
        final Thread thread3 = new Thread(mainGroup, myThread);
        thread3.start();
        final Thread thread4 = new Thread(mainGroup, myThread);
        thread4.start();

        Thread.sleep(15000);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();

    }
}
