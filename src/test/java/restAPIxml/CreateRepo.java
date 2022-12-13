package restAPIxml;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateRepo {
	
	
	@Test
	public void test1() {
		
		File data1file = new File("data1.json");
		
		RestAssured.given()
				.auth()
				.oauth2("Dummy Token")
				.baseUri("https://api.github.com")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(data1file)
				.when()
				.post("user/repos")
				.then()
				.log()
				.all()
				.statusCode(201);
	}
	}

