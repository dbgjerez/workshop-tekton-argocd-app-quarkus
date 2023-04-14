package io.dborrego;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/q/info")
          .then()
             .statusCode(200)
             .body(is("{\"name\":\"Empty var\",\"version\":\"Empty var\"}"));
    }

}