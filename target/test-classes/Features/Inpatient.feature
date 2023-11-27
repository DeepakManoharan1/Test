Feature: Checking the Inpatient Module

Background: 
    Given user enters into the Admin portal

@NotEnterAllFeildInOp
Scenario: Missing the mandatory fields intentionally in new patient for OutPatient office 

Given user enters into InPatient
When clicks the Add patient
And clicks the new patient
And enter some fields in InPatient
Then Assert the error in Inpatient

@MandatoryOp
Scenario: checking the new patient at out patient
Given user enters into InPatient
When clicks the Add patient
And clicks the new patient
And enter the Mandatory fields only in InPatient
Then Assert the successfull message in InPatient

@FullOutPatient
Scenario: Checking the mandatory fields for the new patient details in Inpatient

Given user enters into InPatient
When clicks the Add patient
And clicks the new patient
And enter the Mandatory fields only in InPatient
Then enters the other OPD details in InPatient
And checks the name in Inpatient

@OpNotMandatory
Scenario: Intentionally failing in InPatient module

Given user enters into InPatient
When clicks the Add patient
And clicks the new patient
And Missing Mandatory fields only in InPatient
Then Assert the intentional error in InPatient






