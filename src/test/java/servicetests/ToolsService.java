package servicetests;

import static io.restassured.RestAssured.given;

import org.hibernate.validator.constraints.SafeHtml.Tag;
import org.junit.Test;

public class ToolsService {
	
	String  basePath = "/tools";  
	
	@Test
	@Tag(name = "API")
	public void testGetAllTools() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}

	@Test
	@Tag(name = "API")
	public void testGetAllToolsa() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetAllToolsb() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetAllToolsc() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
	@Test
	@Tag(name = "API")
	public void testGetAllToolsd() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(400);	}
}
