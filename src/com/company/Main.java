package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        MyThread myThread = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("main group");
        for (int i = 0; i < 4; i++) {
            final Thread thread = new Thread(mainGroup, myThread);
            thread.start();
        }

        Thread.sleep(15000);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
