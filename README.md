# customer-relationship-manager
This is a Java Full Stack Spring boot Application used MySQL as Database
Technologies used: Spring Core, Spring MVC, Hibernate API, JSP pages, JSTL tags, Thymeleaf, Maven, HTML, CSS, Bootstrap, Database engine used: MySQL, Configuration application (xml).

A full Web working application with Spring, Hibernate and Maven functions. This full CRUD application is a Customer Relationship Management system that allows to track customers. The app displays a customer list extracted from the database and allows adding, removing, updating, searching, deleting the customers. The customers in the list are basic entities having id, first name, last name, email, company. The database has one Customer table with the fields mentioned earlier. The fields are mapped to the Customer Java entity using Hibernate annotations

Additional Feature Added is Search Option we can Filter Customer Details By their First Name, By their Last Name, By their Email ID and even By Company name we can able to filter customer details accordingly as per the user requirement and as we all know we can create customer, update customer details and delete the customer.

IMG - SNAPSHOT 1: All Customers
![3](https://github.com/Aftab91/customer-relationship-manager/assets/45013267/4d6d06be-6a93-44d6-a509-dc9e5f77f8bf)

IMG - SNAPSHOT 2: CREATE Customer
![1](https://github.com/Aftab91/customer-relationship-manager/assets/45013267/8ad30b76-9f7a-4dba-a12e-8e1a726b0bcb)

IMG - SNAPSHOT 3: UPDATE Customer
![2](https://github.com/Aftab91/customer-relationship-manager/assets/45013267/04e11d85-8620-4106-a040-1341409d5529)

IMG - SNAPSHOT 4: SEARCH Filter Customer By their First Name | Last Name | Email ID | Company
![4](https://github.com/Aftab91/customer-relationship-manager/assets/45013267/c0859613-d346-4b96-84a0-d31e6f13a39f)

Guide To Install or Run this Application on your device:

To Create Spring Boot Project [Optional Step Ignore if you dont want to build this project from scratch]
Go to [start.spring](https://start.spring.io/)https://start.spring.io/ 
Download Project With Java - Maven Project 
ADD Dependencies: Spring Web, Thymeleaf, MySQL Driver, Spring Data JPA, Spring boot DevTools
![image](https://github.com/Aftab91/customer-relationship-manager/assets/45013267/3926025c-b803-43d0-911f-f5b90e7bbf34)
Click on Generate, It will download Zip File, Unzip it add entire folder into Intellij IDEA or Eclipse IDE as per your convinience [I suggest use Intellij IDEA]

Step 1: Download GitHub Repository and Unzip
Step 2: Open Folder in Eclipse or Intellij IDEA IDE
Step 3: Check the Dependencies in pom.xml file are correct and latest version is kept 
Step 4: Open Application Properties file from resources folder Add Application properties according to your database if you are using MySQL use your server port number jdbc:mysql://localhost:{your_port_number}/{your_database_name}
#MySQL DB Connect
spring.datasource.url=jdbc:mysql://localhost:3306/crm
Step 5: Add your MySQL DB Username:{your_username} and Password:{your_password} in Application Properties file from resources folder 
spring.datasource.username=your_username
spring.datasource.password=your_password
Step 6: Add Hibernate Properties in the same file Application Properties
#Hibernate
spring.jpa.properties.hibernate.dialect =org.hibernate.dialect.MySQLDialect
hibernate.dialect=org.hibernate.dialect.MySQLInnoDBDialect
Step 7: Add logging level to the same file 
logging.level.org.hibernate.SQL=DEBUG
Step 8: Add Hibernate Auto-ddl properties in same file this step is important as hibernate will auto generate sql commands with the entity class
#Hibernate auto ddl
spring.jpa.hibernate.ddl-auto=update
hibernate.hbm2ddl.auto=create
Step 9: Check All the files structured in path for this you can google how to place the files in proper structure!
Step 10: Run the Applicatin from Main Function class, when application run the first time it will auto create a table if everything works fine you can view the logs generated in the console and if the status is  started now open the browser, open this link : http://localhost:8080/customers  and All Set! 
