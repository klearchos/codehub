package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterApp {

  public static void main(String[] args) {
    new PrinterApp();
  }

  PrinterApp() {
    ReentrantLock lck = new ReentrantLock();

    // TODO: Initialise the ExecutorService
    ExecutorService pool = null;
    Runnable p1 = new PrintUser(lck, "User 1");
    Runnable p2 = new PrintUser(lck, "User 2");
    Runnable p3 = new PrintUser(lck, "User 3");
    Runnable p4 = new PrintUser(lck, "User 4");

    // TODO: Execute/Start the print user threads

    // TODO: Shutdown the ExecutorService gracefully.
  }
}


