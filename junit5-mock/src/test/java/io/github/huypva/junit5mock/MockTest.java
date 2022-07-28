package io.github.huypva.junit5mock;

import io.github.huypva.junit5mock.component.ComponentB;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author huypva
 */
@ExtendWith(MockitoExtension.class)
class MockTest {

  @Mock
  ComponentB componentB;

  @Test
  void action() {
    System.out.println("Start test!");
    componentB.doSomething();
    System.out.println("End test.");
  }
}