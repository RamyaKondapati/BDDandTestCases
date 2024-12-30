
 Feature: Account Creation and Login

  Scenario: User creates an account in MagentoSoftware
    Given User navigate to the URL "https://magento.softwaretestingboard.com/"
    And User click on Create an Account link
    Then Page title should be "https://magento.softwaretestingboard.com/customer/account/create/"
    When User create an account with "Ramya" "Janu" "ramyajanu@gmail.com" "Janu@1234" "Janu@1234"
    And User click on Create an Accountbutton
    Then User should see my account dashboard with page Title "Customer Account "
    And User click on SignOut
    
    
      Scenario: User signin with created account
    Given User navigate to the URL "https://magento.softwaretestingboard.com/"
    And User click on Signin Link
    And User Enters Email as "ramyajanu@gmail.com" and password as "Janu@1234"
    Then User should see my account dashboard
    
    
    
    
    