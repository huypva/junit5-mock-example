package io.github.huypva.junit5mock.component;

import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Setter
@Component
public class ComponentB  {

  private String action = "nothing";

  public void doSomething() {
    System.out.println("Component B do " + action);
  }
}
