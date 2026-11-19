class Shared {
    synchronized void print(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n * i);
        }
    }

    synchronized void waitMethod() {
        try {
            System.out.println("Thread is waiting...");
            wait();
            System.out.println("Thread resumed!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void notifyMethod() {
        notify();
        System.out.println("One thread notified!");
    }

    synchronized void notifyAllMethod() {
        notifyAll();
        System.out.println("All threads notified!");
    }
}

public class ThreadSafety {
    public static void main(String[] args) throws Exception {

        Shared obj = new Shared();

        // Thread safety using synchronized
        Thread t1 = new Thread(() -> obj.print(5));
        Thread t2 = new Thread(() -> obj.print(10));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Inter-thread communication using wait() and notify()
        Thread t3 = new Thread(() -> obj.waitMethod());

        t3.start();

        Thread.sleep(1000);

        synchronized (obj) {
            obj.notify();
        }

        t3.join();

        System.out.println("Program completed.");
    }
}

