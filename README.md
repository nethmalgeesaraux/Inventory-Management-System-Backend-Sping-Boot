📦 Inventory Management System – Spring Boot


📖 Project Overview

The Inventory Management System is a Spring Boot–based backend application designed to manage products, categories, suppliers, transactions, and users efficiently.
It supports stock tracking, purchase/sales transactions, supplier management, and user role handling.

This system is suitable for shops, warehouses, and small-to-medium businesses.

🛠️ Technologies Used

Java 17+

Spring Boot

Spring Data JPA (Hibernate)

Spring Security (JWT – optional)

MySQL

Maven

Lombok

RESTful APIs

🗂️ Database Design

The system consists of the following main tables:

users

products

categories

suppliers

transactions

Entity Relationship Diagram (ERD)

📦 Database Tables 


<img width="756" height="1023" alt="inventory_db" src="https://github.com/user-attachments/assets/ac5c6d8a-51d1-4295-9204-7f570dd38a99" />


🚀 Features

User authentication & role-based access

Product & category management

Supplier management

Stock in / stock out transactions

Automatic stock quantity updates

RESTful API design

Secure database interaction using JPA

⚙️ Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/your-username/inventory-management-system.git

2️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3️⃣ Run the Application
mvn spring-boot:run

🔗 Sample API Endpoints
Method	Endpoint	Description
POST	/api/auth/login	User login
POST	/api/products	Add product
GET	/api/products	Get all products
POST	/api/transactions	Create transaction
GET	/api/categories	Get categories
🔒 Security

Passwords are encrypted

JWT-based authentication (optional)

Role-based authorization

👨‍💻 Author

Nethmal Geesara
📍 Sri Lanka
🎓 Java & Spring Boot Developer

