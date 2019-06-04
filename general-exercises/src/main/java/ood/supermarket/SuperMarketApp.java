package ood.supermarket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SuperMarketApp {

  final ExecutorService exService = Executors.newSingleThreadExecutor();

  public static void main(String[] args) throws InterruptedException {
    new SuperMarketApp();
  }

  public SuperMarketApp() throws InterruptedException {
    Subject subject = new SuperMarketSubject();
    SmallDisplay sd = new SmallDisplay();
    BigDisplay bd = new BigDisplay();
    subject.attach(sd);
    subject.attach(bd);

    exService.execute(() -> {
      subject.setState("New Text 1");
      subject.setState("New Text 2");
      subject.setState("New Text 3");
    });

    exService.awaitTermination(5, TimeUnit.SECONDS);
    exService.shutdown();
    System.out.println("Finish");
  }
}
