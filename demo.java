class MessageThread extends Thread {
    String message;
    int delay;

    public MessageThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(message);
                Thread.sleep(delay);     
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class demo{
    public static void main(String[] args) {

      
        MessageThread t1 = new MessageThread("BMS College of Engineering", 10000);

       
        MessageThread t2 = new MessageThread("CSE", 2000);

        t1.start();
        t2.start();
    }
}

