package by.vek;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SearchService {

    private final String URL = "https://gate.21vek.by/search-composer/api/v1/search/suggest";


    private Response response;

    public void doRequest(String search) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("query", search);
        queryParams.put("mode", "desktop");
        queryParams.put("clientId", "2027908734.1756316925");

        Map<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json");
        headers.put("content-type", "application/json");

        response = given().queryParams(queryParams)
                .headers(headers)
                .when()
                .get(URL)
                .then().extract().response();

    }

    public int getResponseStatusCode() {
        return response.getStatusCode();
    }

    public String getResponseBody() {
        return response.getBody().asPrettyString();
    }
}
