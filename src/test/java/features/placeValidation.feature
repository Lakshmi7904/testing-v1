Feature: Validating Place API's

  Scenario : Verify if place is successfully added using AddPlaceAPI
    Given Add place payload
    When User calls "AddPlaceAPI" with post http request
    Then the API call got success with status code 200
    And "status" in response body is "ok"
    And "scope" in response body is "APP"



