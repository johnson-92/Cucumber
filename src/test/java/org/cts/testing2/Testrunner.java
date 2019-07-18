package org.cts.testing2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PRATHEEP A\\eclipse-workspace\\Testing1\\features\\Add.feature",glue="org.cts.testing2",plugin={"pretty","html:target","json:target/cucumberreport.json","rerun:src/test/resources/failed.txt"},dryRun=false,strict=false,monochrome=false)

public class Testrunner {

}
