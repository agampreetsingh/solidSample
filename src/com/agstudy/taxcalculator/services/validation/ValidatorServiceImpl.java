package com.agstudy.taxcalculator.services.validation;

import com.agstudy.taxcalculator.entities.ItemCatagory;

public class ValidatorServiceImpl implements ValidatorService {

	@Override
	public Boolean isInputVaid(Integer[] userInputArray) {
		Boolean isValid = true;
		for(Integer userInput: userInputArray) {
			if(userInput <= 0) {
				isValid = false;
			}
		}
		return isValid;
	}

	@Override
	public Boolean isUserInputValid(String[] userInputLine) {
		if(userInputLine.length!=3) {
			return false;
		} else {
			if(!(userInputLine[1].equals(ItemCatagory.H.name()) || userInputLine[1].equals(ItemCatagory.C.name()))) {
				return false;
			}
			try {
				Integer.parseInt(userInputLine[2]);
			}catch(NumberFormatException e) {
				return false;
			}
			if(Integer.parseInt(userInputLine[2])<0) {
				return false;
			}
		}
		return true;
	}

}
