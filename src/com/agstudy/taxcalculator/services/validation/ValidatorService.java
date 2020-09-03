package com.agstudy.taxcalculator.services.validation;

public interface ValidatorService {
	Boolean isInputVaid(Integer[] userInput);
	Boolean isUserInputValid(String[] userInputLine);
}
