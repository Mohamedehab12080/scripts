package com.scripts.controller.scripts.controller;

import java.util.ArrayList;
import com.scripts.controller.scripts.model.cokies;
import java.util.List;

public class cokiesRequest {

	private List<String> cookiesList;

	public List<String> getcookiesList() {
		return cookiesList;
	}

	public void setCokiesList(List<String> cookiesList) {
		
		this.cookiesList = cookiesList;
	}
	
	public List<cokies> setAndGetCokiesObject()
	{
		return mapToLists(getcookiesList());
	}
	
	private List<cokies> mapToLists(List<String> input)
	{
		List<cokies> cokiesListt=new ArrayList<cokies>();
		for(String iputName:input)
		{
			cokies cokiesInput=new cokies();
			cokiesInput.setCokies(iputName.strip());
			cokiesListt.add(cokiesInput);
		}
		return cokiesListt;
	}

}
