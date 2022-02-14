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
@RequestMapping(value = "/metricToImperial")
public class MetricToImperial {

	@Autowired
	ConversionObject conversionObj;

	@PostMapping(path = "cmToInch", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertCmToInch(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.CMTOINCH.getConversionRate())
				+ ConstantEnum.CMTOINCH.getImperialSymbol();
	}

	@PostMapping(path = "metersToFeet", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertMetersToFeet(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.METERSTOFEET.getConversionRate())
				+ ConstantEnum.METERSTOFEET.getImperialSymbol();
	}

	@PostMapping(path = "kmToMiles", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertKmToMiles(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.KMTOMILES.getConversionRate())
				+ ConstantEnum.KMTOMILES.getImperialSymbol();
	}

	@PostMapping(path = "litreToGallon", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertLitreTogallon(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.LITRETOGALLON.getConversionRate())
				+ ConstantEnum.LITRETOGALLON.getImperialSymbol();
	}

	@PostMapping(path = "celsToFahren", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String convertCelsToFahren(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.CELSTOFAHREN.getConversionRate())
				+ ConstantEnum.CELSTOFAHREN.getImperialSymbol();
	}

	@PostMapping(path = "kgToPound", produces = { MediaType.APPLICATION_JSON_VALUE })
	private String convertKgToPound(@PathParam(value = "unit") double unit) {
		return conversionObj.metricToImperial(unit, ConstantEnum.KGTOPOUND.getConversionRate())
				+ ConstantEnum.KGTOPOUND.getImperialSymbol();
	}
}
