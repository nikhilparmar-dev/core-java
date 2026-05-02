// WAP to show the use of Multithreading in java.
// Author : Nikhil


class A extends Thread {
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println("Class A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println("Class B");
        }
    }
}

public class ADV_30_Multithreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}