Feature: Checking the Outpatient Module

Background: 
    Given user enters into the Admin portal

@NotEnterAllFeildInOp
Scenario: Missing the mandatory fields intentionally in new patient for OutPatient office 

Given user enters into OutPatient
When clicks the Add patient
And clicks the new patient
And enter some fields in OutPatient
Then Assert the error in outpatient

@MandatoryOp
Scenario: checking the new patient at out patient
Given user enters into OutPatient
When clicks the Add patient
And clicks the new patient
And enter the Mandatory fields only in outPatient
Then Assert the successfull message in OutPatient

@FullOutPatient
Scenario: Checking the mandatory fields for the new patient details in outpatient

Given user enters into OutPatient
When clicks the Add patient
And clicks the new patient
And enter the Mandatory fields only in outPatient
Then enters the other OPD details in outPatient
And checks the name in Outpatient

@OpNotMandatory
Scenario: Intentionally failing in OutPatient module

Given user enters into OutPatient
When clicks the Add patient
And clicks the new patient
And Missing Mandatory fields only in outPatient
Then Assert the intentional error in OutPatient






