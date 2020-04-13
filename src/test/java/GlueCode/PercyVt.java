package GlueCode;

import cucumber.api.java.en.Given;
import io.percy.selenium.Percy;

public class PercyVt {

    @Given("^I make Percy Visual Test validation with screenshot name: \"([^\"]*)\"")
       public void takeSnapshot(String screenshotName) {
       Percy percy = new Percy(GeneralStepDefinitions.getDriver());
       percy.snapshot(screenshotName);
    }

}
