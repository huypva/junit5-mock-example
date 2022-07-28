package io.github.huypva.junit5mock.service;

import io.github.huypva.junit5mock.component.ComponentB;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huypva
 */
@Service
public class ServiceA {

  @Autowired
  ComponentB componentB;

  public void action(String action) {
    componentB.doSomething();
    System.out.println("Service A do " + action);
  }
}
