**AIM**
  /*Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of 
7). Use a synchronized method so that table outputs do not mix and remain consistent. */

  class Table {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class ThreadA extends Thread {
    Table t;

    ThreadA(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class ThreadB extends Thread {
    Table t;

    ThreadB(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

public class Test25 {
    public static void main(String[] args) {

        Table t = new Table();

        ThreadA t1 = new ThreadA(t);
        ThreadB t2 = new ThreadB(t);

        t1.start();
        t2.start();
    }
}
