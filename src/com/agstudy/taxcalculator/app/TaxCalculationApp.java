package com.agstudy.taxcalculator.app;

import com.agstudy.taxcalculator.services.io.InputService;
import com.agstudy.taxcalculator.services.io.InputServiceImpl;
import com.agstudy.taxcalculator.services.taxcalculation.TaxCalculatorService;
import com.agstudy.taxcalculator.services.taxcalculation.TaxCalculatorServiceImpl;
import com.agstudy.taxcalculator.services.validation.ValidatorService;
import com.agstudy.taxcalculator.services.validation.ValidatorServiceImpl;

public class TaxCalculationApp {
	
	public static void main(String[] args) throws Exception {
	
		InputService inputService = new InputServiceImpl();
		Integer[] userInput = inputService.takeUserInputForPrice();
		
		ValidatorService validatorService = new ValidatorServiceImpl();
		if(validatorService.isInputVaid(userInput)) {
			TaxCalculatorService taxCalculatorService =  new TaxCalculatorServiceImpl();
			System.out.println(taxCalculatorService.getTotalTax(userInput));
		}
		else {
			throw new Exception("Invlaid User Input");
		}
	}
}

