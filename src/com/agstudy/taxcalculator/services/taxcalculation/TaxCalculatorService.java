package com.agstudy.taxcalculator.services.taxcalculation;

public interface TaxCalculatorService {
	
	Double getTaxByPrice(Integer price);
	
	Double getTotalTax(Integer[] priceArray);
}
