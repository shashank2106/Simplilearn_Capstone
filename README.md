# Simplilearn_Capstone

# Sauce_demo

Welcome to the **Simplilearn_Capstone**! This repository contains an Eclipse Maven project **Sauce demo** that utilizes TestNG and Selenium to automate www.saucedemo.com and Extent reports to generate reports for the tests performed. Follow the steps below to set up and run the project successfully.

## Prerequisites

Make sure you have the following prerequisites installed:

- Eclipse IDE
- Maven
- Java Development Kit (JDK)

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository to your local machine using the following command:

   ```shell
   git clone <repository_url>
   ```

2. Open Eclipse IDE and import the project as a Maven project:

   - Click on **File** > **Import**.
   - Expand the **Maven** folder and select **Existing Maven Projects**.
   - Click **Next**.
   - Browse to the location where you cloned the repository and select the project's root directory.
   - Click **Finish**.

3. Resolve Maven dependencies:

   - Eclipse will automatically start downloading the required dependencies specified in the `pom.xml` file.
   - Wait for the dependencies to be downloaded and built. This process may take some time.

4. Configure the `testng.xml` file:

   - Open the `testng.xml` file located in the project's root directory.
   - Modify the file according to your specific test suite requirements, including the test classes and configurations.
   - Save the changes.

5. Run the project:

   - Right-click on the `testng.xml` file.
   - Select **Run As** > **TestNG Suite**.
   - TestNG will execute the tests defined in the `testng.xml` file, and you can view the results in the TestNG console or the Eclipse console.
