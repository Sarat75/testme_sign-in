package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Training_H2A.05.18\\eclipse-workspace\\Selenium_july2019\\Cucumber_2019\\src\\main\\java\\Features\\demowebshop.feature",

glue= {"logindemowebshop.java"})


public class testrunner {

}
