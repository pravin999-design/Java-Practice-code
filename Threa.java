


class Threa extends Thread {
    public void run() {
        // Code that runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Threa running: " + i);
            try {
                Thread.sleep(500);  // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Threa t1 = new Threa();  // Create thread object
        t1.start();              // Start the thread

        // Main thread code
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
