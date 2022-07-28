package io.github.huypva.junit5mock;

import io.github.huypva.junit5mock.component.ComponentB;
import io.github.huypva.junit5mock.service.ServiceA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author huypva
 */
@ExtendWith(MockitoExtension.class)
class InjectMockTest {

  @InjectMocks
  ServiceA serviceA;

  @Mock
  ComponentB componentB;

  @Test
  void action() {
    serviceA.action("ServiceA");
  }
}