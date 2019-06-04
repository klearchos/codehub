package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterApp {

  public static void main(String[] args) {
    new PrinterApp();
  }

  PrinterApp() {
    ReentrantLock lck = new ReentrantLock();
    ExecutorService pool = Executors.newFixedThreadPool(4);
    Runnable p1 = new PrintUser(lck, "User 1");
    Runnable p2 = new PrintUser(lck, "User 2");
    Runnable p3 = new PrintUser(lck, "User 3");
    Runnable p4 = new PrintUser(lck, "User 4");
    pool.execute(p1);
    pool.execute(p2);
    pool.execute(p3);
    pool.execute(p4);
    pool.shutdown();
  }
}


