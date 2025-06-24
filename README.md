# 📇 Customer Relationship Management System (Spring Boot + MySQL)

A full-stack CRM web application developed using Java, Spring Boot, Hibernate, and MySQL. This project implements complete CRUD operations with search and filtering features for managing customer data in an organization.

---

## 🚀 Features

- Create, Read, Update, Delete (CRUD) operations on customer records
- Search and filter customers by:
  - First Name
  - Last Name
  - Email ID
  - Company Name
- User-friendly interface using JSP and Thymeleaf
- Auto table creation using Hibernate
- Responsive layout using Bootstrap

---

## 🧰 Tech Stack

- **Backend:** Java, Spring Boot, Spring Core, Spring MVC, Spring Data JPA, Hibernate
- **Frontend:** JSP, JSTL, Thymeleaf, HTML, CSS, Bootstrap
- **Database:** MySQL
- **Build Tool:** Maven
- **Configuration:** XML + application.properties

---

## 🗃️ Database Structure

- Table: `customer`
- Fields: `id`, `first_name`, `last_name`, `email`, `company`

Mapped using Hibernate annotations in the `Customer` entity class.

---

## 📸 Screenshots

| Feature         | Screenshot |
|----------------|------------|
| All Customers  | ![All Customers](https://raw.githubusercontent.com/damon005/Customer-Relationship-Management/main/assets/all_customers.png) |
| Create Customer| ![Create Customer](https://raw.githubusercontent.com/damon005/Customer-Relationship-Management/main/assets/create_customer.png) |
| Update Customer| ![Update Customer](https://raw.githubusercontent.com/damon005/Customer-Relationship-Management/main/assets/update_customer.png) |
| Search Feature | ![Search Filter](https://raw.githubusercontent.com/damon005/Customer-Relationship-Management/main/assets/search_customer.png) |

---

## 🛠️ Installation Guide

### Prerequisites:
- Java 17+
- MySQL installed and running
- Maven
- IntelliJ IDEA or Eclipse IDE

### Setup Steps:

1. **Clone the repository**
   ```bash
   git clone https://github.com/damon005/Customer-Relationship-Management.git

2. **Import the project into your IDE**

3. **Update application.properties in src/main/resources**
    ### MySQL connection
       spring.datasource.url=jdbc:mysql://localhost:3306/crm
       spring.datasource.username=your_username
       spring.datasource.password=your_password

    ### Hibernate settings
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLInnoDBDialect
        logging.level.org.hibernate.SQL=DEBUG

4. **Build and run the application**
   
        mvn spring-boot:run

5. **Access the app in your browser**
   
        http://localhost:8080/customers
   
