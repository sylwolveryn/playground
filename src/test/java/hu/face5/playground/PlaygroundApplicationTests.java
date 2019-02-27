package hu.face5.playground;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("mockito2 Junit5 example")
public class PlaygroundApplicationTests {
	@InjectMocks RandomWrapper randomWrapper;
	@Mock RandomModel randomModel;

	@BeforeEach
	public void setup() {
		when(randomModel.isItSafe()).thenReturn(true);
	}

	@Test
	public void contextLoads() {
		assertTrue(randomModel.isItSafe());
		assertTrue(randomWrapper.isItSafe());
	}
}
