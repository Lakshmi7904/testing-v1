import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.payload.Payload;
import org.testng.Assert;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class Test {


    public static void main(String[] args) {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given()
                .header("Content-Type", "application/json")
                .queryParam("key", "qaclick123")
                .body(Payload.requestBody())
                .when()
                .post("/maps/api/place/add/json")
                .then()
                .statusCode(200)
                .body("scope", equalTo("APP"))
                .header("Server", "Apache/2.4.41 (Ubuntu)").extract().asString();
        System.out.println(response);
        JsonPath jsonPath = new JsonPath(response);
        String placeId = jsonPath.get("place_id");
        System.out.println(placeId);
//PUT method
        String newAddress = "10730 w";
        given().header("Content-Type", "application/json").queryParam("key", "qaclick123")
                .body(Payload.putPayload(placeId, newAddress)).when().put("maps/api/place/update/json").then().statusCode(200).log().all();
//GET method
        String getResponse = given().header("Content-Type", "application/json").queryParam("key", "qaclick123").queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().statusCode(200).log().all().extract().asString();
        JsonPath jsonPath1 = new JsonPath(getResponse);
        String address = jsonPath1.get("address");
        System.out.println(address);
        Assert.assertEquals(address, newAddress);


        //JSON parsing Complex Object
        String complexJson = Payload.codeBody();
        JsonPath jsonPath2 = new JsonPath(complexJson);
        int amount = jsonPath2.get("dashboard.purchaseAmount");
        System.out.println(amount);
        String webSite = jsonPath2.get("dashboard.website");
        System.out.println(webSite);
        int courseSize = jsonPath2.get("courses.size()");
        System.out.println(courseSize);
        String thirdTitle = jsonPath2.get("courses[2].title");
        System.out.println(thirdTitle);
        for (int i = 0; i < courseSize; i++) {
            String title = jsonPath2.get("courses[" + i + "].title");
            System.out.println(title);
            int price = jsonPath2.get("courses[" + i + "].price");
            System.out.println(price);
        }
        for (int i = 0; i < courseSize; i++) {
            String titleCheck = jsonPath2.get("courses[" + i + "].title");
            if (titleCheck.equals("Cypress")) {
                int copiesCheck = jsonPath2.get("courses[" + i + "].copies");
                System.out.println(copiesCheck);
                break;
            }
        }
        int purchaseAmount = jsonPath2.get("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        int totalAmount = 0;
        for (int i = 0; i < courseSize; i++) {
            int price = jsonPath2.get("courses[" + i + "].price");
            System.out.println(price);
            int copies1 = jsonPath2.get("courses[" + i + "].copies");
            System.out.println(copies1);
            totalAmount = totalAmount + price * copies1;
            System.out.println(totalAmount);

        }

        if (totalAmount == purchaseAmount) {
            System.out.println("Same Price");
        } else {
            System.out.println("Prices not Same");
        }

       int sum = addTwoNumbers(10,8);
        System.out.println("SUM of two numbers = " + sum);
    }


    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

}

