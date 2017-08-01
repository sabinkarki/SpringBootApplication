package com.boot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.service.ShipwreckService;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;

	@Mock
	private ShipwreckService shipwreckService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void givenWreckAndThenReturnWreck() {
		Shipwreck wreck = new Shipwreck();
		wreck.setId(1L);
		when(shipwreckService.findOne(1L)).thenReturn(wreck);
		assertEquals(1L, wreck.getId().longValue());
	}

}
