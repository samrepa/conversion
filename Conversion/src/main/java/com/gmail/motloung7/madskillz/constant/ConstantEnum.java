package com.gmail.motloung7.madskillz.constant;


public enum ConstantEnum {
	CMTOINCH(2.54, " cm", " inch"), METERSTOFEET(0.3048, " m", " feet"), KMTOMILES(1.609344, " km", " miles"),
	LITRETOGALLON(3.785, " l", " gal"), KGTOPOUND(2.205, " kg", " lb"), CELSTOFAHREN(1.8, " C", " F"),
	FAHRENTOCELS(0.555555555556, " C", " F");

	private final double conversionRate;
	private final String metricSymbol;
	private final String imperialSymbol;

	ConstantEnum(double conversionRate, String metricSymbol, String imperialSymbol) {
		this.conversionRate = conversionRate;
		this.metricSymbol = metricSymbol;
		this.imperialSymbol = imperialSymbol;

	}

	public double getConversionRate() {
		return conversionRate;
	}

	public String getMetricSymbol() {
		return metricSymbol;
	}

	public String getImperialSymbol() {
		return imperialSymbol;
	}

}
