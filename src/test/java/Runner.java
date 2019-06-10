import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"@rerun/failedscenario.txt"},
                    glue="cucumberprog",
                    plugin={"html:C:\\Users\\training_c2a.05.01\\workspace\\New folder\\cucumberprog",
                    		 "rerun:rerun/failedscenario.txt"})
public class Runner {

}
