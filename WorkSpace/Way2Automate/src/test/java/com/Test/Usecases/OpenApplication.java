package com.Test.Usecases;

import com.test.Configuration.BaseClass;

import cucumber.api.java.en.Given;

public class OpenApplication extends BaseClass{


	@Given("^Open the URL$")
	public void open_the_URL() throws Throwable {
		InitialiseParameter();
	    InitialiseDriver();
	    CallURL(CON.getProperty("ApplictaionURL"));
	}
}
