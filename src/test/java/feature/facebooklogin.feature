Feature: facebook login functionality
  Scenario: creating username and password
    Given i am a facebook user
    When user enter the username and password
    When user click the login button
    Then user login the facebook


 Scenario: creating an account
   Given i am a facebook user
   When  i enter the first name and surname
   And enter the email address and new password
   And enter the dob and gender
   Then user create a new facebook profile


   Scenario: creating invalid username and password
     Given  i am a facebook user
     When user enter the invalid username and password
     When user click the login button
     Then  user not success the login
