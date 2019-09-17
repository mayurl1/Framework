package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class getAPI {

	public static void main(String [] args) {
		
		RestAssured.baseURI = "https://maps.googleapis.com";
		 
		given().
		
		param("location","-33.8670522,151.1957362").
		param("radius","500").
		param("key","AIzaSyD-_SItyXj1GOHOnVPP_5gO9Xw-e9lYZaY").
		/*header("ssdd","ddd").
		cookies("ssa","ws").*/
		
		when().
		get("/maps/api/place/nearbysearch/").
	
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].geometry.location.lat",equalTo("5575"));
	}

}
