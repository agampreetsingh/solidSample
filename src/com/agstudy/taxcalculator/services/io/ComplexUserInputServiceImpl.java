package com.agstudy.taxcalculator.services.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.agstudy.taxcalculator.entities.UserInput;
import com.agstudy.taxcalculator.services.validation.ValidatorService;
import com.agstudy.taxcalculator.services.validation.ValidatorServiceImpl;

public class ComplexUserInputServiceImpl implements ComplexUserInputService {

	private Scanner scanner = new Scanner(System.in);
	private List<UserInput> userInputList;
	private ValidatorService validatorService = new ValidatorServiceImpl();
	
	@Override
	public List<UserInput> getUserInputList() {
		userInputList = new ArrayList<UserInput>();
		int indexCounter = 0;
		while(scanner.hasNextLine()) {
			String[] userInputLine = scanner.nextLine().split(" ");
			if(validatorService.isUserInputValid(userInputLine)) {
				UserInput userInput = new UserInput();
				userInput.setItemName(userInputLine[0]);
				userInput.setCatagory(userInputLine[1]);
				userInput.setPrice(Integer.parseInt(userInputLine[2]));
				userInput.setPosition(++indexCounter);
				userInputList.add(userInput);
			}
		}
		return userInputList;
	}

}
