package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features", 
glue = "com.bellatrix.stepDefination")
public class FeatureRunnerClass extends AbstractTestNGCucumberTests {

}
