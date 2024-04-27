## Test Automation Framework with Selenium JAVA and Cucumber TestNG

**SOME FEATURES IN FRAMEWORK**

1. BDD implementation using Cucumber
2. Page Object Model design pattern is used
3. Spark Extent Report
4. Record Screenshot of failed test case (1 case is failed intentionally)
5. Application used for automation https://www.saucedemo.com/

### **SYSTEM REQUIREMENTS**

- JDK
- Chrome Browser
- Maven for windows
- Eclipse as IDE
- TestNG

## How to Run tests
- Double click on Run.bat file available at root of project directory(internally it would run mvn test command using maven surefire plugin)
- Run Cucumber TestRunner from src/test/java/TestRunner/CucumberIT.java
- Run Feature from Maven pom.xml file (mvn clean test)
- Run Feature file (src/test/resources/features/)

# Test Reporting
- Spark Extent report
  - New test-report folder will be created with datetime stamp for each run, we can find HTML and PDF format inside it
  ![image](https://github.com/Pradip-Patel-7/SeleniumCucumberTest/assets/168201790/a89397b8-7e8c-4254-b86b-38938f1e75eb)

  ![image](https://github.com/Pradip-Patel-7/SeleniumCucumberTest/assets/168201790/b28d28e4-dfe2-43d8-9f86-62ca3bc5171d)


- Cucumber report
  - It can be found under target folder
  ![image](https://github.com/Pradip-Patel-7/SeleniumCucumberTest/assets/168201790/b4736798-0e5c-4857-a4ab-080135bf843a)

