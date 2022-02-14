package com.gmail.motloung7.madskillz.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Component;
import com.gmail.motloung7.madskillz.constant.ConstantEnum;

@Component
public class ConversionObject{

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public String metricToImperial(Double unit, Double conversionRate) {
		if (conversionRate == ConstantEnum.CELSTOFAHREN.getConversionRate()) {
			return df.format((unit * conversionRate) + 32.0);
		}
		return df.format(unit / conversionRate);
	}

	public String imperialToMetric(Double unit, Double conversionRate) {
		if (conversionRate == ConstantEnum.FAHRENTOCELS.getConversionRate()) {
			System.out.println("Within imperialToMetric FAHRENTOCELS");
			return df.format((unit - 32) * conversionRate);
		}
		return df.format(unit * conversionRate);
	}
}
