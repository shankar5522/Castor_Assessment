# Castor_Assessment
Here in this framework we only create a basic framework structure for a web-based applications.  

# Limitation or Future Enhancement.
- Currently, the framework supports only Web-based applications and only for Chrome browser.
- We can pass data via TestNG parameters as well apart from excel operation. 
- Does not implement any mechanism for taking screenshots.
- Able to enhance the framework more using Page Object Model [POM].
- System.out.println can be replace with Logger mechanism.

# Prerequisites.
Below are the few packages/ software should install in your system before running the scenarios.
- Eclipse IDE or any suitable IDE's
- Java
- Maven 
- TestNg Plugin

# Built With.
- The Automation framework has been designed in Java Language using Maven.

# Installation.
Below are the steps that we need to follow in order to run the project
- [Clone](https://github.com/shankar5522/Castor_Assessment.git) the project into your local system (i.e. into your         eclipse IDE or any other IDE)
- Navigate to **testng.xml** file and Right-click on **testng.xml** file then Select **Run as TestNG Suite** once done with the scripting.


#Assessment Solution
A. Which tests would you automate, and which not? <BR>
Answer: Since this Castor application has been built with multiple forms/ steps/ data fields on each page. Hence, I would really like to go with Data-driven testing approach to cover all the functionality and we can automate mostly all the scenarios related to records.

A. How would you structurize your automated test suite? <BR>
Answer: Please checkout/ take a [Clone](https://github.com/shankar5522/Castor_Assessment.git) of this repository, to understand the base structure for automation.

C. What do you consider to be the most tricky parts in testing this application? <BR>
Answer: Due to the 'n' number of field, the application becomes a more complex and bit tedious task to understand when experiencing the user very first time. But it's fine we have [Lectures](https://academy.castoredc.com/courses/study-building-and-management-free/lectures/13909301) for each flow.

#Observation/ Bug
- When we select 'None' as a Checkbox then other option should be disabled.
- Instead of preventing submitting the record at the final stage for a new record, we can ask the user to fill all the mandatory fields at an early stage. Just to save time and effort by highlighting the mandatory fields.
- Can we put some flow or sequence diagram at homePage, that describes the step-by-step steps/ process.
- Ideally 00001 is equal to 1 while searching a record. But currently, it's failing.

# Follow below path to know Few identified Testcases.
	Take a clone -> FunctionalTestingEvidence folder
##### Few points needs to assume/ take into consideration.
- Not covered all the functionality from identifying a testcases/ scenarios perspective. More concentrated on automation framework.
- For failed/ Blocked cases, we can raise a defect on ALM or Jira, or any-other bug tracking tool.

# Author.
  - Shankar Gupta
  **[GitHub profile](https://github.com/shankar5522)** || **[LinkedIn profile](https://www.linkedin.com/in/shankarlal-gupta/)**
  
# License.
No License is required.