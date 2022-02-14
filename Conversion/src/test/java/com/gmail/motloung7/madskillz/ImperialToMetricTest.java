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
public class ImperialToMetricTest {
	private MockMvc mockMvc;

	@InjectMocks
	private ImperialToMetric metric;

	@Mock
	private ConversionObject conversionObject;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(metric).build();
	}
	
	
	@Test
	public void testConvertInchToCm() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(31.496062992125985, ConstantEnum.CMTOINCH.getConversionRate()))
		.thenReturn("80.00");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/inchToCm?unit=31.496062992125985")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("80.00 cm"));
		
	}

	@Test
	public void testConvertFeetToMeters() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(262.4671916010499, ConstantEnum.METERSTOFEET.getConversionRate()))
		.thenReturn("80.00");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/feetToMeters?unit=262.4671916010499")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("80.00 m"));
	}

	@Test
	public void testConvertMilesToKm() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(49.709695378986716, ConstantEnum.KMTOMILES.getConversionRate()))
		.thenReturn("80.00");
		
mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/milesToKm?unit=49.709695378986716")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("80.00 km"));
	}

	@Test
	public void testConvertGallonTolitre() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(26.42007926023778, ConstantEnum.LITRETOGALLON.getConversionRate()))
		.thenReturn("100.00");
		
mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/gallonToLitre?unit=26.42007926023778")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("100.00 l"));
	}

	@Test
	public void testConvertFahrenToCels() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(99.5, ConstantEnum.FAHRENTOCELS.getConversionRate()))
		.thenReturn("37.50");
		
mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/fahrenToCels?unit=99.5")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("37.50 C"));
	}

	@Test
	public void testConvertPoundToKg() throws Exception {
		Mockito.when(conversionObject.imperialToMetric(36.281179138321995, ConstantEnum.KGTOPOUND.getConversionRate()))
		.thenReturn("80.00");
		
mockMvc.perform(MockMvcRequestBuilders.post("/imperialToMetric/poundToKg?unit=36.281179138321995")
		.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
		.andExpect(MockMvcResultMatchers.jsonPath("$").value("80.00 kg"));
	}
}
