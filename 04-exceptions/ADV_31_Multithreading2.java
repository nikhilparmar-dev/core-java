// WAP to show the use of Multithreading in java - 2.
// Author : Nikhil


class StopWatchThread extends Thread {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println(i + " second");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Someone woke up the thread early!");
            }
        }
        System.out.println("Time's up");
    }
}

public class ADV_31_Multithreading2 {
    public static void main(String[] args) {
        StopWatchThread watch = new StopWatchThread();

        watch.start();

        System.out.println("You can do other things while the stopwatch runs!");
    }
}
