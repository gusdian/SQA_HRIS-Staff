Feature: User Login to HRIS - PA Employee Downliner

  @LoginValid
  Scenario: Testing Login Downliner Valid
    Given User mengakses url
    When User valid klik login button
    Then User berhasil login

  @LoginInvalid
  Scenario: Testing Login Downliner Invalid
    When User invalid klik login button
    Then User gagal login
