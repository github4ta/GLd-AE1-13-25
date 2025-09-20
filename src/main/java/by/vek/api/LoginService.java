package by.vek.api;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginService {

    private final String URL = "https://gate.21vek.by/sso/login-by-email";
    private String body;
    private Map<String, String> headers;

    private Response response;

    public void doRequest(String email, String password) {
        body = getBodyAsString(email, password);
        headers = getHeaders();

        response = given()
                .body(body)
                .headers(headers)
                .when()
                .post(URL);
    }

    public int getResponseStatusCode() {
        return response.getStatusCode();
    }

    public String getResponseBody() {
        return response.getBody().asString();
    }

    private String getBodyAsString(String email, String password) {
        return String.format("""
                {
                    "email": "%s",
                    "password": "%s"
                }
                """, email, password);
    }

    private Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json");
        headers.put("content-type", "application/json");
        return headers;
    }
}
