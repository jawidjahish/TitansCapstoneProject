Feature: Retail Test Environment

  @login
  Scenario: login to Test Envirnment
    Given user is on retail website
    When user click on myAccount
    And user click on Login option
    And user enter userName "cali.titans@tekschool.us" and password "cali123"
    And user clcik on Login button
    Then user should be logged into myAccount page

  Scenario: Register as an Affiliate user with Cheque Payment Mathod
    When User click on 'Register for an Affiliate Account' link
    And User fill affilate form with blow information
      | company | website | taxID | paymentMehtod |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information |firstname|lastName|email|telephone|
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
