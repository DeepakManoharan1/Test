Feature: Checking the Front office Module

Background: 
    Given user enters into the Admin portal

@EnterAllFeildInFO
Scenario: Enter all fields in front office as visitor and save
Given user enters into front office
When clicks the Add visitors
And enter all fields
Then save the visitors

@NotEnterAllFeildInFO
Scenario: Missing the mandatory fields intentionally in new patient for front office 

Given user enters into front office
When clicks the Add visitors
And misses some fields
Then Assert the error frontOffice

@EnterAllFeildInFOasInquiry
Scenario: Enter all fields in front office as inquiry and save
Given user enters into front office
When clicks the Add visitors as inquiry
And enter all fields 
Then save the visitors

@EnterAllFeildInFOasSeminar
Scenario: Enter all fields in front office as  seminar and save
Given user enters into front office
When clicks the Add visitors as seminar
And enter all fields 
Then save the visitors






