#Author: your.email@your.domain.com
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

Feature: Title of your feature
  I want to use this template for my feature file

 #Scenario: Program1 Open Google Search & Search for 'selenium hq' and Print the Description
 #Given Enter Url as "https://www.google.com/"
 #Then Search For "selenium hq"
 #And Print The Description
 
 
 Scenario: Program2 Open Url and then	From the arrivals section, print the status of the flights coming 
 Given Navigate to Url as "https://www.flightradar24.com/data/airports/pnq"
 Then Go to Arrivals and Search For Flights 
