#Author: mahesh 
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@titlevalidation1
Feature: Abhibus
  I want to Automate Abhibus Site
  
  Background: 
   Given url is provided
  

  @Reg123
  Scenario: Title Validation
    And print the title and url of application
    @Reg @Smoke
  Scenario: Title Validation
    And print the title and url of application
  @Reg @San
  Scenario: Title Validation
    And print the title and url of application
 @Reg1
  Scenario: Title Validation
    And print the title and url of application
   @Reg @San
  Scenario: Title Validation
    And print the title and url of application
 
    