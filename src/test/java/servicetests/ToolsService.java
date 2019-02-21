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
         .then().statusCode(400);	}

}
