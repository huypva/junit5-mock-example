package io.github.huypva.junit5mock;

import io.github.huypva.junit5mock.component.ComponentB;
import io.github.huypva.junit5mock.service.ServiceA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huypva
 */
@ExtendWith(MockitoExtension.class)
class InjectSpyTest {

  @InjectMocks
  ServiceA serviceA;

  @Spy
  ComponentB componentB;

  @Test
  void action() {
    serviceA.action("Test");
  }
}