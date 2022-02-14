package com.gmail.motloung7.madskillz;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.gmail.motloung7.madskillz.constant.ConstantEnum;
import com.gmail.motloung7.madskillz.service.ConversionObject;

@RunWith(MockitoJUnitRunner.class)
public class MetricToImperialTest {

	private MockMvc mockMvc;

	@InjectMocks
	private MetricToImperial imperial;

	@Mock
	private ConversionObject conversionObject;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(imperial).build();
	}

	@Test
	public void testConvertCmToInch() throws Exception {
		Mockito.when(conversionObject.metricToImperial(80.0, ConstantEnum.CMTOINCH.getConversionRate()))
				.thenReturn("36.28");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/cmToInch?unit=80")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("36.28 inch"));
	}

	@Test
	public void testConvertMetersToFeet() throws Exception {
		Mockito.when(conversionObject.metricToImperial(80.0, ConstantEnum.METERSTOFEET.getConversionRate()))
				.thenReturn("262.47");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/metersToFeet?unit=80")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("262.47 feet"));
	}

	@Test
	public void testConvertKmToMiles() throws Exception {
		Mockito.when(conversionObject.metricToImperial(80.0, ConstantEnum.KMTOMILES.getConversionRate()))
				.thenReturn("49.70");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/kmToMiles?unit=80")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("49.70 miles"));
	}

	@Test
	public void testConvertLitreTogallon() throws Exception {
		Mockito.when(conversionObject.metricToImperial(100.0, ConstantEnum.LITRETOGALLON.getConversionRate()))
				.thenReturn("26.42");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/litreToGallon?unit=100")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("26.42 gal"));

	}

	@Test
	public void testConvertCelsToFahren() throws Exception {
		Mockito.when(conversionObject.metricToImperial(37.5, ConstantEnum.CELSTOFAHREN.getConversionRate()))
				.thenReturn("99.50");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/celsToFahren?unit=37.5")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("99.50 F"));
	}

	@Test
	public void testConvertKgToPound() throws Exception {
		Mockito.when(conversionObject.metricToImperial(80.0, ConstantEnum.KGTOPOUND.getConversionRate()))
				.thenReturn("36.28");
		mockMvc.perform(MockMvcRequestBuilders.post("/metricToImperial/kgToPound?unit=80")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
				.andExpect(MockMvcResultMatchers.jsonPath("$").value("36.28 lb"));
	}

}
