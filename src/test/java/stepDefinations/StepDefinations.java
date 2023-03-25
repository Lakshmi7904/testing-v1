package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinations {

    /*@Given("^Add place payload$")
    public void add_place_payload() throws Throwable {
        throw new PendingException();
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given()
                .header("Content-Type", "application/json")
                .queryParam("key", "qaclick123")
                .body(Payload.requestBody());
    }

    @When("^User calls \"([^\"]*)\" with post http request$")
    public void user_calls_something_with_post_http_request(String strArg1) throws Throwable {
        throw new PendingException();
        When().post("/maps/api/place/add/json");
    }

    @Then("^the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code_200() throws Throwable {
        throw new PendingException();
        .then()
                .statusCode(200)
                .body("scope", equalTo("APP"))
                .header("Server", "Apache/2.4.41 (Ubuntu)").extract().asString();
    }

    @And("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
    public void something_in_response_body_is_something(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }*/

}

