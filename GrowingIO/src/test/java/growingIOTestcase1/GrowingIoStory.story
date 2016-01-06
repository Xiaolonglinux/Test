Narrative:
	In order to communicate effectively to the business some functionality
	As a development team
	I want to use Behaviour-Driven Development
					 
Scenario: Test GrowingIO
Given I has  opend '$BROWSER'
When I forwards to '$URL'
Then the browsers click login
Then the forgot password
Then the users accept the invitation
Examples:  
	| BROWSER | URL                       | 
	| firefox | https://www.growingio.com | 