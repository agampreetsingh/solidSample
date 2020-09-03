package com.agstudy.taxcalculator.services.taxcalculation;

import com.agstudy.taxcalculator.utils.Constants;

public class TaxCalculatorServiceImpl implements TaxCalculatorService{
	
	@Override
	public Double getTaxByPrice(Integer price) {
		if(price >= 500) {
			return this.getTaxFor500Above();
		}
		else if(price >= 100) {
			return this.getTaxFor100Above();
		}
		else
			return this.getDefaultTax();
	}

	private Double getDefaultTax() {
		return Constants.DEFAULT_TAX;
	}

	private Double getTaxFor100Above() {
		return Constants.TAX_FOR_PRICE_ABOVE_100;
	}

	private Double getTaxFor500Above() {
		return Constants.TAX_FOR_PRICE_ABOVE_500;
	}

	@Override
	public Double getTotalTax(Integer[] priceArray) {
		Double totalTax = 0.0;
		for(Integer price: priceArray) {
			totalTax += this.getTaxByPrice(price);
			System.out.println("Total = "+totalTax +"and price= "+price+" and tax = "+this.getTaxByPrice(price));
		}
		return totalTax;
	}

}
