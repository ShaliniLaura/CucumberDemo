package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//taggedFeatures//",
		glue={"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"html:target/reports/HtmlReport.html"},
		//Scenario level tags
		//tags="@RegressionTest" // to run @RegressionTest scenarios in all feature files
		//tags="@RegressionTest or @SmokeTest" // to run @RegressionTest scenarios and @SmokeTest scenarios in all feature files
		//tags="@RegressionTest and @SmokeTest" // to run scenarios having both @RegressionTest and @SmokeTest in all feature files
		//Feature Level Tags
		//tags="@PhaseTwo" // to run all scenarios in @PhaseTwo feature only
		//Feature and Scenario level tags
		//tags="@PhaseTwo and @SmokeTest" //to run only @SmokeTest Scenarios in @PhaseTwo feature
		//tags="@PhaseTwo and not @SmokeTest" //to run all scenarios other than @SmokeTest scenarios in @PhaseTwo feature
		//tags="@PhaseTwo and @SmokeTest or @PhaseTwo and @RegressionTest"
	   tags="@PhaseThree and @SmokeTest or @PhaseThree and @RegressionTest" //Background check in feature file
		)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
