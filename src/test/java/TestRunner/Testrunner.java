package TestRunner;

	
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	//import org.junit.runner.RunWith;


		@CucumberOptions(features = "src/test/java/feature", glue = {"StepDef","ApplicationHooks"}, //tags ="@Smoke",
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
						"timeline:test-output-thread/"
				}		
						)

		
				
					
		public class Testrunner extends AbstractTestNGCucumberTests {
		}




