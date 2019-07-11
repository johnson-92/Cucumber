package org.cts.testing2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src/test/resources/failed.txt",glue="org.cts.testing2",plugin={"pretty","html:target","json:target/cucumber_report.json"})

public class Rerunner {

}
