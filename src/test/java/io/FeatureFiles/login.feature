


Feature: Login to openCart
  As a user
  I want to be able to login to my account
  So that I can access Landing page

  Background:
    Given Validate the browser status
    When Launch the browser
    Then check if browser is present

  @SmokeTest
  Scenario Outline: User Signup
    Given User on signup screen
    When User signup with <Username> and <Password>
    Then User should be redirected to dashbord successfully
    And Correct name should be display
    Examples:
      | Username | Password |
      | sk       | 546547   |
      | nl       | 545dfg   |

    @RegTest @SmokeTest
    Scenario: User is able to click on link1
      Given User on updated dashboard
      When  User clicked on link1
      Then  A new tab should be open with redirected link1

    @SanityTest @RegTest
    Scenario: User is able to click on link2
    Given User on redirected dashboard
    When  User clicked on link2
    Then  A new tab should be open with redirected link2

    @SmokeTest
    Scenario: User's default profile image on dashboard
    Given User on default dashboard
    When  User view default profile image on dashboard
    Then  User's Name initials should be display

    @MobileTest
    Scenario: Android app Launch Test
      Given User has android app
      When  User launched app
      Then  Feed screen displays just after splash









