Feature: Checking the billing feature

  Background: 
    Given user enters into the Admin portal

  @Billing
  Scenario: Adding patient and checking from patient list
    Given user enters into opd
    And Added the patient details
    Then Check the patient added

  @FrontOffice
  Scenario: Adding visitors and checking from visitors list
    Given user enter into the FrontOffice
    And added the visitors
    Then Check the visitors added

  @OPD-OutPatient
  Scenario: Adding patient and checking from patient list
    Given user enter into the OPD-OutPatient
    And Added the op patient details
    Then Check the op patient added

  @IPD-InPatient
  Scenario: Adding patient and checking from patient list
    Given user enter into the IPD-InPatient
    And Added the In patient details
    Then Check the In patient added
