package com.runner.file;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Value",glue= {"com.stepdefinition.get"})
public class GetExecuteCode {
	
}