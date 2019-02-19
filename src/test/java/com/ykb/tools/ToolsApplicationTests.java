package com.ykb.tools;

import static org.hamcrest.CoreMatchers.hasItems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.hamcrest.Matchers;


import io.restassured.http.ContentType;
import io.restassured.response.Response;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ToolsApplicationTests {
	
	String  basePath = "/tools";  
	
	@Test
	public void exampleRestTest() {
		 given().when().get("http://localhost:8090/tools")
         .then().statusCode(200);	}
	
}
