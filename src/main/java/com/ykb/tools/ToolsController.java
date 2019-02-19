package com.ykb.tools;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("tools")
public class ToolsController {

@RequestMapping( method = RequestMethod.GET,path="")
public String AllTools() {
return "testrail,Qtest,Qmetry";
}
	
@RequestMapping( method = RequestMethod.GET,path="/testrail")
public String TestRail() {
	return "testrail response";
}

@RequestMapping( method = RequestMethod.GET,path="/qmetry")
public String Qmetry() {
	return "qmetry response";
}

}
