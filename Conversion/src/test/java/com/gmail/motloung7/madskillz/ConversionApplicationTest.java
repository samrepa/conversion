package com.gmail.motloung7.madskillz;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConversionApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ConversionApplicationTest {

	@InjectMocks
	private MetricToImperial imperial;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		MockMvcBuilders.standaloneSetup(imperial).build();
	}

	@Test
	public void testGreet() throws Exception {
		assertTrue(true);
	}

}
