package gr.codehub.demomultimodule.controller;

import java.util.concurrent.atomic.AtomicLong;
import logic.HashInput;
import model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String TEMPLATE = "Hello, %s!";

  private final AtomicLong counter = new AtomicLong();

  @GetMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    // Note: We are not interested at DI at this example.
    HashInput hi = new HashInput();
    return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, hi.hash(name)));
  }

}
