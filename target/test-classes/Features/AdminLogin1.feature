Feature: Checking the User Login feature

  Background: 
    Given User enters into the User Login portal

  @Radiology
  Scenario: Searching the report and downloading the pdf
    Given User clicks radiology
    When Search the bill number in search field
    Then Download the report in pdf format

  @Ambulance
  Scenario: Adding the payment details
    Given User clicks the ambulance
    When Processing payment using card
    Then Checks the payment is successful

  @BloodBank
  Scenario: Sorting the component issue using component name
    Given User clicks the blood bank
    When Switches to component issue
    Then Search for component using search field

  @Whatsapp
  Scenario: Sending chat to the staff member
    Given User clicks the whatsapp
    When Send message to the staff
    Then Check the message is delivered
