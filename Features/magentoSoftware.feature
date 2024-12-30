Feature: Account Management in Magento Software

  Scenario: User creates an account in MagentoSoftware
    Given User navigates to the URL "https://magento.softwaretestingboard.com/"
    And User clicks on "Create an Account" link
    When User fills in the account details:
      | FirstName | LastName | Email               | Password  | ConfirmPassword |
      | Ramya     | Janu     | ramyajanu@gmail.com | Janu@1234 | Janu@1234       |
    And User clicks on the "Create an Account" button
    Then User should see the account dashboard with the page title "Customer Account"
    And User clicks on "Sign Out"

  Scenario: User signs in with the created account
    Given User navigates to the URL "https://magento.softwaretestingboard.com/"
    And User clicks on "Sign In" link
    When User enters Email as "ramyajanu@gmail.com" and Password as "Janu@1234"
    Then User should see the account dashboard with the page title "Customer Account"
