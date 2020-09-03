package com.agstudy.taxcalculator.services.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceImpl implements InputService {

	private Scanner scanner =  new Scanner(System.in);
	private List<Integer> userInputPriceList = new ArrayList<>();
	
	@Override
	public Integer[] takeUserInputForPrice() {
		while(scanner.hasNextLine()) {
			String userInputLine = scanner.nextLine();
			if(userInputLine.equals("")) {
				break;
			}
			Integer inputPrice = Integer.parseInt(userInputLine);
			userInputPriceList.add(inputPrice);
		}
		System.out.println(userInputPriceList);
		return userInputPriceList.toArray(new Integer[0]);
	}

}
