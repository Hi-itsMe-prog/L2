package ru.demo.runnablethread;
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int h = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 3; j > 0; j--) {
                        System.out.println("Поток " + h + ": " + j);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Поток " + h + " прерван");
                        }
                    }
                    System.out.println("Поток " + h + " завершен");
                }
            });

            thread.start();
        }
    }
}