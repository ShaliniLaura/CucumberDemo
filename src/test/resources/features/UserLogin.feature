Feature: User Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters  "tomsmith"  and "SuperSecretPassword!"
#Then Should display Success Msg


#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters  "<username>"  and "<password>"
#Then Should display Success Msg

#Examples:

#  | username | password |
#  | tomsmith | SuperSecretPassword! |
#  | testUser1 | Welcome123 |
#  | testUser2 | Welcome123 |

# Data passing at step level using Lists
#Scenario: Valid Login
#Given User is on Login Page
#When User enters  credentials
# |tomsmith | SuperSecretPassword! |
#Then Should display Success Msg

# Data passing at step level using Maps
Scenario: Valid Login
Given User is on Login Page
When User enters  credentials
  | username | password|
  |tomsmith | SuperSecretPassword! |
Then Should display Success Msg