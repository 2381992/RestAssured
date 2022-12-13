package restAPIxml;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class DeletRequest {
@Test
	public void test1() {
		RestAssured.given()
					.baseUri("http://localhost:3000")
					.when()
					.delete("employees/3")
					.then()
					.log()
					.all()
					.statusCode(200);
					
	}
}
