package com.gmail.motloung7.madskillz;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.motloung7.madskillz.constant.ConstantEnum;
import com.gmail.motloung7.madskillz.service.ConversionObject;

@RestController
@RequestMapping("/imperialToMetric")
public class ImperialToMetric {

	@Autowired
	ConversionObject conversionObj;

	@PostMapping(path = "inchToCm", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertInchToCm(@PathParam(value = "unit") double unit) {
		return conversionObj.imperialToMetric(unit, ConstantEnum.CMTOINCH.getConversionRate())
				+ ConstantEnum.CMTOINCH.getMetricSymbol();
	}

	@PostMapping(path = "feetToMeters", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertFeetToMeters(@PathParam(value = "unit") double unit) {
		return conversionObj.imperialToMetric(unit, ConstantEnum.METERSTOFEET.getConversionRate())
				+ ConstantEnum.METERSTOFEET.getMetricSymbol();
	}

	@PostMapping(path = "milesToKm", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertMilesToKm(@PathParam(value = "unit") double unit) {
		return conversionObj.imperialToMetric(unit, ConstantEnum.KMTOMILES.getConversionRate())
				+ ConstantEnum.KMTOMILES.getMetricSymbol();
	}

	@PostMapping(path = "gallonToLitre", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertGallonTolitre(@PathParam(value = "unit") double unit) {
		return conversionObj.imperialToMetric(unit, ConstantEnum.LITRETOGALLON.getConversionRate())
				+ ConstantEnum.LITRETOGALLON.getMetricSymbol();
	}

	@PostMapping(path = "fahrenToCels", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertFahrenToCels(@PathParam(value = "unit") double unit) {
		return  conversionObj.imperialToMetric(unit, ConstantEnum.FAHRENTOCELS.getConversionRate())
				+ ConstantEnum.FAHRENTOCELS.getMetricSymbol();
	}

	@PostMapping(path = "poundToKg", produces = { MediaType.APPLICATION_JSON_VALUE })
	private String convertPoundToKg(@PathParam(value = "unit") double unit) {
		return conversionObj.imperialToMetric(unit, ConstantEnum.KGTOPOUND.getConversionRate())
				+ ConstantEnum.KGTOPOUND.getMetricSymbol();
	}
}
