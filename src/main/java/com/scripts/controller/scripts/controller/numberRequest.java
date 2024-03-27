package com.scripts.controller.scripts.controller;

import java.util.ArrayList;
import com.scripts.controller.scripts.model.Number;
import java.util.List;


public class numberRequest {

	private List<String> numbersList;

	public List<String> getNumbersList() {
		return numbersList;
	}

	public void setNumbersList(List<String> numbersList) {
		
		this.numbersList = numbersList;
	}
	
	public List<Number> setAndGetNumberObject()
	{
		return mapToLists(getNumbersList());
	}
	
	private List<Number> mapToLists(List<String> input)
	{
		List<Number> numbersList=new ArrayList<Number>();
		for(String iputName:input)
		{
			Number numberObject=new Number();
			numberObject.setNumber(iputName.strip());
			numbersList.add(numberObject);
		}
		return numbersList;
	}
}
