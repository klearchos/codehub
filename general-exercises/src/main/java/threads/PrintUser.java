package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class PrintUser implements Runnable {

  String userName;
  ReentrantLock lock;
  boolean printed = false;

  PrintUser(ReentrantLock lock, String userName) {
    this.userName = userName;
    this.lock = lock;
  }

  @Override
  public void run() {
    while(!printed) {
      boolean outerLock = false; // TODO: Get the lock for the first time
      if (outerLock) {
        try {
          SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
          System.out.println(userName + " - acquired outer lck at " + ft.format(new Date())
              + " Doing outer work. Lock count " + lock.getHoldCount());
          // Important work at this point.
          Thread.sleep(1000);

          // TODO: Lock for the 2nd time

          System.out.println(userName + ". Inner lock acquired and the lock count is " + lock.getHoldCount());
          // Important work at this point
          Thread.sleep(3000);

          // TODO: Unlock the lock

          System.out.println(userName + " finished job at " + ft.format(new Date())
              + " and lock count " + lock.getHoldCount());

          // TODO: Break the while loop since the print user completed his work.
        } catch(InterruptedException exc) {
          exc.printStackTrace();
        }
        finally {
          System.out.println(userName + " unlocking outer lock");
          // Outer lock released
          // TODO: Unlock the lock

          System.out.println("Lock Hold count " + lock.getHoldCount());
        }
      } else {
        System.out.println(userName + " waiting for lock");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

    }
  }
}
