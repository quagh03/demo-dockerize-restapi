# Example RestAPI with Spring Boot, JPA, and MySQL

This repository contains an example RestAPI built with Spring Boot, JPA (Java Persistence API), and MySQL. This project demonstrates the basic setup and implementation of a RESTful API using Spring Boot for building web applications, JPA for database interaction, and MySQL as the underlying database.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- MySQL server installed and running

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/quagh03/demo-RestAPI.git
    ```
2. Open the project in your preferred IDE(IntelliJ, NetBean, Eclipse, etc..).

## Usage

### Endpoints
#### Categories
- `GET api/categories`: Get a list of all categories.
- `GET api/categories/{id}`: Get details of a specific category by ID.
- `POST api/categories`: Create a new category.
- `PUT api/categories/{id}`: Update an existing category by ID.
- `DELETE api/categories/{id}`: Delete a category by ID.
#### Products
- `GET api/products`: Get a list of all products.
- `GET api/products/{id}`: Get details of a specific products by ID.
- `POST api/products`: Create a new products.
- `PUT api/products/{id}`: Update an existing products by their ID.
- `DELETE api/products/{id}`: Delete a products by their ID.

### Database Configuration
Use the provided SQL file (**_demoapi.sql_**) to initialize the database for the application.

The project uses a MySQL database. Update the `application.properties` or `application.yml` file with your MySQL configuration:
```sh
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

## Running the Application
1. Ensure your MySQL server is running.
2. Use your IDE to build and start the Spring Boot application. Alternatively, you can use the Maven:
    ```sh
    mvn spring-boot:run
    ```

## Contributing
Feel free to open issues or submit pull requests to contribute to this project.
