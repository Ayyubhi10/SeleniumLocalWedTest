# Selenium Java TestNG Automation with GitHub Actions

## Project Overview
This project demonstrates automated testing of a Student Login webpage using Selenium WebDriver, Java, TestNG, and Maven.

GitHub Actions is integrated to automatically execute Selenium tests and generate TestNG reports.

## Technologies Used
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE
- Git and GitHub
- GitHub Actions
- Google Chrome

## Test Cases

| Test Case | Description | Result |
|---|---|---|
| validLoginTest | Test valid login functionality | Passed |
| invalidLoginTest | Test invalid login functionality | Passed |
| checkBackgroundColor | Verify webpage background color | Passed |

## Test Execution Results
- Total Tests: 3
- Passed: 3
- Failed: 0
- Skipped: 0
- Success Rate: 100%

## Running Tests Locally

Clone the repository:

`git clone https://github.com/Ayyubhi10/SeleniumLocalWedTest.git`

Navigate into the project folder:

`cd SeleniumLocalWedTest`

Execute the tests:

`mvn clean test -Dsurefire.suiteXmlFiles=testing.xml`

## GitHub Actions CI/CD

The GitHub Actions workflow automatically:

1. Checks out the repository.
2. Sets up Java 17.
3. Configures Google Chrome.
4. Runs Selenium TestNG tests using Maven.
5. Uploads the generated TestNG reports as workflow artifacts.

## Test Reports

After workflow execution, reports can be downloaded from:

**GitHub → Actions → Workflow Run → Summary → Artifacts → selenium-test-reports**

## Project Status

All three automated tests have passed successfully in GitHub Actions.
