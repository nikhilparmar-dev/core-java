// WAP to show the use of Multithreading in java - 3.
// Author : Nikhil

class A extends Thread {
    public void run() {
        for (int i = 1; i < 25; i++) {
            System.out.println("Tick");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock is stopped");
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 25; i++) {
            System.out.println("Tock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock is stopped");
            }
        }
    }
}

public class ADV_32_Multithreading3 {
    public static void main(String[] args) {
        A tick = new A();
        B tock = new B();

        tick.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("The clock is stopped");
        }

        tock.start();
    }
}
