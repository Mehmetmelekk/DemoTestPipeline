package testsuitesandrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import guitests.ToolsGui;
import servicetests.ToolsService;

@RunWith(Suite.class)
@SuiteClasses({ToolsGui.class,ToolsService.class} )
public class TestSuite {
	
}


