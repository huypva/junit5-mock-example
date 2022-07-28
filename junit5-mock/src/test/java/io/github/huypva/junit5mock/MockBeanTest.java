package io.github.huypva.junit5mock;

import io.github.huypva.junit5mock.component.ComponentB;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * @author huypva
 */
@SpringBootTest
class MockBeanTest {

  @MockBean
  ComponentB componentB;

  @Test
  void action() {
    System.out.println("Start test!");
    componentB.doSomething();
    System.out.println("End test.");
  }
}