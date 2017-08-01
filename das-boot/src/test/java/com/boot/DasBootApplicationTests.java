package com.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DasBootApplicationTests {

	@Test
	public void contextLoads() {
		HomeController hc=new HomeController();
		assertEquals("Das boot, Reporting for the duty", hc.home());
	}

}
