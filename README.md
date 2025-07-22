# Bakery Management System

## Overview
The Bakery Management System is a Java-based application designed to manage bakery items efficiently. It allows users to add, update, and retrieve information about various bakery products.

## Project Structure
The project follows a standard Maven directory structure:

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── panaderia
│   │   │           ├── App.java
│   │   │           ├── model
│   │   │           │   └── Producto.java
|   |   |           |   └── Pan.java
|   |   |           |   └── Galleta.java
│   │   │           ├── service
│   │   │               └── ManejarProdcuto.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd bakery-management-system
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using:
   ```
   mvn exec:java -Dexec.mainClass="com.bakery.App"
   ```

## Usage
- The application allows you to manage bakery items through a simple interface.
- You can add new items, update existing ones, and retrieve a list of all bakery items.

## Dependencies
This project uses Maven for dependency management. The `pom.xml` file contains all necessary dependencies for the application.

## Testing
Unit tests are provided in the `src/test/java/com/bakery/AppTest.java` file to ensure the application functions as expected.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
