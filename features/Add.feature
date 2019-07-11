Feature: To test add traffic plan

  Scenario Outline: To check the customer tariff plan
    Given The user should be telecom homepage and click the add tariff plan
    When User should fill the required info and click submit "<Rental>","<LocMin>","<InterMin>","<SmsPack>","<MinCharge>","<InterCharge>","<SmsCharge>"
    Then Validate if the tariff is added or not

    Examples: 
      | Rental | LocMin | InterMin | SmsPack | MinCharge | InterCharge | SmsCharge |
      |    199 |     50 |       25 |     200 |        20 |          30 |        12 |
      |    299 |     70 |       30 |     250 |        90 |          60 |        18 |
      |    399 |     90 |       20 |     240 |        80 |          40 |        19 |
      |    499 |     60 |       25 |     290 |        30 |          30 |        13 |
      |    599 |     80 |       27 |     270 |        50 |          70 |        15 |
