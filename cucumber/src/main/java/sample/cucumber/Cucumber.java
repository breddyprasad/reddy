package sample.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"})

public class Cucumber {



}
