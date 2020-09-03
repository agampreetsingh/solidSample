package com.agstudy.taxcalculator.entities;

public class Tax {
	
	private Double tax;
	
	private TaxType type;

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public TaxType getType() {
		return type;
	}

	public void setType(TaxType type) {
		this.type = type;
	}
	
}
