package com.step_definitions;

import com.utilities.api.AdminAuthenticationUtility;
import com.utilities.api.Endpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class OrganizationListDefs extends BaseStep{
    private String bearerToken;

    @Given("I am on Cisco Webex app")
    public String i_am_on_Cisco_Webex_app() {
      //  authenticationUtility = new AdminAuthenticationUtility();
        return  bearerToken ="Bearer " + authenticationUtility.getToken();


    }

    @When("I do request about organization")
    public void i_do_request_about_organization() {


      Response response =
              given().
              header("Authorization", bearerToken).
                      log().all().
              when().
                      get(Endpoints.GET_ORGANISATIONS).
                      prettyPeek()
              ;
     //response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();
        Map<String, Object> responseMap = jsonPath.getMap("");
        System.out.println(responseMap);

        List<String> listOfResp = jsonPath.getList("items.id");
        System.out.println(listOfResp);


       // String id = responseMap.get("");

        // "items": [
        //        {
        //            "id": "Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi9mOGY4YTg3YS0xNjM0LTRhNjctYTkwZi0yMmI2YmRmMDA2NTU",
        //            "displayName": "my home",
        //            "created": "2019-06-28T03:27:02.576Z"
        //        }
        //    ]
    }

    @Then("I get list of my organizations")
    public void i_get_list_of_my_organizations() {
    // List<>
    }



}
