import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DemowebshopTests {
    TestData testData = new TestData();

    @Test
    void changeAdressTest() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body(testData.body)
                .cookie(testData.cookieName, testData.value)
                .when()
                .post("https://demowebshop.tricentis.com/customer/addressedit/2926175")
                .then()
                .log().all()
                .statusCode(302);

    }

}
