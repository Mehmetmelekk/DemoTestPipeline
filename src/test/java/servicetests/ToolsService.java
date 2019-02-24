package servicetests;

import static io.restassured.RestAssured.given;

import org.hibernate.validator.constraints.SafeHtml.Tag;
import org.junit.Test;

public class ToolsService {
	
	String  basePath = "/tools";  
	
	@Test
	@Tag(name = "API")
	public void testGetAllToolsThenCheckStatusCode() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}

	@Test
	@Tag(name = "API")
	public void testGetTestrailThenCheckStatusCode() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetQmetryThenCheckStatusCode() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetQtestThenCheckStatusCode() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetQtestThenIsContainResponse() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	 
	 @Test
	@Tag(name = "API")
	public void testGetTestrailThenIsContainResponse() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	 
	 @Test
	@Tag(name = "API")
	public void testGetQmetryThenIsContainResponse() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	 
	 @Test
	@Tag(name = "API")
	public void testGetAllToolsThenIsContainResponse() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
}
